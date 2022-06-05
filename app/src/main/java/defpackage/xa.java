package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Looper;
import android.util.Log;
import com.google.android.gms.common.ConnectionResult;
import defpackage.vc;
import defpackage.vf;
import defpackage.vq;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Future;
import java.util.concurrent.locks.Lock;

/* renamed from: xa  reason: default package */
/* loaded from: classes2.dex */
public final class xa implements xg {
    final xj a;
    final Lock b;
    final Context c;
    final uy d;
    bwe e;
    boolean f;
    boolean g;
    aal h;
    boolean i;
    boolean j;
    final aaf k;
    private ConnectionResult l;
    private int m;
    private int o;
    private boolean r;
    private final Map<vc<?>, Boolean> s;
    private final vc.a<? extends bwe, bvn> t;
    private int n = 0;
    private final Bundle p = new Bundle();
    private final Set<vc.c> q = new HashSet();
    private final ArrayList<Future<?>> u = new ArrayList<>();

    public xa(xj xjVar, aaf aafVar, Map<vc<?>, Boolean> map, uy uyVar, vc.a<? extends bwe, bvn> aVar, Lock lock, Context context) {
        this.a = xjVar;
        this.k = aafVar;
        this.s = map;
        this.d = uyVar;
        this.t = aVar;
        this.b = lock;
        this.c = context;
    }

    private final void a(boolean z) {
        bwe bweVar = this.e;
        if (bweVar != null) {
            if (bweVar.j() && z) {
                bweVar.A();
            }
            bweVar.i();
            aat.a(this.k);
            this.h = null;
        }
    }

    private static final String c(int i) {
        return i != 0 ? "STEP_GETTING_REMOTE_SERVICE" : "STEP_SERVICE_BINDINGS_AND_SIGN_IN";
    }

