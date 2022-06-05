package defpackage;

import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: cj  reason: default package */
/* loaded from: classes2.dex */
public final class cj {

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cj$a */
    /* loaded from: classes2.dex */
    public interface a {
        int a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cj$b */
    /* loaded from: classes2.dex */
    public interface b {
        ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException;
    }

    private cj() {
    }

    public static ImageHeaderParser.ImageType a(List<ImageHeaderParser> list, final InputStream inputStream, ek ekVar) throws IOException {
        if (inputStream == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        if (!inputStream.markSupported()) {
            inputStream = new hk(inputStream, ekVar);
        }
        inputStream.mark(5242880);
        return a(list, new b() { // from class: cj.1
            @Override // defpackage.cj.b
            public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.a(inputStream);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static ImageHeaderParser.ImageType a(List<ImageHeaderParser> list, final ByteBuffer byteBuffer) throws IOException {
        if (byteBuffer == null) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
        return a(list, new b() { // from class: cj.2
            @Override // defpackage.cj.b
            public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
                return imageHeaderParser.a(byteBuffer);
            }
        });
    }

    public static ImageHeaderParser.ImageType a(List<ImageHeaderParser> list, b bVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            ImageHeaderParser.ImageType a2 = bVar.a(list.get(i));
            if (a2 != ImageHeaderParser.ImageType.UNKNOWN) {
                return a2;
            }
        }
        return ImageHeaderParser.ImageType.UNKNOWN;
    }

    public static int b(List<ImageHeaderParser> list, final InputStream inputStream, final ek ekVar) throws IOException {
        if (inputStream == null) {
            return -1;
        }
        if (!inputStream.markSupported()) {
            inputStream = new hk(inputStream, ekVar);
        }
        inputStream.mark(5242880);
        return a(list, new a() { // from class: cj.5
            @Override // defpackage.cj.a
            public final int a(ImageHeaderParser imageHeaderParser) throws IOException {
                try {
                    return imageHeaderParser.a(inputStream, ekVar);
                } finally {
                    inputStream.reset();
                }
            }
        });
    }

    public static int a(List<ImageHeaderParser> list, a aVar) throws IOException {
        int size = list.size();
        for (int i = 0; i < size; i++) {
            int a2 = aVar.a(list.get(i));
            if (a2 != -1) {
                return a2;
            }
        }
        return -1;
    }
}
