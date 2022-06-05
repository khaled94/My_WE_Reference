package com.google.android.gms.ads.identifier;

import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.os.IBinder;
import android.os.RemoteException;
import android.os.SystemClock;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.common.GooglePlayServicesRepairableException;
import java.io.IOException;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* loaded from: classes.dex */
public class AdvertisingIdClient {
    private final Context mContext;
    private uu zze;
    private ahm zzf;
    private boolean zzg;
    private final Object zzh;
    private a zzi;
    private final boolean zzj;
    private final long zzk;

    /* loaded from: classes.dex */
    public static final class Info {
        private final String zzq;
        private final boolean zzr;

        public Info(String str, boolean z) {
            this.zzq = str;
            this.zzr = z;
        }

        public final String getId() {
            return this.zzq;
        }

        public final boolean isLimitAdTrackingEnabled() {
            return this.zzr;
        }

        public final String toString() {
            String str = this.zzq;
            boolean z = this.zzr;
            StringBuilder sb = new StringBuilder(String.valueOf(str).length() + 7);
            sb.append("{");
            sb.append(str);
            sb.append("}");
            sb.append(z);
            return sb.toString();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends Thread {
        CountDownLatch a = new CountDownLatch(1);
        boolean b = false;
        private WeakReference<AdvertisingIdClient> c;
        private long d;

        public a(AdvertisingIdClient advertisingIdClient, long j) {
            this.c = new WeakReference<>(advertisingIdClient);
            this.d = j;
            start();
        }

        private final void a() {
            AdvertisingIdClient advertisingIdClient = this.c.get();
            if (advertisingIdClient != null) {
                advertisingIdClient.finish();
                this.b = true;
            }
        }

        @Override // java.lang.Thread, java.lang.Runnable
        public final void run() {
            try {
                if (this.a.await(this.d, TimeUnit.MILLISECONDS)) {
                    return;
                }
                a();
            } catch (InterruptedException unused) {
                a();
            }
        }
    }

    public AdvertisingIdClient(Context context) {
        this(context, 30000L, false, false);
    }

    private AdvertisingIdClient(Context context, long j, boolean z, boolean z2) {
        Context applicationContext;
        this.zzh = new Object();
        aat.a(context);
        if (z && (applicationContext = context.getApplicationContext()) != null) {
            context = applicationContext;
        }
        this.mContext = context;
        this.zzg = false;
        this.zzk = j;
        this.zzj = z2;
    }

    public static Info getAdvertisingIdInfo(Context context) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        sz szVar = new sz(context);
        boolean a2 = szVar.a("gads:ad_id_app_context:enabled");
        float b = szVar.b("gads:ad_id_app_context:ping_ratio");
        String a3 = szVar.a("gads:ad_id_use_shared_preference:experiment_id", "");
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, a2, szVar.a("gads:ad_id_use_persistent_service:enabled"));
        try {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            advertisingIdClient.zza(false);
            Info info2 = advertisingIdClient.getInfo();
            advertisingIdClient.zza(info2, a2, b, SystemClock.elapsedRealtime() - elapsedRealtime, a3, null);
            return info2;
        } finally {
            try {
                throw th;
            } finally {
            }
        }
    }

