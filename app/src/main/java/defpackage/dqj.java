package defpackage;

import java.util.Map;

/* renamed from: dqj  reason: default package */
/* loaded from: classes2.dex */
public class dqj {
    private static <T extends Throwable> T a(T t) {
        return (T) dqc.a((Throwable) t, dqj.class.getName());
    }

    private static void a(Object obj, String str) {
        String name = obj == null ? "null" : obj.getClass().getName();
        throw ((ClassCastException) a(new ClassCastException(name + " cannot be cast to " + str)));
    }

    public static Map a(Object obj) {
        if ((obj instanceof dqk) && !(obj instanceof dqm)) {
            a(obj, "kotlin.collections.MutableMap");
        }
        return b(obj);
    }

    private static Map b(Object obj) {
        try {
            return (Map) obj;
        } catch (ClassCastException e) {
            throw ((ClassCastException) a(e));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:78:0x00b9, code lost:
        if (r0 == r4) goto L80;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static java.lang.Object a(java.lang.Object r3, int r4) {
        /*
            Method dump skipped, instructions count: 205
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dqj.a(java.lang.Object, int):java.lang.Object");
    }
}
