package defpackage;

import android.os.Build;

/* renamed from: aee  reason: default package */
/* loaded from: classes.dex */
public final class aee {
    private aee() {
    }

    public static boolean a() {
        return Build.VERSION.SDK_INT >= 20;
    }

    public static boolean b() {
        return Build.VERSION.SDK_INT >= 21;
    }

    public static boolean c() {
        return Build.VERSION.SDK_INT >= 24;
    }

    public static boolean d() {
        return Build.VERSION.SDK_INT >= 26;
    }

    public static boolean e() {
        return Build.VERSION.SDK_INT >= 29;
    }
}
