package defpackage;

/* renamed from: atw  reason: default package */
/* loaded from: classes.dex */
final class atw implements auf {
    private auf[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public atw(auf... aufVarArr) {
        this.a = aufVarArr;
    }

    @Override // defpackage.auf
    public final boolean a(Class<?> cls) {
        for (auf aufVar : this.a) {
            if (aufVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.auf
    public final aug b(Class<?> cls) {
        auf[] aufVarArr;
        for (auf aufVar : this.a) {
            if (aufVar.a(cls)) {
                return aufVar.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
