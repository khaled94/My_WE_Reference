package defpackage;

import androidx.core.location.LocationRequestCompat;
import java.io.EOFException;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: eei  reason: default package */
/* loaded from: classes2.dex */
public final class eei implements edw {
    public final edu a = new edu();
    public final een b;
    boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eei(een eenVar) {
        if (eenVar == null) {
            throw new NullPointerException("source == null");
        }
        this.b = eenVar;
    }

    @Override // defpackage.edw
    public final edu b() {
        return this.a;
    }

    @Override // defpackage.edw
    public final edu c() {
        return this.a;
    }

    @Override // defpackage.een
    public final long a(edu eduVar, long j) throws IOException {
        if (eduVar != null) {
            if (j < 0) {
                throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
            }
            if (this.c) {
                throw new IllegalStateException("closed");
            }
            if (this.a.b == 0 && this.b.a(this.a, 8192L) == -1) {
                return -1L;
            }
            return this.a.a(eduVar, Math.min(j, this.a.b));
        }
        throw new IllegalArgumentException("sink == null");
    }

    @Override // defpackage.edw
    public final boolean d() throws IOException {
        if (!this.c) {
            return this.a.d() && this.b.a(this.a, 8192L) == -1;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.edw
    public final void a(long j) throws IOException {
        if (b(j)) {
            return;
        }
        throw new EOFException();
    }

    @Override // defpackage.edw
    public final boolean b(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("byteCount < 0: ".concat(String.valueOf(j)));
        }
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        while (this.a.b < j) {
            if (this.b.a(this.a, 8192L) == -1) {
                return false;
            }
        }
        return true;
    }

    @Override // defpackage.edw
    public final byte g() throws IOException {
        a(1L);
        return this.a.g();
    }

    @Override // defpackage.edw
    public final edx d(long j) throws IOException {
        a(j);
        return this.a.d(j);
    }

    @Override // defpackage.edw
    public final int a(eee eeeVar) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        do {
            int a = this.a.a(eeeVar, true);
            if (a == -1) {
                return -1;
            }
            if (a != -2) {
                this.a.h(eeeVar.a[a].g());
                return a;
            }
        } while (this.b.a(this.a, 8192L) != -1);
        return -1;
    }

    @Override // defpackage.edw
    public final byte[] g(long j) throws IOException {
        a(j);
        return this.a.g(j);
    }

    @Override // defpackage.edw
    public final void a(byte[] bArr) throws IOException {
        try {
            a(bArr.length);
            this.a.a(bArr);
        } catch (EOFException e) {
            int i = 0;
            while (this.a.b > 0) {
                edu eduVar = this.a;
                int a = eduVar.a(bArr, i, (int) eduVar.b);
                if (a == -1) {
                    throw new AssertionError();
                }
                i += a;
            }
            throw e;
        }
    }

    @Override // java.nio.channels.ReadableByteChannel
    public final int read(ByteBuffer byteBuffer) throws IOException {
        if (this.a.b == 0 && this.b.a(this.a, 8192L) == -1) {
            return -1;
        }
        return this.a.read(byteBuffer);
    }

    @Override // defpackage.edw
    public final long a(eem eemVar) throws IOException {
        long j = 0;
        while (this.b.a(this.a, 8192L) != -1) {
            long f = this.a.f();
            if (f > 0) {
                j += f;
                eemVar.a_(this.a, f);
            }
        }
        if (this.a.b > 0) {
            long j2 = j + this.a.b;
            edu eduVar = this.a;
            eemVar.a_(eduVar, eduVar.b);
            return j2;
        }
        return j;
    }

    @Override // defpackage.edw
    public final String o() throws IOException {
        return e(LocationRequestCompat.PASSIVE_INTERVAL);
    }

    @Override // defpackage.edw
    public final String e(long j) throws IOException {
        if (j < 0) {
            throw new IllegalArgumentException("limit < 0: ".concat(String.valueOf(j)));
        }
        long j2 = j == LocationRequestCompat.PASSIVE_INTERVAL ? Long.MAX_VALUE : j + 1;
        long a = a((byte) 10, 0L, j2);
        if (a != -1) {
            return this.a.f(a);
        }
        if (j2 < LocationRequestCompat.PASSIVE_INTERVAL && b(j2) && this.a.c(j2 - 1) == 13 && b(1 + j2) && this.a.c(j2) == 10) {
            return this.a.f(j2);
        }
        edu eduVar = new edu();
        edu eduVar2 = this.a;
        eduVar2.a(eduVar, 0L, Math.min(32L, eduVar2.b));
        throw new EOFException("\\n not found: limit=" + Math.min(this.a.b, j) + " content=" + eduVar.m().e() + (char) 8230);
    }

    @Override // defpackage.edw
    public final short h() throws IOException {
        a(2L);
        return this.a.h();
    }

