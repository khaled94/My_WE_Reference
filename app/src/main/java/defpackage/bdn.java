package defpackage;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: bdn  reason: default package */
/* loaded from: classes2.dex */
final class bdn<T> implements bdy<T> {
    private final bdh a;
    private final beo<?, ?> b;
    private final boolean c;
    private final bbq<?> d;

    private bdn(beo<?, ?> beoVar, bbq<?> bbqVar, bdh bdhVar) {
        this.b = beoVar;
        this.c = bbqVar.a(bdhVar);
        this.d = bbqVar;
        this.a = bdhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> bdn<T> a(beo<?, ?> beoVar, bbq<?> bbqVar, bdh bdhVar) {
        return new bdn<>(beoVar, bbqVar, bdhVar);
    }

    @Override // defpackage.bdy
    public final T a() {
        return (T) this.a.f().c();
    }

    @Override // defpackage.bdy
    public final boolean a(T t, T t2) {
        if (!this.b.a(t).equals(this.b.a(t2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        return this.d.a(t).equals(this.d.a(t2));
    }

    @Override // defpackage.bdy
    public final int a(T t) {
        int hashCode = this.b.a(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a(t).hashCode() : hashCode;
    }

    @Override // defpackage.bdy
    public final void b(T t, T t2) {
        bea.a(this.b, t, t2);
        if (this.c) {
            bea.a(this.d, t, t2);
        }
    }

    @Override // defpackage.bdy
    public final void a(T t, bfi bfiVar) throws IOException {
        Iterator<Map.Entry<?, Object>> c = this.d.a(t).c();
        while (c.hasNext()) {
            Map.Entry<?, Object> next = c.next();
            bbw bbwVar = (bbw) next.getKey();
            if (bbwVar.c() != bfj.MESSAGE || bbwVar.d() || bbwVar.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof bcl) {
                bfiVar.a(bbwVar.a(), (Object) ((bcl) next).a.getValue().c());
            } else {
                bfiVar.a(bbwVar.a(), next.getValue());
            }
        }
        beo<?, ?> beoVar = this.b;
        beoVar.b((beo<?, ?>) beoVar.a(t), bfiVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EDGE_INSN: B:58:0x0099->B:33:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.bdy
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(T r10, byte[] r11, int r12, int r13, defpackage.bfw r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            bcc r0 = (defpackage.bcc) r0
            ben r1 = r0.zzih
            ben r2 = defpackage.ben.a()
            if (r1 != r2) goto L11
            ben r1 = defpackage.ben.b()
            r0.zzih = r1
        L11:
            bcc$b r10 = (defpackage.bcc.b) r10
            r10.h()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = defpackage.bfx.a(r11, r12, r14)
            int r2 = r14.a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            bbq<?> r12 = r9.d
            bbo r0 = r14.d
            bdh r3 = r9.a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.a(r0, r3, r5)
            r0 = r12
            bcc$e r0 = (defpackage.bcc.e) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = defpackage.bfx.a(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            defpackage.bds.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = defpackage.bfx.a(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = defpackage.bfx.a(r11, r4, r14)
            int r5 = r14.a
            int r6 = r5 >>> 3
            r7 = r5 & 7
            if (r6 == r3) goto L7b
            r8 = 3
            if (r6 == r8) goto L65
            goto L90
        L65:
            if (r0 != 0) goto L72
            if (r7 != r3) goto L90
            int r4 = defpackage.bfx.e(r11, r4, r14)
            java.lang.Object r2 = r14.c
            bgb r2 = (defpackage.bgb) r2
            goto L53
        L72:
            defpackage.bds.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = defpackage.bfx.a(r11, r4, r14)
            int r12 = r14.a
            bbq<?> r0 = r9.d
            bbo r5 = r14.d
            bdh r6 = r9.a
            java.lang.Object r0 = r0.a(r5, r6, r12)
            bcc$e r0 = (defpackage.bcc.e) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = defpackage.bfx.a(r5, r11, r4, r13, r14)
            goto L53
        L99:
            if (r2 == 0) goto La1
            int r12 = r12 << 3
            r12 = r12 | r3
            r1.a(r12, r2)
        La1:
            r12 = r4
            goto L18
        La4:
            if (r12 != r13) goto La7
            return
        La7:
            com.google.android.gms.internal.places.zzbk r10 = com.google.android.gms.internal.places.zzbk.e()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.bdn.a(java.lang.Object, byte[], int, int, bfw):void");
    }

    @Override // defpackage.bdy
    public final void c(T t) {
        this.b.b(t);
        this.d.c(t);
    }

    @Override // defpackage.bdy
    public final boolean d(T t) {
        return this.d.a(t).d();
    }

    @Override // defpackage.bdy
    public final int b(T t) {
        beo<?, ?> beoVar = this.b;
        int c = beoVar.c(beoVar.a(t)) + 0;
        if (this.c) {
            bbu<?> a = this.d.a(t);
            int i = 0;
            for (int i2 = 0; i2 < a.a.b(); i2++) {
                i += bbu.b(a.a.b(i2));
            }
            for (Map.Entry<?, Object> entry : a.a.c()) {
                i += bbu.b(entry);
            }
            return c + i;
        }
        return c;
    }
}
