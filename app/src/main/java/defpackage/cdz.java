package defpackage;

/* renamed from: cdz  reason: default package */
/* loaded from: classes2.dex */
final class cdz {
    private static final cdx a = c();
    private static final cdx b = new cdy();

    cdz() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cdx a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cdx b() {
        return b;
    }

    private static cdx c() {
        try {
            return (cdx) Class.forName("com.google.crypto.tink.shaded.protobuf.MapFieldSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
