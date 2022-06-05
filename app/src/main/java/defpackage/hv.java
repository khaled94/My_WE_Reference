package defpackage;

import android.graphics.drawable.Drawable;

/* renamed from: hv  reason: default package */
/* loaded from: classes2.dex */
final class hv extends hu<Drawable> {
    @Override // defpackage.ee
    public final void d() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ee<Drawable> a(Drawable drawable) {
        if (drawable != null) {
            return new hv(drawable);
        }
        return null;
    }

    private hv(Drawable drawable) {
        super(drawable);
    }

    @Override // defpackage.ee
    public final Class<Drawable> a() {
        return this.a.getClass();
    }

    @Override // defpackage.ee
    public final int c() {
        return Math.max(1, this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * 4);
    }
}
