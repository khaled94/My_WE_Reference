package defpackage;

import com.google.android.gms.common.ConnectionResult;

/* renamed from: ws  reason: default package */
/* loaded from: classes2.dex */
final class ws extends xh {
    final /* synthetic */ ConnectionResult a;
    final /* synthetic */ wu b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ws(wu wuVar, xg xgVar, ConnectionResult connectionResult) {
        super(xgVar);
        this.b = wuVar;
        this.a = connectionResult;
    }

    @Override // defpackage.xh
    public final void a() {
        this.b.a.a(this.a);
    }
}
