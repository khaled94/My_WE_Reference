package defpackage;

import android.app.Activity;
import defpackage.vc;

/* renamed from: bgj  reason: default package */
/* loaded from: classes2.dex */
public final class bgj {
    public static final vc<vc.d.C0050d> a;
    private static final vc.a<anm, vc.d.C0050d> f;
    private static final vc.g<anm> e = new vc.g<>();
    @Deprecated
    public static final bgg b = new aob();
    @Deprecated
    public static final bgi c = new ana();
    @Deprecated
    public static final bgk d = new ant();

    static {
        bix bixVar = new bix();
        f = bixVar;
        a = new vc<>("LocationServices.API", bixVar, e);
    }

    private bgj() {
    }

    public static bgh a(Activity activity) {
        return new bgh(activity);
    }
}
