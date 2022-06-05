package defpackage;

import android.os.Build;
import android.util.Log;
import androidx.core.util.Pools;
import com.bumptech.glide.Registry;
import com.bumptech.glide.load.engine.GlideException;
import defpackage.dp;
import defpackage.ds;
import defpackage.fw;
import defpackage.lh;
import defpackage.lj;
import java.util.ArrayList;
import java.util.List;

/* renamed from: dr  reason: default package */
/* loaded from: classes2.dex */
final class dr<R> implements dp.a, Comparable<dr<?>>, Runnable, lh.c {
    private ck A;
    private Object B;
    private cf C;
    private cu<?> D;
    private volatile boolean E;
    private boolean F;
    final d b;
    bq e;
    ck f;
    bt g;
    dx h;
    int i;
    int j;
    dt k;
    cm l;
    a<R> m;
    int n;
    f o;
    boolean p;
    Object q;
    ck r;
    volatile dp s;
    volatile boolean t;
    private final Pools.Pool<dr<?>> w;
    private g x;
    private long y;
    private Thread z;
    final dq<R> a = new dq<>();
    private final List<Throwable> u = new ArrayList();
    private final lj v = new lj.a();
    final c<?> c = new c<>();
    final e d = new e();

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dr$a */
    /* loaded from: classes2.dex */
    public interface a<R> {
        void a(GlideException glideException);

        void a(dr<?> drVar);

