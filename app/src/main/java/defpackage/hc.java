package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import java.security.MessageDigest;

/* renamed from: hc  reason: default package */
/* loaded from: classes2.dex */
public final class hc implements cq<Drawable> {
    private final cq<Bitmap> b;
    private final boolean c;

    public hc(cq<Bitmap> cqVar, boolean z) {
        this.b = cqVar;
        this.c = z;
    }

    @Override // defpackage.cq
    public final ee<Drawable> a(Context context, ee<Drawable> eeVar, int i, int i2) {
        en enVar = bo.a(context).a;
        Drawable b = eeVar.b();
        ee<Bitmap> a = hb.a(enVar, b, i, i2);
        if (a == null) {
            if (!this.c) {
                return eeVar;
            }
            throw new IllegalArgumentException("Unable to convert " + b + " to a Bitmap");
        }
        ee<Bitmap> a2 = this.b.a(context, a, i, i2);
        if (a2.equals(a)) {
            a2.d();
            return eeVar;
        }
        return hi.a(context.getResources(), a2);
    }

    @Override // defpackage.ck
    public final boolean equals(Object obj) {
        if (obj instanceof hc) {
            return this.b.equals(((hc) obj).b);
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
