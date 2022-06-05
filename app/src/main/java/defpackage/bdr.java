package defpackage;

/* renamed from: bdr  reason: default package */
/* loaded from: classes2.dex */
final class bdr {
    private static final bdp a = c();
    private static final bdp b = new bdo();

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bdp a() {
        return a;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static bdp b() {
        return b;
    }

    private static bdp c() {
        try {
            return (bdp) Class.forName("com.google.protobuf.NewInstanceSchemaFull").getDeclaredConstructor(new Class[0]).newInstance(new Object[0]);
        } catch (Exception unused) {
            return null;
        }
    }
}
