package com.google.android.gms.common.api.internal;

import android.os.Looper;
import android.os.Message;
import android.util.Log;
import android.util.Pair;
import com.google.android.gms.common.api.Status;
import defpackage.vg;
import defpackage.vi;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.atomic.AtomicReference;

/* loaded from: classes.dex */
public abstract class BasePendingResult<R extends vi> extends vg<R> {
    public static final ThreadLocal<Boolean> c = new zg();
    public static final /* synthetic */ int f = 0;
    private final Object a;
    private final CountDownLatch b;
    protected final a<R> d;
    protected final WeakReference<vf> e;
    private final ArrayList<vg.a> g;
    private vj<? super R> h;
    private final AtomicReference<yt> i;
    private R j;
    private Status k;
    private volatile boolean l;
    private boolean m;
    private zh mResultGuardian;
    private boolean n;
    private aam o;
    private volatile ys<R> p;
    private boolean q;

    @Deprecated
    BasePendingResult() {
        this.a = new Object();
        this.b = new CountDownLatch(1);
        this.g = new ArrayList<>();
        this.i = new AtomicReference<>();
        this.q = false;
        this.d = new a<>(Looper.getMainLooper());
        this.e = new WeakReference<>(null);
    }

    public static void b(vi viVar) {
        if (viVar instanceof vh) {
            try {
                ((vh) viVar).b();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(viVar);
                String.valueOf(valueOf).length();
                "Unable to release ".concat(String.valueOf(valueOf));
            }
        }
    }

    private final void c(R r) {
        this.j = r;
        this.k = r.a();
        this.o = null;
        this.b.countDown();
        if (this.m) {
            this.h = null;
        } else {
            vj<? super R> vjVar = this.h;
            if (vjVar == null) {
                if (this.j instanceof vh) {
                    this.mResultGuardian = new zh(this);
                }
            } else {
                this.d.removeMessages(2);
                this.d.a(vjVar, f());
            }
        }
        ArrayList<vg.a> arrayList = this.g;
        int size = arrayList.size();
        for (int i = 0; i < size; i++) {
            arrayList.get(i).a(this.k);
        }
        this.g.clear();
    }

    private boolean d() {
        boolean z;
        synchronized (this.a) {
            z = this.m;
        }
        return z;
    }

    private boolean e() {
        return this.b.getCount() == 0;
    }

    private final R f() {
        R r;
        synchronized (this.a) {
            aat.b(!this.l, "Result has already been consumed.");
            aat.b(e(), "Result is not ready.");
            r = this.j;
            this.j = null;
            this.h = null;
            this.l = true;
        }
        yt andSet = this.i.getAndSet(null);
        if (andSet != null) {
            andSet.a.b.remove(this);
        }
        return (R) aat.a(r);
    }

    public abstract R a(Status status);

    public final void a() {
        synchronized (this.a) {
            if (!this.m && !this.l) {
                b(this.j);
                this.m = true;
                c((BasePendingResult<R>) a(Status.e));
            }
        }
    }

    @Override // defpackage.vg
    public final void a(vg.a aVar) {
        aat.a(true, (Object) "Callback cannot be null.");
        synchronized (this.a) {
            if (!e()) {
                this.g.add(aVar);
            } else {
                aVar.a(this.k);
            }
        }
    }

    @Override // defpackage.vg
    public final void a(vj<? super R> vjVar) {
        synchronized (this.a) {
            if (vjVar == null) {
                this.h = null;
                return;
            }
            boolean z = true;
            aat.b(!this.l, "Result has already been consumed.");
            if (this.p != null) {
                z = false;
            }
            aat.b(z, "Cannot set callbacks if then() has been called.");
            if (d()) {
                return;
            }
            if (e()) {
                this.d.a(vjVar, f());
            } else {
                this.h = vjVar;
            }
        }
    }

    public final void a(yt ytVar) {
        this.i.set(ytVar);
    }

    public final void b() {
        boolean z = true;
        if (!this.q && !c.get().booleanValue()) {
            z = false;
        }
        this.q = z;
    }

    @Deprecated
    public final void c(Status status) {
        synchronized (this.a) {
            if (!e()) {
                a((BasePendingResult<R>) a(status));
                this.n = true;
            }
        }
    }

    public final boolean c() {
        boolean d;
        synchronized (this.a) {
            if (this.e.get() == null || !this.q) {
                a();
            }
            d = d();
        }
        return d;
    }

    /* loaded from: classes.dex */
    public static class a<R extends vi> extends ait {
        public a() {
            super(Looper.getMainLooper());
        }

        public final void a(vj<? super R> vjVar, R r) {
            int i = BasePendingResult.f;
            sendMessage(obtainMessage(1, new Pair((vj) aat.a(vjVar), r)));
        }

        /* JADX WARN: Multi-variable type inference failed */
        @Override // android.os.Handler
        public final void handleMessage(Message message) {
            int i = message.what;
            if (i == 1) {
                Pair pair = (Pair) message.obj;
                vj vjVar = (vj) pair.first;
                vi viVar = (vi) pair.second;
                try {
                    vjVar.a(viVar);
                } catch (RuntimeException e) {
                    BasePendingResult.b(viVar);
                    throw e;
                }
            } else if (i == 2) {
                ((BasePendingResult) message.obj).c(Status.d);
            } else {
                int i2 = message.what;
                StringBuilder sb = new StringBuilder(45);
                sb.append("Don't know how to handle message: ");
                sb.append(i2);
                Log.wtf("BasePendingResult", sb.toString(), new Exception());
            }
        }

        public a(Looper looper) {
            super(looper);
        }
    }

    public final void a(R r) {
        synchronized (this.a) {
            if (this.n || this.m) {
                b(r);
                return;
            }
            e();
            aat.b(!e(), "Results have already been set");
            aat.b(!this.l, "Result has already been consumed");
            c((BasePendingResult<R>) r);
        }
    }

    @Override // defpackage.vg
    public final R a(long j, TimeUnit timeUnit) {
        if (j > 0) {
            aat.c("await must not be called on the UI thread when time is greater than zero.");
        }
        boolean z = true;
        aat.b(!this.l, "Result has already been consumed.");
        if (this.p != null) {
            z = false;
        }
        aat.b(z, "Cannot await if then() has been called.");
        try {
            if (!this.b.await(j, timeUnit)) {
                c(Status.d);
            }
        } catch (InterruptedException unused) {
            c(Status.b);
        }
        aat.b(e(), "Result is not ready.");
        return f();
    }

    public BasePendingResult(vf vfVar) {
        this.a = new Object();
        this.b = new CountDownLatch(1);
        this.g = new ArrayList<>();
        this.i = new AtomicReference<>();
        this.q = false;
        this.d = new a<>(vfVar != null ? vfVar.a() : Looper.getMainLooper());
        this.e = new WeakReference<>(vfVar);
    }
}
