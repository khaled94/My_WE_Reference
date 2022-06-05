package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: eds  reason: default package */
/* loaded from: classes2.dex */
public class eds extends eeo {
    static eds b;
    private boolean e;
    private eds f;
    private long g;
    private static final long a = TimeUnit.SECONDS.toMillis(60);
    private static final long d = TimeUnit.MILLISECONDS.toNanos(a);

    protected void a() {
    }

    public final void A_() {
        if (this.e) {
            throw new IllegalStateException("Unbalanced enter/exit");
        }
        long C_ = C_();
        boolean E_ = E_();
        if (C_ == 0 && !E_) {
            return;
        }
        this.e = true;
        a(this, C_, E_);
    }

    private static synchronized void a(eds edsVar, long j, boolean z) {
        synchronized (eds.class) {
            if (b == null) {
                b = new eds();
                new a().start();
            }
            long nanoTime = System.nanoTime();
            int i = (j > 0L ? 1 : (j == 0L ? 0 : -1));
            if (i != 0 && z) {
                edsVar.g = Math.min(j, edsVar.c() - nanoTime) + nanoTime;
            } else if (i != 0) {
                edsVar.g = j + nanoTime;
            } else if (z) {
                edsVar.g = edsVar.c();
            } else {
                throw new AssertionError();
            }
            long j2 = edsVar.g - nanoTime;
            eds edsVar2 = b;
            while (edsVar2.f != null && j2 >= edsVar2.f.g - nanoTime) {
                edsVar2 = edsVar2.f;
            }
            edsVar.f = edsVar2.f;
            edsVar2.f = edsVar;
            if (edsVar2 == b) {
                eds.class.notify();
            }
        }
    }

    public final boolean B_() {
        if (!this.e) {
            return false;
        }
        this.e = false;
        return a(this);
    }

    private static synchronized boolean a(eds edsVar) {
        synchronized (eds.class) {
            for (eds edsVar2 = b; edsVar2 != null; edsVar2 = edsVar2.f) {
                if (edsVar2.f == edsVar) {
                    edsVar2.f = edsVar.f;
                    edsVar.f = null;
                    return false;
                }
            }
            return true;
        }
    }

    final void a(boolean z) throws IOException {
        if (!B_() || !z) {
            return;
        }
        throw a((IOException) null);
    }

    final IOException b(IOException iOException) throws IOException {
        return !B_() ? iOException : a(iOException);
    }

    protected IOException a(IOException iOException) {
        InterruptedIOException interruptedIOException = new InterruptedIOException("timeout");
        if (iOException != null) {
            interruptedIOException.initCause(iOException);
        }
        return interruptedIOException;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: eds$a */
    /* loaded from: classes2.dex */
    public static final class a extends Thread {
        a() {
            super("Okio Watchdog");
            setDaemon(true);
        }

        /* JADX WARN: Code restructure failed: missing block: B:14:0x0015, code lost:
            r1.a();
         */
        @Override // java.lang.Thread, java.lang.Runnable
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final void run() {
            /*
                r3 = this;
            L0:
                java.lang.Class<eds> r0 = defpackage.eds.class
                monitor-enter(r0)     // Catch: java.lang.InterruptedException -> L0
                eds r1 = defpackage.eds.e()     // Catch: java.lang.Throwable -> L19
                if (r1 != 0) goto Lb
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                goto L0
            Lb:
                eds r2 = defpackage.eds.b     // Catch: java.lang.Throwable -> L19
                if (r1 != r2) goto L14
                r1 = 0
                defpackage.eds.b = r1     // Catch: java.lang.Throwable -> L19
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                return
            L14:
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                r1.a()     // Catch: java.lang.InterruptedException -> L0
                goto L0
            L19:
                r1 = move-exception
                monitor-exit(r0)     // Catch: java.lang.Throwable -> L19
                throw r1     // Catch: java.lang.InterruptedException -> L0
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.eds.a.run():void");
        }
    }

    static eds e() throws InterruptedException {
        eds edsVar = b.f;
        if (edsVar == null) {
            long nanoTime = System.nanoTime();
            eds.class.wait(a);
            if (b.f == null && System.nanoTime() - nanoTime >= d) {
                return b;
            }
            return null;
        }
        long nanoTime2 = edsVar.g - System.nanoTime();
        if (nanoTime2 > 0) {
            long j = nanoTime2 / 1000000;
            eds.class.wait(j, (int) (nanoTime2 - (1000000 * j)));
            return null;
        }
        b.f = edsVar.f;
        edsVar.f = null;
        return edsVar;
    }
}
