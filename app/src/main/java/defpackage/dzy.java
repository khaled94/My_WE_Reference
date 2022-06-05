package defpackage;

/* renamed from: dzy  reason: default package */
/* loaded from: classes2.dex */
public final class dzy {
    dzy() {
    }

    public static <T> T a(T t, Object obj) {
        if (t != null) {
            return t;
        }
        throw new NullPointerException(String.valueOf(obj));
    }
}
