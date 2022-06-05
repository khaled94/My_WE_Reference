package androidx.lifecycle;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.location.LocationRequestCompat;
import androidx.exifinterface.media.ExifInterface;
import defpackage.dnw;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u0003H\u008a@¢\u0006\u0004\b\u0004\u0010\u0005"}, d2 = {"<anonymous>", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 4, 0})
@dog(b = "CoroutineLiveData.kt", c = {187}, d = "invokeSuspend", e = "androidx.lifecycle.BlockRunner$cancel$1")
/* loaded from: classes.dex */
public final class BlockRunner$cancel$1 extends dol implements dph<duc, dnu<? super dmg>, Object> {
    Object L$0;
    int label;
    private duc p$;
    final /* synthetic */ BlockRunner this$0;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public BlockRunner$cancel$1(BlockRunner blockRunner, dnu dnuVar) {
        super(2, dnuVar);
        this.this$0 = blockRunner;
    }

    @Override // defpackage.doc
    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        dqc.d(dnuVar, "completion");
        BlockRunner$cancel$1 blockRunner$cancel$1 = new BlockRunner$cancel$1(this.this$0, dnuVar);
        blockRunner$cancel$1.p$ = (duc) obj;
        return blockRunner$cancel$1;
    }

    @Override // defpackage.dph
    public final Object invoke(duc ducVar, dnu<? super dmg> dnuVar) {
        return ((BlockRunner$cancel$1) create(ducVar, dnuVar)).invokeSuspend(dmg.a);
    }

    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        CoroutineLiveData coroutineLiveData;
        dvi dviVar;
        long j;
        Object obj2;
        dny dnyVar = dny.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            duc ducVar = this.p$;
            j = this.this$0.timeoutInMs;
            this.L$0 = ducVar;
            this.label = 1;
            if (j <= 0) {
                obj2 = dmg.a;
            } else {
                dtg dtgVar = new dtg(dnz.a(this), 1);
                dtgVar.b();
                dtg dtgVar2 = dtgVar;
                if (j < LocationRequestCompat.PASSIVE_INTERVAL) {
                    dnw.b bVar = dtgVar2.getContext().get(dnv.a);
                    duk dukVar = bVar instanceof duk ? (duk) bVar : null;
                    if (dukVar == null) {
                        dukVar = duj.a();
                    }
                    dukVar.a(j, dtgVar2);
                }
                obj2 = dtgVar.e();
                if (obj2 == dny.COROUTINE_SUSPENDED) {
                    dqc.d(this, TypedValues.Attributes.S_FRAME);
                }
                if (obj2 != dny.COROUTINE_SUSPENDED) {
                    obj2 = dmg.a;
                }
            }
            if (obj2 == dnyVar) {
                return dnyVar;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        }
        coroutineLiveData = this.this$0.liveData;
        if (!coroutineLiveData.hasActiveObservers()) {
            dviVar = this.this$0.runningJob;
            if (dviVar != null) {
                dviVar.a((CancellationException) null);
            }
            this.this$0.runningJob = null;
        }
        return dmg.a;
    }
}
