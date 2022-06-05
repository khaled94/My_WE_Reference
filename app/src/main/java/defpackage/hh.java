package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: hh  reason: default package */
/* loaded from: classes2.dex */
public final class hh implements co<InputStream, Bitmap> {
    private final gs a = new gs();

    @Override // defpackage.co
    public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, cm cmVar) throws IOException {
        return true;
    }

    @Override // defpackage.co
    public final /* synthetic */ ee<Bitmap> a(InputStream inputStream, int i, int i2, cm cmVar) throws IOException {
        return this.a.a(ImageDecoder.createSource(kv.a(inputStream)), i, i2, cmVar);
    }
}
