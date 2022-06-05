package defpackage;

import android.util.Log;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: ww  reason: default package */
/* loaded from: classes2.dex */
final class ww extends xh {
    final /* synthetic */ xa a;
    final /* synthetic */ bvz b;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ww(xg xgVar, xa xaVar, bvz bvzVar) {
        super(xgVar);
        this.a = xaVar;
        this.b = bvzVar;
    }

    @Override // defpackage.xh
    public final void a() {
        xa xaVar = this.a;
        bvz bvzVar = this.b;
        if (xaVar.b(0)) {
            ConnectionResult connectionResult = bvzVar.b;
            if (connectionResult.b()) {
                ace aceVar = (ace) aat.a(bvzVar.c);
                connectionResult = aceVar.c;
                if (!connectionResult.b()) {
                    String valueOf = String.valueOf(connectionResult);
                    String.valueOf(valueOf).length();
                    Log.wtf("GACConnecting", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
                } else {
                    xaVar.g = true;
                    xaVar.h = (aal) aat.a(aceVar.a());
                    xaVar.i = aceVar.d;
                    xaVar.j = aceVar.e;
                    xaVar.e();
                    return;
                }
            } else if (xaVar.b(connectionResult)) {
                xaVar.c();
                xaVar.e();
                return;
            }
            xaVar.a(connectionResult);
        }
    }
}
