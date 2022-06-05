package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: act  reason: default package */
/* loaded from: classes.dex */
public final class act extends acg {
    final /* synthetic */ aad e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public act(aad aadVar, int i) {
        super(aadVar, i, null);
        this.e = aadVar;
    }

    @Override // defpackage.acg
    protected final boolean b() {
        this.e.h.a(ConnectionResult.a);
        return true;
    }

    @Override // defpackage.acg
    protected final void a(ConnectionResult connectionResult) {
        this.e.h.a(connectionResult);
        this.e.a(connectionResult);
    }
}
