package defpackage;

import defpackage.cdm;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: cdq  reason: default package */
/* loaded from: classes2.dex */
public final class cdq extends cco<String> implements cdr, RandomAccess {
    public static final cdr b;
    private static final cdq c;
    private final List<Object> d;

    @Override // defpackage.cco, defpackage.cdm.i
    public final /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        c();
        this.d.add(i, (String) obj);
        this.modCount++;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean add(Object obj) {
        return super.add(obj);
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // defpackage.cco, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // defpackage.cco, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // defpackage.cco, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        c();
        return a(this.d.set(i, (String) obj));
    }

    static {
        cdq cdqVar = new cdq();
        c = cdqVar;
        cdqVar.a = false;
        b = c;
    }

    public cdq() {
        this(10);
    }

    public cdq(int i) {
        this(new ArrayList(i));
    }

    private cdq(ArrayList<Object> arrayList) {
        this.d = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.cco, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof cdr) {
            collection = ((cdr) collection).d();
        }
        boolean addAll = this.d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.d.clear();
        this.modCount++;
    }

    @Override // defpackage.cdr
    public final void a(ccu ccuVar) {
        c();
        this.d.add(ccuVar);
        this.modCount++;
    }

    @Override // defpackage.cdr
    public final Object b(int i) {
        return this.d.get(i);
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ccu) {
            return ((ccu) obj).d();
        }
        return cdm.b((byte[]) obj);
    }

    @Override // defpackage.cdr
    public final List<?> d() {
        return Collections.unmodifiableList(this.d);
    }

    @Override // defpackage.cdr
    public final cdr e() {
        return super.a() ? new cfc(this) : this;
    }

    @Override // defpackage.cco, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        Object remove = this.d.remove(i);
        this.modCount++;
        return a(remove);
    }

    @Override // defpackage.cdm.i
    public final /* synthetic */ cdm.i a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.d);
        return new cdq(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof ccu) {
            ccu ccuVar = (ccu) obj;
            String d = ccuVar.d();
            if (ccuVar.e()) {
                this.d.set(i, d);
            }
            return d;
        }
        byte[] bArr = (byte[]) obj;
        String b2 = cdm.b(bArr);
        if (cdm.a(bArr)) {
            this.d.set(i, b2);
        }
        return b2;
    }
}
