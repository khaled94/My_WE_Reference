package defpackage;

import java.io.FilterOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.nio.ByteBuffer;
import java.security.GeneralSecurityException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cgq  reason: default package */
/* loaded from: classes2.dex */
public final class cgq extends FilterOutputStream {
    ByteBuffer a;
    ByteBuffer b;
    boolean c = true;
    private cgo d;
    private int e;

    public cgq(cgh cghVar, OutputStream outputStream, byte[] bArr) throws GeneralSecurityException, IOException {
        super(outputStream);
        this.d = cghVar.a(bArr);
        int b = cghVar.b();
        this.e = b;
        this.a = ByteBuffer.allocate(b);
        this.b = ByteBuffer.allocate(cghVar.a());
        this.a.limit(this.e - cghVar.d());
        ByteBuffer a = this.d.a();
        byte[] bArr2 = new byte[a.remaining()];
        a.get(bArr2);
        this.out.write(bArr2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(int i) throws IOException {
        write(new byte[]{(byte) i});
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) throws IOException {
        if (!this.c) {
            throw new IOException("Trying to write to closed stream");
        }
        while (i2 > this.a.remaining()) {
            int remaining = this.a.remaining();
            ByteBuffer wrap = ByteBuffer.wrap(bArr, i, remaining);
            i += remaining;
            i2 -= remaining;
            try {
                this.a.flip();
                this.b.clear();
                this.d.a(this.a, wrap, this.b);
                this.b.flip();
                this.out.write(this.b.array(), this.b.position(), this.b.remaining());
                this.a.clear();
                this.a.limit(this.e);
            } catch (GeneralSecurityException e) {
                throw new IOException(e);
            }
        }
        this.a.put(bArr, i, i2);
    }

    @Override // java.io.FilterOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        if (!this.c) {
            return;
        }
        try {
            this.a.flip();
            this.b.clear();
            this.d.a(this.a, this.b);
            this.b.flip();
            this.out.write(this.b.array(), this.b.position(), this.b.remaining());
            this.c = false;
            super.close();
        } catch (GeneralSecurityException e) {
            throw new IOException("ptBuffer.remaining():" + this.a.remaining() + " ctBuffer.remaining():" + this.b.remaining(), e);
        }
    }
}
