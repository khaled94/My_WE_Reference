package defpackage;

/* renamed from: bcv  reason: default package */
/* loaded from: classes2.dex */
final class bcv implements bde {
    private bde[] a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bcv(bde... bdeVarArr) {
        this.a = bdeVarArr;
    }

    @Override // defpackage.bde
    public final boolean a(Class<?> cls) {
        for (bde bdeVar : this.a) {
            if (bdeVar.a(cls)) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.bde
    public final bdf b(Class<?> cls) {
        bde[] bdeVarArr;
        for (bde bdeVar : this.a) {
            if (bdeVar.a(cls)) {
                return bdeVar.b(cls);
            }
        }
        String valueOf = String.valueOf(cls.getName());
        throw new UnsupportedOperationException(valueOf.length() != 0 ? "No factory is available for message type: ".concat(valueOf) : new String("No factory is available for message type: "));
    }
}
