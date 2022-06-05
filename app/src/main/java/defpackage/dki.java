package defpackage;

import java.util.LinkedHashMap;
import java.util.Map;

/* renamed from: dki  reason: default package */
/* loaded from: classes2.dex */
public final class dki<K, V> extends LinkedHashMap<K, V> {
    /* JADX WARN: Multi-variable type inference failed */
    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final V put(K k, V v) {
        Object put = super.put(k, v);
        if (put == null) {
            return null;
        }
        super.put(k, put);
        throw new IllegalArgumentException("Duplicate:\n    " + put + "\n    " + v);
    }

    @Override // java.util.HashMap, java.util.AbstractMap, java.util.Map
    public final void putAll(Map<? extends K, ? extends V> map) {
        for (Map.Entry<? extends K, ? extends V> entry : map.entrySet()) {
            put(entry.getKey(), entry.getValue());
        }
    }
}
