package defpackage;

import androidx.core.location.LocationRequestCompat;
import java.util.Arrays;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000Z\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b \u0018\u00002\u0002092\u00020::\u00044567B\u0007¢\u0006\u0004\b\u0001\u0010\u0002J\u000f\u0010\u0004\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0004\u0010\u0002J\u0017\u0010\u0007\u001a\n\u0018\u00010\u0005j\u0004\u0018\u0001`\u0006H\u0002¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\f\u001a\u00020\u00032\u0006\u0010\n\u001a\u00020\t2\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u000f\u001a\u00020\u00032\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006¢\u0006\u0004\b\u000f\u0010\u0010J\u001b\u0010\u0012\u001a\u00020\u00112\n\u0010\u000e\u001a\u00060\u0005j\u0002`\u0006H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\u0017\u0010\u0002J\u000f\u0010\u0018\u001a\u00020\u0003H\u0004¢\u0006\u0004\b\u0018\u0010\u0002J\u001d\u0010\u001c\u001a\u00020\u00032\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001a¢\u0006\u0004\b\u001c\u0010\u001dJ\u001f\u0010\u001f\u001a\u00020\u001e2\u0006\u0010\u0019\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u001aH\u0002¢\u0006\u0004\b\u001f\u0010 J#\u0010#\u001a\u00020\"2\u0006\u0010!\u001a\u00020\u00142\n\u0010\u000b\u001a\u00060\u0005j\u0002`\u0006H\u0004¢\u0006\u0004\b#\u0010$J%\u0010'\u001a\u00020\u00032\u0006\u0010!\u001a\u00020\u00142\f\u0010&\u001a\b\u0012\u0004\u0012\u00020\u00030%H\u0016¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\u001aH\u0002¢\u0006\u0004\b)\u0010*J\u000f\u0010+\u001a\u00020\u0003H\u0014¢\u0006\u0004\b+\u0010\u0002R$\u0010-\u001a\u00020\u00112\u0006\u0010,\u001a\u00020\u00118B@BX\u0082\u000e¢\u0006\f\u001a\u0004\b-\u0010.\"\u0004\b/\u00100R\u0014\u00101\u001a\u00020\u00118TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b1\u0010.R\u0014\u00103\u001a\u00020\u00148TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b2\u0010\u0016¨\u00068"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase;", "<init>", "()V", "", "closeQueue", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dequeue", "()Ljava/lang/Runnable;", "Lkotlin/coroutines/CoroutineContext;", "context", "block", "dispatch", "(Lkotlin/coroutines/CoroutineContext;Ljava/lang/Runnable;)V", "task", "enqueue", "(Ljava/lang/Runnable;)V", "", "enqueueImpl", "(Ljava/lang/Runnable;)Z", "", "processNextEvent", "()J", "rescheduleAllDelayed", "resetAll", "now", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "delayedTask", "schedule", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)V", "", "scheduleImpl", "(JLkotlinx/coroutines/EventLoopImplBase$DelayedTask;)I", "timeMillis", "Lkotlinx/coroutines/DisposableHandle;", "scheduleInvokeOnTimeout", "(JLjava/lang/Runnable;)Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/CancellableContinuation;", "continuation", "scheduleResumeAfterDelay", "(JLkotlinx/coroutines/CancellableContinuation;)V", "shouldUnpark", "(Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;)Z", "shutdown", "value", "isCompleted", "()Z", "setCompleted", "(Z)V", "isEmpty", "getNextTime", "nextTime", "DelayedResumeTask", "DelayedRunnableTask", "DelayedTask", "DelayedTaskQueue", "kotlinx-coroutines-core", "Lkotlinx/coroutines/EventLoopImplPlatform;", "Lkotlinx/coroutines/Delay;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: duu  reason: default package */
/* loaded from: classes2.dex */
public abstract class duu extends duv implements duk {
    private static final /* synthetic */ AtomicReferenceFieldUpdater b = AtomicReferenceFieldUpdater.newUpdater(duu.class, Object.class, "_queue");
    private static final /* synthetic */ AtomicReferenceFieldUpdater c = AtomicReferenceFieldUpdater.newUpdater(duu.class, Object.class, "_delayed");
    volatile /* synthetic */ Object _queue = null;
    volatile /* synthetic */ Object _delayed = null;
    private volatile /* synthetic */ int _isCompleted = 0;

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.dut
    public final boolean c() {
        dyy dyyVar;
        if (!g()) {
            return false;
        }
        c cVar = (c) this._delayed;
        if (cVar != null && !cVar.a()) {
            return false;
        }
        Object obj = this._queue;
        if (obj == null) {
            return true;
        }
        if (obj instanceof dyp) {
            return ((dyp) obj).a();
        }
        dyyVar = duw.b;
        return obj == dyyVar;
    }

