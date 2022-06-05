package androidx.room;

import java.util.Map;
import java.util.concurrent.Executor;
import kotlin.Metadata;
import kotlin.TypeCastException;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\"\u0018\u0010\u0000\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0003\u0010\u0004\"\u0018\u0010\u0005\u001a\u00020\u0001*\u00020\u00028@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0006\u0010\u0004¨\u0006\u0007"}, d2 = {"queryDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "Landroidx/room/RoomDatabase;", "getQueryDispatcher", "(Landroidx/room/RoomDatabase;)Lkotlinx/coroutines/CoroutineDispatcher;", "transactionDispatcher", "getTransactionDispatcher", "room-ktx_release"}, k = 2, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class CoroutinesRoomKt {
    public static final dtx getQueryDispatcher(RoomDatabase roomDatabase) {
        dqc.c(roomDatabase, "$this$queryDispatcher");
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        dqc.a((Object) backingFieldMap, "backingFieldMap");
        Object obj = backingFieldMap.get("QueryDispatcher");
        if (obj == null) {
            Executor queryExecutor = roomDatabase.getQueryExecutor();
            dqc.a((Object) queryExecutor, "queryExecutor");
            obj = dva.a(queryExecutor);
            backingFieldMap.put("QueryDispatcher", obj);
        }
        if (obj != null) {
            return (dtx) obj;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
    }

    public static final dtx getTransactionDispatcher(RoomDatabase roomDatabase) {
        dqc.c(roomDatabase, "$this$transactionDispatcher");
        Map<String, Object> backingFieldMap = roomDatabase.getBackingFieldMap();
        dqc.a((Object) backingFieldMap, "backingFieldMap");
        Object obj = backingFieldMap.get("TransactionDispatcher");
        if (obj == null) {
            Executor transactionExecutor = roomDatabase.getTransactionExecutor();
            dqc.a((Object) transactionExecutor, "transactionExecutor");
            obj = dva.a(transactionExecutor);
            backingFieldMap.put("TransactionDispatcher", obj);
        }
        if (obj != null) {
            return (dtx) obj;
        }
        throw new TypeCastException("null cannot be cast to non-null type kotlinx.coroutines.CoroutineDispatcher");
    }
}
