package defpackage;

import android.content.res.AssetFileDescriptor;
import android.graphics.Bitmap;
import android.media.MediaDataSource;
import android.media.MediaMetadataRetriever;
import android.os.Build;
import android.os.ParcelFileDescriptor;
import defpackage.cl;
import java.io.IOException;
import java.nio.ByteBuffer;
import java.security.MessageDigest;

/* renamed from: hp  reason: default package */
/* loaded from: classes2.dex */
public final class hp<T> implements co<T, Bitmap> {
    public static final cl<Long> a = cl.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.TargetFrame", -1L, new cl.a<Long>() { // from class: hp.1
        private final ByteBuffer a = ByteBuffer.allocate(8);

        @Override // defpackage.cl.a
        public final /* synthetic */ void a(byte[] bArr, Long l, MessageDigest messageDigest) {
            Long l2 = l;
            messageDigest.update(bArr);
            synchronized (this.a) {
                this.a.position(0);
                messageDigest.update(this.a.putLong(l2.longValue()).array());
            }
        }
    });
    public static final cl<Integer> b = cl.a("com.bumptech.glide.load.resource.bitmap.VideoBitmapDecode.FrameOption", 2, new cl.a<Integer>() { // from class: hp.2
        private final ByteBuffer a = ByteBuffer.allocate(4);

        @Override // defpackage.cl.a
        public final /* synthetic */ void a(byte[] bArr, Integer num, MessageDigest messageDigest) {
            Integer num2 = num;
            if (num2 != null) {
                messageDigest.update(bArr);
                synchronized (this.a) {
                    this.a.position(0);
                    messageDigest.update(this.a.putInt(num2.intValue()).array());
                }
            }
        }
    });
    private static final c c = new c();
    private final d<T> d;
    private final en e;
    private final c f;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hp$d */
    /* loaded from: classes2.dex */
    public interface d<T> {
        void a(MediaMetadataRetriever mediaMetadataRetriever, T t);
    }

    @Override // defpackage.co
    public final boolean a(T t, cm cmVar) {
        return true;
    }

    public static co<AssetFileDescriptor, Bitmap> a(en enVar) {
        return new hp(enVar, new a((byte) 0));
    }

    public static co<ParcelFileDescriptor, Bitmap> b(en enVar) {
        return new hp(enVar, new e());
    }

    public static co<ByteBuffer, Bitmap> c(en enVar) {
        return new hp(enVar, new b());
    }

    private hp(en enVar, d<T> dVar) {
        this(enVar, dVar, c);
    }

    private hp(en enVar, d<T> dVar, c cVar) {
        this.e = enVar;
        this.d = dVar;
        this.f = cVar;
    }

    @Override // defpackage.co
    public final ee<Bitmap> a(T t, int i, int i2, cm cmVar) throws IOException {
        long longValue = ((Long) cmVar.a(a)).longValue();
        if (longValue < 0 && longValue != -1) {
            throw new IllegalArgumentException("Requested frame must be non-negative, or DEFAULT_FRAME, given: ".concat(String.valueOf(longValue)));
        }
        Integer num = (Integer) cmVar.a(b);
        if (num == null) {
            num = 2;
        }
        gz gzVar = (gz) cmVar.a(gz.h);
        if (gzVar == null) {
            gzVar = gz.g;
        }
        gz gzVar2 = gzVar;
        MediaMetadataRetriever mediaMetadataRetriever = new MediaMetadataRetriever();
        try {
            this.d.a(mediaMetadataRetriever, t);
            int intValue = num.intValue();
            Bitmap bitmap = null;
            if (Build.VERSION.SDK_INT >= 27 && i != Integer.MIN_VALUE && i2 != Integer.MIN_VALUE && gzVar2 != gz.f) {
                bitmap = a(mediaMetadataRetriever, longValue, intValue, i, i2, gzVar2);
            }
            if (bitmap == null) {
                bitmap = mediaMetadataRetriever.getFrameAtTime(longValue, intValue);
            }
            if (bitmap != null) {
                return gt.a(bitmap, this.e);
            }
            throw new f();
        } finally {
            if (Build.VERSION.SDK_INT >= 29) {
                mediaMetadataRetriever.close();
            } else {
                mediaMetadataRetriever.release();
            }
        }
    }

    private static Bitmap a(MediaMetadataRetriever mediaMetadataRetriever, long j, int i, int i2, int i3, gz gzVar) {
        try {
            int parseInt = Integer.parseInt(mediaMetadataRetriever.extractMetadata(18));
            int parseInt2 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(19));
            int parseInt3 = Integer.parseInt(mediaMetadataRetriever.extractMetadata(24));
            if (parseInt3 == 90 || parseInt3 == 270) {
                parseInt2 = parseInt;
                parseInt = parseInt2;
            }
            float a2 = gzVar.a(parseInt, parseInt2, i2, i3);
            return mediaMetadataRetriever.getScaledFrameAtTime(j, i, Math.round(parseInt * a2), Math.round(a2 * parseInt2));
        } catch (Throwable unused) {
            return null;
        }
    }

    /* renamed from: hp$c */
    /* loaded from: classes2.dex */
    static class c {
        c() {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hp$a */
    /* loaded from: classes2.dex */
    public static final class a implements d<AssetFileDescriptor> {
        private a() {
        }

        /* synthetic */ a(byte b) {
            this();
        }

        @Override // defpackage.hp.d
        public final /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, AssetFileDescriptor assetFileDescriptor) {
            AssetFileDescriptor assetFileDescriptor2 = assetFileDescriptor;
            mediaMetadataRetriever.setDataSource(assetFileDescriptor2.getFileDescriptor(), assetFileDescriptor2.getStartOffset(), assetFileDescriptor2.getLength());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hp$e */
    /* loaded from: classes2.dex */
    public static final class e implements d<ParcelFileDescriptor> {
        e() {
        }

        @Override // defpackage.hp.d
        public final /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, ParcelFileDescriptor parcelFileDescriptor) {
            mediaMetadataRetriever.setDataSource(parcelFileDescriptor.getFileDescriptor());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: hp$b */
    /* loaded from: classes2.dex */
    public static final class b implements d<ByteBuffer> {
        @Override // defpackage.hp.d
        public final /* synthetic */ void a(MediaMetadataRetriever mediaMetadataRetriever, ByteBuffer byteBuffer) {
            final ByteBuffer byteBuffer2 = byteBuffer;
            mediaMetadataRetriever.setDataSource(new MediaDataSource() { // from class: hp.b.1
                @Override // java.io.Closeable, java.lang.AutoCloseable
                public final void close() {
                }

                @Override // android.media.MediaDataSource
                public final int readAt(long j, byte[] bArr, int i, int i2) {
                    if (j >= byteBuffer2.limit()) {
                        return -1;
                    }
                    byteBuffer2.position((int) j);
                    int min = Math.min(i2, byteBuffer2.remaining());
                    byteBuffer2.get(bArr, i, min);
                    return min;
                }

                @Override // android.media.MediaDataSource
                public final long getSize() {
                    return byteBuffer2.limit();
                }
            });
        }

        b() {
        }
    }

    /* renamed from: hp$f */
    /* loaded from: classes2.dex */
    static final class f extends RuntimeException {
        f() {
            super("MediaMetadataRetriever failed to retrieve a frame without throwing, check the adb logs for .*MetadataRetriever.* prior to this exception for details");
        }
    }
}
