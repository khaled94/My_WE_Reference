package defpackage;

import androidx.core.location.LocationRequestCompat;
import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0002\u0018\u0000*\u0004\b\u0000\u0010\u00012\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u0012\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0014J\u000b\u0010\u0011\u001a\u00028\u0000¢\u0006\u0002\u0010\u0012R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\n\u001a\u00020\u000b8TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\f¨\u0006\u0013"}, d2 = {"Lkotlinx/coroutines/BlockingCoroutine;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/AbstractCoroutine;", "parentContext", "Lkotlin/coroutines/CoroutineContext;", "blockedThread", "Ljava/lang/Thread;", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Thread;Lkotlinx/coroutines/EventLoop;)V", "isScopedCoroutine", "", "()Z", "afterCompletion", "", "state", "", "joinBlocking", "()Ljava/lang/Object;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dsy  reason: default package */
/* loaded from: classes2.dex */
public final class dsy<T> extends dst<T> {
    private final Thread a;
    private final dut d;

    @Override // defpackage.dvo
    protected final boolean e() {
        return true;
    }

    public dsy(dnw dnwVar, Thread thread, dut dutVar) {
        super(dnwVar, true);
        this.a = thread;
        this.d = dutVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dvo
    public final void c(Object obj) {
        if (!dqc.a(Thread.currentThread(), this.a)) {
            Thread thread = this.a;
            if (dsv.a != null) {
                return;
            }
            LockSupport.unpark(thread);
        }
    }

    public final T u_() {
        dut dutVar = this.d;
        if (dutVar != null) {
            dutVar.a(false);
        }
        while (!Thread.interrupted()) {
            dut dutVar2 = this.d;
            long b = dutVar2 == null ? LocationRequestCompat.PASSIVE_INTERVAL : dutVar2.b();
            if (j()) {
                dut dutVar3 = this.d;
                if (dutVar3 != null) {
                    dutVar3.b(false);
                }
                T t = (T) dvp.b(i());
                dtr dtrVar = t instanceof dtr ? (dtr) t : null;
                if (dtrVar != null) {
                    throw dtrVar.a;
                }
                return t;
            } else if (dsv.a == null) {
                LockSupport.parkNanos(this, b);
            }
        }
        InterruptedException interruptedException = new InterruptedException();
        d((Throwable) interruptedException);
        throw interruptedException;
    }
}
