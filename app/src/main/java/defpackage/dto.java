package defpackage;

import androidx.exifinterface.media.ExifInterface;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ThreadFactory;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000`\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0011\u001a\u0004\u0018\u0001H\u0012\"\u0004\b\u0000\u0010\u00122\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u0002H\u00120\u0014H\u0082\b¢\u0006\u0002\u0010\u0015J\b\u0010\u0016\u001a\u00020\u0017H\u0016J\b\u0010\u0018\u001a\u00020\u0019H\u0002J\b\u0010\u001a\u001a\u00020\u0019H\u0002J\u001c\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001c\u001a\u00020\u001d2\n\u0010\u0013\u001a\u00060\u001ej\u0002`\u001fH\u0016J\b\u0010 \u001a\u00020\u0006H\u0002J!\u0010!\u001a\u00020\u00102\n\u0010\"\u001a\u0006\u0012\u0002\b\u00030#2\u0006\u0010\u0005\u001a\u00020\u0019H\u0000¢\u0006\u0002\b$J\r\u0010%\u001a\u00020\u0017H\u0000¢\u0006\u0002\b&J\u0015\u0010'\u001a\u00020\u00172\u0006\u0010(\u001a\u00020)H\u0000¢\u0006\u0002\b*J\b\u0010+\u001a\u00020\u0004H\u0016J\r\u0010\u000f\u001a\u00020\u0017H\u0000¢\u0006\u0002\b,R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0014\u0010\u0005\u001a\u00020\u00068VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0007\u0010\bR\u0014\u0010\t\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\fR\u0010\u0010\r\u001a\u0004\u0018\u00010\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\nX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006-"}, d2 = {"Lkotlinx/coroutines/CommonPool;", "Lkotlinx/coroutines/ExecutorCoroutineDispatcher;", "()V", "DEFAULT_PARALLELISM_PROPERTY_NAME", "", "executor", "Ljava/util/concurrent/Executor;", "getExecutor", "()Ljava/util/concurrent/Executor;", "parallelism", "", "getParallelism", "()I", "pool", "requestedParallelism", "usePrivatePool", "", "Try", ExifInterface.GPS_DIRECTION_TRUE, "block", "Lkotlin/Function0;", "(Lkotlin/jvm/functions/Function0;)Ljava/lang/Object;", "close", "", "createPlainPool", "Ljava/util/concurrent/ExecutorService;", "createPool", "dispatch", "context", "Lkotlin/coroutines/CoroutineContext;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "getOrCreatePoolSync", "isGoodCommonPool", "fjpClass", "Ljava/lang/Class;", "isGoodCommonPool$kotlinx_coroutines_core", "restore", "restore$kotlinx_coroutines_core", "shutdown", "timeout", "", "shutdown$kotlinx_coroutines_core", "toString", "usePrivatePool$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dto */
/* loaded from: classes2.dex */
public final class dto extends duy {
    public static final dto b = new dto();
    private static final int d;
    private static boolean e;
    private static volatile Executor pool;

    public static final void e() {
    }

    public static /* synthetic */ Thread lambda$3NpdeZP0mGkLEMIYc0XHCmYb9f0(AtomicInteger atomicInteger, Runnable runnable) {
        return a(atomicInteger, runnable);
    }

    @Override // defpackage.dtx
    public final String toString() {
        return "CommonPool";
    }

    private dto() {
    }

    /* JADX WARN: Code restructure failed: missing block: B:35:0x0083, code lost:
        if (r0.intValue() <= 0) goto L39;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0085, code lost:
        r0 = r0.intValue();
     */
    static {
        /*
            dto r0 = new dto
            r0.<init>()
            defpackage.dto.b = r0
            r0 = 0
            java.lang.String r1 = "kotlinx.coroutines.default.parallelism"
            java.lang.String r1 = java.lang.System.getProperty(r1)     // Catch: java.lang.Throwable -> Lf
            goto L10
        Lf:
            r1 = r0
        L10:
            if (r1 != 0) goto L15
            r0 = -1
            goto L89
        L15:
            java.lang.String r2 = "$this$toIntOrNull"
            defpackage.dqc.d(r1, r2)
            defpackage.dqc.d(r1, r2)
            int r2 = r1.length()
            if (r2 != 0) goto L24
            goto L7d
        L24:
            r3 = 0
            char r4 = r1.charAt(r3)
            r5 = 48
            int r5 = defpackage.dqc.a(r4, r5)
            r6 = -2147483647(0xffffffff80000001, float:-1.4E-45)
            r7 = 1
            if (r5 >= 0) goto L46
            if (r2 != r7) goto L38
            goto L7d
        L38:
            r5 = 45
            if (r4 != r5) goto L40
            r6 = -2147483648(0xffffffff80000000, float:-0.0)
            r4 = 1
            goto L48
        L40:
            r5 = 43
            if (r4 != r5) goto L7d
            r4 = 0
            goto L48
        L46:
            r4 = 0
            r7 = 0
        L48:
            r5 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
            r8 = -59652323(0xfffffffffc71c71d, float:-5.0215282E36)
        L4e:
            if (r7 >= r2) goto L71
            char r9 = r1.charAt(r7)
            r10 = 10
            int r9 = java.lang.Character.digit(r9, r10)
            if (r9 >= 0) goto L5d
            goto L7d
        L5d:
            if (r3 >= r8) goto L66
            if (r8 != r5) goto L7d
            int r8 = r6 / 10
            if (r3 >= r8) goto L66
            goto L7d
        L66:
            int r3 = r3 * 10
            int r10 = r6 + r9
            if (r3 >= r10) goto L6d
            goto L7d
        L6d:
            int r3 = r3 - r9
            int r7 = r7 + 1
            goto L4e
        L71:
            if (r4 == 0) goto L78
            java.lang.Integer r0 = java.lang.Integer.valueOf(r3)
            goto L7d
        L78:
            int r0 = -r3
            java.lang.Integer r0 = java.lang.Integer.valueOf(r0)
        L7d:
            if (r0 == 0) goto L8c
            int r2 = r0.intValue()
            if (r2 <= 0) goto L8c
            int r0 = r0.intValue()
        L89:
            defpackage.dto.d = r0
            return
        L8c:
            java.lang.String r0 = "Expected positive number in kotlinx.coroutines.default.parallelism, but has "
            java.lang.String r0 = defpackage.dqc.a(r0, r1)
            java.lang.IllegalStateException r1 = new java.lang.IllegalStateException
            java.lang.String r0 = r0.toString()
            r1.<init>(r0)
            java.lang.Throwable r1 = (java.lang.Throwable) r1
            throw r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dto.<clinit>():void");
    }

    private static int a() {
        Integer valueOf = Integer.valueOf(d);
        if (!(valueOf.intValue() > 0)) {
            valueOf = null;
        }
        if (valueOf != null) {
            return valueOf.intValue();
        }
        return drb.b(Runtime.getRuntime().availableProcessors() - 1, 1);
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x003c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static java.util.concurrent.ExecutorService b() {
        /*
            java.lang.SecurityManager r0 = java.lang.System.getSecurityManager()
            if (r0 == 0) goto Lb
            java.util.concurrent.ExecutorService r0 = c()
            return r0
        Lb:
            r0 = 0
            java.lang.String r1 = "java.util.concurrent.ForkJoinPool"
            java.lang.Class r1 = java.lang.Class.forName(r1)     // Catch: java.lang.Throwable -> L13
            goto L14
        L13:
            r1 = r0
        L14:
            if (r1 != 0) goto L1b
            java.util.concurrent.ExecutorService r0 = c()
            return r0
        L1b:
            boolean r2 = defpackage.dto.e
            r3 = 0
            if (r2 != 0) goto L47
            int r2 = defpackage.dto.d
            if (r2 >= 0) goto L47
            java.lang.String r2 = "commonPool"
            java.lang.Class[] r4 = new java.lang.Class[r3]     // Catch: java.lang.Throwable -> L39
            java.lang.reflect.Method r2 = r1.getMethod(r2, r4)     // Catch: java.lang.Throwable -> L39
            java.lang.Object[] r4 = new java.lang.Object[r3]     // Catch: java.lang.Throwable -> L39
            java.lang.Object r2 = r2.invoke(r0, r4)     // Catch: java.lang.Throwable -> L39
            boolean r4 = r2 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L39
            if (r4 == 0) goto L39
            java.util.concurrent.ExecutorService r2 = (java.util.concurrent.ExecutorService) r2     // Catch: java.lang.Throwable -> L39
            goto L3a
        L39:
            r2 = r0
        L3a:
            if (r2 == 0) goto L47
            boolean r4 = a(r1, r2)
            if (r4 == 0) goto L43
            goto L44
        L43:
            r2 = r0
        L44:
            if (r2 == 0) goto L47
            return r2
        L47:
            r2 = 1
            java.lang.Class[] r4 = new java.lang.Class[r2]     // Catch: java.lang.Throwable -> L6a
            java.lang.Class r5 = java.lang.Integer.TYPE     // Catch: java.lang.Throwable -> L6a
            r4[r3] = r5     // Catch: java.lang.Throwable -> L6a
            java.lang.reflect.Constructor r1 = r1.getConstructor(r4)     // Catch: java.lang.Throwable -> L6a
            java.lang.Object[] r2 = new java.lang.Object[r2]     // Catch: java.lang.Throwable -> L6a
            int r4 = a()     // Catch: java.lang.Throwable -> L6a
            java.lang.Integer r4 = java.lang.Integer.valueOf(r4)     // Catch: java.lang.Throwable -> L6a
            r2[r3] = r4     // Catch: java.lang.Throwable -> L6a
            java.lang.Object r1 = r1.newInstance(r2)     // Catch: java.lang.Throwable -> L6a
            boolean r2 = r1 instanceof java.util.concurrent.ExecutorService     // Catch: java.lang.Throwable -> L6a
            if (r2 == 0) goto L6b
            java.util.concurrent.ExecutorService r1 = (java.util.concurrent.ExecutorService) r1     // Catch: java.lang.Throwable -> L6a
            r0 = r1
            goto L6b
        L6a:
        L6b:
            if (r0 == 0) goto L6e
            return r0
        L6e:
            java.util.concurrent.ExecutorService r0 = c()
            return r0
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.dto.b():java.util.concurrent.ExecutorService");
    }

    private static boolean a(Class<?> cls, ExecutorService executorService) {
        executorService.submit($$Lambda$dto$D5wzTEFhinYv4OLonc4BYJLdQBU.INSTANCE);
        Integer num = null;
        try {
            Object invoke = cls.getMethod("getPoolSize", new Class[0]).invoke(executorService, new Object[0]);
            if (invoke instanceof Integer) {
                num = (Integer) invoke;
            }
        } catch (Throwable unused) {
        }
        return num != null && num.intValue() > 0;
    }

    private static ExecutorService c() {
        final AtomicInteger atomicInteger = new AtomicInteger();
        return Executors.newFixedThreadPool(a(), new ThreadFactory() { // from class: -$$Lambda$dto$3NpdeZP0mGkLEMIYc0XHCmYb9f0
            @Override // java.util.concurrent.ThreadFactory
            public final Thread newThread(Runnable runnable) {
                return dto.lambda$3NpdeZP0mGkLEMIYc0XHCmYb9f0(atomicInteger, runnable);
            }
        });
    }

    public static final Thread a(AtomicInteger atomicInteger, Runnable runnable) {
        Thread thread = new Thread(runnable, dqc.a("CommonPool-worker-", (Object) Integer.valueOf(atomicInteger.incrementAndGet())));
        thread.setDaemon(true);
        return thread;
    }

    private final synchronized Executor d() {
        Executor executor = pool;
        if (executor == null) {
            ExecutorService b2 = b();
            pool = b2;
            return b2;
        }
        return executor;
    }

    @Override // defpackage.dtx
    public final void dispatch(dnw dnwVar, Runnable runnable) {
        try {
            Executor executor = pool;
            if (executor == null) {
                executor = d();
            }
            dsu dsuVar = dsv.a;
            executor.execute(dsuVar == null ? runnable : dsuVar.b());
        } catch (RejectedExecutionException unused) {
            dui.b.a(runnable);
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        throw new IllegalStateException("Close cannot be invoked on CommonPool".toString());
    }
}
