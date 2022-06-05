package androidx.lifecycle;

import androidx.arch.core.util.Function;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0012\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001f\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0001H\u0086\b\u001a>\u0010\u0003\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u0014\b\u0004\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u0002H\u0002\u0012\u0004\u0012\u0002H\u00040\u0006H\u0086\bø\u0001\u0000\u001aD\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00040\u0001\"\u0004\b\u0000\u0010\u0002\"\u0004\b\u0001\u0010\u0004*\b\u0012\u0004\u0012\u0002H\u00020\u00012\u001a\b\u0004\u0010\u0005\u001a\u0014\u0012\u0004\u0012\u0002H\u0002\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00040\u00010\u0006H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"distinctUntilChanged", "Landroidx/lifecycle/LiveData;", "X", "map", "Y", "transform", "Lkotlin/Function1;", "switchMap", "lifecycle-livedata-ktx_release"}, k = 2, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class TransformationsKt {
    public static final <X, Y> LiveData<Y> map(LiveData<X> liveData, final dow<? super X, ? extends Y> dowVar) {
        dqc.d(liveData, "$this$map");
        dqc.d(dowVar, "transform");
        LiveData<Y> map = Transformations.map(liveData, new Function<X, Y>() { // from class: androidx.lifecycle.TransformationsKt$map$1
            /* JADX WARN: Type inference failed for: r2v1, types: [Y, java.lang.Object] */
            @Override // androidx.arch.core.util.Function
            public final Y apply(X x) {
                return dow.this.invoke(x);
            }
        });
        dqc.b(map, "Transformations.map(this) { transform(it) }");
        return map;
    }

    public static final <X, Y> LiveData<Y> switchMap(LiveData<X> liveData, final dow<? super X, ? extends LiveData<Y>> dowVar) {
        dqc.d(liveData, "$this$switchMap");
        dqc.d(dowVar, "transform");
        LiveData<Y> switchMap = Transformations.switchMap(liveData, new Function<X, LiveData<Y>>() { // from class: androidx.lifecycle.TransformationsKt$switchMap$1
            @Override // androidx.arch.core.util.Function
            public final LiveData<Y> apply(X x) {
                return (LiveData) dow.this.invoke(x);
            }
        });
        dqc.b(switchMap, "Transformations.switchMap(this) { transform(it) }");
        return switchMap;
    }

    public static final <X> LiveData<X> distinctUntilChanged(LiveData<X> liveData) {
        dqc.d(liveData, "$this$distinctUntilChanged");
        LiveData<X> distinctUntilChanged = Transformations.distinctUntilChanged(liveData);
        dqc.b(distinctUntilChanged, "Transformations.distinctUntilChanged(this)");
        return distinctUntilChanged;
    }
}
