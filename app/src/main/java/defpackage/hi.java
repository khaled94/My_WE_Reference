package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: hi  reason: default package */
/* loaded from: classes2.dex */
public final class hi implements ea, ee<BitmapDrawable> {
    private final Resources a;
    private final ee<Bitmap> b;

    public static ee<BitmapDrawable> a(Resources resources, ee<Bitmap> eeVar) {
        if (eeVar == null) {
            return null;
        }
        return new hi(resources, eeVar);
    }

    private hi(Resources resources, ee<Bitmap> eeVar) {
        this.a = (Resources) lf.a(resources, "Argument must not be null");
        this.b = (ee) lf.a(eeVar, "Argument must not be null");
    }

    @Override // defpackage.ee
    public final Class<BitmapDrawable> a() {
        return BitmapDrawable.class;
    }

    @Override // defpackage.ee
    public final int c() {
        return this.b.c();
    }

    @Override // defpackage.ee
    public final void d() {
        this.b.d();
    }

    @Override // defpackage.ea
    public final void e() {
        ee<Bitmap> eeVar = this.b;
        if (eeVar instanceof ea) {
            ((ea) eeVar).e();
        }
    }

    @Override // defpackage.ee
    public final /* synthetic */ BitmapDrawable b() {
        return new BitmapDrawable(this.a, this.b.b());
    }
}
