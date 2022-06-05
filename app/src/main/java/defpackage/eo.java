package defpackage;

import android.graphics.Bitmap;

/* renamed from: eo  reason: default package */
/* loaded from: classes2.dex */
public class eo implements en {
    @Override // defpackage.en
    public final void a() {
    }

    @Override // defpackage.en
    public final void a(int i) {
    }

    @Override // defpackage.en
    public void a(Bitmap bitmap) {
        bitmap.recycle();
    }

    @Override // defpackage.en
    public final Bitmap a(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }

    @Override // defpackage.en
    public final Bitmap b(int i, int i2, Bitmap.Config config) {
        return Bitmap.createBitmap(i, i2, config);
    }
}
