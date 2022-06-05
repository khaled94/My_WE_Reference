package defpackage;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.os.Build;
import android.util.DisplayMetrics;
import com.bumptech.glide.load.ImageHeaderParser;
import com.bumptech.glide.load.data.ParcelFileDescriptorRewinder;
import java.io.IOException;
import java.util.Arrays;
import java.util.Collections;
import java.util.EnumSet;
import java.util.HashSet;
import java.util.List;
import java.util.Queue;
import java.util.Set;

/* renamed from: ha  reason: default package */
/* loaded from: classes2.dex */
public final class ha {
    final ek g;
    final List<ImageHeaderParser> h;
    private final en l;
    private final DisplayMetrics m;
    private final hf n = hf.a();
    public static final cl<cg> a = cl.a("com.bumptech.glide.load.resource.bitmap.Downsampler.DecodeFormat", cg.DEFAULT);
    public static final cl<cn> b = cl.a("com.bumptech.glide.load.resource.bitmap.Downsampler.PreferredColorSpace");
    @Deprecated
    public static final cl<gz> c = gz.h;
    public static final cl<Boolean> d = cl.a("com.bumptech.glide.load.resource.bitmap.Downsampler.FixBitmapSize", Boolean.FALSE);
    public static final cl<Boolean> e = cl.a("com.bumptech.glide.load.resource.bitmap.Downsampler.AllowHardwareDecode", Boolean.FALSE);
    private static final Set<String> i = Collections.unmodifiableSet(new HashSet(Arrays.asList("image/vnd.wap.wbmp", "image/x-ico")));
    static final a f = new a() { // from class: ha.1
        @Override // defpackage.ha.a
        public final void a() {
        }

        @Override // defpackage.ha.a
        public final void a(en enVar, Bitmap bitmap) {
        }
    };
    private static final Set<ImageHeaderParser.ImageType> j = Collections.unmodifiableSet(EnumSet.of(ImageHeaderParser.ImageType.JPEG, ImageHeaderParser.ImageType.PNG_A, ImageHeaderParser.ImageType.PNG));
    private static final Queue<BitmapFactory.Options> k = lg.a(0);

    /* renamed from: ha$a */
    /* loaded from: classes2.dex */
    public interface a {
        void a();

        void a(en enVar, Bitmap bitmap) throws IOException;
    }

    private static boolean a(int i2) {
        return i2 == 90 || i2 == 270;
    }

    public ha(List<ImageHeaderParser> list, DisplayMetrics displayMetrics, en enVar, ek ekVar) {
        this.h = list;
        this.m = (DisplayMetrics) lf.a(displayMetrics, "Argument must not be null");
        this.l = (en) lf.a(enVar, "Argument must not be null");
        this.g = (ek) lf.a(ekVar, "Argument must not be null");
    }

