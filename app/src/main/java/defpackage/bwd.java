package defpackage;

import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import defpackage.vc;

/* renamed from: bwd  reason: default package */
/* loaded from: classes2.dex */
public final class bwd {
    public static final vc.g<bvo> a = new vc.g<>();
    public static final vc.g<bvo> b = new vc.g<>();
    public static final vc.a<bvo, bvn> c = new bwb();
    static final vc.a<bvo, Object> d = new bwc();
    public static final Scope e = new Scope("profile");
    public static final Scope f = new Scope(NotificationCompat.CATEGORY_EMAIL);
    public static final vc<bvn> g = new vc<>("SignIn.API", c, a);
    public static final vc<Object> h = new vc<>("SignIn.INTERNAL_API", d, b);
}
