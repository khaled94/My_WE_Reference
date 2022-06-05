package defpackage;

/* renamed from: asr  reason: default package */
/* loaded from: classes.dex */
final class asr {
    private static final asp<?> a = new aso();
    private static final asp<?> b = c();

    private static asp<?> c() {
        try {
            return (asp) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static asp<?> a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static asp<?> b() {
        asp<?> aspVar = b;
        if (aspVar != null) {
            return aspVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
