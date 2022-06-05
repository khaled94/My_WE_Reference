package defpackage;

import android.graphics.Bitmap;

/* renamed from: gt  reason: default package */
/* loaded from: classes2.dex */
public final class gt implements ea, ee<Bitmap> {
    private final Bitmap a;
    private final en b;

    public static gt a(Bitmap bitmap, en enVar) {
        if (bitmap == null) {
            return null;
        }
        return new gt(bitmap, enVar);
    }

    public gt(Bitmap bitmap, en enVar) {
        this.a = (Bitmap) lf.a(bitmap, "Bitmap must not be null");
        this.b = (en) lf.a(enVar, "BitmapPool must not be null");
    }

    @Override // defpackage.ee
    public final Class<Bitmap> a() {
        return Bitmap.class;
    }

    @Override // defpackage.ee
    public final int c() {
        return lg.a(this.a);
    }

    @Override // defpackage.ee
    public final void d() {
        this.b.a(this.a);
    }

    @Override // defpackage.ea
    public final void e() {
        this.a.prepareToDraw();
    }

    @Override // defpackage.ee
    public final /* bridge */ /* synthetic */ Bitmap b() {
        return this.a;
    }
}