    private final void g() {
        ArrayList<Future<?>> arrayList = this.u;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).cancel(true);
        }
        this.u.clear();
    }

    /* JADX WARN: Finally extract failed */
    private final void h() {
        xj xjVar = this.a;
        xjVar.a.lock();
        try {
            xjVar.m.i();
            xjVar.k = new wp(xjVar);
            xjVar.k.a();
            xjVar.b.signalAll();
            xjVar.a.unlock();
            xk.a().execute(new wq(this));
            bwe bweVar = this.e;
            if (bweVar != null) {
                if (this.i) {
                    bweVar.a((aal) aat.a(this.h), this.j);
                }
                a(false);
            }
            for (vc.c<?> cVar : this.a.g.keySet()) {
                ((vc.f) aat.a(this.a.f.get(cVar))).i();
            }
            this.a.n.a(this.p.isEmpty() ? null : this.p);
        } catch (Throwable th) {
            xjVar.a.unlock();
            throw th;
        }
    }

    @Override // defpackage.xg
    public final <A extends vc.b, R extends vi, T extends vq.a<R, A>> T a(T t) {
        this.a.m.a.add(t);
        return t;
    }

    @Override // defpackage.xg
    public final void a() {
        this.a.g.clear();
        this.f = false;
        this.l = null;
        this.n = 0;
        this.r = true;
        this.g = false;
        this.i = false;
        HashMap hashMap = new HashMap();
        for (vc<?> vcVar : this.s.keySet()) {
            vc.f fVar = (vc.f) aat.a(this.a.f.get(vcVar.b));
            boolean booleanValue = this.s.get(vcVar).booleanValue();
            if (fVar.m()) {
                this.f = true;
                if (booleanValue) {
                    this.q.add(vcVar.b);
                } else {
                    this.r = false;
                }
            }
            hashMap.put(fVar, new wr(this, vcVar, booleanValue));
        }
        if (this.f) {
            aat.a(this.k);
            aat.a(this.t);
            this.k.h = Integer.valueOf(System.identityHashCode(this.a.m));
            wy wyVar = new wy(this);
            vc.a<? extends bwe, bvn> aVar = this.t;
            Context context = this.c;
            Looper a = this.a.m.a();
            aaf aafVar = this.k;
            this.e = aVar.a(context, a, aafVar, (aaf) aafVar.g, (vf.b) wyVar, (vf.c) wyVar);
        }
        this.o = this.a.f.size();
        this.u.add(xk.a().submit(new wu(this, hashMap)));
    }

    @Override // defpackage.xg
    public final void a(int i) {
        a(new ConnectionResult(8, null));
    }

    @Override // defpackage.xg
    public final void a(Bundle bundle) {
        if (!b(1)) {
            return;
        }
        if (bundle != null) {
            this.p.putAll(bundle);
        }
        if (!f()) {
            return;
        }
        h();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(ConnectionResult connectionResult) {
        g();
        a(!connectionResult.a());
        this.a.a(connectionResult);
        this.a.n.a(connectionResult);
    }

    @Override // defpackage.xg
    public final void a(ConnectionResult connectionResult, vc<?> vcVar, boolean z) {
        if (!b(1)) {
            return;
        }
        b(connectionResult, vcVar, z);
        if (!f()) {
            return;
        }
        h();
    }

    @Override // defpackage.xg
    public final <A extends vc.b, T extends vq.a<? extends vi, A>> T b(T t) {
        throw new IllegalStateException("GoogleApiClient is not connected yet.");
    }

    @Override // defpackage.xg
    public final void b() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(int i) {
        if (this.n != i) {
            this.a.m.h();
            "Unexpected callback in ".concat(toString());
            int i2 = this.o;
            StringBuilder sb = new StringBuilder(33);
            sb.append("mRemainingConnections=");
            sb.append(i2);
            String c = c(this.n);
            String c2 = c(i);
            StringBuilder sb2 = new StringBuilder(c.length() + 70 + c2.length());
            sb2.append("GoogleApiClient connecting is in step ");
            sb2.append(c);
            sb2.append(" but received callback for step ");
            sb2.append(c2);
            new Exception();
            a(new ConnectionResult(8, null));
            return false;
        }
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(ConnectionResult connectionResult) {
        return this.r && !connectionResult.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.f = false;
        this.a.m.d = Collections.emptySet();
        for (vc.c<?> cVar : this.q) {
            if (!this.a.g.containsKey(cVar)) {
                this.a.g.put(cVar, new ConnectionResult(17, null));
            }
        }
    }

    @Override // defpackage.xg
    public final boolean d() {
        g();
        a(true);
        this.a.a((ConnectionResult) null);
        return true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void e() {
        if (this.o != 0) {
            return;
        }
        if (this.f && !this.g) {
            return;
        }
        ArrayList arrayList = new ArrayList();
        this.n = 1;
        this.o = this.a.f.size();
        for (vc.c<?> cVar : this.a.f.keySet()) {
            if (this.a.g.containsKey(cVar)) {
                if (f()) {
                    h();
                }
            } else {
                arrayList.add(this.a.f.get(cVar));
            }
        }
        if (arrayList.isEmpty()) {
            return;
        }
        this.u.add(xk.a().submit(new wv(this, arrayList)));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean f() {
        int i = this.o - 1;
        this.o = i;
        if (i > 0) {
            return false;
        }
        if (i < 0) {
            this.a.m.h();
            Log.wtf("GACConnecting", "GoogleApiClient received too many callbacks for the given step. Clients may be in an unexpected state; GoogleApiClient will now disconnect.", new Exception());
            a(new ConnectionResult(8, null));
            return false;
        }
        ConnectionResult connectionResult = this.l;
        if (connectionResult == null) {
            return true;
        }
        this.a.l = this.m;
        a(connectionResult);
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(ConnectionResult connectionResult, vc<?> vcVar, boolean z) {
        if ((!z || connectionResult.a() || this.d.a((Context) null, connectionResult.c, (String) null) != null) && (this.l == null || Integer.MAX_VALUE < this.m)) {
            this.l = connectionResult;
            this.m = Integer.MAX_VALUE;
        }
        this.a.g.put(vcVar.b, connectionResult);
    }
}
