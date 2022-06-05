package defpackage;

import android.app.Activity;
import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.util.Map;

/* renamed from: bss  reason: default package */
/* loaded from: classes2.dex */
public final class bss extends brc {
    protected bst a;
    volatile bst b;
    bst c;
    final Map<Activity, bst> d = new ArrayMap();
    private bst e;
    private String f;

    public bss(bql bqlVar) {
        super(bqlVar);
    }

    @Override // defpackage.brc
    protected final boolean t() {
        return false;
    }

    public final bst v() {
        B();
        c();
        return this.a;
    }

    public final void a(Activity activity, String str, String str2) {
        if (this.b == null) {
            q().h.a("setCurrentScreen cannot be called while no activity active");
        } else if (this.d.get(activity) == null) {
            q().h.a("setCurrentScreen must be called with an activity in the activity lifecycle");
        } else {
            if (str2 == null) {
                str2 = a(activity.getClass().getCanonicalName());
            }
            boolean equals = this.b.b.equals(str2);
            boolean d = buv.d(this.b.a, str);
            if (equals && d) {
                q().h.a("setCurrentScreen cannot be called with the same class and name");
            } else if (str != null && (str.length() <= 0 || str.length() > 100)) {
                q().h.a("Invalid screen name length in setCurrentScreen. Length", Integer.valueOf(str.length()));
            } else if (str2 != null && (str2.length() <= 0 || str2.length() > 100)) {
                q().h.a("Invalid class name length in setCurrentScreen. Length", Integer.valueOf(str2.length()));
            } else {
                q().k.a("Setting current screen to name, class", str == null ? "null" : str, str2);
                bst bstVar = new bst(str, str2, o().f());
                this.d.put(activity, bstVar);
                a(activity, bstVar, true);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Activity activity, bst bstVar, boolean z) {
        bst bstVar2 = this.b == null ? this.c : this.b;
        if (bstVar.b == null) {
            bstVar = new bst(bstVar.a, a(activity.getClass().getCanonicalName()), bstVar.c);
        }
        this.c = this.b;
        this.b = bstVar;
        p().a(new bsv(this, z, bstVar2, bstVar));
    }

    public static void a(bst bstVar, Bundle bundle, boolean z) {
        if (bundle != null && bstVar != null && (!bundle.containsKey("_sc") || z)) {
            if (bstVar.a != null) {
                bundle.putString("_sn", bstVar.a);
            } else {
                bundle.remove("_sn");
            }
            bundle.putString("_sc", bstVar.b);
            bundle.putLong("_si", bstVar.c);
        } else if (bundle == null || bstVar != null || !z) {
        } else {
            bundle.remove("_sn");
            bundle.remove("_sc");
            bundle.remove("_si");
        }
    }

    public final void a(String str, bst bstVar) {
        c();
        synchronized (this) {
            if (this.f == null || this.f.equals(str) || bstVar != null) {
                this.f = str;
                this.e = bstVar;
            }
        }
    }

    private static String a(String str) {
        String[] split = str.split("\\.");
        String str2 = split.length > 0 ? split[split.length - 1] : "";
        return str2.length() > 100 ? str2.substring(0, 100) : str2;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final bst a(Activity activity) {
        aat.a(activity);
        bst bstVar = this.d.get(activity);
        if (bstVar == null) {
            bst bstVar2 = new bst(null, a(activity.getClass().getCanonicalName()), o().f());
            this.d.put(activity, bstVar2);
            return bstVar2;
        }
        return bstVar;
    }

    public final void a(Activity activity, Bundle bundle) {
        Bundle bundle2;
        if (bundle == null || (bundle2 = bundle.getBundle("com.google.app_measurement.screen_service")) == null) {
            return;
        }
        this.d.put(activity, new bst(bundle2.getString("name"), bundle2.getString("referrer_name"), bundle2.getLong("id")));
    }

    @Override // defpackage.boc, defpackage.bri
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
    }

    @Override // defpackage.boc, defpackage.bri
    public final /* bridge */ /* synthetic */ void b() {
        super.b();
    }

    @Override // defpackage.boc, defpackage.bri
    public final /* bridge */ /* synthetic */ void c() {
        super.c();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bkz d() {
        return super.d();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ brs e() {
        return super.e();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bpa f() {
        return super.f();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bsx g() {
        return super.g();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bss h() {
        return super.h();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bpe i() {
        return super.i();
    }

    @Override // defpackage.boc
    public final /* bridge */ /* synthetic */ bty j() {
        return super.j();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ blc k() {
        return super.k();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ ady l() {
        return super.l();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ Context m() {
        return super.m();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpg n() {
        return super.n();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ buv o() {
        return super.o();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bqe p() {
        return super.p();
    }

    @Override // defpackage.bri, defpackage.brk
    public final /* bridge */ /* synthetic */ bpi q() {
        return super.q();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bpq r() {
        return super.r();
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ bvf s() {
        return super.s();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(bss bssVar, bst bstVar, boolean z) {
        bssVar.d().a(bssVar.l().b());
        if (bssVar.j().a(bstVar.d, z)) {
            bstVar.d = false;
        }
    }
}
