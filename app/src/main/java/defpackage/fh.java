package defpackage;

import android.os.Process;
import android.os.StrictMode;
import android.text.TextUtils;
import java.util.Collection;
import java.util.List;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Future;
import java.util.concurrent.PriorityBlockingQueue;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;
import java.util.concurrent.atomic.AtomicInteger;

/* renamed from: fh  reason: default package */
/* loaded from: classes2.dex */
public final class fh implements ExecutorService {
    private static final long a = TimeUnit.SECONDS.toMillis(10);
    private static volatile int b;
    private final ExecutorService c;

    /* renamed from: fh$d */
    /* loaded from: classes2.dex */
    public interface d {
        public static final d a = new d() { // from class: fh.d.1
            @Override // defpackage.fh.d
            public final void a(Throwable th) {
            }
        };
        public static final d b = new d() { // from class: fh.d.2
            @Override // defpackage.fh.d
            public final void a(Throwable th) {
            }
        };
        public static final d c = new d() { // from class: fh.d.3
            @Override // defpackage.fh.d
            public final void a(Throwable th) {
                throw new RuntimeException("Request threw uncaught throwable", th);
            }
        };
        public static final d d = b;

        void a(Throwable th);
    }

    public static fh c() {
        return new fh(new ThreadPoolExecutor(0, Integer.MAX_VALUE, a, TimeUnit.MILLISECONDS, new SynchronousQueue(), new c(new b((byte) 0), "source-unlimited", d.d, false)));
    }

    fh(ExecutorService executorService) {
        this.c = executorService;
    }

    @Override // java.util.concurrent.Executor
    public final void execute(Runnable runnable) {
        this.c.execute(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final Future<?> submit(Runnable runnable) {
        return this.c.submit(runnable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection) throws InterruptedException {
        return this.c.invokeAll(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> List<Future<T>> invokeAll(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException {
        return this.c.invokeAll(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection) throws InterruptedException, ExecutionException {
        return (T) this.c.invokeAny(collection);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> T invokeAny(Collection<? extends Callable<T>> collection, long j, TimeUnit timeUnit) throws InterruptedException, ExecutionException, TimeoutException {
        return (T) this.c.invokeAny(collection, j, timeUnit);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Runnable runnable, T t) {
        return this.c.submit(runnable, t);
    }

    @Override // java.util.concurrent.ExecutorService
    public final <T> Future<T> submit(Callable<T> callable) {
        return this.c.submit(callable);
    }

    @Override // java.util.concurrent.ExecutorService
    public final void shutdown() {
        this.c.shutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final List<Runnable> shutdownNow() {
        return this.c.shutdownNow();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isShutdown() {
        return this.c.isShutdown();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean isTerminated() {
        return this.c.isTerminated();
    }

    @Override // java.util.concurrent.ExecutorService
    public final boolean awaitTermination(long j, TimeUnit timeUnit) throws InterruptedException {
        return this.c.awaitTermination(j, timeUnit);
    }

    public final String toString() {
        return this.c.toString();
    }

    private static int e() {
        if (b == 0) {
            b = Math.min(4, fi.a());
        }
        return b;
    }

    /* renamed from: fh$b */
    /* loaded from: classes2.dex */
    static final class b implements ThreadFactory {
        private b() {
        }

        /* synthetic */ b(byte b) {
            this();
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(Runnable runnable) {
            return new Thread(runnable) { // from class: fh.b.1
                @Override // java.lang.Thread, java.lang.Runnable
                public final void run() {
                    Process.setThreadPriority(9);
                    super.run();
                }
            };
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: fh$c */
    /* loaded from: classes2.dex */
    public static final class c implements ThreadFactory {
        final d a;
        final boolean b;
        private final ThreadFactory c;
        private final String d;
        private final AtomicInteger e = new AtomicInteger();

        c(ThreadFactory threadFactory, String str, d dVar, boolean z) {
            this.c = threadFactory;
            this.d = str;
            this.a = dVar;
            this.b = z;
        }

        @Override // java.util.concurrent.ThreadFactory
        public final Thread newThread(final Runnable runnable) {
            Thread newThread = this.c.newThread(new Runnable() { // from class: fh.c.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (c.this.b) {
                        StrictMode.setThreadPolicy(new StrictMode.ThreadPolicy.Builder().detectNetwork().penaltyDeath().build());
                    }
                    try {
                        runnable.run();
                    } catch (Throwable th) {
                        c.this.a.a(th);
                    }
                }
            });
            newThread.setName("glide-" + this.d + "-thread-" + this.e.getAndIncrement());
            return newThread;
        }
    }

    /* renamed from: fh$a */
    /* loaded from: classes2.dex */
    public static final class a {
        String a;
        private final boolean b;
        private int c;
        private int d;
        private final ThreadFactory e = new b((byte) 0);
        private d f = d.d;
        private long g;

        a(boolean z) {
            this.b = z;
        }

        public final a a(int i) {
            this.c = i;
            this.d = i;
            return this;
        }

        public final fh a() {
            if (TextUtils.isEmpty(this.a)) {
                throw new IllegalArgumentException("Name must be non-null and non-empty, but given: " + this.a);
            }
            ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(this.c, this.d, this.g, TimeUnit.MILLISECONDS, new PriorityBlockingQueue(), new c(this.e, this.a, this.f, this.b));
            if (this.g != 0) {
                threadPoolExecutor.allowCoreThreadTimeOut(true);
            }
            return new fh(threadPoolExecutor);
        }
    }

    public static fh a() {
        a a2 = new a(true).a(1);
        a2.a = "disk-cache";
        return a2.a();
    }

    public static fh b() {
        a a2 = new a(false).a(e());
        a2.a = "source";
        return a2.a();
    }

    public static fh d() {
        a a2 = new a(true).a(e() >= 4 ? 2 : 1);
        a2.a = "animation";
        return a2.a();
    }
}
