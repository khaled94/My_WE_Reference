package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.util.Log;
import java.io.IOException;

/* renamed from: gs  reason: default package */
/* loaded from: classes2.dex */
public final class gs implements co<ImageDecoder.Source, Bitmap> {
    private final en a = new eo();

    @Override // defpackage.co
    public final /* bridge */ /* synthetic */ boolean a(ImageDecoder.Source source, cm cmVar) throws IOException {
        return true;
    }

    public final ee<Bitmap> a(ImageDecoder.Source source, int i, int i2, cm cmVar) throws IOException {
        Bitmap decodeBitmap = ImageDecoder.decodeBitmap(source, new gm(i, i2, cmVar));
        if (Log.isLoggable("BitmapImageDecoder", 2)) {
            StringBuilder sb = new StringBuilder("Decoded [");
            sb.append(decodeBitmap.getWidth());
            sb.append("x");
            sb.append(decodeBitmap.getHeight());
            sb.append("] for [");
            sb.append(i);
            sb.append("x");
            sb.append(i2);
            sb.append("]");
        }
        return new gt(decodeBitmap, this.a);
    }
}