    @Override // defpackage.edw
    public final short j() throws IOException {
        a(2L);
        return eep.a(this.a.h());
    }

    @Override // defpackage.edw
    public final int i() throws IOException {
        a(4L);
        return this.a.i();
    }

    @Override // defpackage.edw
    public final int k() throws IOException {
        a(4L);
        return eep.a(this.a.i());
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0032, code lost:
        if (r1 == 0) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0049, code lost:
        throw new java.lang.NumberFormatException(java.lang.String.format("Expected leading [0-9a-fA-F] character but was %#x", java.lang.Byte.valueOf(r3)));
     */
    @Override // defpackage.edw
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long l() throws java.io.IOException {
        /*
            r6 = this;
            r0 = 1
            r6.a(r0)
            r0 = 0
            r1 = 0
        L7:
            int r2 = r1 + 1
            long r3 = (long) r2
            boolean r3 = r6.b(r3)
            if (r3 == 0) goto L4a
            edu r3 = r6.a
            long r4 = (long) r1
            byte r3 = r3.c(r4)
            r4 = 48
            if (r3 < r4) goto L1f
            r4 = 57
            if (r3 <= r4) goto L30
        L1f:
            r4 = 97
            if (r3 < r4) goto L27
            r4 = 102(0x66, float:1.43E-43)
            if (r3 <= r4) goto L30
        L27:
            r4 = 65
            if (r3 < r4) goto L32
            r4 = 70
            if (r3 <= r4) goto L30
            goto L32
        L30:
            r1 = r2
            goto L7
        L32:
            if (r1 == 0) goto L35
            goto L4a
        L35:
            java.lang.NumberFormatException r1 = new java.lang.NumberFormatException
            r2 = 1
            java.lang.Object[] r2 = new java.lang.Object[r2]
            java.lang.Byte r3 = java.lang.Byte.valueOf(r3)
            r2[r0] = r3
            java.lang.String r0 = "Expected leading [0-9a-fA-F] character but was %#x"
            java.lang.String r0 = java.lang.String.format(r0, r2)
            r1.<init>(r0)
            throw r1
        L4a:
            edu r0 = r6.a
            long r0 = r0.l()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.eei.l():long");
    }

    @Override // defpackage.edw
    public final void h(long j) throws IOException {
        if (!this.c) {
            while (j > 0) {
                if (this.a.b == 0 && this.b.a(this.a, 8192L) == -1) {
                    throw new EOFException();
                }
                long min = Math.min(j, this.a.b);
                this.a.h(min);
                j -= min;
            }
            return;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.edw
    public final long r() throws IOException {
        return a((byte) 0, 0L, LocationRequestCompat.PASSIVE_INTERVAL);
    }

    private long a(byte b, long j, long j2) throws IOException {
        if (!this.c) {
            if (j2 < 0) {
                throw new IllegalArgumentException(String.format("fromIndex=%s toIndex=%s", 0L, Long.valueOf(j2)));
            }
            while (j < j2) {
                long a = this.a.a(b, j, j2);
                if (a == -1) {
                    long j3 = this.a.b;
                    if (j3 >= j2 || this.b.a(this.a, 8192L) == -1) {
                        break;
                    }
                    j = Math.max(j, j3);
                } else {
                    return a;
                }
            }
            return -1L;
        }
        throw new IllegalStateException("closed");
    }

    @Override // defpackage.edw
    public final InputStream e() {
        return new InputStream() { // from class: eei.1
            @Override // java.io.InputStream
            public final int read() throws IOException {
                if (eei.this.c) {
                    throw new IOException("closed");
                }
                if (eei.this.a.b != 0 || eei.this.b.a(eei.this.a, 8192L) != -1) {
                    return eei.this.a.g() & 255;
                }
                return -1;
            }

            @Override // java.io.InputStream
            public final int read(byte[] bArr, int i, int i2) throws IOException {
                if (eei.this.c) {
                    throw new IOException("closed");
                }
                eep.a(bArr.length, i, i2);
                if (eei.this.a.b != 0 || eei.this.b.a(eei.this.a, 8192L) != -1) {
                    return eei.this.a.a(bArr, i, i2);
                }
                return -1;
            }

            @Override // java.io.InputStream
            public final int available() throws IOException {
                if (eei.this.c) {
                    throw new IOException("closed");
                }
                return (int) Math.min(eei.this.a.b, 2147483647L);
            }

            @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                eei.this.close();
            }

            public final String toString() {
                return eei.this + ".inputStream()";
            }
        };
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.een, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        this.c = true;
        this.b.close();
        this.a.q();
    }

    @Override // defpackage.een
    public final eeo a() {
        return this.b.a();
    }

    public final String toString() {
        return "buffer(" + this.b + ")";
    }
}
