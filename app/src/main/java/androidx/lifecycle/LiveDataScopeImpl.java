package androidx.lifecycle;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0019\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0012\u001a\u00028\u0000H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0013J\u001f\u0010\u0014\u001a\u00020\u00152\f\u0010\u0016\u001a\b\u0012\u0004\u0012\u00028\u00000\u0017H\u0096@ø\u0001\u0000¢\u0006\u0002\u0010\u0018R\u000e\u0010\b\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0016\u0010\t\u001a\u0004\u0018\u00018\u00008VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR \u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0004X\u0080\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0019"}, d2 = {"Landroidx/lifecycle/LiveDataScopeImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveDataScope;", TypedValues.Attributes.S_TARGET, "Landroidx/lifecycle/CoroutineLiveData;", "context", "Lkotlin/coroutines/CoroutineContext;", "(Landroidx/lifecycle/CoroutineLiveData;Lkotlin/coroutines/CoroutineContext;)V", "coroutineContext", "latestValue", "getLatestValue", "()Ljava/lang/Object;", "getTarget$lifecycle_livedata_ktx_release", "()Landroidx/lifecycle/CoroutineLiveData;", "setTarget$lifecycle_livedata_ktx_release", "(Landroidx/lifecycle/CoroutineLiveData;)V", "emit", "", "value", "(Ljava/lang/Object;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "emitSource", "Lkotlinx/coroutines/DisposableHandle;", "source", "Landroidx/lifecycle/LiveData;", "(Landroidx/lifecycle/LiveData;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "lifecycle-livedata-ktx_release"}, k = 1, mv = {1, 4, 0})
/* loaded from: classes.dex */
public final class LiveDataScopeImpl<T> implements LiveDataScope<T> {
    private final dnw coroutineContext;
    private CoroutineLiveData<T> target;

    public LiveDataScopeImpl(CoroutineLiveData<T> coroutineLiveData, dnw dnwVar) {
        dqc.d(coroutineLiveData, TypedValues.Attributes.S_TARGET);
        dqc.d(dnwVar, "context");
        this.target = coroutineLiveData;
        this.coroutineContext = dnwVar.plus(dup.b().a());
    }

    public final CoroutineLiveData<T> getTarget$lifecycle_livedata_ktx_release() {
        return this.target;
    }

    public final void setTarget$lifecycle_livedata_ktx_release(CoroutineLiveData<T> coroutineLiveData) {
        dqc.d(coroutineLiveData, "<set-?>");
        this.target = coroutineLiveData;
    }

    @Override // androidx.lifecycle.LiveDataScope
    public final T getLatestValue() {
        return this.target.getValue();
    }

    @Override // androidx.lifecycle.LiveDataScope
    public final Object emitSource(LiveData<T> liveData, dnu<? super duq> dnuVar) {
        return dtb.a(this.coroutineContext, new LiveDataScopeImpl$emitSource$2(this, liveData, null), dnuVar);
    }

    @Override // androidx.lifecycle.LiveDataScope
    public final Object emit(T t, dnu<? super dmg> dnuVar) {
        Object a = dtb.a(this.coroutineContext, new LiveDataScopeImpl$emit$2(this, t, null), dnuVar);
        return a == dny.COROUTINE_SUSPENDED ? a : dmg.a;
    }
}
