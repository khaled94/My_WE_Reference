package defpackage;

import android.graphics.Bitmap;
import java.io.ByteArrayOutputStream;

/* renamed from: ik  reason: default package */
/* loaded from: classes2.dex */
public final class ik implements io<Bitmap, byte[]> {
    private final Bitmap.CompressFormat a;
    private final int b;

    public ik() {
        this(Bitmap.CompressFormat.JPEG);
    }

    private ik(Bitmap.CompressFormat compressFormat) {
        this.a = compressFormat;
        this.b = 100;
    }

    @Override // defpackage.io
    public final ee<byte[]> a(ee<Bitmap> eeVar, cm cmVar) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream();
        eeVar.b().compress(this.a, this.b, byteArrayOutputStream);
        eeVar.d();
        return new hr(byteArrayOutputStream.toByteArray());
    }
}
