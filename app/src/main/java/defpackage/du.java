package defpackage;

import android.util.Log;
import androidx.core.util.Pools;
import defpackage.dr;
import defpackage.dz;
import defpackage.ex;
import defpackage.fe;
import defpackage.lh;

/* renamed from: du  reason: default package */
/* loaded from: classes2.dex */
public final class du implements dw, dz.a, fe.a {
    private static final boolean a = Log.isLoggable("Engine", 2);
    private final eb b;
    private final dy c;
    private final fe d;
    private final b e;
    private final eh f;
    private final c g;
    private final a h;
    private final dk i;

    public du(fe feVar, ex.a aVar, fh fhVar, fh fhVar2, fh fhVar3, fh fhVar4, boolean z) {
        this(feVar, aVar, fhVar, fhVar2, fhVar3, fhVar4, z, (byte) 0);
    }

    private du(fe feVar, ex.a aVar, fh fhVar, fh fhVar2, fh fhVar3, fh fhVar4, boolean z, byte b2) {
        this.d = feVar;
        this.g = new c(aVar);
        dk dkVar = new dk(z);
        this.i = dkVar;
        synchronized (this) {
            synchronized (dkVar) {
                dkVar.c = this;
            }
        }
        this.c = new dy();
        this.b = new eb();
        this.e = new b(fhVar, fhVar2, fhVar3, fhVar4, this, this);
        this.h = new a(this.g);
        this.f = new eh();
        feVar.a(this);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d3 A[Catch: all -> 0x00c3, TryCatch #0 {all -> 0x00c3, blocks: (B:9:0x0040, B:11:0x0048, B:13:0x004d, B:15:0x0051, B:18:0x0066, B:21:0x007b, B:23:0x007f, B:24:0x008c, B:26:0x00aa, B:29:0x00b9, B:31:0x00bd, B:37:0x00d3, B:39:0x00e3, B:41:0x00ee, B:42:0x00f3, B:43:0x00fa, B:45:0x019d, B:46:0x01a4, B:47:0x01aa, B:50:0x01ae), top: B:55:0x0040 }] */
    /* JADX WARN: Removed duplicated region for block: B:49:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final <R> defpackage.du.d a(defpackage.bq r20, java.lang.Object r21, defpackage.ck r22, int r23, int r24, java.lang.Class<?> r25, java.lang.Class<R> r26, defpackage.bt r27, defpackage.dt r28, java.util.Map<java.lang.Class<?>, defpackage.cq<?>> r29, boolean r30, boolean r31, defpackage.cm r32, boolean r33, boolean r34, boolean r35, boolean r36, defpackage.kc r37, java.util.concurrent.Executor r38) {
        /*
            Method dump skipped, instructions count: 440
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.du.a(bq, java.lang.Object, ck, int, int, java.lang.Class, java.lang.Class, bt, dt, java.util.Map, boolean, boolean, cm, boolean, boolean, boolean, boolean, kc, java.util.concurrent.Executor):du$d");
    }

    private static void a(String str, long j, ck ckVar) {
        StringBuilder sb = new StringBuilder();
        sb.append(str);
        sb.append(" in ");
        sb.append(lb.a(j));
        sb.append("ms, key: ");
        sb.append(ckVar);
    }

    public static void a(ee<?> eeVar) {
        if (eeVar instanceof dz) {
            ((dz) eeVar).f();
            return;
        }
        throw new IllegalArgumentException("Cannot release anything but an EngineResource");
    }

    @Override // defpackage.dw
    public final synchronized void a(dv<?> dvVar, ck ckVar) {
        this.b.a(ckVar, dvVar);
    }

    @Override // defpackage.fe.a
    public final void b(ee<?> eeVar) {
        this.f.a(eeVar, true);
    }

    @Override // defpackage.dz.a
    public final void a(ck ckVar, dz<?> dzVar) {
        this.i.a(ckVar);
        if (dzVar.a) {
            this.d.a(ckVar, dzVar);
        } else {
            this.f.a(dzVar, false);
        }
    }

    /* renamed from: du$d */
    /* loaded from: classes2.dex */
    public class d {
        public final dv<?> a;
        public final kc b;

        d(kc kcVar, dv<?> dvVar) {
            this.b = kcVar;
            this.a = dvVar;
        }
    }

    /* renamed from: du$c */
    /* loaded from: classes2.dex */
    static class c implements dr.d {
        private final ex.a a;
        private volatile ex b;

        c(ex.a aVar) {
            this.a = aVar;
        }

        @Override // defpackage.dr.d
        public final ex a() {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = this.a.a();
                    }
                    if (this.b == null) {
                        this.b = new ey();
                    }
                }
            }
            return this.b;
        }
    }

    /* renamed from: du$a */
    /* loaded from: classes2.dex */
    static class a {
        final dr.d a;
        final Pools.Pool<dr<?>> b = lh.a(150, new lh.a<dr<?>>() { // from class: du.a.1
            @Override // defpackage.lh.a
            public final /* synthetic */ dr<?> a() {
                return new dr<>(a.this.a, a.this.b);
            }
        });
        int c;

        a(dr.d dVar) {
            this.a = dVar;
        }
    }

    /* renamed from: du$b */
    /* loaded from: classes2.dex */
    static class b {
        final fh a;
        final fh b;
        final fh c;
        final fh d;
        final dw e;
        final dz.a f;
        final Pools.Pool<dv<?>> g = lh.a(150, new lh.a<dv<?>>() { // from class: du.b.1
            @Override // defpackage.lh.a
            public final /* synthetic */ dv<?> a() {
                return new dv<>(b.this.a, b.this.b, b.this.c, b.this.d, b.this.e, b.this.f, b.this.g);
            }
        });

        b(fh fhVar, fh fhVar2, fh fhVar3, fh fhVar4, dw dwVar, dz.a aVar) {
            this.a = fhVar;
            this.b = fhVar2;
            this.c = fhVar3;
            this.d = fhVar4;
            this.e = dwVar;
            this.f = aVar;
        }
    }

    @Override // defpackage.dw
    public final synchronized void a(dv<?> dvVar, ck ckVar, dz<?> dzVar) {
        if (dzVar != null) {
            if (dzVar.a) {
                this.i.a(ckVar, dzVar);
            }
        }
        this.b.a(ckVar, dvVar);
    }
}
