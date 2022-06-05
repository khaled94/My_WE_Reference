package defpackage;

import java.util.Map;

/* renamed from: bcl  reason: default package */
/* loaded from: classes2.dex */
final class bcl<K> implements Map.Entry<K, Object> {
    Map.Entry<K, bcj> a;

    private bcl(Map.Entry<K, bcj> entry) {
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
        return bcj.a();
    }

    @Override // java.util.Map.Entry
    public final Object setValue(Object obj) {
        if (!(obj instanceof bdh)) {
            throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
        }
        bcj value = this.a.getValue();
        bdh bdhVar = value.b;
        value.a = null;
        value.c = null;
        value.b = (bdh) obj;
        return bdhVar;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ bcl(Map.Entry entry, byte b) {
        this(entry);
    }
}
