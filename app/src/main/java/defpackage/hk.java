package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;

/* renamed from: hk  reason: default package */
/* loaded from: classes2.dex */
public final class hk extends FilterInputStream {
    private volatile byte[] a;
    private int b;
    private int c;
    private int d;
    private int e;
    private final ek f;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return true;
    }

    public hk(InputStream inputStream, ek ekVar) {
        this(inputStream, ekVar, (byte) 0);
    }

    private hk(InputStream inputStream, ek ekVar, byte b) {
        super(inputStream);
        this.d = -1;
        this.f = ekVar;
        this.a = (byte[]) ekVar.a(65536, byte[].class);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() throws IOException {
        InputStream inputStream;
        inputStream = this.in;
        if (this.a == null || inputStream == null) {
            throw c();
        }
        return (this.b - this.e) + inputStream.available();
    }

    private static IOException c() throws IOException {
        throw new IOException("BufferedInputStream is closed");
    }

    public final synchronized void a() {
        this.c = this.a.length;
    }

    public final synchronized void b() {
        if (this.a != null) {
            this.f.a((ek) this.a);
            this.a = null;
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.a != null) {
            this.f.a((ek) this.a);
            this.a = null;
        }
        InputStream inputStream = this.in;
        this.in = null;
        if (inputStream != null) {
            inputStream.close();
        }
    }

    private int a(InputStream inputStream, byte[] bArr) throws IOException {
        int i = this.d;
        if (i != -1) {
            int i2 = this.e - i;
            int i3 = this.c;
            if (i2 < i3) {
                if (i == 0 && i3 > bArr.length && this.b == bArr.length) {
                    int length = bArr.length * 2;
                    if (length <= i3) {
                        i3 = length;
                    }
                    byte[] bArr2 = (byte[]) this.f.a(i3, byte[].class);
                    System.arraycopy(bArr, 0, bArr2, 0, bArr.length);
                    this.a = bArr2;
                    this.f.a((ek) bArr);
                    bArr = bArr2;
                } else {
                    int i4 = this.d;
                    if (i4 > 0) {
                        System.arraycopy(bArr, i4, bArr, 0, bArr.length - i4);
                    }
                }
                int i5 = this.e - this.d;
                this.e = i5;
                this.d = 0;
                this.b = 0;
                int read = inputStream.read(bArr, i5, bArr.length - i5);
                int i6 = this.e;
                if (read > 0) {
                    i6 += read;
                }
                this.b = i6;
                return read;
            }
        }
        int read2 = inputStream.read(bArr);
        if (read2 > 0) {
            this.d = -1;
            this.e = 0;
            this.b = read2;
        }
        return read2;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
        this.c = Math.max(this.c, i);
        this.d = this.e;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read() throws IOException {
        byte[] bArr = this.a;
        InputStream inputStream = this.in;
        if (bArr == null || inputStream == null) {
            throw c();
        }
        if (this.e >= this.b && a(inputStream, bArr) == -1) {
            return -1;
        }
        if (bArr != this.a && (bArr = this.a) == null) {
            throw c();
        }
        if (this.b - this.e <= 0) {
            return -1;
        }
        int i = this.e;
        this.e = i + 1;
        return bArr[i] & 255;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        int i3;
        int i4;
        byte[] bArr2 = this.a;
        if (bArr2 != null) {
            if (i2 == 0) {
                return 0;
            }
            InputStream inputStream = this.in;
            if (inputStream == null) {
                throw c();
            }
            if (this.e < this.b) {
                int i5 = this.b - this.e >= i2 ? i2 : this.b - this.e;
                System.arraycopy(bArr2, this.e, bArr, i, i5);
                this.e += i5;
                if (i5 == i2 || inputStream.available() == 0) {
                    return i5;
                }
                i += i5;
                i3 = i2 - i5;
            } else {
                i3 = i2;
            }
            while (true) {
                if (this.d == -1 && i3 >= bArr2.length) {
                    i4 = inputStream.read(bArr, i, i3);
                    if (i4 == -1) {
                        if (i3 != i2) {
                            return i2 - i3;
                        }
                        return -1;
                    }
                } else if (a(inputStream, bArr2) == -1) {
                    if (i3 != i2) {
                        return i2 - i3;
                    }
                    return -1;
                } else {
                    if (bArr2 != this.a && (bArr2 = this.a) == null) {
                        throw c();
                    }
                    i4 = this.b - this.e >= i3 ? i3 : this.b - this.e;
                    System.arraycopy(bArr2, this.e, bArr, i, i4);
                    this.e += i4;
                }
                i3 -= i4;
                if (i3 == 0) {
                    return i2;
                }
                if (inputStream.available() == 0) {
                    return i2 - i3;
                }
                i += i4;
            }
        } else {
            throw c();
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void reset() throws IOException {
        if (this.a == null) {
            throw new IOException("Stream is closed");
        }
        if (-1 == this.d) {
            throw new a("Mark has been invalidated, pos: " + this.e + " markLimit: " + this.c);
        }
        this.e = this.d;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized long skip(long j) throws IOException {
        if (j < 1) {
            return 0L;
        }
        byte[] bArr = this.a;
        if (bArr == null) {
            throw c();
        }
        InputStream inputStream = this.in;
        if (inputStream == null) {
            throw c();
        }
        if (this.b - this.e >= j) {
            this.e = (int) (this.e + j);
            return j;
        }
        long j2 = this.b - this.e;
        this.e = this.b;
        if (this.d != -1 && j <= this.c) {
            if (a(inputStream, bArr) == -1) {
                return j2;
            }
            if (this.b - this.e >= j - j2) {
                this.e = (int) ((this.e + j) - j2);
                return j;
            }
            long j3 = (j2 + this.b) - this.e;
            this.e = this.b;
            return j3;
        }
        long skip = inputStream.skip(j - j2);
        if (skip > 0) {
            this.d = -1;
        }
        return j2 + skip;
    }

    /* renamed from: hk$a */
    /* loaded from: classes2.dex */
    static class a extends IOException {
        a(String str) {
            super(str);
        }
    }
}
