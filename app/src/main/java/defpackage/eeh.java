package defpackage;

import java.io.IOException;
import java.nio.ByteBuffer;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: eeh  reason: default package */
/* loaded from: classes2.dex */
public final class eeh implements edv {
    public final edu a = new edu();
    public final eem b;
    boolean c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public eeh(eem eemVar) {
        if (eemVar == null) {
            throw new NullPointerException("sink == null");
        }
        this.b = eemVar;
    }

    @Override // defpackage.edv, defpackage.edw
    public final edu b() {
        return this.a;
    }

    @Override // defpackage.eem
    public final void a_(edu eduVar, long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.a_(eduVar, j);
        t();
    }

    @Override // defpackage.edv
    public final edv b(edx edxVar) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(edxVar);
        return t();
    }

    @Override // defpackage.edv
    public final edv b(String str) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.b(str);
        return t();
    }

    @Override // defpackage.edv
    public final edv c(byte[] bArr) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.c(bArr);
        return t();
    }

    @Override // defpackage.edv
    public final edv c(byte[] bArr, int i, int i2) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.c(bArr, i, i2);
        return t();
    }

    @Override // java.nio.channels.WritableByteChannel
    public final int write(ByteBuffer byteBuffer) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        int write = this.a.write(byteBuffer);
        t();
        return write;
    }

    @Override // defpackage.edv
    public final long a(een eenVar) throws IOException {
        if (eenVar != null) {
            long j = 0;
            while (true) {
                long a = eenVar.a(this.a, 8192L);
                if (a == -1) {
                    return j;
                }
                j += a;
                t();
            }
        } else {
            throw new IllegalArgumentException("source == null");
        }
    }

    @Override // defpackage.edv
    public final edv h(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.h(i);
        return t();
    }

    @Override // defpackage.edv
    public final edv g(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.g(i);
        return t();
    }

    @Override // defpackage.edv
    public final edv f(int i) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.f(i);
        return t();
    }

    @Override // defpackage.edv
    public final edv l(long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.l(j);
        return t();
    }

    @Override // defpackage.edv
    public final edv k(long j) throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        this.a.k(j);
        return t();
    }

    @Override // defpackage.edv
    public final edv t() throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        long f = this.a.f();
        if (f > 0) {
            this.b.a_(this.a, f);
        }
        return this;
    }

    @Override // defpackage.edv, defpackage.eem, java.io.Flushable
    public final void flush() throws IOException {
        if (this.c) {
            throw new IllegalStateException("closed");
        }
        if (this.a.b > 0) {
            eem eemVar = this.b;
            edu eduVar = this.a;
            eemVar.a_(eduVar, eduVar.b);
        }
        this.b.flush();
    }

    @Override // java.nio.channels.Channel
    public final boolean isOpen() {
        return !this.c;
    }

    @Override // defpackage.eem, java.io.Closeable, java.lang.AutoCloseable
    public final void close() throws IOException {
        if (this.c) {
            return;
        }
        Throwable th = null;
        try {
            if (this.a.b > 0) {
                this.b.a_(this.a, this.a.b);
            }
        } catch (Throwable th2) {
            th = th2;
        }
        try {
            this.b.close();
        } catch (Throwable th3) {
            if (th == null) {
                th = th3;
            }
        }
        this.c = true;
        if (th == null) {
            return;
        }
        eep.a(th);
    }

    @Override // defpackage.eem
    public final eeo a() {
        return this.b.a();
    }

    public final String toString() {
        return "buffer(" + this.b + ")";
    }
}
