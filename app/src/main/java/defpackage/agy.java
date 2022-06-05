package defpackage;

import android.content.SharedPreferences;

/* renamed from: agy  reason: default package */
/* loaded from: classes.dex */
public final class agy extends agt<Long> {
    public static Long a(SharedPreferences sharedPreferences, String str, Long l) {
        try {
            return (Long) amy.a(new agz(sharedPreferences, str, l));
        } catch (Exception e) {
            String valueOf = String.valueOf(e.getMessage());
            if (valueOf.length() != 0) {
                "Flag value not available, returning default: ".concat(valueOf);
            } else {
                new String("Flag value not available, returning default: ");
            }
            return l;
        }
    }
}
