package androidx.room;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\u0010\u0000\u001a\u00020\u00012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class RoomDatabaseKt$createTransactionContext$2 extends dqd implements dow<Throwable, dmg> {
    final /* synthetic */ dtp $controlJob;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$createTransactionContext$2(dtp dtpVar) {
        super(1);
        this.$controlJob = dtpVar;
    }

    @Override // defpackage.dow
    public final /* bridge */ /* synthetic */ dmg invoke(Throwable th) {
        invoke2(th);
        return dmg.a;
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Throwable th) {
        this.$controlJob.a((CancellationException) null);
    }
}
