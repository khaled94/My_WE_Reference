package defpackage;

/* renamed from: cda  reason: default package */
/* loaded from: classes2.dex */
final class cda {
    static final Class<?> a = b();

    cda() {
    }

    private static Class<?> b() {
        try {
            return Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionRegistry");
        } catch (ClassNotFoundException unused) {
            return null;
        }
    }

    public static cdb a() {
        cdb a2 = a("getEmptyRegistry");
        return a2 != null ? a2 : cdb.a;
    }

    private static final cdb a(String str) {
        Class<?> cls = a;
        if (cls == null) {
            return null;
        }
        try {
            return (cdb) cls.getDeclaredMethod(str, new Class[0]).invoke(null, new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
