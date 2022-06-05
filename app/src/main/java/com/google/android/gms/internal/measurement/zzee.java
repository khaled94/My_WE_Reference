package com.google.android.gms.internal.measurement;

import java.io.IOException;
import java.nio.BufferOverflowException;
import java.nio.ByteBuffer;
import java.nio.ByteOrder;
import java.util.logging.Level;
import java.util.logging.Logger;

/* loaded from: classes.dex */
public abstract class zzee extends arq {
    public ask b;
    private static final Logger c = Logger.getLogger(zzee.class.getName());
    static final boolean a = avu.a();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class b extends a {
        private final ByteBuffer e;
        private int f;

        b(ByteBuffer byteBuffer) {
            super(byteBuffer.array(), byteBuffer.arrayOffset() + byteBuffer.position(), byteBuffer.remaining());
            this.e = byteBuffer;
            this.f = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.measurement.zzee.a, com.google.android.gms.internal.measurement.zzee
        public final void h() {
            this.e.position(this.f + (this.d - this.c));
        }
    }

    public static int a() {
        return 4;
    }

    public static zzee a(byte[] bArr) {
        return new a(bArr, 0, bArr.length);
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

    public abstract void a(int i, art artVar) throws IOException;

    public abstract void a(int i, aui auiVar) throws IOException;

    public abstract void a(int i, aui auiVar, aux auxVar) throws IOException;

    public abstract void a(int i, String str) throws IOException;

    public abstract void a(int i, boolean z) throws IOException;

    public abstract void a(long j) throws IOException;

    public abstract void a(art artVar) throws IOException;

    public abstract void a(aui auiVar) throws IOException;

    abstract void a(aui auiVar, aux auxVar) throws IOException;

    public abstract void a(String str) throws IOException;

    public abstract void a(byte[] bArr, int i) throws IOException;

    public abstract void b(int i) throws IOException;

    public abstract void b(int i, int i2) throws IOException;

    public abstract void b(int i, art artVar) throws IOException;

    public abstract void b(int i, aui auiVar) throws IOException;

    public abstract void b(byte[] bArr, int i, int i2) throws IOException;

    public abstract void c(int i, int i2) throws IOException;

    public abstract void c(int i, long j) throws IOException;

    public abstract void c(long j) throws IOException;

    public abstract void d(int i) throws IOException;

    public abstract void e(int i, int i2) throws IOException;

    public abstract void h() throws IOException;

    public abstract int i();

    /* loaded from: classes.dex */
    public static class zzb extends IOException {
        zzb() {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.");
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        zzb(java.lang.String r3) {
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
                r2.<init>(r3)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzee.zzb.<init>(java.lang.String):void");
        }

        zzb(Throwable th) {
            super("CodedOutputStream was writing to a flat byte array and ran out of space.", th);
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        zzb(java.lang.String r3, java.lang.Throwable r4) {
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
            throw new UnsupportedOperationException("Method not decompiled: com.google.android.gms.internal.measurement.zzee.zzb.<init>(java.lang.String, java.lang.Throwable):void");
        }
    }

    public static zzee a(ByteBuffer byteBuffer) {
        if (byteBuffer.hasArray()) {
            return new b(byteBuffer);
        }
        if (byteBuffer.isDirect() && !byteBuffer.isReadOnly()) {
            if (avu.b()) {
                return new c(byteBuffer);
            }
            return new d(byteBuffer);
        }
        throw new IllegalArgumentException("ByteBuffer is read-only");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class d extends zzee {
        private final ByteBuffer c;
        private final ByteBuffer d;
        private final int e;

        d(ByteBuffer byteBuffer) {
            super((byte) 0);
            this.c = byteBuffer;
            this.d = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            this.e = byteBuffer.position();
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, int i2) throws IOException {
            b((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(int i, int i2) throws IOException {
            a(i, 0);
            a(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void c(int i, int i2) throws IOException {
            a(i, 0);
            b(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void e(int i, int i2) throws IOException {
            a(i, 5);
            d(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, long j) throws IOException {
            a(i, 0);
            a(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void c(int i, long j) throws IOException {
            a(i, 1);
            c(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, boolean z) throws IOException {
            a(i, 0);
            a(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, String str) throws IOException {
            a(i, 2);
            a(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, art artVar) throws IOException {
            a(i, 2);
            a(artVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, aui auiVar) throws IOException {
            a(i, 2);
            a(auiVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, aui auiVar, aux auxVar) throws IOException {
            a(i, 2);
            a(auiVar, auxVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(int i, aui auiVar) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, auiVar);
            a(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(int i, art artVar) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, artVar);
            a(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(aui auiVar) throws IOException {
            b(auiVar.o());
            auiVar.a(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        final void a(aui auiVar, aux auxVar) throws IOException {
            arj arjVar = (arj) auiVar;
            int j = arjVar.j();
            if (j == -1) {
                j = auxVar.b(arjVar);
                arjVar.c(j);
            }
            b(j);
            auxVar.a((aux) auiVar, (awm) this.b);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(byte b) throws IOException {
            try {
                this.d.put(b);
            } catch (BufferOverflowException e) {
                throw new zzb(e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(art artVar) throws IOException {
            b(artVar.a());
            artVar.a(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(byte[] bArr, int i) throws IOException {
            b(i);
            b(bArr, 0, i);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i) throws IOException {
            if (i >= 0) {
                b(i);
            } else {
                a(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(int i) throws IOException {
            while ((i & (-128)) != 0) {
                try {
                    this.d.put((byte) ((i & 127) | 128));
                    i >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzb(e);
                }
            }
            this.d.put((byte) i);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void d(int i) throws IOException {
            try {
                this.d.putInt(i);
            } catch (BufferOverflowException e) {
                throw new zzb(e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(long j) throws IOException {
            while (((-128) & j) != 0) {
                try {
                    this.d.put((byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                } catch (BufferOverflowException e) {
                    throw new zzb(e);
                }
            }
            this.d.put((byte) j);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void c(long j) throws IOException {
            try {
                this.d.putLong(j);
            } catch (BufferOverflowException e) {
                throw new zzb(e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(byte[] bArr, int i, int i2) throws IOException {
            try {
                this.d.put(bArr, i, i2);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(e);
            } catch (BufferOverflowException e2) {
                throw new zzb(e2);
            }
        }

        @Override // defpackage.arq
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            b(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(String str) throws IOException {
            int position = this.d.position();
            try {
                int n = n(str.length() * 3);
                int n2 = n(str.length());
                if (n2 == n) {
                    int position2 = this.d.position() + n2;
                    this.d.position(position2);
                    c(str);
                    int position3 = this.d.position();
                    this.d.position(position);
                    b(position3 - position2);
                    this.d.position(position3);
                    return;
                }
                b(avx.a(str));
                c(str);
            } catch (awb e) {
                this.d.position(position);
                a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void h() {
            this.c.position(this.d.position());
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final int i() {
            return this.d.remaining();
        }

        private final void c(String str) throws IOException {
            try {
                avx.a(str, this.d);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(e);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* loaded from: classes.dex */
    public static final class c extends zzee {
        private final ByteBuffer c;
        private final ByteBuffer d;
        private final long e;
        private final long f;
        private final long g;
        private final long h;
        private long i;

        c(ByteBuffer byteBuffer) {
            super((byte) 0);
            this.c = byteBuffer;
            this.d = byteBuffer.duplicate().order(ByteOrder.LITTLE_ENDIAN);
            long a = avu.a(byteBuffer);
            this.e = a;
            this.f = a + byteBuffer.position();
            long limit = this.e + byteBuffer.limit();
            this.g = limit;
            this.h = limit - 10;
            this.i = this.f;
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, int i2) throws IOException {
            b((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(int i, int i2) throws IOException {
            a(i, 0);
            a(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void c(int i, int i2) throws IOException {
            a(i, 0);
            b(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void e(int i, int i2) throws IOException {
            a(i, 5);
            d(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, long j) throws IOException {
            a(i, 0);
            a(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void c(int i, long j) throws IOException {
            a(i, 1);
            c(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, boolean z) throws IOException {
            a(i, 0);
            a(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, String str) throws IOException {
            a(i, 2);
            a(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, art artVar) throws IOException {
            a(i, 2);
            a(artVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, aui auiVar) throws IOException {
            a(i, 2);
            a(auiVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, aui auiVar, aux auxVar) throws IOException {
            a(i, 2);
            a(auiVar, auxVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(int i, aui auiVar) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, auiVar);
            a(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(int i, art artVar) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, artVar);
            a(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(aui auiVar) throws IOException {
            b(auiVar.o());
            auiVar.a(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        final void a(aui auiVar, aux auxVar) throws IOException {
            arj arjVar = (arj) auiVar;
            int j = arjVar.j();
            if (j == -1) {
                j = auxVar.b(arjVar);
                arjVar.c(j);
            }
            b(j);
            auxVar.a((aux) auiVar, (awm) this.b);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(byte b) throws IOException {
            long j = this.i;
            if (j >= this.g) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.i), Long.valueOf(this.g), 1));
            }
            this.i = 1 + j;
            avu.a(j, b);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(art artVar) throws IOException {
            b(artVar.a());
            artVar.a(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(byte[] bArr, int i) throws IOException {
            b(i);
            b(bArr, 0, i);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i) throws IOException {
            if (i >= 0) {
                b(i);
            } else {
                a(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(int i) throws IOException {
            if (this.i <= this.h) {
                while ((i & (-128)) != 0) {
                    long j = this.i;
                    this.i = j + 1;
                    avu.a(j, (byte) ((i & 127) | 128));
                    i >>>= 7;
                }
                long j2 = this.i;
                this.i = 1 + j2;
                avu.a(j2, (byte) i);
                return;
            }
            while (true) {
                long j3 = this.i;
                if (j3 >= this.g) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.i), Long.valueOf(this.g), 1));
                }
                if ((i & (-128)) == 0) {
                    this.i = 1 + j3;
                    avu.a(j3, (byte) i);
                    return;
                }
                this.i = j3 + 1;
                avu.a(j3, (byte) ((i & 127) | 128));
                i >>>= 7;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void d(int i) throws IOException {
            this.d.putInt((int) (this.i - this.e), i);
            this.i += 4;
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(long j) throws IOException {
            if (this.i <= this.h) {
                while ((j & (-128)) != 0) {
                    long j2 = this.i;
                    this.i = j2 + 1;
                    avu.a(j2, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                long j3 = this.i;
                this.i = 1 + j3;
                avu.a(j3, (byte) j);
                return;
            }
            while (true) {
                long j4 = this.i;
                if (j4 >= this.g) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.i), Long.valueOf(this.g), 1));
                }
                if ((j & (-128)) == 0) {
                    this.i = 1 + j4;
                    avu.a(j4, (byte) j);
                    return;
                }
                this.i = j4 + 1;
                avu.a(j4, (byte) ((((int) j) & 127) | 128));
                j >>>= 7;
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void c(long j) throws IOException {
            this.d.putLong((int) (this.i - this.e), j);
            this.i += 8;
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(byte[] bArr, int i, int i2) throws IOException {
            if (bArr != null && i >= 0 && i2 >= 0 && bArr.length - i2 >= i) {
                long j = i2;
                long j2 = this.i;
                if (this.g - j >= j2) {
                    avu.a(bArr, i, j2, j);
                    this.i += j;
                    return;
                }
            }
            if (bArr == null) {
                throw new NullPointerException("value");
            }
            throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Long.valueOf(this.i), Long.valueOf(this.g), Integer.valueOf(i2)));
        }

        @Override // defpackage.arq
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            b(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(String str) throws IOException {
            long j = this.i;
            try {
                int n = n(str.length() * 3);
                int n2 = n(str.length());
                if (n2 == n) {
                    int i = ((int) (this.i - this.e)) + n2;
                    this.d.position(i);
                    avx.a(str, this.d);
                    int position = this.d.position() - i;
                    b(position);
                    this.i += position;
                    return;
                }
                int a = avx.a(str);
                b(a);
                g(this.i);
                avx.a(str, this.d);
                this.i += a;
            } catch (awb e) {
                this.i = j;
                g(j);
                a(str, e);
            } catch (IllegalArgumentException e2) {
                throw new zzb(e2);
            } catch (IndexOutOfBoundsException e3) {
                throw new zzb(e3);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void h() {
            this.c.position((int) (this.i - this.e));
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final int i() {
            return (int) (this.g - this.i);
        }

        private final void g(long j) {
            this.d.position((int) (j - this.e));
        }
    }

    /* loaded from: classes.dex */
    static class a extends zzee {
        final int c;
        int d;
        private final byte[] e;
        private final int f;

        a(byte[] bArr, int i, int i2) {
            super((byte) 0);
            if (bArr == null) {
                throw new NullPointerException("buffer");
            }
            int i3 = i + i2;
            if ((i | i2 | (bArr.length - i3)) < 0) {
                throw new IllegalArgumentException(String.format("Array range is invalid. Buffer.length=%d, offset=%d, length=%d", Integer.valueOf(bArr.length), Integer.valueOf(i), Integer.valueOf(i2)));
            }
            this.e = bArr;
            this.c = i;
            this.d = i;
            this.f = i3;
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public void h() {
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, int i2) throws IOException {
            b((i << 3) | i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(int i, int i2) throws IOException {
            a(i, 0);
            a(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void c(int i, int i2) throws IOException {
            a(i, 0);
            b(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void e(int i, int i2) throws IOException {
            a(i, 5);
            d(i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, long j) throws IOException {
            a(i, 0);
            a(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void c(int i, long j) throws IOException {
            a(i, 1);
            c(j);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, boolean z) throws IOException {
            a(i, 0);
            a(z ? (byte) 1 : (byte) 0);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, String str) throws IOException {
            a(i, 2);
            a(str);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, art artVar) throws IOException {
            a(i, 2);
            a(artVar);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(art artVar) throws IOException {
            b(artVar.a());
            artVar.a(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(byte[] bArr, int i) throws IOException {
            b(i);
            b(bArr, 0, i);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, aui auiVar) throws IOException {
            a(i, 2);
            a(auiVar);
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i, aui auiVar, aux auxVar) throws IOException {
            a(i, 2);
            arj arjVar = (arj) auiVar;
            int j = arjVar.j();
            if (j == -1) {
                j = auxVar.b(arjVar);
                arjVar.c(j);
            }
            b(j);
            auxVar.a((aux) auiVar, (awm) this.b);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(int i, aui auiVar) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, auiVar);
            a(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(int i, art artVar) throws IOException {
            a(1, 3);
            c(2, i);
            a(3, artVar);
            a(1, 4);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(aui auiVar) throws IOException {
            b(auiVar.o());
            auiVar.a(this);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        final void a(aui auiVar, aux auxVar) throws IOException {
            arj arjVar = (arj) auiVar;
            int j = arjVar.j();
            if (j == -1) {
                j = auxVar.b(arjVar);
                arjVar.c(j);
            }
            b(j);
            auxVar.a((aux) auiVar, (awm) this.b);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(byte b) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.d;
                this.d = i + 1;
                bArr[i] = b;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(int i) throws IOException {
            if (i >= 0) {
                b(i);
            } else {
                a(i);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void d(int i) throws IOException {
            try {
                byte[] bArr = this.e;
                int i2 = this.d;
                int i3 = i2 + 1;
                this.d = i3;
                bArr[i2] = (byte) i;
                byte[] bArr2 = this.e;
                int i4 = i3 + 1;
                this.d = i4;
                bArr2[i3] = (byte) (i >> 8);
                byte[] bArr3 = this.e;
                int i5 = i4 + 1;
                this.d = i5;
                bArr3[i4] = (byte) (i >> 16);
                byte[] bArr4 = this.e;
                this.d = i5 + 1;
                bArr4[i5] = (byte) (i >>> 24);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void c(long j) throws IOException {
            try {
                byte[] bArr = this.e;
                int i = this.d;
                int i2 = i + 1;
                this.d = i2;
                bArr[i] = (byte) j;
                byte[] bArr2 = this.e;
                int i3 = i2 + 1;
                this.d = i3;
                bArr2[i2] = (byte) (j >> 8);
                byte[] bArr3 = this.e;
                int i4 = i3 + 1;
                this.d = i4;
                bArr3[i3] = (byte) (j >> 16);
                byte[] bArr4 = this.e;
                int i5 = i4 + 1;
                this.d = i5;
                bArr4[i4] = (byte) (j >> 24);
                byte[] bArr5 = this.e;
                int i6 = i5 + 1;
                this.d = i6;
                bArr5[i5] = (byte) (j >> 32);
                byte[] bArr6 = this.e;
                int i7 = i6 + 1;
                this.d = i7;
                bArr6[i6] = (byte) (j >> 40);
                byte[] bArr7 = this.e;
                int i8 = i7 + 1;
                this.d = i8;
                bArr7[i7] = (byte) (j >> 48);
                byte[] bArr8 = this.e;
                this.d = i8 + 1;
                bArr8[i8] = (byte) (j >> 56);
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(byte[] bArr, int i, int i2) throws IOException {
            try {
                System.arraycopy(bArr, i, this.e, this.d, i2);
                this.d += i2;
            } catch (IndexOutOfBoundsException e) {
                throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), Integer.valueOf(i2)), e);
            }
        }

        @Override // defpackage.arq
        public final void a(byte[] bArr, int i, int i2) throws IOException {
            b(bArr, i, i2);
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(String str) throws IOException {
            int i = this.d;
            try {
                int n = n(str.length() * 3);
                int n2 = n(str.length());
                if (n2 == n) {
                    int i2 = i + n2;
                    this.d = i2;
                    int a = avx.a(str, this.e, i2, i());
                    this.d = i;
                    b((a - i) - n2);
                    this.d = a;
                    return;
                }
                b(avx.a(str));
                this.d = avx.a(str, this.e, this.d, i());
            } catch (awb e) {
                this.d = i;
                a(str, e);
            } catch (IndexOutOfBoundsException e2) {
                throw new zzb(e2);
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final int i() {
            return this.f - this.d;
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void b(int i) throws IOException {
            if (!zzee.a || arm.a() || i() < 5) {
                while ((i & (-128)) != 0) {
                    try {
                        byte[] bArr = this.e;
                        int i2 = this.d;
                        this.d = i2 + 1;
                        bArr[i2] = (byte) ((i & 127) | 128);
                        i >>>= 7;
                    } catch (IndexOutOfBoundsException e) {
                        throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e);
                    }
                }
                byte[] bArr2 = this.e;
                int i3 = this.d;
                this.d = i3 + 1;
                bArr2[i3] = (byte) i;
            } else if ((i & (-128)) == 0) {
                byte[] bArr3 = this.e;
                int i4 = this.d;
                this.d = i4 + 1;
                avu.a(bArr3, i4, (byte) i);
            } else {
                byte[] bArr4 = this.e;
                int i5 = this.d;
                this.d = i5 + 1;
                avu.a(bArr4, i5, (byte) (i | 128));
                int i6 = i >>> 7;
                if ((i6 & (-128)) == 0) {
                    byte[] bArr5 = this.e;
                    int i7 = this.d;
                    this.d = i7 + 1;
                    avu.a(bArr5, i7, (byte) i6);
                    return;
                }
                byte[] bArr6 = this.e;
                int i8 = this.d;
                this.d = i8 + 1;
                avu.a(bArr6, i8, (byte) (i6 | 128));
                int i9 = i6 >>> 7;
                if ((i9 & (-128)) == 0) {
                    byte[] bArr7 = this.e;
                    int i10 = this.d;
                    this.d = i10 + 1;
                    avu.a(bArr7, i10, (byte) i9);
                    return;
                }
                byte[] bArr8 = this.e;
                int i11 = this.d;
                this.d = i11 + 1;
                avu.a(bArr8, i11, (byte) (i9 | 128));
                int i12 = i9 >>> 7;
                if ((i12 & (-128)) == 0) {
                    byte[] bArr9 = this.e;
                    int i13 = this.d;
                    this.d = i13 + 1;
                    avu.a(bArr9, i13, (byte) i12);
                    return;
                }
                byte[] bArr10 = this.e;
                int i14 = this.d;
                this.d = i14 + 1;
                avu.a(bArr10, i14, (byte) (i12 | 128));
                byte[] bArr11 = this.e;
                int i15 = this.d;
                this.d = i15 + 1;
                avu.a(bArr11, i15, (byte) (i12 >>> 7));
            }
        }

        @Override // com.google.android.gms.internal.measurement.zzee
        public final void a(long j) throws IOException {
            if (zzee.a && i() >= 10) {
                while ((j & (-128)) != 0) {
                    byte[] bArr = this.e;
                    int i = this.d;
                    this.d = i + 1;
                    avu.a(bArr, i, (byte) ((((int) j) & 127) | 128));
                    j >>>= 7;
                }
                byte[] bArr2 = this.e;
                int i2 = this.d;
                this.d = i2 + 1;
                avu.a(bArr2, i2, (byte) j);
                return;
            }
            while ((j & (-128)) != 0) {
                try {
                    byte[] bArr3 = this.e;
                    int i3 = this.d;
                    this.d = i3 + 1;
                    bArr3[i3] = (byte) ((((int) j) & 127) | 128);
                    j >>>= 7;
                } catch (IndexOutOfBoundsException e) {
                    throw new zzb(String.format("Pos: %d, limit: %d, len: %d", Integer.valueOf(this.d), Integer.valueOf(this.f), 1), e);
                }
            }
            byte[] bArr4 = this.e;
            int i4 = this.d;
            this.d = i4 + 1;
            bArr4[i4] = (byte) j;
        }
    }

    private zzee() {
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

    public final void a(int i, double d2) throws IOException {
        c(i, Double.doubleToRawLongBits(d2));
    }

    public final void c(int i) throws IOException {
        b(r(i));
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
            i = avx.a(str);
        } catch (awb unused) {
            i = str.getBytes(atb.a).length;
        }
        return n(i) + i;
    }

    public static int a(atn atnVar) {
        int b2 = atnVar.b();
        return n(b2) + b2;
    }

    public static int b(art artVar) {
        int a2 = artVar.a();
        return n(a2) + a2;
    }

    public static int b(byte[] bArr) {
        int length = bArr.length;
        return n(length) + length;
    }

    public static int b(aui auiVar) {
        int o = auiVar.o();
        return n(o) + o;
    }

    public static int b(aui auiVar, aux auxVar) {
        arj arjVar = (arj) auiVar;
        int j = arjVar.j();
        if (j == -1) {
            j = auxVar.b(arjVar);
            arjVar.c(j);
        }
        return n(j) + j;
    }

    public final void j() {
        if (i() == 0) {
            return;
        }
        throw new IllegalStateException("Did not write as much data as expected.");
    }

    final void a(String str, awb awbVar) throws IOException {
        c.logp(Level.WARNING, "com.google.protobuf.CodedOutputStream", "inefficientWriteStringNoTag", "Converting ill-formed UTF-16. Your Protocol Buffer will not round trip correctly!", (Throwable) awbVar);
        byte[] bytes = str.getBytes(atb.a);
        try {
            b(bytes.length);
            a(bytes, 0, bytes.length);
        } catch (zzb e) {
            throw e;
        } catch (IndexOutOfBoundsException e2) {
            throw new zzb(e2);
        }
    }

    @Deprecated
    public static int c(aui auiVar) {
        return auiVar.o();
    }

    @Deprecated
    public static int q(int i) {
        return n(i);
    }

    /* synthetic */ zzee(byte b2) {
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

    public static int c(int i, art artVar) {
        int n = n(i << 3);
        int a2 = artVar.a();
        return n + n(a2) + a2;
    }

    public static int a(int i, atn atnVar) {
        int n = n(i << 3);
        int b2 = atnVar.b();
        return n + n(b2) + b2;
    }

    public static int c(int i, aui auiVar) {
        return n(i << 3) + b(auiVar);
    }

    public static int b(int i, aui auiVar, aux auxVar) {
        return n(i << 3) + b(auiVar, auxVar);
    }

    public static int d(int i, aui auiVar) {
        return (n(8) << 1) + g(2, i) + c(3, auiVar);
    }

    public static int d(int i, art artVar) {
        return (n(8) << 1) + g(2, i) + c(3, artVar);
    }

    public static int b(int i, atn atnVar) {
        return (n(8) << 1) + g(2, i) + a(3, atnVar);
    }

    @Deprecated
    public static int c(int i, aui auiVar, aux auxVar) {
        int n = n(i << 3) << 1;
        arj arjVar = (arj) auiVar;
        int j = arjVar.j();
        if (j == -1) {
            j = auxVar.b(arjVar);
            arjVar.c(j);
        }
        return n + j;
    }
}
