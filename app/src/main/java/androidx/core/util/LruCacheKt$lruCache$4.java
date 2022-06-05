package androidx.core.util;

import android.util.LruCache;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000#\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00028\u0000\u0012\u0004\u0012\u00028\u00010\u0001J\u0017\u0010\u0002\u001a\u0004\u0018\u00018\u00012\u0006\u0010\u0003\u001a\u00028\u0000H\u0014¢\u0006\u0002\u0010\u0004J/\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\t\u001a\u00028\u00012\b\u0010\n\u001a\u0004\u0018\u00018\u0001H\u0014¢\u0006\u0002\u0010\u000bJ\u001d\u0010\f\u001a\u00020\r2\u0006\u0010\u0003\u001a\u00028\u00002\u0006\u0010\u000e\u001a\u00028\u0001H\u0014¢\u0006\u0002\u0010\u000f¨\u0006\u0010"}, d2 = {"androidx/core/util/LruCacheKt$lruCache$4", "Landroid/util/LruCache;", "create", "key", "(Ljava/lang/Object;)Ljava/lang/Object;", "entryRemoved", "", "evicted", "", "oldValue", "newValue", "(ZLjava/lang/Object;Ljava/lang/Object;Ljava/lang/Object;)V", "sizeOf", "", "value", "(Ljava/lang/Object;Ljava/lang/Object;)I", "core-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class LruCacheKt$lruCache$4 extends LruCache<K, V> {
    final /* synthetic */ dow<K, V> $create;
    final /* synthetic */ int $maxSize;
    final /* synthetic */ dpm<Boolean, K, V, V, dmg> $onEntryRemoved;
    final /* synthetic */ dph<K, V, Integer> $sizeOf;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LruCacheKt$lruCache$4(dph<? super K, ? super V, Integer> dphVar, dow<? super K, ? extends V> dowVar, dpm<? super Boolean, ? super K, ? super V, ? super V, dmg> dpmVar, int i) {
        super(i);
        this.$sizeOf = dphVar;
        this.$create = dowVar;
        this.$onEntryRemoved = dpmVar;
        this.$maxSize = i;
    }

    @Override // android.util.LruCache
    protected final int sizeOf(K k, V v) {
        dqc.d(k, "key");
        dqc.d(v, "value");
        return this.$sizeOf.invoke(k, v).intValue();
    }

    /* JADX WARN: Type inference failed for: r2v1, types: [V, java.lang.Object] */
    @Override // android.util.LruCache
    protected final V create(K k) {
        dqc.d(k, "key");
        return this.$create.invoke(k);
    }

    @Override // android.util.LruCache
    protected final void entryRemoved(boolean z, K k, V v, V v2) {
        dqc.d(k, "key");
        dqc.d(v, "oldValue");
        this.$onEntryRemoved.invoke(Boolean.valueOf(z), k, v, v2);
    }
}
