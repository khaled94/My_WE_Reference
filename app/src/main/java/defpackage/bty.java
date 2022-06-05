package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;

/* renamed from: bty  reason: default package */
/* loaded from: classes2.dex */
public final class bty extends brc {
    long a;
    long b;
    final bla c = new bub(this, this.w);
    final bla d = new bua(this, this.w);
    private Handler e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bty(bql bqlVar) {
        super(bqlVar);
        long b = l().b();
        this.a = b;
        this.b = b;
    }

    @Override // defpackage.brc
    protected final boolean t() {
        return false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void v() {
        synchronized (this) {
            if (this.e == null) {
                this.e = new ava(Looper.getMainLooper());
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j, boolean z) {
        c();
        v();
        this.c.c();
        this.d.c();
        if (r().a(j)) {
            r().n.a(true);
            r().s.a(0L);
        }
        if (z && s().j(f().v())) {
            r().r.a(j);
        }
        if (r().n.a()) {
            a(j);
        } else {
            this.d.a(Math.max(0L, 3600000 - r().s.a()));
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j) {
        c();
        q().k.a("Session started, time", Long.valueOf(l().b()));
        Long valueOf = s().h(f().v()) ? Long.valueOf(j / 1000) : null;
        e().a("auto", "_sid", valueOf, j);
        r().n.a(false);
        Bundle bundle = new Bundle();
        if (s().h(f().v())) {
            bundle.putLong("_sid", valueOf.longValue());
        }
        e().a("auto", "_s", j, bundle);
        r().r.a(j);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final long w() {
        long b = l().b();
        long j = b - this.b;
        this.b = b;
        return j;
    }

    public final boolean a(boolean z, boolean z2) {
        c();
        B();
        long b = l().b();
        r().r.a(l().a());
        long j = b - this.a;
        if (!z && j < 1000) {
            q().k.a("Screen exposed for less than 1000 ms. Event not sent. time", Long.valueOf(j));
            return false;
        }
        r().s.a(j);
        q().k.a("Recording user engagement, ms", Long.valueOf(j));
        Bundle bundle = new Bundle();
        bundle.putLong("_et", j);
        bss.a(h().v(), bundle, true);
        if (s().k(f().v())) {
            if (s().d(f().v(), blk.ag)) {
                if (!z2) {
                    w();
                }
            } else if (z2) {
                bundle.putLong("_fr", 1L);
            } else {
                w();
            }
        }
        if (!s().d(f().v(), blk.ag) || !z2) {
            e().a("auto", "_e", bundle);
        }
        this.a = b;
        this.d.c();
        this.d.a(Math.max(0L, 3600000 - r().s.a()));
        return true;
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
    public static /* synthetic */ void a(bty btyVar) {
        btyVar.c();
        btyVar.a(false, false);
        btyVar.d().a(btyVar.l().b());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ void a(bty btyVar, long j) {
        btyVar.c();
        btyVar.v();
        if (btyVar.s().d(btyVar.f().v(), blk.ab)) {
            btyVar.r().u.a(false);
        }
        btyVar.q().k.a("Activity resumed, time", Long.valueOf(j));
        btyVar.a = j;
        btyVar.b = j;
        if (btyVar.w.r()) {
            if (btyVar.s().d(btyVar.f().v(), blk.Z)) {
                btyVar.a(btyVar.l().a(), false);
                return;
            }
            btyVar.c.c();
            btyVar.d.c();
            if (btyVar.r().a(btyVar.l().a())) {
                btyVar.r().n.a(true);
                btyVar.r().s.a(0L);
            }
            if (btyVar.r().n.a()) {
                btyVar.c.a(Math.max(0L, btyVar.r().l.a() - btyVar.r().s.a()));
            } else {
                btyVar.d.a(Math.max(0L, 3600000 - btyVar.r().s.a()));
            }
        }
    }
}
