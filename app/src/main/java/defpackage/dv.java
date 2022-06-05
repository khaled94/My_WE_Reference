package defpackage;

import androidx.core.util.Pools;
import com.bumptech.glide.load.engine.GlideException;
import defpackage.dr;
import defpackage.dz;
import defpackage.lh;
import defpackage.lj;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: dv  reason: default package */
/* loaded from: classes2.dex */
public final class dv<R> implements dr.a<R>, lh.c {
    private static final c g = new c();
    final e a;
    boolean b;
    cf c;
    GlideException d;
    dz<?> e;
    boolean f;
    private final lj h;
    private final dz.a i;
    private final Pools.Pool<dv<?>> j;
    private final c k;
    private final dw l;
    private final fh m;
    private final fh n;
    private final fh o;
    private final fh p;
    private final AtomicInteger q;
    private ck r;
    private boolean s;
    private boolean t;
    private boolean u;
    private ee<?> v;
    private boolean w;
    private boolean x;
    private dr<R> y;
    private volatile boolean z;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dv(fh fhVar, fh fhVar2, fh fhVar3, fh fhVar4, dw dwVar, dz.a aVar, Pools.Pool<dv<?>> pool) {
        this(fhVar, fhVar2, fhVar3, fhVar4, dwVar, aVar, pool, g);
    }

