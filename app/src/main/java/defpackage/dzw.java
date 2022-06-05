package defpackage;

import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0000\b\u0000\u0018\u00002\u00020*B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J!\u0010\u0007\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0019\u0010\t\u001a\u0004\u0018\u00010\u00032\u0006\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0010\u0010\u0011J\u0011\u0010\u0012\u001a\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u0012\u0010\u0011J\u0017\u0010\u0014\u001a\u00020\u00052\u0006\u0010\u0013\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0000¢\u0006\u0004\b\u001a\u0010\u0019J\u001f\u0010\u001c\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u001b\u001a\u00020\u0005H\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u0015\u0010\u001e\u001a\u00020\r*\u0004\u0018\u00010\u0003H\u0002¢\u0006\u0004\b\u001e\u0010\u001fR\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030 8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\"R\u0014\u0010&\u001a\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b$\u0010%R\u0014\u0010(\u001a\u00020#8@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b'\u0010%¨\u0006)"}, d2 = {"Lkotlinx/coroutines/scheduling/WorkQueue;", "<init>", "()V", "Lkotlinx/coroutines/scheduling/Task;", "task", "", "fair", "add", "(Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "addLast", "(Lkotlinx/coroutines/scheduling/Task;)Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalQueue", "", "offloadAllWorkTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)V", "poll", "()Lkotlinx/coroutines/scheduling/Task;", "pollBuffer", "queue", "pollTo", "(Lkotlinx/coroutines/scheduling/GlobalQueue;)Z", "victim", "", "tryStealBlockingFrom", "(Lkotlinx/coroutines/scheduling/WorkQueue;)J", "tryStealFrom", "blockingOnly", "tryStealLastScheduled", "(Lkotlinx/coroutines/scheduling/WorkQueue;Z)J", "decrementIfBlocking", "(Lkotlinx/coroutines/scheduling/Task;)V", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "buffer", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "", "getBufferSize$kotlinx_coroutines_core", "()I", "bufferSize", "getSize$kotlinx_coroutines_core", "size", "kotlinx-coroutines-core", ""}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dzw  reason: default package */
/* loaded from: classes2.dex */
public final class dzw {
    private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(dzw.class, Object.class, "lastScheduledTask");
    private static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(dzw.class, "producerIndex");
    private static final /* synthetic */ AtomicIntegerFieldUpdater d = AtomicIntegerFieldUpdater.newUpdater(dzw.class, "consumerIndex");
    private static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(dzw.class, "blockingTasksInBuffer");
    private final AtomicReferenceArray<dzs> a = new AtomicReferenceArray<>(128);
    private volatile /* synthetic */ Object lastScheduledTask = null;
    private volatile /* synthetic */ int producerIndex = 0;
    private volatile /* synthetic */ int consumerIndex = 0;
    private volatile /* synthetic */ int blockingTasksInBuffer = 0;

    private int c() {
        return this.producerIndex - this.consumerIndex;
    }

    public final int a() {
        return this.lastScheduledTask != null ? c() + 1 : c();
    }

    public final dzs b() {
        dzs dzsVar = (dzs) b.getAndSet(this, null);
        return dzsVar == null ? d() : dzsVar;
    }

    public final dzs a(dzs dzsVar, boolean z) {
        if (z) {
            return a(dzsVar);
        }
        dzs dzsVar2 = (dzs) b.getAndSet(this, dzsVar);
        if (dzsVar2 != null) {
            return a(dzsVar2);
        }
        return null;
    }

    public final long a(dzw dzwVar) {
        boolean z = true;
        if (dug.a()) {
            if (!(c() == 0)) {
                throw new AssertionError();
            }
        }
        dzs d2 = dzwVar.d();
        if (d2 != null) {
            dzs a = a(d2, false);
            if (!dug.a()) {
                return -1L;
            }
            if (a != null) {
                z = false;
            }
            if (!z) {
                throw new AssertionError();
            }
            return -1L;
        }
        return a(dzwVar, false);
    }

    public final long b(dzw dzwVar) {
        if (dug.a()) {
            if (!(c() == 0)) {
                throw new AssertionError();
            }
        }
        int i = dzwVar.producerIndex;
        AtomicReferenceArray<dzs> atomicReferenceArray = dzwVar.a;
        for (int i2 = dzwVar.consumerIndex; i2 != i; i2++) {
            int i3 = i2 & 127;
            if (dzwVar.blockingTasksInBuffer == 0) {
                break;
            }
            dzs dzsVar = atomicReferenceArray.get(i3);
            if (dzsVar != null) {
                if ((dzsVar.h.a() == 1) && atomicReferenceArray.compareAndSet(i3, dzsVar, null)) {
                    e.decrementAndGet(dzwVar);
                    a(dzsVar, false);
                    return -1L;
                }
            }
        }
        return a(dzwVar, true);
    }

    public final void a(dzn dznVar) {
        boolean z;
        dzs dzsVar = (dzs) b.getAndSet(this, null);
        if (dzsVar != null) {
            dznVar.a(dzsVar);
        }
        do {
            dzs d2 = d();
            if (d2 == null) {
                z = false;
                continue;
            } else {
                dznVar.a(d2);
                z = true;
                continue;
            }
        } while (z);
    }

    private final long a(dzw dzwVar, boolean z) {
        dzs dzsVar;
        do {
            dzsVar = (dzs) dzwVar.lastScheduledTask;
            if (dzsVar == null) {
                return -2L;
            }
            if (z) {
                boolean z2 = true;
                if (dzsVar.h.a() != 1) {
                    z2 = false;
                }
                if (!z2) {
                    return -2L;
                }
            }
            long a = dzv.f.a() - dzsVar.g;
            if (a < dzv.a) {
                return dzv.a - a;
            }
        } while (!b.compareAndSet(dzwVar, dzsVar, null));
        a(dzsVar, false);
        return -1L;
    }

    private final dzs d() {
        dzs andSet;
        while (true) {
            int i = this.consumerIndex;
            if (i - this.producerIndex == 0) {
                return null;
            }
            int i2 = i & 127;
            if (d.compareAndSet(this, i, i + 1) && (andSet = this.a.getAndSet(i2, null)) != null) {
                b(andSet);
                return andSet;
            }
        }
    }

    private final dzs a(dzs dzsVar) {
        boolean z = true;
        if (dzsVar.h.a() != 1) {
            z = false;
        }
        if (z) {
            e.incrementAndGet(this);
        }
        if (c() == 127) {
            return dzsVar;
        }
        int i = this.producerIndex & 127;
        while (this.a.get(i) != null) {
            Thread.yield();
        }
        this.a.lazySet(i, dzsVar);
        c.incrementAndGet(this);
        return null;
    }

    private final void b(dzs dzsVar) {
        if (dzsVar != null) {
            boolean z = false;
            if (!(dzsVar.h.a() == 1)) {
                return;
            }
            int decrementAndGet = e.decrementAndGet(this);
            if (!dug.a()) {
                return;
            }
            if (decrementAndGet >= 0) {
                z = true;
            }
            if (!z) {
                throw new AssertionError();
            }
        }
    }
}
