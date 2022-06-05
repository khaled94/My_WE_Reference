package defpackage;

import android.os.Process;
import defpackage.ak;
import defpackage.as;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.concurrent.BlockingQueue;

/* renamed from: al  reason: default package */
/* loaded from: classes.dex */
public final class al extends Thread {
    private static final boolean a = ax.b;
    private final BlockingQueue<as<?>> b;
    private final BlockingQueue<as<?>> c;
    private final ak d;
    private final av e;
    private volatile boolean f = false;
    private final a g = new a(this);

    public al(BlockingQueue<as<?>> blockingQueue, BlockingQueue<as<?>> blockingQueue2, ak akVar, av avVar) {
        this.b = blockingQueue;
        this.c = blockingQueue2;
        this.d = akVar;
        this.e = avVar;
    }

    public final void a() {
        this.f = true;
        interrupt();
    }

    @Override // java.lang.Thread, java.lang.Runnable
    public final void run() {
        if (a) {
            ax.a("start new dispatcher", new Object[0]);
        }
        Process.setThreadPriority(10);
        this.d.a();
        while (true) {
            try {
                b();
            } catch (InterruptedException unused) {
                if (this.f) {
                    return;
                }
            }
        }
    }

    private void b() throws InterruptedException {
        final as<?> take = this.b.take();
        take.a("cache-queue-take");
        if (take.b()) {
            take.b("cache-discard-canceled");
            return;
        }
        ak.a a2 = this.d.a(take.b);
        if (a2 == null) {
            take.a("cache-miss");
            if (this.g.b(take)) {
                return;
            }
            this.c.put(take);
        } else if (a2.a()) {
            take.a("cache-hit-expired");
            take.k = a2;
            if (this.g.b(take)) {
                return;
            }
            this.c.put(take);
        } else {
            take.a("cache-hit");
            boolean z = false;
            au<?> a3 = take.a(new ar(a2.a, a2.g, (byte) 0));
            take.a("cache-hit-parsed");
            if (a2.f < System.currentTimeMillis()) {
                z = true;
            }
            if (z) {
                take.a("cache-hit-refresh-needed");
                take.k = a2;
                a3.d = true;
                if (!this.g.b(take)) {
                    this.e.a(take, a3, new Runnable() { // from class: al.1
                        @Override // java.lang.Runnable
                        public final void run() {
                            try {
                                al.this.c.put(take);
                            } catch (InterruptedException unused) {
                                Thread.currentThread().interrupt();
                            }
                        }
                    });
                    return;
                }
            }
            this.e.a(take, a3);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: al$a */
    /* loaded from: classes.dex */
    public static class a implements as.a {
        private final Map<String, List<as<?>>> a = new HashMap();
        private final al b;

        a(al alVar) {
            this.b = alVar;
        }

        @Override // defpackage.as.a
        public final void a(as<?> asVar, au<?> auVar) {
            List<as<?>> remove;
            if (auVar.b == null || auVar.b.a()) {
                a(asVar);
                return;
            }
            String str = asVar.b;
            synchronized (this) {
                remove = this.a.remove(str);
            }
            if (remove == null) {
                return;
            }
            if (ax.b) {
                ax.a("Releasing %d waiting requests for cacheKey=%s.", Integer.valueOf(remove.size()), str);
            }
            for (as<?> asVar2 : remove) {
                this.b.e.a(asVar2, auVar);
            }
        }

        @Override // defpackage.as.a
        public final synchronized void a(as<?> asVar) {
            String str = asVar.b;
            List<as<?>> remove = this.a.remove(str);
            if (remove != null && !remove.isEmpty()) {
                if (ax.b) {
                    ax.a("%d waiting requests for cacheKey=%s; resend to network", Integer.valueOf(remove.size()), str);
                }
                as<?> remove2 = remove.remove(0);
                this.a.put(str, remove);
                remove2.a((as.a) this);
                try {
                    this.b.c.put(remove2);
                } catch (InterruptedException e) {
                    ax.c("Couldn't add request to queue. %s", e.toString());
                    Thread.currentThread().interrupt();
                    this.b.a();
                }
            }
        }

        final synchronized boolean b(as<?> asVar) {
            String str = asVar.b;
            if (this.a.containsKey(str)) {
                List<as<?>> list = this.a.get(str);
                if (list == null) {
                    list = new ArrayList<>();
                }
                asVar.a("waiting-for-response");
                list.add(asVar);
                this.a.put(str, list);
                if (ax.b) {
                    ax.b("Request for cacheKey=%s is in flight, putting on hold.", str);
                }
                return true;
            }
            this.a.put(str, null);
            asVar.a((as.a) this);
            if (ax.b) {
                ax.b("new request, sending to network %s", str);
            }
            return false;
        }
    }
}
