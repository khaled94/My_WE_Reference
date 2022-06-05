package defpackage;

/* renamed from: bbr  reason: default package */
/* loaded from: classes2.dex */
final class bbr {
    private static final bbq<?> a = new bbs();
    private static final bbq<?> b = c();

    private static bbq<?> c() {
        try {
            return (bbq) Class.forName("com.google.protobuf.ExtensionSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bbq<?> a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bbq<?> b() {
        bbq<?> bbqVar = b;
        if (bbqVar != null) {
            return bbqVar;
        }
        throw new IllegalStateException("Protobuf runtime is not correctly loaded.");
    }
}
