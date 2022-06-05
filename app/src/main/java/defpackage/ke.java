package defpackage;

import defpackage.jz;

/* renamed from: ke  reason: default package */
/* loaded from: classes2.dex */
public final class ke implements jy, jz {
    private final jz a;
    private final Object b;
    private volatile jy c;
    private volatile jy d;
    private jz.a e = jz.a.CLEARED;
    private jz.a f = jz.a.CLEARED;
    private boolean g;

    public ke(Object obj, jz jzVar) {
        this.b = obj;
        this.a = jzVar;
    }

    public final void a(jy jyVar, jy jyVar2) {
        this.c = jyVar;
        this.d = jyVar2;
    }

    @Override // defpackage.jz
    public final boolean b(jy jyVar) {
        boolean z;
        boolean z2;
        synchronized (this.b) {
            z = false;
            if (this.a != null && !this.a.b(this)) {
                z2 = false;
                if (z2 && (jyVar.equals(this.c) || this.e != jz.a.SUCCESS)) {
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
        synchronized (this.b) {
            z = false;
            if (this.a != null && !this.a.c(this)) {
                z2 = false;
                if (z2 && jyVar.equals(this.c) && !g()) {
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
        synchronized (this.b) {
            z = false;
            if (this.a != null && !this.a.d(this)) {
                z2 = false;
                if (z2 && jyVar.equals(this.c) && this.e != jz.a.PAUSED) {
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

    @Override // defpackage.jy, defpackage.jz
    public final boolean g() {
        boolean z;
        synchronized (this.b) {
            if (!this.d.g() && !this.c.g()) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // defpackage.jz
    public final void e(jy jyVar) {
        synchronized (this.b) {
            if (jyVar.equals(this.d)) {
                this.f = jz.a.SUCCESS;
                return;
            }
            this.e = jz.a.SUCCESS;
            if (this.a != null) {
                this.a.e(this);
            }
            if (!this.f.isComplete()) {
                this.d.b();
            }
        }
    }

    @Override // defpackage.jz
    public final void f(jy jyVar) {
        synchronized (this.b) {
            if (!jyVar.equals(this.c)) {
                this.f = jz.a.FAILED;
                return;
            }
            this.e = jz.a.FAILED;
            if (this.a != null) {
                this.a.f(this);
            }
        }
    }

    @Override // defpackage.jz
    public final jz h() {
        jz h;
        synchronized (this.b) {
            h = this.a != null ? this.a.h() : this;
        }
        return h;
    }

    @Override // defpackage.jy
    public final void a() {
        synchronized (this.b) {
            this.g = true;
            if (this.e != jz.a.SUCCESS && this.f != jz.a.RUNNING) {
                this.f = jz.a.RUNNING;
                this.d.a();
            }
            if (this.g && this.e != jz.a.RUNNING) {
                this.e = jz.a.RUNNING;
                this.c.a();
            }
            this.g = false;
        }
    }

    @Override // defpackage.jy
    public final void b() {
        synchronized (this.b) {
            this.g = false;
            this.e = jz.a.CLEARED;
            this.f = jz.a.CLEARED;
            this.d.b();
            this.c.b();
        }
    }

    @Override // defpackage.jy
    public final void c() {
        synchronized (this.b) {
            if (!this.f.isComplete()) {
                this.f = jz.a.PAUSED;
                this.d.c();
            }
            if (!this.e.isComplete()) {
                this.e = jz.a.PAUSED;
                this.c.c();
            }
        }
    }

    @Override // defpackage.jy
    public final boolean d() {
        boolean z;
        synchronized (this.b) {
            z = this.e == jz.a.RUNNING;
        }
        return z;
    }

    @Override // defpackage.jy
    public final boolean e() {
        boolean z;
        synchronized (this.b) {
            z = this.e == jz.a.SUCCESS;
        }
        return z;
    }

    @Override // defpackage.jy
    public final boolean f() {
        boolean z;
        synchronized (this.b) {
            z = this.e == jz.a.CLEARED;
        }
        return z;
    }

    @Override // defpackage.jy
    public final boolean a(jy jyVar) {
        if (jyVar instanceof ke) {
            ke keVar = (ke) jyVar;
            if (this.c != null ? this.c.a(keVar.c) : keVar.c == null) {
                if (this.d == null) {
                    if (keVar.d == null) {
                        return true;
                    }
                } else if (this.d.a(keVar.d)) {
                    return true;
                }
            }
        }
        return false;
    }
}
