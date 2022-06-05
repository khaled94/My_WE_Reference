package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Scope;
import defpackage.vc;
import defpackage.vf;
import java.util.Set;

/* renamed from: yn  reason: default package */
/* loaded from: classes2.dex */
public final class yn extends bvr implements vf.b, vf.c {
    private static final vc.a<? extends bwe, bvn> a = bwd.c;
    private final Context b;
    private final Handler c;
    private final vc.a<? extends bwe, bvn> d;
    private final Set<Scope> e;
    private final aaf f;
    private bwe g;
    private ym h;

    public yn(Context context, Handler handler, aaf aafVar) {
        vc.a<? extends bwe, bvn> aVar = a;
        this.b = context;
        this.c = handler;
        this.f = (aaf) aat.a(aafVar, "ClientSettings must not be null");
        this.e = aafVar.b;
        this.d = aVar;
    }

    public final void a() {
        bwe bweVar = this.g;
        if (bweVar != null) {
            bweVar.i();
        }
    }

    @Override // defpackage.vr
    public final void a(int i) {
        this.g.i();
    }

    @Override // defpackage.vr
    public final void a(Bundle bundle) {
        this.g.a(this);
    }

    @Override // defpackage.bvr, defpackage.bvt
    public final void a(bvz bvzVar) {
        this.c.post(new yl(this, bvzVar));
    }

    @Override // defpackage.vz
    public final void a(ConnectionResult connectionResult) {
        this.h.b(connectionResult);
    }

    public final void a(ym ymVar) {
        bwe bweVar = this.g;
        if (bweVar != null) {
            bweVar.i();
        }
        this.f.h = Integer.valueOf(System.identityHashCode(this));
        vc.a<? extends bwe, bvn> aVar = this.d;
        Context context = this.b;
        Looper looper = this.c.getLooper();
        aaf aafVar = this.f;
        this.g = aVar.a(context, looper, aafVar, (aaf) aafVar.g, (vf.b) this, (vf.c) this);
        this.h = ymVar;
        Set<Scope> set = this.e;
        if (set == null || set.isEmpty()) {
            this.c.post(new yk(this));
        } else {
            this.g.B();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(yn ynVar, bvz bvzVar) {
        ConnectionResult connectionResult = bvzVar.b;
        if (connectionResult.b()) {
            ace aceVar = (ace) aat.a(bvzVar.c);
            ConnectionResult connectionResult2 = aceVar.c;
            if (!connectionResult2.b()) {
                String valueOf = String.valueOf(connectionResult2);
                String.valueOf(valueOf).length();
                Log.wtf("SignInCoordinator", "Sign-in succeeded with resolve account failure: ".concat(String.valueOf(valueOf)), new Exception());
                ynVar.h.b(connectionResult2);
                ynVar.g.i();
                return;
            }
            ynVar.h.a(aceVar.a(), ynVar.e);
        } else {
            ynVar.h.b(connectionResult);
        }
        ynVar.g.i();
    }
}
