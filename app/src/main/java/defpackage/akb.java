package defpackage;

import java.util.Iterator;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: akb  reason: default package */
/* loaded from: classes.dex */
public abstract class akb<E> extends ajt<E> implements Set<E> {
    @NullableDecl
    private transient ajw<E> a;

    @Override // java.util.Collection, java.util.Set
    public boolean equals(@NullableDecl Object obj) {
        if (obj == this) {
            return true;
        }
        return akg.a(this, obj);
    }

    @Override // java.util.Collection, java.util.Set
    public int hashCode() {
        return akg.a(this);
    }

    @Override // defpackage.ajt
    public ajw<E> e() {
        ajw<E> ajwVar = this.a;
        if (ajwVar == null) {
            ajw<E> f = f();
            this.a = f;
            return f;
        }
        return ajwVar;
    }

    ajw<E> f() {
        return ajw.a(toArray());
    }

    @Override // defpackage.ajt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
