package defpackage;

/* renamed from: ajv  reason: default package */
/* loaded from: classes.dex */
final class ajv<E> extends ajs<E> {
    private final ajw<E> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public ajv(ajw<E> ajwVar, int i) {
        super(ajwVar.size(), i);
        this.a = ajwVar;
    }

    @Override // defpackage.ajs
    protected final E a(int i) {
        return this.a.get(i);
    }
}
