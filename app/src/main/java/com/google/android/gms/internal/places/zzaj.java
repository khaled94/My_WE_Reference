package com.google.android.gms.internal.places;

import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzaj extends bfy {
    static final Logger a = Logger.getLogger(zzaj.class.getName());
    static final boolean b = beu.a();
    public bbl c;

    public static int a() {
        return 4;
    }

    public static zzaj a(byte[] bArr) {
        return new a(bArr, bArr.length);
    }

    public static int b() {
        return 4;
    }

    public static int c() {
        return 8;
    }

    public static int d() {
        return 8;
    }

    public static int e() {
        return 4;
    }

    public static int e(long j) {
        int i;
        if (((-128) & j) == 0) {
            return 1;
        }
        if (j < 0) {
            return 10;
        }
        if (((-34359738368L) & j) != 0) {
            i = 6;
            j >>>= 28;
        } else {
            i = 2;
        }
        if (((-2097152) & j) != 0) {
            i += 2;
            j >>>= 14;
        }
        return (j & (-16384)) != 0 ? i + 1 : i;
    }

    public static int f() {
        return 8;
    }

    public static int g() {
        return 1;
    }

    private static long g(long j) {
        return (j >> 63) ^ (j << 1);
    }

    public static int n(int i) {
        if ((i & (-128)) == 0) {
            return 1;
        }
        if ((i & (-16384)) == 0) {
            return 2;
        }
        if (((-2097152) & i) == 0) {
            return 3;
        }
        return (i & (-268435456)) == 0 ? 4 : 5;
    }

    private static int r(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract void a(byte b2) throws IOException;

    public abstract void a(int i) throws IOException;

    public abstract void a(int i, int i2) throws IOException;

    public abstract void a(int i, long j) throws IOException;

    public abstract void a(int i, bdh bdhVar) throws IOException;

    public abstract void a(int i, bdh bdhVar, bdy bdyVar) throws IOException;

    public abstract void a(int i, bgb bgbVar) throws IOException;

    public abstract void a(int i, String str) throws IOException;

    public abstract void a(int i, boolean z) throws IOException;

    public abstract void a(long j) throws IOException;

    public abstract void a(bdh bdhVar) throws IOException;

    public abstract void a(bgb bgbVar) throws IOException;

    public abstract void a(String str) throws IOException;

    public abstract void a(byte[] bArr, int i) throws IOException;

    public abstract void b(int i) throws IOException;

    public abstract void b(int i, int i2) throws IOException;

    public abstract void b(int i, bgb bgbVar) throws IOException;

    public abstract void c(int i, int i2) throws IOException;

    public abstract void c(int i, long j) throws IOException;

    public abstract void c(long j) throws IOException;

    public abstract void d(int i) throws IOException;

    public abstract void e(int i, int i2) throws IOException;

    public abstract int h();

    /* loaded from: classes.dex */
    public static class zzc extends IOException {
        zzc() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        zzc(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        zzc(java.lang.String r3, java.lang.Throwable r4) {
            /*
                r2 = this;
                java.lang.String r3 = java.lang.String.valueOf(r3)
                int r0 = r3.length()
                java.lang.String r1 = "CodedOutputStream was writing to a flat byte array and ran out of space.: "
                if (r0 == 0) goto L11
                java.lang.String r3 = r1.concat(r3)
                goto L16
            L11:
                java.lang.String r3 = new java.lang.String
                r3.<init>(r1)
            L16:
                r2.<init>(r3, r4)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.places.zzaj.zzc.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    private zzaj() {
    }

    public final void d(int i, int i2) throws IOException {
        c(i, r(i2));
    }

    public final void b(int i, long j) throws IOException {
        a(i, g(j));
    }

    public final void a(int i, float f) throws IOException {
        e(i, Float.floatToRawIntBits(f));
    }

    public final void a(int i, double d) throws IOException {
        c(i, Double.doubleToRawLongBits(d));
    }

    public final void c(int i) throws IOException {
        b(r(i));
    }

    /* loaded from: classes.dex */
    static class a extends zzaj {
        private final byte[] d;
        private final int e;
        private final int f;
        private int g;

        a(byte[] bArr, int i) {
            super((byte) 0);
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i2 = i + 0;
            if ((i | 0 | (bArr.length - i2)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), 0, Integer.valueOf(i)));
            }
            this.d = bArr;
            this.e = 0;
            this.g = 0;
            this.f = i2;
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(int i, int i2) throws IOException {
            b((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void b(int i, int i2) throws IOException {
            a(i, 0);
            a(i2);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void c(int i, int i2) throws IOException {
            a(i, 0);
            b(i2);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void e(int i, int i2) throws IOException {
            a(i, 5);
            d(i2);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(int i, long j) throws IOException {
            a(i, 0);
            a(j);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void c(int i, long j) throws IOException {
            a(i, 1);
            c(j);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(int i, boolean z) throws IOException {
            a(i, 0);
            a(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(int i, String str) throws IOException {
            a(i, 2);
            a(str);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(int i, bgb bgbVar) throws IOException {
            a(i, 2);
            a(bgbVar);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(bgb bgbVar) throws IOException {
            b(bgbVar.a());
            bgbVar.a(this);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(byte[] bArr, int i) throws IOException {
            b(i);
            b(bArr, 0, i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(int i, bdh bdhVar, bdy bdyVar) throws IOException {
            a(i, 2);
            bfr bfrVar = (bfr) bdhVar;
            int c = bfrVar.c();
            if (c == -1) {
                c = bdyVar.b(bfrVar);
                bfrVar.b(c);
            }
            b(c);
            bdyVar.a((bdy) bdhVar, (bfi) this.c);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(int i, bdh bdhVar) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, 2);
            a(bdhVar);
            a(1, 4);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void b(int i, bgb bgbVar) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, bgbVar);
            a(1, 4);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(bdh bdhVar) throws IOException {
            b(bdhVar.d());
            bdhVar.a(this);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(int i) throws IOException {
            if (i >= 0) {
                b(i);
            } else {
                a(i);
            }
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void d(int i) throws IOException {
            try {
                byte[] bArr = this.d;
                int i2 = this.g;
                int i3 = i2 + 1;
                this.g = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.d;
                int i4 = i3 + 1;
                this.g = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.d;
                int i5 = i4 + 1;
                this.g = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.d;
                this.g = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void c(long j) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                int i2 = i + 1;
                this.g = i2;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.d;
                int i3 = i2 + 1;
                this.g = i3;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.d;
                int i4 = i3 + 1;
                this.g = i4;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.d;
                int i5 = i4 + 1;
                this.g = i5;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.d;
                int i6 = i5 + 1;
                this.g = i6;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.d;
                int i7 = i6 + 1;
                this.g = i7;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.d;
                int i8 = i7 + 1;
                this.g = i8;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.d;
                this.g = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        private final void b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e);
            }
        }

        @Override // defpackage.bfy
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            b(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(String str) throws IOException {
            int i = this.g;
            try {
                int n = n(str.length() * 3);
                int n2 = n(str.length());
                if (n2 == n) {
                    int i2 = i + n2;
                    this.g = i2;
                    int a = bex.a(str, this.d, i2, h());
                    this.g = i;
                    b((a - i) - n2);
                    this.g = a;
                    return;
                }
                b(bex.a(str));
                this.g = bex.a(str, this.d, this.g, h());
            } catch (bfb e) {
                this.g = i;
                zzaj.a.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) e);
                byte[] bytes = str.getBytes(bcd.a);
                try {
                    b(bytes.length);
                    a(bytes, 0, bytes.length);
                } catch (zzc e2) {
                    throw e2;
                } catch (IndexOutOfBoundsException e3) {
                    throw new zzc(e3);
                }
            } catch (IndexOutOfBoundsException e4) {
                throw new zzc(e4);
            }
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final int h() {
            return this.f - this.g;
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void b(int i) throws IOException {
            if (!zzaj.b || bfu.a() || h() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.d;
                        int i2 = this.g;
                        this.g = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                    }
                }
                byte[] bArr2 = this.d;
                int i3 = this.g;
                this.g = i3 + 1;
                bArr2[i3] = (byte) i;
            } else if ((i & (-128)) == 0) {
                byte[] bArr3 = this.d;
                int i4 = this.g;
                this.g = i4 + 1;
                beu.a(bArr3, i4, (byte) i);
            } else {
                byte[] bArr4 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                beu.a(bArr4, i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & (-128)) == 0) {
                    byte[] bArr5 = this.d;
                    int i7 = this.g;
                    this.g = i7 + 1;
                    beu.a(bArr5, i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.d;
                int i8 = this.g;
                this.g = i8 + 1;
                beu.a(bArr6, i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & (-128)) == 0) {
                    byte[] bArr7 = this.d;
                    int i10 = this.g;
                    this.g = i10 + 1;
                    beu.a(bArr7, i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.d;
                int i11 = this.g;
                this.g = i11 + 1;
                beu.a(bArr8, i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & (-128)) == 0) {
                    byte[] bArr9 = this.d;
                    int i13 = this.g;
                    this.g = i13 + 1;
                    beu.a(bArr9, i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.d;
                int i14 = this.g;
                this.g = i14 + 1;
                beu.a(bArr10, i14, (byte) (i12 | 128));
                byte[] bArr11 = this.d;
                int i15 = this.g;
                this.g = i15 + 1;
                beu.a(bArr11, i15, (byte) (i12 >>> 7));
            }
        }

        @Override // com.google.android.gms.internal.places.zzaj
        public final void a(long j) throws IOException {
            if (zzaj.b && h() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.d;
                    int i = this.g;
                    this.g = i + 1;
                    beu.a(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.d;
                int i2 = this.g;
                this.g = i2 + 1;
                beu.a(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.d;
                    int i3 = this.g;
                    this.g = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzc(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                }
            }
            byte[] bArr4 = this.d;
            int i4 = this.g;
            this.g = i4 + 1;
            bArr4[i4] = (byte) j;
        }
    }

    public final void b(long j) throws IOException {
        a(g(j));
    }

    public final void a(float f) throws IOException {
        d(Float.floatToRawIntBits(f));
    }

    public final void a(double d) throws IOException {
        c(Double.doubleToRawLongBits(d));
    }

    public final void a(boolean z) throws IOException {
        a(z ? (byte) 1 : (byte) 0);
    }

    public static int l(int i) {
        return n(i << 3);
    }

    public static int m(int i) {
        if (i >= 0) {
            return n(i);
        }
        return 10;
    }

    public static int o(int i) {
        return n(r(i));
    }

    public static int d(long j) {
        return e(j);
    }

    public static int f(long j) {
        return e(g(j));
    }

    public static int p(int i) {
        return m(i);
    }

    public static int b(String str) {
        int i;
        try {
            i = bex.a(str);
        } catch (bfb unused) {
            i = str.getBytes(bcd.a).length;
        }
        return n(i) + i;
    }

    public static int a(bcm bcmVar) {
        int b2 = bcmVar.b();
        return n(b2) + b2;
    }

    public static int b(bgb bgbVar) {
        int a2 = bgbVar.a();
        return n(a2) + a2;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return n(length) + length;
    }

    public static int b(bdh bdhVar) {
        int d = bdhVar.d();
        return n(d) + d;
    }

    public static int a(bdh bdhVar, bdy bdyVar) {
        bfr bfrVar = (bfr) bdhVar;
        int c = bfrVar.c();
        if (c == -1) {
            c = bdyVar.b(bfrVar);
            bfrVar.b(c);
        }
        return n(c) + c;
    }

    @Deprecated
    public static int c(bdh bdhVar) {
        return bdhVar.d();
    }

    @Deprecated
    public static int q(int i) {
        return n(i);
    }

    /* synthetic */ zzaj(byte b2) {
        this();
    }

    public static int f(int i, int i2) {
        return n(i << 3) + m(i2);
    }

    public static int g(int i, int i2) {
        return n(i << 3) + n(i2);
    }

    public static int h(int i, int i2) {
        return n(i << 3) + n(r(i2));
    }

    public static int e(int i) {
        return n(i << 3) + 4;
    }

    public static int f(int i) {
        return n(i << 3) + 4;
    }

    public static int d(int i, long j) {
        return n(i << 3) + e(j);
    }

    public static int e(int i, long j) {
        return n(i << 3) + e(j);
    }

    public static int f(int i, long j) {
        return n(i << 3) + e(g(j));
    }

    public static int g(int i) {
        return n(i << 3) + 8;
    }

    public static int h(int i) {
        return n(i << 3) + 8;
    }

    public static int i(int i) {
        return n(i << 3) + 4;
    }

    public static int j(int i) {
        return n(i << 3) + 8;
    }

    public static int k(int i) {
        return n(i << 3) + 1;
    }

    public static int i(int i, int i2) {
        return n(i << 3) + m(i2);
    }

    public static int b(int i, String str) {
        return n(i << 3) + b(str);
    }

    public static int c(int i, bgb bgbVar) {
        int n = n(i << 3);
        int a2 = bgbVar.a();
        return n + n(a2) + a2;
    }

    public static int a(int i, bcm bcmVar) {
        int n = n(i << 3);
        int b2 = bcmVar.b();
        return n + n(b2) + b2;
    }

    public static int b(int i, bdh bdhVar, bdy bdyVar) {
        return n(i << 3) + a(bdhVar, bdyVar);
    }

    public static int b(int i, bdh bdhVar) {
        return (n(8) << 1) + g(2, i) + n(24) + b(bdhVar);
    }

    public static int d(int i, bgb bgbVar) {
        return (n(8) << 1) + g(2, i) + c(3, bgbVar);
    }

    public static int b(int i, bcm bcmVar) {
        return (n(8) << 1) + g(2, i) + a(3, bcmVar);
    }

    @Deprecated
    public static int c(int i, bdh bdhVar, bdy bdyVar) {
        int n = n(i << 3) << 1;
        bfr bfrVar = (bfr) bdhVar;
        int c = bfrVar.c();
        if (c == -1) {
            c = bdyVar.b(bfrVar);
            bfrVar.b(c);
        }
        return n + c;
    }
}
