package defpackage;

/* renamed from: aud  reason: default package */
/* loaded from: classes.dex */
final class aud {
    private static final aub a = c();
    private static final aub b = new aue();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aub a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static aub b() {
        return b;
    }

    private static aub c() {
        try {
            return (aub) Class.forName("com.google.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
