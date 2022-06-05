package androidx.room;

import java.util.concurrent.CancellationException;
import java.util.concurrent.Executor;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004¨\u0006\u0005"}, d2 = {"<anonymous>", "", "it", "", "invoke", "androidx/room/RoomDatabaseKt$acquireTransactionThread$2$1"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class RoomDatabaseKt$acquireTransactionThread$$inlined$suspendCancellableCoroutine$lambda$1 extends dqd implements dow<Throwable, dmg> {
    final /* synthetic */ dvi $controlJob$inlined;
    final /* synthetic */ Executor $this_acquireTransactionThread$inlined;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$acquireTransactionThread$$inlined$suspendCancellableCoroutine$lambda$1(Executor executor, dvi dviVar) {
        super(1);
        this.$this_acquireTransactionThread$inlined = executor;
        this.$controlJob$inlined = dviVar;
    }

    @Override // defpackage.dow
    public final /* bridge */ /* synthetic */ dmg invoke(Throwable th) {
        invoke2(th);
        return dmg.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$controlJob$inlined.a((CancellationException) null);
    }
}
