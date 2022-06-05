package defpackage;

import defpackage.ecs;
import java.io.Closeable;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.Socket;
import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.RejectedExecutionException;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.ScheduledThreadPoolExecutor;
import java.util.concurrent.SynchronousQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;
import java.util.logging.Level;

/* renamed from: ecq  reason: default package */
/* loaded from: classes2.dex */
public final class ecq implements Closeable {
    static final /* synthetic */ boolean t = !ecq.class.desiredAssertionStatus();
    private static final ExecutorService u = new ThreadPoolExecutor(0, Integer.MAX_VALUE, 60, TimeUnit.SECONDS, new SynchronousQueue(), ebk.a("OkHttp Http2Connection", true));
    final boolean a;
    final c b;
    final String d;
    int e;
    int f;
    final ScheduledExecutorService g;
    final ecw h;
    long m;
    final Socket p;
    final ecu q;
    final e r;
    private boolean v;
    private final ExecutorService w;
    final Map<Integer, ect> c = new LinkedHashMap();
    private long x = 0;
    private long y = 0;
    long i = 0;
    long j = 0;
    private long z = 0;
    private long A = 0;
    long k = 0;
    long l = 0;
    ecx n = new ecx();
    final ecx o = new ecx();
    final Set<Integer> s = new LinkedHashSet();

    /* renamed from: ecq$c */
    /* loaded from: classes2.dex */
    public static abstract class c {
        public static final c o = new c() { // from class: ecq.c.1
            @Override // defpackage.ecq.c
            public final void a(ect ectVar) throws IOException {
                ectVar.a(ecm.REFUSED_STREAM, (IOException) null);
            }
        };

        public void a(ecq ecqVar) {
        }

        public abstract void a(ect ectVar) throws IOException;
    }

    static boolean c(int i) {
        return i != 0 && (i & 1) == 0;
    }

    static /* synthetic */ long c(ecq ecqVar) {
        long j = ecqVar.x;
        ecqVar.x = 1 + j;
        return j;
    }

    static /* synthetic */ long f(ecq ecqVar) {
        long j = ecqVar.y;
        ecqVar.y = 1 + j;
        return j;
    }

    static /* synthetic */ long g(ecq ecqVar) {
        long j = ecqVar.j;
        ecqVar.j = 1 + j;
        return j;
    }

    static /* synthetic */ long h(ecq ecqVar) {
        long j = ecqVar.A;
        ecqVar.A = 1 + j;
        return j;
    }

    ecq(a aVar) {
        this.h = aVar.f;
        this.a = aVar.g;
        this.b = aVar.e;
        this.f = aVar.g ? 1 : 2;
        if (aVar.g) {
            this.f += 2;
        }
        if (aVar.g) {
            this.n.a(7, 16777216);
        }
        this.d = aVar.b;
        this.g = new ScheduledThreadPoolExecutor(1, ebk.a(ebk.a("OkHttp %s Writer", this.d), false));
        if (aVar.h != 0) {
            this.g.scheduleAtFixedRate(new b(), aVar.h, aVar.h, TimeUnit.MILLISECONDS);
        }
        this.w = new ThreadPoolExecutor(0, 1, 60L, TimeUnit.SECONDS, new LinkedBlockingQueue(), ebk.a(ebk.a("OkHttp %s Push Observer", this.d), true));
        this.o.a(7, 65535);
        this.o.a(5, 16384);
        this.m = this.o.b();
        this.p = aVar.a;
        this.q = new ecu(aVar.d, this.a);
        this.r = new e(new ecs(aVar.c, this.a));
    }

