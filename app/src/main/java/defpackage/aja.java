package defpackage;

import java.util.Iterator;
import java.util.NoSuchElementException;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: aja  reason: default package */
/* loaded from: classes.dex */
abstract class aja<T> implements Iterator<T> {
    int a = ajb.b;
    @NullableDecl
    private T b;

    protected abstract T a();

    @Override // java.util.Iterator
    public final boolean hasNext() {
        if (!(this.a != ajb.d)) {
            throw new IllegalStateException();
        }
        int i = ajc.a[this.a - 1];
        if (i == 1) {
            return true;
        }
        if (i != 2) {
            this.a = ajb.d;
            this.b = a();
            if (this.a != ajb.c) {
                this.a = ajb.a;
                return true;
            }
        }
        return false;
    }

    @Override // java.util.Iterator
    public final T next() {
        if (!hasNext()) {
            throw new NoSuchElementException();
        }
        this.a = ajb.b;
        T t = this.b;
        this.b = null;
        return t;
    }

    @Override // java.util.Iterator
    public final void remove() {
        throw new UnsupportedOperationException();
    }
}
