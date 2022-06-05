package defpackage;

import android.os.Process;
import defpackage.dz;
import java.lang.ref.ReferenceQueue;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Executor;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

/* renamed from: dk  reason: default package */
/* loaded from: classes2.dex */
final class dk {
    final Map<ck, b> a;
    final ReferenceQueue<dz<?>> b;
    dz.a c;
    volatile boolean d;
    volatile a e;
    private final boolean f;
    private final Executor g;

    /* renamed from: dk$a */
    /* loaded from: classes2.dex */
    interface a {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dk(boolean z) {
        this(z, Executors.newSingleThreadExecutor(new ThreadFactory() { // from class: dk.1
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(final Runnable runnable) {
                return new Thread(new Runnable() { // from class: dk.1.1
                    @Override // java.lang.Runnable
                    public final void run() {
                        Process.setThreadPriority(10);
                        runnable.run();
                    }
                }, "glide-active-resources");
            }
        }));
    }

    private dk(boolean z, Executor executor) {
        this.a = new HashMap();
        this.b = new ReferenceQueue<>();
        this.f = z;
        this.g = executor;
        executor.execute(new Runnable() { // from class: dk.2
            @Override // java.lang.Runnable
            public final void run() {
                dk dkVar = dk.this;
                while (!dkVar.d) {
                    try {
                        dkVar.a((b) dkVar.b.remove());
                        a aVar = dkVar.e;
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                    }
                }
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(ck ckVar, dz<?> dzVar) {
        b put = this.a.put(ckVar, new b(ckVar, dzVar, this.b, this.f));
        if (put != null) {
            put.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(ck ckVar) {
        b remove = this.a.remove(ckVar);
        if (remove != null) {
            remove.a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dz<?> b(ck ckVar) {
        b bVar = this.a.get(ckVar);
        if (bVar == null) {
            return null;
        }
        dz<?> dzVar = (dz) bVar.get();
        if (dzVar == null) {
            a(bVar);
        }
        return dzVar;
    }

    final void a(b bVar) {
        synchronized (this) {
            this.a.remove(bVar.a);
            if (bVar.b && bVar.c != null) {
                this.c.a(bVar.a, new dz<>(bVar.c, true, false, bVar.a, this.c));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dk$b */
    /* loaded from: classes2.dex */
    public static final class b extends WeakReference<dz<?>> {
        final ck a;
        final boolean b;
        ee<?> c;

        b(ck ckVar, dz<?> dzVar, ReferenceQueue<? super dz<?>> referenceQueue, boolean z) {
            super(dzVar, referenceQueue);
            this.a = (ck) lf.a(ckVar, "Argument must not be null");
            this.c = (!dzVar.a || !z) ? null : (ee) lf.a(dzVar.b, "Argument must not be null");
            this.b = dzVar.a;
        }

        final void a() {
            this.c = null;
            clear();
        }
    }
}
