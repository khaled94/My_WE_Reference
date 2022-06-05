package defpackage;

import android.content.Context;
import java.lang.Thread;
import java.util.concurrent.BlockingQueue;
import java.util.concurrent.Callable;
import java.util.concurrent.Future;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.Semaphore;
import java.util.concurrent.atomic.AtomicLong;
import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bqe  reason: default package */
/* loaded from: classes2.dex */
public final class bqe extends brh {
    private static final AtomicLong j = new AtomicLong(Long.MIN_VALUE);
    private bqi a;
    private bqi b;
    private volatile boolean i;
    private final Object g = new Object();
    private final Semaphore h = new Semaphore(2);
    private final PriorityBlockingQueue<bqj<?>> c = new PriorityBlockingQueue<>();
    private final BlockingQueue<bqj<?>> d = new LinkedBlockingQueue();
    private final Thread.UncaughtExceptionHandler e = new bqg(this, "Thread death: Uncaught exception on worker thread");
    private final Thread.UncaughtExceptionHandler f = new bqg(this, "Thread death: Uncaught exception on network thread");

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqe(bql bqlVar) {
        super(bqlVar);
    }

    @Override // defpackage.brh
    protected final boolean d() {
        return false;
    }

    @Override // defpackage.bri
    public final void c() {
        if (Thread.currentThread() == this.a) {
            return;
        }
        throw new IllegalStateException("Call expected from worker thread");
    }

    @Override // defpackage.bri
    public final void b() {
        if (Thread.currentThread() == this.b) {
            return;
        }
        throw new IllegalStateException("Call expected from network thread");
    }

    public final boolean f() {
        return Thread.currentThread() == this.a;
    }

    public final <V> Future<V> a(Callable<V> callable) throws IllegalStateException {
        w();
        aat.a(callable);
        bqj<?> bqjVar = new bqj<>(this, callable, false, "Task exception on worker thread");
        if (Thread.currentThread() == this.a) {
            if (!this.c.isEmpty()) {
                q().f.a("Callable skipped the worker queue.");
            }
            bqjVar.run();
        } else {
            a(bqjVar);
        }
        return bqjVar;
    }

    public final <V> Future<V> b(Callable<V> callable) throws IllegalStateException {
        w();
        aat.a(callable);
        bqj<?> bqjVar = new bqj<>(this, callable, true, "Task exception on worker thread");
        if (Thread.currentThread() == this.a) {
            bqjVar.run();
        } else {
            a(bqjVar);
        }
        return bqjVar;
    }

    public final void a(Runnable runnable) throws IllegalStateException {
        w();
        aat.a(runnable);
        a(new bqj<>(this, runnable, "Task exception on worker thread"));
    }

    public final <T> T a(AtomicReference<T> atomicReference, String str, Runnable runnable) {
        synchronized (atomicReference) {
            p().a(runnable);
            try {
                atomicReference.wait(15000L);
            } catch (InterruptedException unused) {
                bpk bpkVar = q().f;
                String valueOf = String.valueOf(str);
                bpkVar.a(valueOf.length() != 0 ? "Interrupted waiting for ".concat(valueOf) : new String("Interrupted waiting for "));
                return null;
            }
        }
        T t = atomicReference.get();
        if (t == null) {
            bpk bpkVar2 = q().f;
            String valueOf2 = String.valueOf(str);
            bpkVar2.a(valueOf2.length() != 0 ? "Timed out waiting for ".concat(valueOf2) : new String("Timed out waiting for "));
        }
        return t;
    }

    private final void a(bqj<?> bqjVar) {
        synchronized (this.g) {
            this.c.add(bqjVar);
            if (this.a == null) {
                bqi bqiVar = new bqi(this, "Measurement Worker", this.c);
                this.a = bqiVar;
                bqiVar.setUncaughtExceptionHandler(this.e);
                this.a.start();
            } else {
                this.a.a();
            }
        }
    }

    public final void b(Runnable runnable) throws IllegalStateException {
        w();
        aat.a(runnable);
        bqj<?> bqjVar = new bqj<>(this, runnable, "Task exception on network thread");
        synchronized (this.g) {
            this.d.add(bqjVar);
            if (this.b == null) {
                bqi bqiVar = new bqi(this, "Measurement Network", this.d);
                this.b = bqiVar;
                bqiVar.setUncaughtExceptionHandler(this.f);
                this.b.start();
            } else {
                this.b.a();
            }
        }
    }

    @Override // defpackage.bri
    public final /* bridge */ /* synthetic */ void a() {
        super.a();
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
