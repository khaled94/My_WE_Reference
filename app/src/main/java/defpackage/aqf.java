package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Process;
import android.os.UserManager;

/* renamed from: aqf  reason: default package */
/* loaded from: classes.dex */
public class aqf {
    private static UserManager a;
    private static volatile boolean b = !a();
    private static boolean c = false;

    private aqf() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean a(Context context) {
        return !a() || c(context);
    }

    private static boolean b(Context context) {
        boolean z;
        boolean z2 = true;
        int i = 1;
        while (true) {
            z = false;
            if (i > 2) {
                break;
            }
            if (a == null) {
                a = (UserManager) context.getSystemService(UserManager.class);
            }
            UserManager userManager = a;
            if (userManager == null) {
                return true;
            }
            try {
                if (userManager.isUserUnlocked()) {
                    break;
                } else if (userManager.isUserRunning(Process.myUserHandle())) {
                    z2 = false;
                }
            } catch (NullPointerException unused) {
                a = null;
                i++;
            }
        }
        z = z2;
        if (z) {
            a = null;
        }
        return z;
    }

    private static boolean c(Context context) {
        if (b) {
            return true;
        }
        synchronized (aqf.class) {
            if (b) {
                return true;
            }
            boolean b2 = b(context);
            if (b2) {
                b = b2;
            }
            return b2;
        }
    }
}
