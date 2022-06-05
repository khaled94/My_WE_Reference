package defpackage;

import com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException;
import defpackage.cdg;
import defpackage.cdo;
import defpackage.cff;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: ceg  reason: default package */
/* loaded from: classes2.dex */
final class ceg<T> implements cet<T> {
    private final cec a;
    private final cez<?, ?> b;
    private final boolean c;
    private final cdc<?> d;

    private ceg(cez<?, ?> cezVar, cdc<?> cdcVar, cec cecVar) {
        this.b = cezVar;
        this.c = cdcVar.a(cecVar);
        this.d = cdcVar;
        this.a = cecVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> ceg<T> a(cez<?, ?> cezVar, cdc<?> cdcVar, cec cecVar) {
        return new ceg<>(cezVar, cdcVar, cecVar);
    }

    @Override // defpackage.cet
    public final T a() {
        return (T) this.a.r().f();
    }

    @Override // defpackage.cet
    public final boolean a(T t, T t2) {
        if (!this.b.b(t).equals(this.b.b(t2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        return this.d.a(t).equals(this.d.a(t2));
    }

    @Override // defpackage.cet
    public final int a(T t) {
        int hashCode = this.b.b(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a(t).hashCode() : hashCode;
    }

    @Override // defpackage.cet
    public final void b(T t, T t2) {
        cev.a(this.b, t, t2);
        if (this.c) {
            cev.a(this.d, t, t2);
        }
    }

    @Override // defpackage.cet
    public final void a(T t, cfg cfgVar) throws IOException {
        Iterator<Map.Entry<?, Object>> d = this.d.a(t).d();
        while (d.hasNext()) {
            Map.Entry<?, Object> next = d.next();
            cdg.a aVar = (cdg.a) next.getKey();
            if (aVar.c() != cff.b.MESSAGE || aVar.d() || aVar.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof cdo.a) {
                cfgVar.a(aVar.a(), (Object) ((cdo.a) next).a.getValue().c());
            } else {
                cfgVar.a(aVar.a(), next.getValue());
            }
        }
        cez<?, ?> cezVar = this.b;
        cezVar.b((cez<?, ?>) cezVar.b(t), cfgVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x00c6 A[EDGE_INSN: B:58:0x00c6->B:32:0x00c6 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.cet
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(T r11, byte[] r12, int r13, int r14, defpackage.ccq.a r15) throws java.io.IOException {
        /*
            r10 = this;
            r0 = r11
            cdk r0 = (defpackage.cdk) r0
            cfa r1 = r0.unknownFields
            cfa r2 = defpackage.cfa.a()
            if (r1 != r2) goto L11
            cfa r1 = defpackage.cfa.b()
            r0.unknownFields = r1
        L11:
            cdk$c r11 = (defpackage.cdk.c) r11
            cdg r11 = r11.a()
            r0 = 0
            r2 = r0
        L19:
            if (r13 >= r14) goto Ld2
            int r4 = defpackage.ccq.a(r12, r13, r15)
            int r13 = r15.a
            int r3 = defpackage.cff.a
            r5 = 2
            if (r13 == r3) goto L69
            int r3 = defpackage.cff.a(r13)
            if (r3 != r5) goto L64
            cdc<?> r2 = r10.d
            cdb r3 = r15.d
            cec r5 = r10.a
            int r6 = defpackage.cff.b(r13)
            java.lang.Object r2 = r2.a(r3, r5, r6)
            r8 = r2
            cdk$f r8 = (defpackage.cdk.f) r8
            if (r8 == 0) goto L59
            ceo r13 = defpackage.ceo.a()
            cec r2 = r8.a
            java.lang.Class r2 = r2.getClass()
            cet r13 = r13.a(r2)
            int r13 = defpackage.ccq.a(r13, r12, r4, r14, r15)
            cdk$e r2 = r8.b
            java.lang.Object r3 = r15.c
            r11.a(r2, r3)
            goto L62
        L59:
            r2 = r13
            r3 = r12
            r5 = r14
            r6 = r1
            r7 = r15
            int r13 = defpackage.ccq.a(r2, r3, r4, r5, r6, r7)
        L62:
            r2 = r8
            goto L19
        L64:
            int r13 = defpackage.ccq.a(r13, r12, r4, r14, r15)
            goto L19
        L69:
            r13 = 0
            r3 = r0
        L6b:
            if (r4 >= r14) goto Lc6
            int r4 = defpackage.ccq.a(r12, r4, r15)
            int r6 = r15.a
            int r7 = defpackage.cff.b(r6)
            int r8 = defpackage.cff.a(r6)
            if (r7 == r5) goto La8
            r9 = 3
            if (r7 == r9) goto L81
            goto Lbd
        L81:
            if (r2 == 0) goto L9d
            ceo r6 = defpackage.ceo.a()
            cec r7 = r2.a
            java.lang.Class r7 = r7.getClass()
            cet r6 = r6.a(r7)
            int r4 = defpackage.ccq.a(r6, r12, r4, r14, r15)
            cdk$e r6 = r2.b
            java.lang.Object r7 = r15.c
            r11.a(r6, r7)
            goto L6b
        L9d:
            if (r8 != r5) goto Lbd
            int r4 = defpackage.ccq.e(r12, r4, r15)
            java.lang.Object r3 = r15.c
            ccu r3 = (defpackage.ccu) r3
            goto L6b
        La8:
            if (r8 != 0) goto Lbd
            int r4 = defpackage.ccq.a(r12, r4, r15)
            int r13 = r15.a
            cdc<?> r2 = r10.d
            cdb r6 = r15.d
            cec r7 = r10.a
            java.lang.Object r2 = r2.a(r6, r7, r13)
            cdk$f r2 = (defpackage.cdk.f) r2
            goto L6b
        Lbd:
            int r7 = defpackage.cff.b
            if (r6 == r7) goto Lc6
            int r4 = defpackage.ccq.a(r6, r12, r4, r14, r15)
            goto L6b
        Lc6:
            if (r3 == 0) goto Lcf
            int r13 = defpackage.cff.a(r13, r5)
            r1.a(r13, r3)
        Lcf:
            r13 = r4
            goto L19
        Ld2:
            if (r13 != r14) goto Ld5
            return
        Ld5:
            com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException r11 = com.google.crypto.tink.shaded.protobuf.InvalidProtocolBufferException.h()
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ceg.a(java.lang.Object, byte[], int, int, ccq$a):void");
    }

    @Override // defpackage.cet
    public final void a(T t, ces cesVar, cdb cdbVar) throws IOException {
        boolean z;
        cez<?, ?> cezVar = this.b;
        cdc<?> cdcVar = this.d;
        Object c = cezVar.c(t);
        cdg<?> b = cdcVar.b(t);
        do {
            try {
                if (cesVar.a() == Integer.MAX_VALUE) {
                    return;
                }
                int b2 = cesVar.b();
                if (b2 != cff.a) {
                    if (cff.a(b2) == 2) {
                        Object a = cdcVar.a(cdbVar, this.a, cff.b(b2));
                        if (a != null) {
                            cdcVar.a(cesVar, a, cdbVar, b);
                        } else {
                            z = cezVar.a((cez<?, ?>) c, cesVar);
                            continue;
                        }
                    } else {
                        z = cesVar.c();
                        continue;
                    }
                } else {
                    int i = 0;
                    Object obj = null;
                    ccu ccuVar = null;
                    while (cesVar.a() != Integer.MAX_VALUE) {
                        int b3 = cesVar.b();
                        if (b3 == cff.c) {
                            i = cesVar.o();
                            obj = cdcVar.a(cdbVar, this.a, i);
                        } else if (b3 == cff.d) {
                            if (obj != null) {
                                cdcVar.a(cesVar, obj, cdbVar, b);
                            } else {
                                ccuVar = cesVar.n();
                            }
                        } else if (!cesVar.c()) {
                            break;
                        }
                    }
                    if (cesVar.b() != cff.b) {
                        throw InvalidProtocolBufferException.e();
                    } else if (ccuVar != null) {
                        if (obj != null) {
                            cdcVar.a(ccuVar, obj, cdbVar, b);
                        } else {
                            cezVar.a((cez<?, ?>) c, i, ccuVar);
                        }
                    }
                }
                z = true;
                continue;
            } finally {
                cezVar.b((Object) t, (T) c);
            }
        } while (z);
    }

    @Override // defpackage.cet
    public final void d(T t) {
        this.b.d(t);
        this.d.c(t);
    }

    @Override // defpackage.cet
    public final boolean e(T t) {
        return this.d.a(t).e();
    }

    @Override // defpackage.cet
    public final int b(T t) {
        cez<?, ?> cezVar = this.b;
        int e = cezVar.e(cezVar.b(t)) + 0;
        if (this.c) {
            cdg<?> a = this.d.a(t);
            int i = 0;
            for (int i2 = 0; i2 < a.a.b(); i2++) {
                i += cdg.b(a.a.b(i2));
            }
            for (Map.Entry<?, Object> entry : a.a.c()) {
                i += cdg.b(entry);
            }
            return e + i;
        }
        return e;
    }
}
