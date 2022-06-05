package defpackage;

import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.wf;

/* renamed from: cip  reason: default package */
/* loaded from: classes2.dex */
public final class cip extends cjf<chi, cjq> {
    private final akt w;

    public cip(String str, String str2, String str3) {
        super(2);
        aat.a(str, (Object) "email cannot be null or empty");
        aat.a(str2, (Object) "password cannot be null or empty");
        this.w = new akt(str, str2, str3);
    }

    @Override // defpackage.cid
    public final String a() {
        return "reauthenticateWithEmailPasswordWithData";
    }

    @Override // defpackage.cid
    public final wf<ciu, chi> b() {
        wf.a a = wf.a();
        a.b = false;
        a.c = this.t ? null : new uw[]{aky.a};
        a.a = new wb(this) { // from class: cio
            private final cip a;

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
            ciuVar.A().a(this.w.a, this.w.b, this.b);
        } else {
            ciuVar.A().a(this.w, this.b);
        }
    }
}
