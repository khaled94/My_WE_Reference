package defpackage;

/* renamed from: ccp  reason: default package */
/* loaded from: classes2.dex */
public final class ccp {
    private static final Class<?> a = a("libcore.io.Memory");
    private static final boolean b;

    ccp() {
    }

    static {
        b = a("org.robolectric.Robolectric") != null;
    }

    public static boolean a() {
        return a != null && !b;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Class<?> b() {
        return a;
    }

    private static <T> Class<T> a(String str) {
        try {
            return (Class<T>) Class.forName(str);
        } catch (Throwable unused) {
            return null;
        }
    }
}
