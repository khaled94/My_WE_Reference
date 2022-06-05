package defpackage;

import android.content.Context;
import android.content.ServiceConnection;
import android.os.HandlerThread;
import android.os.Looper;

/* renamed from: aaj  reason: default package */
/* loaded from: classes.dex */
public abstract class aaj {
    static HandlerThread a = null;
    private static int b = 4225;
    private static adb d;
    private static final Object c = new Object();
    private static boolean e = false;

    public static int a() {
        return b;
    }

    public static aaj a(Context context) {
        Looper looper;
        synchronized (c) {
            if (d == null) {
                Context applicationContext = context.getApplicationContext();
                if (e) {
                    looper = b().getLooper();
                } else {
                    looper = context.getMainLooper();
                }
                d = new adb(applicationContext, looper);
            }
        }
        return d;
    }

    public static HandlerThread b() {
        synchronized (c) {
            HandlerThread handlerThread = a;
            if (handlerThread != null) {
                return handlerThread;
            }
            HandlerThread handlerThread2 = new HandlerThread("GoogleApiHandler", 9);
            a = handlerThread2;
            handlerThread2.start();
            return a;
        }
    }

    protected abstract void a(acy acyVar, ServiceConnection serviceConnection);

    public final void a(String str, String str2, int i, ServiceConnection serviceConnection, boolean z) {
        a(new acy(str, str2, i, z), serviceConnection);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public abstract boolean a(acy acyVar, ServiceConnection serviceConnection, String str);
}
