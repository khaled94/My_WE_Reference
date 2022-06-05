package androidx.lifecycle;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 1})
@dog(b = "Lifecycle.kt", c = {74}, d = "invokeSuspend", e = "androidx.lifecycle.LifecycleCoroutineScope$launchWhenCreated$1")
/* loaded from: classes.dex */
final class LifecycleCoroutineScope$launchWhenCreated$1 extends dol implements dph<duc, dnu<? super dmg>, Object> {
    final /* synthetic */ dph $block;
    int label;
    final /* synthetic */ LifecycleCoroutineScope this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LifecycleCoroutineScope$launchWhenCreated$1(LifecycleCoroutineScope lifecycleCoroutineScope, dph dphVar, dnu dnuVar) {
        super(2, dnuVar);
        this.this$0 = lifecycleCoroutineScope;
        this.$block = dphVar;
    }

    @Override // defpackage.doc
    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        dqc.d(dnuVar, "completion");
        return new LifecycleCoroutineScope$launchWhenCreated$1(this.this$0, this.$block, dnuVar);
    }

    @Override // defpackage.dph
    public final Object invoke(duc ducVar, dnu<? super dmg> dnuVar) {
        return ((LifecycleCoroutineScope$launchWhenCreated$1) create(ducVar, dnuVar)).invokeSuspend(dmg.a);
    }

    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        dny dnyVar = dny.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            Lifecycle lifecycle$lifecycle_runtime_ktx_release = this.this$0.getLifecycle$lifecycle_runtime_ktx_release();
            dph dphVar = this.$block;
            this.label = 1;
            if (PausingDispatcherKt.whenCreated(lifecycle$lifecycle_runtime_ktx_release, dphVar, this) == dnyVar) {
                return dnyVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        return dmg.a;
    }
}
