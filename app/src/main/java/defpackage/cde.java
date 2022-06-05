package defpackage;

/* renamed from: cde  reason: default package */
/* loaded from: classes2.dex */
final class cde {
    private static final cdc<?> a = new cdd();
    private static final cdc<?> b = c();

    cde() {
    }

    private static cdc<?> c() {
        try {
            return (cdc) Class.forName("com.google.crypto.tink.shaded.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cdc<?> a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cdc<?> b() {
        cdc<?> cdcVar = b;
        if (cdcVar != null) {
            return cdcVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
