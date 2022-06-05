package defpackage;

import android.graphics.ColorSpace;
import android.graphics.ImageDecoder;
import android.os.Build;
import android.util.Log;
import android.util.Size;

/* renamed from: gm  reason: default package */
/* loaded from: classes2.dex */
public final class gm implements ImageDecoder.OnHeaderDecodedListener {
    private final hf a = hf.a();
    private final int b;
    private final int c;
    private final cg d;
    private final gz e;
    private final boolean f;
    private final cn g;

    public gm(int i, int i2, cm cmVar) {
        this.b = i;
        this.c = i2;
        this.d = (cg) cmVar.a(ha.a);
        this.e = (gz) cmVar.a(gz.h);
        this.f = cmVar.a(ha.e) != null && ((Boolean) cmVar.a(ha.e)).booleanValue();
        this.g = (cn) cmVar.a(ha.b);
    }

    @Override // android.graphics.ImageDecoder.OnHeaderDecodedListener
    public final void onHeaderDecoded(ImageDecoder imageDecoder, ImageDecoder.ImageInfo imageInfo, ImageDecoder.Source source) {
        boolean z = false;
        if (this.a.a(this.b, this.c, this.f, false)) {
            imageDecoder.setAllocator(3);
        } else {
            imageDecoder.setAllocator(1);
        }
        if (this.d == cg.PREFER_RGB_565) {
            imageDecoder.setMemorySizePolicy(0);
        }
        imageDecoder.setOnPartialImageListener(new ImageDecoder.OnPartialImageListener() { // from class: gm.1
            @Override // android.graphics.ImageDecoder.OnPartialImageListener
            public final boolean onPartialImage(ImageDecoder.DecodeException decodeException) {
                return false;
            }
        });
        Size size = imageInfo.getSize();
        int i = this.b;
        if (i == Integer.MIN_VALUE) {
            i = size.getWidth();
        }
        int i2 = this.c;
        if (i2 == Integer.MIN_VALUE) {
            i2 = size.getHeight();
        }
        float a = this.e.a(size.getWidth(), size.getHeight(), i, i2);
        int round = Math.round(size.getWidth() * a);
        int round2 = Math.round(size.getHeight() * a);
        if (Log.isLoggable("ImageDecoder", 2)) {
            StringBuilder sb = new StringBuilder("Resizing from [");
            sb.append(size.getWidth());
            sb.append("x");
            sb.append(size.getHeight());
            sb.append("] to [");
            sb.append(round);
            sb.append("x");
            sb.append(round2);
            sb.append("] scaleFactor: ");
            sb.append(a);
        }
        imageDecoder.setTargetSize(round, round2);
        if (this.g != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                if (this.g == cn.DISPLAY_P3 && imageInfo.getColorSpace() != null && imageInfo.getColorSpace().isWideGamut()) {
                    z = true;
                }
                imageDecoder.setTargetColorSpace(ColorSpace.get(z ? ColorSpace.Named.DISPLAY_P3 : ColorSpace.Named.SRGB));
            } else if (Build.VERSION.SDK_INT < 26) {
            } else {
                imageDecoder.setTargetColorSpace(ColorSpace.get(ColorSpace.Named.SRGB));
            }
        }
    }
}
