package androidx.room;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@dog(b = "RoomDatabase.kt", c = {99}, d = "createTransactionContext", e = "androidx.room.RoomDatabaseKt")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u0001*\u00020\u00022\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004H\u0082@"}, d2 = {"createTransactionContext", "", "Landroidx/room/RoomDatabase;", "continuation", "Lkotlin/coroutines/Continuation;", "Lkotlin/coroutines/CoroutineContext;"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class RoomDatabaseKt$createTransactionContext$1 extends doe {
    Object L$0;
    Object L$1;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RoomDatabaseKt$createTransactionContext$1(dnu dnuVar) {
        super(dnuVar);
    }

    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RoomDatabaseKt.createTransactionContext(null, this);
    }
}
