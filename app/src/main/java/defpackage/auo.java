package defpackage;

import com.google.android.gms.internal.measurement.zzfi;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

/* renamed from: auo  reason: default package */
/* loaded from: classes.dex */
final class auo<T> implements aux<T> {
    private final aui a;
    private final avp<?, ?> b;
    private final boolean c;
    private final asp<?> d;

    private auo(avp<?, ?> avpVar, asp<?> aspVar, aui auiVar) {
        this.b = avpVar;
        this.c = aspVar.a(auiVar);
        this.d = aspVar;
        this.a = auiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <T> auo<T> a(avp<?, ?> avpVar, asp<?> aspVar, aui auiVar) {
        return new auo<>(avpVar, aspVar, auiVar);
    }

    @Override // defpackage.aux
    public final T a() {
        return (T) this.a.q().u();
    }

    @Override // defpackage.aux
    public final boolean a(T t, T t2) {
        if (!this.b.b(t).equals(this.b.b(t2))) {
            return false;
        }
        if (!this.c) {
            return true;
        }
        return this.d.a(t).equals(this.d.a(t2));
    }

    @Override // defpackage.aux
    public final int a(T t) {
        int hashCode = this.b.b(t).hashCode();
        return this.c ? (hashCode * 53) + this.d.a(t).hashCode() : hashCode;
    }

    @Override // defpackage.aux
    public final void b(T t, T t2) {
        auz.a(this.b, t, t2);
        if (this.c) {
            auz.a(this.d, t, t2);
        }
    }

    @Override // defpackage.aux
    public final void a(T t, awm awmVar) throws IOException {
        Iterator<Map.Entry<?, Object>> c = this.d.a(t).c();
        while (c.hasNext()) {
            Map.Entry<?, Object> next = c.next();
            ass assVar = (ass) next.getKey();
            if (assVar.c() != awj.MESSAGE || assVar.d() || assVar.e()) {
                throw new IllegalStateException("Found invalid MessageSet item.");
            }
            if (next instanceof atm) {
                awmVar.a(assVar.a(), (Object) ((atm) next).a.getValue().c());
            } else {
                awmVar.a(assVar.a(), next.getValue());
            }
        }
        avp<?, ?> avpVar = this.b;
        avpVar.b((avp<?, ?>) avpVar.b(t), awmVar);
    }

    /* JADX WARN: Removed duplicated region for block: B:32:0x0094  */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0099 A[EDGE_INSN: B:58:0x0099->B:33:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.aux
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(T r10, byte[] r11, int r12, int r13, defpackage.aro r14) throws java.io.IOException {
        /*
            r9 = this;
            r0 = r10
            ata r0 = (defpackage.ata) r0
            avr r1 = r0.zzahz
            avr r2 = defpackage.avr.a()
            if (r1 != r2) goto L11
            avr r1 = defpackage.avr.b()
            r0.zzahz = r1
        L11:
            ata$b r10 = (defpackage.ata.b) r10
            r10.a()
            r10 = 0
            r0 = r10
        L18:
            if (r12 >= r13) goto La4
            int r4 = defpackage.arp.a(r11, r12, r14)
            int r2 = r14.a
            r12 = 11
            r3 = 2
            if (r2 == r12) goto L51
            r12 = r2 & 7
            if (r12 != r3) goto L4c
            asp<?> r12 = r9.d
            asn r0 = r14.d
            aui r3 = r9.a
            int r5 = r2 >>> 3
            java.lang.Object r12 = r12.a(r0, r3, r5)
            r0 = r12
            ata$e r0 = (defpackage.ata.e) r0
            if (r0 != 0) goto L43
            r3 = r11
            r5 = r13
            r6 = r1
            r7 = r14
            int r12 = defpackage.arp.a(r2, r3, r4, r5, r6, r7)
            goto L18
        L43:
            defpackage.aut.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L4c:
            int r12 = defpackage.arp.a(r2, r11, r4, r13, r14)
            goto L18
        L51:
            r12 = 0
            r2 = r10
        L53:
            if (r4 >= r13) goto L99
            int r4 = defpackage.arp.a(r11, r4, r14)
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
            int r4 = defpackage.arp.e(r11, r4, r14)
            java.lang.Object r2 = r14.c
            art r2 = (defpackage.art) r2
            goto L53
        L72:
            defpackage.aut.a()
            java.lang.NoSuchMethodError r10 = new java.lang.NoSuchMethodError
            r10.<init>()
            throw r10
        L7b:
            if (r7 != 0) goto L90
            int r4 = defpackage.arp.a(r11, r4, r14)
            int r12 = r14.a
            asp<?> r0 = r9.d
            asn r5 = r14.d
            aui r6 = r9.a
            java.lang.Object r0 = r0.a(r5, r6, r12)
            ata$e r0 = (defpackage.ata.e) r0
            goto L53
        L90:
            r6 = 12
            if (r5 == r6) goto L99
            int r4 = defpackage.arp.a(r5, r11, r4, r13, r14)
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
            com.google.android.gms.internal.measurement.zzfi r10 = com.google.android.gms.internal.measurement.zzfi.h()
            throw r10
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.auo.a(java.lang.Object, byte[], int, int, aro):void");
    }

    @Override // defpackage.aux
    public final void a(T t, auy auyVar, asn asnVar) throws IOException {
        boolean z;
        avp<?, ?> avpVar = this.b;
        asp<?> aspVar = this.d;
        Object c = avpVar.c(t);
        aspVar.b(t);
        do {
            try {
                if (auyVar.a() == Integer.MAX_VALUE) {
                    return;
                }
                int b = auyVar.b();
                if (b == 11) {
                    int i = 0;
                    Object obj = null;
                    art artVar = null;
                    while (auyVar.a() != Integer.MAX_VALUE) {
                        int b2 = auyVar.b();
                        if (b2 == 16) {
                            i = auyVar.o();
                            obj = aspVar.a(asnVar, this.a, i);
                        } else if (b2 == 26) {
                            if (obj != null) {
                                aspVar.b();
                            } else {
                                artVar = auyVar.n();
                            }
                        } else if (!auyVar.c()) {
                            break;
                        }
                    }
                    if (auyVar.b() != 12) {
                        throw zzfi.e();
                    } else if (artVar != null) {
                        if (obj != null) {
                            aspVar.c();
                        } else {
                            avpVar.a((avp<?, ?>) c, i, artVar);
                        }
                    }
                } else if ((b & 7) == 2) {
                    if (aspVar.a(asnVar, this.a, b >>> 3) != null) {
                        aspVar.b();
                    } else {
                        z = avpVar.a((avp<?, ?>) c, auyVar);
                        continue;
                    }
                } else {
                    z = auyVar.c();
                    continue;
                }
                z = true;
                continue;
            } finally {
                avpVar.b((Object) t, (T) c);
            }
        } while (z);
    }

    @Override // defpackage.aux
    public final void c(T t) {
        this.b.d(t);
        this.d.c(t);
    }

    @Override // defpackage.aux
    public final boolean d(T t) {
        return this.d.a(t).d();
    }

    @Override // defpackage.aux
    public final int b(T t) {
        avp<?, ?> avpVar = this.b;
        int e = avpVar.e(avpVar.b(t)) + 0;
        if (this.c) {
            asq<?> a = this.d.a(t);
            int i = 0;
            for (int i2 = 0; i2 < a.a.b(); i2++) {
                i += asq.b(a.a.b(i2));
            }
            for (Map.Entry<?, Object> entry : a.a.c()) {
                i += asq.b(entry);
            }
            return e + i;
        }
        return e;
    }
}
