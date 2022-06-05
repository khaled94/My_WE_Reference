package defpackage;

import java.util.ArrayList;
import java.util.List;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: auw  reason: default package */
/* loaded from: classes.dex */
public final class auw<E> extends arn<E> {
    private static final auw<Object> b;
    private final List<E> c;

    public static <E> auw<E> d() {
        return (auw<E>) b;
    }

    auw() {
        this(new ArrayList(10));
    }

    private auw(List<E> list) {
        this.c = list;
    }

    @Override // defpackage.arn, java.util.AbstractList, java.util.List
    public final void add(int i, E e) {
        c();
        this.c.add(i, e);
        this.modCount++;
    }

    @Override // java.util.AbstractList, java.util.List
    public final E get(int i) {
        return this.c.get(i);
    }

    @Override // defpackage.arn, java.util.AbstractList, java.util.List
    public final E remove(int i) {
        c();
        E remove = this.c.remove(i);
        this.modCount++;
        return remove;
    }

    @Override // defpackage.arn, java.util.AbstractList, java.util.List
    public final E set(int i, E e) {
        c();
        E e2 = this.c.set(i, e);
        this.modCount++;
        return e2;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.c.size();
    }

    @Override // defpackage.ati
    public final /* synthetic */ ati a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.c);
        return new auw(arrayList);
    }

    static {
        auw<Object> auwVar = new auw<>(new ArrayList(0));
        b = auwVar;
        auwVar.a = false;
    }
}
