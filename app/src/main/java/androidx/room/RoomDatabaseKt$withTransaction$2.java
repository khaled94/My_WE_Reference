package androidx.room;

import defpackage.dnw;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u0002H\u008a@¢\u0006\u0004\b\u0003\u0010\u0004"}, d2 = {"<anonymous>", "R", "Lkotlinx/coroutines/CoroutineScope;", "invoke", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;"}, k = 3, mv = {1, 1, 15})
@dog(b = "RoomDatabase.kt", c = {58}, d = "invokeSuspend", e = "androidx.room.RoomDatabaseKt$withTransaction$2")
/* loaded from: classes.dex */
final class RoomDatabaseKt$withTransaction$2 extends dol implements dph<duc, dnu<? super R>, Object> {
    final /* synthetic */ dow $block;
    final /* synthetic */ RoomDatabase $this_withTransaction;
    Object L$0;
    Object L$1;
    int label;
    private duc p$;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public RoomDatabaseKt$withTransaction$2(RoomDatabase roomDatabase, dow dowVar, dnu dnuVar) {
        super(2, dnuVar);
        this.$this_withTransaction = roomDatabase;
        this.$block = dowVar;
    }

    @Override // defpackage.doc
    public final dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        dqc.c(dnuVar, "completion");
        RoomDatabaseKt$withTransaction$2 roomDatabaseKt$withTransaction$2 = new RoomDatabaseKt$withTransaction$2(this.$this_withTransaction, this.$block, dnuVar);
        roomDatabaseKt$withTransaction$2.p$ = (duc) obj;
        return roomDatabaseKt$withTransaction$2;
    }

    @Override // defpackage.dph
    public final Object invoke(duc ducVar, Object obj) {
        return ((RoomDatabaseKt$withTransaction$2) create(ducVar, (dnu) obj)).invokeSuspend(dmg.a);
    }

    @Override // defpackage.doc
    public final Object invokeSuspend(Object obj) {
        TransactionElement transactionElement;
        TransactionElement transactionElement2;
        dny dnyVar = dny.COROUTINE_SUSPENDED;
        int i = this.label;
        if (i == 0) {
            duc ducVar = this.p$;
            dnw.b bVar = ducVar.getCoroutineContext().get(TransactionElement.Key);
            if (bVar == null) {
                dqc.a();
            }
            transactionElement2 = (TransactionElement) bVar;
            transactionElement2.acquire();
            try {
                this.$this_withTransaction.beginTransaction();
                try {
                    dow dowVar = this.$block;
                    this.L$0 = ducVar;
                    this.L$1 = transactionElement2;
                    this.label = 1;
                    obj = dowVar.invoke(this);
                    if (obj == dnyVar) {
                        return dnyVar;
                    }
                    transactionElement = transactionElement2;
                } catch (Throwable th) {
                    th = th;
                    this.$this_withTransaction.endTransaction();
                    throw th;
                }
            } catch (Throwable th2) {
                th = th2;
                transactionElement2.release();
                throw th;
            }
        } else if (i != 1) {
            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
        } else {
            transactionElement = (TransactionElement) this.L$1;
        }
        try {
            this.$this_withTransaction.setTransactionSuccessful();
            try {
                this.$this_withTransaction.endTransaction();
                transactionElement.release();
                return obj;
            } catch (Throwable th3) {
                th = th3;
                transactionElement2 = transactionElement;
                transactionElement2.release();
                throw th;
            }
        } catch (Throwable th4) {
            th = th4;
            transactionElement2 = transactionElement;
            this.$this_withTransaction.endTransaction();
            throw th;
        }
    }
}
