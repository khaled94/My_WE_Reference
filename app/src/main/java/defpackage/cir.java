package defpackage;

import android.os.RemoteException;
import defpackage.wf;

/* renamed from: cir  reason: default package */
/* loaded from: classes2.dex */
public final class cir extends cjf<chi, cjq> {
    private final akr w;

    public cir(chh chhVar, String str) {
        super(2);
        aat.a(chhVar, "credential cannot be null");
        this.w = new akr(ckg.a(chhVar, str));
    }

    @Override // defpackage.cid
    public final String a() {
        return "signInWithCredential";
    }

    @Override // defpackage.cid
    public final wf<ciu, chi> b() {
        wf.a a = wf.a();
        a.b = false;
        a.c = this.t ? null : new uw[]{aky.a};
        a.a = new wb(this) { // from class: ciq
            private final cir a;

            /* JADX INFO: Access modifiers changed from: package-private */
            {
                this.a = this;
            }

            @Override // defpackage.wb
            public final void a(Object obj, Object obj2) {
                this.a.a((ciu) obj, (bwm) obj2);
            }
        };
        return a.a();
    }

    @Override // defpackage.cjf
    public final void d() {
        ckq a = cif.a(this.c, this.k);
        ((cjq) this.e).a(this.j, a);
        b(new ckk(a));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final /* synthetic */ void a(ciu ciuVar, bwm bwmVar) throws RemoteException {
        this.g = new cjm(this, bwmVar);
        if (this.t) {
            ciuVar.A().a(this.w.a, this.b);
        } else {
            ciuVar.A().a(this.w, this.b);
        }
    }
}
