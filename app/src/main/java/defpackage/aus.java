package defpackage;

/* renamed from: aus  reason: default package */
/* loaded from: classes.dex */
final class aus {
    private static final auq a = c();
    private static final auq b = new aup();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static auq a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static auq b() {
        return b;
    }

    private static auq c() {
        try {
            return (auq) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
