package defpackage;

/* renamed from: cej  reason: default package */
/* loaded from: classes2.dex */
final class cej {
    private static final ceh a = c();
    private static final ceh b = new cei();

    cej() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ceh a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static ceh b() {
        return b;
    }

    private static ceh c() {
        try {
            return (ceh) Class.forName("com.google.crypto.tink.shaded.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