    @Override // defpackage.dut
    protected final long d() {
        dyy dyyVar;
        if (super.d() == 0) {
            return 0L;
        }
        Object obj = this._queue;
        if (obj != null) {
            if (!(obj instanceof dyp)) {
                dyyVar = duw.b;
                if (obj != dyyVar) {
                    return 0L;
                }
                return LocationRequestCompat.PASSIVE_INTERVAL;
            } else if (!((dyp) obj).a()) {
                return 0L;
            }
        }
        c cVar = (c) this._delayed;
        b b2 = cVar == null ? null : cVar.b();
        if (b2 == null) {
            return LocationRequestCompat.PASSIVE_INTERVAL;
        }
        long j = b2.b;
        dsu dsuVar = dsv.a;
        long nanoTime = j - (dsuVar == null ? System.nanoTime() : dsuVar.a());
        if (nanoTime >= 0) {
            return nanoTime;
        }
        return 0L;
    }

    @Override // defpackage.dut
    protected final void h() {
        dyy dyyVar;
        dyy dyyVar2;
        dwc dwcVar = dwc.a;
        dwc.c();
        this._isCompleted = 1;
        if (!dug.a() || this._isCompleted != 0) {
            while (true) {
                Object obj = this._queue;
                if (obj == null) {
                    AtomicReferenceFieldUpdater atomicReferenceFieldUpdater = b;
                    dyyVar = duw.b;
                    if (atomicReferenceFieldUpdater.compareAndSet(this, null, dyyVar)) {
                        break;
                    }
                } else if (!(obj instanceof dyp)) {
                    dyyVar2 = duw.b;
                    if (obj == dyyVar2) {
                        break;
                    }
                    dyp dypVar = new dyp(8, true);
                    if (obj != null) {
                        dypVar.a((dyp) ((Runnable) obj));
                        if (b.compareAndSet(this, obj, dypVar)) {
                            break;
                        }
                    } else {
                        throw new NullPointerException("null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                    }
                } else {
                    ((dyp) obj).b();
                    break;
                }
            }
            do {
            } while (b() <= 0);
            j();
            return;
        }
        throw new AssertionError();
    }

    @Override // defpackage.duk
    public final void a(long j, dtf<? super dmg> dtfVar) {
        long a2 = duw.a(j);
        if (a2 < 4611686018427387903L) {
            dsu dsuVar = dsv.a;
            long nanoTime = dsuVar == null ? System.nanoTime() : dsuVar.a();
            a aVar = new a(a2 + nanoTime, dtfVar);
            dti.a(dtfVar, aVar);
            a(nanoTime, aVar);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x0099 A[EDGE_INSN: B:64:0x0099->B:51:0x0099 ?: BREAK  , SYNTHETIC] */
    @Override // defpackage.dut
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final long b() {
        /*
            r12 = this;
            boolean r0 = r12.e()
            r1 = 0
            if (r0 == 0) goto L9
            return r1
        L9:
            java.lang.Object r0 = r12._delayed
            duu$c r0 = (defpackage.duu.c) r0
            r3 = 0
            if (r0 == 0) goto L59
            boolean r4 = r0.a()
            if (r4 != 0) goto L59
            dsu r4 = defpackage.dsv.a
            if (r4 != 0) goto L1f
            long r4 = java.lang.System.nanoTime()
            goto L23
        L1f:
            long r4 = r4.a()
        L23:
            r6 = r0
            dzf r6 = (defpackage.dzf) r6
            monitor-enter(r6)
            dzg r7 = r6.d()     // Catch: java.lang.Throwable -> L56
            if (r7 != 0) goto L30
            monitor-exit(r6)
            r7 = r3
            goto L51
        L30:
            duu$b r7 = (defpackage.duu.b) r7     // Catch: java.lang.Throwable -> L56
            long r8 = r7.b     // Catch: java.lang.Throwable -> L56
            long r8 = r4 - r8
            r10 = 0
            int r11 = (r8 > r1 ? 1 : (r8 == r1 ? 0 : -1))
            if (r11 < 0) goto L3d
            r8 = 1
            goto L3e
        L3d:
            r8 = 0
        L3e:
            if (r8 == 0) goto L47
            java.lang.Runnable r7 = (java.lang.Runnable) r7     // Catch: java.lang.Throwable -> L56
            boolean r7 = r12.b(r7)     // Catch: java.lang.Throwable -> L56
            goto L48
        L47:
            r7 = 0
        L48:
            if (r7 == 0) goto L4f
            dzg r7 = r6.a(r10)     // Catch: java.lang.Throwable -> L56
            goto L50
        L4f:
            r7 = r3
        L50:
            monitor-exit(r6)
        L51:
            duu$b r7 = (defpackage.duu.b) r7
            if (r7 != 0) goto L23
            goto L59
        L56:
            r0 = move-exception
            monitor-exit(r6)
            throw r0
        L59:
            java.lang.Object r0 = r12._queue
            if (r0 != 0) goto L5e
            goto L99
        L5e:
            boolean r4 = r0 instanceof defpackage.dyp
            if (r4 == 0) goto L85
            if (r0 == 0) goto L7d
            r4 = r0
            dyp r4 = (defpackage.dyp) r4
            java.lang.Object r5 = r4.c()
            dyy r6 = defpackage.dyp.b
            if (r5 == r6) goto L73
            r3 = r5
            java.lang.Runnable r3 = (java.lang.Runnable) r3
            goto L99
        L73:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r5 = defpackage.duu.b
            dyp r4 = r4.d()
            r5.compareAndSet(r12, r0, r4)
            goto L59
        L7d:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }"
            r0.<init>(r1)
            throw r0
        L85:
            dyy r4 = defpackage.duw.a()
            if (r0 != r4) goto L8c
            goto L99
        L8c:
            java.util.concurrent.atomic.AtomicReferenceFieldUpdater r4 = defpackage.duu.b
            boolean r4 = r4.compareAndSet(r12, r0, r3)
            if (r4 == 0) goto L59
            if (r0 == 0) goto La4
            r3 = r0
            java.lang.Runnable r3 = (java.lang.Runnable) r3
        L99:
            if (r3 == 0) goto L9f
            r3.run()
            return r1
        L9f:
            long r0 = r12.d()
            return r0
        La4:
            java.lang.NullPointerException r0 = new java.lang.NullPointerException
            java.lang.String r1 = "null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }"
            r0.<init>(r1)
            throw r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.duu.b():long");
    }

    @Override // defpackage.dtx
    public final void dispatch(dnw dnwVar, Runnable runnable) {
        a(runnable);
    }

    public final void a(Runnable runnable) {
        duu duuVar = this;
        while (!duuVar.b(runnable)) {
            duuVar = dui.b;
        }
        duuVar.i();
    }

    public final void a(long j, b bVar) {
        int c2 = c(j, bVar);
        if (c2 == 0) {
            if (!a(bVar)) {
                return;
            }
            i();
        } else if (c2 == 1) {
            b(j, bVar);
        } else if (c2 != 2) {
            throw new IllegalStateException("unexpected result".toString());
        }
    }

    private final boolean a(b bVar) {
        c cVar = (c) this._delayed;
        return (cVar == null ? null : cVar.b()) == bVar;
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\b \u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u00032\u00020\u00042\u00020\u0005B\r\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bJ\u0011\u0010\u0018\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u0000H\u0096\u0002J\u0006\u0010\u001a\u001a\u00020\u001bJ\u001e\u0010\u001c\u001a\u00020\u00132\u0006\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u001e\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020!J\u000e\u0010\"\u001a\u00020#2\u0006\u0010\u001d\u001a\u00020\u0007J\b\u0010$\u001a\u00020%H\u0016R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000R0\u0010\r\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f2\f\u0010\u000b\u001a\b\u0012\u0002\b\u0003\u0018\u00010\f8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0012\u001a\u00020\u0013X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0014\u0010\u0015\"\u0004\b\u0016\u0010\u0017R\u0012\u0010\u0006\u001a\u00020\u00078\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006&"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "", "Lkotlinx/coroutines/DisposableHandle;", "Lkotlinx/coroutines/internal/ThreadSafeHeapNode;", "nanoTime", "", "(J)V", "_heap", "", "value", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "heap", "getHeap", "()Lkotlinx/coroutines/internal/ThreadSafeHeap;", "setHeap", "(Lkotlinx/coroutines/internal/ThreadSafeHeap;)V", "index", "", "getIndex", "()I", "setIndex", "(I)V", "compareTo", "other", "dispose", "", "scheduleTask", "now", "delayed", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "eventLoop", "Lkotlinx/coroutines/EventLoopImplBase;", "timeToExecute", "", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: duu$b */
    /* loaded from: classes2.dex */
    public static abstract class b implements duq, dzg, Comparable<b>, Runnable {
        private Object a;
        public long b;
        private int c = -1;

        public b(long j) {
            this.b = j;
        }

        @Override // java.lang.Comparable
        public /* bridge */ /* synthetic */ int compareTo(b bVar) {
            int i = ((this.b - bVar.b) > 0L ? 1 : ((this.b - bVar.b) == 0L ? 0 : -1));
            if (i > 0) {
                return 1;
            }
            return i < 0 ? -1 : 0;
        }

        @Override // defpackage.dzg
        public final dzf<?> a() {
            Object obj = this.a;
            if (obj instanceof dzf) {
                return (dzf) obj;
            }
            return null;
        }

        @Override // defpackage.dzg
        public final void a(dzf<?> dzfVar) {
            dyy dyyVar;
            Object obj = this.a;
            dyyVar = duw.a;
            if (!(obj != dyyVar)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            this.a = dzfVar;
        }

        @Override // defpackage.dzg
        public final void a(int i) {
            this.c = i;
        }

        @Override // defpackage.dzg
        public final int b() {
            return this.c;
        }

        /* JADX WARN: Type inference failed for: r12v6, types: [dzg[], T extends dzg & java.lang.Comparable<? super T>[]] */
        /* JADX WARN: Type inference failed for: r14v9, types: [dzg[], T extends dzg & java.lang.Comparable<? super T>[]] */
        public final synchronized int a(long j, c cVar, duu duuVar) {
            dyy dyyVar;
            dzg[] dzgVarArr;
            Object obj = this.a;
            dyyVar = duw.a;
            if (obj == dyyVar) {
                return 2;
            }
            c cVar2 = cVar;
            synchronized (cVar2) {
                b d = cVar2.d();
                boolean z = true;
                if (duuVar._isCompleted) {
                    return 1;
                }
                if (d == null) {
                    cVar.a = j;
                } else {
                    long j2 = d.b;
                    if (j2 - j < 0) {
                        j = j2;
                    }
                    if (j - cVar.a > 0) {
                        cVar.a = j;
                    }
                }
                if (this.b - cVar.a < 0) {
                    this.b = cVar.a;
                }
                b bVar = this;
                if (dug.a()) {
                    if (bVar.a() != null) {
                        z = false;
                    }
                    if (!z) {
                        throw new AssertionError();
                    }
                }
                bVar.a(cVar2);
                dzg[] dzgVarArr2 = cVar2.b;
                if (dzgVarArr2 == null) {
                    ?? r12 = new dzg[4];
                    cVar2.b = r12;
                    dzgVarArr = r12;
                } else {
                    int i = cVar2._size;
                    int length = dzgVarArr2.length;
                    dzgVarArr = dzgVarArr2;
                    if (i >= length) {
                        Object[] copyOf = Arrays.copyOf(dzgVarArr2, cVar2._size * 2);
                        dqc.b(copyOf, "java.util.Arrays.copyOf(this, newSize)");
                        cVar2.b = (dzg[]) copyOf;
                        dzgVarArr = (dzg[]) copyOf;
                    }
                }
                int i2 = cVar2._size;
                cVar2._size = i2 + 1;
                dzgVarArr[i2] = bVar;
                bVar.a(i2);
                cVar2.b(i2);
                return 0;
            }
        }

        @Override // defpackage.duq
        public final synchronized void dispose() {
            dyy dyyVar;
            dyy dyyVar2;
            Object obj = this.a;
            dyyVar = duw.a;
            if (obj == dyyVar) {
                return;
            }
            c cVar = obj instanceof c ? (c) obj : null;
            if (cVar != null) {
                cVar.a((c) this);
            }
            dyyVar2 = duw.a;
            this.a = dyyVar2;
        }

        public String toString() {
            return "Delayed[nanos=" + this.b + ']';
        }
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0004\u0018\u00002\u00020\u0001B\u001b\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0002\u0010\u0007J\b\u0010\b\u001a\u00020\u0006H\u0016J\b\u0010\t\u001a\u00020\nH\u0016R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedResumeTask;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "nanoTime", "", "cont", "Lkotlinx/coroutines/CancellableContinuation;", "", "(Lkotlinx/coroutines/EventLoopImplBase;JLkotlinx/coroutines/CancellableContinuation;)V", "run", "toString", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: duu$a */
    /* loaded from: classes2.dex */
    final class a extends b {
        private final dtf<dmg> c;

        /* JADX WARN: Multi-variable type inference failed */
        public a(long j, dtf<? super dmg> dtfVar) {
            super(j);
            this.c = dtfVar;
        }

        @Override // java.lang.Runnable
        public final void run() {
            this.c.a((dtx) duu.this, (duu) dmg.a);
        }

        @Override // defpackage.duu.b
        public final String toString() {
            return dqc.a(super.toString(), (Object) this.c);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005R\u0012\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lkotlinx/coroutines/EventLoopImplBase$DelayedTaskQueue;", "Lkotlinx/coroutines/internal/ThreadSafeHeap;", "Lkotlinx/coroutines/EventLoopImplBase$DelayedTask;", "timeNow", "", "(J)V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: duu$c */
    /* loaded from: classes2.dex */
    public static final class c extends dzf<b> {
        public long a;

        public c(long j) {
            this.a = j;
        }
    }

    private final boolean b(Runnable runnable) {
        dyy dyyVar;
        while (true) {
            Object obj = this._queue;
            if (this._isCompleted != 0) {
                return false;
            }
            if (obj == null) {
                if (b.compareAndSet(this, null, runnable)) {
                    return true;
                }
            } else if (!(obj instanceof dyp)) {
                dyyVar = duw.b;
                if (obj == dyyVar) {
                    return false;
                }
                dyp dypVar = new dyp(8, true);
                if (obj != null) {
                    dypVar.a((dyp) ((Runnable) obj));
                    dypVar.a((dyp) runnable);
                    if (b.compareAndSet(this, obj, dypVar)) {
                        return true;
                    }
                } else {
                    throw new NullPointerException("null cannot be cast to non-null type java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }");
                }
            } else if (obj != null) {
                dyp dypVar2 = (dyp) obj;
                int a2 = dypVar2.a((dyp) runnable);
                if (a2 == 0) {
                    return true;
                }
                if (a2 == 1) {
                    b.compareAndSet(this, obj, dypVar2.d());
                } else if (a2 == 2) {
                    return false;
                }
            } else {
                throw new NullPointerException("null cannot be cast to non-null type kotlinx.coroutines.internal.LockFreeTaskQueueCore<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }>{ kotlinx.coroutines.EventLoop_commonKt.Queue<java.lang.Runnable{ kotlinx.coroutines.RunnableKt.Runnable }> }");
            }
        }
    }

    private final int c(long j, b bVar) {
        if (this._isCompleted != 0) {
            return 1;
        }
        c cVar = (c) this._delayed;
        if (cVar == null) {
            duu duuVar = this;
            c.compareAndSet(duuVar, null, new c(j));
            Object obj = duuVar._delayed;
            dqc.a(obj);
            cVar = (c) obj;
        }
        return bVar.a(j, cVar, this);
    }

    private final void j() {
        dsu dsuVar = dsv.a;
        long nanoTime = dsuVar == null ? System.nanoTime() : dsuVar.a();
        while (true) {
            c cVar = (c) this._delayed;
            b c2 = cVar == null ? null : cVar.c();
            if (c2 != null) {
                b(nanoTime, c2);
            } else {
                return;
            }
        }
    }
}
