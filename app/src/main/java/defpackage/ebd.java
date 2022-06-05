package defpackage;

import java.io.Closeable;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.io.Reader;
import java.nio.charset.Charset;

/* renamed from: ebd  reason: default package */
/* loaded from: classes2.dex */
public abstract class ebd implements Closeable {
    public Reader a;

    public abstract eau a();

    public abstract long b();

    public abstract edw d();

    public final InputStream c() {
        return d().e();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() {
        ebk.a(d());
    }

    public static ebd a(byte[] bArr) {
        return a(null, bArr.length, new edu().c(bArr));
    }

    public static ebd a(final eau eauVar, final long j, final edw edwVar) {
        if (edwVar == null) {
            throw new NullPointerException("source == null");
        }
        return new ebd() { // from class: ebd.1
            @Override // defpackage.ebd
            public final eau a() {
                return eau.this;
            }

            @Override // defpackage.ebd
            public final long b() {
                return j;
            }

            @Override // defpackage.ebd
            public final edw d() {
                return edwVar;
            }
        };
    }

    /* renamed from: ebd$a */
    /* loaded from: classes2.dex */
    public static final class a extends Reader {
        private final edw a;
        private final Charset b;
        private boolean c;
        private Reader d;

        public a(edw edwVar, Charset charset) {
            this.a = edwVar;
            this.b = charset;
        }

        @Override // java.io.Reader
        public final int read(char[] cArr, int i, int i2) throws IOException {
            if (this.c) {
                throw new IOException("Stream closed");
            }
            Reader reader = this.d;
            if (reader == null) {
                InputStreamReader inputStreamReader = new InputStreamReader(this.a.e(), ebk.a(this.a, this.b));
                this.d = inputStreamReader;
                reader = inputStreamReader;
            }
            return reader.read(cArr, i, i2);
        }

        @Override // java.io.Reader, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            this.c = true;
            Reader reader = this.d;
            if (reader != null) {
                reader.close();
            } else {
                this.a.close();
            }
        }
    }
}
