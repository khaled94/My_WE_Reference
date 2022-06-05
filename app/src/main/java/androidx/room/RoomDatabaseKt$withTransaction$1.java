package androidx.room;

import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@dog(b = "RoomDatabase.kt", c = {50, 51}, d = "withTransaction", e = "androidx.room.RoomDatabaseKt")
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0018\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u0004\u0018\u00010\u0001\"\u0004\b\u0000\u0010\u0002*\u00020\u00032\u001c\u0010\u0004\u001a\u0018\b\u0001\u0012\n\u0012\b\u0012\u0004\u0012\u0002H\u00020\u0006\u0012\u0006\u0012\u0004\u0018\u00010\u00010\u00052\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0006H\u0086@"}, d2 = {"withTransaction", "", "R", "Landroidx/room/RoomDatabase;", "block", "Lkotlin/Function1;", "Lkotlin/coroutines/Continuation;", "continuation"}, k = 3, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class RoomDatabaseKt$withTransaction$1 extends doe {
    Object L$0;
    Object L$1;
    Object L$2;
    int label;
    /* synthetic */ Object result;

    /* JADX INFO: Access modifiers changed from: package-private */
    public RoomDatabaseKt$withTransaction$1(dnu dnuVar) {
        super(dnuVar);
    }

    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        this.result = obj;
        this.label |= Integer.MIN_VALUE;
        return RoomDatabaseKt.withTransaction(null, null, this);
    }
}
