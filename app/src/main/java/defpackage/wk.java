package defpackage;

import android.app.Activity;
import androidx.collection.ArraySet;
import com.google.android.gms.common.ConnectionResult;

/* renamed from: wk  reason: default package */
/* loaded from: classes2.dex */
public final class wk extends zf {
    final ArraySet<vo<?>> b = new ArraySet<>();
    private final vs f;

    private wk(vv vvVar, vs vsVar, ux uxVar) {
        super(vvVar, uxVar);
        this.f = vsVar;
        this.a.a("ConnectionlessLifecycleHelper", this);
    }

    public static void a(Activity activity, vs vsVar, vo<?> voVar) {
        vv a = a(activity);
        wk wkVar = (wk) a.a("ConnectionlessLifecycleHelper", wk.class);
        if (wkVar == null) {
            wkVar = new wk(a, vsVar, ux.a());
        }
        aat.a(voVar, "ApiKey cannot be null");
        wkVar.b.add(voVar);
        vsVar.a(wkVar);
    }

    private final void f() {
        if (!this.b.isEmpty()) {
            this.f.a(this);
        }
    }

    @Override // defpackage.zf
    protected final void a(ConnectionResult connectionResult, int i) {
        this.f.a(connectionResult, i);
    }

    @Override // com.google.android.gms.common.api.internal.LifecycleCallback
    public final void b() {
        super.b();
        f();
    }

    @Override // defpackage.zf, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void c() {
        super.c();
        f();
    }

    @Override // defpackage.zf, com.google.android.gms.common.api.internal.LifecycleCallback
    public final void d() {
        super.d();
        vs vsVar = this.f;
        synchronized (vs.b) {
            if (vsVar.d == this) {
                vsVar.d = null;
                vsVar.e.clear();
            }
        }
    }

    @Override // defpackage.zf
    protected final void e() {
        this.f.d();
    }
}
