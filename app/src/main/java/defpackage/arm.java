package defpackage;

/* renamed from: arm  reason: default package */
/* loaded from: classes.dex */
public final class arm {
    private static final Class<?> a = a("libcore.io.Memory");
    private static final boolean b;

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

    static {
        b = a("org.robolectric.Robolectric") != null;
    }
}
