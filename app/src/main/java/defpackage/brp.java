package defpackage;

import android.content.Context;

/* renamed from: brp  reason: default package */
/* loaded from: classes2.dex */
public final class brp {
    final Context a;
    String b;
    String c;
    String d;
    Boolean e;
    long f;
    baz g;
    boolean h;

    public brp(Context context, baz bazVar) {
        this.h = true;
        aat.a(context);
        Context applicationContext = context.getApplicationContext();
        aat.a(applicationContext);
        this.a = applicationContext;
        if (bazVar != null) {
            this.g = bazVar;
            this.b = bazVar.f;
            this.c = bazVar.e;
            this.d = bazVar.d;
            this.h = bazVar.c;
            this.f = bazVar.b;
            if (bazVar.g == null) {
                return;
            }
            this.e = Boolean.valueOf(bazVar.g.getBoolean("dataCollectionDefaultEnabled", true));
        }
    }
}
