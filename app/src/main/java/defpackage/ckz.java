package defpackage;

import android.os.Handler;
import android.os.HandlerThread;

/* renamed from: ckz  reason: default package */
/* loaded from: classes2.dex */
public final class ckz {
    static adj a = new adj("TokenRefresher", "FirebaseAuth:");
    volatile long b;
    volatile long c;
    Handler d;
    Runnable e;
    private final cgw f;
    private long g = 300000;
    private HandlerThread h;

    public ckz(cgw cgwVar) {
        a.c("Initializing TokenRefresher", new Object[0]);
        this.f = (cgw) aat.a(cgwVar);
        HandlerThread handlerThread = new HandlerThread("TokenRefresher", 10);
        this.h = handlerThread;
        handlerThread.start();
        this.d = new aly(this.h.getLooper());
        this.e = new clb(this, this.f.b());
    }

    public final void a() {
        adj adjVar = a;
        long j = this.b - this.g;
        StringBuilder sb = new StringBuilder(43);
        sb.append("Scheduling refresh for ");
        sb.append(j);
        adjVar.c(sb.toString(), new Object[0]);
        b();
        this.c = Math.max((this.b - aea.d().a()) - this.g, 0L) / 1000;
        this.d.postDelayed(this.e, this.c * 1000);
    }

    public final void b() {
        this.d.removeCallbacks(this.e);
    }
}
