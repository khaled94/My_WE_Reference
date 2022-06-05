package androidx.lifecycle;

import androidx.exifinterface.media.ExifInterface;
import androidx.lifecycle.Lifecycle;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 1})
@dog(b = "PausingDispatcher.kt", c = {162}, d = "invokeSuspend", e = "androidx.lifecycle.PausingDispatcherKt$whenStateAtLeast$2")
/* loaded from: classes.dex */
final class PausingDispatcherKt$whenStateAtLeast$2 extends dol implements dph<duc, dnu<? super T>, Object> {
    final /* synthetic */ dph $block;
    final /* synthetic */ Lifecycle.State $minState;
    final /* synthetic */ Lifecycle $this_whenStateAtLeast;
    private /* synthetic */ Object L$0;
    int label;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PausingDispatcherKt$whenStateAtLeast$2(Lifecycle lifecycle, Lifecycle.State state, dph dphVar, dnu dnuVar) {
        super(2, dnuVar);
        this.$this_whenStateAtLeast = lifecycle;
        this.$minState = state;
        this.$block = dphVar;
    }

    @Override // defpackage.doc
    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        dqc.d(dnuVar, "completion");
        PausingDispatcherKt$whenStateAtLeast$2 pausingDispatcherKt$whenStateAtLeast$2 = new PausingDispatcherKt$whenStateAtLeast$2(this.$this_whenStateAtLeast, this.$minState, this.$block, dnuVar);
        pausingDispatcherKt$whenStateAtLeast$2.L$0 = obj;
        return pausingDispatcherKt$whenStateAtLeast$2;
    }

    @Override // defpackage.dph
    public final Object invoke(duc ducVar, Object obj) {
        return ((PausingDispatcherKt$whenStateAtLeast$2) create(ducVar, (dnu) obj)).invokeSuspend(dmg.a);
    }

    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        LifecycleController lifecycleController;
        dny dnyVar = dny.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            dvi dviVar = (dvi) ((duc) this.L$0).getCoroutineContext().get(dvi.b);
            if (dviVar == null) {
                throw new IllegalStateException("when[State] methods should have a parent job".toString());
            }
            PausingDispatcher pausingDispatcher = new PausingDispatcher();
            LifecycleController lifecycleController2 = new LifecycleController(this.$this_whenStateAtLeast, this.$minState, pausingDispatcher.dispatchQueue, dviVar);
            try {
                dph dphVar = this.$block;
                this.L$0 = lifecycleController2;
                this.label = 1;
                obj = dtb.a(pausingDispatcher, dphVar, this);
                if (obj == dnyVar) {
                    return dnyVar;
                }
                lifecycleController = lifecycleController2;
            } finally {
                lifecycleController2.finish();
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            lifecycleController = (LifecycleController) this.L$0;
        }
        return obj;
    }
}
