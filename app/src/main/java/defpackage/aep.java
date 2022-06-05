package defpackage;

import android.content.Context;

/* renamed from: aep  reason: default package */
/* loaded from: classes.dex */
public final class aep {
    private static aep a = new aep();
    private aeo b = null;

    public static aeo a(Context context) {
        return a.b(context);
    }

    private synchronized aeo b(Context context) {
        if (this.b == null) {
            if (context.getApplicationContext() != null) {
                context = context.getApplicationContext();
            }
            this.b = new aeo(context);
        }
        return this.b;
    }
}
