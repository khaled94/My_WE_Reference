package defpackage;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.Callable;
import java.util.concurrent.FutureTask;
import java.util.concurrent.atomic.AtomicLong;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bqj  reason: default package */
/* loaded from: classes2.dex */
public final class bqj<V> extends FutureTask<V> implements Comparable<bqj> {
    final boolean a;
    private final long b;
    private final String c;
    private final /* synthetic */ bqe d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqj(bqe bqeVar, Callable<V> callable, boolean z, String str) {
        super(callable);
        AtomicLong atomicLong;
        this.d = bqeVar;
        aat.a(str);
        atomicLong = bqe.j;
        long andIncrement = atomicLong.getAndIncrement();
        this.b = andIncrement;
        this.c = str;
        this.a = z;
        if (andIncrement == LocationRequestCompat.PASSIVE_INTERVAL) {
            bqeVar.q().c.a("Tasks index overflow");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public bqj(bqe bqeVar, Runnable runnable, String str) {
        super(runnable, null);
        AtomicLong atomicLong;
        this.d = bqeVar;
        aat.a(str);
        atomicLong = bqe.j;
        long andIncrement = atomicLong.getAndIncrement();
        this.b = andIncrement;
        this.c = str;
        this.a = false;
        if (andIncrement == LocationRequestCompat.PASSIVE_INTERVAL) {
            bqeVar.q().c.a("Tasks index overflow");
        }
    }

    @Override // java.util.concurrent.FutureTask
    protected final void setException(Throwable th) {
        this.d.q().c.a(this.c, th);
        if (th instanceof bqh) {
            Thread.getDefaultUncaughtExceptionHandler().uncaughtException(Thread.currentThread(), th);
        }
        super.setException(th);
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(bqj bqjVar) {
        bqj bqjVar2 = bqjVar;
        boolean z = this.a;
        if (z != bqjVar2.a) {
            return z ? -1 : 1;
        }
        long j = this.b;
        long j2 = bqjVar2.b;
        if (j < j2) {
            return -1;
        }
        if (j > j2) {
            return 1;
        }
        this.d.q().d.a("Two tasks share the same index. index", Long.valueOf(this.b));
        return 0;
    }
}
