package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.io.OutputStream;
import java.net.ProtocolException;
import java.net.SocketTimeoutException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: edc  reason: default package */
/* loaded from: classes2.dex */
public abstract class edc extends ebb {
    private long a;
    eeo c;
    OutputStream d;
    boolean e;

    @Override // defpackage.ebb
    public final eau a() {
        return null;
    }

    public eba a(eba ebaVar) throws IOException {
        return ebaVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(final edv edvVar, final long j) {
        this.c = edvVar.a();
        this.a = j;
        this.d = new OutputStream() { // from class: edc.1
            private long d;

            @Override // java.io.OutputStream
            public final void write(int i) throws IOException {
                write(new byte[]{(byte) i}, 0, 1);
            }

            @Override // java.io.OutputStream
            public final void write(byte[] bArr, int i, int i2) throws IOException {
                if (edc.this.e) {
                    throw new IOException("closed");
                }
                long j2 = j;
                if (j2 != -1 && this.d + i2 > j2) {
                    throw new ProtocolException("expected " + j + " bytes but received " + this.d + i2);
                }
                this.d += i2;
                try {
                    edvVar.c(bArr, i, i2);
                } catch (InterruptedIOException e) {
                    throw new SocketTimeoutException(e.getMessage());
                }
            }

            @Override // java.io.OutputStream, java.io.Flushable
            public final void flush() throws IOException {
                if (edc.this.e) {
                    return;
                }
                edvVar.flush();
            }

            @Override // java.io.OutputStream, java.io.Closeable, java.lang.AutoCloseable
            public final void close() throws IOException {
                edc.this.e = true;
                long j2 = j;
                if (j2 != -1 && this.d < j2) {
                    throw new ProtocolException("expected " + j + " bytes but received " + this.d);
                }
                edvVar.close();
            }
        };
    }

    @Override // defpackage.ebb
    public long b() throws IOException {
        return this.a;
    }
}
