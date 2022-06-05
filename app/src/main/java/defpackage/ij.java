package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: ij  reason: default package */
/* loaded from: classes2.dex */
public final class ij implements co<InputStream, ic> {
    private final List<ImageHeaderParser> a;
    private final co<ByteBuffer, ic> b;
    private final ek c;

    @Override // defpackage.co
    public final /* synthetic */ ee<ic> a(InputStream inputStream, int i, int i2, cm cmVar) throws IOException {
        byte[] a = a(inputStream);
        if (a == null) {
            return null;
        }
        return this.b.a(ByteBuffer.wrap(a), i, i2, cmVar);
    }

    @Override // defpackage.co
    public final /* synthetic */ boolean a(InputStream inputStream, cm cmVar) throws IOException {
        return !((Boolean) cmVar.a(ii.b)).booleanValue() && cj.a(this.a, inputStream, this.c) == ImageHeaderParser.ImageType.GIF;
    }

    public ij(List<ImageHeaderParser> list, co<ByteBuffer, ic> coVar, ek ekVar) {
        this.a = list;
        this.b = coVar;
        this.c = ekVar;
    }

    private static byte[] a(InputStream inputStream) {
        ByteArrayOutputStream byteArrayOutputStream = new ByteArrayOutputStream(16384);
        try {
            byte[] bArr = new byte[16384];
            while (true) {
                int read = inputStream.read(bArr);
                if (read != -1) {
                    byteArrayOutputStream.write(bArr, 0, read);
                } else {
                    byteArrayOutputStream.flush();
                    return byteArrayOutputStream.toByteArray();
                }
            }
        } catch (IOException unused) {
            return null;
        }
    }
}
