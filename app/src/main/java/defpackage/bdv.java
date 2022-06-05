package defpackage;

import java.util.ArrayList;
import java.util.List;

/* renamed from: bdv  reason: default package */
/* loaded from: classes2.dex */
final class bdv<E> extends bfv<E> {
    private static final bdv<Object> b;
    private final List<E> c;

    public static <E> bdv<E> a() {
        return (bdv<E>) b;
    }

    bdv() {
        this(new ArrayList(10));
    }

    private bdv(List<E> list) {
        this.c = list;
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        d();
        this.c.add(i, e);
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        return this.c.get(i);
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        d();
        E remove = this.c.remove(i);
        this.modCount++;
        return remove;
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        d();
        E e2 = this.c.set(i, e);
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.bch
    public final /* synthetic */ bch a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.c);
        return new bdv(arrayList);
    }

    static {
        bdv<Object> bdvVar = new bdv<>(new ArrayList(0));
        b = bdvVar;
        bdvVar.a = false;
    }
}
