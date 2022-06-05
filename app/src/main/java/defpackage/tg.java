package defpackage;

import android.app.Activity;
import android.content.Context;
import defpackage.vc;
import defpackage.ve;

/* renamed from: tg  reason: default package */
/* loaded from: classes2.dex */
public abstract class tg extends ve<vc.d.C0050d> {
    private static final vc.g<ahy> a = new vc.g<>();
    private static final vc.a<ahy, vc.d.C0050d> i;
    private static final vc<vc.d.C0050d> j;

    static {
        th thVar = new th();
        i = thVar;
        j = new vc<>("SmsRetriever.API", thVar, a);
    }

    public tg(Activity activity) {
        super(activity, j, vc.d.i, ve.a.a);
    }

    public abstract bwl<Void> a();

    public tg(Context context) {
        super(context, j, vc.d.i, ve.a.a);
    }
}
