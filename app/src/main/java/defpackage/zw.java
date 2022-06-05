package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;

/* renamed from: zw  reason: default package */
/* loaded from: classes2.dex */
public final class zw<T> implements Iterator<T> {
    protected final zv<T> a;
    protected int b = -1;

    public zw(zv<T> zvVar) {
        this.a = (zv) aat.a(zvVar);
    }

    @Override // java.util.Iterator
    public final boolean hasNext() {
        return this.b < this.a.c() + (-1);
    }

    @Override // java.util.Iterator
    public final T next() {
        if (hasNext()) {
            zv<T> zvVar = this.a;
            int i = this.b + 1;
            this.b = i;
            return zvVar.a(i);
        }
        int i2 = this.b;
        StringBuilder sb = new StringBuilder(46);
        sb.append("Cannot advance the iterator beyond ");
        sb.append(i2);
        throw new NoSuchElementException(sb.toString());
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException("Cannot remove elements from a DataBufferIterator");
    }
}
