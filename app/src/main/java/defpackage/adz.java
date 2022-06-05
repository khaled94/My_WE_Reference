package defpackage;

import android.content.Context;

/* renamed from: adz  reason: default package */
/* loaded from: classes.dex */
public final class adz {
    private static final String[] a = {"android.", "com.android.", "dalvik.", "java.", "javax."};

    public static boolean a(Context context, Throwable th) {
        try {
            aat.a(context);
            aat.a(th);
            return false;
        } catch (Exception unused) {
            return false;
        }
    }
}
