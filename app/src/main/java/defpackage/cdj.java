package defpackage;

/* renamed from: cdj  reason: default package */
/* loaded from: classes2.dex */
final class cdj implements ceb {
    private static final cdj a = new cdj();

    private cdj() {
    }

    public static cdj a() {
        return a;
    }

    @Override // defpackage.ceb
    public final boolean a(Class<?> cls) {
        return cdk.class.isAssignableFrom(cls);
    }

    @Override // defpackage.ceb
    public final cea b(Class<?> cls) {
        if (!cdk.class.isAssignableFrom(cls)) {
            throw new IllegalArgumentException("Unsupported message type: " + cls.getName());
        }
        try {
            return (cea) cdk.a((Class<cdk>) cls.asSubclass(cdk.class)).p();
        } catch (Exception e) {
            throw new RuntimeException("Unable to get message info for " + cls.getName(), e);
        }
    }
}
