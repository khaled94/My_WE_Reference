package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: aka  reason: default package */
/* loaded from: classes.dex */
public final class aka<E> extends ajw<E> {
    static final ajw<Object> a = new aka(new Object[0], 0);
    private final transient Object[] b;
    private final transient int c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aka(Object[] objArr, int i) {
        this.b = objArr;
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ajt
    public final int c() {
        return 0;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ajt
    public final Object[] b() {
        return this.b;
    }

    @Override // defpackage.ajt
    final int d() {
        return this.c;
    }

    @Override // defpackage.ajw, defpackage.ajt
    final int a(Object[] objArr, int i) {
        System.arraycopy(this.b, 0, objArr, i, this.c);
        return i + this.c;
    }

    @Override // java.util.List
    public final E get(int i) {
        ajj.a(i, this.c);
        return (E) this.b[i];
    }
}
