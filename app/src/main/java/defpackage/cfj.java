package defpackage;

import defpackage.bya;
import java.io.BufferedInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.security.GeneralSecurityException;

/* renamed from: cfj  reason: default package */
/* loaded from: classes2.dex */
final class cfj extends InputStream {
    boolean a = false;
    InputStream b = null;
    InputStream c;
    bya<byd> d;
    byte[] e;

    @Override // java.io.InputStream
    public final boolean markSupported() {
        return false;
    }

    public cfj(bya<byd> byaVar, InputStream inputStream, byte[] bArr) {
        this.d = byaVar;
        if (inputStream.markSupported()) {
            this.c = inputStream;
        } else {
            this.c = new BufferedInputStream(inputStream);
        }
        this.c.mark(Integer.MAX_VALUE);
        this.e = (byte[]) bArr.clone();
    }

    @Override // java.io.InputStream
    public final synchronized int available() throws IOException {
        if (this.b == null) {
            return 0;
        }
        return this.b.available();
    }

    @Override // java.io.InputStream
    public final synchronized int read() throws IOException {
        byte[] bArr = new byte[1];
        if (read(bArr) == 1) {
            return bArr[0];
        }
        return -1;
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr) throws IOException {
        return read(bArr, 0, bArr.length);
    }

    @Override // java.io.InputStream
    public final synchronized int read(byte[] bArr, int i, int i2) throws IOException {
        if (i2 == 0) {
            return 0;
        }
        if (this.b != null) {
            return this.b.read(bArr, i, i2);
        } else if (this.a) {
            throw new IOException("No matching key found for the ciphertext in the stream.");
        } else {
            this.a = true;
            for (bya.a<byd> aVar : this.d.a(bxn.a)) {
                try {
                    try {
                        InputStream a = aVar.a.a(this.c, this.e);
                        int read = a.read(bArr, i, i2);
                        if (read == 0) {
                            throw new IOException("Could not read bytes from the ciphertext stream");
                        }
                        this.b = a;
                        this.c.mark(0);
                        return read;
                    } catch (IOException unused) {
                        this.c.reset();
                    }
                } catch (GeneralSecurityException unused2) {
                    this.c.reset();
                }
            }
            throw new IOException("No matching key found for the ciphertext in the stream.");
        }
    }

    @Override // java.io.InputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        this.c.close();
    }
}
