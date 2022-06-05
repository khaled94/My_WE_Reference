package defpackage;

import android.content.Context;
import android.os.Bundle;
import androidx.collection.ArrayMap;
import java.util.Map;

/* renamed from: bkz  reason: default package */
/* loaded from: classes2.dex */
public final class bkz extends boc {
    long c;
    final Map<String, Integer> b = new ArrayMap();
    final Map<String, Long> a = new ArrayMap();

    public bkz(bql bqlVar) {
        super(bqlVar);
    }

    public final void a(String str, long j) {
        if (str == null || str.length() == 0) {
            q().c.a("Ad unit id must be a non-empty string");
        } else {
            p().a(new bnb(this, str, j));
        }
    }

    public final void b(String str, long j) {
        if (str == null || str.length() == 0) {
            q().c.a("Ad unit id must be a non-empty string");
        } else {
            p().a(new bma(this, str, j));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j, bst bstVar) {
        if (bstVar == null) {
            q().k.a("Not logging ad exposure. No active activity");
        } else if (j < 1000) {
            q().k.a("Not logging ad exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putLong("_xt", j);
            bss.a(bstVar, bundle, true);
            e().a("am", "_xa", bundle);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str, long j, bst bstVar) {
        if (bstVar == null) {
            q().k.a("Not logging ad unit exposure. No active activity");
        } else if (j < 1000) {
            q().k.a("Not logging ad unit exposure. Less than 1000 ms. exposure", Long.valueOf(j));
        } else {
            Bundle bundle = new Bundle();
            bundle.putString("_ai", str);
            bundle.putLong("_xt", j);
            bss.a(bstVar, bundle, true);
            e().a("am", "_xu", bundle);
        }
    }

    public final void a(long j) {
        bst v = h().v();
        for (String str : this.a.keySet()) {
            a(str, j - this.a.get(str).longValue(), v);
        }
        if (!this.a.isEmpty()) {
            a(j - this.c, v);
        }
        b(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(long j) {
        for (String str : this.a.keySet()) {
            this.a.put(str, Long.valueOf(j));
        }
        if (!this.a.isEmpty()) {
            this.c = j;
        }
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
}
