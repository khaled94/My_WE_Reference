package defpackage;

import defpackage.ebz;
import java.io.IOException;
import java.lang.ref.Reference;
import java.net.Proxy;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.List;
import java.util.concurrent.Executor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* renamed from: ebw */
/* loaded from: classes2.dex */
public final class ebw {
    boolean f;
    private final long h;
    static final /* synthetic */ boolean g = !ebw.class.desiredAssertionStatus();
    static final Executor a = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), ebk.a("OkHttp ConnectionPool", true));
    final Runnable c = new Runnable() { // from class: -$$Lambda$ebw$kabXP9De5Z_GU_3YIKovarwH0rg
        @Override // java.lang.Runnable
        public final void run() {
            ebw.lambda$kabXP9De5Z_GU_3YIKovarwH0rg(ebw.this);
        }
    };
    final Deque<ebv> d = new ArrayDeque();
    final ebx e = new ebx();
    final int b = 5;

    public static /* synthetic */ void lambda$kabXP9De5Z_GU_3YIKovarwH0rg(ebw ebwVar) {
        ebwVar.a();
    }

    public /* synthetic */ void a() {
        while (true) {
            long a2 = a(System.nanoTime());
            if (a2 == -1) {
                return;
            }
            if (a2 > 0) {
                long j = a2 / 1000000;
                long j2 = a2 - (1000000 * j);
                synchronized (this) {
                    try {
                        wait(j, (int) j2);
                    } catch (InterruptedException unused) {
                    }
                }
            }
        }
    }

    public ebw(TimeUnit timeUnit) {
        this.h = timeUnit.toNanos(5L);
    }

    public final boolean a(dzz dzzVar, ebz ebzVar, List<ebe> list, boolean z) {
        if (g || Thread.holdsLock(this)) {
            for (ebv ebvVar : this.d) {
                if (!z || ebvVar.e()) {
                    if (ebvVar.a(dzzVar, list)) {
                        ebzVar.a(ebvVar);
                        return true;
                    }
                }
            }
            return false;
        }
        throw new AssertionError();
    }

    private long a(long j) {
        int size;
        synchronized (this) {
            ebv ebvVar = null;
            long j2 = Long.MIN_VALUE;
            int i = 0;
            int i2 = 0;
            for (ebv ebvVar2 : this.d) {
                List<Reference<ebz>> list = ebvVar2.l;
                int i3 = 0;
                while (true) {
                    if (i3 < list.size()) {
                        Reference<ebz> reference = list.get(i3);
                        if (reference.get() == null) {
                            edk.e().a("A connection to " + ebvVar2.b.a.a + " was leaked. Did you forget to close a response body?", ((ebz.a) reference).a);
                            list.remove(i3);
                            ebvVar2.i = true;
                            if (list.isEmpty()) {
                                ebvVar2.m = j - this.h;
                                size = 0;
                                break;
                            }
                        } else {
                            i3++;
                        }
                    } else {
                        size = list.size();
                        break;
                    }
                }
                if (size > 0) {
                    i2++;
                } else {
                    i++;
                    long j3 = j - ebvVar2.m;
                    if (j3 > j2) {
                        ebvVar = ebvVar2;
                        j2 = j3;
                    }
                }
            }
            if (j2 < this.h && i <= this.b) {
                if (i > 0) {
                    return this.h - j2;
                } else if (i2 > 0) {
                    return this.h;
                } else {
                    this.f = false;
                    return -1L;
                }
            }
            this.d.remove(ebvVar);
            ebk.a(ebvVar.d);
            return 0L;
        }
    }

    public final void a(ebe ebeVar, IOException iOException) {
        if (ebeVar.b.type() != Proxy.Type.DIRECT) {
            dzz dzzVar = ebeVar.a;
            dzzVar.g.connectFailed(dzzVar.a.b(), ebeVar.b.address(), iOException);
        }
        this.e.a(ebeVar);
    }
}
