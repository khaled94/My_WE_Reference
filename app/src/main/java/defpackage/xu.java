package defpackage;

import android.os.Handler;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import defpackage.aad;
import defpackage.vc;
import java.util.Map;
import java.util.Set;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xu  reason: default package */
/* loaded from: classes2.dex */
public final class xu implements aad.c, ym {
    final vc.f a;
    final vo<?> b;
    final /* synthetic */ vs d;
    private aal e = null;
    private Set<Scope> f = null;
    boolean c = false;

    public xu(vs vsVar, vc.f fVar, vo<?> voVar) {
        this.d = vsVar;
        this.a = fVar;
        this.b = voVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        aal aalVar;
        if (!this.c || (aalVar = this.e) == null) {
            return;
        }
        this.a.a(aalVar, this.f);
    }

    @Override // defpackage.aad.c
    public final void a(ConnectionResult connectionResult) {
        Handler handler;
        handler = this.d.f;
        handler.post(new xt(this, connectionResult));
    }

    @Override // defpackage.ym
    public final void b(ConnectionResult connectionResult) {
        Map map;
        Handler handler;
        map = this.d.s;
        xr xrVar = (xr) map.get(this.b);
        if (xrVar != null) {
            handler = xrVar.i.f;
            aat.a(handler);
            vc.f fVar = xrVar.a;
            String name = fVar.getClass().getName();
            String valueOf = String.valueOf(connectionResult);
            StringBuilder sb = new StringBuilder(String.valueOf(name).length() + 25 + String.valueOf(valueOf).length());
            sb.append("onSignInFailed for ");
            sb.append(name);
            sb.append(" with ");
            sb.append(valueOf);
            fVar.a(sb.toString());
            xrVar.a(connectionResult, (Exception) null);
        }
    }

    @Override // defpackage.ym
    public final void a(aal aalVar, Set<Scope> set) {
        if (aalVar == null || set == null) {
            Log.wtf("GoogleApiManager", "Received null response from onSignInSuccess", new Exception());
            b(new ConnectionResult(4));
            return;
        }
        this.e = aalVar;
        this.f = set;
        a();
    }
}