    public static boolean a() {
        return ParcelFileDescriptorRewinder.c();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:102:0x030d A[Catch: all -> 0x0517, TryCatch #1 {all -> 0x0517, blocks: (B:100:0x0301, B:102:0x030d, B:105:0x0318, B:107:0x031e, B:110:0x0325, B:112:0x032f, B:114:0x0335, B:117:0x0342, B:118:0x0345, B:119:0x0347, B:121:0x034f, B:122:0x0353, B:123:0x0357, B:127:0x0360, B:130:0x036a, B:133:0x0372, B:140:0x0384, B:142:0x038a, B:144:0x0397, B:146:0x03bf, B:150:0x0405, B:152:0x040b, B:154:0x0411, B:157:0x0417, B:158:0x0419, B:160:0x0421, B:162:0x0427, B:164:0x042d, B:166:0x0431, B:171:0x0440, B:172:0x0443, B:173:0x0445, B:174:0x044c, B:176:0x0450, B:177:0x0458, B:179:0x046e, B:181:0x04ec, B:183:0x0501, B:184:0x0506), top: B:199:0x0301, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:103:0x0315  */
    /* JADX WARN: Removed duplicated region for block: B:105:0x0318 A[Catch: all -> 0x0517, TryCatch #1 {all -> 0x0517, blocks: (B:100:0x0301, B:102:0x030d, B:105:0x0318, B:107:0x031e, B:110:0x0325, B:112:0x032f, B:114:0x0335, B:117:0x0342, B:118:0x0345, B:119:0x0347, B:121:0x034f, B:122:0x0353, B:123:0x0357, B:127:0x0360, B:130:0x036a, B:133:0x0372, B:140:0x0384, B:142:0x038a, B:144:0x0397, B:146:0x03bf, B:150:0x0405, B:152:0x040b, B:154:0x0411, B:157:0x0417, B:158:0x0419, B:160:0x0421, B:162:0x0427, B:164:0x042d, B:166:0x0431, B:171:0x0440, B:172:0x0443, B:173:0x0445, B:174:0x044c, B:176:0x0450, B:177:0x0458, B:179:0x046e, B:181:0x04ec, B:183:0x0501, B:184:0x0506), top: B:199:0x0301, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:125:0x035d  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x035f  */
    /* JADX WARN: Removed duplicated region for block: B:132:0x0370  */
    /* JADX WARN: Removed duplicated region for block: B:133:0x0372 A[Catch: all -> 0x0517, TryCatch #1 {all -> 0x0517, blocks: (B:100:0x0301, B:102:0x030d, B:105:0x0318, B:107:0x031e, B:110:0x0325, B:112:0x032f, B:114:0x0335, B:117:0x0342, B:118:0x0345, B:119:0x0347, B:121:0x034f, B:122:0x0353, B:123:0x0357, B:127:0x0360, B:130:0x036a, B:133:0x0372, B:140:0x0384, B:142:0x038a, B:144:0x0397, B:146:0x03bf, B:150:0x0405, B:152:0x040b, B:154:0x0411, B:157:0x0417, B:158:0x0419, B:160:0x0421, B:162:0x0427, B:164:0x042d, B:166:0x0431, B:171:0x0440, B:172:0x0443, B:173:0x0445, B:174:0x044c, B:176:0x0450, B:177:0x0458, B:179:0x046e, B:181:0x04ec, B:183:0x0501, B:184:0x0506), top: B:199:0x0301, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:135:0x037a  */
    /* JADX WARN: Removed duplicated region for block: B:160:0x0421 A[Catch: all -> 0x0517, TryCatch #1 {all -> 0x0517, blocks: (B:100:0x0301, B:102:0x030d, B:105:0x0318, B:107:0x031e, B:110:0x0325, B:112:0x032f, B:114:0x0335, B:117:0x0342, B:118:0x0345, B:119:0x0347, B:121:0x034f, B:122:0x0353, B:123:0x0357, B:127:0x0360, B:130:0x036a, B:133:0x0372, B:140:0x0384, B:142:0x038a, B:144:0x0397, B:146:0x03bf, B:150:0x0405, B:152:0x040b, B:154:0x0411, B:157:0x0417, B:158:0x0419, B:160:0x0421, B:162:0x0427, B:164:0x042d, B:166:0x0431, B:171:0x0440, B:172:0x0443, B:173:0x0445, B:174:0x044c, B:176:0x0450, B:177:0x0458, B:179:0x046e, B:181:0x04ec, B:183:0x0501, B:184:0x0506), top: B:199:0x0301, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:179:0x046e A[Catch: all -> 0x0517, TryCatch #1 {all -> 0x0517, blocks: (B:100:0x0301, B:102:0x030d, B:105:0x0318, B:107:0x031e, B:110:0x0325, B:112:0x032f, B:114:0x0335, B:117:0x0342, B:118:0x0345, B:119:0x0347, B:121:0x034f, B:122:0x0353, B:123:0x0357, B:127:0x0360, B:130:0x036a, B:133:0x0372, B:140:0x0384, B:142:0x038a, B:144:0x0397, B:146:0x03bf, B:150:0x0405, B:152:0x040b, B:154:0x0411, B:157:0x0417, B:158:0x0419, B:160:0x0421, B:162:0x0427, B:164:0x042d, B:166:0x0431, B:171:0x0440, B:172:0x0443, B:173:0x0445, B:174:0x044c, B:176:0x0450, B:177:0x0458, B:179:0x046e, B:181:0x04ec, B:183:0x0501, B:184:0x0506), top: B:199:0x0301, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:181:0x04ec A[Catch: all -> 0x0517, TryCatch #1 {all -> 0x0517, blocks: (B:100:0x0301, B:102:0x030d, B:105:0x0318, B:107:0x031e, B:110:0x0325, B:112:0x032f, B:114:0x0335, B:117:0x0342, B:118:0x0345, B:119:0x0347, B:121:0x034f, B:122:0x0353, B:123:0x0357, B:127:0x0360, B:130:0x036a, B:133:0x0372, B:140:0x0384, B:142:0x038a, B:144:0x0397, B:146:0x03bf, B:150:0x0405, B:152:0x040b, B:154:0x0411, B:157:0x0417, B:158:0x0419, B:160:0x0421, B:162:0x0427, B:164:0x042d, B:166:0x0431, B:171:0x0440, B:172:0x0443, B:173:0x0445, B:174:0x044c, B:176:0x0450, B:177:0x0458, B:179:0x046e, B:181:0x04ec, B:183:0x0501, B:184:0x0506), top: B:199:0x0301, inners: #3 }] */
    /* JADX WARN: Removed duplicated region for block: B:80:0x01d4 A[Catch: all -> 0x0519, TryCatch #2 {all -> 0x0519, blocks: (B:30:0x00cb, B:34:0x00e2, B:36:0x00ec, B:38:0x00f4, B:40:0x0114, B:41:0x0119, B:42:0x011d, B:44:0x0123, B:47:0x012f, B:49:0x013c, B:51:0x0143, B:52:0x0145, B:54:0x014b, B:56:0x0164, B:58:0x0169, B:60:0x016d, B:63:0x0172, B:65:0x0178, B:67:0x017e, B:68:0x018a, B:69:0x019a, B:71:0x019e, B:74:0x01a3, B:75:0x01a8, B:76:0x01b5, B:78:0x01c7, B:80:0x01d4, B:82:0x01f7, B:84:0x01fd, B:85:0x0201, B:86:0x0206, B:88:0x020d, B:90:0x0289, B:91:0x0290, B:92:0x0291, B:93:0x02d1, B:94:0x02d2, B:96:0x02e0), top: B:201:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:81:0x01f5  */
    /* JADX WARN: Removed duplicated region for block: B:84:0x01fd A[Catch: all -> 0x0519, TryCatch #2 {all -> 0x0519, blocks: (B:30:0x00cb, B:34:0x00e2, B:36:0x00ec, B:38:0x00f4, B:40:0x0114, B:41:0x0119, B:42:0x011d, B:44:0x0123, B:47:0x012f, B:49:0x013c, B:51:0x0143, B:52:0x0145, B:54:0x014b, B:56:0x0164, B:58:0x0169, B:60:0x016d, B:63:0x0172, B:65:0x0178, B:67:0x017e, B:68:0x018a, B:69:0x019a, B:71:0x019e, B:74:0x01a3, B:75:0x01a8, B:76:0x01b5, B:78:0x01c7, B:80:0x01d4, B:82:0x01f7, B:84:0x01fd, B:85:0x0201, B:86:0x0206, B:88:0x020d, B:90:0x0289, B:91:0x0290, B:92:0x0291, B:93:0x02d1, B:94:0x02d2, B:96:0x02e0), top: B:201:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:85:0x0201 A[Catch: all -> 0x0519, TryCatch #2 {all -> 0x0519, blocks: (B:30:0x00cb, B:34:0x00e2, B:36:0x00ec, B:38:0x00f4, B:40:0x0114, B:41:0x0119, B:42:0x011d, B:44:0x0123, B:47:0x012f, B:49:0x013c, B:51:0x0143, B:52:0x0145, B:54:0x014b, B:56:0x0164, B:58:0x0169, B:60:0x016d, B:63:0x0172, B:65:0x0178, B:67:0x017e, B:68:0x018a, B:69:0x019a, B:71:0x019e, B:74:0x01a3, B:75:0x01a8, B:76:0x01b5, B:78:0x01c7, B:80:0x01d4, B:82:0x01f7, B:84:0x01fd, B:85:0x0201, B:86:0x0206, B:88:0x020d, B:90:0x0289, B:91:0x0290, B:92:0x0291, B:93:0x02d1, B:94:0x02d2, B:96:0x02e0), top: B:201:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:88:0x020d A[Catch: all -> 0x0519, TryCatch #2 {all -> 0x0519, blocks: (B:30:0x00cb, B:34:0x00e2, B:36:0x00ec, B:38:0x00f4, B:40:0x0114, B:41:0x0119, B:42:0x011d, B:44:0x0123, B:47:0x012f, B:49:0x013c, B:51:0x0143, B:52:0x0145, B:54:0x014b, B:56:0x0164, B:58:0x0169, B:60:0x016d, B:63:0x0172, B:65:0x0178, B:67:0x017e, B:68:0x018a, B:69:0x019a, B:71:0x019e, B:74:0x01a3, B:75:0x01a8, B:76:0x01b5, B:78:0x01c7, B:80:0x01d4, B:82:0x01f7, B:84:0x01fd, B:85:0x0201, B:86:0x0206, B:88:0x020d, B:90:0x0289, B:91:0x0290, B:92:0x0291, B:93:0x02d1, B:94:0x02d2, B:96:0x02e0), top: B:201:0x00c5 }] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x027a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ee<android.graphics.Bitmap> a(defpackage.hg r38, int r39, int r40, defpackage.cm r41, defpackage.ha.a r42) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 1325
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ha.a(hg, int, int, cm, ha$a):ee");
    }

    private static int a(double d2) {
        if (d2 > 1.0d) {
            d2 = 1.0d / d2;
        }
        return (int) Math.round(d2 * 2.147483647E9d);
    }

    private static int[] a(hg hgVar, BitmapFactory.Options options, a aVar, en enVar) throws IOException {
        options.inJustDecodeBounds = true;
        b(hgVar, options, aVar, enVar);
        options.inJustDecodeBounds = false;
        return new int[]{options.outWidth, options.outHeight};
    }

    private static Bitmap b(hg hgVar, BitmapFactory.Options options, a aVar, en enVar) throws IOException {
        if (!options.inJustDecodeBounds) {
            aVar.a();
            hgVar.c();
        }
        int i2 = options.outWidth;
        int i3 = options.outHeight;
        String str = options.outMimeType;
        hn.a().lock();
        try {
            try {
                Bitmap a2 = hgVar.a(options);
                hn.a().unlock();
                return a2;
            } catch (IllegalArgumentException e2) {
                IOException iOException = new IOException("Exception decoding bitmap, outWidth: " + i2 + ", outHeight: " + i3 + ", outMimeType: " + str + ", inBitmap: " + a(options.inBitmap), e2);
                if (options.inBitmap != null) {
                    try {
                        enVar.a(options.inBitmap);
                        options.inBitmap = null;
                        Bitmap b2 = b(hgVar, options, aVar, enVar);
                        hn.a().unlock();
                        return b2;
                    } catch (IOException unused) {
                        throw iOException;
                    }
                }
                throw iOException;
            }
        } catch (Throwable th) {
            hn.a().unlock();
            throw th;
        }
    }

    private static boolean a(BitmapFactory.Options options) {
        return options.inTargetDensity > 0 && options.inDensity > 0 && options.inTargetDensity != options.inDensity;
    }

    private static String a(Bitmap bitmap) {
        String str;
        if (bitmap == null) {
            return null;
        }
        if (Build.VERSION.SDK_INT >= 19) {
            str = " (" + bitmap.getAllocationByteCount() + ")";
        } else {
            str = "";
        }
        return "[" + bitmap.getWidth() + "x" + bitmap.getHeight() + "] " + bitmap.getConfig() + str;
    }

    private static synchronized BitmapFactory.Options b() {
        BitmapFactory.Options poll;
        synchronized (ha.class) {
            synchronized (k) {
                poll = k.poll();
            }
            if (poll == null) {
                poll = new BitmapFactory.Options();
                c(poll);
            }
        }
        return poll;
    }

    private static void b(BitmapFactory.Options options) {
        c(options);
        synchronized (k) {
            k.offer(options);
        }
    }

    private static void c(BitmapFactory.Options options) {
        options.inTempStorage = null;
        options.inDither = false;
        options.inScaled = false;
        options.inSampleSize = 1;
        options.inPreferredConfig = null;
        options.inJustDecodeBounds = false;
        options.inDensity = 0;
        options.inTargetDensity = 0;
        if (Build.VERSION.SDK_INT >= 26) {
            options.inPreferredColorSpace = null;
            options.outColorSpace = null;
            options.outConfig = null;
        }
        options.outWidth = 0;
        options.outHeight = 0;
        options.outMimeType = null;
        options.inBitmap = null;
        options.inMutable = true;
    }
}
