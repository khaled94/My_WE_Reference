package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: avg  reason: default package */
/* loaded from: classes.dex */
final class avg implements Iterator<Object> {
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
