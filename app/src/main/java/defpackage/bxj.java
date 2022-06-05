package defpackage;

import com.google.android.gms.tasks.DuplicateTaskCompletionException;
import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;

/* renamed from: bxj  reason: default package */
/* loaded from: classes2.dex */
public final class bxj<TResult> extends bwl<TResult> {
    private final Object a = new Object();
    private final bxg<TResult> b = new bxg<>();
    private boolean c;
    private volatile boolean d;
    private TResult e;
    private Exception f;

    private final void g() {
        aat.b(this.c, "Task is not yet complete");
    }

    private final void h() {
        if (!this.d) {
            return;
        }
        throw new CancellationException("Task is already canceled.");
    }

    private final void i() {
        if (!this.c) {
            return;
        }
        throw DuplicateTaskCompletionException.a(this);
    }

    private final void j() {
        synchronized (this.a) {
            if (!this.c) {
                return;
            }
            this.b.a(this);
        }
    }

    @Override // defpackage.bwl
    public final <TContinuationResult> bwl<TContinuationResult> a(bwf<TResult, bwl<TContinuationResult>> bwfVar) {
        return b(bwn.a, bwfVar);
    }

    @Override // defpackage.bwl
    public final Exception a() {
        Exception exc;
        synchronized (this.a) {
            exc = this.f;
        }
        return exc;
    }

    public final void a(Exception exc) {
        aat.a(exc, "Exception must not be null");
        synchronized (this.a) {
            i();
            this.c = true;
            this.f = exc;
        }
        this.b.a(this);
    }

    public final void a(TResult tresult) {
        synchronized (this.a) {
            i();
            this.c = true;
            this.e = tresult;
        }
        this.b.a(this);
    }

    @Override // defpackage.bwl
    public final TResult b() {
        TResult tresult;
        synchronized (this.a) {
            g();
            h();
            Exception exc = this.f;
            if (exc == null) {
                tresult = this.e;
            } else {
                throw new RuntimeExecutionException(exc);
            }
        }
        return tresult;
    }

    public final boolean b(Exception exc) {
        aat.a(exc, "Exception must not be null");
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.f = exc;
            this.b.a(this);
            return true;
        }
    }

    public final boolean b(TResult tresult) {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.e = tresult;
            this.b.a(this);
            return true;
        }
    }

    @Override // defpackage.bwl
    public final boolean c() {
        return this.d;
    }

    @Override // defpackage.bwl
    public final boolean d() {
        boolean z;
        synchronized (this.a) {
            z = this.c;
        }
        return z;
    }

    @Override // defpackage.bwl
    public final boolean e() {
        boolean z;
        synchronized (this.a) {
            z = false;
            if (this.c && !this.d && this.f == null) {
                z = true;
            }
        }
        return z;
    }

    public final boolean f() {
        synchronized (this.a) {
            if (this.c) {
                return false;
            }
            this.c = true;
            this.d = true;
            this.b.a(this);
            return true;
        }
    }

    @Override // defpackage.bwl
    public final <TContinuationResult> bwl<TContinuationResult> a(Executor executor, bwf<TResult, TContinuationResult> bwfVar) {
        bxj bxjVar = new bxj();
        this.b.a(new bws(executor, bwfVar, bxjVar));
        j();
        return bxjVar;
    }

    @Override // defpackage.bwl
    public final <TContinuationResult> bwl<TContinuationResult> b(Executor executor, bwf<TResult, bwl<TContinuationResult>> bwfVar) {
        bxj bxjVar = new bxj();
        this.b.a(new bwu(executor, bwfVar, bxjVar));
        j();
        return bxjVar;
    }

    @Override // defpackage.bwl
    public final bwl<TResult> a(bwh<TResult> bwhVar) {
        this.b.a(new bwy(bwn.a, bwhVar));
        j();
        return this;
    }

    @Override // defpackage.bwl
    public final bwl<TResult> a(bwi bwiVar) {
        a(bwn.a, bwiVar);
        return this;
    }

    @Override // defpackage.bwl
    public final <TContinuationResult> bwl<TContinuationResult> a(Executor executor, bwk<TResult, TContinuationResult> bwkVar) {
        bxj bxjVar = new bxj();
        this.b.a(new bxe(executor, bwkVar, bxjVar));
        j();
        return bxjVar;
    }

    @Override // defpackage.bwl
    public final bwl<TResult> a(Executor executor, bwg bwgVar) {
        this.b.a(new bww(executor, bwgVar));
        j();
        return this;
    }

    @Override // defpackage.bwl
    public final bwl<TResult> a(Executor executor, bwi bwiVar) {
        this.b.a(new bxa(executor, bwiVar));
        j();
        return this;
    }

    @Override // defpackage.bwl
    public final bwl<TResult> a(Executor executor, bwj<? super TResult> bwjVar) {
        this.b.a(new bxc(executor, bwjVar));
        j();
        return this;
    }

    @Override // defpackage.bwl
    public final <X extends Throwable> TResult a(Class<X> cls) throws Throwable {
        TResult tresult;
        synchronized (this.a) {
            g();
            h();
            if (!cls.isInstance(this.f)) {
                Exception exc = this.f;
                if (exc == null) {
                    tresult = this.e;
                } else {
                    throw new RuntimeExecutionException(exc);
                }
            } else {
                throw cls.cast(this.f);
            }
        }
        return tresult;
    }

    @Override // defpackage.bwl
    public final bwl<TResult> a(Executor executor, bwh<TResult> bwhVar) {
        this.b.a(new bwy(executor, bwhVar));
        j();
        return this;
    }
}
