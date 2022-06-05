package defpackage;

import defpackage.ear;
import defpackage.ebc;

/* renamed from: ebm  reason: default package */
/* loaded from: classes2.dex */
public final class ebm implements eat {
    final ebq a;

    public ebm(ebq ebqVar) {
        this.a = ebqVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:109:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:114:0x0215 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0223 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:122:0x0251  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0150  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0155  */
    /* JADX WARN: Removed duplicated region for block: B:79:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b0  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x01b4  */
    /* JADX WARN: Type inference failed for: r3v1, types: [eba, ebc] */
    /* JADX WARN: Type inference failed for: r3v28 */
    /* JADX WARN: Type inference failed for: r3v35 */
    /* JADX WARN: Type inference failed for: r3v36 */
    /* JADX WARN: Type inference failed for: r3v38 */
    /* JADX WARN: Type inference failed for: r3v42 */
    @Override // defpackage.eat
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ebc a(defpackage.eat.a r19) throws java.io.IOException {
        /*
            Method dump skipped, instructions count: 841
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ebm.a(eat$a):ebc");
    }

    private static ear a(ear earVar, ear earVar2) {
        ear.a aVar = new ear.a();
        int length = earVar.a.length / 2;
        for (int i = 0; i < length; i++) {
            String a = earVar.a(i);
            String b = earVar.b(i);
            if ((!"Warning".equalsIgnoreCase(a) || !b.startsWith("1")) && (b(a) || !a(a) || earVar2.a(a) == null)) {
                ebg.a.a(aVar, a, b);
            }
        }
        int length2 = earVar2.a.length / 2;
        for (int i2 = 0; i2 < length2; i2++) {
            String a2 = earVar2.a(i2);
            if (!b(a2) && a(a2)) {
                ebg.a.a(aVar, a2, earVar2.b(i2));
            }
        }
        return aVar.a();
    }

    private static boolean a(String str) {
        return !"Connection".equalsIgnoreCase(str) && !"Keep-Alive".equalsIgnoreCase(str) && !"Proxy-Authenticate".equalsIgnoreCase(str) && !"Proxy-Authorization".equalsIgnoreCase(str) && !"TE".equalsIgnoreCase(str) && !"Trailers".equalsIgnoreCase(str) && !"Transfer-Encoding".equalsIgnoreCase(str) && !"Upgrade".equalsIgnoreCase(str);
    }

    private static boolean b(String str) {
        return "Content-Length".equalsIgnoreCase(str) || "Content-Encoding".equalsIgnoreCase(str) || "Content-Type".equalsIgnoreCase(str);
    }

    private static ebc a(ebc ebcVar) {
        if (ebcVar == null || ebcVar.g == null) {
            return ebcVar;
        }
        ebc.a i = ebcVar.i();
        i.g = null;
        return i.a();
    }
}
