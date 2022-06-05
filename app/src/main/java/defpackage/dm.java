package defpackage;

import defpackage.cu;
import defpackage.dp;
import defpackage.fw;
import java.io.File;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: dm  reason: default package */
/* loaded from: classes2.dex */
public final class dm implements cu.a<Object>, dp {
    private final List<ck> a;
    private final dq<?> b;
    private final dp.a c;
    private int d;
    private ck e;
    private List<fw<File, ?>> f;
    private int g;
    private volatile fw.a<?> h;
    private File i;

    /* JADX INFO: Access modifiers changed from: package-private */
    public dm(dq<?> dqVar, dp.a aVar) {
        this(dqVar.d(), dqVar, aVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public dm(List<ck> list, dq<?> dqVar, dp.a aVar) {
        this.d = -1;
        this.a = list;
        this.b = dqVar;
        this.c = aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:11:0x0019, code lost:
        if (c() == false) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
        r0 = r7.f;
        r3 = r7.g;
        r7.g = r3 + 1;
        r7.h = r0.get(r3).a(r7.i, r7.b.c, r7.b.d, r7.b.g);
     */
    /* JADX WARN: Code restructure failed: missing block: B:13:0x003f, code lost:
        if (r7.h == null) goto L37;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x004f, code lost:
        if (r7.b.a(r7.h.c.a()) == false) goto L38;
     */
    /* JADX WARN: Code restructure failed: missing block: B:16:0x0051, code lost:
        r7.h.c.a(r7.b.k, r7);
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x005c, code lost:
        r1 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x0061, code lost:
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:8:0x0010, code lost:
        r7.h = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:9:0x0013, code lost:
        if (r1 != false) goto L32;
     */
    @Override // defpackage.dp
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final boolean a() {
        /*
            r7 = this;
            defpackage.li.a()
        L3:
            java.util.List<fw<java.io.File, ?>> r0 = r7.f     // Catch: java.lang.Throwable -> La2
            r1 = 0
            r2 = 1
            if (r0 == 0) goto L62
            boolean r0 = r7.c()     // Catch: java.lang.Throwable -> La2
            if (r0 != 0) goto L10
            goto L62
        L10:
            r0 = 0
            r7.h = r0     // Catch: java.lang.Throwable -> La2
        L13:
            if (r1 != 0) goto L5e
            boolean r0 = r7.c()     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L5e
            java.util.List<fw<java.io.File, ?>> r0 = r7.f     // Catch: java.lang.Throwable -> La2
            int r3 = r7.g     // Catch: java.lang.Throwable -> La2
            int r4 = r3 + 1
            r7.g = r4     // Catch: java.lang.Throwable -> La2
            java.lang.Object r0 = r0.get(r3)     // Catch: java.lang.Throwable -> La2
            fw r0 = (defpackage.fw) r0     // Catch: java.lang.Throwable -> La2
            java.io.File r3 = r7.i     // Catch: java.lang.Throwable -> La2
            dq<?> r4 = r7.b     // Catch: java.lang.Throwable -> La2
            int r4 = r4.c     // Catch: java.lang.Throwable -> La2
            dq<?> r5 = r7.b     // Catch: java.lang.Throwable -> La2
            int r5 = r5.d     // Catch: java.lang.Throwable -> La2
            dq<?> r6 = r7.b     // Catch: java.lang.Throwable -> La2
            cm r6 = r6.g     // Catch: java.lang.Throwable -> La2
            fw$a r0 = r0.a(r3, r4, r5, r6)     // Catch: java.lang.Throwable -> La2
            r7.h = r0     // Catch: java.lang.Throwable -> La2
            fw$a<?> r0 = r7.h     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L13
            dq<?> r0 = r7.b     // Catch: java.lang.Throwable -> La2
            fw$a<?> r3 = r7.h     // Catch: java.lang.Throwable -> La2
            cu<Data> r3 = r3.c     // Catch: java.lang.Throwable -> La2
            java.lang.Class r3 = r3.a()     // Catch: java.lang.Throwable -> La2
            boolean r0 = r0.a(r3)     // Catch: java.lang.Throwable -> La2
            if (r0 == 0) goto L13
            fw$a<?> r0 = r7.h     // Catch: java.lang.Throwable -> La2
            cu<Data> r0 = r0.c     // Catch: java.lang.Throwable -> La2
            dq<?> r1 = r7.b     // Catch: java.lang.Throwable -> La2
            bt r1 = r1.k     // Catch: java.lang.Throwable -> La2
            r0.a(r1, r7)     // Catch: java.lang.Throwable -> La2
            r1 = 1
            goto L13
        L5e:
            defpackage.li.f()
            return r1
        L62:
            int r0 = r7.d     // Catch: java.lang.Throwable -> La2
            int r0 = r0 + r2
            r7.d = r0     // Catch: java.lang.Throwable -> La2
            java.util.List<ck> r2 = r7.a     // Catch: java.lang.Throwable -> La2
            int r2 = r2.size()     // Catch: java.lang.Throwable -> La2
            if (r0 < r2) goto L73
            defpackage.li.f()
            return r1
        L73:
            java.util.List<ck> r0 = r7.a     // Catch: java.lang.Throwable -> La2
            int r2 = r7.d     // Catch: java.lang.Throwable -> La2
            java.lang.Object r0 = r0.get(r2)     // Catch: java.lang.Throwable -> La2
            ck r0 = (defpackage.ck) r0     // Catch: java.lang.Throwable -> La2
            dn r2 = new dn     // Catch: java.lang.Throwable -> La2
            dq<?> r3 = r7.b     // Catch: java.lang.Throwable -> La2
            ck r3 = r3.j     // Catch: java.lang.Throwable -> La2
            r2.<init>(r0, r3)     // Catch: java.lang.Throwable -> La2
            dq<?> r3 = r7.b     // Catch: java.lang.Throwable -> La2
            ex r3 = r3.b()     // Catch: java.lang.Throwable -> La2
            java.io.File r2 = r3.a(r2)     // Catch: java.lang.Throwable -> La2
            r7.i = r2     // Catch: java.lang.Throwable -> La2
            if (r2 == 0) goto L3
            r7.e = r0     // Catch: java.lang.Throwable -> La2
            dq<?> r0 = r7.b     // Catch: java.lang.Throwable -> La2
            java.util.List r0 = r0.a(r2)     // Catch: java.lang.Throwable -> La2
            r7.f = r0     // Catch: java.lang.Throwable -> La2
            r7.g = r1     // Catch: java.lang.Throwable -> La2
            goto L3
        La2:
            r0 = move-exception
            defpackage.li.f()
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dm.a():boolean");
    }

    private boolean c() {
        return this.g < this.f.size();
    }

    @Override // defpackage.dp
    public final void b() {
        fw.a<?> aVar = this.h;
        if (aVar != null) {
            aVar.c.c();
        }
    }

    @Override // defpackage.cu.a
    public final void a(Object obj) {
        this.c.a(this.e, obj, this.h.c, cf.DATA_DISK_CACHE, this.e);
    }

    @Override // defpackage.cu.a
    public final void a(Exception exc) {
        this.c.a(this.e, exc, this.h.c, cf.DATA_DISK_CACHE);
    }
}