    private dv(fh fhVar, fh fhVar2, fh fhVar3, fh fhVar4, dw dwVar, dz.a aVar, Pools.Pool<dv<?>> pool, c cVar) {
        this.a = new e();
        this.h = new lj.a();
        this.q = new AtomicInteger();
        this.m = fhVar;
        this.n = fhVar2;
        this.o = fhVar3;
        this.p = fhVar4;
        this.l = dwVar;
        this.i = aVar;
        this.j = pool;
        this.k = cVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized dv<R> a(ck ckVar, boolean z, boolean z2, boolean z3, boolean z4) {
        this.r = ckVar;
        this.s = z;
        this.t = z2;
        this.u = z3;
        this.b = z4;
        return this;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0017 A[Catch: all -> 0x0023, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:11:0x0017, B:12:0x001a, B:13:0x001e), top: B:18:0x0001 }] */
    /* JADX WARN: Removed duplicated region for block: B:12:0x001a A[Catch: all -> 0x0023, TryCatch #0 {, blocks: (B:3:0x0001, B:5:0x000d, B:11:0x0017, B:12:0x001a, B:13:0x001e), top: B:18:0x0001 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void b(defpackage.dr<R> r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            r2.y = r3     // Catch: java.lang.Throwable -> L23
            dr$g r0 = defpackage.dr.g.INITIALIZE     // Catch: java.lang.Throwable -> L23
            dr$g r0 = r3.a(r0)     // Catch: java.lang.Throwable -> L23
            dr$g r1 = defpackage.dr.g.RESOURCE_CACHE     // Catch: java.lang.Throwable -> L23
            if (r0 == r1) goto L14
            dr$g r1 = defpackage.dr.g.DATA_CACHE     // Catch: java.lang.Throwable -> L23
            if (r0 != r1) goto L12
            goto L14
        L12:
            r0 = 0
            goto L15
        L14:
            r0 = 1
        L15:
            if (r0 == 0) goto L1a
            fh r0 = r2.m     // Catch: java.lang.Throwable -> L23
            goto L1e
        L1a:
            fh r0 = r2.c()     // Catch: java.lang.Throwable -> L23
        L1e:
            r0.execute(r3)     // Catch: java.lang.Throwable -> L23
            monitor-exit(r2)
            return
        L23:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv.b(dr):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(kc kcVar, Executor executor) {
        this.h.a();
        this.a.a.add(new d(kcVar, executor));
        boolean z = true;
        if (this.w) {
            a(1);
            executor.execute(new b(kcVar));
        } else if (this.x) {
            a(1);
            executor.execute(new a(kcVar));
        } else {
            if (this.z) {
                z = false;
            }
            lf.a(z, "Cannot add callbacks to a cancelled EngineJob");
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r2.q.get() != 0) goto L21;
     */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0048, code lost:
        e();
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final synchronized void a(defpackage.kc r3) {
        /*
            r2 = this;
            monitor-enter(r2)
            lj r0 = r2.h     // Catch: java.lang.Throwable -> L4d
            r0.a()     // Catch: java.lang.Throwable -> L4d
            dv$e r0 = r2.a     // Catch: java.lang.Throwable -> L4d
            java.util.List<dv$d> r0 = r0.a     // Catch: java.lang.Throwable -> L4d
            dv$d r3 = defpackage.dv.e.b(r3)     // Catch: java.lang.Throwable -> L4d
            r0.remove(r3)     // Catch: java.lang.Throwable -> L4d
            dv$e r3 = r2.a     // Catch: java.lang.Throwable -> L4d
            boolean r3 = r3.a()     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L4b
            boolean r3 = r2.d()     // Catch: java.lang.Throwable -> L4d
            r0 = 1
            if (r3 != 0) goto L34
            r2.z = r0     // Catch: java.lang.Throwable -> L4d
            dr<R> r3 = r2.y     // Catch: java.lang.Throwable -> L4d
            r3.t = r0     // Catch: java.lang.Throwable -> L4d
            dp r3 = r3.s     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L2d
            r3.b()     // Catch: java.lang.Throwable -> L4d
        L2d:
            dw r3 = r2.l     // Catch: java.lang.Throwable -> L4d
            ck r1 = r2.r     // Catch: java.lang.Throwable -> L4d
            r3.a(r2, r1)     // Catch: java.lang.Throwable -> L4d
        L34:
            boolean r3 = r2.w     // Catch: java.lang.Throwable -> L4d
            if (r3 != 0) goto L3e
            boolean r3 = r2.x     // Catch: java.lang.Throwable -> L4d
            if (r3 == 0) goto L3d
            goto L3e
        L3d:
            r0 = 0
        L3e:
            if (r0 == 0) goto L4b
            java.util.concurrent.atomic.AtomicInteger r3 = r2.q     // Catch: java.lang.Throwable -> L4d
            int r3 = r3.get()     // Catch: java.lang.Throwable -> L4d
            if (r3 != 0) goto L4b
            r2.e()     // Catch: java.lang.Throwable -> L4d
        L4b:
            monitor-exit(r2)
            return
        L4d:
            r3 = move-exception
            monitor-exit(r2)
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dv.a(kc):void");
    }

    private fh c() {
        if (this.t) {
            return this.o;
        }
        return this.u ? this.p : this.n;
    }

    private boolean d() {
        return this.x || this.w || this.z;
    }

    private synchronized void a(int i) {
        lf.a(d(), "Not yet complete!");
        if (this.q.getAndAdd(i) == 0 && this.e != null) {
            this.e.e();
        }
    }

    final void a() {
        dz<?> dzVar;
        synchronized (this) {
            this.h.a();
            lf.a(d(), "Not yet complete!");
            int decrementAndGet = this.q.decrementAndGet();
            lf.a(decrementAndGet >= 0, "Can't decrement below 0");
            if (decrementAndGet == 0) {
                dzVar = this.e;
                e();
            } else {
                dzVar = null;
            }
        }
        if (dzVar != null) {
            dzVar.f();
        }
    }

    private synchronized void e() {
        if (this.r == null) {
            throw new IllegalArgumentException();
        }
        this.a.a.clear();
        this.r = null;
        this.e = null;
        this.v = null;
        this.x = false;
        this.z = false;
        this.w = false;
        this.f = false;
        dr<R> drVar = this.y;
        if (drVar.d.a()) {
            drVar.a();
        }
        this.y = null;
        this.d = null;
        this.c = null;
        this.j.release(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dr.a
    public final void a(ee<R> eeVar, cf cfVar, boolean z) {
        synchronized (this) {
            this.v = eeVar;
            this.c = cfVar;
            this.f = z;
        }
        synchronized (this) {
            this.h.a();
            if (this.z) {
                this.v.d();
                e();
            } else if (this.a.a()) {
                throw new IllegalStateException("Received a resource without any callbacks to notify");
            } else {
                if (this.w) {
                    throw new IllegalStateException("Already have resource");
                }
                this.e = new dz<>(this.v, this.s, true, this.r, this.i);
                this.w = true;
                e c2 = this.a.c();
                a(c2.b() + 1);
                this.l.a(this, this.r, this.e);
                Iterator<d> it = c2.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.b.execute(new b(next.a));
                }
                a();
            }
        }
    }

    @Override // defpackage.dr.a
    public final void a(GlideException glideException) {
        synchronized (this) {
            this.d = glideException;
        }
        synchronized (this) {
            this.h.a();
            if (this.z) {
                e();
            } else if (this.a.a()) {
                throw new IllegalStateException("Received an exception without any callbacks to notify");
            } else {
                if (this.x) {
                    throw new IllegalStateException("Already failed once");
                }
                this.x = true;
                ck ckVar = this.r;
                e c2 = this.a.c();
                a(c2.b() + 1);
                this.l.a(this, ckVar, null);
                Iterator<d> it = c2.iterator();
                while (it.hasNext()) {
                    d next = it.next();
                    next.b.execute(new a(next.a));
                }
                a();
            }
        }
    }

    @Override // defpackage.dr.a
    public final void a(dr<?> drVar) {
        c().execute(drVar);
    }

    @Override // defpackage.lh.c
    public final lj a_() {
        return this.h;
    }

    /* renamed from: dv$a */
    /* loaded from: classes2.dex */
    class a implements Runnable {
        private final kc b;

        a(kc kcVar) {
            this.b = kcVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.b.h()) {
                synchronized (dv.this) {
                    if (dv.this.a.a(this.b)) {
                        dv dvVar = dv.this;
                        try {
                            this.b.a(dvVar.d);
                        } catch (Throwable th) {
                            throw new dl(th);
                        }
                    }
                    dv.this.a();
                }
            }
        }
    }

