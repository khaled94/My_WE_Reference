package defpackage;

import androidx.collection.ArrayMap;
import androidx.collection.SimpleArrayMap;

/* renamed from: kw  reason: default package */
/* loaded from: classes2.dex */
public final class kw<K, V> extends ArrayMap<K, V> {
    private int a;

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final void clear() {
        this.a = 0;
        super.clear();
    }

    @Override // androidx.collection.SimpleArrayMap
    public final V setValueAt(int i, V v) {
        this.a = 0;
        return (V) super.setValueAt(i, v);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final V put(K k, V v) {
        this.a = 0;
        return (V) super.put(k, v);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final void putAll(SimpleArrayMap<? extends K, ? extends V> simpleArrayMap) {
        this.a = 0;
        super.putAll(simpleArrayMap);
    }

    @Override // androidx.collection.SimpleArrayMap
    public final V removeAt(int i) {
        this.a = 0;
        return (V) super.removeAt(i);
    }

    @Override // androidx.collection.SimpleArrayMap, java.util.Map
    public final int hashCode() {
        if (this.a == 0) {
            this.a = super.hashCode();
        }
        return this.a;
    }
}
