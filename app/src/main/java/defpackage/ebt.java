package defpackage;

import defpackage.ebc;
import java.io.IOException;
import java.net.ProtocolException;

/* renamed from: ebt  reason: default package */
/* loaded from: classes2.dex */
public final class ebt {
    public final ebz a;
    final ead b;
    final eao c;
    final ebu d;
    public final ecc e;
    public boolean f;

    public ebt(ebz ebzVar, ead eadVar, eao eaoVar, ebu ebuVar, ecc eccVar) {
        this.a = ebzVar;
        this.b = eadVar;
        this.c = eaoVar;
        this.d = ebuVar;
        this.e = eccVar;
    }

    public final ebv a() {
        return this.e.a();
    }

    public final ebc.a a(boolean z) throws IOException {
        try {
            ebc.a a2 = this.e.a(z);
            if (a2 != null) {
                ebg.a.a(a2, this);
            }
            return a2;
        } catch (IOException e) {
            a(e);
            throw e;
        }
    }

    public final ebd a(ebc ebcVar) throws IOException {
        try {
            String a2 = ebcVar.a("Content-Type");
            long a3 = this.e.a(ebcVar);
            return new ech(a2, a3, eed.a(new b(this.e.b(ebcVar), a3)));
        } catch (IOException e) {
            a(e);
            throw e;
        }
    }

    public final void b() {
        this.e.a().d();
    }

    public final void c() {
        this.e.d();
    }

    public final void a(IOException iOException) {
        this.d.b();
        this.e.a().a(iOException);
    }

    final IOException a(boolean z, boolean z2, IOException iOException) {
        if (iOException != null) {
            a(iOException);
        }
        return this.a.a(this, z2, z, iOException);
    }

    public final void d() {
        this.a.a(this, true, false, null);
    }

    /* renamed from: ebt$a */
    /* loaded from: classes2.dex */
    public final class a extends edy {
        private boolean b;
        private long c;
        private long d;
        private boolean e;

        public a(eem eemVar, long j) {
            super(eemVar);
            this.c = j;
        }

        @Override // defpackage.edy, defpackage.eem
        public final void a_(edu eduVar, long j) throws IOException {
            if (this.e) {
                throw new IllegalStateException("closed");
            }
            long j2 = this.c;
            if (j2 != -1 && this.d + j > j2) {
                throw new ProtocolException("expected " + this.c + " bytes but received " + (this.d + j));
            }
            try {
                super.a_(eduVar, j);
                this.d += j;
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // defpackage.edy, defpackage.eem, java.io.Flushable
        public final void flush() throws IOException {
            try {
                super.flush();
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // defpackage.edy, defpackage.eem, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.e) {
                return;
            }
            this.e = true;
            long j = this.c;
            if (j != -1 && this.d != j) {
                throw new ProtocolException("unexpected end of stream");
            }
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                throw a(e);
            }
        }

        private IOException a(IOException iOException) {
            if (this.b) {
                return iOException;
            }
            this.b = true;
            return ebt.this.a(false, true, iOException);
        }
    }

    /* renamed from: ebt$b */
    /* loaded from: classes2.dex */
    final class b extends edz {
        private final long c;
        private long d;
        private boolean e;
        private boolean f;

        b(een eenVar, long j) {
            super(eenVar);
            this.c = j;
            if (j == 0) {
                a(null);
            }
        }

        @Override // defpackage.edz, defpackage.een
        public final long a(edu eduVar, long j) throws IOException {
            if (this.f) {
                throw new IllegalStateException("closed");
            }
            try {
                long a = this.b.a(eduVar, j);
                if (a == -1) {
                    a(null);
                    return -1L;
                }
                long j2 = this.d + a;
                if (this.c != -1 && j2 > this.c) {
                    throw new ProtocolException("expected " + this.c + " bytes but received " + j2);
                }
                this.d = j2;
                if (j2 == this.c) {
                    a(null);
                }
                return a;
            } catch (IOException e) {
                throw a(e);
            }
        }

        @Override // defpackage.edz, defpackage.een, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (this.f) {
                return;
            }
            this.f = true;
            try {
                super.close();
                a(null);
            } catch (IOException e) {
                throw a(e);
            }
        }

        private IOException a(IOException iOException) {
            if (this.e) {
                return iOException;
            }
            this.e = true;
            return ebt.this.a(true, false, iOException);
        }
    }
}
