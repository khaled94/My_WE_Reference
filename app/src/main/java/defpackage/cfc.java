package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: cfc  reason: default package */
/* loaded from: classes2.dex */
public final class cfc extends AbstractList<String> implements cdr, RandomAccess {
    private final cdr a;

    @Override // defpackage.cdr
    public final cdr e() {
        return this;
    }

    public cfc(cdr cdrVar) {
        this.a = cdrVar;
    }

    @Override // defpackage.cdr
    public final Object b(int i) {
        return this.a.b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.cdr
    public final void a(ccu ccuVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(final int i) {
        return new ListIterator<String>() { // from class: cfc.1
            ListIterator<String> a;

            {
                this.a = cfc.this.a.listIterator(i);
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final boolean hasNext() {
                return this.a.hasNext();
            }

            @Override // java.util.ListIterator
            public final boolean hasPrevious() {
                return this.a.hasPrevious();
            }

            @Override // java.util.ListIterator
            public final int nextIndex() {
                return this.a.nextIndex();
            }

            @Override // java.util.ListIterator
            public final int previousIndex() {
                return this.a.previousIndex();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public final /* synthetic */ void add(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public final /* synthetic */ void set(String str) {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.ListIterator
            public final /* bridge */ /* synthetic */ String previous() {
                return this.a.previous();
            }

            @Override // java.util.ListIterator, java.util.Iterator
            public final /* bridge */ /* synthetic */ Object next() {
                return this.a.next();
            }
        };
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new Iterator<String>() { // from class: cfc.2
            Iterator<String> a;

            {
                this.a = cfc.this.a.iterator();
            }

            @Override // java.util.Iterator
            public final boolean hasNext() {
                return this.a.hasNext();
            }

            @Override // java.util.Iterator
            public final void remove() {
                throw new UnsupportedOperationException();
            }

            @Override // java.util.Iterator
            public final /* bridge */ /* synthetic */ String next() {
                return this.a.next();
            }
        };
    }

    @Override // defpackage.cdr
    public final List<?> d() {
        return this.a.d();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* bridge */ /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }
}
