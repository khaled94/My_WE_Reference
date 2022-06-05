package defpackage;

import defpackage.ead;
import defpackage.ebc;
import java.io.IOException;
import java.util.Objects;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: efh  reason: default package */
/* loaded from: classes2.dex */
public final class efh<T> implements eey<T> {
    private final efm a;
    private final Object[] b;
    private final ead.a c;
    private final efc<ebd, T> d;
    private volatile boolean e;
    private ead f;
    private Throwable g;
    private boolean h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public efh(efm efmVar, Object[] objArr, ead.a aVar, efc<ebd, T> efcVar) {
        this.a = efmVar;
        this.b = objArr;
        this.c = aVar;
        this.d = efcVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: e */
    public efh<T> clone() {
        return new efh<>(this.a, this.b, this.c, this.d);
    }

    @Override // defpackage.eey
    public final synchronized eba d() {
        try {
        } catch (IOException e) {
            throw new RuntimeException("Unable to create request.", e);
        }
        return f().a();
    }

    private ead f() throws IOException {
        ead eadVar = this.f;
        if (eadVar != null) {
            return eadVar;
        }
        Throwable th = this.g;
        if (th != null) {
            if (th instanceof IOException) {
                throw ((IOException) th);
            }
            if (th instanceof RuntimeException) {
                throw ((RuntimeException) th);
            }
            throw ((Error) th);
        }
        try {
            ead g = g();
            this.f = g;
            return g;
        } catch (IOException | Error | RuntimeException e) {
            efs.a(e);
            this.g = e;
            throw e;
        }
    }

    @Override // defpackage.eey
    public final void a(final efa<T> efaVar) {
        ead eadVar;
        Throwable th;
        Objects.requireNonNull(efaVar, "callback == null");
        synchronized (this) {
            if (this.h) {
                throw new IllegalStateException("Already executed.");
            }
            this.h = true;
            eadVar = this.f;
            th = this.g;
            if (eadVar == null && th == null) {
                ead g = g();
                this.f = g;
                eadVar = g;
            }
        }
        if (th != null) {
            efaVar.a(this, th);
            return;
        }
        if (this.e) {
            eadVar.c();
        }
        eadVar.a(new eae() { // from class: efh.1
            @Override // defpackage.eae
            public final void a(ebc ebcVar) {
                try {
                    try {
                        efaVar.a(efh.this, efh.this.a(ebcVar));
                    } catch (Throwable th2) {
                        efs.a(th2);
                        th2.printStackTrace();
                    }
                } catch (Throwable th3) {
                    efs.a(th3);
                    a(th3);
                }
            }

            @Override // defpackage.eae
            public final void a(IOException iOException) {
                a((Throwable) iOException);
            }

            private void a(Throwable th2) {
                try {
                    efaVar.a(efh.this, th2);
                } catch (Throwable th3) {
                    efs.a(th3);
                    th3.printStackTrace();
                }
            }
        });
    }

    private ead g() throws IOException {
        ead a2 = this.c.a(this.a.a(this.b));
        if (a2 != null) {
            return a2;
        }
        throw new NullPointerException("Call.Factory returned null.");
    }

    @Override // defpackage.eey
    public final void a() {
        ead eadVar;
        this.e = true;
        synchronized (this) {
            eadVar = this.f;
        }
        if (eadVar != null) {
            eadVar.c();
        }
    }

    @Override // defpackage.eey
    public final boolean b() {
        boolean z = true;
        if (this.e) {
            return true;
        }
        synchronized (this) {
            if (this.f == null || !this.f.d()) {
                z = false;
            }
        }
        return z;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: efh$b */
    /* loaded from: classes2.dex */
    public static final class b extends ebd {
        private final eau b;
        private final long c;

        b(eau eauVar, long j) {
            this.b = eauVar;
            this.c = j;
        }

        @Override // defpackage.ebd
        public final eau a() {
            return this.b;
        }

        @Override // defpackage.ebd
        public final long b() {
            return this.c;
        }

        @Override // defpackage.ebd
        public final edw d() {
            throw new IllegalStateException("Cannot read raw response body of a converted body.");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: efh$a */
    /* loaded from: classes2.dex */
    public static final class a extends ebd {
        IOException b;
        private final ebd c;
        private final edw d;

        a(ebd ebdVar) {
            this.c = ebdVar;
            this.d = eed.a(new edz(ebdVar.d()) { // from class: efh.a.1
                @Override // defpackage.edz, defpackage.een
                public final long a(edu eduVar, long j) throws IOException {
                    try {
                        return super.a(eduVar, j);
                    } catch (IOException e) {
                        a.this.b = e;
                        throw e;
                    }
                }
            });
        }

        @Override // defpackage.ebd
        public final eau a() {
            return this.c.a();
        }

        @Override // defpackage.ebd
        public final long b() {
            return this.c.b();
        }

        @Override // defpackage.ebd
        public final edw d() {
            return this.d;
        }

        @Override // defpackage.ebd, java.io.Closeable, java.lang.AutoCloseable
        public final void close() {
            this.c.close();
        }
    }

    /* JADX WARN: Finally extract failed */
    final efn<T> a(ebc ebcVar) throws IOException {
        ebd ebdVar = ebcVar.g;
        ebc.a i = ebcVar.i();
        i.g = new b(ebdVar.a(), ebdVar.b());
        ebc a2 = i.a();
        int i2 = a2.c;
        if (i2 < 200 || i2 >= 300) {
            try {
                efn<T> a3 = efn.a(efs.a(ebdVar), a2);
                ebdVar.close();
                return a3;
            } catch (Throwable th) {
                ebdVar.close();
                throw th;
            }
        } else if (i2 == 204 || i2 == 205) {
            ebdVar.close();
            return efn.a((Object) null, a2);
        } else {
            try {
                return efn.a(this.d.a(new a(ebdVar)), a2);
            } catch (RuntimeException e) {
                throw e;
            }
        }
    }
}
