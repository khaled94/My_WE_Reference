package defpackage;

import java.util.Map;

/* renamed from: atm  reason: default package */
/* loaded from: classes.dex */
final class atm<K> implements Map.Entry<K, Object> {
    Map.Entry<K, atk> a;

    private atm(Map.Entry<K, atk> entry) {
        this.a = entry;
    }

    @Override // java.util.Map.Entry
    public final K getKey() {
        return this.a.getKey();
    }

    @Override // java.util.Map.Entry
    public final Object getValue() {
        if (this.a.getValue() == null) {
            return null;
        }
        return atk.a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof aui)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        atk value = this.a.getValue();
        aui auiVar = value.b;
        value.a = null;
        value.c = null;
        value.b = (aui) obj;
        return auiVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ atm(Map.Entry entry, byte b) {
        this(entry);
    }
}
