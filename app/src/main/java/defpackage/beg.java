package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: beg  reason: default package */
/* loaded from: classes2.dex */
final class beg implements Iterator<Object> {
    @Override // java.util.Iterator
    public final boolean hasNext() {
        return false;
    }

    @Override // java.util.Iterator
    public final Object next() {
        throw new NoSuchElementException();
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
