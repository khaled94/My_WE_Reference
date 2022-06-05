package defpackage;

/* renamed from: ie  reason: default package */
/* loaded from: classes2.dex */
public final class ie extends hu<ic> implements ea {
    public ie(ic icVar) {
        super(icVar);
    }

    @Override // defpackage.ee
    public final Class<ic> a() {
        return ic.class;
    }

    @Override // defpackage.ee
    public final int c() {
        ig igVar = ((ic) this.a).a.a;
        return igVar.a.g() + igVar.j;
    }

    @Override // defpackage.ee
    public final void d() {
        ((ic) this.a).stop();
        ic icVar = (ic) this.a;
        icVar.b = true;
        ig igVar = icVar.a.a;
        igVar.b.clear();
        igVar.b();
        igVar.d = false;
        if (igVar.e != null) {
            igVar.c.a(igVar.e);
            igVar.e = null;
        }
        if (igVar.g != null) {
            igVar.c.a(igVar.g);
            igVar.g = null;
        }
        if (igVar.i != null) {
            igVar.c.a(igVar.i);
            igVar.i = null;
        }
        igVar.a.i();
        igVar.f = true;
    }

    @Override // defpackage.hu, defpackage.ea
    public final void e() {
        ((ic) this.a).a().prepareToDraw();
    }
}
