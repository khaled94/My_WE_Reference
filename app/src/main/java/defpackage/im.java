package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: im  reason: default package */
/* loaded from: classes2.dex */
public final class im implements io<Drawable, byte[]> {
    private final en a;
    private final io<Bitmap, byte[]> b;
    private final io<ic, byte[]> c;

    public im(en enVar, io<Bitmap, byte[]> ioVar, io<ic, byte[]> ioVar2) {
        this.a = enVar;
        this.b = ioVar;
        this.c = ioVar2;
    }

    @Override // defpackage.io
    public final ee<byte[]> a(ee<Drawable> eeVar, cm cmVar) {
        Drawable b = eeVar.b();
        if (b instanceof BitmapDrawable) {
            return this.b.a(gt.a(((BitmapDrawable) b).getBitmap(), this.a), cmVar);
        }
        if (!(b instanceof ic)) {
            return null;
        }
        return this.c.a(eeVar, cmVar);
    }
}