    final synchronized ect a(int i) {
        return this.c.get(Integer.valueOf(i));
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized ect b(int i) {
        ect remove;
        remove = this.c.remove(Integer.valueOf(i));
        notifyAll();
        return remove;
    }

    public final synchronized int a() {
        ecx ecxVar = this.o;
        if ((ecxVar.a & 16) != 0) {
            return ecxVar.b[4];
        }
        return Integer.MAX_VALUE;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void a(long j) {
        long j2 = this.l + j;
        this.l = j2;
        if (j2 >= this.n.b() / 2) {
            a(0, this.l);
            this.l = 0L;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0043 A[Catch: all -> 0x0061, TryCatch #1 {, blocks: (B:4:0x0005, B:23:0x004d, B:24:0x0052, B:5:0x0006, B:7:0x000d, B:8:0x0012, B:10:0x0016, B:12:0x002b, B:14:0x0033, B:19:0x003d, B:21:0x0043, B:22:0x004c, B:28:0x005b, B:29:0x0060), top: B:33:0x0005 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.ect a(java.util.List<defpackage.ecn> r11, boolean r12) throws java.io.IOException {
        /*
            r10 = this;
            r6 = r12 ^ 1
            ecu r7 = r10.q
            monitor-enter(r7)
            monitor-enter(r10)     // Catch: java.lang.Throwable -> L64
            int r0 = r10.f     // Catch: java.lang.Throwable -> L61
            r1 = 1073741823(0x3fffffff, float:1.9999999)
            if (r0 <= r1) goto L12
            ecm r0 = defpackage.ecm.REFUSED_STREAM     // Catch: java.lang.Throwable -> L61
            r10.a(r0)     // Catch: java.lang.Throwable -> L61
        L12:
            boolean r0 = r10.v     // Catch: java.lang.Throwable -> L61
            if (r0 != 0) goto L5b
            int r8 = r10.f     // Catch: java.lang.Throwable -> L61
            int r0 = r10.f     // Catch: java.lang.Throwable -> L61
            int r0 = r0 + 2
            r10.f = r0     // Catch: java.lang.Throwable -> L61
            ect r9 = new ect     // Catch: java.lang.Throwable -> L61
            r4 = 0
            r5 = 0
            r0 = r9
            r1 = r8
            r2 = r10
            r3 = r6
            r0.<init>(r1, r2, r3, r4, r5)     // Catch: java.lang.Throwable -> L61
            if (r12 == 0) goto L3c
            long r0 = r10.m     // Catch: java.lang.Throwable -> L61
            r2 = 0
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 == 0) goto L3c
            long r0 = r9.b     // Catch: java.lang.Throwable -> L61
            int r12 = (r0 > r2 ? 1 : (r0 == r2 ? 0 : -1))
            if (r12 != 0) goto L3a
            goto L3c
        L3a:
            r12 = 0
            goto L3d
        L3c:
            r12 = 1
        L3d:
            boolean r0 = r9.a()     // Catch: java.lang.Throwable -> L61
            if (r0 == 0) goto L4c
            java.util.Map<java.lang.Integer, ect> r0 = r10.c     // Catch: java.lang.Throwable -> L61
            java.lang.Integer r1 = java.lang.Integer.valueOf(r8)     // Catch: java.lang.Throwable -> L61
            r0.put(r1, r9)     // Catch: java.lang.Throwable -> L61
        L4c:
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L61
            ecu r0 = r10.q     // Catch: java.lang.Throwable -> L64
            r0.a(r6, r8, r11)     // Catch: java.lang.Throwable -> L64
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L64
            if (r12 == 0) goto L5a
            ecu r11 = r10.q
            r11.b()
        L5a:
            return r9
        L5b:
            okhttp3.internal.http2.ConnectionShutdownException r11 = new okhttp3.internal.http2.ConnectionShutdownException     // Catch: java.lang.Throwable -> L61
            r11.<init>()     // Catch: java.lang.Throwable -> L61
            throw r11     // Catch: java.lang.Throwable -> L61
        L61:
            r11 = move-exception
            monitor-exit(r10)     // Catch: java.lang.Throwable -> L61
            throw r11     // Catch: java.lang.Throwable -> L64
        L64:
            r11 = move-exception
            monitor-exit(r7)     // Catch: java.lang.Throwable -> L64
            throw r11
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ecq.a(java.util.List, boolean):ect");
    }

    public final void a(int i, boolean z, edu eduVar, long j) throws IOException {
        int min;
        long j2;
        if (j == 0) {
            this.q.a(z, i, eduVar, 0);
            return;
        }
        while (j > 0) {
            synchronized (this) {
                while (this.m <= 0) {
                    try {
                        if (!this.c.containsKey(Integer.valueOf(i))) {
                            throw new IOException("stream closed");
                        }
                        wait();
                    } catch (InterruptedException unused) {
                        Thread.currentThread().interrupt();
                        throw new InterruptedIOException();
                    }
                }
                min = Math.min((int) Math.min(j, this.m), this.q.a);
                j2 = min;
                this.m -= j2;
            }
            j -= j2;
            this.q.a(z && j == 0, i, eduVar, min);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final int i, final ecm ecmVar) {
        try {
            this.g.execute(new ebi("OkHttp %s stream %d", new Object[]{this.d, Integer.valueOf(i)}) { // from class: ecq.1
                @Override // defpackage.ebi
                public final void b() {
                    try {
                        ecq.this.b(i, ecmVar);
                    } catch (IOException e2) {
                        ecq.this.a(e2);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(int i, ecm ecmVar) throws IOException {
        this.q.a(i, ecmVar);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(final int i, final long j) {
        try {
            this.g.execute(new ebi("OkHttp Window Update %s stream %d", new Object[]{this.d, Integer.valueOf(i)}) { // from class: ecq.2
                @Override // defpackage.ebi
                public final void b() {
                    try {
                        ecq.this.q.a(i, j);
                    } catch (IOException e2) {
                        ecq.this.a(e2);
                    }
                }
            });
        } catch (RejectedExecutionException unused) {
        }
    }

    /* renamed from: ecq$d */
    /* loaded from: classes2.dex */
    final class d extends ebi {
        final boolean a = true;
        final int b;
        final int c;

        d(int i, int i2) {
            super("OkHttp %s ping %08x%08x", ecq.this.d, Integer.valueOf(i), Integer.valueOf(i2));
            this.b = i;
            this.c = i2;
        }

        @Override // defpackage.ebi
        public final void b() {
            ecq.this.a(this.a, this.b, this.c);
        }
    }

    /* renamed from: ecq$b */
    /* loaded from: classes2.dex */
    final class b extends ebi {
        b() {
            super("OkHttp %s ping", ecq.this.d);
        }

        @Override // defpackage.ebi
        public final void b() {
            boolean z;
            synchronized (ecq.this) {
                if (ecq.this.y < ecq.this.x) {
                    z = true;
                } else {
                    ecq.c(ecq.this);
                    z = false;
                }
            }
            if (z) {
                ecq.this.a((IOException) null);
            } else {
                ecq.this.a(false, 1, 0);
            }
        }
    }

    final void a(boolean z, int i, int i2) {
        try {
            this.q.a(z, i, i2);
        } catch (IOException e2) {
            a(e2);
        }
    }

    private void a(ecm ecmVar) throws IOException {
        synchronized (this.q) {
            synchronized (this) {
                if (this.v) {
                    return;
                }
                this.v = true;
                this.q.a(this.e, ecmVar, ebk.a);
            }
        }
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        a(ecm.NO_ERROR, ecm.CANCEL, (IOException) null);
    }

    final void a(ecm ecmVar, ecm ecmVar2, IOException iOException) {
        if (t || !Thread.holdsLock(this)) {
            try {
                a(ecmVar);
            } catch (IOException unused) {
            }
            ect[] ectVarArr = null;
            synchronized (this) {
                if (!this.c.isEmpty()) {
                    ectVarArr = (ect[]) this.c.values().toArray(new ect[this.c.size()]);
                    this.c.clear();
                }
            }
            if (ectVarArr != null) {
                for (ect ectVar : ectVarArr) {
                    try {
                        ectVar.a(ecmVar2, iOException);
                    } catch (IOException unused2) {
                    }
                }
            }
            try {
                this.q.close();
            } catch (IOException unused3) {
            }
            try {
                this.p.close();
            } catch (IOException unused4) {
            }
            this.g.shutdown();
            this.w.shutdown();
            return;
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(IOException iOException) {
        ecm ecmVar = ecm.PROTOCOL_ERROR;
        a(ecmVar, ecmVar, iOException);
    }

    public final void b() throws IOException {
        this.q.a();
        this.q.b(this.n);
        int b2 = this.n.b();
        if (b2 != 65535) {
            this.q.a(0, b2 - 65535);
        }
        new Thread(this.r).start();
    }

    public final synchronized boolean b(long j) {
        if (this.v) {
            return false;
        }
        if (this.j < this.i) {
            if (j >= this.k) {
                return false;
            }
        }
        return true;
    }

    /* renamed from: ecq$a */
    /* loaded from: classes2.dex */
    public static class a {
        Socket a;
        String b;
        edw c;
        edv d;
        public c e = c.o;
        ecw f = ecw.a;
        boolean g = true;
        public int h;

        public final a a(Socket socket, String str, edw edwVar, edv edvVar) {
            this.a = socket;
            this.b = str;
            this.c = edwVar;
            this.d = edvVar;
            return this;
        }

        public final ecq a() {
            return new ecq(this);
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ecq$e */
    /* loaded from: classes2.dex */
    public class e extends ebi implements ecs.b {
        final ecs a;

        e(ecs ecsVar) {
            super("OkHttp %s", ecq.this.d);
            this.a = ecsVar;
        }

        @Override // defpackage.ebi
        public final void b() {
            ecm ecmVar;
            ecm ecmVar2;
            ecm ecmVar3 = ecm.INTERNAL_ERROR;
            ecm ecmVar4 = ecm.INTERNAL_ERROR;
            IOException e = null;
            try {
                try {
                    ecs ecsVar = this.a;
                    if (ecsVar.c) {
                        if (!ecsVar.a(true, this)) {
                            throw ecp.b("Required SETTINGS preface not received", new Object[0]);
                        }
                    } else {
                        edx d = ecsVar.b.d(ecp.a.g());
                        if (ecs.a.isLoggable(Level.FINE)) {
                            ecs.a.fine(ebk.a("<< CONNECTION %s", d.e()));
                        }
                        if (!ecp.a.equals(d)) {
                            throw ecp.b("Expected a connection header but was %s", d.a());
                        }
                    }
                    do {
                    } while (this.a.a(false, this));
                    ecmVar = ecm.NO_ERROR;
                    ecmVar2 = ecm.CANCEL;
                } catch (IOException e2) {
                    e = e2;
                    ecmVar = ecm.PROTOCOL_ERROR;
                    ecmVar2 = ecm.PROTOCOL_ERROR;
                }
            } finally {
                ecq.this.a(ecmVar3, ecmVar4, (IOException) null);
                ebk.a(this.a);
            }
        }

        @Override // defpackage.ecs.b
        public final void a(final boolean z, final int i, edw edwVar, final int i2) throws IOException {
            if (ecq.c(i)) {
                final ecq ecqVar = ecq.this;
                final edu eduVar = new edu();
                long j = i2;
                edwVar.a(j);
                edwVar.a(eduVar, j);
                if (eduVar.b != j) {
                    throw new IOException(eduVar.b + " != " + i2);
                }
                ecqVar.a(new ebi("OkHttp %s Push Data[%s]", new Object[]{ecqVar.d, Integer.valueOf(i)}) { // from class: ecq.6
                    @Override // defpackage.ebi
                    public final void b() {
                        try {
                            ecq.this.h.a(eduVar, i2);
                            ecq.this.q.a(i, ecm.CANCEL);
                            synchronized (ecq.this) {
                                ecq.this.s.remove(Integer.valueOf(i));
                            }
                        } catch (IOException unused) {
                        }
                    }
                });
                return;
            }
            ect a = ecq.this.a(i);
            if (a == null) {
                ecq.this.a(i, ecm.PROTOCOL_ERROR);
                long j2 = i2;
                ecq.this.a(j2);
                edwVar.h(j2);
            } else if (!ect.k && Thread.holdsLock(a)) {
                throw new AssertionError();
            } else {
                a.e.a(edwVar, i2);
                if (!z) {
                    return;
                }
                a.a(ebk.c, true);
            }
        }

        @Override // defpackage.ecs.b
        public final void a(final boolean z, final int i, final List<ecn> list) {
            if (ecq.c(i)) {
                final ecq ecqVar = ecq.this;
                try {
                    ecqVar.a(new ebi("OkHttp %s Push Headers[%s]", new Object[]{ecqVar.d, Integer.valueOf(i)}) { // from class: ecq.5
                        @Override // defpackage.ebi
                        public final void b() {
                            try {
                                ecq.this.q.a(i, ecm.CANCEL);
                                synchronized (ecq.this) {
                                    ecq.this.s.remove(Integer.valueOf(i));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    });
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (ecq.this) {
                ect a = ecq.this.a(i);
                if (a == null) {
                    if (ecq.this.v) {
                        return;
                    }
                    if (i <= ecq.this.e) {
                        return;
                    }
                    if (i % 2 == ecq.this.f % 2) {
                        return;
                    }
                    final ect ectVar = new ect(i, ecq.this, false, z, ebk.b(list));
                    ecq.this.e = i;
                    ecq.this.c.put(Integer.valueOf(i), ectVar);
                    ecq.u.execute(new ebi("OkHttp %s stream %d", new Object[]{ecq.this.d, Integer.valueOf(i)}) { // from class: ecq.e.1
                        @Override // defpackage.ebi
                        public final void b() {
                            try {
                                ecq.this.b.a(ectVar);
                            } catch (IOException e) {
                                edk e2 = edk.e();
                                e2.a(4, "Http2Connection.Listener failure for " + ecq.this.d, e);
                                try {
                                    ectVar.a(ecm.PROTOCOL_ERROR, e);
                                } catch (IOException unused2) {
                                }
                            }
                        }
                    });
                    return;
                }
                a.a(ebk.b(list), z);
            }
        }

        @Override // defpackage.ecs.b
        public final void a(final int i, final ecm ecmVar) {
            if (ecq.c(i)) {
                final ecq ecqVar = ecq.this;
                ecqVar.a(new ebi("OkHttp %s Push Reset[%s]", new Object[]{ecqVar.d, Integer.valueOf(i)}) { // from class: ecq.7
                    @Override // defpackage.ebi
                    public final void b() {
                        synchronized (ecq.this) {
                            ecq.this.s.remove(Integer.valueOf(i));
                        }
                    }
                });
                return;
            }
            ect b = ecq.this.b(i);
            if (b == null) {
                return;
            }
            b.b(ecmVar);
        }

        @Override // defpackage.ecs.b
        public final void a(final ecx ecxVar) {
            try {
                ecq.this.g.execute(new ebi("OkHttp %s ACK Settings", new Object[]{ecq.this.d}) { // from class: ecq.e.2
                    final /* synthetic */ boolean a = false;

                    @Override // defpackage.ebi
                    public final void b() {
                        ect[] ectVarArr;
                        long j;
                        final e eVar = e.this;
                        boolean z = this.a;
                        ecx ecxVar2 = ecxVar;
                        synchronized (ecq.this.q) {
                            synchronized (ecq.this) {
                                int b = ecq.this.o.b();
                                if (z) {
                                    ecx ecxVar3 = ecq.this.o;
                                    ecxVar3.a = 0;
                                    Arrays.fill(ecxVar3.b, 0);
                                }
                                ecx ecxVar4 = ecq.this.o;
                                for (int i = 0; i < 10; i++) {
                                    if (ecxVar2.a(i)) {
                                        ecxVar4.a(i, ecxVar2.b[i]);
                                    }
                                }
                                int b2 = ecq.this.o.b();
                                ectVarArr = null;
                                if (b2 == -1 || b2 == b) {
                                    j = 0;
                                } else {
                                    j = b2 - b;
                                    if (!ecq.this.c.isEmpty()) {
                                        ectVarArr = (ect[]) ecq.this.c.values().toArray(new ect[ecq.this.c.size()]);
                                    }
                                }
                            }
                            try {
                                ecq.this.q.a(ecq.this.o);
                            } catch (IOException e) {
                                ecq.this.a(e);
                            }
                        }
                        if (ectVarArr != null) {
                            for (ect ectVar : ectVarArr) {
                                synchronized (ectVar) {
                                    ectVar.a(j);
                                }
                            }
                        }
                        ecq.u.execute(new ebi("OkHttp %s settings", ecq.this.d) { // from class: ecq.e.3
                            @Override // defpackage.ebi
                            public final void b() {
                                ecq.this.b.a(ecq.this);
                            }
                        });
                    }
                });
            } catch (RejectedExecutionException unused) {
            }
        }

        @Override // defpackage.ecs.b
        public final void a(boolean z, int i, int i2) {
            if (!z) {
                try {
                    ecq.this.g.execute(new d(i, i2));
                    return;
                } catch (RejectedExecutionException unused) {
                    return;
                }
            }
            synchronized (ecq.this) {
                try {
                    if (i == 1) {
                        ecq.f(ecq.this);
                    } else if (i == 2) {
                        ecq.g(ecq.this);
                    } else if (i == 3) {
                        ecq.h(ecq.this);
                        ecq.this.notifyAll();
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
        }

        @Override // defpackage.ecs.b
        public final void a(int i) {
            ect[] ectVarArr;
            synchronized (ecq.this) {
                ectVarArr = (ect[]) ecq.this.c.values().toArray(new ect[ecq.this.c.size()]);
                ecq.this.v = true;
            }
            for (ect ectVar : ectVarArr) {
                if (ectVar.c > i && ectVar.b()) {
                    ectVar.b(ecm.REFUSED_STREAM);
                    ecq.this.b(ectVar.c);
                }
            }
        }

        @Override // defpackage.ecs.b
        public final void a(int i, long j) {
            if (i == 0) {
                synchronized (ecq.this) {
                    ecq.this.m += j;
                    ecq.this.notifyAll();
                }
                return;
            }
            ect a = ecq.this.a(i);
            if (a == null) {
                return;
            }
            synchronized (a) {
                a.a(j);
            }
        }

        @Override // defpackage.ecs.b
        public final void a(final int i, final List<ecn> list) {
            final ecq ecqVar = ecq.this;
            synchronized (ecqVar) {
                if (ecqVar.s.contains(Integer.valueOf(i))) {
                    ecqVar.a(i, ecm.PROTOCOL_ERROR);
                    return;
                }
                ecqVar.s.add(Integer.valueOf(i));
                try {
                    ecqVar.a(new ebi("OkHttp %s Push Request[%s]", new Object[]{ecqVar.d, Integer.valueOf(i)}) { // from class: ecq.4
                        @Override // defpackage.ebi
                        public final void b() {
                            try {
                                ecq.this.q.a(i, ecm.CANCEL);
                                synchronized (ecq.this) {
                                    ecq.this.s.remove(Integer.valueOf(i));
                                }
                            } catch (IOException unused) {
                            }
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            }
        }
    }

    final synchronized void a(ebi ebiVar) {
        if (!this.v) {
            this.w.execute(ebiVar);
        }
    }
}
