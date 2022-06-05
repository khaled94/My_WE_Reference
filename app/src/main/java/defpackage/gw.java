package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import java.io.IOException;
import java.nio.ByteBuffer;

/* renamed from: gw  reason: default package */
/* loaded from: classes2.dex */
public final class gw implements co<ByteBuffer, Bitmap> {
    private final gs a = new gs();

    @Override // defpackage.co
    public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, cm cmVar) throws IOException {
        return true;
    }

    @Override // defpackage.co
    public final /* synthetic */ ee<Bitmap> a(ByteBuffer byteBuffer, int i, int i2, cm cmVar) throws IOException {
        return this.a.a(ImageDecoder.createSource(byteBuffer), i, i2, cmVar);
    }
}
