package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;

/* renamed from: adx  reason: default package */
/* loaded from: classes.dex */
public final class adx {
    private adx() {
    }

    public static PackageInfo a(Context context, String str) {
        try {
            return aep.a(context).b(str, 128);
        } catch (PackageManager.NameNotFoundException unused) {
            return null;
        }
    }
}
