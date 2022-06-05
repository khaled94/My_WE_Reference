package com.google.crypto.tink.shaded.protobuf;

import defpackage.cfe;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class CodedOutputStream extends cct {
    public ccx b;
    public boolean c;
    private static final Logger d = Logger.getLogger(CodedOutputStream.class.getName());
    static final boolean a = cfd.a();

    public static int a() {
        return 4;
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

    private static int s(int i) {
        return (i >> 31) ^ (i << 1);
    }

    public abstract void a(byte b) throws IOException;

    public abstract void a(int i) throws IOException;

    public abstract void a(int i, int i2) throws IOException;

    public abstract void a(int i, long j) throws IOException;

    public abstract void a(int i, ccu ccuVar) throws IOException;

    public abstract void a(int i, cec cecVar) throws IOException;

    public abstract void a(int i, cec cecVar, cet cetVar) throws IOException;

    public abstract void a(int i, String str) throws IOException;

    public abstract void a(int i, boolean z) throws IOException;

    public abstract void a(long j) throws IOException;

    public abstract void a(ccu ccuVar) throws IOException;

    public abstract void a(cec cecVar) throws IOException;

    public abstract void a(String str) throws IOException;

    public abstract void a(byte[] bArr, int i) throws IOException;

    @Override // defpackage.cct
    public abstract void a(byte[] bArr, int i, int i2) throws IOException;

    public abstract void b(int i) throws IOException;

    public abstract void b(int i, int i2) throws IOException;

    public abstract void b(int i, ccu ccuVar) throws IOException;

    public abstract void c(int i, int i2) throws IOException;

    public abstract void c(int i, long j) throws IOException;

    public abstract void c(long j) throws IOException;

    public abstract void d(int i) throws IOException;

    public abstract void e(int i, int i2) throws IOException;

    public abstract int h();

    /* synthetic */ CodedOutputStream(byte b) {
        this();
    }

    public static CodedOutputStream a(byte[] bArr) {
        return new a(bArr, bArr.length);
    }

    private CodedOutputStream() {
    }

    public final void d(int i, int i2) throws IOException {
        c(i, s(i2));
    }

    public final void b(int i, long j) throws IOException {
        a(i, g(j));
    }

    public final void a(int i, float f) throws IOException {
        e(i, Float.floatToRawIntBits(f));
    }

    public final void a(int i, double d2) throws IOException {
        c(i, Double.doubleToRawLongBits(d2));
    }

    public final void c(int i) throws IOException {
        b(s(i));
    }

    public final void b(long j) throws IOException {
        a(g(j));
    }

    public final void a(float f) throws IOException {
        d(Float.floatToRawIntBits(f));
    }

    public final void a(double d2) throws IOException {
        c(Double.doubleToRawLongBits(d2));
    }

    public final void a(boolean z) throws IOException {
        a(z ? (byte) 1 : (byte) 0);
    }

    public static int f(int i, int i2) {
        return l(i) + m(i2);
    }

    public static int g(int i, int i2) {
        return l(i) + n(i2);
    }

    public static int h(int i, int i2) {
        return l(i) + n(s(i2));
    }

    public static int e(int i) {
        return l(i) + 4;
    }

    public static int f(int i) {
        return l(i) + 4;
    }

    public static int d(int i, long j) {
        return l(i) + e(j);
    }

    public static int e(int i, long j) {
        return l(i) + e(j);
    }

    public static int f(int i, long j) {
        return l(i) + e(g(j));
    }

    public static int g(int i) {
        return l(i) + 8;
    }

    public static int h(int i) {
        return l(i) + 8;
    }

    public static int i(int i) {
        return l(i) + 4;
    }

    public static int j(int i) {
        return l(i) + 8;
    }

    public static int k(int i) {
        return l(i) + 1;
    }

    public static int i(int i, int i2) {
        return l(i) + m(i2);
    }

    public static int b(int i, String str) {
        return l(i) + b(str);
    }

    public static int c(int i, ccu ccuVar) {
        int l = l(i);
        int b = ccuVar.b();
        return l + n(b) + b;
    }

    public static int a(int i, cdp cdpVar) {
        int l = l(i);
        int b = cdpVar.b();
        return l + n(b) + b;
    }

    public static int b(int i, cec cecVar, cet cetVar) {
        return l(i) + a(cecVar, cetVar);
    }

    public static int b(int i, cec cecVar) {
        return (l(1) * 2) + g(2, i) + l(3) + b(cecVar);
    }

    public static int d(int i, ccu ccuVar) {
        return (l(1) * 2) + g(2, i) + c(3, ccuVar);
    }

    public static int b(int i, cdp cdpVar) {
        return (l(1) * 2) + g(2, i) + a(3, cdpVar);
    }

    public static int l(int i) {
        return n(cff.a(i, 0));
    }

    public static int m(int i) {
        if (i >= 0) {
            return n(i);
        }
        return 10;
    }

    public static int o(int i) {
        return n(s(i));
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
            i = cfe.a(str);
        } catch (cfe.d unused) {
            i = str.getBytes(cdm.a).length;
        }
        return n(i) + i;
    }

    public static int a(cdp cdpVar) {
        int b = cdpVar.b();
        return n(b) + b;
    }

    public static int b(ccu ccuVar) {
        int b = ccuVar.b();
        return n(b) + b;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return n(length) + length;
    }

    public static int b(cec cecVar) {
        int o = cecVar.o();
        return n(o) + o;
    }

    public static int a(cec cecVar, cet cetVar) {
        int a2 = ((ccm) cecVar).a(cetVar);
        return n(a2) + a2;
    }

    public static int q(int i) {
        return n(i) + i;
    }

    public final void i() {
        if (h() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    /* loaded from: classes.dex */
    public static class OutOfSpaceException extends IOException {
        OutOfSpaceException() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        OutOfSpaceException(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        OutOfSpaceException(String str, Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.: ".concat(String.valueOf(str)), th);
        }
    }

    final void a(String str, cfe.d dVar) throws IOException {
        d.log(Level.WARNING, "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) dVar);
        byte[] bytes = str.getBytes(cdm.a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (OutOfSpaceException e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new OutOfSpaceException(e2);
        }
    }

    @Deprecated
    public static int c(int i, cec cecVar, cet cetVar) {
        return (l(i) * 2) + ((ccm) cecVar).a(cetVar);
    }

    @Deprecated
    public static int c(cec cecVar) {
        return cecVar.o();
    }

    @Deprecated
    public static int r(int i) {
        return n(i);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static class a extends CodedOutputStream {
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

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(int i, int i2) throws IOException {
            b(cff.a(i, i2));
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void b(int i, int i2) throws IOException {
            a(i, 0);
            a(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void c(int i, int i2) throws IOException {
            a(i, 0);
            b(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void e(int i, int i2) throws IOException {
            a(i, 5);
            d(i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(int i, long j) throws IOException {
            a(i, 0);
            a(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void c(int i, long j) throws IOException {
            a(i, 1);
            c(j);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(int i, boolean z) throws IOException {
            a(i, 0);
            a(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(int i, String str) throws IOException {
            a(i, 2);
            a(str);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(int i, ccu ccuVar) throws IOException {
            a(i, 2);
            a(ccuVar);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(ccu ccuVar) throws IOException {
            b(ccuVar.b());
            ccuVar.a(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(byte[] bArr, int i) throws IOException {
            b(i);
            b(bArr, 0, i);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(int i, cec cecVar, cet cetVar) throws IOException {
            a(i, 2);
            b(((ccm) cecVar).a(cetVar));
            cetVar.a((cet) cecVar, (cfg) this.b);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(int i, cec cecVar) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, 2);
            a(cecVar);
            a(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void b(int i, ccu ccuVar) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, ccuVar);
            a(1, 4);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(cec cecVar) throws IOException {
            b(cecVar.o());
            cecVar.a(this);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(byte b) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                this.g = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(int i) throws IOException {
            if (i >= 0) {
                b(i);
            } else {
                a(i);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void d(int i) throws IOException {
            try {
                byte[] bArr = this.d;
                int i2 = this.g;
                int i3 = i2 + 1;
                this.g = i3;
                bArr[i2] = (byte) (i & 255);
                byte[] bArr2 = this.d;
                int i4 = i3 + 1;
                this.g = i4;
                bArr2[i3] = (byte) ((i >> 8) & 255);
                byte[] bArr3 = this.d;
                int i5 = i4 + 1;
                this.g = i5;
                bArr3[i4] = (byte) ((i >> 16) & 255);
                byte[] bArr4 = this.d;
                this.g = i5 + 1;
                bArr4[i5] = (byte) ((i >> 24) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void c(long j) throws IOException {
            try {
                byte[] bArr = this.d;
                int i = this.g;
                int i2 = i + 1;
                this.g = i2;
                bArr[i] = (byte) (((int) j) & 255);
                byte[] bArr2 = this.d;
                int i3 = i2 + 1;
                this.g = i3;
                bArr2[i2] = (byte) (((int) (j >> 8)) & 255);
                byte[] bArr3 = this.d;
                int i4 = i3 + 1;
                this.g = i4;
                bArr3[i3] = (byte) (((int) (j >> 16)) & 255);
                byte[] bArr4 = this.d;
                int i5 = i4 + 1;
                this.g = i5;
                bArr4[i4] = (byte) (((int) (j >> 24)) & 255);
                byte[] bArr5 = this.d;
                int i6 = i5 + 1;
                this.g = i6;
                bArr5[i5] = (byte) (((int) (j >> 32)) & 255);
                byte[] bArr6 = this.d;
                int i7 = i6 + 1;
                this.g = i7;
                bArr6[i6] = (byte) (((int) (j >> 40)) & 255);
                byte[] bArr7 = this.d;
                int i8 = i7 + 1;
                this.g = i8;
                bArr7[i7] = (byte) (((int) (j >> 48)) & 255);
                byte[] bArr8 = this.d;
                this.g = i8 + 1;
                bArr8[i8] = (byte) (((int) (j >> 56)) & 255);
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
            }
        }

        private void b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.d, this.g, i2);
                this.g += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), Integer.valueOf(i2)), e);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream, defpackage.cct
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            b(bArr, i, i2);
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(String str) throws IOException {
            int i = this.g;
            try {
                int n = n(str.length() * 3);
                int n2 = n(str.length());
                if (n2 == n) {
                    int i2 = i + n2;
                    this.g = i2;
                    int a = cfe.a(str, this.d, i2, h());
                    this.g = i;
                    b((a - i) - n2);
                    this.g = a;
                    return;
                }
                b(cfe.a(str));
                this.g = cfe.a(str, this.d, this.g, h());
            } catch (cfe.d e) {
                this.g = i;
                a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new OutOfSpaceException(e2);
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final int h() {
            return this.f - this.g;
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void b(int i) throws IOException {
            if (!CodedOutputStream.a || ccp.a() || h() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.d;
                        int i2 = this.g;
                        this.g = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
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
                cfd.a(bArr3, i4, (byte) i);
            } else {
                byte[] bArr4 = this.d;
                int i5 = this.g;
                this.g = i5 + 1;
                cfd.a(bArr4, i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & (-128)) == 0) {
                    byte[] bArr5 = this.d;
                    int i7 = this.g;
                    this.g = i7 + 1;
                    cfd.a(bArr5, i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.d;
                int i8 = this.g;
                this.g = i8 + 1;
                cfd.a(bArr6, i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & (-128)) == 0) {
                    byte[] bArr7 = this.d;
                    int i10 = this.g;
                    this.g = i10 + 1;
                    cfd.a(bArr7, i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.d;
                int i11 = this.g;
                this.g = i11 + 1;
                cfd.a(bArr8, i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & (-128)) == 0) {
                    byte[] bArr9 = this.d;
                    int i13 = this.g;
                    this.g = i13 + 1;
                    cfd.a(bArr9, i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.d;
                int i14 = this.g;
                this.g = i14 + 1;
                cfd.a(bArr10, i14, (byte) (i12 | 128));
                byte[] bArr11 = this.d;
                int i15 = this.g;
                this.g = i15 + 1;
                cfd.a(bArr11, i15, (byte) (i12 >>> 7));
            }
        }

        @Override // com.google.crypto.tink.shaded.protobuf.CodedOutputStream
        public final void a(long j) throws IOException {
            if (CodedOutputStream.a && h() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.d;
                    int i = this.g;
                    this.g = i + 1;
                    cfd.a(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.d;
                int i2 = this.g;
                this.g = i2 + 1;
                cfd.a(bArr2, i2, (byte) j);
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
                    throw new OutOfSpaceException(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.g), Integer.valueOf(this.f), 1), e);
                }
            }
            byte[] bArr4 = this.d;
            int i4 = this.g;
            this.g = i4 + 1;
            bArr4[i4] = (byte) j;
        }
    }
}
