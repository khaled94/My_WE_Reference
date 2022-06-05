package defpackage;

import android.graphics.Bitmap;
import android.graphics.ImageDecoder;
import android.graphics.drawable.AnimatedImageDrawable;
import android.graphics.drawable.Drawable;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: hs  reason: default package */
/* loaded from: classes2.dex */
public final class hs {
    final List<ImageHeaderParser> a;
    final ek b;

    public hs(List<ImageHeaderParser> list, ek ekVar) {
        this.a = list;
        this.b = ekVar;
    }

    static boolean a(ImageHeaderParser.ImageType imageType) {
        return imageType == ImageHeaderParser.ImageType.ANIMATED_WEBP;
    }

    static ee<Drawable> a(ImageDecoder.Source source, int i, int i2, cm cmVar) throws IOException {
        Drawable decodeDrawable = ImageDecoder.decodeDrawable(source, new gm(i, i2, cmVar));
        if (!(decodeDrawable instanceof AnimatedImageDrawable)) {
            throw new IOException("Received unexpected drawable type for animated webp, failing: ".concat(String.valueOf(decodeDrawable)));
        }
        return new a((AnimatedImageDrawable) decodeDrawable);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hs$a */
    /* loaded from: classes2.dex */
    public static final class a implements ee<Drawable> {
        private final AnimatedImageDrawable a;

        a(AnimatedImageDrawable animatedImageDrawable) {
            this.a = animatedImageDrawable;
        }

        @Override // defpackage.ee
        public final Class<Drawable> a() {
            return Drawable.class;
        }

        @Override // defpackage.ee
        public final int c() {
            return this.a.getIntrinsicWidth() * this.a.getIntrinsicHeight() * lg.a(Bitmap.Config.ARGB_8888) * 2;
        }

        @Override // defpackage.ee
        public final void d() {
            this.a.stop();
            this.a.clearAnimationCallbacks();
        }

        @Override // defpackage.ee
        public final /* bridge */ /* synthetic */ Drawable b() {
            return this.a;
        }
    }

    /* renamed from: hs$c */
    /* loaded from: classes2.dex */
    public static final class c implements co<InputStream, Drawable> {
        private final hs a;

        @Override // defpackage.co
        public final /* synthetic */ ee<Drawable> a(InputStream inputStream, int i, int i2, cm cmVar) throws IOException {
            return hs.a(ImageDecoder.createSource(kv.a(inputStream)), i, i2, cmVar);
        }

        @Override // defpackage.co
        public final /* bridge */ /* synthetic */ boolean a(InputStream inputStream, cm cmVar) throws IOException {
            hs hsVar = this.a;
            return hs.a(cj.a(hsVar.a, inputStream, hsVar.b));
        }

        public c(hs hsVar) {
            this.a = hsVar;
        }
    }

    /* renamed from: hs$b */
    /* loaded from: classes2.dex */
    public static final class b implements co<ByteBuffer, Drawable> {
        private final hs a;

        @Override // defpackage.co
        public final /* synthetic */ ee<Drawable> a(ByteBuffer byteBuffer, int i, int i2, cm cmVar) throws IOException {
            return hs.a(ImageDecoder.createSource(byteBuffer), i, i2, cmVar);
        }

        @Override // defpackage.co
        public final /* bridge */ /* synthetic */ boolean a(ByteBuffer byteBuffer, cm cmVar) throws IOException {
            return hs.a(cj.a(this.a.a, byteBuffer));
        }

        public b(hs hsVar) {
            this.a = hsVar;
        }
    }
}
