package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: bcp  reason: default package */
/* loaded from: classes2.dex */
public final class bcp extends bfv<String> implements bco, RandomAccess {
    private static final bcp b;
    private static final bco c;
    private final List<Object> d;

    public bcp() {
        this(10);
    }

    public bcp(int i) {
        this(new ArrayList(i));
    }

    private bcp(ArrayList<Object> arrayList) {
        this.d = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.bfv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        d();
        if (collection instanceof bco) {
            collection = ((bco) collection).a();
        }
        boolean addAll = this.d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        d();
        this.d.clear();
        this.modCount++;
    }

    @Override // defpackage.bco
    public final Object b(int i) {
        return this.d.get(i);
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof bgb) {
            return ((bgb) obj).e();
        }
        return bcd.b((byte[]) obj);
    }

    @Override // defpackage.bco
    public final List<?> a() {
        return Collections.unmodifiableList(this.d);
    }

    @Override // defpackage.bco
    public final bco l_() {
        return c() ? new bep(this) : this;
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        d();
        return a(this.d.set(i, (String) obj));
    }

    @Override // defpackage.bfv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // defpackage.bfv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // defpackage.bfv, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        d();
        Object remove = this.d.remove(i);
        this.modCount++;
        return a(remove);
    }

    @Override // defpackage.bfv, defpackage.bch
    public final /* bridge */ /* synthetic */ boolean c() {
        return super.c();
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        d();
        this.d.add(i, (String) obj);
        this.modCount++;
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // defpackage.bfv, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // defpackage.bch
    public final /* synthetic */ bch a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.d);
        return new bcp(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof bgb) {
            bgb bgbVar = (bgb) obj;
            String e = bgbVar.e();
            if (bgbVar.b()) {
                this.d.set(i, e);
            }
            return e;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = bcd.b(bArr);
        if (bcd.a(bArr)) {
            this.d.set(i, b2);
        }
        return b2;
    }

    static {
        bcp bcpVar = new bcp();
        b = bcpVar;
        bcpVar.a = false;
        c = b;
    }
}
