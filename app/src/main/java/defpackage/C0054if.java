package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import java.security.MessageDigest;

/* renamed from: if  reason: invalid class name and default package and case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C0054if implements cq<ic> {
    private final cq<Bitmap> b;

    public C0054if(cq<Bitmap> cqVar) {
        this.b = (cq) lf.a(cqVar, "Argument must not be null");
    }

    @Override // defpackage.cq
    public final ee<ic> a(Context context, ee<ic> eeVar, int i, int i2) {
        ic b = eeVar.b();
        ee<Bitmap> gtVar = new gt(b.a(), bo.a(context).a);
        ee<Bitmap> a = this.b.a(context, gtVar, i, i2);
        if (!gtVar.equals(a)) {
            gtVar.d();
        }
        cq<Bitmap> cqVar = this.b;
        b.a.a.a(cqVar, a.b());
        return eeVar;
    }

    @Override // defpackage.ck
    public final boolean equals(Object obj) {
        if (obj instanceof C0054if) {
            return this.b.equals(((C0054if) obj).b);
        }
        return false;
    }

    @Override // defpackage.ck
    public final int hashCode() {
        return this.b.hashCode();
    }

    @Override // defpackage.ck
    public final void a(MessageDigest messageDigest) {
        this.b.a(messageDigest);
    }
}
