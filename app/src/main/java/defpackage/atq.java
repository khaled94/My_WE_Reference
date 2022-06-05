package defpackage;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;
import java.util.RandomAccess;

/* renamed from: atq  reason: default package */
/* loaded from: classes.dex */
public final class atq extends arn<String> implements atp, RandomAccess {
    private static final atq b;
    private static final atp c;
    private final List<Object> d;

    public atq() {
        this(10);
    }

    public atq(int i) {
        this(new ArrayList(i));
    }

    private atq(ArrayList<Object> arrayList) {
        this.d = arrayList;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.List
    public final int size() {
        return this.d.size();
    }

    @Override // defpackage.arn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final boolean addAll(Collection<? extends String> collection) {
        return addAll(size(), collection);
    }

    @Override // defpackage.arn, java.util.AbstractList, java.util.List
    public final boolean addAll(int i, Collection<? extends String> collection) {
        c();
        if (collection instanceof atp) {
            collection = ((atp) collection).i_();
        }
        boolean addAll = this.d.addAll(i, collection);
        this.modCount++;
        return addAll;
    }

    @Override // defpackage.arn, java.util.AbstractList, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final void clear() {
        c();
        this.d.clear();
        this.modCount++;
    }

    @Override // defpackage.atp
    public final void a(art artVar) {
        c();
        this.d.add(artVar);
        this.modCount++;
    }

    @Override // defpackage.atp
    public final Object b(int i) {
        return this.d.get(i);
    }

    private static String a(Object obj) {
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof art) {
            return ((art) obj).b();
        }
        return atb.b((byte[]) obj);
    }

    @Override // defpackage.atp
    public final List<?> i_() {
        return Collections.unmodifiableList(this.d);
    }

    @Override // defpackage.atp
    public final atp j_() {
        return a() ? new avt(this) : this;
    }

    @Override // defpackage.arn, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object set(int i, Object obj) {
        c();
        return a(this.d.set(i, (String) obj));
    }

    @Override // defpackage.arn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean retainAll(Collection collection) {
        return super.retainAll(collection);
    }

    @Override // defpackage.arn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean removeAll(Collection collection) {
        return super.removeAll(collection);
    }

    @Override // defpackage.arn, java.util.AbstractCollection, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean remove(Object obj) {
        return super.remove(obj);
    }

    @Override // defpackage.arn, java.util.AbstractList, java.util.List
    public final /* synthetic */ Object remove(int i) {
        c();
        Object remove = this.d.remove(i);
        this.modCount++;
        return a(remove);
    }

    @Override // defpackage.arn, defpackage.ati
    public final /* bridge */ /* synthetic */ boolean a() {
        return super.a();
    }

    @Override // defpackage.arn, java.util.AbstractList, java.util.List
    public final /* synthetic */ void add(int i, Object obj) {
        c();
        this.d.add(i, (String) obj);
        this.modCount++;
    }

    @Override // defpackage.arn, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ int hashCode() {
        return super.hashCode();
    }

    @Override // defpackage.arn, java.util.AbstractList, java.util.Collection, java.util.List
    public final /* bridge */ /* synthetic */ boolean equals(Object obj) {
        return super.equals(obj);
    }

    @Override // defpackage.ati
    public final /* synthetic */ ati a(int i) {
        if (i < size()) {
            throw new IllegalArgumentException();
        }
        ArrayList arrayList = new ArrayList(i);
        arrayList.addAll(this.d);
        return new atq(arrayList);
    }

    @Override // java.util.AbstractList, java.util.List
    public final /* synthetic */ Object get(int i) {
        Object obj = this.d.get(i);
        if (obj instanceof String) {
            return (String) obj;
        }
        if (obj instanceof art) {
            art artVar = (art) obj;
            String b2 = artVar.b();
            if (artVar.c()) {
                this.d.set(i, b2);
            }
            return b2;
        }
        byte[] bArr = (byte[]) obj;
        String b3 = atb.b(bArr);
        if (atb.a(bArr)) {
            this.d.set(i, b3);
        }
        return b3;
    }

    static {
        atq atqVar = new atq();
        b = atqVar;
        atqVar.a = false;
        c = b;
    }
}
