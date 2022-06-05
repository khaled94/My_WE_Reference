package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.IntentFilter;
import android.net.ConnectivityManager;
import android.net.NetworkInfo;
import android.os.Looper;
import android.os.PowerManager;
import com.google.firebase.iid.FirebaseInstanceId;
import java.io.IOException;

/* renamed from: cnv  reason: default package */
/* loaded from: classes2.dex */
public final class cnv implements Runnable {
    private final long a;
    private final PowerManager.WakeLock b;
    private final FirebaseInstanceId c;
    private final cnx d;

    public cnv(FirebaseInstanceId firebaseInstanceId, cnx cnxVar, long j) {
        this.c = firebaseInstanceId;
        this.d = cnxVar;
        this.a = j;
        PowerManager.WakeLock newWakeLock = ((PowerManager) a().getSystemService("power")).newWakeLock(1, "fiid-sync");
        this.b = newWakeLock;
        newWakeLock.setReferenceCounted(false);
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean a;
        try {
            if (cnq.a().a(a())) {
                this.b.acquire();
            }
            boolean z = true;
            this.c.a(true);
            if (!this.c.e.a()) {
                this.c.a(false);
                if (!a) {
                    return;
                }
                return;
            }
            cnq a2 = cnq.a();
            Context a3 = a();
            if (a2.b == null) {
                if (a3.checkCallingOrSelfPermission("android.permission.ACCESS_NETWORK_STATE") != 0) {
                    z = false;
                }
                a2.b = Boolean.valueOf(z);
            }
            a2.a.booleanValue();
            if (a2.b.booleanValue() && !b()) {
                cnu cnuVar = new cnu(this);
                FirebaseInstanceId.g();
                cnuVar.a.a().registerReceiver(cnuVar, new IntentFilter("android.net.conn.CONNECTIVITY_CHANGE"));
                if (!cnq.a().a(a())) {
                    return;
                }
                this.b.release();
                return;
            }
            if (c() && this.d.a(this.c)) {
                this.c.a(false);
            } else {
                this.c.a(this.a);
            }
            if (!cnq.a().a(a())) {
                return;
            }
            this.b.release();
        } finally {
            if (cnq.a().a(a())) {
                this.b.release();
            }
        }
    }

    private final boolean c() {
        cns f = this.c.f();
        if (!this.c.a(f)) {
            return true;
        }
        try {
            FirebaseInstanceId firebaseInstanceId = this.c;
            String a = cni.a(firebaseInstanceId.c);
            if (Looper.getMainLooper() == Looper.myLooper()) {
                throw new IOException("MAIN_THREAD");
            }
            String a2 = ((cmu) firebaseInstanceId.a(firebaseInstanceId.a(a, "*"))).a();
            if (a2 == null) {
                return false;
            }
            if (f == null || (f != null && !a2.equals(f.a))) {
                Context a3 = a();
                Intent intent = new Intent("com.google.firebase.messaging.NEW_TOKEN");
                intent.putExtra("token", a2);
                a3.sendBroadcast(cnq.a(a3, "com.google.firebase.MESSAGING_EVENT", intent));
                a3.sendBroadcast(cnq.a(a3, "com.google.firebase.INSTANCE_ID_EVENT", new Intent("com.google.firebase.iid.TOKEN_REFRESH")));
            }
            return true;
        } catch (IOException | SecurityException e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Token retrieval failed: ".concat(valueOf);
            } else {
                new String("Token retrieval failed: ");
            }
            return false;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Context a() {
        return this.c.c.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b() {
        ConnectivityManager connectivityManager = (ConnectivityManager) a().getSystemService("connectivity");
        NetworkInfo activeNetworkInfo = connectivityManager != null ? connectivityManager.getActiveNetworkInfo() : null;
        return activeNetworkInfo != null && activeNetworkInfo.isConnected();
    }
}
