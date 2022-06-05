package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\b\u0012\u0004\u0012\u0002H\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Landroidx/lifecycle/LiveDataScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@dog(b = "FlowLiveData.kt", c = {149}, d = "invokeSuspend", e = "androidx.lifecycle.FlowLiveDataConversions$asLiveData$1")
/* loaded from: classes.dex */
final class FlowLiveDataConversions$asLiveData$1 extends dol implements dph<LiveDataScope<T>, dnu<? super dmg>, Object> {
    final /* synthetic */ dxl $this_asLiveData;
    Object L$0;
    Object L$1;
    int label;
    private LiveDataScope p$;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FlowLiveDataConversions$asLiveData$1(dxl dxlVar, dnu dnuVar) {
        super(2, dnuVar);
        this.$this_asLiveData = dxlVar;
    }

    @Override // defpackage.doc
    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        dqc.d(dnuVar, "completion");
        FlowLiveDataConversions$asLiveData$1 flowLiveDataConversions$asLiveData$1 = new FlowLiveDataConversions$asLiveData$1(this.$this_asLiveData, dnuVar);
        flowLiveDataConversions$asLiveData$1.p$ = (LiveDataScope) obj;
        return flowLiveDataConversions$asLiveData$1;
    }

    @Override // defpackage.dph
    public final Object invoke(Object obj, dnu<? super dmg> dnuVar) {
        return ((FlowLiveDataConversions$asLiveData$1) create(obj, dnuVar)).invokeSuspend(dmg.a);
    }

    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        dny dnyVar = dny.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            final LiveDataScope liveDataScope = this.p$;
            dxl dxlVar = this.$this_asLiveData;
            this.L$0 = liveDataScope;
            this.L$1 = dxlVar;
            this.label = 1;
            if (dxlVar.a(new dxm<T>() { // from class: androidx.lifecycle.FlowLiveDataConversions$asLiveData$1$invokeSuspend$$inlined$collect$1
                @Override // defpackage.dxm
                public final Object emit(Object obj2, dnu dnuVar) {
                    Object emit = LiveDataScope.this.emit(obj2, dnuVar);
                    return emit == dny.COROUTINE_SUSPENDED ? emit : dmg.a;
                }
            }, this) == dnyVar) {
                return dnyVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return dmg.a;
    }
}
