package defpackage;

import com.google.android.gms.internal.measurement.zzfi;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: asg  reason: default package */
/* loaded from: classes.dex */
public final class asg implements auy {
    private final asf a;
    private int b;
    private int c;
    private int d = 0;

    public static asg a(asf asfVar) {
        if (asfVar.c != null) {
            return asfVar.c;
        }
        return new asg(asfVar);
    }

    private asg(asf asfVar) {
        asf asfVar2 = (asf) atb.a(asfVar, "input");
        this.a = asfVar2;
        asfVar2.c = this;
    }

    @Override // defpackage.auy
    public final int a() throws IOException {
        int i = this.d;
        if (i != 0) {
            this.b = i;
            this.d = 0;
        } else {
            this.b = this.a.a();
        }
        int i2 = this.b;
        if (i2 == 0 || i2 == this.c) {
            return Integer.MAX_VALUE;
        }
        return i2 >>> 3;
    }

    @Override // defpackage.auy
    public final int b() {
        return this.b;
    }

    @Override // defpackage.auy
    public final boolean c() throws IOException {
        int i;
        if (this.a.t() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.b(i);
    }

    private final void a(int i) throws IOException {
        if ((this.b & 7) == i) {
            return;
        }
        throw zzfi.f();
    }

    @Override // defpackage.auy
    public final double d() throws IOException {
        a(1);
        return this.a.b();
    }

    @Override // defpackage.auy
    public final float e() throws IOException {
        a(5);
        return this.a.c();
    }

    @Override // defpackage.auy
    public final long f() throws IOException {
        a(0);
        return this.a.d();
    }

    @Override // defpackage.auy
    public final long g() throws IOException {
        a(0);
        return this.a.e();
    }

    @Override // defpackage.auy
    public final int h() throws IOException {
        a(0);
        return this.a.f();
    }

    @Override // defpackage.auy
    public final long i() throws IOException {
        a(1);
        return this.a.g();
    }

    @Override // defpackage.auy
    public final int j() throws IOException {
        a(5);
        return this.a.h();
    }

    @Override // defpackage.auy
    public final boolean k() throws IOException {
        a(0);
        return this.a.i();
    }

    @Override // defpackage.auy
    public final String l() throws IOException {
        a(2);
        return this.a.j();
    }

    @Override // defpackage.auy
    public final String m() throws IOException {
        a(2);
        return this.a.k();
    }

    @Override // defpackage.auy
    public final <T> T a(aux<T> auxVar, asn asnVar) throws IOException {
        a(2);
        return (T) c(auxVar, asnVar);
    }

    @Override // defpackage.auy
    public final <T> T b(aux<T> auxVar, asn asnVar) throws IOException {
        a(3);
        return (T) d(auxVar, asnVar);
    }

    private final <T> T c(aux<T> auxVar, asn asnVar) throws IOException {
        int m = this.a.m();
        if (this.a.a >= this.a.b) {
            throw zzfi.g();
        }
        int c = this.a.c(m);
        T a = auxVar.a();
        this.a.a++;
        auxVar.a(a, this, asnVar);
        auxVar.c(a);
        this.a.a(0);
        asf asfVar = this.a;
        asfVar.a--;
        this.a.d(c);
        return a;
    }

    private final <T> T d(aux<T> auxVar, asn asnVar) throws IOException {
        int i = this.c;
        this.c = ((this.b >>> 3) << 3) | 4;
        try {
            T a = auxVar.a();
            auxVar.a(a, this, asnVar);
            auxVar.c(a);
            if (this.b == this.c) {
                return a;
            }
            throw zzfi.h();
        } finally {
            this.c = i;
        }
    }

    @Override // defpackage.auy
    public final art n() throws IOException {
        a(2);
        return this.a.l();
    }

    @Override // defpackage.auy
    public final int o() throws IOException {
        a(0);
        return this.a.m();
    }

    @Override // defpackage.auy
    public final int p() throws IOException {
        a(0);
        return this.a.n();
    }

    @Override // defpackage.auy
    public final int q() throws IOException {
        a(5);
        return this.a.o();
    }

    @Override // defpackage.auy
    public final long r() throws IOException {
        a(1);
        return this.a.p();
    }

    @Override // defpackage.auy
    public final int s() throws IOException {
        a(0);
        return this.a.q();
    }

    @Override // defpackage.auy
    public final long t() throws IOException {
        a(0);
        return this.a.r();
    }

    @Override // defpackage.auy
    public final void a(List<Double> list) throws IOException {
        int a;
        int a2;
        if (list instanceof asj) {
            asj asjVar = (asj) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    asjVar.a(this.a.b());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (i == 2) {
                int m = this.a.m();
                b(m);
                int u = this.a.u() + m;
                do {
                    asjVar.a(this.a.b());
                } while (this.a.u() < u);
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                list.add(Double.valueOf(this.a.b()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (i2 == 2) {
            int m2 = this.a.m();
            b(m2);
            int u2 = this.a.u() + m2;
            do {
                list.add(Double.valueOf(this.a.b()));
            } while (this.a.u() < u2);
        } else {
            throw zzfi.f();
        }
    }

    @Override // defpackage.auy
    public final void b(List<Float> list) throws IOException {
        int a;
        int a2;
        if (list instanceof asw) {
            asw aswVar = (asw) list;
            int i = this.b & 7;
            if (i == 2) {
                int m = this.a.m();
                c(m);
                int u = this.a.u() + m;
                do {
                    aswVar.a(this.a.c());
                } while (this.a.u() < u);
                return;
            } else if (i == 5) {
                do {
                    aswVar.a(this.a.c());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 2) {
            int m2 = this.a.m();
            c(m2);
            int u2 = this.a.u() + m2;
            do {
                list.add(Float.valueOf(this.a.c()));
            } while (this.a.u() < u2);
        } else if (i2 == 5) {
            do {
                list.add(Float.valueOf(this.a.c()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else {
            throw zzfi.f();
        }
    }

    @Override // defpackage.auy
    public final void c(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof atv) {
            atv atvVar = (atv) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    atvVar.a(this.a.d());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    atvVar.a(this.a.d());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.a.d()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (i2 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Long.valueOf(this.a.d()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw zzfi.f();
        }
    }

    @Override // defpackage.auy
    public final void d(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof atv) {
            atv atvVar = (atv) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    atvVar.a(this.a.e());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    atvVar.a(this.a.e());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.a.e()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (i2 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Long.valueOf(this.a.e()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw zzfi.f();
        }
    }

    @Override // defpackage.auy
    public final void e(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof atd) {
            atd atdVar = (atd) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    atdVar.d(this.a.f());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    atdVar.d(this.a.f());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.f()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (i2 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Integer.valueOf(this.a.f()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw zzfi.f();
        }
    }

    @Override // defpackage.auy
    public final void f(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof atv) {
            atv atvVar = (atv) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    atvVar.a(this.a.g());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (i == 2) {
                int m = this.a.m();
                b(m);
                int u = this.a.u() + m;
                do {
                    atvVar.a(this.a.g());
                } while (this.a.u() < u);
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.a.g()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (i2 == 2) {
            int m2 = this.a.m();
            b(m2);
            int u2 = this.a.u() + m2;
            do {
                list.add(Long.valueOf(this.a.g()));
            } while (this.a.u() < u2);
        } else {
            throw zzfi.f();
        }
    }

    @Override // defpackage.auy
    public final void g(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof atd) {
            atd atdVar = (atd) list;
            int i = this.b & 7;
            if (i == 2) {
                int m = this.a.m();
                c(m);
                int u = this.a.u() + m;
                do {
                    atdVar.d(this.a.h());
                } while (this.a.u() < u);
                return;
            } else if (i == 5) {
                do {
                    atdVar.d(this.a.h());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 2) {
            int m2 = this.a.m();
            c(m2);
            int u2 = this.a.u() + m2;
            do {
                list.add(Integer.valueOf(this.a.h()));
            } while (this.a.u() < u2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.a.h()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else {
            throw zzfi.f();
        }
    }

    @Override // defpackage.auy
    public final void h(List<Boolean> list) throws IOException {
        int a;
        int a2;
        if (list instanceof arr) {
            arr arrVar = (arr) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    arrVar.a(this.a.i());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    arrVar.a(this.a.i());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                list.add(Boolean.valueOf(this.a.i()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (i2 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Boolean.valueOf(this.a.i()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw zzfi.f();
        }
    }

    @Override // defpackage.auy
    public final void i(List<String> list) throws IOException {
        a(list, false);
    }

    @Override // defpackage.auy
    public final void j(List<String> list) throws IOException {
        a(list, true);
    }

    private final void a(List<String> list, boolean z) throws IOException {
        int a;
        int a2;
        if ((this.b & 7) != 2) {
            throw zzfi.f();
        }
        if ((list instanceof atp) && !z) {
            atp atpVar = (atp) list;
            do {
                atpVar.a(n());
                if (this.a.t()) {
                    return;
                }
                a2 = this.a.a();
            } while (a2 == this.b);
            this.d = a2;
            return;
        }
        do {
            list.add(z ? m() : l());
            if (this.a.t()) {
                return;
            }
            a = this.a.a();
        } while (a == this.b);
        this.d = a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.auy
    public final <T> void a(List<T> list, aux<T> auxVar, asn asnVar) throws IOException {
        int a;
        int i = this.b;
        if ((i & 7) != 2) {
            throw zzfi.f();
        }
        do {
            list.add(c(auxVar, asnVar));
            if (this.a.t() || this.d != 0) {
                return;
            }
            a = this.a.a();
        } while (a == i);
        this.d = a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.auy
    public final <T> void b(List<T> list, aux<T> auxVar, asn asnVar) throws IOException {
        int a;
        int i = this.b;
        if ((i & 7) != 3) {
            throw zzfi.f();
        }
        do {
            list.add(d(auxVar, asnVar));
            if (this.a.t() || this.d != 0) {
                return;
            }
            a = this.a.a();
        } while (a == i);
        this.d = a;
    }

    @Override // defpackage.auy
    public final void k(List<art> list) throws IOException {
        int a;
        if ((this.b & 7) != 2) {
            throw zzfi.f();
        }
        do {
            list.add(n());
            if (this.a.t()) {
                return;
            }
            a = this.a.a();
        } while (a == this.b);
        this.d = a;
    }

    @Override // defpackage.auy
    public final void l(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof atd) {
            atd atdVar = (atd) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    atdVar.d(this.a.m());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    atdVar.d(this.a.m());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.m()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (i2 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Integer.valueOf(this.a.m()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw zzfi.f();
        }
    }

    @Override // defpackage.auy
    public final void m(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof atd) {
            atd atdVar = (atd) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    atdVar.d(this.a.n());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    atdVar.d(this.a.n());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.n()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (i2 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Integer.valueOf(this.a.n()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw zzfi.f();
        }
    }

    @Override // defpackage.auy
    public final void n(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof atd) {
            atd atdVar = (atd) list;
            int i = this.b & 7;
            if (i == 2) {
                int m = this.a.m();
                c(m);
                int u = this.a.u() + m;
                do {
                    atdVar.d(this.a.o());
                } while (this.a.u() < u);
                return;
            } else if (i == 5) {
                do {
                    atdVar.d(this.a.o());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 2) {
            int m2 = this.a.m();
            c(m2);
            int u2 = this.a.u() + m2;
            do {
                list.add(Integer.valueOf(this.a.o()));
            } while (this.a.u() < u2);
        } else if (i2 == 5) {
            do {
                list.add(Integer.valueOf(this.a.o()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else {
            throw zzfi.f();
        }
    }

    @Override // defpackage.auy
    public final void o(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof atv) {
            atv atvVar = (atv) list;
            int i = this.b & 7;
            if (i == 1) {
                do {
                    atvVar.a(this.a.p());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (i == 2) {
                int m = this.a.m();
                b(m);
                int u = this.a.u() + m;
                do {
                    atvVar.a(this.a.p());
                } while (this.a.u() < u);
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 1) {
            do {
                list.add(Long.valueOf(this.a.p()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (i2 == 2) {
            int m2 = this.a.m();
            b(m2);
            int u2 = this.a.u() + m2;
            do {
                list.add(Long.valueOf(this.a.p()));
            } while (this.a.u() < u2);
        } else {
            throw zzfi.f();
        }
    }

    @Override // defpackage.auy
    public final void p(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof atd) {
            atd atdVar = (atd) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    atdVar.d(this.a.q());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    atdVar.d(this.a.q());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                list.add(Integer.valueOf(this.a.q()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (i2 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Integer.valueOf(this.a.q()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw zzfi.f();
        }
    }

    @Override // defpackage.auy
    public final void q(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof atv) {
            atv atvVar = (atv) list;
            int i = this.b & 7;
            if (i == 0) {
                do {
                    atvVar.a(this.a.r());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (i == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    atvVar.a(this.a.r());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw zzfi.f();
            }
        }
        int i2 = this.b & 7;
        if (i2 == 0) {
            do {
                list.add(Long.valueOf(this.a.r()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (i2 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Long.valueOf(this.a.r()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw zzfi.f();
        }
    }

    private static void b(int i) throws IOException {
        if ((i & 7) == 0) {
            return;
        }
        throw zzfi.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.auy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void a(java.util.Map<K, V> r8, defpackage.aty<K, V> r9, defpackage.asn r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.a(r0)
            asf r1 = r7.a
            int r1 = r1.m()
            asf r2 = r7.a
            int r1 = r2.c(r1)
            K r2 = r9.b
            V r3 = r9.d
        L14:
            int r4 = r7.a()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            asf r5 = r7.a     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.t()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.c()     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.android.gms.internal.measurement.zzfi r4 = new com.google.android.gms.internal.measurement.zzfi     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
        L39:
            awg r4 = r9.c     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            V r5 = r9.d     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.a(r4, r5, r10)     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            awg r4 = r9.a     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.a(r4, r5, r5)     // Catch: com.google.android.gms.internal.measurement.zzfh -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.c()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.android.gms.internal.measurement.zzfi r8 = new com.google.android.gms.internal.measurement.zzfi     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            asf r8 = r7.a
            r8.d(r1)
            return
        L64:
            r8 = move-exception
            asf r9 = r7.a
            r9.d(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.asg.a(java.util.Map, aty, asn):void");
    }

    private final Object a(awg awgVar, Class<?> cls, asn asnVar) throws IOException {
        switch (asi.a[awgVar.ordinal()]) {
            case 1:
                return Boolean.valueOf(k());
            case 2:
                return n();
            case 3:
                return Double.valueOf(d());
            case 4:
                return Integer.valueOf(p());
            case 5:
                return Integer.valueOf(j());
            case 6:
                return Long.valueOf(i());
            case 7:
                return Float.valueOf(e());
            case 8:
                return Integer.valueOf(h());
            case 9:
                return Long.valueOf(g());
            case 10:
                a(2);
                return c(aut.a().a((Class) cls), asnVar);
            case 11:
                return Integer.valueOf(q());
            case 12:
                return Long.valueOf(r());
            case 13:
                return Integer.valueOf(s());
            case 14:
                return Long.valueOf(t());
            case 15:
                return m();
            case 16:
                return Integer.valueOf(o());
            case 17:
                return Long.valueOf(f());
            default:
                throw new RuntimeException("unsupported field type.");
        }
    }

    private static void c(int i) throws IOException {
        if ((i & 3) == 0) {
            return;
        }
        throw zzfi.h();
    }

    private final void d(int i) throws IOException {
        if (this.a.u() == i) {
            return;
        }
        throw zzfi.a();
    }
}
