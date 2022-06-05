package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bbp  reason: default package */
/* loaded from: classes2.dex */
public final class bbp {
    private static final Class<?> a = b();

    private static Class<?> b() {
        try {
            return Class.forName("com.google.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static bbo a() {
        Class<?> cls = a;
        if (cls != null) {
            try {
                return (bbo) cls.getDeclaredMethod("getEmptyRegistry", new Class[0]).invoke(null, new Object[0]);
            } catch (Exception unused) {
            }
        }
        return bbo.a;
    }
}
