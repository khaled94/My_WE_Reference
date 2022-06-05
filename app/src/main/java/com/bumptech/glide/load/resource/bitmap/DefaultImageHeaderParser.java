package com.bumptech.glide.load.resource.bitmap;

import android.util.Log;
import androidx.core.view.InputDeviceCompat;
import com.bumptech.glide.load.ImageHeaderParser;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.nio.charset.Charset;

/* loaded from: classes.dex */
public final class DefaultImageHeaderParser implements ImageHeaderParser {
    static final byte[] a = "Exif\u0000\u0000".getBytes(Charset.forName("UTF-8"));
    private static final int[] b = {0, 1, 1, 2, 4, 8, 1, 1, 2, 4, 8, 4, 8};

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(InputStream inputStream) throws IOException {
        return a(new c((InputStream) lf.a(inputStream, "Argument must not be null")));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final ImageHeaderParser.ImageType a(ByteBuffer byteBuffer) throws IOException {
        return a(new a((ByteBuffer) lf.a(byteBuffer, "Argument must not be null")));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(InputStream inputStream, ek ekVar) throws IOException {
        return a(new c((InputStream) lf.a(inputStream, "Argument must not be null")), (ek) lf.a(ekVar, "Argument must not be null"));
    }

    @Override // com.bumptech.glide.load.ImageHeaderParser
    public final int a(ByteBuffer byteBuffer, ek ekVar) throws IOException {
        return a(new a((ByteBuffer) lf.a(byteBuffer, "Argument must not be null")), (ek) lf.a(ekVar, "Argument must not be null"));
    }

    private static ImageHeaderParser.ImageType a(Reader reader) throws IOException {
        try {
            int b2 = reader.b();
            if (b2 == 65496) {
                return ImageHeaderParser.ImageType.JPEG;
            }
            int a2 = (b2 << 8) | reader.a();
            if (a2 == 4671814) {
                return ImageHeaderParser.ImageType.GIF;
            }
            int a3 = (a2 << 8) | reader.a();
            if (a3 == -1991225785) {
                reader.a(21L);
                try {
                    return reader.a() >= 3 ? ImageHeaderParser.ImageType.PNG_A : ImageHeaderParser.ImageType.PNG;
                } catch (Reader.EndOfFileException unused) {
                    return ImageHeaderParser.ImageType.PNG;
                }
            } else if (a3 == 1380533830) {
                reader.a(4L);
                if (((reader.b() << 16) | reader.b()) != 1464156752) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int b3 = (reader.b() << 16) | reader.b();
                if ((b3 & InputDeviceCompat.SOURCE_ANY) != 1448097792) {
                    return ImageHeaderParser.ImageType.UNKNOWN;
                }
                int i = b3 & 255;
                if (i != 88) {
                    if (i == 76) {
                        reader.a(4L);
                        return (reader.a() & 8) != 0 ? ImageHeaderParser.ImageType.WEBP_A : ImageHeaderParser.ImageType.WEBP;
                    }
                    return ImageHeaderParser.ImageType.WEBP;
                }
                reader.a(4L);
                short a4 = reader.a();
                if ((a4 & 2) != 0) {
                    return ImageHeaderParser.ImageType.ANIMATED_WEBP;
                }
                if ((a4 & 16) != 0) {
                    return ImageHeaderParser.ImageType.WEBP_A;
                }
                return ImageHeaderParser.ImageType.WEBP;
            } else {
                boolean z = false;
                if (((reader.b() << 16) | reader.b()) == 1718909296) {
                    int b4 = (reader.b() << 16) | reader.b();
                    if (b4 != 1635150182 && b4 != 1635150195) {
                        reader.a(4L);
                        int i2 = a3 - 16;
                        if (i2 % 4 == 0) {
                            int i3 = 0;
                            while (i3 < 5 && i2 > 0) {
                                int b5 = (reader.b() << 16) | reader.b();
                                if (b5 != 1635150182 && b5 != 1635150195) {
                                    i3++;
                                    i2 -= 4;
                                }
                            }
                        }
                    }
                    z = true;
                    break;
                }
                return z ? ImageHeaderParser.ImageType.AVIF : ImageHeaderParser.ImageType.UNKNOWN;
            }
        } catch (Reader.EndOfFileException unused2) {
            return ImageHeaderParser.ImageType.UNKNOWN;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x001a A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x001b A[Catch: EndOfFileException -> 0x00ae, LOOP:0: B:14:0x001b->B:27:0x0047, LOOP_START, TRY_LEAVE, TryCatch #1 {EndOfFileException -> 0x00ae, blocks: (B:3:0x0001, B:14:0x001b, B:18:0x0028, B:24:0x0036, B:26:0x0040, B:28:0x0049, B:30:0x004f, B:33:0x006d, B:43:0x00a5, B:34:0x0075, B:36:0x007b, B:38:0x0081, B:39:0x0094, B:41:0x009a), top: B:46:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static int a(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader r10, defpackage.ek r11) throws java.io.IOException {
        /*
            r0 = -1
            int r1 = r10.b()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            r2 = 65496(0xffd8, float:9.178E-41)
            r3 = r1 & r2
            if (r3 == r2) goto L17
            r2 = 19789(0x4d4d, float:2.773E-41)
            if (r1 == r2) goto L17
            r2 = 18761(0x4949, float:2.629E-41)
            if (r1 != r2) goto L15
            goto L17
        L15:
            r1 = 0
            goto L18
        L17:
            r1 = 1
        L18:
            if (r1 != 0) goto L1b
            return r0
        L1b:
            short r1 = r10.a()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            r2 = 255(0xff, float:3.57E-43)
            r3 = 3
            java.lang.String r4 = "DfltImageHeaderParser"
            if (r1 == r2) goto L28
        L26:
            r2 = -1
            goto L6a
        L28:
            short r1 = r10.a()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            r2 = 218(0xda, float:3.05E-43)
            if (r1 != r2) goto L31
            goto L26
        L31:
            r2 = 217(0xd9, float:3.04E-43)
            if (r1 != r2) goto L36
            goto L26
        L36:
            int r2 = r10.b()     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            int r2 = r2 + (-2)
            r5 = 225(0xe1, float:3.15E-43)
            if (r1 == r5) goto L6a
            long r5 = (long) r2     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            long r7 = r10.a(r5)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            int r9 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r9 == 0) goto L1b
            boolean r5 = android.util.Log.isLoggable(r4, r3)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            if (r5 == 0) goto L26
            java.lang.StringBuilder r5 = new java.lang.StringBuilder     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            java.lang.String r6 = "Unable to skip enough data, type: "
            r5.<init>(r6)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            r5.append(r1)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            java.lang.String r1 = ", wanted to skip: "
            r5.append(r1)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            r5.append(r2)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            java.lang.String r1 = ", but actually skipped: "
            r5.append(r1)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            r5.append(r7)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            goto L26
        L6a:
            if (r2 != r0) goto L6d
            return r0
        L6d:
            java.lang.Class<byte[]> r1 = byte[].class
            java.lang.Object r1 = r11.a(r2, r1)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            byte[] r1 = (byte[]) r1     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            int r10 = r10.a(r1, r2)     // Catch: java.lang.Throwable -> La9
            if (r10 == r2) goto L94
            boolean r3 = android.util.Log.isLoggable(r4, r3)     // Catch: java.lang.Throwable -> La9
            if (r3 == 0) goto La4
            java.lang.StringBuilder r3 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> La9
            java.lang.String r4 = "Unable to read exif segment data, length: "
            r3.<init>(r4)     // Catch: java.lang.Throwable -> La9
            r3.append(r2)     // Catch: java.lang.Throwable -> La9
            java.lang.String r2 = ", actually read: "
            r3.append(r2)     // Catch: java.lang.Throwable -> La9
            r3.append(r10)     // Catch: java.lang.Throwable -> La9
            goto La4
        L94:
            boolean r10 = a(r1, r2)     // Catch: java.lang.Throwable -> La9
            if (r10 == 0) goto La4
            com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b r10 = new com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$b     // Catch: java.lang.Throwable -> La9
            r10.<init>(r1, r2)     // Catch: java.lang.Throwable -> La9
            int r10 = a(r10)     // Catch: java.lang.Throwable -> La9
            goto La5
        La4:
            r10 = -1
        La5:
            r11.a(r1)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            return r10
        La9:
            r10 = move-exception
            r11.a(r1)     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
            throw r10     // Catch: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader.EndOfFileException -> Lae
        Lae:
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.a(com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser$Reader, ek):int");
    }

    private static boolean a(byte[] bArr, int i) {
        boolean z = bArr != null && i > a.length;
        if (z) {
            int i2 = 0;
            while (true) {
                byte[] bArr2 = a;
                if (i2 >= bArr2.length) {
                    break;
                } else if (bArr[i2] != bArr2[i2]) {
                    return false;
                } else {
                    i2++;
                }
            }
        }
        return z;
    }

    private static int a(b bVar) {
        ByteOrder byteOrder;
        short b2 = bVar.b(6);
        if (b2 == 18761) {
            byteOrder = ByteOrder.LITTLE_ENDIAN;
        } else if (b2 == 19789) {
            byteOrder = ByteOrder.BIG_ENDIAN;
        } else {
            byteOrder = ByteOrder.BIG_ENDIAN;
        }
        bVar.a.order(byteOrder);
        int a2 = bVar.a(10) + 6;
        short b3 = bVar.b(a2);
        for (int i = 0; i < b3; i++) {
            int i2 = a2 + 2 + (i * 12);
            short b4 = bVar.b(i2);
            if (b4 == 274) {
                short b5 = bVar.b(i2 + 2);
                if (b5 <= 0 || b5 > 12) {
                    Log.isLoggable("DfltImageHeaderParser", 3);
                } else {
                    int a3 = bVar.a(i2 + 4);
                    if (a3 < 0) {
                        Log.isLoggable("DfltImageHeaderParser", 3);
                    } else {
                        if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                            StringBuilder sb = new StringBuilder("Got tagIndex=");
                            sb.append(i);
                            sb.append(" tagType=");
                            sb.append((int) b4);
                            sb.append(" formatCode=");
                            sb.append((int) b5);
                            sb.append(" componentCount=");
                            sb.append(a3);
                        }
                        int i3 = a3 + b[b5];
                        if (i3 > 4) {
                            Log.isLoggable("DfltImageHeaderParser", 3);
                        } else {
                            int i4 = i2 + 8;
                            if (i4 < 0 || i4 > bVar.a.remaining()) {
                                if (Log.isLoggable("DfltImageHeaderParser", 3)) {
                                    StringBuilder sb2 = new StringBuilder("Illegal tagValueOffset=");
                                    sb2.append(i4);
                                    sb2.append(" tagType=");
                                    sb2.append((int) b4);
                                }
                            } else if (i3 < 0 || i3 + i4 > bVar.a.remaining()) {
                                Log.isLoggable("DfltImageHeaderParser", 3);
                            } else {
                                return bVar.b(i4);
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b {
        final ByteBuffer a;

        b(byte[] bArr, int i) {
            this.a = (ByteBuffer) ByteBuffer.wrap(bArr).order(ByteOrder.BIG_ENDIAN).limit(i);
        }

        final int a(int i) {
            if (a(i, 4)) {
                return this.a.getInt(i);
            }
            return -1;
        }

        final short b(int i) {
            if (a(i, 2)) {
                return this.a.getShort(i);
            }
            return (short) -1;
        }

        private boolean a(int i, int i2) {
            return this.a.remaining() - i >= i2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public interface Reader {
        int a(byte[] bArr, int i) throws IOException;

        long a(long j) throws IOException;

        short a() throws IOException;

        int b() throws IOException;

        /* loaded from: classes.dex */
        public static final class EndOfFileException extends IOException {
            EndOfFileException() {
                super("Unexpectedly reached end of a file");
            }
        }
    }

    /* loaded from: classes.dex */
    static final class a implements Reader {
        private final ByteBuffer a;

        a(ByteBuffer byteBuffer) {
            this.a = byteBuffer;
            byteBuffer.order(ByteOrder.BIG_ENDIAN);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short a() throws Reader.EndOfFileException {
            if (this.a.remaining() <= 0) {
                throw new Reader.EndOfFileException();
            }
            return (short) (this.a.get() & 255);
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int b() throws Reader.EndOfFileException {
            return (a() << 8) | a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a(byte[] bArr, int i) {
            int min = Math.min(i, this.a.remaining());
            if (min == 0) {
                return -1;
            }
            this.a.get(bArr, 0, min);
            return min;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long a(long j) {
            int min = (int) Math.min(this.a.remaining(), j);
            ByteBuffer byteBuffer = this.a;
            byteBuffer.position(byteBuffer.position() + min);
            return min;
        }
    }

    /* loaded from: classes.dex */
    static final class c implements Reader {
        private final InputStream a;

        c(InputStream inputStream) {
            this.a = inputStream;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final short a() throws IOException {
            int read = this.a.read();
            if (read != -1) {
                return (short) read;
            }
            throw new Reader.EndOfFileException();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int b() throws IOException {
            return (a() << 8) | a();
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final int a(byte[] bArr, int i) throws IOException {
            int i2 = 0;
            int i3 = 0;
            while (i2 < i && (i3 = this.a.read(bArr, i2, i - i2)) != -1) {
                i2 += i3;
            }
            if (i2 == 0 && i3 == -1) {
                throw new Reader.EndOfFileException();
            }
            return i2;
        }

        @Override // com.bumptech.glide.load.resource.bitmap.DefaultImageHeaderParser.Reader
        public final long a(long j) throws IOException {
            if (j < 0) {
                return 0L;
            }
            long j2 = j;
            while (j2 > 0) {
                long skip = this.a.skip(j2);
                if (skip <= 0) {
                    if (this.a.read() == -1) {
                        break;
                    }
                    skip = 1;
                }
                j2 -= skip;
            }
            return j - j2;
        }
    }
}
