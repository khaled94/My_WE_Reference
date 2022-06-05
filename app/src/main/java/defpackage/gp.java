package defpackage;

import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.drawable.BitmapDrawable;
import java.io.IOException;

/* renamed from: gp  reason: default package */
/* loaded from: classes2.dex */
public final class gp<DataType> implements co<DataType, BitmapDrawable> {
    private final co<DataType, Bitmap> a;
    private final Resources b;

    public gp(Resources resources, co<DataType, Bitmap> coVar) {
        this.b = (Resources) lf.a(resources, "Argument must not be null");
        this.a = (co) lf.a(coVar, "Argument must not be null");
    }

    @Override // defpackage.co
    public final boolean a(DataType datatype, cm cmVar) throws IOException {
        return this.a.a(datatype, cmVar);
    }

    @Override // defpackage.co
    public final ee<BitmapDrawable> a(DataType datatype, int i, int i2, cm cmVar) throws IOException {
        return hi.a(this.b, this.a.a(datatype, i, i2, cmVar));
    }
}
