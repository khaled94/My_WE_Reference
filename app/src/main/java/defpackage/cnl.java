package defpackage;

import com.google.firebase.iid.FirebaseInstanceId;
import com.google.firebase.iid.Registrar;

/* renamed from: cnl  reason: default package */
/* loaded from: classes2.dex */
public final /* synthetic */ class cnl implements cme {
    public static final cme a = new cnl();

    private cnl() {
    }

    @Override // defpackage.cme
    public final Object a(cmc cmcVar) {
        return new Registrar.a((FirebaseInstanceId) cmcVar.a(FirebaseInstanceId.class));
    }
}
