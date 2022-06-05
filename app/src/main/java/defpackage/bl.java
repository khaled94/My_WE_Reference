package defpackage;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

/* renamed from: bl  reason: default package */
/* loaded from: classes2.dex */
public final class bl extends ByteArrayOutputStream {
    private final bb a;

    public bl(bb bbVar, int i) {
        this.a = bbVar;
        this.buf = bbVar.a(Math.max(i, 256));
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        this.a.a(this.buf);
        this.buf = null;
        super.close();
    }

    public final void finalize() {
        this.a.a(this.buf);
    }

    private void a(int i) {
        if (this.count + i <= this.buf.length) {
            return;
        }
        byte[] a = this.a.a((this.count + i) * 2);
        System.arraycopy(this.buf, 0, a, 0, this.count);
        this.a.a(this.buf);
        this.buf = a;
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(byte[] bArr, int i, int i2) {
        a(i2);
        super.write(bArr, i, i2);
    }

    @Override // java.io.ByteArrayOutputStream, java.io.OutputStream
    public final synchronized void write(int i) {
        a(1);
        super.write(i);
    }
}
