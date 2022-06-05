package defpackage;

import android.content.SharedPreferences;

/* renamed from: agu  reason: default package */
/* loaded from: classes.dex */
public final class agu extends agt<Boolean> {
    public static Boolean a(SharedPreferences sharedPreferences, String str, Boolean bool) {
        try {
            return (Boolean) amy.a(new agv(sharedPreferences, str, bool));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
            } else {
                new String("Flag value not available, returning default: ");
            }
            return bool;
        }
    }
}
