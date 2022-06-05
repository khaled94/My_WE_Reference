package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: aeh  reason: default package */
/* loaded from: classes.dex */
public final class aeh {
    private aeh() {
    }

    public static boolean a(Context context, int i) {
        if (!a(context, i, "com.google.android.gms")) {
            return false;
        }
        try {
            PackageInfo packageInfo = context.getPackageManager().getPackageInfo("com.google.android.gms", 64);
            va a = va.a(context);
            if (packageInfo != null) {
                if (va.a(packageInfo, false)) {
                    return true;
                }
                if (va.a(packageInfo, true) && uz.honorsDebugCertificates(a.a)) {
                    return true;
                }
            }
        } catch (PackageManager.NameNotFoundException unused) {
        }
        return false;
    }

    public static boolean a(Context context, int i, String str) {
        return aep.a(context).a(i, str);
    }
}
