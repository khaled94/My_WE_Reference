package defpackage;

import java.io.IOException;
import java.io.InterruptedIOException;
import java.util.concurrent.TimeUnit;

/* renamed from: eeo  reason: default package */
/* loaded from: classes2.dex */
public class eeo {
    public static final eeo c = new eeo() { // from class: eeo.1
        @Override // defpackage.eeo
        public final eeo a(long j) {
            return this;
        }

        @Override // defpackage.eeo
        public final eeo a(long j, TimeUnit timeUnit) {
            return this;
        }

        @Override // defpackage.eeo
        public final void f() throws IOException {
        }
    };
    private boolean a;
    private long b;
    private long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static long a(long j, long j2) {
        return j == 0 ? j2 : (j2 != 0 && j >= j2) ? j2 : j;
    }

    public eeo a(long j, TimeUnit timeUnit) {
        if (j >= 0) {
            if (timeUnit == null) {
                throw new IllegalArgumentException("unit == null");
            }
            this.d = timeUnit.toNanos(j);
            return this;
        }
        throw new IllegalArgumentException("timeout < 0: ".concat(String.valueOf(j)));
    }

    public long C_() {
        return this.d;
    }

    public boolean E_() {
        return this.a;
    }

    public long c() {
        if (!this.a) {
            throw new IllegalStateException("No deadline");
        }
        return this.b;
    }

    public eeo a(long j) {
        this.a = true;
        this.b = j;
        return this;
    }

    public eeo d() {
        this.d = 0L;
        return this;
    }

    public eeo D_() {
        this.a = false;
        return this;
    }

    public void f() throws IOException {
        if (Thread.interrupted()) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        } else if (this.a && this.b - System.nanoTime() <= 0) {
            throw new InterruptedIOException("deadline reached");
        }
    }

    public final void a(Object obj) throws InterruptedIOException {
        try {
            boolean E_ = E_();
            long C_ = C_();
            long j = 0;
            if (!E_ && C_ == 0) {
                obj.wait();
                return;
            }
            long nanoTime = System.nanoTime();
            if (E_ && C_ != 0) {
                C_ = Math.min(C_, c() - nanoTime);
            } else if (E_) {
                C_ = c() - nanoTime;
            }
            if (C_ > 0) {
                long j2 = C_ / 1000000;
                Long.signum(j2);
                obj.wait(j2, (int) (C_ - (1000000 * j2)));
                j = System.nanoTime() - nanoTime;
            }
            if (j >= C_) {
                throw new InterruptedIOException("timeout");
            }
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException("interrupted");
        }
    }
}
