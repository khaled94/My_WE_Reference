package androidx.lifecycle;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@dog(b = "CoroutineLiveData.kt", c = {}, d = "invokeSuspend", e = "androidx.lifecycle.EmittedSource$dispose$1")
/* loaded from: classes.dex */
final class EmittedSource$dispose$1 extends dol implements dph<duc, dnu<? super dmg>, Object> {
    int label;
    private duc p$;
    final /* synthetic */ EmittedSource this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public EmittedSource$dispose$1(EmittedSource emittedSource, dnu dnuVar) {
        super(2, dnuVar);
        this.this$0 = emittedSource;
    }

    @Override // defpackage.doc
    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        dqc.d(dnuVar, "completion");
        EmittedSource$dispose$1 emittedSource$dispose$1 = new EmittedSource$dispose$1(this.this$0, dnuVar);
        emittedSource$dispose$1.p$ = (duc) obj;
        return emittedSource$dispose$1;
    }

    @Override // defpackage.dph
    public final Object invoke(duc ducVar, dnu<? super dmg> dnuVar) {
        return ((EmittedSource$dispose$1) create(ducVar, dnuVar)).invokeSuspend(dmg.a);
    }

    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        dny dnyVar = dny.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            this.this$0.removeSource();
            return dmg.a;
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
