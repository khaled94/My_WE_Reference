package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.wf;

/* renamed from: cin  reason: default package */
/* loaded from: classes2.dex */
public final class cin extends cjf<chi, cjq> {
    private final akv w;

    public cin(chj chjVar) {
        super(2);
        aat.a(chjVar, "credential cannot be null or empty");
        this.w = new akv(chjVar);
    }

    @Override // defpackage.cid
    public final String a() {
        return "reauthenticateWithEmailLinkWithData";
    }

    @Override // defpackage.cid
    public final wf<ciu, chi> b() {
        wf.a a = wf.a();
        a.b = false;
        a.c = this.t ? null : new uw[]{aky.a};
        a.a = new wb(this) { // from class: cim
            private final cin a;

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
        if (this.d.a().equalsIgnoreCase(a.a())) {
            ((cjq) this.e).a(this.j, a);
            b(new ckk(a));
            return;
        }
        a(new Status(17024));
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
