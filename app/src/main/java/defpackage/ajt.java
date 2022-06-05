package defpackage;

import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.AbstractCollection;
import java.util.Arrays;
import java.util.Collection;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: ajt  reason: default package */
/* loaded from: classes.dex */
public abstract class ajt<E> extends AbstractCollection<E> implements Serializable {
    private static final Object[] a = new Object[0];

    /* renamed from: a */
    public abstract akj<E> iterator();

    /* JADX INFO: Access modifiers changed from: package-private */
    public Object[] b() {
        return null;
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public abstract boolean contains(@NullableDecl Object obj);

    @Override // java.util.AbstractCollection, java.util.Collection
    public final Object[] toArray() {
        return toArray(a);
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    public final <T> T[] toArray(T[] tArr) {
        ajj.a(tArr);
        int size = size();
        if (tArr.length < size) {
            Object[] b = b();
            if (b != null) {
                return (T[]) Arrays.copyOfRange(b, c(), d(), tArr.getClass());
            }
            tArr = (T[]) ((Object[]) Array.newInstance(tArr.getClass().getComponentType(), size));
        } else if (tArr.length > size) {
            tArr[size] = null;
        }
        a(tArr, 0);
        return tArr;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int c() {
        throw new UnsupportedOperationException();
    }

    int d() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean add(E e) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean addAll(Collection<? extends E> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean removeAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final boolean retainAll(Collection<?> collection) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractCollection, java.util.Collection
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    public ajw<E> e() {
        return isEmpty() ? ajw.f() : ajw.a(toArray());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public int a(Object[] objArr, int i) {
        akj akjVar = (akj) iterator();
        while (akjVar.hasNext()) {
            objArr[i] = akjVar.next();
            i++;
        }
        return i;
    }
}
