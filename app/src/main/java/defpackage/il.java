package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;

/* renamed from: il  reason: default package */
/* loaded from: classes2.dex */
public final class il implements io<Bitmap, BitmapDrawable> {
    private final Resources a;

    public il(Resources resources) {
        this.a = (Resources) lf.a(resources, "Argument must not be null");
    }

    @Override // defpackage.io
    public final ee<BitmapDrawable> a(ee<Bitmap> eeVar, cm cmVar) {
        return hi.a(this.a, eeVar);
    }
}
