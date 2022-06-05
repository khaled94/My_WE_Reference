package defpackage;

import android.os.Bundle;
import android.os.DeadObjectException;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;
import defpackage.vc;
import defpackage.vq;
import java.util.Set;

/* renamed from: wp  reason: default package */
/* loaded from: classes2.dex */
public final class wp implements xg {
    final xj a;
    private boolean b = false;

    public wp(xj xjVar) {
        this.a = xjVar;
    }

    @Override // defpackage.xg
    public final <A extends vc.b, R extends vi, T extends vq.a<R, A>> T a(T t) {
        b(t);
        return t;
    }

    @Override // defpackage.xg
    public final void a() {
    }

    @Override // defpackage.xg
    public final void a(int i) {
        this.a.a((ConnectionResult) null);
        this.a.n.a(i, this.b);
    }

    @Override // defpackage.xg
    public final void a(Bundle bundle) {
    }

    @Override // defpackage.xg
    public final void a(ConnectionResult connectionResult, vc<?> vcVar, boolean z) {
    }

    @Override // defpackage.xg
    public final <A extends vc.b, T extends vq.a<? extends vi, A>> T b(T t) {
        try {
            this.a.m.i.a(t);
            xf xfVar = this.a.m;
            vc.f fVar = xfVar.c.get(t.a);
            aat.a(fVar, "Appropriate Api was not requested.");
            if (fVar.j() || !this.a.g.containsKey(t.a)) {
                t.b(fVar);
            } else {
                t.b(new Status(17));
            }
        } catch (DeadObjectException unused) {
            this.a.a(new wn(this, this));
        }
        return t;
    }

    @Override // defpackage.xg
    public final void b() {
        if (this.b) {
            this.b = false;
            this.a.a(new wo(this, this));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        if (this.b) {
            this.b = false;
            this.a.m.i.a();
            d();
        }
    }

    @Override // defpackage.xg
    public final boolean d() {
        if (this.b) {
            return false;
        }
        Set<ys> set = this.a.m.h;
        if (set == null || set.isEmpty()) {
            this.a.a((ConnectionResult) null);
            return true;
        }
        this.b = true;
        for (ys ysVar : set) {
            ysVar.c = null;
        }
        return false;
    }
}
