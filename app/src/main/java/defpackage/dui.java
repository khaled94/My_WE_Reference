package defpackage;

import androidx.core.location.LocationRequestCompat;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.locks.LockSupport;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\bÀ\u0002\u0018\u00002\u00020\u00012\u00060\u0002j\u0002`\u0003B\u0007\b\u0002¢\u0006\u0002\u0010\u0004J\b\u0010\u001b\u001a\u00020\u001cH\u0002J\b\u0010\u001d\u001a\u00020\u0010H\u0002J\r\u0010\u001e\u001a\u00020\u001cH\u0000¢\u0006\u0002\b\u001fJ$\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\b2\n\u0010#\u001a\u00060\u0002j\u0002`\u00032\u0006\u0010$\u001a\u00020%H\u0016J\b\u0010&\u001a\u00020\u0014H\u0002J\b\u0010'\u001a\u00020\u001cH\u0016J\u000e\u0010(\u001a\u00020\u001c2\u0006\u0010)\u001a\u00020\bR\u000e\u0010\u0005\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0006X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0086T¢\u0006\u0002\n\u0000R\u0016\u0010\u000f\u001a\u0004\u0018\u00010\u0010X\u0082\u000e¢\u0006\b\n\u0000\u0012\u0004\b\u0011\u0010\u0004R\u000e\u0010\u0012\u001a\u00020\u0006X\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0013\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00148@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00108TX\u0094\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u001a¨\u0006*"}, d2 = {"Lkotlinx/coroutines/DefaultExecutor;", "Lkotlinx/coroutines/EventLoopImplBase;", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "()V", "ACTIVE", "", "DEFAULT_KEEP_ALIVE", "", "FRESH", "KEEP_ALIVE_NANOS", "SHUTDOWN_ACK", "SHUTDOWN_REQ", "THREAD_NAME", "", "_thread", "Ljava/lang/Thread;", "get_thread$annotations", "debugStatus", "isShutdownRequested", "", "()Z", "isThreadPresent", "isThreadPresent$kotlinx_coroutines_core", "thread", "getThread", "()Ljava/lang/Thread;", "acknowledgeShutdownIfNeeded", "", "createThreadSync", "ensureStarted", "ensureStarted$kotlinx_coroutines_core", "invokeOnTimeout", "Lkotlinx/coroutines/DisposableHandle;", "timeMillis", "block", "context", "Lkotlin/coroutines/CoroutineContext;", "notifyStartup", "run", "shutdown", "timeout", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dui  reason: default package */
/* loaded from: classes2.dex */
public final class dui extends duu implements Runnable {
    private static volatile Thread _thread;
    public static final dui b;
    private static final long c;
    private static volatile int debugStatus;

    private dui() {
    }

    static {
        Long l;
        dui duiVar = new dui();
        b = duiVar;
        duiVar.a(false);
        TimeUnit timeUnit = TimeUnit.MILLISECONDS;
        try {
            l = Long.getLong("kotlinx.coroutines.DefaultExecutor.keepAlive", 1000L);
        } catch (SecurityException unused) {
            l = 1000L;
        }
        c = timeUnit.toNanos(l.longValue());
    }

    @Override // defpackage.duv
    protected final Thread a() {
        Thread thread = _thread;
        return thread == null ? k() : thread;
    }

    private static boolean j() {
        int i = debugStatus;
        return i == 2 || i == 3;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean c2;
        dwc dwcVar = dwc.a;
        dwc.a(this);
        try {
            if (!l()) {
                if (c2) {
                    return;
                }
                return;
            }
            long j = Long.MAX_VALUE;
            while (true) {
                Thread.interrupted();
                long b2 = b();
                if (b2 == LocationRequestCompat.PASSIVE_INTERVAL) {
                    dsu dsuVar = dsv.a;
                    long nanoTime = dsuVar == null ? System.nanoTime() : dsuVar.a();
                    if (j == LocationRequestCompat.PASSIVE_INTERVAL) {
                        j = c + nanoTime;
                    }
                    long j2 = j - nanoTime;
                    if (j2 <= 0) {
                        _thread = null;
                        m();
                        if (c()) {
                            return;
                        }
                        a();
                        return;
                    }
                    b2 = drb.a(b2, j2);
                } else {
                    j = Long.MAX_VALUE;
                }
                if (b2 > 0) {
                    if (j()) {
                        _thread = null;
                        m();
                        if (c()) {
                            return;
                        }
                        a();
                        return;
                    } else if (dsv.a == null) {
                        LockSupport.parkNanos(this, b2);
                    }
                }
            }
        } finally {
            _thread = null;
            m();
            if (!c()) {
                a();
            }
        }
    }

    private final synchronized Thread k() {
        Thread thread = _thread;
        if (thread == null) {
            Thread thread2 = new Thread(this, "kotlinx.coroutines.DefaultExecutor");
            _thread = thread2;
            thread2.setDaemon(true);
            thread2.start();
            return thread2;
        }
        return thread;
    }

    private final synchronized boolean l() {
        if (j()) {
            return false;
        }
        debugStatus = 1;
        notifyAll();
        return true;
    }

    private final synchronized void m() {
        if (!j()) {
            return;
        }
        debugStatus = 3;
        this._queue = null;
        this._delayed = null;
        notifyAll();
    }
}
