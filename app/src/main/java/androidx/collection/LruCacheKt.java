package androidx.collection;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000:\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\u001aø\u0001\u0010\u0000\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00030\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0004\"\b\b\u0001\u0010\u0003*\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u000628\b\u0006\u0010\u0007\u001a2\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\f\u0012\u0004\u0012\u00020\u00060\b2%\b\u0006\u0010\r\u001a\u001f\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0006\u0012\u0004\u0018\u0001H\u00030\u000e2d\b\u0006\u0010\u000f\u001a^\u0012\u0013\u0012\u00110\u0011¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0012\u0012\u0013\u0012\u0011H\u0002¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u000b\u0012\u0013\u0012\u0011H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0013\u0012\u0015\u0012\u0013\u0018\u0001H\u0003¢\u0006\f\b\t\u0012\b\b\n\u0012\u0004\b\b(\u0014\u0012\u0004\u0012\u00020\u00150\u0010H\u0086\b¨\u0006\u0016"}, d2 = {"lruCache", "Landroidx/collection/LruCache;", "K", ExifInterface.GPS_MEASUREMENT_INTERRUPTED, "", "maxSize", "", "sizeOf", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "key", "value", "create", "Lkotlin/Function1;", "onEntryRemoved", "Lkotlin/Function4;", "", "evicted", "oldValue", "newValue", "", "collection-ktx"}, k = 2, mv = {1, 1, 13})
/* loaded from: classes.dex */
public final class LruCacheKt {
    public static /* synthetic */ LruCache lruCache$default(int i, dph dphVar, dow dowVar, dpm dpmVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            dphVar = LruCacheKt$lruCache$1.INSTANCE;
        }
        dph dphVar2 = dphVar;
        if ((i2 & 4) != 0) {
            dowVar = LruCacheKt$lruCache$2.INSTANCE;
        }
        dow dowVar2 = dowVar;
        if ((i2 & 8) != 0) {
            dpmVar = LruCacheKt$lruCache$3.INSTANCE;
        }
        dpm dpmVar2 = dpmVar;
        dqc.c(dphVar2, "sizeOf");
        dqc.c(dowVar2, "create");
        dqc.c(dpmVar2, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(dphVar2, dowVar2, dpmVar2, i, i);
    }

    public static final <K, V> LruCache<K, V> lruCache(int i, dph<? super K, ? super V, Integer> dphVar, dow<? super K, ? extends V> dowVar, dpm<? super Boolean, ? super K, ? super V, ? super V, dmg> dpmVar) {
        dqc.c(dphVar, "sizeOf");
        dqc.c(dowVar, "create");
        dqc.c(dpmVar, "onEntryRemoved");
        return new LruCacheKt$lruCache$4(dphVar, dowVar, dpmVar, i, i);
    }
}
