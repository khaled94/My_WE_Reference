package defpackage;

import android.content.Context;
import android.os.Build;

/* renamed from: diw  reason: default package */
/* loaded from: classes2.dex */
public final class diw {
    public static boolean a(Context context) {
        return ux.a().a(context) == 0;
    }

    public static boolean b(Context context) {
        return !a(context) && Build.MANUFACTURER.equalsIgnoreCase("Huawei");
    }
}
