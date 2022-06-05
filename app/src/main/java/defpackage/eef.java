package defpackage;

import java.io.IOException;

/* renamed from: eef  reason: default package */
/* loaded from: classes2.dex */
public final class eef {
    boolean c;
    boolean d;
    eem g;
    final edu b = new edu();
    public final eem e = new a();
    public final een f = new b();
    final long a = 8192;

    /* renamed from: eef$a */
    /* loaded from: classes2.dex */
    final class a implements eem {
        final eeg a = new eeg();

        a() {
        }

        @Override // defpackage.eem
        public final void a_(edu eduVar, long j) throws IOException {
            eem eemVar;
            synchronized (eef.this.b) {
                if (eef.this.c) {
                    throw new IllegalStateException("closed");
                }
                while (true) {
                    if (j <= 0) {
                        eemVar = null;
                        break;
                    } else if (eef.this.g == null) {
                        if (eef.this.d) {
                            throw new IOException("source is closed");
                        }
                        long j2 = eef.this.a - eef.this.b.b;
                        if (j2 == 0) {
                            this.a.a(eef.this.b);
                        } else {
                            long min = Math.min(j2, j);
                            eef.this.b.a_(eduVar, min);
                            j -= min;
                            eef.this.b.notifyAll();
                        }
                    } else {
                        eemVar = eef.this.g;
                        break;
                    }
                }
            }
            if (eemVar != null) {
                this.a.a(eemVar.a());
                try {
                    eemVar.a_(eduVar, j);
                } finally {
                    this.a.g();
                }
            }
        }

        @Override // defpackage.eem, java.io.Flushable
        public final void flush() throws IOException {
            eem eemVar;
            synchronized (eef.this.b) {
                if (eef.this.c) {
                    throw new IllegalStateException("closed");
                }
                if (eef.this.g == null) {
                    if (eef.this.d && eef.this.b.b > 0) {
                        throw new IOException("source is closed");
                    }
                    eemVar = null;
                } else {
                    eemVar = eef.this.g;
                }
            }
            if (eemVar != null) {
                this.a.a(eemVar.a());
                try {
                    eemVar.flush();
                } finally {
                    this.a.g();
                }
            }
        }

        @Override // defpackage.eem, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            eem eemVar;
            synchronized (eef.this.b) {
                if (eef.this.c) {
                    return;
                }
                if (eef.this.g == null) {
                    if (eef.this.d && eef.this.b.b > 0) {
                        throw new IOException("source is closed");
                    }
                    eef.this.c = true;
                    eef.this.b.notifyAll();
                    eemVar = null;
                } else {
                    eemVar = eef.this.g;
                }
                if (eemVar == null) {
                    return;
                }
                this.a.a(eemVar.a());
                try {
                    eemVar.close();
                } finally {
                    this.a.g();
                }
            }
        }

        @Override // defpackage.eem
        public final eeo a() {
            return this.a;
        }
    }

    /* renamed from: eef$b */
    /* loaded from: classes2.dex */
    final class b implements een {
        final eeo a = new eeo();

        b() {
        }

        @Override // defpackage.een
        public final long a(edu eduVar, long j) throws IOException {
            synchronized (eef.this.b) {
                if (eef.this.d) {
                    throw new IllegalStateException("closed");
                }
                while (eef.this.b.b == 0) {
                    if (eef.this.c) {
                        return -1L;
                    }
                    this.a.a(eef.this.b);
                }
                long a = eef.this.b.a(eduVar, j);
                eef.this.b.notifyAll();
                return a;
            }
        }

        @Override // defpackage.een, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            synchronized (eef.this.b) {
                eef.this.d = true;
                eef.this.b.notifyAll();
            }
        }

        @Override // defpackage.een
        public final eeo a() {
            return this.a;
        }
    }
}
