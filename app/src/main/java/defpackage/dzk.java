package defpackage;

import androidx.core.location.LocationRequestCompat;
import defpackage.dqs;
import java.io.Closeable;
import java.util.ArrayList;
import java.util.concurrent.Executor;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicLongFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceArray;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b-\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0000\u0018\u0000 X2\u00020\\2\u00020]:\u0003XYZB+\u0012\u0006\u0010\u0002\u001a\u00020\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0001\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\nH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u0010\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0086\b¢\u0006\u0004\b\u0010\u0010\u0011J\u0018\u0010\u0012\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u0012\u0010\u0011J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J!\u0010\u001d\u001a\u00020\n2\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0018\u0010\u001f\u001a\u00020\u00012\u0006\u0010\u000f\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b\u001f\u0010\u0011J\u0015\u0010!\u001a\b\u0018\u00010 R\u00020\u0000H\u0002¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0013H\u0082\b¢\u0006\u0004\b#\u0010\u0015J\u0010\u0010$\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\b$\u0010\u0017J-\u0010&\u001a\u00020\u00132\n\u0010\u001a\u001a\u00060\u0018j\u0002`\u00192\b\b\u0002\u0010\u001c\u001a\u00020\u001b2\b\b\u0002\u0010%\u001a\u00020\f¢\u0006\u0004\b&\u0010'J\u001b\u0010)\u001a\u00020\u00132\n\u0010(\u001a\u00060\u0018j\u0002`\u0019H\u0016¢\u0006\u0004\b)\u0010*J\u0010\u0010+\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b+\u0010,J\u0010\u0010-\u001a\u00020\u0001H\u0082\b¢\u0006\u0004\b-\u0010\u0017J\u001b\u0010/\u001a\u00020\u00012\n\u0010.\u001a\u00060 R\u00020\u0000H\u0002¢\u0006\u0004\b/\u00100J\u0015\u00101\u001a\b\u0018\u00010 R\u00020\u0000H\u0002¢\u0006\u0004\b1\u0010\"J\u0019\u00102\u001a\u00020\f2\n\u0010.\u001a\u00060 R\u00020\u0000¢\u0006\u0004\b2\u00103J)\u00106\u001a\u00020\u00132\n\u0010.\u001a\u00060 R\u00020\u00002\u0006\u00104\u001a\u00020\u00012\u0006\u00105\u001a\u00020\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0004H\u0082\b¢\u0006\u0004\b8\u0010,J\u0015\u00109\u001a\u00020\u00132\u0006\u0010\u000b\u001a\u00020\n¢\u0006\u0004\b9\u0010:J\u0015\u0010<\u001a\u00020\u00132\u0006\u0010;\u001a\u00020\u0004¢\u0006\u0004\b<\u0010=J\u0017\u0010?\u001a\u00020\u00132\u0006\u0010>\u001a\u00020\fH\u0002¢\u0006\u0004\b?\u0010@J\r\u0010A\u001a\u00020\u0013¢\u0006\u0004\bA\u0010\u0015J\u000f\u0010B\u001a\u00020\u0006H\u0016¢\u0006\u0004\bB\u0010CJ\u0010\u0010D\u001a\u00020\fH\u0082\b¢\u0006\u0004\bD\u0010EJ\u0019\u0010F\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u0004H\u0002¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\fH\u0002¢\u0006\u0004\bH\u0010EJ+\u0010I\u001a\u0004\u0018\u00010\n*\b\u0018\u00010 R\u00020\u00002\u0006\u0010\u000b\u001a\u00020\n2\u0006\u0010%\u001a\u00020\fH\u0002¢\u0006\u0004\bI\u0010JR\u0015\u0010\u0010\u001a\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bK\u0010\u0017R\u0014\u0010\u0002\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0002\u0010LR\u0015\u0010\u001f\u001a\u00020\u00018Â\u0002X\u0082\u0004¢\u0006\u0006\u001a\u0004\bM\u0010\u0017R\u0014\u0010O\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020N8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010RR\u0011\u0010S\u001a\u00020\f8F¢\u0006\u0006\u001a\u0004\bS\u0010ER\u0014\u0010\u0003\u001a\u00020\u00018\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010LR\u0014\u0010\u0007\u001a\u00020\u00068\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010TR \u0010V\u001a\u000e\u0012\n\u0012\b\u0018\u00010 R\u00020\u00000U8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\bV\u0010W¨\u0006["}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "", "corePoolSize", "maxPoolSize", "", "idleWorkerKeepAliveNs", "", "schedulerName", "<init>", "(IIJLjava/lang/String;)V", "Lkotlinx/coroutines/scheduling/Task;", "task", "", "addToGlobalQueue", "(Lkotlinx/coroutines/scheduling/Task;)Z", "state", "availableCpuPermits", "(J)I", "blockingTasks", "", "close", "()V", "createNewWorker", "()I", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "block", "Lkotlinx/coroutines/scheduling/TaskContext;", "taskContext", "createTask", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;)Lkotlinx/coroutines/scheduling/Task;", "createdWorkers", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "currentWorker", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "decrementBlockingTasks", "decrementCreatedWorkers", "tailDispatch", "dispatch", "(Ljava/lang/Runnable;Lkotlinx/coroutines/scheduling/TaskContext;Z)V", "command", "execute", "(Ljava/lang/Runnable;)V", "incrementBlockingTasks", "()J", "incrementCreatedWorkers", "worker", "parkedWorkersStackNextIndex", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)I", "parkedWorkersStackPop", "parkedWorkersStackPush", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;)Z", "oldIndex", "newIndex", "parkedWorkersStackTopUpdate", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;II)V", "releaseCpuPermit", "runSafely", "(Lkotlinx/coroutines/scheduling/Task;)V", "timeout", "shutdown", "(J)V", "skipUnpark", "signalBlockingWork", "(Z)V", "signalCpuWork", "toString", "()Ljava/lang/String;", "tryAcquireCpuPermit", "()Z", "tryCreateWorker", "(J)Z", "tryUnpark", "submitToLocalQueue", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;Lkotlinx/coroutines/scheduling/Task;Z)Lkotlinx/coroutines/scheduling/Task;", "getAvailableCpuPermits", "I", "getCreatedWorkers", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalBlockingQueue", "Lkotlinx/coroutines/scheduling/GlobalQueue;", "globalCpuQueue", "J", "isTerminated", "Ljava/lang/String;", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "workers", "Ljava/util/concurrent/atomic/AtomicReferenceArray;", "Companion", "Worker", "WorkerState", "kotlinx-coroutines-core", "Ljava/util/concurrent/Executor;", "Ljava/io/Closeable;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dzk  reason: default package */
/* loaded from: classes2.dex */
public final class dzk implements Closeable, Executor {
    volatile /* synthetic */ int _isTerminated;
    public final int b;
    public final int c;
    volatile /* synthetic */ long controlState;
    public final long d;
    public final String e;
    public final dzn f;
    public final dzn g;
    public final AtomicReferenceArray<c> i;
    volatile /* synthetic */ long parkedWorkersStack;
    public static final a a = new a((byte) 0);
    public static final dyy k = new dyy("NOT_IN_STACK");
    static final /* synthetic */ AtomicLongFieldUpdater h = AtomicLongFieldUpdater.newUpdater(dzk.class, "parkedWorkersStack");
    static final /* synthetic */ AtomicLongFieldUpdater j = AtomicLongFieldUpdater.newUpdater(dzk.class, "controlState");
    private static final /* synthetic */ AtomicIntegerFieldUpdater l = AtomicIntegerFieldUpdater.newUpdater(dzk.class, "_isTerminated");

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dzk$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[d.a().length];
            iArr[d.c - 1] = 1;
            iArr[d.b - 1] = 2;
            iArr[d.a - 1] = 3;
            iArr[d.d - 1] = 4;
            iArr[d.e - 1] = 5;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002j\u0002\b\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "", "(Ljava/lang/String;I)V", "CPU_ACQUIRED", "BLOCKING", "PARKING", "DORMANT", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dzk$d */
    /* loaded from: classes2.dex */
    public static final class d extends Enum<d> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        public static final int d = 4;
        public static final int e = 5;
        private static final /* synthetic */ int[] f = {1, 2, 3, 4, 5};

