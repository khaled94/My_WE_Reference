package defpackage;

import java.util.Iterator;
import java.util.Map;

/* renamed from: cdo  reason: default package */
/* loaded from: classes2.dex */
public final class cdo extends cdp {
    private final cec b;

    public final cec a() {
        return a(this.b);
    }

    @Override // defpackage.cdp
    public final int hashCode() {
        return a().hashCode();
    }

    @Override // defpackage.cdp
    public final boolean equals(Object obj) {
        return a().equals(obj);
    }

    public final String toString() {
        return a().toString();
    }

    /* renamed from: cdo$a */
    /* loaded from: classes2.dex */
    static class a<K> implements Map.Entry<K, Object> {
        Map.Entry<K, cdo> a;

        /* synthetic */ a(Map.Entry entry, byte b) {
            this(entry);
        }

        private a(Map.Entry<K, cdo> entry) {
            this.a = entry;
        }

        @Override // java.util.Map.Entry
        public final K getKey() {
            return this.a.getKey();
        }

        @Override // java.util.Map.Entry
        public final Object getValue() {
            cdo value = this.a.getValue();
            if (value == null) {
                return null;
            }
            return value.a();
        }

        @Override // java.util.Map.Entry
        public final Object setValue(Object obj) {
            if (!(obj instanceof cec)) {
                throw new IllegalArgumentException("LazyField now only used for MessageSet, and the value of MessageSet must be an instance of MessageLite");
            }
            return this.a.getValue().b((cec) obj);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cdo$b */
    /* loaded from: classes2.dex */
    public static class b<K> implements Iterator<Map.Entry<K, Object>> {
        private Iterator<Map.Entry<K, Object>> a;

        public b(Iterator<Map.Entry<K, Object>> it) {
            this.a = it;
        }

        @Override // java.util.Iterator
        public final boolean hasNext() {
            return this.a.hasNext();
        }

        @Override // java.util.Iterator
        public final void remove() {
            this.a.remove();
        }

        @Override // java.util.Iterator
        public final /* synthetic */ Object next() {
            Map.Entry<K, Object> next = this.a.next();
            return next.getValue() instanceof cdo ? new a(next, (byte) 0) : next;
        }
    }
}
