package defpackage;

import java.io.IOException;
import java.io.OutputStream;

/* renamed from: ct  reason: default package */
/* loaded from: classes2.dex */
public final class ct extends OutputStream {
    private final OutputStream a;
    private byte[] b;
    private ek c;
    private int d;

    public ct(OutputStream outputStream, ek ekVar) {
        this(outputStream, ekVar, (byte) 0);
    }

    private ct(OutputStream outputStream, ek ekVar, byte b) {
        this.a = outputStream;
        this.c = ekVar;
        this.b = (byte[]) ekVar.a(65536, byte[].class);
    }

    @Override // java.io.OutputStream
    public final void write(int i) throws IOException {
        byte[] bArr = this.b;
        int i2 = this.d;
        this.d = i2 + 1;
        bArr[i2] = (byte) i;
        b();
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr) throws IOException {
        write(bArr, 0, bArr.length);
    }

    @Override // java.io.OutputStream
    public final void write(byte[] bArr, int i, int i2) throws IOException {
        int i3 = 0;
        do {
            int i4 = i2 - i3;
            int i5 = i + i3;
            if (this.d == 0 && i4 >= this.b.length) {
                this.a.write(bArr, i5, i4);
                return;
            }
            int min = Math.min(i4, this.b.length - this.d);
            System.arraycopy(bArr, i5, this.b, this.d, min);
            this.d += min;
            i3 += min;
            b();
        } while (i3 < i2);
    }

    @Override // java.io.OutputStream, java.io.Flushable
    public final void flush() throws IOException {
        a();
        this.a.flush();
    }

    private void a() throws IOException {
        int i = this.d;
        if (i > 0) {
            this.a.write(this.b, 0, i);
            this.d = 0;
        }
    }

    private void b() throws IOException {
        if (this.d == this.b.length) {
            a();
        }
    }

    /* JADX WARN: Finally extract failed */
    @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        try {
            flush();
            this.a.close();
            byte[] bArr = this.b;
            if (bArr == null) {
                return;
            }
            this.c.a((ek) bArr);
            this.b = null;
        } catch (Throwable th) {
            this.a.close();
            throw th;
        }
    }
}
