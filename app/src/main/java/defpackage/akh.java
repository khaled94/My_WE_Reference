package defpackage;

/* renamed from: akh  reason: default package */
/* loaded from: classes.dex */
final class akh extends ajw<Object> {
    private final transient Object[] a;
    private final transient int b;
    private final transient int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public akh(Object[] objArr, int i, int i2) {
        this.a = objArr;
        this.b = i;
        this.c = i2;
    }

    @Override // java.util.List
    public final Object get(int i) {
        ajj.a(i, this.c);
        return this.a[(i * 2) + this.b];
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }
}