        void a(ee<R> eeVar, cf cfVar, boolean z);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dr$d */
    /* loaded from: classes2.dex */
    public interface d {
        ex a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dr$f */
    /* loaded from: classes2.dex */
    public enum f {
        INITIALIZE,
        SWITCH_TO_SOURCE_SERVICE,
        DECODE_DATA
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dr$g */
    /* loaded from: classes2.dex */
    public enum g {
        INITIALIZE,
        RESOURCE_CACHE,
        DATA_CACHE,
        SOURCE,
        ENCODE,
        FINISHED
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(dr<?> drVar) {
        dr<?> drVar2 = drVar;
        int ordinal = this.g.ordinal() - drVar2.g.ordinal();
        return ordinal == 0 ? this.n - drVar2.n : ordinal;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dr(d dVar, Pools.Pool<dr<?>> pool) {
        this.b = dVar;
        this.w = pool;
    }

    private void d() {
        if (this.d.b()) {
            a();
        }
    }

    private void e() {
        if (this.d.c()) {
            a();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a() {
        this.d.d();
        this.c.b();
        this.a.a();
        this.E = false;
        this.e = null;
        this.f = null;
        this.l = null;
        this.g = null;
        this.h = null;
        this.m = null;
        this.x = null;
        this.s = null;
        this.z = null;
        this.r = null;
        this.B = null;
        this.C = null;
        this.D = null;
        this.y = 0L;
        this.t = false;
        this.q = null;
        this.u.clear();
        this.w.release(this);
    }

    @Override // java.lang.Runnable
    public final void run() {
        li.b();
        cu<?> cuVar = this.D;
        try {
            try {
                if (this.t) {
                    h();
                    return;
                }
                int i = AnonymousClass1.a[this.o.ordinal()];
                if (i == 1) {
                    this.x = a(g.INITIALIZE);
                    this.s = f();
                    g();
                } else if (i == 2) {
                    g();
                } else if (i == 3) {
                    j();
                } else {
                    throw new IllegalStateException("Unrecognized run reason: " + this.o);
                }
                if (cuVar != null) {
                    cuVar.b();
                }
                li.f();
            } finally {
                if (cuVar != null) {
                    cuVar.b();
                }
                li.f();
            }
        } catch (dl e2) {
            throw e2;
        } catch (Throwable th) {
            if (Log.isLoggable("DecodeJob", 3)) {
                StringBuilder sb = new StringBuilder("DecodeJob threw unexpectedly, isCancelled: ");
                sb.append(this.t);
                sb.append(", stage: ");
                sb.append(this.x);
            }
            if (this.x != g.ENCODE) {
                this.u.add(th);
                h();
            }
            if (!this.t) {
                throw th;
            }
            throw th;
        }
    }

    private dp f() {
        int i = AnonymousClass1.b[this.x.ordinal()];
        if (i != 1) {
            if (i == 2) {
                return new dm(this.a, this);
            }
            if (i == 3) {
                return new ei(this.a, this);
            }
            if (i == 4) {
                return null;
            }
            throw new IllegalStateException("Unrecognized stage: " + this.x);
        }
        return new ef(this.a, this);
    }

    private void g() {
        this.z = Thread.currentThread();
        this.y = lb.a();
        boolean z = false;
        while (!this.t && this.s != null && !(z = this.s.a())) {
            this.x = a(this.x);
            this.s = f();
            if (this.x == g.SOURCE) {
                c();
                return;
            }
        }
        if ((this.x == g.FINISHED || this.t) && !z) {
            h();
        }
    }

    private void h() {
        i();
        this.m.a(new GlideException("Failed to load resource", new ArrayList(this.u)));
        e();
    }

    private void a(ee<R> eeVar, cf cfVar, boolean z) {
        i();
        this.m.a(eeVar, cfVar, z);
    }

    private void i() {
        Throwable th;
        this.v.a();
        if (this.E) {
            if (this.u.isEmpty()) {
                th = null;
            } else {
                List<Throwable> list = this.u;
                th = list.get(list.size() - 1);
            }
            throw new IllegalStateException("Already notified", th);
        }
        this.E = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Code restructure failed: missing block: B:20:0x0037, code lost:
        return defpackage.dr.g.FINISHED;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.dr.g a(defpackage.dr.g r3) {
        /*
            r2 = this;
        L0:
            int[] r0 = defpackage.dr.AnonymousClass1.b
            int r1 = r3.ordinal()
            r0 = r0[r1]
            r1 = 1
            if (r0 == r1) goto L42
            r1 = 2
            if (r0 == r1) goto L38
            r1 = 3
            if (r0 == r1) goto L35
            r1 = 4
            if (r0 == r1) goto L35
            r1 = 5
            if (r0 != r1) goto L25
            dt r3 = r2.k
            boolean r3 = r3.a()
            if (r3 == 0) goto L22
            dr$g r3 = defpackage.dr.g.RESOURCE_CACHE
            return r3
        L22:
            dr$g r3 = defpackage.dr.g.RESOURCE_CACHE
            goto L0
        L25:
            java.lang.IllegalArgumentException r0 = new java.lang.IllegalArgumentException
            java.lang.String r3 = java.lang.String.valueOf(r3)
            java.lang.String r1 = "Unrecognized stage: "
            java.lang.String r3 = r1.concat(r3)
            r0.<init>(r3)
            throw r0
        L35:
            dr$g r3 = defpackage.dr.g.FINISHED
            return r3
        L38:
            boolean r3 = r2.p
            if (r3 == 0) goto L3f
            dr$g r3 = defpackage.dr.g.FINISHED
            return r3
        L3f:
            dr$g r3 = defpackage.dr.g.SOURCE
            return r3
        L42:
            dt r3 = r2.k
            boolean r3 = r3.b()
            if (r3 == 0) goto L4d
            dr$g r3 = defpackage.dr.g.DATA_CACHE
            return r3
        L4d:
            dr$g r3 = defpackage.dr.g.DATA_CACHE
            goto L0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dr.a(dr$g):dr$g");
    }

    @Override // defpackage.dp.a
    public final void c() {
        this.o = f.SWITCH_TO_SOURCE_SERVICE;
        this.m.a((dr<?>) this);
    }

    @Override // defpackage.dp.a
    public final void a(ck ckVar, Object obj, cu<?> cuVar, cf cfVar, ck ckVar2) {
        this.r = ckVar;
        this.B = obj;
        this.D = cuVar;
        this.C = cfVar;
        this.A = ckVar2;
        boolean z = false;
        if (ckVar != this.a.d().get(0)) {
            z = true;
        }
        this.F = z;
        if (Thread.currentThread() != this.z) {
            this.o = f.DECODE_DATA;
            this.m.a((dr<?>) this);
            return;
        }
        li.a();
        try {
            j();
        } finally {
            li.f();
        }
    }

    @Override // defpackage.dp.a
    public final void a(ck ckVar, Exception exc, cu<?> cuVar, cf cfVar) {
        cuVar.b();
        GlideException glideException = new GlideException("Fetching data failed", exc);
        glideException.a(ckVar, cfVar, cuVar.a());
        this.u.add(glideException);
        if (Thread.currentThread() != this.z) {
            this.o = f.SWITCH_TO_SOURCE_SERVICE;
            this.m.a((dr<?>) this);
            return;
        }
        g();
    }

    private void j() {
        if (Log.isLoggable("DecodeJob", 2)) {
            long j = this.y;
            a("Retrieved data", j, "data: " + this.B + ", cache key: " + this.r + ", fetcher: " + this.D);
        }
        ee<R> eeVar = null;
        try {
            eeVar = a(this.D, (cu<?>) this.B, this.C);
        } catch (GlideException e2) {
            e2.a(this.A, this.C, null);
            this.u.add(e2);
        }
        if (eeVar != null) {
            b(eeVar, this.C, this.F);
        } else {
            g();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    private void b(ee<R> eeVar, cf cfVar, boolean z) {
        li.a();
        try {
            if (eeVar instanceof ea) {
                ((ea) eeVar).e();
            }
            ed edVar = 0;
            if (this.c.a()) {
                eeVar = ed.a(eeVar);
                edVar = eeVar;
            }
            a(eeVar, cfVar, z);
            this.x = g.ENCODE;
            if (this.c.a()) {
                this.c.a(this.b, this.l);
            }
            if (edVar != 0) {
                edVar.e();
            }
            d();
        } finally {
            li.f();
        }
    }

    private <Data> ee<R> a(cu<?> cuVar, Data data, cf cfVar) throws GlideException {
        if (data == null) {
            return null;
        }
        try {
            long a2 = lb.a();
            ee<R> a3 = a((dr<R>) data, cfVar, (ec<dr<R>, ResourceType, R>) ((ec<Data, ?, R>) this.a.b(data.getClass())));
            if (Log.isLoggable("DecodeJob", 2)) {
                a("Decoded result ".concat(String.valueOf(a3)), a2, (String) null);
            }
            return a3;
        } finally {
            cuVar.b();
        }
    }

    private void a(String str, long j, String str2) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(lb.a(j));
        sb.append(", load key: ");
        sb.append(this.h);
        sb.append(str2 != null ? ", ".concat(String.valueOf(str2)) : "");
        sb.append(", thread: ");
        sb.append(Thread.currentThread().getName());
    }

    @Override // defpackage.lh.c
    public final lj a_() {
        return this.v;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dr$1  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass1 {
        static final /* synthetic */ int[] a;
        static final /* synthetic */ int[] b;
        static final /* synthetic */ int[] c;

        static {
            int[] iArr = new int[ch.values().length];
            c = iArr;
            try {
                iArr[ch.SOURCE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                c[ch.TRANSFORMED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            int[] iArr2 = new int[g.values().length];
            b = iArr2;
            try {
                iArr2[g.RESOURCE_CACHE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                b[g.DATA_CACHE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                b[g.SOURCE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                b[g.FINISHED.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                b[g.INITIALIZE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            int[] iArr3 = new int[f.values().length];
            a = iArr3;
            try {
                iArr3[f.INITIALIZE.ordinal()] = 1;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                a[f.SWITCH_TO_SOURCE_SERVICE.ordinal()] = 2;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                a[f.DECODE_DATA.ordinal()] = 3;
            } catch (NoSuchFieldError unused10) {
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dr$b */
    /* loaded from: classes2.dex */
    public final class b<Z> implements ds.a<Z> {
        private final cf b;

        b(cf cfVar) {
            this.b = cfVar;
        }

        @Override // defpackage.ds.a
        public final ee<Z> a(ee<Z> eeVar) {
            cq<Z> cqVar;
            ee<Z> eeVar2;
            ch chVar;
            ck ckVar;
            dr drVar = dr.this;
            cf cfVar = this.b;
            Class<?> cls = eeVar.b().getClass();
            cp<Z> cpVar = null;
            if (cfVar != cf.RESOURCE_DISK_CACHE) {
                cq<Z> c = drVar.a.c(cls);
                cqVar = c;
                eeVar2 = c.a(drVar.e, eeVar, drVar.i, drVar.j);
            } else {
                eeVar2 = eeVar;
                cqVar = null;
            }
            if (!eeVar.equals(eeVar2)) {
                eeVar.d();
            }
            boolean z = false;
            if (!(drVar.a.a.c.b.a(eeVar2.a()) != null)) {
                chVar = ch.NONE;
            } else {
                cpVar = drVar.a.a.c.b.a(eeVar2.a());
                if (cpVar != null) {
                    chVar = cpVar.a(drVar.l);
                } else {
                    throw new Registry.NoResultEncoderAvailableException(eeVar2.a());
                }
            }
            cp<Z> cpVar2 = cpVar;
            dq<R> dqVar = drVar.a;
            ck ckVar2 = drVar.r;
            List<fw.a<?>> c2 = dqVar.c();
            int size = c2.size();
            int i = 0;
            while (true) {
                if (i >= size) {
                    break;
                } else if (c2.get(i).a.equals(ckVar2)) {
                    z = true;
                    break;
                } else {
                    i++;
                }
            }
            if (drVar.k.a(!z, cfVar, chVar)) {
                if (cpVar2 == null) {
                    throw new Registry.NoResultEncoderAvailableException(eeVar2.b().getClass());
                }
                int i2 = AnonymousClass1.c[chVar.ordinal()];
                if (i2 == 1) {
                    ckVar = new dn(drVar.r, drVar.f);
                } else if (i2 == 2) {
                    ckVar = new eg(drVar.a.a.b, drVar.r, drVar.f, drVar.i, drVar.j, cqVar, cls, drVar.l);
                } else {
                    throw new IllegalArgumentException("Unknown strategy: ".concat(String.valueOf(chVar)));
                }
                ed<Z> a = ed.a(eeVar2);
                c<?> cVar = drVar.c;
                cVar.a = ckVar;
                cVar.b = cpVar2;
                cVar.c = a;
                return a;
            }
            return eeVar2;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dr$e */
    /* loaded from: classes2.dex */
    public static class e {
        private boolean a;
        private boolean b;
        private boolean c;

        e() {
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final synchronized boolean a() {
            this.a = true;
            return e();
        }

        final synchronized boolean b() {
            this.b = true;
            return e();
        }

        final synchronized boolean c() {
            this.c = true;
            return e();
        }

        final synchronized void d() {
            this.b = false;
            this.a = false;
            this.c = false;
        }

        private boolean e() {
            return (this.c || this.b) && this.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: dr$c */
    /* loaded from: classes2.dex */
    public static class c<Z> {
        ck a;
        cp<Z> b;
        ed<Z> c;

        c() {
        }

        final void a(d dVar, cm cmVar) {
            li.a();
            try {
                dVar.a().a(this.a, new C0053do(this.b, this.c, cmVar));
            } finally {
                this.c.e();
                li.f();
            }
        }

        final boolean a() {
            return this.c != null;
        }

        final void b() {
            this.a = null;
            this.b = null;
            this.c = null;
        }
    }

    private <Data, ResourceType> ee<R> a(Data data, cf cfVar, ec<Data, ResourceType, R> ecVar) throws GlideException {
        cm cmVar = this.l;
        if (Build.VERSION.SDK_INT >= 26) {
            boolean z = cfVar == cf.RESOURCE_DISK_CACHE || this.a.n;
            Boolean bool = (Boolean) cmVar.a(ha.e);
            if (bool == null || (bool.booleanValue() && !z)) {
                cmVar = new cm();
                cmVar.a(this.l);
                cmVar.a(ha.e, Boolean.valueOf(z));
            }
        }
        cm cmVar2 = cmVar;
        cv<Data> a2 = this.e.c.a((Registry) data);
        try {
            return ecVar.a(a2, cmVar2, this.i, this.j, new b(cfVar));
        } finally {
            a2.b();
        }
    }
}