        public static int[] a() {
            return (int[]) f.clone();
        }
    }

    public dzk(int i, int i2, long j2, String str) {
        this.b = i;
        this.c = i2;
        this.d = j2;
        this.e = str;
        if (!(i > 0)) {
            throw new IllegalArgumentException(("Core pool size " + this.b + " should be at least 1").toString());
        }
        if (!(this.c >= this.b)) {
            throw new IllegalArgumentException(("Max pool size " + this.c + " should be greater than or equals to core pool size " + this.b).toString());
        }
        if (!(this.c <= 2097150)) {
            throw new IllegalArgumentException(("Max pool size " + this.c + " should not exceed maximal supported number of threads 2097150").toString());
        }
        if (!(this.d > 0)) {
            throw new IllegalArgumentException(("Idle worker keep alive time " + this.d + " must be positive").toString());
        }
        this.f = new dzn();
        this.g = new dzn();
        this.parkedWorkersStack = 0L;
        this.i = new AtomicReferenceArray<>(this.c + 1);
        this.controlState = this.b << 42;
        this._isTerminated = 0;
    }

    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0080T¢\u0006\u0002\n\u0000R\u0010\u0010\r\u001a\u00020\u000e8\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Companion;", "", "()V", "BLOCKING_MASK", "", "BLOCKING_SHIFT", "", "CLAIMED", "CPU_PERMITS_MASK", "CPU_PERMITS_SHIFT", "CREATED_MASK", "MAX_SUPPORTED_POOL_SIZE", "MIN_SUPPORTED_POOL_SIZE", "NOT_IN_STACK", "Lkotlinx/coroutines/internal/Symbol;", "PARKED", "PARKED_INDEX_MASK", "PARKED_VERSION_INC", "PARKED_VERSION_MASK", "TERMINATED", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dzk$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        a(this, runnable, null, false, 6);
    }

    public static /* synthetic */ void a(dzk dzkVar, Runnable runnable, dzt dztVar, boolean z, int i) {
        if ((i & 2) != 0) {
            dztVar = dzq.a;
        }
        if ((i & 4) != 0) {
            z = false;
        }
        dzkVar.a(runnable, dztVar, z);
    }

    public final void a(Runnable runnable, dzt dztVar, boolean z) {
        dzs dzsVar;
        boolean z2;
        dzs a2 = a(runnable, dztVar);
        c e = e();
        boolean z3 = true;
        if (e == null || e.b == d.e || (a2.h.a() == 0 && e.b == d.b)) {
            dzsVar = a2;
        } else {
            e.d = true;
            dzsVar = e.a.a(a2, z);
        }
        if (dzsVar != null) {
            if (dzsVar.h.a() == 1) {
                z2 = this.g.a(dzsVar);
            } else {
                z2 = this.f.a(dzsVar);
            }
            if (!z2) {
                throw new RejectedExecutionException(dqc.a(this.e, (Object) " was terminated"));
            }
        }
        if (!z || e == null) {
            z3 = false;
        }
        if (a2.h.a() == 0) {
            if (z3) {
                return;
            }
            a();
            return;
        }
        long addAndGet = j.addAndGet(this, 2097152L);
        if (z3 || c() || a(addAndGet)) {
            return;
        }
        c();
    }

    public static dzs a(Runnable runnable, dzt dztVar) {
        long a2 = dzv.f.a();
        if (runnable instanceof dzs) {
            dzs dzsVar = (dzs) runnable;
            dzsVar.g = a2;
            dzsVar.h = dztVar;
            return dzsVar;
        }
        return new dzu(runnable, a2, dztVar);
    }

    public final void a() {
        if (!c() && !a(this)) {
            c();
        }
    }

    private static /* synthetic */ boolean a(dzk dzkVar) {
        return dzkVar.a(dzkVar.controlState);
    }

    private final boolean a(long j2) {
        if (drb.b(((int) (2097151 & j2)) - ((int) ((j2 & 4398044413952L) >> 21)), 0) < this.b) {
            int d2 = d();
            if (d2 == 1 && this.b > 1) {
                d();
            }
            if (d2 > 0) {
                return true;
            }
        }
        return false;
    }

    private final boolean c() {
        c b2;
        do {
            b2 = b();
            if (b2 == null) {
                return false;
            }
        } while (!c.c.compareAndSet(b2, -1, 0));
        LockSupport.unpark(b2);
        return true;
    }

    private final int d() {
        synchronized (this.i) {
            if (this._isTerminated != 0) {
                return -1;
            }
            long j2 = this.controlState;
            int i = (int) (j2 & 2097151);
            boolean z = false;
            int b2 = drb.b(i - ((int) ((j2 & 4398044413952L) >> 21)), 0);
            if (b2 >= this.b) {
                return 0;
            }
            if (i >= this.c) {
                return 0;
            }
            int i2 = ((int) (this.controlState & 2097151)) + 1;
            if (!(i2 > 0 && this.i.get(i2) == null)) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            c cVar = new c(i2);
            this.i.set(i2, cVar);
            if (i2 == ((int) (2097151 & j.incrementAndGet(this)))) {
                z = true;
            }
            if (!z) {
                throw new IllegalArgumentException("Failed requirement.".toString());
            }
            cVar.start();
            return b2 + 1;
        }
    }

    private final c e() {
        Thread currentThread = Thread.currentThread();
        c cVar = currentThread instanceof c ? (c) currentThread : null;
        if (cVar == null || !dqc.a(dzk.this, this)) {
            return null;
        }
        return cVar;
    }

    public final String toString() {
        int i;
        int i2;
        int i3;
        int i4;
        ArrayList arrayList = new ArrayList();
        int length = this.i.length();
        int i5 = 0;
        if (1 < length) {
            i3 = 0;
            int i6 = 0;
            i2 = 0;
            i = 0;
            int i7 = 1;
            while (true) {
                int i8 = i7 + 1;
                c cVar = this.i.get(i7);
                if (cVar != null) {
                    int a2 = cVar.a.a();
                    int i9 = b.$EnumSwitchMapping$0[cVar.b - 1];
                    if (i9 == 1) {
                        i5++;
                    } else if (i9 == 2) {
                        i3++;
                        StringBuilder sb = new StringBuilder();
                        sb.append(a2);
                        sb.append('b');
                        arrayList.add(sb.toString());
                    } else if (i9 == 3) {
                        i6++;
                        StringBuilder sb2 = new StringBuilder();
                        sb2.append(a2);
                        sb2.append('c');
                        arrayList.add(sb2.toString());
                    } else if (i9 == 4) {
                        i2++;
                        if (a2 > 0) {
                            StringBuilder sb3 = new StringBuilder();
                            sb3.append(a2);
                            sb3.append('d');
                            arrayList.add(sb3.toString());
                        }
                    } else if (i9 == 5) {
                        i++;
                    }
                }
                if (i8 >= length) {
                    break;
                }
                i7 = i8;
            }
            i4 = i5;
            i5 = i6;
        } else {
            i4 = 0;
            i3 = 0;
            i2 = 0;
            i = 0;
        }
        long j2 = this.controlState;
        return this.e + '@' + Integer.toHexString(System.identityHashCode(this)) + "[Pool Size {core = " + this.b + ", max = " + this.c + "}, Worker States {CPU = " + i5 + ", blocking = " + i3 + ", parked = " + i4 + ", dormant = " + i2 + ", terminated = " + i + "}, running workers queues = " + arrayList + ", global CPU queue size = " + this.f.a() + ", global blocking queue size = " + this.g.a() + ", Control State {created workers= " + ((int) (2097151 & j2)) + ", blocking tasks = " + ((int) ((4398044413952L & j2) >> 21)) + ", CPUs acquired = " + (this.b - ((int) ((9223367638808264704L & j2) >> 42))) + "}]";
    }

    public static void a(dzs dzsVar) {
        try {
            dzsVar.run();
        } catch (Throwable th) {
            Thread currentThread = Thread.currentThread();
            currentThread.getUncaughtExceptionHandler().uncaughtException(currentThread, th);
        }
    }

    @Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\b\u0080\u0004\u0018\u00002\u00020GB\u0011\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0001¢\u0006\u0004\b\u0003\u0010\u0004B\t\b\u0002¢\u0006\u0004\b\u0003\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\n\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\n\u0010\tJ\u0017\u0010\r\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0013\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0013\u0010\u0012J\u0017\u0010\u0015\u001a\u00020\u00072\u0006\u0010\u0014\u001a\u00020\u0001H\u0002¢\u0006\u0004\b\u0015\u0010\tJ\u000f\u0010\u0016\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\u0016\u0010\u0017J\u0015\u0010\u0019\u001a\u00020\u00012\u0006\u0010\u0018\u001a\u00020\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001b\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0011\u0010\u001d\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u001f\u0010\u001cJ\u000f\u0010 \u001a\u00020\u0007H\u0002¢\u0006\u0004\b \u0010\u001cJ\u000f\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\u0017J\u000f\u0010\"\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\"\u0010\u001cJ\u0015\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020#¢\u0006\u0004\b%\u0010&J\u0019\u0010(\u001a\u0004\u0018\u00010\u000b2\u0006\u0010'\u001a\u00020\u000fH\u0002¢\u0006\u0004\b(\u0010\u0012J\u000f\u0010)\u001a\u00020\u0007H\u0002¢\u0006\u0004\b)\u0010\u001cR*\u0010*\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00018\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b*\u0010+\u001a\u0004\b,\u0010-\"\u0004\b.\u0010\tR\u0014\u00100\u001a\u00020/8\u0006X\u0087\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0016\u00102\u001a\u00020\u000f8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\b2\u00103R\u0016\u00105\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R$\u00108\u001a\u0004\u0018\u0001078\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b8\u00109\u001a\u0004\b:\u0010;\"\u0004\b<\u0010=R\u0016\u0010>\u001a\u00020\u00018\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b>\u0010+R\u0012\u0010B\u001a\u00020?8Æ\u0002¢\u0006\u0006\u001a\u0004\b@\u0010AR\u0016\u0010C\u001a\u00020#8\u0006@\u0006X\u0087\u000e¢\u0006\u0006\n\u0004\bC\u0010DR\u0016\u0010E\u001a\u0002048\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bE\u00106¨\u0006F"}, d2 = {"Lkotlinx/coroutines/scheduling/CoroutineScheduler$Worker;", "", "index", "<init>", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;I)V", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler;)V", "taskMode", "", "afterTask", "(I)V", "beforeTask", "Lkotlinx/coroutines/scheduling/Task;", "task", "executeTask", "(Lkotlinx/coroutines/scheduling/Task;)V", "", "scanLocalQueue", "findAnyTask", "(Z)Lkotlinx/coroutines/scheduling/Task;", "findTask", "mode", "idleReset", "inStack", "()Z", "upperBound", "nextInt", "(I)I", "park", "()V", "pollGlobalQueues", "()Lkotlinx/coroutines/scheduling/Task;", "run", "runWorker", "tryAcquireCpuPermit", "tryPark", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "newState", "tryReleaseCpu", "(Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;)Z", "blockingOnly", "trySteal", "tryTerminateWorker", "indexInArray", "I", "getIndexInArray", "()I", "setIndexInArray", "Lkotlinx/coroutines/scheduling/WorkQueue;", "localQueue", "Lkotlinx/coroutines/scheduling/WorkQueue;", "mayHaveLocalTasks", "Z", "", "minDelayUntilStealableTaskNs", "J", "", "nextParkedWorker", "Ljava/lang/Object;", "getNextParkedWorker", "()Ljava/lang/Object;", "setNextParkedWorker", "(Ljava/lang/Object;)V", "rngState", "Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "getScheduler", "()Lkotlinx/coroutines/scheduling/CoroutineScheduler;", "scheduler", "state", "Lkotlinx/coroutines/scheduling/CoroutineScheduler$WorkerState;", "terminationDeadline", "kotlinx-coroutines-core", "Ljava/lang/Thread;"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dzk$c */
    /* loaded from: classes2.dex */
    public final class c extends Thread {
        static final /* synthetic */ AtomicIntegerFieldUpdater c = AtomicIntegerFieldUpdater.newUpdater(c.class, "workerCtl");
        public final dzw a;
        public int b;
        public boolean d;
        private long f;
        private long g;
        private int h;
        volatile int indexInArray;
        volatile Object nextParkedWorker;
        volatile /* synthetic */ int workerCtl;

        private c() {
            setDaemon(true);
            this.a = new dzw();
            this.b = d.d;
            this.workerCtl = 0;
            this.nextParkedWorker = dzk.k;
            dqs.a aVar = dqs.b;
            this.h = dqs.a.b();
        }

        private void b(int i) {
            StringBuilder sb = new StringBuilder();
            sb.append(dzk.this.e);
            sb.append("-worker-");
            sb.append(i == 0 ? "TERMINATED" : String.valueOf(i));
            setName(sb.toString());
            this.indexInArray = i;
        }

        public c(int i) {
            this();
            b(i);
        }

        private final boolean a() {
            boolean z;
            if (this.b == d.a) {
                return true;
            }
            dzk dzkVar = dzk.this;
            while (true) {
                long j = dzkVar.controlState;
                if (((int) ((9223367638808264704L & j) >> 42)) != 0) {
                    if (dzk.j.compareAndSet(dzkVar, j, j - 4398046511104L)) {
                        z = true;
                        break;
                    }
                } else {
                    z = false;
                    break;
                }
            }
            if (!z) {
                return false;
            }
            this.b = d.a;
            return true;
        }

        public final boolean a(int i) {
            int i2 = this.b;
            boolean z = i2 == d.a;
            if (z) {
                dzk.j.addAndGet(dzk.this, 4398046511104L);
            }
            if (i2 != i) {
                this.b = i;
            }
            return z;
        }

        private final void b() {
            long j;
            long j2;
            int i;
            if (!c()) {
                dzk dzkVar = dzk.this;
                if (this.nextParkedWorker != dzk.k) {
                    return;
                }
                do {
                    j = dzkVar.parkedWorkersStack;
                    int i2 = (int) (j & 2097151);
                    j2 = (2097152 + j) & (-2097152);
                    i = this.indexInArray;
                    if (dug.a()) {
                        if (!(i != 0)) {
                            throw new AssertionError();
                        }
                    }
                    this.nextParkedWorker = dzkVar.i.get(i2);
                } while (!dzk.h.compareAndSet(dzkVar, j, j2 | i));
                return;
            }
            if (dug.a()) {
                if (!(this.a.a() == 0)) {
                    throw new AssertionError();
                }
            }
            this.workerCtl = -1;
            while (c() && this.workerCtl == -1 && dzk.this._isTerminated == 0 && this.b != d.e) {
                a(d.c);
                Thread.interrupted();
                if (this.f == 0) {
                    this.f = System.nanoTime() + dzk.this.d;
                }
                LockSupport.parkNanos(dzk.this.d);
                if (System.nanoTime() - this.f >= 0) {
                    this.f = 0L;
                    AtomicReferenceArray<c> atomicReferenceArray = dzk.this.i;
                    dzk dzkVar2 = dzk.this;
                    synchronized (atomicReferenceArray) {
                        if (dzkVar2._isTerminated == 0) {
                            if (((int) (dzkVar2.controlState & 2097151)) > dzkVar2.b) {
                                if (c.compareAndSet(this, -1, 1)) {
                                    int i3 = this.indexInArray;
                                    b(0);
                                    dzkVar2.a(this, i3, 0);
                                    int andDecrement = (int) (dzk.j.getAndDecrement(dzkVar2) & 2097151);
                                    if (andDecrement != i3) {
                                        c cVar = dzkVar2.i.get(andDecrement);
                                        dqc.a(cVar);
                                        c cVar2 = cVar;
                                        dzkVar2.i.set(i3, cVar2);
                                        cVar2.b(i3);
                                        dzkVar2.a(cVar2, andDecrement, i3);
                                    }
                                    dzkVar2.i.set(andDecrement, null);
                                    dmg dmgVar = dmg.a;
                                    this.b = d.e;
                                }
                            }
                        }
                    }
                }
            }
        }

        private final boolean c() {
            return this.nextParkedWorker != dzk.k;
        }

        private int c(int i) {
            int i2 = this.h;
            int i3 = i2 ^ (i2 << 13);
            int i4 = i3 ^ (i3 >> 17);
            int i5 = i4 ^ (i4 << 5);
            this.h = i5;
            int i6 = i - 1;
            return (i6 & i) == 0 ? i5 & i6 : (i5 & Integer.MAX_VALUE) % i;
        }

        public final dzs a(boolean z) {
            dzs dzsVar;
            if (a()) {
                return b(z);
            }
            if (!z || (dzsVar = this.a.b()) == null) {
                dzsVar = dzk.this.g.c();
            }
            return dzsVar == null ? c(true) : dzsVar;
        }

        private final dzs b(boolean z) {
            dzs d;
            dzs d2;
            if (z) {
                boolean z2 = c(dzk.this.b * 2) == 0;
                if (z2 && (d2 = d()) != null) {
                    return d2;
                }
                dzs b = this.a.b();
                if (b != null) {
                    return b;
                }
                if (!z2 && (d = d()) != null) {
                    return d;
                }
            } else {
                dzs d3 = d();
                if (d3 != null) {
                    return d3;
                }
            }
            return c(false);
        }

        private final dzs d() {
            if (c(2) == 0) {
                dzs c2 = dzk.this.f.c();
                return c2 != null ? c2 : dzk.this.g.c();
            }
            dzs c3 = dzk.this.g.c();
            return c3 != null ? c3 : dzk.this.f.c();
        }

        private final dzs c(boolean z) {
            long j;
            if (dug.a()) {
                if (!(this.a.a() == 0)) {
                    throw new AssertionError();
                }
            }
            int i = (int) (dzk.this.controlState & 2097151);
            if (i < 2) {
                return null;
            }
            int c2 = c(i);
            dzk dzkVar = dzk.this;
            long j2 = Long.MAX_VALUE;
            for (int i2 = 0; i2 < i; i2++) {
                c2++;
                if (c2 > i) {
                    c2 = 1;
                }
                c cVar = dzkVar.i.get(c2);
                if (cVar != null && cVar != this) {
                    if (dug.a()) {
                        if (!(this.a.a() == 0)) {
                            throw new AssertionError();
                        }
                    }
                    if (z) {
                        j = this.a.b(cVar.a);
                    } else {
                        j = this.a.a(cVar.a);
                    }
                    if (j == -1) {
                        return this.a.b();
                    }
                    if (j > 0) {
                        j2 = Math.min(j2, j);
                    }
                }
            }
            if (j2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                j2 = 0;
            }
            this.g = j2;
            return null;
        }

        /* JADX WARN: Code restructure failed: missing block: B:45:0x00a3, code lost:
            a(defpackage.dzk.d.e);
         */
        /* JADX WARN: Code restructure failed: missing block: B:46:0x00a8, code lost:
            return;
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r8 = this;
                r0 = 1
                r1 = 0
            L2:
                r2 = 0
            L3:
                dzk r3 = defpackage.dzk.this
                int r3 = r3._isTerminated
                if (r3 != 0) goto La3
                int r3 = r8.b
                int r4 = defpackage.dzk.d.e
                if (r3 == r4) goto La3
                boolean r3 = r8.d
                dzs r3 = r8.a(r3)
                r4 = 0
                if (r3 == 0) goto L80
                r8.g = r4
                dzt r2 = r3.h
                int r2 = r2.a()
                r8.f = r4
                int r4 = r8.b
                int r5 = defpackage.dzk.d.c
                if (r4 != r5) goto L41
                boolean r4 = defpackage.dug.a()
                if (r4 == 0) goto L3d
                if (r2 != r0) goto L33
                r4 = 1
                goto L34
            L33:
                r4 = 0
            L34:
                if (r4 == 0) goto L37
                goto L3d
            L37:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L3d:
                int r4 = defpackage.dzk.d.b
                r8.b = r4
            L41:
                if (r2 == 0) goto L50
                int r4 = defpackage.dzk.d.b
                boolean r4 = r8.a(r4)
                if (r4 == 0) goto L50
                dzk r4 = defpackage.dzk.this
                r4.a()
            L50:
                defpackage.dzk.a(r3)
                if (r2 == 0) goto L2
                dzk r2 = defpackage.dzk.this
                java.util.concurrent.atomic.AtomicLongFieldUpdater r3 = defpackage.dzk.j
                r4 = -2097152(0xffffffffffe00000, double:NaN)
                r3.addAndGet(r2, r4)
                int r2 = r8.b
                int r3 = defpackage.dzk.d.e
                if (r2 == r3) goto L2
                boolean r3 = defpackage.dug.a()
                if (r3 == 0) goto L7b
                int r3 = defpackage.dzk.d.b
                if (r2 != r3) goto L71
                r2 = 1
                goto L72
            L71:
                r2 = 0
            L72:
                if (r2 == 0) goto L75
                goto L7b
            L75:
                java.lang.AssertionError r0 = new java.lang.AssertionError
                r0.<init>()
                throw r0
            L7b:
                int r2 = defpackage.dzk.d.d
                r8.b = r2
                goto L2
            L80:
                r8.d = r1
                long r6 = r8.g
                int r3 = (r6 > r4 ? 1 : (r6 == r4 ? 0 : -1))
                if (r3 == 0) goto L9e
                if (r2 != 0) goto L8d
                r2 = 1
                goto L3
            L8d:
                int r2 = defpackage.dzk.d.c
                r8.a(r2)
                java.lang.Thread.interrupted()
                long r2 = r8.g
                java.util.concurrent.locks.LockSupport.parkNanos(r2)
                r8.g = r4
                goto L2
            L9e:
                r8.b()
                goto L3
            La3:
                int r0 = defpackage.dzk.d.e
                r8.a(r0)
                return
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.dzk.c.run():void");
        }
    }

    public final void a(c cVar, int i, int i2) {
        while (true) {
            long j2 = this.parkedWorkersStack;
            int i3 = (int) (2097151 & j2);
            long j3 = (2097152 + j2) & (-2097152);
            if (i3 == i) {
                i3 = i2 == 0 ? a(cVar) : i2;
            }
            if (i3 >= 0 && h.compareAndSet(this, j2, j3 | i3)) {
                return;
            }
        }
    }

    private final c b() {
        while (true) {
            long j2 = this.parkedWorkersStack;
            c cVar = this.i.get((int) (2097151 & j2));
            if (cVar == null) {
                return null;
            }
            long j3 = (2097152 + j2) & (-2097152);
            int a2 = a(cVar);
            if (a2 >= 0 && h.compareAndSet(this, j2, a2 | j3)) {
                cVar.nextParkedWorker = k;
                return cVar;
            }
        }
    }

    private static int a(c cVar) {
        Object obj = cVar.nextParkedWorker;
        while (obj != k) {
            if (obj == null) {
                return 0;
            }
            c cVar2 = (c) obj;
            int i = cVar2.indexInArray;
            if (i != 0) {
                return i;
            }
            obj = cVar2.nextParkedWorker;
        }
        return -1;
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        int i;
        boolean z = false;
        if (l.compareAndSet(this, 0, 1)) {
            c e = e();
            synchronized (this.i) {
                i = (int) (this.controlState & 2097151);
            }
            if (i > 0) {
                int i2 = 1;
                while (true) {
                    int i3 = i2 + 1;
                    c cVar = this.i.get(i2);
                    dqc.a(cVar);
                    c cVar2 = cVar;
                    if (cVar2 != e) {
                        while (cVar2.isAlive()) {
                            LockSupport.unpark(cVar2);
                            cVar2.join(10000L);
                        }
                        int i4 = cVar2.b;
                        if (dug.a()) {
                            if (!(i4 == d.e)) {
                                throw new AssertionError();
                            }
                        }
                        cVar2.a.a(this.g);
                    }
                    if (i2 == i) {
                        break;
                    }
                    i2 = i3;
                }
            }
            this.g.b();
            this.f.b();
            while (true) {
                dzs a2 = e == null ? null : e.a(true);
                if (a2 == null && (a2 = this.f.c()) == null && (a2 = this.g.c()) == null) {
                    break;
                }
                a(a2);
            }
            if (e != null) {
                e.a(d.e);
            }
            if (dug.a()) {
                if (((int) ((this.controlState & 9223367638808264704L) >> 42)) == this.b) {
                    z = true;
                }
                if (!z) {
                    throw new AssertionError();
                }
            }
            this.parkedWorkersStack = 0L;
            this.controlState = 0L;
        }
    }
}
