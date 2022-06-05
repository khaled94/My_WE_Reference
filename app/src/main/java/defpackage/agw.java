package defpackage;

import android.content.SharedPreferences;

/* renamed from: agw  reason: default package */
/* loaded from: classes.dex */
public final class agw extends agt<Integer> {
    public static Integer a(SharedPreferences sharedPreferences, String str, Integer num) {
        try {
            return (Integer) amy.a(new agx(sharedPreferences, str, num));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
            } else {
                new String("Flag value not available, returning default: ");
            }
            return num;
        }
    }
}
