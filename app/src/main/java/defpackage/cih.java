package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;
import defpackage.wf;

/* renamed from: cih  reason: default package */
/* loaded from: classes2.dex */
public final class cih extends cjf<cho, cjq> {
    private final akm w;

    public cih(String str) {
        super(1);
        aat.a(str, (Object) "refresh token cannot be null");
        this.w = new akm(str);
    }

    @Override // defpackage.cid
    public final String a() {
        return "getAccessToken";
    }

    @Override // defpackage.cid
    public final wf<ciu, cho> b() {
        wf.a a = wf.a();
        a.b = false;
        a.c = this.t ? null : new uw[]{aky.a};
        a.a = new wb(this) { // from class: cig
            private final cih a;

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
        if (TextUtils.isEmpty(this.j.a)) {
            this.j.a = aat.a(this.w.a);
        }
        ((cjq) this.e).a(this.j, this.d);
        b(cjw.a(this.j.b));
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
