package defpackage;

import java.util.ListIterator;

/* renamed from: avs  reason: default package */
/* loaded from: classes.dex */
final class avs implements ListIterator<String> {
    private ListIterator<String> a;
    private final /* synthetic */ int b;
    private final /* synthetic */ avt c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public avs(avt avtVar, int i) {
        atp atpVar;
        this.c = avtVar;
        this.b = i;
        atpVar = this.c.a;
        this.a = atpVar.listIterator(this.b);
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
    public final /* synthetic */ String previous() {
        return this.a.previous();
    }

    @Override // java.util.ListIterator, java.util.Iterator
    public final /* synthetic */ Object next() {
        return this.a.next();
    }
}
