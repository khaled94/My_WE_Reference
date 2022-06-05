package defpackage;

import java.util.AbstractList;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;

/* renamed from: avt  reason: default package */
/* loaded from: classes.dex */
public final class avt extends AbstractList<String> implements atp, RandomAccess {
    private final atp a;

    public avt(atp atpVar) {
        this.a = atpVar;
    }

    @Override // defpackage.atp
    public final atp j_() {
        return this;
    }

    @Override // defpackage.atp
    public final Object b(int i) {
        return this.a.b(i);
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.a.size();
    }

    @Override // defpackage.atp
    public final void a(art artVar) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.AbstractList, java.util.List
    public final ListIterator<String> listIterator(int i) {
        return new avs(this, i);
    }

    @Override // java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable, java.util.List
    public final Iterator<String> iterator() {
        return new avv(this);
    }

    @Override // defpackage.atp
    public final List<?> i_() {
        return this.a.i_();
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        return (String) this.a.get(i);
    }
}
