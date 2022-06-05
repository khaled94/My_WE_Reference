package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.drawable.Drawable;
import android.util.Log;
import com.bumptech.glide.load.engine.GlideException;
import defpackage.bp;
import defpackage.du;
import defpackage.lj;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.Executor;

/* renamed from: kd  reason: default package */
/* loaded from: classes2.dex */
public final class kd<R> implements jy, kc, kl {
    private static final boolean a = Log.isLoggable("GlideRequest", 2);
    private Drawable A;
    private int B;
    private int C;
    private boolean D;
    private RuntimeException E;
    private int b;
    private final String c;
    private final lj d;
    private final Object e;
    private final ka<R> f;
    private final jz g;
    private final Context h;
    private final bq i;
    private final Object j;
    private final Class<R> k;
    private final jw<?> l;
    private final int m;
    private final int n;
    private final bt o;
    private final km<R> p;
    private final List<ka<R>> q;
    private final kq<? super R> r;
    private final Executor s;
    private ee<R> t;
    private du.d u;
    private long v;
    private volatile du w;
    private int x;
    private Drawable y;
    private Drawable z;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: kd$a */
    /* loaded from: classes2.dex */
    public static final class a extends Enum<a> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        public static final int f = 6;
        private static final /* synthetic */ int[] g = {1, 2, 3, 4, 5, 6};
    }

    public static <R> kd<R> a(Context context, bq bqVar, Object obj, Object obj2, Class<R> cls, jw<?> jwVar, int i, int i2, bt btVar, km<R> kmVar, ka<R> kaVar, List<ka<R>> list, jz jzVar, du duVar, kq<? super R> kqVar, Executor executor) {
        return new kd<>(context, bqVar, obj, obj2, cls, jwVar, i, i2, btVar, kmVar, kaVar, list, jzVar, duVar, kqVar, executor);
    }

    private kd(Context context, bq bqVar, Object obj, Object obj2, Class<R> cls, jw<?> jwVar, int i, int i2, bt btVar, km<R> kmVar, ka<R> kaVar, List<ka<R>> list, jz jzVar, du duVar, kq<? super R> kqVar, Executor executor) {
        this.c = a ? String.valueOf(super.hashCode()) : null;
        this.d = new lj.a();
        this.e = obj;
        this.h = context;
        this.i = bqVar;
        this.j = obj2;
        this.k = cls;
        this.l = jwVar;
        this.m = i;
        this.n = i2;
        this.o = btVar;
        this.p = kmVar;
        this.f = kaVar;
        this.q = list;
        this.g = jzVar;
        this.w = duVar;
        this.r = kqVar;
        this.s = executor;
        this.x = a.a;
        if (this.E != null || !bqVar.g.a(bp.c.class)) {
            return;
        }
        this.E = new RuntimeException("Glide request origin trace");
    }

    @Override // defpackage.jy
    public final void a() {
        synchronized (this.e) {
            j();
            this.d.a();
            this.v = lb.a();
            if (this.j == null) {
                if (lg.a(this.m, this.n)) {
                    this.B = this.m;
                    this.C = this.n;
                }
                a(new GlideException("Received null model"), l() == null ? 5 : 3);
            } else if (this.x == a.b) {
                throw new IllegalArgumentException("Cannot restart a running request");
            } else {
                if (this.x == a.d) {
                    a((ee<?>) this.t, cf.MEMORY_CACHE);
                    return;
                }
                i();
                this.b = li.d();
                this.x = a.c;
                if (lg.a(this.m, this.n)) {
                    a(this.m, this.n);
                } else {
                    this.p.a((kl) this);
                }
                if ((this.x == a.b || this.x == a.c) && o()) {
                    this.p.b(k());
                }
                if (a) {
                    a("finished run method in " + lb.a(this.v));
                }
            }
        }
    }

    private void i() {
        List<ka<R>> list = this.q;
        if (list == null) {
            return;
        }
        Iterator<ka<R>> it = list.iterator();
        while (it.hasNext()) {
            it.next();
        }
    }

    private void j() {
        if (!this.D) {
            return;
        }
        throw new IllegalStateException("You can't start or clear loads in RequestListener or Target callbacks. If you're trying to start a fallback request when a load fails, use RequestBuilder#error(RequestBuilder). Otherwise consider posting your into() or clear() calls to the main thread using a Handler instead.");
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x0053 A[Catch: all -> 0x006a, TryCatch #1 {, blocks: (B:4:0x0003, B:6:0x0011, B:8:0x0013, B:10:0x0025, B:11:0x0029, B:14:0x0032, B:15:0x0038, B:17:0x003c, B:18:0x0041, B:20:0x0045, B:26:0x0053, B:27:0x005c, B:28:0x0063, B:12:0x002a, B:13:0x0031), top: B:35:0x0003 }] */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:36:? A[RETURN, SYNTHETIC] */
    @Override // defpackage.jy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void b() {
        /*
            r5 = this;
            java.lang.Object r0 = r5.e
            monitor-enter(r0)
            r5.j()     // Catch: java.lang.Throwable -> L6a
            lj r1 = r5.d     // Catch: java.lang.Throwable -> L6a
            r1.a()     // Catch: java.lang.Throwable -> L6a
            int r1 = r5.x     // Catch: java.lang.Throwable -> L6a
            int r2 = defpackage.kd.a.f     // Catch: java.lang.Throwable -> L6a
            if (r1 != r2) goto L13
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            return
        L13:
            r5.j()     // Catch: java.lang.Throwable -> L6a
            lj r1 = r5.d     // Catch: java.lang.Throwable -> L6a
            r1.a()     // Catch: java.lang.Throwable -> L6a
            km<R> r1 = r5.p     // Catch: java.lang.Throwable -> L6a
            r1.b(r5)     // Catch: java.lang.Throwable -> L6a
            du$d r1 = r5.u     // Catch: java.lang.Throwable -> L6a
            r2 = 0
            if (r1 == 0) goto L38
            du$d r1 = r5.u     // Catch: java.lang.Throwable -> L6a
            du r3 = defpackage.du.this     // Catch: java.lang.Throwable -> L6a
            monitor-enter(r3)     // Catch: java.lang.Throwable -> L6a
            dv<?> r4 = r1.a     // Catch: java.lang.Throwable -> L35
            kc r1 = r1.b     // Catch: java.lang.Throwable -> L35
            r4.a(r1)     // Catch: java.lang.Throwable -> L35
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            r5.u = r2     // Catch: java.lang.Throwable -> L6a
            goto L38
        L35:
            r1 = move-exception
            monitor-exit(r3)     // Catch: java.lang.Throwable -> L35
            throw r1     // Catch: java.lang.Throwable -> L6a
        L38:
            ee<R> r1 = r5.t     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L41
            ee<R> r1 = r5.t     // Catch: java.lang.Throwable -> L6a
            r5.t = r2     // Catch: java.lang.Throwable -> L6a
            r2 = r1
        L41:
            jz r1 = r5.g     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L50
            jz r1 = r5.g     // Catch: java.lang.Throwable -> L6a
            boolean r1 = r1.d(r5)     // Catch: java.lang.Throwable -> L6a
            if (r1 == 0) goto L4e
            goto L50
        L4e:
            r1 = 0
            goto L51
        L50:
            r1 = 1
        L51:
            if (r1 == 0) goto L5c
            km<R> r1 = r5.p     // Catch: java.lang.Throwable -> L6a
            android.graphics.drawable.Drawable r3 = r5.k()     // Catch: java.lang.Throwable -> L6a
            r1.a(r3)     // Catch: java.lang.Throwable -> L6a
        L5c:
            defpackage.li.e()     // Catch: java.lang.Throwable -> L6a
            int r1 = defpackage.kd.a.f     // Catch: java.lang.Throwable -> L6a
            r5.x = r1     // Catch: java.lang.Throwable -> L6a
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L69
            defpackage.du.a(r2)
        L69:
            return
        L6a:
            r1 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L6a
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd.b():void");
    }

    @Override // defpackage.jy
    public final void c() {
        synchronized (this.e) {
            if (d()) {
                b();
            }
        }
    }

    @Override // defpackage.jy
    public final boolean d() {
        boolean z;
        synchronized (this.e) {
            if (this.x != a.b && this.x != a.c) {
                z = false;
            }
            z = true;
        }
        return z;
    }

    @Override // defpackage.jy
    public final boolean e() {
        boolean z;
        synchronized (this.e) {
            z = this.x == a.d;
        }
        return z;
    }

    @Override // defpackage.jy
    public final boolean f() {
        boolean z;
        synchronized (this.e) {
            z = this.x == a.f;
        }
        return z;
    }

    @Override // defpackage.jy, defpackage.jz
    public final boolean g() {
        boolean z;
        synchronized (this.e) {
            z = this.x == a.d;
        }
        return z;
    }

    private Drawable k() {
        if (this.z == null) {
            Drawable drawable = this.l.g;
            this.z = drawable;
            if (drawable == null && this.l.h > 0) {
                this.z = a(this.l.h);
            }
        }
        return this.z;
    }

    private Drawable l() {
        if (this.A == null) {
            Drawable drawable = this.l.o;
            this.A = drawable;
            if (drawable == null && this.l.p > 0) {
                this.A = a(this.l.p);
            }
        }
        return this.A;
    }

    private Drawable a(int i) {
        Resources.Theme theme;
        if (this.l.u == null) {
            theme = this.h.getTheme();
        } else {
            theme = this.l.u;
        }
        return ht.a(this.i, i, theme);
    }

    private void m() {
        if (!o()) {
            return;
        }
        Drawable drawable = null;
        if (this.j == null) {
            drawable = l();
        }
        if (drawable == null) {
            if (this.y == null) {
                Drawable drawable2 = this.l.e;
                this.y = drawable2;
                if (drawable2 == null && this.l.f > 0) {
                    this.y = a(this.l.f);
                }
            }
            drawable = this.y;
        }
        if (drawable == null) {
            drawable = k();
        }
        this.p.c(drawable);
    }

    @Override // defpackage.kl
    public final void a(int i, int i2) {
        Object obj;
        this.d.a();
        Object obj2 = this.e;
        synchronized (obj2) {
            try {
                try {
                    if (a) {
                        a("Got onSizeReady in " + lb.a(this.v));
                    }
                    if (this.x == a.c) {
                        this.x = a.b;
                        float f = this.l.b;
                        this.B = a(i, f);
                        this.C = a(i2, f);
                        if (a) {
                            a("finished setup for calling load in " + lb.a(this.v));
                        }
                        obj = obj2;
                        try {
                            this.u = this.w.a(this.i, this.j, this.l.l, this.B, this.C, this.l.s, this.k, this.o, this.l.c, this.l.r, this.l.m, this.l.y, this.l.q, this.l.i, this.l.w, this.l.z, this.l.x, this, this.s);
                            if (this.x != a.b) {
                                this.u = null;
                            }
                            if (a) {
                                a("finished onSizeReady in " + lb.a(this.v));
                            }
                        } catch (Throwable th) {
                            th = th;
                            throw th;
                        }
                    }
                } catch (Throwable th2) {
                    th = th2;
                    obj = obj2;
                }
            } catch (Throwable th3) {
                th = th3;
            }
        }
    }

    private static int a(int i, float f) {
        return i == Integer.MIN_VALUE ? i : Math.round(f * i);
    }

    private boolean n() {
        jz jzVar = this.g;
        return jzVar == null || jzVar.b(this);
    }

    private boolean o() {
        jz jzVar = this.g;
        return jzVar == null || jzVar.c(this);
    }

    private boolean p() {
        jz jzVar = this.g;
        return jzVar == null || !jzVar.h().g();
    }

    private void q() {
        jz jzVar = this.g;
        if (jzVar != null) {
            jzVar.f(this);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:21:0x0054, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x00a5, code lost:
        if (r6 == null) goto L52;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a7, code lost:
        defpackage.du.a(r6);
     */
    /* JADX WARN: Code restructure failed: missing block: B:37:0x00aa, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:51:?, code lost:
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:52:?, code lost:
        return;
     */
    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.kc
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.ee<?> r6, defpackage.cf r7) {
        /*
            r5 = this;
            lj r0 = r5.d
            r0.a()
            r0 = 0
            java.lang.Object r1 = r5.e     // Catch: java.lang.Throwable -> Lb2
            monitor-enter(r1)     // Catch: java.lang.Throwable -> Lb2
            r5.u = r0     // Catch: java.lang.Throwable -> Laf
            if (r6 != 0) goto L2c
            com.bumptech.glide.load.engine.GlideException r6 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Laf
            java.lang.StringBuilder r7 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = "Expected to receive a Resource<R> with an object of "
            r7.<init>(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.Class<R> r2 = r5.k     // Catch: java.lang.Throwable -> Laf
            r7.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r2 = " inside, but instead got null."
            r7.append(r2)     // Catch: java.lang.Throwable -> Laf
            java.lang.String r7 = r7.toString()     // Catch: java.lang.Throwable -> Laf
            r6.<init>(r7)     // Catch: java.lang.Throwable -> Laf
            r5.a(r6)     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Laf
            return
        L2c:
            java.lang.Object r2 = r6.b()     // Catch: java.lang.Throwable -> Laf
            if (r2 == 0) goto L5a
            java.lang.Class<R> r3 = r5.k     // Catch: java.lang.Throwable -> Laf
            java.lang.Class r4 = r2.getClass()     // Catch: java.lang.Throwable -> Laf
            boolean r3 = r3.isAssignableFrom(r4)     // Catch: java.lang.Throwable -> Laf
            if (r3 != 0) goto L3f
            goto L5a
        L3f:
            boolean r3 = r5.n()     // Catch: java.lang.Throwable -> Laf
            if (r3 != 0) goto L55
            r5.t = r0     // Catch: java.lang.Throwable -> Lab
            int r7 = defpackage.kd.a.d     // Catch: java.lang.Throwable -> Lab
            r5.x = r7     // Catch: java.lang.Throwable -> Lab
            defpackage.li.e()     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto L54
            defpackage.du.a(r6)
        L54:
            return
        L55:
            r5.a(r6, r2, r7)     // Catch: java.lang.Throwable -> Laf
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Laf
            return
        L5a:
            r5.t = r0     // Catch: java.lang.Throwable -> Lab
            com.bumptech.glide.load.engine.GlideException r7 = new com.bumptech.glide.load.engine.GlideException     // Catch: java.lang.Throwable -> Lab
            java.lang.StringBuilder r0 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = "Expected to receive an object of "
            r0.<init>(r3)     // Catch: java.lang.Throwable -> Lab
            java.lang.Class<R> r3 = r5.k     // Catch: java.lang.Throwable -> Lab
            r0.append(r3)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = " but instead got "
            r0.append(r3)     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L76
            java.lang.Class r3 = r2.getClass()     // Catch: java.lang.Throwable -> Lab
            goto L78
        L76:
            java.lang.String r3 = ""
        L78:
            r0.append(r3)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = "{"
            r0.append(r3)     // Catch: java.lang.Throwable -> Lab
            r0.append(r2)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = "} inside Resource{"
            r0.append(r3)     // Catch: java.lang.Throwable -> Lab
            r0.append(r6)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r3 = "}."
            r0.append(r3)     // Catch: java.lang.Throwable -> Lab
            if (r2 == 0) goto L95
            java.lang.String r2 = ""
            goto L97
        L95:
            java.lang.String r2 = " To indicate failure return a null Resource object, rather than a Resource object containing null data."
        L97:
            r0.append(r2)     // Catch: java.lang.Throwable -> Lab
            java.lang.String r0 = r0.toString()     // Catch: java.lang.Throwable -> Lab
            r7.<init>(r0)     // Catch: java.lang.Throwable -> Lab
            r5.a(r7)     // Catch: java.lang.Throwable -> Lab
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Lab
            if (r6 == 0) goto Laa
            defpackage.du.a(r6)
        Laa:
            return
        Lab:
            r7 = move-exception
            r0 = r6
            r6 = r7
            goto Lb0
        Laf:
            r6 = move-exception
        Lb0:
            monitor-exit(r1)     // Catch: java.lang.Throwable -> Laf
            throw r6     // Catch: java.lang.Throwable -> Lb2
        Lb2:
            r6 = move-exception
            if (r0 == 0) goto Lb8
            defpackage.du.a(r0)
        Lb8:
            throw r6
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd.a(ee, cf):void");
    }

    /* JADX WARN: Finally extract failed */
    private void a(ee<R> eeVar, R r, cf cfVar) {
        boolean z;
        p();
        this.x = a.d;
        this.t = eeVar;
        if (this.i.h <= 3) {
            StringBuilder sb = new StringBuilder("Finished loading ");
            sb.append(r.getClass().getSimpleName());
            sb.append(" from ");
            sb.append(cfVar);
            sb.append(" for ");
            sb.append(this.j);
            sb.append(" with size [");
            sb.append(this.B);
            sb.append("x");
            sb.append(this.C);
            sb.append("] in ");
            sb.append(lb.a(this.v));
            sb.append(" ms");
        }
        boolean z2 = true;
        this.D = true;
        try {
            if (this.q != null) {
                z = false;
                for (ka<R> kaVar : this.q) {
                    z |= kaVar.b();
                }
            } else {
                z = false;
            }
            if (this.f == null || !this.f.b()) {
                z2 = false;
            }
            if (!(z2 | z)) {
                this.r.a();
                this.p.a((km<R>) r);
            }
            this.D = false;
            jz jzVar = this.g;
            if (jzVar != null) {
                jzVar.e(this);
            }
            li.e();
        } catch (Throwable th) {
            this.D = false;
            throw th;
        }
    }

    @Override // defpackage.kc
    public final void a(GlideException glideException) {
        a(glideException, 5);
    }

    @Override // defpackage.kc
    public final Object h() {
        this.d.a();
        return this.e;
    }

    /* JADX WARN: Removed duplicated region for block: B:26:0x007d A[Catch: all -> 0x008a, TRY_LEAVE, TryCatch #1 {, blocks: (B:4:0x0008, B:6:0x0012, B:8:0x003a, B:9:0x003d, B:27:0x0080, B:28:0x0088, B:11:0x0048, B:13:0x004c, B:14:0x0053, B:16:0x0059, B:18:0x0069, B:20:0x006d, B:24:0x007a, B:26:0x007d), top: B:33:0x0008 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private void a(com.bumptech.glide.load.engine.GlideException r5, int r6) {
        /*
            r4 = this;
            lj r0 = r4.d
            r0.a()
            java.lang.Object r0 = r4.e
            monitor-enter(r0)
            java.lang.RuntimeException r1 = r4.E     // Catch: java.lang.Throwable -> L8e
            r5.a = r1     // Catch: java.lang.Throwable -> L8e
            bq r1 = r4.i     // Catch: java.lang.Throwable -> L8e
            int r1 = r1.h     // Catch: java.lang.Throwable -> L8e
            if (r1 > r6) goto L3d
            java.lang.StringBuilder r6 = new java.lang.StringBuilder     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "Load failed for "
            r6.<init>(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.Object r2 = r4.j     // Catch: java.lang.Throwable -> L8e
            r6.append(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = " with size ["
            r6.append(r2)     // Catch: java.lang.Throwable -> L8e
            int r2 = r4.B     // Catch: java.lang.Throwable -> L8e
            r6.append(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "x"
            r6.append(r2)     // Catch: java.lang.Throwable -> L8e
            int r2 = r4.C     // Catch: java.lang.Throwable -> L8e
            r6.append(r2)     // Catch: java.lang.Throwable -> L8e
            java.lang.String r2 = "]"
            r6.append(r2)     // Catch: java.lang.Throwable -> L8e
            r6 = 4
            if (r1 > r6) goto L3d
            r5.a()     // Catch: java.lang.Throwable -> L8e
        L3d:
            r5 = 0
            r4.u = r5     // Catch: java.lang.Throwable -> L8e
            int r5 = defpackage.kd.a.e     // Catch: java.lang.Throwable -> L8e
            r4.x = r5     // Catch: java.lang.Throwable -> L8e
            r5 = 1
            r4.D = r5     // Catch: java.lang.Throwable -> L8e
            r6 = 0
            java.util.List<ka<R>> r1 = r4.q     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L68
            java.util.List<ka<R>> r1 = r4.q     // Catch: java.lang.Throwable -> L8a
            java.util.Iterator r1 = r1.iterator()     // Catch: java.lang.Throwable -> L8a
            r2 = 0
        L53:
            boolean r3 = r1.hasNext()     // Catch: java.lang.Throwable -> L8a
            if (r3 == 0) goto L69
            java.lang.Object r3 = r1.next()     // Catch: java.lang.Throwable -> L8a
            ka r3 = (defpackage.ka) r3     // Catch: java.lang.Throwable -> L8a
            r4.p()     // Catch: java.lang.Throwable -> L8a
            boolean r3 = r3.a()     // Catch: java.lang.Throwable -> L8a
            r2 = r2 | r3
            goto L53
        L68:
            r2 = 0
        L69:
            ka<R> r1 = r4.f     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L79
            ka<R> r1 = r4.f     // Catch: java.lang.Throwable -> L8a
            r4.p()     // Catch: java.lang.Throwable -> L8a
            boolean r1 = r1.a()     // Catch: java.lang.Throwable -> L8a
            if (r1 == 0) goto L79
            goto L7a
        L79:
            r5 = 0
        L7a:
            r5 = r5 | r2
            if (r5 != 0) goto L80
            r4.m()     // Catch: java.lang.Throwable -> L8a
        L80:
            r4.D = r6     // Catch: java.lang.Throwable -> L8e
            r4.q()     // Catch: java.lang.Throwable -> L8e
            defpackage.li.e()     // Catch: java.lang.Throwable -> L8e
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            return
        L8a:
            r5 = move-exception
            r4.D = r6     // Catch: java.lang.Throwable -> L8e
            throw r5     // Catch: java.lang.Throwable -> L8e
        L8e:
            r5 = move-exception
            monitor-exit(r0)     // Catch: java.lang.Throwable -> L8e
            throw r5
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.kd.a(com.bumptech.glide.load.engine.GlideException, int):void");
    }

    @Override // defpackage.jy
    public final boolean a(jy jyVar) {
        int i;
        int i2;
        Object obj;
        Class<R> cls;
        jw<?> jwVar;
        bt btVar;
        int size;
        int i3;
        int i4;
        Object obj2;
        Class<R> cls2;
        jw<?> jwVar2;
        bt btVar2;
        int size2;
        if (!(jyVar instanceof kd)) {
            return false;
        }
        synchronized (this.e) {
            i = this.m;
            i2 = this.n;
            obj = this.j;
            cls = this.k;
            jwVar = this.l;
            btVar = this.o;
            size = this.q != null ? this.q.size() : 0;
        }
        kd kdVar = (kd) jyVar;
        synchronized (kdVar.e) {
            i3 = kdVar.m;
            i4 = kdVar.n;
            obj2 = kdVar.j;
            cls2 = kdVar.k;
            jwVar2 = kdVar.l;
            btVar2 = kdVar.o;
            size2 = kdVar.q != null ? kdVar.q.size() : 0;
        }
        return i == i3 && i2 == i4 && lg.b(obj, obj2) && cls.equals(cls2) && jwVar.equals(jwVar2) && btVar == btVar2 && size == size2;
    }

    private void a(String str) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" this: ");
        sb.append(this.c);
    }

    public final String toString() {
        Object obj;
        Class<R> cls;
        synchronized (this.e) {
            obj = this.j;
            cls = this.k;
        }
        return super.toString() + "[model=" + obj + ", transcodeClass=" + cls + "]";
    }
}