    public static boolean getIsAdIdFakeForDebugLogging(Context context) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        sz szVar = new sz(context);
        AdvertisingIdClient advertisingIdClient = new AdvertisingIdClient(context, -1L, szVar.a("gads:ad_id_app_context:enabled"), szVar.a("com.google.android.gms.ads.identifier.service.PERSISTENT_START"));
        try {
            advertisingIdClient.zza(false);
            return advertisingIdClient.zzb();
        } finally {
            advertisingIdClient.finish();
        }
    }

    public static void setShouldSkipGmsCoreVersionCheck(boolean z) {
    }

    private static uu zza(Context context, boolean z) throws IOException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        try {
            context.getPackageManager().getPackageInfo("com.android.vending", 0);
            int a2 = uy.b().a(context, uz.GOOGLE_PLAY_SERVICES_VERSION_CODE);
            if (a2 != 0 && a2 != 2) {
                throw new IOException("Google Play services not available");
            }
            String str = z ? "com.google.android.gms.ads.identifier.service.PERSISTENT_START" : "com.google.android.gms.ads.identifier.service.START";
            uu uuVar = new uu();
            Intent intent = new Intent(str);
            intent.setPackage("com.google.android.gms");
            try {
                if (!adt.a().a(context, intent, uuVar, 1)) {
                    throw new IOException("Connection failure");
                }
                return uuVar;
            } catch (Throwable th) {
                throw new IOException(th);
            }
        } catch (PackageManager.NameNotFoundException unused) {
            throw new GooglePlayServicesNotAvailableException(9);
        }
    }

    private final void zza() {
        synchronized (this.zzh) {
            if (this.zzi != null) {
                this.zzi.a.countDown();
                try {
                    this.zzi.join();
                } catch (InterruptedException unused) {
                }
            }
            if (this.zzk > 0) {
                this.zzi = new a(this, this.zzk);
            }
        }
    }

    private final void zza(boolean z) throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        aat.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.zzg) {
                finish();
            }
            uu zza = zza(this.mContext, this.zzj);
            this.zze = zza;
            this.zzf = zza(this.mContext, zza);
            this.zzg = true;
            if (z) {
                zza();
            }
        }
    }

    private final boolean zza(Info info2, boolean z, float f, long j, String str, Throwable th) {
        if (Math.random() > f) {
            return false;
        }
        HashMap hashMap = new HashMap();
        String str2 = "1";
        hashMap.put("app_context", z ? str2 : "0");
        if (info2 != null) {
            if (!info2.isLimitAdTrackingEnabled()) {
                str2 = "0";
            }
            hashMap.put("limit_ad_tracking", str2);
        }
        if (info2 != null && info2.getId() != null) {
            hashMap.put("ad_id_size", Integer.toString(info2.getId().length()));
        }
        if (th != null) {
            hashMap.put("error", th.getClass().getName());
        }
        if (str != null && !str.isEmpty()) {
            hashMap.put("experiment_id", str);
        }
        hashMap.put("tag", "AdvertisingIdClient");
        hashMap.put("time_spent", Long.toString(j));
        new sy(hashMap).start();
        return true;
    }

    private final boolean zzb() throws IOException {
        boolean c;
        aat.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    if (this.zzi == null || !this.zzi.b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            aat.a(this.zze);
            aat.a(this.zzf);
            try {
                c = this.zzf.c();
            } catch (RemoteException unused) {
                throw new IOException("Remote exception");
            }
        }
        zza();
        return c;
    }

    protected void finalize() throws Throwable {
        finish();
        super.finalize();
    }

    public final void finish() {
        aat.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (this.mContext == null || this.zze == null) {
                return;
            }
            try {
                if (this.zzg) {
                    adt.a().a(this.mContext, this.zze);
                }
            } catch (Throwable unused) {
            }
            this.zzg = false;
            this.zzf = null;
            this.zze = null;
        }
    }

    public Info getInfo() throws IOException {
        Info info2;
        aat.c("Calling this from your main thread can lead to deadlock");
        synchronized (this) {
            if (!this.zzg) {
                synchronized (this.zzh) {
                    if (this.zzi == null || !this.zzi.b) {
                        throw new IOException("AdvertisingIdClient is not connected.");
                    }
                }
                try {
                    zza(false);
                    if (!this.zzg) {
                        throw new IOException("AdvertisingIdClient cannot reconnect.");
                    }
                } catch (Exception e) {
                    throw new IOException("AdvertisingIdClient cannot reconnect.", e);
                }
            }
            aat.a(this.zze);
            aat.a(this.zzf);
            try {
                info2 = new Info(this.zzf.a(), this.zzf.b());
            } catch (RemoteException unused) {
                throw new IOException("Remote exception");
            }
        }
        zza();
        return info2;
    }

    public void start() throws IOException, IllegalStateException, GooglePlayServicesNotAvailableException, GooglePlayServicesRepairableException {
        zza(true);
    }

    private static ahm zza(Context context, uu uuVar) throws IOException {
        try {
            TimeUnit timeUnit = TimeUnit.MILLISECONDS;
            aat.c("BlockingServiceConnection.getServiceWithTimeout() called on main thread");
            if (!uuVar.a) {
                uuVar.a = true;
                IBinder poll = uuVar.b.poll(10000L, timeUnit);
                if (poll == null) {
                    throw new TimeoutException("Timed out waiting for the service connection");
                }
                return ahn.a(poll);
            }
            throw new IllegalStateException("Cannot call get on this connection more than once");
        } catch (InterruptedException unused) {
            throw new IOException("Interrupted exception");
        } catch (Throwable th) {
            throw new IOException(th);
        }
    }
}
