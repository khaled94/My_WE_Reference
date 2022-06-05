package defpackage;

import defpackage.eaz;
import java.io.InterruptedIOException;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Deque;
import java.util.Iterator;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: eam  reason: default package */
/* loaded from: classes2.dex */
public final class eam {
    static final /* synthetic */ boolean a = !eam.class.desiredAssertionStatus();
    private Runnable d;
    private ExecutorService e;
    private int b = 64;
    private int c = 5;
    private final Deque<eaz.a> f = new ArrayDeque();
    private final Deque<eaz.a> g = new ArrayDeque();
    private final Deque<eaz> h = new ArrayDeque();

    public eam(ExecutorService executorService) {
        this.e = executorService;
    }

    public eam() {
    }

    public final synchronized ExecutorService a() {
        if (this.e == null) {
            this.e = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60L, TimeUnit.SECONDS, new SynchronousQueue(), ebk.a("OkHttp Dispatcher", false));
        }
        return this.e;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(eaz.a aVar) {
        eaz.a aVar2;
        synchronized (this) {
            this.f.add(aVar);
            if (!eaz.this.d) {
                String a2 = aVar.a();
                Iterator<eaz.a> it = this.g.iterator();
                while (true) {
                    if (it.hasNext()) {
                        aVar2 = it.next();
                        if (aVar2.a().equals(a2)) {
                            break;
                        }
                    } else {
                        Iterator<eaz.a> it2 = this.f.iterator();
                        while (true) {
                            if (!it2.hasNext()) {
                                aVar2 = null;
                                break;
                            }
                            aVar2 = it2.next();
                            if (aVar2.a().equals(a2)) {
                                break;
                            }
                        }
                    }
                }
                if (aVar2 != null) {
                    aVar.b = aVar2.b;
                }
            }
        }
        b();
    }

    private boolean b() {
        int i;
        boolean z;
        if (a || !Thread.holdsLock(this)) {
            ArrayList arrayList = new ArrayList();
            synchronized (this) {
                Iterator<eaz.a> it = this.f.iterator();
                while (it.hasNext()) {
                    eaz.a next = it.next();
                    if (this.g.size() >= this.b) {
                        break;
                    } else if (next.b.get() < this.c) {
                        it.remove();
                        next.b.incrementAndGet();
                        arrayList.add(next);
                        this.g.add(next);
                    }
                }
                z = c() > 0;
            }
            int size = arrayList.size();
            for (i = 0; i < size; i++) {
                eaz.a aVar = (eaz.a) arrayList.get(i);
                ExecutorService a2 = a();
                if (!eaz.a.c && Thread.holdsLock(eaz.this.a.c)) {
                    throw new AssertionError();
                }
                try {
                    try {
                        a2.execute(aVar);
                    } catch (RejectedExecutionException e) {
                        InterruptedIOException interruptedIOException = new InterruptedIOException("executor rejected");
                        interruptedIOException.initCause(e);
                        eaz.a(eaz.this).a(interruptedIOException);
                        aVar.a.a(interruptedIOException);
                        eaz.this.a.c.b(aVar);
                    }
                } catch (Throwable th) {
                    eaz.this.a.c.b(aVar);
                    throw th;
                }
            }
            return z;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(eaz eazVar) {
        this.h.add(eazVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(eaz eazVar) {
        a(this.h, eazVar);
    }

    private <T> void a(Deque<T> deque, T t) {
        Runnable runnable;
        synchronized (this) {
            if (!deque.remove(t)) {
                throw new AssertionError("Call wasn't in-flight!");
            }
            runnable = this.d;
        }
        if (b() || runnable == null) {
            return;
        }
        runnable.run();
    }

    private synchronized int c() {
        return this.g.size() + this.h.size();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(eaz.a aVar) {
        aVar.b.decrementAndGet();
        a(this.g, aVar);
    }
}
