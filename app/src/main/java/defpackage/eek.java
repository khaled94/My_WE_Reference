package defpackage;

/* renamed from: eek  reason: default package */
/* loaded from: classes2.dex */
final class eek {
    static eej a;
    static long b;

    private eek() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static eej a() {
        synchronized (eek.class) {
            if (a != null) {
                eej eejVar = a;
                a = eejVar.f;
                eejVar.f = null;
                b -= 8192;
                return eejVar;
            }
            return new eej();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static void a(eej eejVar) {
        if (eejVar.f != null || eejVar.g != null) {
            throw new IllegalArgumentException();
        }
        if (eejVar.d) {
            return;
        }
        synchronized (eek.class) {
            if (b + 8192 > 65536) {
                return;
            }
            b += 8192;
            eejVar.f = a;
            eejVar.c = 0;
            eejVar.b = 0;
            a = eejVar;
        }
    }
}
