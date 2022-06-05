package defpackage;

import android.net.TrafficStats;
import android.os.Build;
import android.os.Process;
import android.os.SystemClock;
import com.android.volley.VolleyError;
import java.util.concurrent.BlockingQueue;

/* renamed from: aq  reason: default package */
/* loaded from: classes.dex */
public final class aq extends Thread {
    volatile boolean a = false;
    private final BlockingQueue<as<?>> b;
    private final ap c;
    private final ak d;
    private final av e;

    public aq(BlockingQueue<as<?>> blockingQueue, ap apVar, ak akVar, av avVar) {
        this.b = blockingQueue;
        this.c = apVar;
        this.d = akVar;
        this.e = avVar;
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        Process.setThreadPriority(10);
        while (true) {
            try {
                a();
            } catch (InterruptedException unused) {
                if (this.a) {
                    return;
                }
            }
        }
    }

    private void a() throws InterruptedException {
        long elapsedRealtime = SystemClock.elapsedRealtime();
        as<?> take = this.b.take();
        try {
            take.a("network-queue-take");
            if (take.b()) {
                take.b("network-discard-cancelled");
                take.k();
                return;
            }
            if (Build.VERSION.SDK_INT >= 14) {
                TrafficStats.setThreadStatsTag(take.c);
            }
            ar a = this.c.a(take);
            take.a("network-http-complete");
            if (a.e && take.j()) {
                take.b("not-modified");
                take.k();
                return;
            }
            au<?> a2 = take.a(a);
            take.a("network-parse-complete");
            if (take.h && a2.b != null) {
                this.d.a(take.b, a2.b);
                take.a("network-cache-written");
            }
            take.i();
            this.e.a(take, a2);
            take.a(a2);
        } catch (VolleyError e) {
            e.b = SystemClock.elapsedRealtime() - elapsedRealtime;
            this.e.a(take, as.a(e));
            take.k();
        } catch (Exception e2) {
            ax.d("Unhandled exception %s", e2.toString());
            VolleyError volleyError = new VolleyError(e2);
            volleyError.b = SystemClock.elapsedRealtime() - elapsedRealtime;
            this.e.a(take, volleyError);
            take.k();
        }
    }
}
