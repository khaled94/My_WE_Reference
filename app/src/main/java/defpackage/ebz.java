package defpackage;

import defpackage.eat;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.lang.ref.WeakReference;
import java.net.Socket;
import java.util.concurrent.TimeUnit;

/* renamed from: ebz  reason: default package */
/* loaded from: classes2.dex */
public final class ebz {
    static final /* synthetic */ boolean k = !ebz.class.desiredAssertionStatus();
    public final eaw a;
    public final ebw b;
    public final ead c;
    public final eao d;
    public final eds e = new eds() { // from class: ebz.1
        @Override // defpackage.eds
        public final void a() {
            ebz.this.f();
        }
    };
    public eba f;
    public ebu g;
    public ebv h;
    public ebt i;
    public boolean j;
    private Object l;
    private boolean m;
    private boolean n;
    private boolean o;
    private boolean p;

    public ebz(eaw eawVar, ead eadVar) {
        this.a = eawVar;
        this.b = ebg.a.a(eawVar.u);
        this.c = eadVar;
        this.d = eawVar.i.create(eadVar);
        this.e.a(eawVar.z, TimeUnit.MILLISECONDS);
    }

    public final void a() {
        this.l = edk.e().a("response.body().close()");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ebt a(eat.a aVar, boolean z) {
        synchronized (this.b) {
            if (this.p) {
                throw new IllegalStateException("released");
            }
            if (this.i != null) {
                throw new IllegalStateException("cannot make a new request because the previous response is still open: please call response.close()");
            }
        }
        ebt ebtVar = new ebt(this, this.c, this.d, this.g, this.g.a(this.a, aVar, z));
        synchronized (this.b) {
            this.i = ebtVar;
            this.m = false;
            this.n = false;
        }
        return ebtVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ebv ebvVar) {
        if (k || Thread.holdsLock(this.b)) {
            if (this.h != null) {
                throw new IllegalStateException();
            }
            this.h = ebvVar;
            ebvVar.l.add(new a(this, this.l));
            return;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final Socket b() {
        if (k || Thread.holdsLock(this.b)) {
            int size = this.h.l.size();
            boolean z = false;
            int i = 0;
            while (true) {
                if (i >= size) {
                    i = -1;
                    break;
                } else if (this.h.l.get(i).get() == this) {
                    break;
                } else {
                    i++;
                }
            }
            if (i == -1) {
                throw new IllegalStateException();
            }
            ebv ebvVar = this.h;
            ebvVar.l.remove(i);
            this.h = null;
            if (ebvVar.l.isEmpty()) {
                ebvVar.m = System.nanoTime();
                ebw ebwVar = this.b;
                if (!ebw.g && !Thread.holdsLock(ebwVar)) {
                    throw new AssertionError();
                }
                if (ebvVar.i || ebwVar.b == 0) {
                    ebwVar.d.remove(ebvVar);
                    z = true;
                } else {
                    ebwVar.notifyAll();
                }
                if (z) {
                    return ebvVar.d;
                }
            }
            return null;
        }
        throw new AssertionError();
    }

    public final void c() {
        synchronized (this.b) {
            if (this.p) {
                throw new IllegalStateException();
            }
            this.i = null;
        }
    }

    public final IOException a(ebt ebtVar, boolean z, boolean z2, IOException iOException) {
        boolean z3;
        synchronized (this.b) {
            if (ebtVar != this.i) {
                return iOException;
            }
            boolean z4 = true;
            if (z) {
                z3 = !this.m;
                this.m = true;
            } else {
                z3 = false;
            }
            if (z2) {
                if (!this.n) {
                    z3 = true;
                }
                this.n = true;
            }
            if (!this.m || !this.n || !z3) {
                z4 = false;
            } else {
                this.i.a().k++;
                this.i = null;
            }
            return z4 ? a(iOException, false) : iOException;
        }
    }

    public final IOException a(IOException iOException) {
        synchronized (this.b) {
            this.p = true;
        }
        return a(iOException, false);
    }

    public final IOException a(IOException iOException, boolean z) {
        Socket b;
        boolean z2;
        synchronized (this.b) {
            if (z) {
                if (this.i != null) {
                    throw new IllegalStateException("cannot release connection while it is in use");
                }
            }
            b = (this.h == null || this.i != null || (!z && !this.p)) ? null : b();
            z2 = this.p && this.i == null;
        }
        ebk.a(b);
        if (!z2 || this.j || !this.e.B_()) {
            return iOException;
        }
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    public final boolean d() {
        return this.g.c() && this.g.d();
    }

    public final boolean e() {
        boolean z;
        synchronized (this.b) {
            z = this.i != null;
        }
        return z;
    }

    public final void f() {
        ebt ebtVar;
        ebv ebvVar;
        synchronized (this.b) {
            this.o = true;
            ebtVar = this.i;
            if (this.g != null && this.g.a() != null) {
                ebvVar = this.g.a();
            } else {
                ebvVar = this.h;
            }
        }
        if (ebtVar != null) {
            ebtVar.c();
        } else if (ebvVar == null) {
        } else {
            ebk.a(ebvVar.c);
        }
    }

    public final boolean g() {
        boolean z;
        synchronized (this.b) {
            z = this.o;
        }
        return z;
    }

    /* renamed from: ebz$a */
    /* loaded from: classes2.dex */
    static final class a extends WeakReference<ebz> {
        final Object a;

        a(ebz ebzVar, Object obj) {
            super(ebzVar);
            this.a = obj;
        }
    }
}
