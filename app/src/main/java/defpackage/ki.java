package defpackage;

import android.graphics.Bitmap;
import android.widget.ImageView;

/* renamed from: kg  reason: default package */
/* loaded from: classes2.dex */
public final class kg extends kj<Bitmap> {
    @Override // defpackage.kj
    protected final /* synthetic */ void b(Bitmap bitmap) {
        ((ImageView) this.a).setImageBitmap(bitmap);
    }

    public kg(ImageView imageView) {
        super(imageView);
    }
}
