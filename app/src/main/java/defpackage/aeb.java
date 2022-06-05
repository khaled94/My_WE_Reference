package defpackage;

import android.content.Context;
import android.content.pm.PackageManager;

/* renamed from: aeb  reason: default package */
/* loaded from: classes.dex */
public final class aeb {
    public static Boolean a;
    private static Boolean b;
    private static Boolean c;
    private static Boolean d;

    private aeb() {
    }

    public static boolean a(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (d == null) {
            boolean z = false;
            if (aee.d() && packageManager.hasSystemFeature("android.hardware.type.automotive")) {
                z = true;
            }
            d = Boolean.valueOf(z);
        }
        return d.booleanValue();
    }

    public static boolean b(Context context) {
        PackageManager packageManager = context.getPackageManager();
        if (b == null) {
            boolean z = false;
            if (aee.a() && packageManager.hasSystemFeature("android.hardware.type.watch")) {
                z = true;
            }
            b = Boolean.valueOf(z);
        }
        return b.booleanValue();
    }

    public static boolean c(Context context) {
        if (b(context)) {
            if (!aee.c()) {
                return true;
            }
            if (d(context) && !aee.d()) {
                return true;
            }
        }
        return false;
    }

    public static boolean d(Context context) {
        if (c == null) {
            boolean z = false;
            if (aee.b() && context.getPackageManager().hasSystemFeature("cn.google")) {
                z = true;
            }
            c = Boolean.valueOf(z);
        }
        return c.booleanValue();
    }
}
