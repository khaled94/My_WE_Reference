package androidx.room;

import java.util.concurrent.Callable;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u0001H\u0001H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "R", "kotlin.jvm.PlatformType", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
@dog(b = "CoroutinesRoom.kt", c = {}, d = "invokeSuspend", e = "androidx.room.CoroutinesRoom$Companion$execute$2")
/* loaded from: classes.dex */
final class CoroutinesRoom$Companion$execute$2 extends dol implements dph<duc, dnu<? super R>, Object> {
    final /* synthetic */ Callable $callable;
    int label;
    private duc p$;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CoroutinesRoom$Companion$execute$2(Callable callable, dnu dnuVar) {
        super(2, dnuVar);
        this.$callable = callable;
    }

    @Override // defpackage.doc
    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        dqc.c(dnuVar, "completion");
        CoroutinesRoom$Companion$execute$2 coroutinesRoom$Companion$execute$2 = new CoroutinesRoom$Companion$execute$2(this.$callable, dnuVar);
        coroutinesRoom$Companion$execute$2.p$ = (duc) obj;
        return coroutinesRoom$Companion$execute$2;
    }

    @Override // defpackage.dph
    public final Object invoke(duc ducVar, Object obj) {
        return ((CoroutinesRoom$Companion$execute$2) create(ducVar, (dnu) obj)).invokeSuspend(dmg.a);
    }

    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        dny dnyVar = dny.COROUTINE_SUSPENDED;
        if (this.label == 0) {
            return this.$callable.call();
        }
        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
    }
}
