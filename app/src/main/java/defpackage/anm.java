package defpackage;

import android.content.Context;
import android.os.Looper;
import defpackage.vf;

/* renamed from: anm  reason: default package */
/* loaded from: classes.dex */
public final class anm extends anw {
    private final anl m;

    public anm(Context context, Looper looper, vf.b bVar, vf.c cVar, String str, aaf aafVar) {
        super(context, looper, bVar, cVar, str, aafVar);
        this.m = new anl(context, this.a);
    }

    @Override // defpackage.aad, defpackage.vc.f
    public final void i() {
        synchronized (this.m) {
            if (j()) {
                try {
                    anl anlVar = this.m;
                    synchronized (anlVar.c) {
                        for (ank ankVar : anlVar.c.values()) {
                            if (ankVar != null) {
                                ((anv) anlVar.a).a().a(anq.a(ankVar));
                            }
                        }
                        anlVar.c.clear();
                    }
                    synchronized (anlVar.e) {
                        for (anh anhVar : anlVar.e.values()) {
                            if (anhVar != null) {
                                ((anv) anlVar.a).a().a(anq.a(anhVar));
                            }
                        }
                        anlVar.e.clear();
                    }
                    synchronized (anlVar.d) {
                        for (ani aniVar : anlVar.d.values()) {
                            if (aniVar != null) {
                                ((anv) anlVar.a).a().a(new anz(2, null, aniVar, null));
                            }
                        }
                        anlVar.d.clear();
                    }
                    anl anlVar2 = this.m;
                    if (anlVar2.b) {
                        ((anv) anlVar2.a).a.v();
                        ((anv) anlVar2.a).a().b();
                        anlVar2.b = false;
                    }
                } catch (Exception unused) {
                }
            }
            super.i();
        }
    }

    @Override // defpackage.aad
    public final boolean y() {
        return true;
    }
}
