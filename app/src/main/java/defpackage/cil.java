package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.wf;

/* renamed from: cil  reason: default package */
/* loaded from: classes2.dex */
public final class cil extends cjf<chi, cjq> {
    private final akr w;

    public cil(chh chhVar, String str) {
        super(2);
        aat.a(chhVar, "credential cannot be null");
        alr a = ckg.a(chhVar, str);
        a.a = false;
        this.w = new akr(a);
    }

    @Override // defpackage.cid
    public final String a() {
        return "reauthenticateWithCredentialWithData";
    }

    @Override // defpackage.cid
    public final wf<ciu, chi> b() {
        wf.a a = wf.a();
        a.b = false;
        a.c = this.t ? null : new uw[]{aky.a};
        a.a = new wb(this) { // from class: cik
            private final cil a;

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
