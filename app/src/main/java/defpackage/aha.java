package defpackage;

import android.content.SharedPreferences;

/* renamed from: aha  reason: default package */
/* loaded from: classes.dex */
public final class aha extends agt<String> {
    public static String a(SharedPreferences sharedPreferences, String str, String str2) {
        try {
            return (String) amy.a(new ahb(sharedPreferences, str, str2));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
            } else {
                new String("Flag value not available, returning default: ");
            }
            return str2;
        }
    }
}
