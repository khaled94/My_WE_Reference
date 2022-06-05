package defpackage;

import android.app.Application;
import android.content.Context;
import android.content.Intent;
import android.content.pm.ResolveInfo;
import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;
import java.net.URL;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicReference;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: bql  reason: default package */
/* loaded from: classes2.dex */
public class bql implements brk {
    private static volatile bql l;
    private Boolean B;
    private long C;
    private volatile Boolean D;
    private Boolean E;
    private Boolean F;
    final String a;
    final String b;
    final String c;
    final boolean d;
    final bvf e;
    final bpi f;
    final bqe g;
    final brs h;
    bpv i;
    int j;
    final long k;
    private final Context m;
    private final bve n;
    private final bpq o;
    private final bty p;
    private final buv q;
    private final bpg r;
    private final ady s;
    private final bss t;
    private final bkz u;
    private final bsn v;
    private bpe w;
    private bsx x;
    private blc y;
    private bpa z;
    private boolean A = false;
    private AtomicInteger G = new AtomicInteger(0);

    private bql(brp brpVar) {
        aat.a(brpVar);
        bve bveVar = new bve();
        this.n = bveVar;
        blk.a(bveVar);
        this.m = brpVar.a;
        this.a = brpVar.b;
        this.b = brpVar.c;
        this.c = brpVar.d;
        this.d = brpVar.h;
        this.D = brpVar.e;
        baz bazVar = brpVar.g;
        if (bazVar != null && bazVar.g != null) {
            Object obj = bazVar.g.get("measurementEnabled");
            if (obj instanceof Boolean) {
                this.E = (Boolean) obj;
            }
            Object obj2 = bazVar.g.get("measurementDeactivated");
            if (obj2 instanceof Boolean) {
                this.F = (Boolean) obj2;
            }
        }
        aqp.a(this.m);
        ady d = aea.d();
        this.s = d;
        this.k = d.a();
        this.e = new bvf(this);
        bpq bpqVar = new bpq(this);
        bpqVar.x();
        this.o = bpqVar;
        bpi bpiVar = new bpi(this);
        bpiVar.x();
        this.f = bpiVar;
        buv buvVar = new buv(this);
        buvVar.x();
        this.q = buvVar;
        bpg bpgVar = new bpg(this);
        bpgVar.x();
        this.r = bpgVar;
        this.u = new bkz(this);
        bss bssVar = new bss(this);
        bssVar.C();
        this.t = bssVar;
        brs brsVar = new brs(this);
        brsVar.C();
        this.h = brsVar;
        bty btyVar = new bty(this);
        btyVar.C();
        this.p = btyVar;
        bsn bsnVar = new bsn(this);
        bsnVar.x();
        this.v = bsnVar;
        bqe bqeVar = new bqe(this);
        bqeVar.x();
        this.g = bqeVar;
        boolean z = !((brpVar.g == null || brpVar.g.b == 0) ? false : true);
        if (this.m.getApplicationContext() instanceof Application) {
            brs d2 = d();
            if (d2.m().getApplicationContext() instanceof Application) {
                Application application = (Application) d2.m().getApplicationContext();
                if (d2.a == null) {
                    d2.a = new bsl(d2, (byte) 0);
                }
                if (z) {
                    application.unregisterActivityLifecycleCallbacks(d2.a);
                    application.registerActivityLifecycleCallbacks(d2.a);
                    d2.q().k.a("Registered activity lifecycle callback");
                }
            }
        } else {
            q().f.a("Application context is not an Application");
        }
        this.g.a(new bqn(this, brpVar));
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a() {
        p().c();
        if (b().d.a() == 0) {
            b().d.a(this.s.a());
        }
        if (b().i.a() == 0) {
            q().k.a("Persisting first open", Long.valueOf(this.k));
            b().i.a(this.k);
        }
        if (!u()) {
            if (r()) {
                if (!e().d("android.permission.INTERNET")) {
                    q().c.a("App is missing INTERNET permission");
                }
                if (!e().d("android.permission.ACCESS_NETWORK_STATE")) {
                    q().c.a("App is missing ACCESS_NETWORK_STATE permission");
                }
                if (!aep.a(this.m).a() && !this.e.u()) {
                    if (!bqa.a(this.m)) {
                        q().c.a("AppMeasurementReceiver not registered/enabled");
                    }
                    if (!buv.a(this.m)) {
                        q().c.a("AppMeasurementService not registered/enabled");
                    }
                }
                q().c.a("Uploading is not possible. App measurement disabled");
            }
        } else {
            if (!TextUtils.isEmpty(k().w()) || !TextUtils.isEmpty(k().x())) {
                e();
                if (buv.a(k().w(), b().g(), k().x(), b().h())) {
                    q().i.a("Rechecking which service to use due to a GMP App Id change");
                    b().j();
                    g().v();
                    this.x.F();
                    this.x.E();
                    b().i.a(this.k);
                    b().k.a(null);
                }
                b().c(k().w());
                b().d(k().x());
            }
            d().a(b().k.a());
            if (!TextUtils.isEmpty(k().w()) || !TextUtils.isEmpty(k().x())) {
                boolean r = r();
                if (!b().b.contains("deferred_analytics_collection") && !this.e.f()) {
                    b().d(!r);
                }
                if (r) {
                    d().x();
                }
                i().a(new AtomicReference<>());
            }
        }
        b().p.a(this.e.d(null, blk.ar));
        b().q.a(this.e.d(null, blk.as));
    }

    public final bpq b() {
        a((bri) this.o);
        return this.o;
    }

    @Override // defpackage.brk
    public final bpi q() {
        a((brh) this.f);
        return this.f;
    }

    @Override // defpackage.brk
    public final bqe p() {
        a((brh) this.g);
        return this.g;
    }

    public final bty c() {
        a((brc) this.p);
        return this.p;
    }

    public final brs d() {
        a((brc) this.h);
        return this.h;
    }

    public final buv e() {
        a((bri) this.q);
        return this.q;
    }

    public final bpg f() {
        a((bri) this.r);
        return this.r;
    }

    public final bpe g() {
        a((brc) this.w);
        return this.w;
    }

    private final bsn v() {
        a((brh) this.v);
        return this.v;
    }

    @Override // defpackage.brk
    public final Context m() {
        return this.m;
    }

    @Override // defpackage.brk
    public final ady l() {
        return this.s;
    }

    public final bss h() {
        a((brc) this.t);
        return this.t;
    }

    public final bsx i() {
        a((brc) this.x);
        return this.x;
    }

    public final blc j() {
        a((brh) this.y);
        return this.y;
    }

    public final bpa k() {
        a((brc) this.z);
        return this.z;
    }

    public final bkz n() {
        bkz bkzVar = this.u;
        if (bkzVar != null) {
            return bkzVar;
        }
        throw new IllegalStateException("Component not created");
    }

    public static bql a(Context context, Bundle bundle) {
        return a(context, new baz(0L, 0L, true, null, null, null, bundle));
    }

    public static bql a(Context context, baz bazVar) {
        if (bazVar != null && (bazVar.e == null || bazVar.f == null)) {
            bazVar = new baz(bazVar.a, bazVar.b, bazVar.c, bazVar.d, null, null, bazVar.g);
        }
        aat.a(context);
        aat.a(context.getApplicationContext());
        if (l == null) {
            synchronized (bql.class) {
                if (l == null) {
                    l = new bql(new brp(context, bazVar));
                }
            }
        } else if (bazVar != null && bazVar.g != null && bazVar.g.containsKey("dataCollectionDefaultEnabled")) {
            l.a(bazVar.g.getBoolean("dataCollectionDefaultEnabled"));
        }
        return l;
    }

    private final void w() {
        if (this.A) {
            return;
        }
        throw new IllegalStateException("AppMeasurement is not initialized");
    }

    private static void a(brh brhVar) {
        if (brhVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (brhVar.v()) {
            return;
        }
        String valueOf = String.valueOf(brhVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private static void a(brc brcVar) {
        if (brcVar == null) {
            throw new IllegalStateException("Component not created");
        }
        if (brcVar.A()) {
            return;
        }
        String valueOf = String.valueOf(brcVar.getClass());
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("Component not initialized: ");
        sb.append(valueOf);
        throw new IllegalStateException(sb.toString());
    }

    private static void a(bri briVar) {
        if (briVar != null) {
            return;
        }
        throw new IllegalStateException("Component not created");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(boolean z) {
        this.D = Boolean.valueOf(z);
    }

    public final boolean o() {
        return this.D != null && this.D.booleanValue();
    }

    public final boolean r() {
        boolean z;
        p().c();
        w();
        if (this.e.d(null, blk.aj)) {
            if (this.e.f()) {
                return false;
            }
            Boolean bool = this.F;
            if (bool != null && bool.booleanValue()) {
                return false;
            }
            Boolean t = b().t();
            if (t != null) {
                return t.booleanValue();
            }
            Boolean b = this.e.b("firebase_analytics_collection_enabled");
            if (b != null) {
                return b.booleanValue();
            }
            Boolean bool2 = this.E;
            if (bool2 != null) {
                return bool2.booleanValue();
            }
            if (vt.b()) {
                return false;
            }
            if (this.e.d(null, blk.ae) && this.D != null) {
                return this.D.booleanValue();
            }
            return true;
        } else if (this.e.f()) {
            return false;
        } else {
            Boolean b2 = this.e.b("firebase_analytics_collection_enabled");
            if (b2 != null) {
                z = b2.booleanValue();
            } else {
                z = !vt.b();
                if (z && this.D != null && blk.ae.a(null).booleanValue()) {
                    z = this.D.booleanValue();
                }
            }
            return b().c(z);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void s() {
        throw new IllegalStateException("Unexpected call on client side");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void t() {
        this.G.incrementAndGet();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final boolean u() {
        w();
        p().c();
        Boolean bool = this.B;
        if (bool == null || this.C == 0 || (bool != null && !bool.booleanValue() && Math.abs(this.s.b() - this.C) > 1000)) {
            this.C = this.s.b();
            boolean z = true;
            Boolean valueOf = Boolean.valueOf(e().d("android.permission.INTERNET") && e().d("android.permission.ACCESS_NETWORK_STATE") && (aep.a(this.m).a() || this.e.u() || (bqa.a(this.m) && buv.a(this.m))));
            this.B = valueOf;
            if (valueOf.booleanValue()) {
                if (!e().c(k().w(), k().x()) && TextUtils.isEmpty(k().x())) {
                    z = false;
                }
                this.B = Boolean.valueOf(z);
            }
        }
        return this.B.booleanValue();
    }

    public final void a(final bas basVar) {
        p().c();
        a((brh) v());
        String v = k().v();
        Pair<String, Boolean> a = b().a(v);
        if (!this.e.g().booleanValue() || ((Boolean) a.second).booleanValue()) {
            q().j.a("ADID unavailable to retrieve Deferred Deep Link. Skipping");
            e().a(basVar, "");
        } else if (!v().f()) {
            q().f.a("Network is not available for Deferred Deep Link request. Skipping");
            e().a(basVar, "");
        } else {
            buv e = e();
            k();
            URL e2 = e.e(v, (String) a.first);
            bsn v2 = v();
            bsm bsmVar = new bsm(this, basVar) { // from class: bqk
                private final bql a;
                private final bas b;

                /* JADX INFO: Access modifiers changed from: package-private */
                {
                    this.a = this;
                    this.b = basVar;
                }

                @Override // defpackage.bsm
                public final void a(int i, Throwable th, byte[] bArr) {
                    List<ResolveInfo> queryIntentActivities;
                    bql bqlVar = this.a;
                    bas basVar2 = this.b;
                    boolean z = true;
                    if (!((i == 200 || i == 204 || i == 304) && th == null)) {
                        bqlVar.q().f.a("Network Request for Deferred Deep Link failed. response, exception", Integer.valueOf(i), th);
                        bqlVar.e().a(basVar2, "");
                    } else if (bArr.length == 0) {
                        bqlVar.e().a(basVar2, "");
                    } else {
                        try {
                            JSONObject jSONObject = new JSONObject(new String(bArr));
                            String optString = jSONObject.optString("deeplink", "");
                            String optString2 = jSONObject.optString("gclid", "");
                            buv e3 = bqlVar.e();
                            if (TextUtils.isEmpty(optString) || (queryIntentActivities = e3.m().getPackageManager().queryIntentActivities(new Intent("android.intent.action.VIEW", Uri.parse(optString)), 0)) == null || queryIntentActivities.isEmpty()) {
                                z = false;
                            }
                            if (!z) {
                                bqlVar.q().f.a("Deferred Deep Link validation failed. gclid, deep link", optString2, optString);
                                bqlVar.e().a(basVar2, "");
                                return;
                            }
                            Bundle bundle = new Bundle();
                            bundle.putString("deeplink", optString);
                            bundle.putString("gclid", optString2);
                            bqlVar.h.a("auto", "_cmp", bundle);
                            bqlVar.e().a(basVar2, optString);
                        } catch (JSONException e4) {
                            bqlVar.q().c.a("Failed to parse the Deferred Deep Link response. exception", e4);
                            bqlVar.e().a(basVar2, "");
                        }
                    }
                }
            };
            v2.c();
            v2.w();
            aat.a(e2);
            aat.a(bsmVar);
            v2.p().b(new bsp(v2, v, e2, bsmVar));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(bql bqlVar, brp brpVar) {
        bpk bpkVar;
        String str;
        bqlVar.p().c();
        bvf.d();
        blc blcVar = new blc(bqlVar);
        blcVar.x();
        bqlVar.y = blcVar;
        bpa bpaVar = new bpa(bqlVar, brpVar.f);
        bpaVar.C();
        bqlVar.z = bpaVar;
        bpe bpeVar = new bpe(bqlVar);
        bpeVar.C();
        bqlVar.w = bpeVar;
        bsx bsxVar = new bsx(bqlVar);
        bsxVar.C();
        bqlVar.x = bsxVar;
        bqlVar.q.y();
        bqlVar.o.y();
        bqlVar.i = new bpv(bqlVar);
        bqlVar.z.D();
        bqlVar.q().i.a("App measurement is starting up, version", 16250L);
        bqlVar.q().i.a("To enable debug logging run: adb shell setprop log.tag.FA VERBOSE");
        String v = bpaVar.v();
        if (TextUtils.isEmpty(bqlVar.a)) {
            if (bqlVar.e().f(v)) {
                bpkVar = bqlVar.q().i;
                str = "Faster debug mode event logging enabled. To disable, run:\n  adb shell setprop debug.firebase.analytics.app .none.";
            } else {
                bpk bpkVar2 = bqlVar.q().i;
                String valueOf = String.valueOf(v);
                str = valueOf.length() != 0 ? "To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ".concat(valueOf) : new String("To enable faster debug mode event logging run:\n  adb shell setprop debug.firebase.analytics.app ");
                bpkVar = bpkVar2;
            }
            bpkVar.a(str);
        }
        bqlVar.q().j.a("Debug-level message logging enabled");
        if (bqlVar.j != bqlVar.G.get()) {
            bqlVar.q().c.a("Not all components initialized", Integer.valueOf(bqlVar.j), Integer.valueOf(bqlVar.G.get()));
        }
        bqlVar.A = true;
    }
}