    /* renamed from: dv$b */
    /* loaded from: classes2.dex */
    class b implements Runnable {
        private final kc b;

        b(kc kcVar) {
            this.b = kcVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            synchronized (this.b.h()) {
                synchronized (dv.this) {
                    if (dv.this.a.a(this.b)) {
                        dv.this.e.e();
                        dv dvVar = dv.this;
                        try {
                            this.b.a(dvVar.e, dvVar.c);
                            dv.this.a(this.b);
                        } catch (Throwable th) {
                            throw new dl(th);
                        }
                    }
                    dv.this.a();
                }
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dv$e */
    /* loaded from: classes2.dex */
    public static final class e implements Iterable<d> {
        final List<d> a;

        e() {
            this(new ArrayList(2));
        }

        private e(List<d> list) {
            this.a = list;
        }

        final boolean a(kc kcVar) {
            return this.a.contains(b(kcVar));
        }

        final boolean a() {
            return this.a.isEmpty();
        }

        final int b() {
            return this.a.size();
        }

        final e c() {
            return new e(new ArrayList(this.a));
        }

        static d b(kc kcVar) {
            return new d(kcVar, kz.b());
        }

        @Override // java.lang.Iterable
        public final Iterator<d> iterator() {
            return this.a.iterator();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dv$d */
    /* loaded from: classes2.dex */
    public static final class d {
        final kc a;
        final Executor b;

        d(kc kcVar, Executor executor) {
            this.a = kcVar;
            this.b = executor;
        }

        public final boolean equals(Object obj) {
            if (obj instanceof d) {
                return this.a.equals(((d) obj).a);
            }
            return false;
        }

        public final int hashCode() {
            return this.a.hashCode();
        }
    }

    /* renamed from: dv$c */
    /* loaded from: classes2.dex */
    static class c {
        c() {
        }
    }
}
