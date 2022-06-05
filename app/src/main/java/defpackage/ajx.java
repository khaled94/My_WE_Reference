package defpackage;

import java.io.Serializable;
import java.util.Collection;
import java.util.Map;
import java.util.Set;
import org.checkerframework.checker.nullness.compatqual.NullableDecl;

/* renamed from: ajx  reason: default package */
/* loaded from: classes.dex */
public abstract class ajx<K, V> implements Serializable, Map<K, V> {
    private static final Map.Entry<?, ?>[] a = new Map.Entry[0];
    private transient akb<Map.Entry<K, V>> b;
    private transient akb<K> c;
    private transient ajt<V> d;

    public static <K, V> ajx<K, V> a(K k, V v, K k2, V v2, K k3, V v3, K k4, V v4) {
        ajr.a(k, v);
        ajr.a(k2, v2);
        ajr.a(k3, v3);
        ajr.a(k4, v4);
        return akd.a(new Object[]{k, v, k2, v2, k3, v3, k4, v4});
    }

    abstract akb<Map.Entry<K, V>> a();

    abstract akb<K> b();

    abstract ajt<V> c();

    @Override // java.util.Map
    public abstract V get(@NullableDecl Object obj);

    @Override // java.util.Map
    @Deprecated
    public final V put(K k, V v) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final V remove(Object obj) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void putAll(Map<? extends K, ? extends V> map) {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    @Deprecated
    public final void clear() {
        throw new UnsupportedOperationException();
    }

    @Override // java.util.Map
    public boolean isEmpty() {
        return size() == 0;
    }

    @Override // java.util.Map
    public boolean containsKey(@NullableDecl Object obj) {
        return get(obj) != null;
    }

    @Override // java.util.Map
    public boolean containsValue(@NullableDecl Object obj) {
        return ((ajt) values()).contains(obj);
    }

    @Override // java.util.Map
    public final V getOrDefault(@NullableDecl Object obj, @NullableDecl V v) {
        V v2 = get(obj);
        return v2 != null ? v2 : v;
    }

    @Override // java.util.Map
    public boolean equals(@NullableDecl Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof Map)) {
            return false;
        }
        return entrySet().equals(((Map) obj).entrySet());
    }

    @Override // java.util.Map
    public int hashCode() {
        return akg.a((akb) entrySet());
    }

    public String toString() {
        int size = size();
        if (size < 0) {
            StringBuilder sb = new StringBuilder("size".length() + 40);
            sb.append("size");
            sb.append(" cannot be negative but was: ");
            sb.append(size);
            throw new IllegalArgumentException(sb.toString());
        }
        StringBuilder sb2 = new StringBuilder((int) Math.min(size << 3, 1073741824L));
        sb2.append('{');
        boolean z = true;
        for (Map.Entry<K, V> entry : entrySet()) {
            if (!z) {
                sb2.append(", ");
            }
            z = false;
            sb2.append(entry.getKey());
            sb2.append('=');
            sb2.append(entry.getValue());
        }
        sb2.append('}');
        return sb2.toString();
    }

    @Override // java.util.Map
    public /* synthetic */ Set entrySet() {
        akb<Map.Entry<K, V>> akbVar = this.b;
        if (akbVar == null) {
            akb<Map.Entry<K, V>> a2 = a();
            this.b = a2;
            return a2;
        }
        return akbVar;
    }

    @Override // java.util.Map
    public /* synthetic */ Collection values() {
        ajt<V> ajtVar = this.d;
        if (ajtVar == null) {
            ajt<V> c = c();
            this.d = c;
            return c;
        }
        return ajtVar;
    }

    @Override // java.util.Map
    public /* synthetic */ Set keySet() {
        akb<K> akbVar = this.c;
        if (akbVar == null) {
            akb<K> b = b();
            this.c = b;
            return b;
        }
        return akbVar;
    }
}
