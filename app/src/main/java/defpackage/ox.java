package defpackage;

import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.content.ServiceConnection;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.os.IBinder;
import android.os.RemoteException;
import defpackage.sg;
import java.util.List;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÇ\u0002\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0012\u0010\u000b\u001a\u0004\u0018\u00010\f2\u0006\u0010\r\u001a\u00020\u000eH\u0002J\b\u0010\b\u001a\u00020\tH\u0007J\u001e\u0010\u000f\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0007J&\u0010\u0015\u001a\u00020\u00102\u0006\u0010\u0016\u001a\u00020\u00172\u0006\u0010\u0011\u001a\u00020\u00042\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00140\u0013H\u0002J\u0010\u0010\u0018\u001a\u00020\u00102\u0006\u0010\u0011\u001a\u00020\u0004H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0012\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0004\n\u0002\u0010\n¨\u0006\u001c"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper;", "", "()V", "RECEIVER_SERVICE_ACTION", "", "RECEIVER_SERVICE_PACKAGE", "RECEIVER_SERVICE_PACKAGE_WAKIZASHI", "TAG", "isServiceAvailable", "", "Ljava/lang/Boolean;", "getVerifiedServiceIntent", "Landroid/content/Intent;", "context", "Landroid/content/Context;", "sendCustomEvents", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "applicationId", "appEvents", "", "Lcom/facebook/appevents/AppEvent;", "sendEvents", "eventType", "Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "sendInstallEvent", "EventType", "RemoteServiceConnection", "ServiceResult", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ox  reason: default package */
/* loaded from: classes2.dex */
public final class ox {
    public static final ox a = new ox();
    private static final String b;
    private static Boolean c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$ServiceResult;", "", "(Ljava/lang/String;I)V", "OPERATION_SUCCESS", "SERVICE_NOT_AVAILABLE", "SERVICE_ERROR", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ox$c */
    /* loaded from: classes2.dex */
    public static final class c extends Enum<c> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {1, 2, 3};
    }

    static {
        String simpleName = ox.class.getSimpleName();
        dqc.b(simpleName, "RemoteServiceWrapper::class.java.simpleName");
        b = simpleName;
    }

    private ox() {
    }

    public static final boolean a() {
        if (qx.a(ox.class)) {
            return false;
        }
        try {
            if (c == null) {
                c = Boolean.valueOf(a.a(ly.k()) != null);
            }
            Boolean bool = c;
            if (bool == null) {
                return false;
            }
            return bool.booleanValue();
        } catch (Throwable th) {
            qx.a(th, ox.class);
            return false;
        }
    }

    public static final int a(String str) {
        if (qx.a(ox.class)) {
            return 0;
        }
        try {
            dqc.d(str, "applicationId");
            return a.a(a.MOBILE_APP_INSTALL, str, dnc.a);
        } catch (Throwable th) {
            qx.a(th, ox.class);
            return 0;
        }
    }

    public static final int a(String str, List<mq> list) {
        if (qx.a(ox.class)) {
            return 0;
        }
        try {
            dqc.d(str, "applicationId");
            dqc.d(list, "appEvents");
            return a.a(a.CUSTOM_APP_EVENTS, str, list);
        } catch (Throwable th) {
            qx.a(th, ox.class);
            return 0;
        }
    }

    private final int a(a aVar, String str, List<mq> list) {
        int i;
        int i2;
        if (qx.a(this)) {
            return 0;
        }
        try {
            int i3 = c.b;
            of.a();
            Context k = ly.k();
            Intent a2 = a(k);
            if (a2 == null) {
                return i3;
            }
            b bVar = new b();
            if (!k.bindService(a2, bVar, 1)) {
                return c.c;
            }
            try {
                bVar.a.await(5L, TimeUnit.SECONDS);
                IBinder iBinder = bVar.b;
                if (iBinder != null) {
                    sg a3 = sg.a.a(iBinder);
                    Bundle a4 = ow.a(aVar, str, list);
                    if (a4 != null) {
                        a3.a(a4);
                        "Successfully sent events to the remote service: ".concat(String.valueOf(a4));
                        qi.a();
                    }
                    i2 = c.a;
                } else {
                    i2 = c.b;
                }
                k.unbindService(bVar);
                qi.a();
                return i2;
            } catch (RemoteException e) {
                i = c.c;
                qi.a(b, (Exception) e);
                k.unbindService(bVar);
                qi.a();
                return i;
            } catch (InterruptedException e2) {
                i = c.c;
                qi.a(b, (Exception) e2);
                k.unbindService(bVar);
                qi.a();
                return i;
            }
        } catch (Throwable th) {
            qx.a(th, this);
            return 0;
        }
    }

    private final Intent a(Context context) {
        if (qx.a(this)) {
            return null;
        }
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager != null) {
                Intent intent = new Intent("ReceiverService");
                intent.setPackage("com.facebook.katana");
                if (packageManager.resolveService(intent, 0) != null && pp.a(context, "com.facebook.katana")) {
                    return intent;
                }
                Intent intent2 = new Intent("ReceiverService");
                intent2.setPackage("com.facebook.wakizashi");
                if (packageManager.resolveService(intent2, 0) != null) {
                    if (pp.a(context, "com.facebook.wakizashi")) {
                        return intent2;
                    }
                }
            }
            return null;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u000f\b\u0002\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\b\u0010\u0005\u001a\u00020\u0003H\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$EventType;", "", "eventType", "", "(Ljava/lang/String;ILjava/lang/String;)V", "toString", "MOBILE_APP_INSTALL", "CUSTOM_APP_EVENTS", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ox$a */
    /* loaded from: classes2.dex */
    public enum a {
        MOBILE_APP_INSTALL("MOBILE_APP_INSTALL"),
        CUSTOM_APP_EVENTS("CUSTOM_APP_EVENTS");
        
        private final String eventType;

        a(String str) {
            this.eventType = str;
        }

        @Override // java.lang.Enum
        public final String toString() {
            return this.eventType;
        }
    }

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004J\u0010\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\u0018\u0010\f\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\r\u001a\u00020\u0004H\u0016J\u0010\u0010\u000e\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016R\u0010\u0010\u0003\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lcom/facebook/appevents/ondeviceprocessing/RemoteServiceWrapper$RemoteServiceConnection;", "Landroid/content/ServiceConnection;", "()V", "binder", "Landroid/os/IBinder;", "latch", "Ljava/util/concurrent/CountDownLatch;", "getBinder", "onNullBinding", "", "name", "Landroid/content/ComponentName;", "onServiceConnected", "serviceBinder", "onServiceDisconnected", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ox$b */
    /* loaded from: classes2.dex */
    public static final class b implements ServiceConnection {
        final CountDownLatch a = new CountDownLatch(1);
        IBinder b;

        @Override // android.content.ServiceConnection
        public final void onServiceDisconnected(ComponentName componentName) {
            dqc.d(componentName, "name");
        }

        @Override // android.content.ServiceConnection
        public final void onServiceConnected(ComponentName componentName, IBinder iBinder) {
            dqc.d(componentName, "name");
            dqc.d(iBinder, "serviceBinder");
            this.b = iBinder;
            this.a.countDown();
        }

        @Override // android.content.ServiceConnection
        public final void onNullBinding(ComponentName componentName) {
            dqc.d(componentName, "name");
            this.a.countDown();
        }
    }
}
