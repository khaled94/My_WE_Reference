package defpackage;

import com.google.android.gms.common.api.Status;
import com.google.firebase.auth.FirebaseAuth;

/* renamed from: cjm  reason: default package */
/* loaded from: classes2.dex */
public final class cjm<ResultT, CallbackT> implements cje<ResultT> {
    private final cjf<ResultT, CallbackT> a;
    private final bwm<ResultT> b;

    public cjm(cjf<ResultT, CallbackT> cjfVar, bwm<ResultT> bwmVar) {
        this.a = cjfVar;
        this.b = bwmVar;
    }

    @Override // defpackage.cje
    public final void a(ResultT resultt, Status status) {
        aat.a(this.b, "completion source cannot be null");
        if (status != null) {
            if (this.a.s != null) {
                this.b.a(civ.a(FirebaseAuth.getInstance(this.a.c), this.a.s));
                return;
            } else if (this.a.p != null) {
                this.b.a(civ.a(status, this.a.p, this.a.q, this.a.r));
                return;
            } else {
                this.b.a(civ.a(status));
                return;
            }
        }
        this.b.a((bwm<ResultT>) resultt);
    }
}
