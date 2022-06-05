package androidx.room;

import defpackage.dnw;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\b\u0001\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0015\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u0006\u0010\u000f\u001a\u00020\u0010J\u0006\u0010\u0011\u001a\u00020\u0010R\u001a\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00000\b8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u0004\u001a\u00020\u0005X\u0080\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Landroidx/room/TransactionElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "transactionThreadControlJob", "Lkotlinx/coroutines/Job;", "transactionDispatcher", "Lkotlin/coroutines/ContinuationInterceptor;", "(Lkotlinx/coroutines/Job;Lkotlin/coroutines/ContinuationInterceptor;)V", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "referenceCount", "Ljava/util/concurrent/atomic/AtomicInteger;", "getTransactionDispatcher$room_ktx_release", "()Lkotlin/coroutines/ContinuationInterceptor;", "acquire", "", "release", "Key", "room-ktx_release"}, k = 1, mv = {1, 1, 15})
/* loaded from: classes.dex */
public final class TransactionElement implements dnw.b {
    public static final Key Key = new Key(null);
    private final AtomicInteger referenceCount = new AtomicInteger(0);
    private final dnv transactionDispatcher;
    private final dvi transactionThreadControlJob;

    public TransactionElement(dvi dviVar, dnv dnvVar) {
        dqc.c(dviVar, "transactionThreadControlJob");
        dqc.c(dnvVar, "transactionDispatcher");
        this.transactionThreadControlJob = dviVar;
        this.transactionDispatcher = dnvVar;
    }

    @Override // defpackage.dnw
    public final <R> R fold(R r, dph<? super R, ? super dnw.b, ? extends R> dphVar) {
        dqc.c(dphVar, "operation");
        return (R) dnw.b.a.a(this, r, dphVar);
    }

    @Override // defpackage.dnw.b, defpackage.dnw
    public final <E extends dnw.b> E get(dnw.c<E> cVar) {
        dqc.c(cVar, "key");
        return (E) dnw.b.a.a(this, cVar);
    }

    @Override // defpackage.dnw
    public final dnw minusKey(dnw.c<?> cVar) {
        dqc.c(cVar, "key");
        return dnw.b.a.b(this, cVar);
    }

    @Override // defpackage.dnw
    public final dnw plus(dnw dnwVar) {
        dqc.c(dnwVar, "context");
        return dnw.b.a.a(this, dnwVar);
    }

    public final dnv getTransactionDispatcher$room_ktx_release() {
        return this.transactionDispatcher;
    }

    @Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Landroidx/room/TransactionElement$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Landroidx/room/TransactionElement;", "()V", "room-ktx_release"}, k = 1, mv = {1, 1, 15})
    /* loaded from: classes.dex */
    public static final class Key implements dnw.c<TransactionElement> {
        private Key() {
        }

        public /* synthetic */ Key(dpx dpxVar) {
            this();
        }
    }

    @Override // defpackage.dnw.b
    public final dnw.c<TransactionElement> getKey() {
        return Key;
    }

    public final void acquire() {
        this.referenceCount.incrementAndGet();
    }

    public final void release() {
        int decrementAndGet = this.referenceCount.decrementAndGet();
        if (decrementAndGet >= 0) {
            if (decrementAndGet != 0) {
                return;
            }
            this.transactionThreadControlJob.a((CancellationException) null);
            return;
        }
        throw new IllegalStateException("Transaction was never started or was already released.");
    }
}
