package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: bep  reason: default package */
/* loaded from: classes2.dex */
public final class bep extends AbstractList<String> implements bco, RandomAccess {
    private final bco a;

    public bep(bco bcoVar) {
        this.a = bcoVar;
    }

    @Override // defpackage.bco
    public final bco l_() {
        return this;
    }

    @Override // defpackage.bco
    public final Object b(int i) {
        return this.a.b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new bes(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new ber(this);
    }

    @Override // defpackage.bco
    public final List<?> a() {
        return this.a.a();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }
}
