package defpackage;

import defpackage.jz;

/* renamed from: jx  reason: default package */
/* loaded from: classes2.dex */
public final class jx implements jy, jz {
    private final Object a;
    private final jz b;
    private volatile jy c;
    private volatile jy d;
    private jz.a e = jz.a.CLEARED;
    private jz.a f = jz.a.CLEARED;

    public jx(Object obj, jz jzVar) {
        this.a = obj;
        this.b = jzVar;
    }

    public final void a(jy jyVar, jy jyVar2) {
        this.c = jyVar;
        this.d = jyVar2;
    }

    @Override // defpackage.jy
    public final void a() {
        synchronized (this.a) {
            if (this.e != jz.a.RUNNING) {
                this.e = jz.a.RUNNING;
                this.c.a();
            }
        }
    }

    @Override // defpackage.jy
    public final void b() {
        synchronized (this.a) {
            this.e = jz.a.CLEARED;
            this.c.b();
            if (this.f != jz.a.CLEARED) {
                this.f = jz.a.CLEARED;
                this.d.b();
            }
        }
    }

    @Override // defpackage.jy
    public final void c() {
        synchronized (this.a) {
            if (this.e == jz.a.RUNNING) {
                this.e = jz.a.PAUSED;
                this.c.c();
            }
            if (this.f == jz.a.RUNNING) {
                this.f = jz.a.PAUSED;
                this.d.c();
            }
        }
    }

    @Override // defpackage.jy
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            if (this.e != jz.a.RUNNING && this.f != jz.a.RUNNING) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // defpackage.jy
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            if (this.e != jz.a.SUCCESS && this.f != jz.a.SUCCESS) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // defpackage.jy
    public final boolean f() {
        boolean z;
        synchronized (this.a) {
            z = this.e == jz.a.CLEARED && this.f == jz.a.CLEARED;
        }
        return z;
    }

    @Override // defpackage.jy
    public final boolean a(jy jyVar) {
        if (jyVar instanceof jx) {
            jx jxVar = (jx) jyVar;
            if (this.c.a(jxVar.c) && this.d.a(jxVar.d)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.jz
    public final boolean b(jy jyVar) {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            z = false;
            if (this.b != null && !this.b.b(this)) {
                z2 = false;
                if (z2 && g(jyVar)) {
                    z = true;
                }
            }
            z2 = true;
            if (z2) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.jz
    public final boolean c(jy jyVar) {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            z = false;
            if (this.b != null && !this.b.c(this)) {
                z2 = false;
                if (z2 && g(jyVar)) {
                    z = true;
                }
            }
            z2 = true;
            if (z2) {
                z = true;
            }
        }
        return z;
    }

    @Override // defpackage.jz
    public final boolean d(jy jyVar) {
        boolean z;
        boolean z2;
        synchronized (this.a) {
            z = false;
            if (this.b != null && !this.b.d(this)) {
                z2 = false;
                if (z2 && g(jyVar)) {
                    z = true;
                }
            }
            z2 = true;
            if (z2) {
                z = true;
            }
        }
        return z;
    }

    private boolean g(jy jyVar) {
        if (!jyVar.equals(this.c)) {
            return this.e == jz.a.FAILED && jyVar.equals(this.d);
        }
        return true;
    }

    @Override // defpackage.jy, defpackage.jz
    public final boolean g() {
        boolean z;
        synchronized (this.a) {
            if (!this.c.g() && !this.d.g()) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // defpackage.jz
    public final void e(jy jyVar) {
        synchronized (this.a) {
            if (jyVar.equals(this.c)) {
                this.e = jz.a.SUCCESS;
            } else if (jyVar.equals(this.d)) {
                this.f = jz.a.SUCCESS;
            }
            if (this.b != null) {
                this.b.e(this);
            }
        }
    }

    @Override // defpackage.jz
    public final void f(jy jyVar) {
        synchronized (this.a) {
            if (!jyVar.equals(this.d)) {
                this.e = jz.a.FAILED;
                if (this.f != jz.a.RUNNING) {
                    this.f = jz.a.RUNNING;
                    this.d.a();
                }
                return;
            }
            this.f = jz.a.FAILED;
            if (this.b != null) {
                this.b.f(this);
            }
        }
    }

    @Override // defpackage.jz
    public final jz h() {
        jz h;
        synchronized (this.a) {
            h = this.b != null ? this.b.h() : this;
        }
        return h;
    }
}
