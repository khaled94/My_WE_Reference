package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.ParcelFileDescriptor;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import defpackage.cj;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.util.List;

/* renamed from: hg  reason: default package */
/* loaded from: classes2.dex */
interface hg {
    Bitmap a(BitmapFactory.Options options) throws IOException;

    ImageHeaderParser.ImageType a() throws IOException;

    int b() throws IOException;

    void c();

    /* renamed from: hg$a */
    /* loaded from: classes2.dex */
    public static final class a implements hg {
        private final ByteBuffer a;
        private final List<ImageHeaderParser> b;
        private final ek c;

        @Override // defpackage.hg
        public final void c() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public a(ByteBuffer byteBuffer, List<ImageHeaderParser> list, ek ekVar) {
            this.a = byteBuffer;
            this.b = list;
            this.c = ekVar;
        }

        @Override // defpackage.hg
        public final ImageHeaderParser.ImageType a() throws IOException {
            return cj.a(this.b, kv.c(this.a));
        }

        @Override // defpackage.hg
        public final int b() throws IOException {
            List<ImageHeaderParser> list = this.b;
            final ByteBuffer c = kv.c(this.a);
            final ek ekVar = this.c;
            if (c == null) {
                return -1;
            }
            return cj.a(list, new cj.a() { // from class: cj.4
                @Override // defpackage.cj.a
                public final int a(ImageHeaderParser imageHeaderParser) throws IOException {
                    return imageHeaderParser.a(c, ekVar);
                }
            });
        }

        @Override // defpackage.hg
        public final Bitmap a(BitmapFactory.Options options) {
            return BitmapFactory.decodeStream(kv.b(kv.c(this.a)), null, options);
        }
    }

    /* renamed from: hg$b */
    /* loaded from: classes2.dex */
    public static final class b implements hg {
        private final db a;
        private final ek b;
        private final List<ImageHeaderParser> c;

        /* JADX INFO: Access modifiers changed from: package-private */
        public b(InputStream inputStream, List<ImageHeaderParser> list, ek ekVar) {
            this.b = (ek) lf.a(ekVar, "Argument must not be null");
            this.c = (List) lf.a(list, "Argument must not be null");
            this.a = new db(inputStream, ekVar);
        }

        @Override // defpackage.hg
        public final Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeStream(this.a.a(), null, options);
        }

        @Override // defpackage.hg
        public final ImageHeaderParser.ImageType a() throws IOException {
            return cj.a(this.c, this.a.a(), this.b);
        }

        @Override // defpackage.hg
        public final int b() throws IOException {
            return cj.b(this.c, this.a.a(), this.b);
        }

        @Override // defpackage.hg
        public final void c() {
            this.a.a.a();
        }
    }

    /* renamed from: hg$c */
    /* loaded from: classes2.dex */
    public static final class c implements hg {
        private final ek a;
        private final List<ImageHeaderParser> b;
        private final ParcelFileDescriptorRewinder c;

        @Override // defpackage.hg
        public final void c() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public c(ParcelFileDescriptor parcelFileDescriptor, List<ImageHeaderParser> list, ek ekVar) {
            this.a = (ek) lf.a(ekVar, "Argument must not be null");
            this.b = (List) lf.a(list, "Argument must not be null");
            this.c = new ParcelFileDescriptorRewinder(parcelFileDescriptor);
        }

        @Override // defpackage.hg
        public final Bitmap a(BitmapFactory.Options options) throws IOException {
            return BitmapFactory.decodeFileDescriptor(this.c.a.rewind().getFileDescriptor(), null, options);
        }

        @Override // defpackage.hg
        public final ImageHeaderParser.ImageType a() throws IOException {
            List<ImageHeaderParser> list = this.b;
            final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            final ek ekVar = this.a;
            return cj.a(list, new cj.b() { // from class: cj.3
                @Override // defpackage.cj.b
                public final ImageHeaderParser.ImageType a(ImageHeaderParser imageHeaderParser) throws IOException {
                    Throwable th;
                    hk hkVar = null;
                    try {
                        hk hkVar2 = new hk(new FileInputStream(parcelFileDescriptorRewinder.a.rewind().getFileDescriptor()), ekVar);
                        try {
                            ImageHeaderParser.ImageType a = imageHeaderParser.a(hkVar2);
                            try {
                                hkVar2.close();
                            } catch (IOException unused) {
                            }
                            parcelFileDescriptorRewinder.a.rewind();
                            return a;
                        } catch (Throwable th2) {
                            th = th2;
                            hkVar = hkVar2;
                            if (hkVar != null) {
                                try {
                                    hkVar.close();
                                } catch (IOException unused2) {
                                }
                            }
                            parcelFileDescriptorRewinder.a.rewind();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            });
        }

        @Override // defpackage.hg
        public final int b() throws IOException {
            List<ImageHeaderParser> list = this.b;
            final ParcelFileDescriptorRewinder parcelFileDescriptorRewinder = this.c;
            final ek ekVar = this.a;
            return cj.a(list, new cj.a() { // from class: cj.6
                @Override // defpackage.cj.a
                public final int a(ImageHeaderParser imageHeaderParser) throws IOException {
                    Throwable th;
                    hk hkVar = null;
                    try {
                        hk hkVar2 = new hk(new FileInputStream(parcelFileDescriptorRewinder.a.rewind().getFileDescriptor()), ekVar);
                        try {
                            int a = imageHeaderParser.a(hkVar2, ekVar);
                            try {
                                hkVar2.close();
                            } catch (IOException unused) {
                            }
                            parcelFileDescriptorRewinder.a.rewind();
                            return a;
                        } catch (Throwable th2) {
                            th = th2;
                            hkVar = hkVar2;
                            if (hkVar != null) {
                                try {
                                    hkVar.close();
                                } catch (IOException unused2) {
                                }
                            }
                            parcelFileDescriptorRewinder.a.rewind();
                            throw th;
                        }
                    } catch (Throwable th3) {
                        th = th3;
                    }
                }
            });
        }
    }
}
