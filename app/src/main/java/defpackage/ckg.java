package defpackage;

/* renamed from: ckg  reason: default package */
/* loaded from: classes2.dex */
public final class ckg {
    public static alr a(chh chhVar, String str) {
        aat.a(chhVar);
        if (chq.class.isAssignableFrom(chhVar.getClass())) {
            return chq.a((chq) chhVar, str);
        }
        if (chk.class.isAssignableFrom(chhVar.getClass())) {
            return chk.a((chk) chhVar, str);
        }
        if (chv.class.isAssignableFrom(chhVar.getClass())) {
            return chv.a((chv) chhVar, str);
        }
        if (chp.class.isAssignableFrom(chhVar.getClass())) {
            return chp.a((chp) chhVar, str);
        }
        if (chu.class.isAssignableFrom(chhVar.getClass())) {
            return chu.a((chu) chhVar, str);
        }
        if (cll.class.isAssignableFrom(chhVar.getClass())) {
            return cll.a((cll) chhVar, str);
        }
        throw new IllegalArgumentException("Unsupported credential type.");
    }
}
