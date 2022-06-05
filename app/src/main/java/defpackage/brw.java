package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: brw  reason: default package */
/* loaded from: classes2.dex */
public final class brw implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ brs b;

    public brw(brs brsVar, long j) {
        this.b = brsVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        brs brsVar = this.b;
        long j = this.a;
        brsVar.c();
        brsVar.B();
        brsVar.q().j.a("Resetting analytics data (FE)");
        bty j2 = brsVar.j();
        j2.c();
        j2.c.c();
        j2.d.c();
        j2.a = 0L;
        j2.b = j2.a;
        if (brsVar.s().f(brsVar.f().v())) {
            brsVar.r().i.a(j);
        }
        boolean r = brsVar.w.r();
        if (!brsVar.s().f()) {
            brsVar.r().d(!r);
        }
        brsVar.g().x();
        brsVar.b = !r;
        this.b.g().a(new AtomicReference<>());
    }
}
