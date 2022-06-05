package defpackage;

import android.content.Context;
import android.content.SharedPreferences;

/* renamed from: ahc  reason: default package */
/* loaded from: classes.dex */
public final class ahc {
    private static SharedPreferences a;

    public static SharedPreferences a(Context context) throws Exception {
        SharedPreferences sharedPreferences;
        synchronized (SharedPreferences.class) {
            if (a == null) {
                a = (SharedPreferences) amy.a(new ahd(context));
            }
            sharedPreferences = a;
        }
        return sharedPreferences;
    }
}
