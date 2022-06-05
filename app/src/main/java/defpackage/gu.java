package defpackage;

import android.content.Context;
import android.graphics.Bitmap;

/* renamed from: gu  reason: default package */
/* loaded from: classes2.dex */
public abstract class gu implements cq<Bitmap> {
    protected abstract Bitmap a(en enVar, Bitmap bitmap, int i, int i2);

    @Override // defpackage.cq
    public final ee<Bitmap> a(Context context, ee<Bitmap> eeVar, int i, int i2) {
        if (!lg.a(i, i2)) {
            throw new IllegalArgumentException("Cannot apply transformation on width: " + i + " or height: " + i2 + " less than or equal to zero and not Target.SIZE_ORIGINAL");
        }
        en enVar = bo.a(context).a;
        Bitmap b = eeVar.b();
        if (i == Integer.MIN_VALUE) {
            i = b.getWidth();
        }
        if (i2 == Integer.MIN_VALUE) {
            i2 = b.getHeight();
        }
        Bitmap a = a(enVar, b, i, i2);
        return b.equals(a) ? eeVar : gt.a(a, enVar);
    }
}
