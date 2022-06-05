package defpackage;

import java.io.FilterInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;
import java.util.Arrays;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cgp  reason: default package */
/* loaded from: classes2.dex */
public final class cgp extends FilterInputStream {
    private final ByteBuffer a;
    private final ByteBuffer b;
    private final int c;
    private final byte[] h;
    private final cgn j;
    private final int k;
    private final int l;
    private boolean d = false;
    private boolean e = false;
    private boolean f = false;
    private int i = 0;
    private boolean g = false;

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public cgp(cgh cghVar, InputStream inputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        super(inputStream);
        this.j = cghVar.e();
        this.c = cghVar.c();
        this.h = Arrays.copyOf(bArr, bArr.length);
        int a = cghVar.a();
        this.k = a;
        ByteBuffer allocate = ByteBuffer.allocate(a + 1);
        this.a = allocate;
        allocate.limit(0);
        this.l = this.k - cghVar.d();
        ByteBuffer allocate2 = ByteBuffer.allocate(cghVar.b() + 16);
        this.b = allocate2;
        allocate2.limit(0);
    }

    private void a() throws IOException {
        if (this.d) {
            b();
            throw new IOException("Decryption failed.");
        }
        ByteBuffer allocate = ByteBuffer.allocate(this.c);
        while (allocate.remaining() > 0) {
            int read = this.in.read(allocate.array(), allocate.position(), allocate.remaining());
            if (read == -1) {
                b();
                throw new IOException("Ciphertext is too short");
            } else if (read == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            } else {
                allocate.position(allocate.position() + read);
            }
        }
        allocate.flip();
        try {
            this.j.a(allocate, this.h);
            this.d = true;
        } catch (GeneralSecurityException e) {
            throw new IOException(e);
        }
    }

    private void b() {
        this.g = true;
        this.b.limit(0);
    }

    private void c() throws IOException {
        while (!this.e && this.a.remaining() > 0) {
            int read = this.in.read(this.a.array(), this.a.position(), this.a.remaining());
            if (read > 0) {
                ByteBuffer byteBuffer = this.a;
                byteBuffer.position(byteBuffer.position() + read);
            } else if (read == -1) {
                this.e = true;
            } else if (read == 0) {
                throw new IOException("Could not read bytes from the ciphertext stream");
            }
        }
        byte b = 0;
        if (!this.e) {
            ByteBuffer byteBuffer2 = this.a;
            b = byteBuffer2.get(byteBuffer2.position() - 1);
            ByteBuffer byteBuffer3 = this.a;
            byteBuffer3.position(byteBuffer3.position() - 1);
        }
        this.a.flip();
        this.b.clear();
        try {
            this.j.a(this.a, this.i, this.e, this.b);
            this.i++;
            this.b.flip();
            this.a.clear();
            if (this.e) {
                return;
            }
            this.a.clear();
            this.a.limit(this.k + 1);
            this.a.put(b);
        } catch (GeneralSecurityException e) {
            b();
            throw new IOException(e.getMessage() + "\n" + toString() + "\nsegmentNr:" + this.i + " endOfCiphertext:" + this.e, e);
        }
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read() throws IOException {
        byte[] bArr = new byte[1];
        int read = read(bArr, 0, 1);
        if (read == 1) {
            return bArr[0] & 255;
        }
        if (read != -1) {
            throw new IOException("Reading failed");
        }
        return read;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        if (this.g) {
            throw new IOException("Decryption failed.");
        }
        if (!this.d) {
            a();
            this.a.clear();
            this.a.limit(this.l + 1);
        }
        if (this.f) {
            return -1;
        }
        int i3 = 0;
        while (true) {
            if (i3 >= i2) {
                break;
            }
            if (this.b.remaining() == 0) {
                if (this.e) {
                    this.f = true;
                    break;
                }
                c();
            }
            int min = Math.min(this.b.remaining(), i2 - i3);
            this.b.get(bArr, i3 + i, min);
            i3 += min;
        }
        if (i3 == 0 && this.f) {
            return -1;
        }
        return i3;
    }

    @Override // java.io.FilterInputStream, java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        super.close();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized int available() {
        return this.b.remaining();
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final synchronized void mark(int i) {
    }

    @Override // java.io.FilterInputStream, java.io.InputStream
    public final long skip(long j) throws IOException {
        int read;
        long j2 = this.k;
        if (j <= 0) {
            return 0L;
        }
        int min = (int) Math.min(j2, j);
        byte[] bArr = new byte[min];
        long j3 = j;
        while (j3 > 0 && (read = read(bArr, 0, (int) Math.min(min, j3))) > 0) {
            j3 -= read;
        }
        return j - j3;
    }

    public final synchronized String toString() {
        return "StreamingAeadDecryptingStream\nsegmentNr:" + this.i + "\nciphertextSegmentSize:" + this.k + "\nheaderRead:" + this.d + "\nendOfCiphertext:" + this.e + "\nendOfPlaintext:" + this.f + "\ndecryptionErrorOccured:" + this.g + "\nciphertextSgement position:" + this.a.position() + " limit:" + this.a.limit() + "\nplaintextSegment position:" + this.b.position() + " limit:" + this.b.limit();
    }
}
