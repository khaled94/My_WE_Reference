package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cff;
import java.io.IOException;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: ccw  reason: default package */
/* loaded from: classes2.dex */
public final class ccw implements ces {
    private final ccv a;
    private int b;
    private int c;
    private int d = 0;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ccw(ccv ccvVar) {
        ccv ccvVar2 = (ccv) cdm.a(ccvVar, "input");
        this.a = ccvVar2;
        ccvVar2.d = this;
    }

    @Override // defpackage.ces
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
        return cff.b(i2);
    }

    @Override // defpackage.ces
    public final int b() {
        return this.b;
    }

    @Override // defpackage.ces
    public final boolean c() throws IOException {
        int i;
        if (this.a.t() || (i = this.b) == this.c) {
            return false;
        }
        return this.a.b(i);
    }

    private void a(int i) throws IOException {
        if (cff.a(this.b) == i) {
            return;
        }
        throw InvalidProtocolBufferException.f();
    }

    @Override // defpackage.ces
    public final double d() throws IOException {
        a(1);
        return this.a.b();
    }

    @Override // defpackage.ces
    public final float e() throws IOException {
        a(5);
        return this.a.c();
    }

    @Override // defpackage.ces
    public final long f() throws IOException {
        a(0);
        return this.a.d();
    }

    @Override // defpackage.ces
    public final long g() throws IOException {
        a(0);
        return this.a.e();
    }

    @Override // defpackage.ces
    public final int h() throws IOException {
        a(0);
        return this.a.f();
    }

    @Override // defpackage.ces
    public final long i() throws IOException {
        a(1);
        return this.a.g();
    }

    @Override // defpackage.ces
    public final int j() throws IOException {
        a(5);
        return this.a.h();
    }

    @Override // defpackage.ces
    public final boolean k() throws IOException {
        a(0);
        return this.a.i();
    }

    @Override // defpackage.ces
    public final String l() throws IOException {
        a(2);
        return this.a.j();
    }

    @Override // defpackage.ces
    public final String m() throws IOException {
        a(2);
        return this.a.k();
    }

    @Override // defpackage.ces
    public final <T> T a(Class<T> cls, cdb cdbVar) throws IOException {
        a(2);
        return (T) c(ceo.a().a((Class) cls), cdbVar);
    }

    @Override // defpackage.ces
    public final <T> T a(cet<T> cetVar, cdb cdbVar) throws IOException {
        a(2);
        return (T) c(cetVar, cdbVar);
    }

    @Override // defpackage.ces
    public final <T> T b(Class<T> cls, cdb cdbVar) throws IOException {
        a(3);
        return (T) d(ceo.a().a((Class) cls), cdbVar);
    }

    @Override // defpackage.ces
    public final <T> T b(cet<T> cetVar, cdb cdbVar) throws IOException {
        a(3);
        return (T) d(cetVar, cdbVar);
    }

    private <T> T c(cet<T> cetVar, cdb cdbVar) throws IOException {
        int m = this.a.m();
        if (this.a.a >= this.a.b) {
            throw InvalidProtocolBufferException.g();
        }
        int c = this.a.c(m);
        T a = cetVar.a();
        this.a.a++;
        cetVar.a(a, this, cdbVar);
        cetVar.d(a);
        this.a.a(0);
        ccv ccvVar = this.a;
        ccvVar.a--;
        this.a.d(c);
        return a;
    }

    private <T> T d(cet<T> cetVar, cdb cdbVar) throws IOException {
        int i = this.c;
        this.c = cff.a(cff.b(this.b), 4);
        try {
            T a = cetVar.a();
            cetVar.a(a, this, cdbVar);
            cetVar.d(a);
            if (this.b == this.c) {
                return a;
            }
            throw InvalidProtocolBufferException.h();
        } finally {
            this.c = i;
        }
    }

    @Override // defpackage.ces
    public final ccu n() throws IOException {
        a(2);
        return this.a.l();
    }

    @Override // defpackage.ces
    public final int o() throws IOException {
        a(0);
        return this.a.m();
    }

    @Override // defpackage.ces
    public final int p() throws IOException {
        a(0);
        return this.a.n();
    }

    @Override // defpackage.ces
    public final int q() throws IOException {
        a(5);
        return this.a.o();
    }

    @Override // defpackage.ces
    public final long r() throws IOException {
        a(1);
        return this.a.p();
    }

    @Override // defpackage.ces
    public final int s() throws IOException {
        a(0);
        return this.a.q();
    }

    @Override // defpackage.ces
    public final long t() throws IOException {
        a(0);
        return this.a.r();
    }

    @Override // defpackage.ces
    public final void a(List<Double> list) throws IOException {
        int a;
        int a2;
        if (list instanceof ccy) {
            ccy ccyVar = (ccy) list;
            int a3 = cff.a(this.b);
            if (a3 == 1) {
                do {
                    ccyVar.a(this.a.b());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int m = this.a.m();
                b(m);
                int u = this.a.u() + m;
                do {
                    ccyVar.a(this.a.b());
                } while (this.a.u() < u);
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 1) {
            do {
                list.add(Double.valueOf(this.a.b()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int m2 = this.a.m();
            b(m2);
            int u2 = this.a.u() + m2;
            do {
                list.add(Double.valueOf(this.a.b()));
            } while (this.a.u() < u2);
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    @Override // defpackage.ces
    public final void b(List<Float> list) throws IOException {
        int a;
        int a2;
        if (list instanceof cdi) {
            cdi cdiVar = (cdi) list;
            int a3 = cff.a(this.b);
            if (a3 == 2) {
                int m = this.a.m();
                c(m);
                int u = this.a.u() + m;
                do {
                    cdiVar.a(this.a.c());
                } while (this.a.u() < u);
                return;
            } else if (a3 == 5) {
                do {
                    cdiVar.a(this.a.c());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 2) {
            int m2 = this.a.m();
            c(m2);
            int u2 = this.a.u() + m2;
            do {
                list.add(Float.valueOf(this.a.c()));
            } while (this.a.u() < u2);
        } else if (a4 == 5) {
            do {
                list.add(Float.valueOf(this.a.c()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    @Override // defpackage.ces
    public final void c(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof cdt) {
            cdt cdtVar = (cdt) list;
            int a3 = cff.a(this.b);
            if (a3 == 0) {
                do {
                    cdtVar.a(this.a.d());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    cdtVar.a(this.a.d());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Long.valueOf(this.a.d()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Long.valueOf(this.a.d()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    @Override // defpackage.ces
    public final void d(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof cdt) {
            cdt cdtVar = (cdt) list;
            int a3 = cff.a(this.b);
            if (a3 == 0) {
                do {
                    cdtVar.a(this.a.e());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    cdtVar.a(this.a.e());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Long.valueOf(this.a.e()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Long.valueOf(this.a.e()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    @Override // defpackage.ces
    public final void e(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof cdl) {
            cdl cdlVar = (cdl) list;
            int a3 = cff.a(this.b);
            if (a3 == 0) {
                do {
                    cdlVar.c(this.a.f());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    cdlVar.c(this.a.f());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Integer.valueOf(this.a.f()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Integer.valueOf(this.a.f()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    @Override // defpackage.ces
    public final void f(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof cdt) {
            cdt cdtVar = (cdt) list;
            int a3 = cff.a(this.b);
            if (a3 == 1) {
                do {
                    cdtVar.a(this.a.g());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int m = this.a.m();
                b(m);
                int u = this.a.u() + m;
                do {
                    cdtVar.a(this.a.g());
                } while (this.a.u() < u);
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 1) {
            do {
                list.add(Long.valueOf(this.a.g()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int m2 = this.a.m();
            b(m2);
            int u2 = this.a.u() + m2;
            do {
                list.add(Long.valueOf(this.a.g()));
            } while (this.a.u() < u2);
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    @Override // defpackage.ces
    public final void g(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof cdl) {
            cdl cdlVar = (cdl) list;
            int a3 = cff.a(this.b);
            if (a3 == 2) {
                int m = this.a.m();
                c(m);
                int u = this.a.u() + m;
                do {
                    cdlVar.c(this.a.h());
                } while (this.a.u() < u);
                return;
            } else if (a3 == 5) {
                do {
                    cdlVar.c(this.a.h());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 2) {
            int m2 = this.a.m();
            c(m2);
            int u2 = this.a.u() + m2;
            do {
                list.add(Integer.valueOf(this.a.h()));
            } while (this.a.u() < u2);
        } else if (a4 == 5) {
            do {
                list.add(Integer.valueOf(this.a.h()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    @Override // defpackage.ces
    public final void h(List<Boolean> list) throws IOException {
        int a;
        int a2;
        if (list instanceof ccs) {
            ccs ccsVar = (ccs) list;
            int a3 = cff.a(this.b);
            if (a3 == 0) {
                do {
                    ccsVar.a(this.a.i());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    ccsVar.a(this.a.i());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Boolean.valueOf(this.a.i()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Boolean.valueOf(this.a.i()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    @Override // defpackage.ces
    public final void i(List<String> list) throws IOException {
        a(list, false);
    }

    @Override // defpackage.ces
    public final void j(List<String> list) throws IOException {
        a(list, true);
    }

    private void a(List<String> list, boolean z) throws IOException {
        int a;
        int a2;
        if (cff.a(this.b) != 2) {
            throw InvalidProtocolBufferException.f();
        }
        if ((list instanceof cdr) && !z) {
            cdr cdrVar = (cdr) list;
            do {
                cdrVar.a(n());
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
    @Override // defpackage.ces
    public final <T> void a(List<T> list, cet<T> cetVar, cdb cdbVar) throws IOException {
        int a;
        if (cff.a(this.b) != 2) {
            throw InvalidProtocolBufferException.f();
        }
        int i = this.b;
        do {
            list.add(c(cetVar, cdbVar));
            if (this.a.t() || this.d != 0) {
                return;
            }
            a = this.a.a();
        } while (a == i);
        this.d = a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ces
    public final <T> void b(List<T> list, cet<T> cetVar, cdb cdbVar) throws IOException {
        int a;
        if (cff.a(this.b) != 3) {
            throw InvalidProtocolBufferException.f();
        }
        int i = this.b;
        do {
            list.add(d(cetVar, cdbVar));
            if (this.a.t() || this.d != 0) {
                return;
            }
            a = this.a.a();
        } while (a == i);
        this.d = a;
    }

    @Override // defpackage.ces
    public final void k(List<ccu> list) throws IOException {
        int a;
        if (cff.a(this.b) != 2) {
            throw InvalidProtocolBufferException.f();
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

    @Override // defpackage.ces
    public final void l(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof cdl) {
            cdl cdlVar = (cdl) list;
            int a3 = cff.a(this.b);
            if (a3 == 0) {
                do {
                    cdlVar.c(this.a.m());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    cdlVar.c(this.a.m());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Integer.valueOf(this.a.m()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Integer.valueOf(this.a.m()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    @Override // defpackage.ces
    public final void m(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof cdl) {
            cdl cdlVar = (cdl) list;
            int a3 = cff.a(this.b);
            if (a3 == 0) {
                do {
                    cdlVar.c(this.a.n());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    cdlVar.c(this.a.n());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Integer.valueOf(this.a.n()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Integer.valueOf(this.a.n()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    @Override // defpackage.ces
    public final void n(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof cdl) {
            cdl cdlVar = (cdl) list;
            int a3 = cff.a(this.b);
            if (a3 == 2) {
                int m = this.a.m();
                c(m);
                int u = this.a.u() + m;
                do {
                    cdlVar.c(this.a.o());
                } while (this.a.u() < u);
                return;
            } else if (a3 == 5) {
                do {
                    cdlVar.c(this.a.o());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 2) {
            int m2 = this.a.m();
            c(m2);
            int u2 = this.a.u() + m2;
            do {
                list.add(Integer.valueOf(this.a.o()));
            } while (this.a.u() < u2);
        } else if (a4 == 5) {
            do {
                list.add(Integer.valueOf(this.a.o()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    @Override // defpackage.ces
    public final void o(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof cdt) {
            cdt cdtVar = (cdt) list;
            int a3 = cff.a(this.b);
            if (a3 == 1) {
                do {
                    cdtVar.a(this.a.p());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int m = this.a.m();
                b(m);
                int u = this.a.u() + m;
                do {
                    cdtVar.a(this.a.p());
                } while (this.a.u() < u);
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 1) {
            do {
                list.add(Long.valueOf(this.a.p()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int m2 = this.a.m();
            b(m2);
            int u2 = this.a.u() + m2;
            do {
                list.add(Long.valueOf(this.a.p()));
            } while (this.a.u() < u2);
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    @Override // defpackage.ces
    public final void p(List<Integer> list) throws IOException {
        int a;
        int a2;
        if (list instanceof cdl) {
            cdl cdlVar = (cdl) list;
            int a3 = cff.a(this.b);
            if (a3 == 0) {
                do {
                    cdlVar.c(this.a.q());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    cdlVar.c(this.a.q());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Integer.valueOf(this.a.q()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Integer.valueOf(this.a.q()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    @Override // defpackage.ces
    public final void q(List<Long> list) throws IOException {
        int a;
        int a2;
        if (list instanceof cdt) {
            cdt cdtVar = (cdt) list;
            int a3 = cff.a(this.b);
            if (a3 == 0) {
                do {
                    cdtVar.a(this.a.r());
                    if (this.a.t()) {
                        return;
                    }
                    a2 = this.a.a();
                } while (a2 == this.b);
                this.d = a2;
                return;
            } else if (a3 == 2) {
                int u = this.a.u() + this.a.m();
                do {
                    cdtVar.a(this.a.r());
                } while (this.a.u() < u);
                d(u);
                return;
            } else {
                throw InvalidProtocolBufferException.f();
            }
        }
        int a4 = cff.a(this.b);
        if (a4 == 0) {
            do {
                list.add(Long.valueOf(this.a.r()));
                if (this.a.t()) {
                    return;
                }
                a = this.a.a();
            } while (a == this.b);
            this.d = a;
        } else if (a4 == 2) {
            int u2 = this.a.u() + this.a.m();
            do {
                list.add(Long.valueOf(this.a.r()));
            } while (this.a.u() < u2);
            d(u2);
        } else {
            throw InvalidProtocolBufferException.f();
        }
    }

    private static void b(int i) throws IOException {
        if ((i & 7) == 0) {
            return;
        }
        throw InvalidProtocolBufferException.h();
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x005b, code lost:
        r8.put(r2, r3);
     */
    /* JADX WARN: Code restructure failed: missing block: B:24:0x0063, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.ces
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <K, V> void a(java.util.Map<K, V> r8, defpackage.cdv.a<K, V> r9, defpackage.cdb r10) throws java.io.IOException {
        /*
            r7 = this;
            r0 = 2
            r7.a(r0)
            ccv r1 = r7.a
            int r1 = r1.m()
            ccv r2 = r7.a
            int r1 = r2.c(r1)
            K r2 = r9.b
            V r3 = r9.d
        L14:
            int r4 = r7.a()     // Catch: java.lang.Throwable -> L64
            r5 = 2147483647(0x7fffffff, float:NaN)
            if (r4 == r5) goto L5b
            ccv r5 = r7.a     // Catch: java.lang.Throwable -> L64
            boolean r5 = r5.t()     // Catch: java.lang.Throwable -> L64
            if (r5 != 0) goto L5b
            r5 = 1
            java.lang.String r6 = "Unable to parse map entry."
            if (r4 == r5) goto L46
            if (r4 == r0) goto L39
            boolean r4 = r7.c()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L64
            if (r4 == 0) goto L33
            goto L14
        L33:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r4 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L64
            r4.<init>(r6)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L64
            throw r4     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L64
        L39:
            cff$a r4 = r9.c     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L64
            V r5 = r9.d     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L64
            java.lang.Class r5 = r5.getClass()     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L64
            java.lang.Object r3 = r7.a(r4, r5, r10)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L64
            goto L14
        L46:
            cff$a r4 = r9.a     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L64
            r5 = 0
            java.lang.Object r2 = r7.a(r4, r5, r5)     // Catch: com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.InvalidWireTypeException -> L4e java.lang.Throwable -> L64
            goto L14
        L4e:
            boolean r4 = r7.c()     // Catch: java.lang.Throwable -> L64
            if (r4 == 0) goto L55
            goto L14
        L55:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r8 = new com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException     // Catch: java.lang.Throwable -> L64
            r8.<init>(r6)     // Catch: java.lang.Throwable -> L64
            throw r8     // Catch: java.lang.Throwable -> L64
        L5b:
            r8.put(r2, r3)     // Catch: java.lang.Throwable -> L64
            ccv r8 = r7.a
            r8.d(r1)
            return
        L64:
            r8 = move-exception
            ccv r9 = r7.a
            r9.d(r1)
            throw r8
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ccw.a(java.util.Map, cdv$a, cdb):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ccw$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cff.a.values().length];
            a = iArr;
            try {
                iArr[cff.a.BOOL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cff.a.BYTES.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cff.a.DOUBLE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[cff.a.ENUM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[cff.a.FIXED32.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[cff.a.FIXED64.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[cff.a.FLOAT.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[cff.a.INT32.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[cff.a.INT64.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[cff.a.MESSAGE.ordinal()] = 10;
            } catch (NoSuchFieldError unused10) {
            }
            try {
                a[cff.a.SFIXED32.ordinal()] = 11;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                a[cff.a.SFIXED64.ordinal()] = 12;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                a[cff.a.SINT32.ordinal()] = 13;
            } catch (NoSuchFieldError unused13) {
            }
            try {
                a[cff.a.SINT64.ordinal()] = 14;
            } catch (NoSuchFieldError unused14) {
            }
            try {
                a[cff.a.STRING.ordinal()] = 15;
            } catch (NoSuchFieldError unused15) {
            }
            try {
                a[cff.a.UINT32.ordinal()] = 16;
            } catch (NoSuchFieldError unused16) {
            }
            try {
                a[cff.a.UINT64.ordinal()] = 17;
            } catch (NoSuchFieldError unused17) {
            }
        }
    }

    private Object a(cff.a aVar, Class<?> cls, cdb cdbVar) throws IOException {
        switch (AnonymousClass1.a[aVar.ordinal()]) {
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
                return a(cls, cdbVar);
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
        throw InvalidProtocolBufferException.h();
    }

    private void d(int i) throws IOException {
        if (this.a.u() == i) {
            return;
        }
        throw InvalidProtocolBufferException.a();
    }
}
