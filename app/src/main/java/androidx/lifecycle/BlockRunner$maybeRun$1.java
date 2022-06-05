package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@dog(b = "CoroutineLiveData.kt", c = {176}, d = "invokeSuspend", e = "androidx.lifecycle.BlockRunner$maybeRun$1")
/* loaded from: classes.dex */
public final class BlockRunner$maybeRun$1 extends dol implements dph<duc, dnu<? super dmg>, Object> {
    Object L$0;
    Object L$1;
    int label;
    private duc p$;
    final /* synthetic */ BlockRunner this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockRunner$maybeRun$1(BlockRunner blockRunner, dnu dnuVar) {
        super(2, dnuVar);
        this.this$0 = blockRunner;
    }

    @Override // defpackage.doc
    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        dqc.d(dnuVar, "completion");
        BlockRunner$maybeRun$1 blockRunner$maybeRun$1 = new BlockRunner$maybeRun$1(this.this$0, dnuVar);
        blockRunner$maybeRun$1.p$ = (duc) obj;
        return blockRunner$maybeRun$1;
    }

    @Override // defpackage.dph
    public final Object invoke(duc ducVar, dnu<? super dmg> dnuVar) {
        return ((BlockRunner$maybeRun$1) create(ducVar, dnuVar)).invokeSuspend(dmg.a);
    }

    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        dov dovVar;
        CoroutineLiveData coroutineLiveData;
        dph dphVar;
        dny dnyVar = dny.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            duc ducVar = this.p$;
            coroutineLiveData = this.this$0.liveData;
            LiveDataScopeImpl liveDataScopeImpl = new LiveDataScopeImpl(coroutineLiveData, ducVar.getCoroutineContext());
            dphVar = this.this$0.block;
            this.L$0 = ducVar;
            this.L$1 = liveDataScopeImpl;
            this.label = 1;
            if (dphVar.invoke(liveDataScopeImpl, this) == dnyVar) {
                return dnyVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        dovVar = this.this$0.onDone;
        dovVar.invoke();
        return dmg.a;
    }
}
