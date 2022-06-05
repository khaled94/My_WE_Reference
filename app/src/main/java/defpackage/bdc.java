package defpackage;

/* renamed from: bdc  reason: default package */
/* loaded from: classes2.dex */
final class bdc {
    private static final bda a = c();
    private static final bda b = new bdd();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bda a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bda b() {
        return b;
    }

    private static bda c() {
        try {
            return (bda) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
