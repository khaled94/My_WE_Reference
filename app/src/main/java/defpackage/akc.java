package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: akc  reason: default package */
/* loaded from: classes.dex */
final class akc<K, V> extends akb<Map.Entry<K, V>> {
    private final transient ajx<K, V> a;
    private final transient Object[] b;
    private final transient int c = 0;
    private final transient int d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public akc(ajx<K, V> ajxVar, Object[] objArr, int i) {
        this.a = ajxVar;
        this.b = objArr;
        this.d = i;
    }

    @Override // defpackage.ajt
    public final akj<Map.Entry<K, V>> a() {
        return (akj) e().iterator();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    @Override // defpackage.ajt
    public final int a(Object[] objArr, int i) {
        return e().a(objArr, i);
    }

    @Override // defpackage.akb
    final ajw<Map.Entry<K, V>> f() {
        return new akf(this);
    }

    @Override // defpackage.ajt, java.util.AbstractCollection, java.util.Collection
    public final boolean contains(Object obj) {
        if (obj instanceof Map.Entry) {
            Map.Entry entry = (Map.Entry) obj;
            Object key = entry.getKey();
            Object value = entry.getValue();
            if (value != null && value.equals(this.a.get(key))) {
                return true;
            }
        }
        return false;
    }

    @Override // java.util.AbstractCollection, java.util.Collection, java.util.Set
    public final int size() {
        return this.d;
    }

    @Override // defpackage.akb, defpackage.ajt, java.util.AbstractCollection, java.util.Collection, java.lang.Iterable
    public final /* synthetic */ Iterator iterator() {
        return iterator();
    }
}
