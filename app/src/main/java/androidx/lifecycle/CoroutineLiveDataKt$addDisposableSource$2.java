package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "Landroidx/lifecycle/EmittedSource;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@dog(b = "CoroutineLiveData.kt", c = {}, d = "invokeSuspend", e = "androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2")
/* loaded from: classes.dex */
public final class CoroutineLiveDataKt$addDisposableSource$2 extends dol implements dph<duc, dnu<? super EmittedSource>, Object> {
    final /* synthetic */ LiveData $source;
    final /* synthetic */ MediatorLiveData $this_addDisposableSource;
    int label;
    private duc p$;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutineLiveDataKt$addDisposableSource$2(MediatorLiveData mediatorLiveData, LiveData liveData, dnu dnuVar) {
        super(2, dnuVar);
        this.$this_addDisposableSource = mediatorLiveData;
        this.$source = liveData;
    }

    @Override // defpackage.doc
    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        dqc.d(dnuVar, "completion");
        CoroutineLiveDataKt$addDisposableSource$2 coroutineLiveDataKt$addDisposableSource$2 = new CoroutineLiveDataKt$addDisposableSource$2(this.$this_addDisposableSource, this.$source, dnuVar);
        coroutineLiveDataKt$addDisposableSource$2.p$ = (duc) obj;
        return coroutineLiveDataKt$addDisposableSource$2;
    }

    @Override // defpackage.dph
    public final Object invoke(duc ducVar, dnu<? super EmittedSource> dnuVar) {
        return ((CoroutineLiveDataKt$addDisposableSource$2) create(ducVar, dnuVar)).invokeSuspend(dmg.a);
    }

    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        dny dnyVar = dny.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            this.$this_addDisposableSource.addSource(this.$source, new Observer<T>() { // from class: androidx.lifecycle.CoroutineLiveDataKt$addDisposableSource$2.1
                @Override // androidx.lifecycle.Observer
                public final void onChanged(T t) {
                    CoroutineLiveDataKt$addDisposableSource$2.this.$this_addDisposableSource.setValue(t);
                }
            });
            return new EmittedSource(this.$source, this.$this_addDisposableSource);
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
