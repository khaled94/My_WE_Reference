package defpackage;

import defpackage.cuc;

/* renamed from: cub  reason: default package */
/* loaded from: classes2.dex */
public final class cub {
    public float a;
    public boolean b;
    private cuc c;
    private cuc.a d;
    private cun e;
    private cva f;

    public cub(cva cvaVar, cuc.a aVar) {
        this.c = new cuc(aVar);
        this.d = aVar;
        this.f = cvaVar;
    }

    public final void a() {
        cun cunVar = this.e;
        if (cunVar != null) {
            cunVar.c();
        }
    }

    /* renamed from: cub$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[cum.values().length];
            a = iArr;
            try {
                iArr[cum.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[cum.COLOR.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[cum.SCALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                a[cum.WORM.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                a[cum.FILL.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                a[cum.SLIDE.ordinal()] = 6;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                a[cum.THIN_WORM.ordinal()] = 7;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                a[cum.DROP.ordinal()] = 8;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[cum.SWAP.ordinal()] = 9;
            } catch (NoSuchFieldError unused9) {
            }
        }
    }

    public final void b() {
        switch (AnonymousClass1.a[this.f.c().ordinal()]) {
            case 1:
                this.d.a(null);
                return;
            case 2:
                c();
                return;
            case 3:
                d();
                return;
            case 4:
                e();
                return;
            case 5:
                g();
                return;
            case 6:
                f();
                return;
            case 7:
                h();
                return;
            case 8:
                i();
                return;
            case 9:
                j();
                return;
            default:
                return;
        }
    }

    private void c() {
        int i = this.f.l;
        int i2 = this.f.k;
        cun a = this.c.a().a(i2, i).a(this.f.p);
        if (this.b) {
            a.a(this.a);
        } else {
            a.b();
        }
        this.e = a;
    }

    private void d() {
        int i = this.f.l;
        int i2 = this.f.k;
        int i3 = this.f.c;
        float f = this.f.j;
        cun a = this.c.b().a(i2, i, i3, f).a(this.f.p);
        if (this.b) {
            a.a(this.a);
        } else {
            a.b();
        }
        this.e = a;
    }

    private void e() {
        int i;
        int i2;
        if (this.f.a()) {
            i = this.f.r;
        } else {
            i = this.f.t;
        }
        if (this.f.a()) {
            i2 = this.f.s;
        } else {
            i2 = this.f.r;
        }
        int a = cvp.a(this.f, i);
        int a2 = cvp.a(this.f, i2);
        boolean z = i2 > i;
        cuv a3 = this.c.c().a(a, a2, this.f.c, z).a(this.f.p);
        if (this.b) {
            a3.a(this.a);
        } else {
            a3.b();
        }
        this.e = a3;
    }

    private void f() {
        int i;
        int i2;
        if (this.f.a()) {
            i = this.f.r;
        } else {
            i = this.f.t;
        }
        if (this.f.a()) {
            i2 = this.f.s;
        } else {
            i2 = this.f.r;
        }
        int a = cvp.a(this.f, i);
        int a2 = cvp.a(this.f, i2);
        cun a3 = this.c.d().a(a, a2).a(this.f.p);
        if (this.b) {
            a3.a(this.a);
        } else {
            a3.b();
        }
        this.e = a3;
    }

    private void g() {
        int i = this.f.l;
        int i2 = this.f.k;
        int i3 = this.f.c;
        int i4 = this.f.i;
        cun a = this.c.e().a(i2, i, i3, i4).a(this.f.p);
        if (this.b) {
            a.a(this.a);
        } else {
            a.b();
        }
        this.e = a;
    }

    private void h() {
        int i;
        int i2;
        if (this.f.a()) {
            i = this.f.r;
        } else {
            i = this.f.t;
        }
        if (this.f.a()) {
            i2 = this.f.s;
        } else {
            i2 = this.f.r;
        }
        int a = cvp.a(this.f, i);
        int a2 = cvp.a(this.f, i2);
        boolean z = i2 > i;
        cuv a3 = this.c.f().a(a, a2, this.f.c, z).a(this.f.p);
        if (this.b) {
            a3.a(this.a);
        } else {
            a3.b();
        }
        this.e = a3;
    }

    private void i() {
        int i;
        int i2;
        if (this.f.a()) {
            i = this.f.r;
        } else {
            i = this.f.t;
        }
        if (this.f.a()) {
            i2 = this.f.s;
        } else {
            i2 = this.f.r;
        }
        int a = cvp.a(this.f, i);
        int a2 = cvp.a(this.f, i2);
        int i3 = this.f.f;
        int i4 = this.f.e;
        if (this.f.b() != cvb.HORIZONTAL) {
            i3 = i4;
        }
        int i5 = this.f.c;
        cup a3 = this.c.g().b(this.f.p).a(a, a2, (i5 * 3) + i3, i5 + i3, i5);
        if (this.b) {
            a3.a(this.a);
        } else {
            a3.b();
        }
        this.e = a3;
    }

    private void j() {
        int i;
        int i2;
        if (this.f.a()) {
            i = this.f.r;
        } else {
            i = this.f.t;
        }
        if (this.f.a()) {
            i2 = this.f.s;
        } else {
            i2 = this.f.r;
        }
        int a = cvp.a(this.f, i);
        int a2 = cvp.a(this.f, i2);
        cun a3 = this.c.h().a(a, a2).a(this.f.p);
        if (this.b) {
            a3.a(this.a);
        } else {
            a3.b();
        }
        this.e = a3;
    }
}
