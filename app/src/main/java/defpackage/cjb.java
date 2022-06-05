package defpackage;

import android.content.Context;
import defpackage.vc;

/* renamed from: cjb  reason: default package */
/* loaded from: classes2.dex */
public final class cjb {
    public static final vc<cjd> a;
    private static final vc.g<ciu> b = new vc.g<>();
    private static final vc.a<ciu, cjd> c;

    public static cif a(Context context, cjd cjdVar) {
        return new cif(context, cjdVar);
    }

    static {
        cja cjaVar = new cja();
        c = cjaVar;
        a = new vc<>("InternalFirebaseAuth.FIREBASE_AUTH_API", cjaVar, b);
    }
}
