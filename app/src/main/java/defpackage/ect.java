package defpackage;

import java.io.EOFException;
import java.io.IOException;
import java.io.InterruptedIOException;
import java.net.SocketTimeoutException;
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.concurrent.RejectedExecutionException;
import okhttp3.internal.http2.StreamResetException;

/* renamed from: ect  reason: default package */
/* loaded from: classes2.dex */
public final class ect {
    static final /* synthetic */ boolean k = !ect.class.desiredAssertionStatus();
    long b;
    final int c;
    final ecq d;
    final b e;
    final a f;
    ecm i;
    IOException j;
    private boolean m;
    long a = 0;
    private final Deque<ear> l = new ArrayDeque();
    final c g = new c();
    final c h = new c();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ect(int i, ecq ecqVar, boolean z, boolean z2, ear earVar) {
        if (ecqVar == null) {
            throw new NullPointerException("connection == null");
        }
        this.c = i;
        this.d = ecqVar;
        this.b = ecqVar.o.b();
        this.e = new b(ecqVar.n.b());
        this.f = new a();
        this.e.b = z2;
        this.f.b = z;
        if (earVar != null) {
            this.l.add(earVar);
        }
        if (b() && earVar != null) {
            throw new IllegalStateException("locally-initiated streams shouldn't have headers yet");
        }
        if (!b() && earVar == null) {
            throw new IllegalStateException("remotely-initiated streams should have headers");
        }
    }

    public final synchronized boolean a() {
        if (this.i != null) {
            return false;
        }
        if ((this.e.b || this.e.a) && (this.f.b || this.f.a)) {
            if (this.m) {
                return false;
            }
        }
        return true;
    }

    public final boolean b() {
        return this.d.a == ((this.c & 1) == 1);
    }

    public final synchronized ear c() throws IOException {
        this.g.A_();
        while (this.l.isEmpty() && this.i == null) {
            g();
        }
        this.g.b();
        if (!this.l.isEmpty()) {
        } else if (this.j == null) {
            throw new StreamResetException(this.i);
        } else {
            throw this.j;
        }
        return this.l.removeFirst();
    }

    public final eem d() {
        synchronized (this) {
            if (!this.m && !b()) {
                throw new IllegalStateException("reply before requesting the sink");
            }
        }
        return this.f;
    }

    public final void a(ecm ecmVar, IOException iOException) throws IOException {
        if (!b(ecmVar, iOException)) {
            return;
        }
        this.d.b(this.c, ecmVar);
    }

    public final void a(ecm ecmVar) {
        if (!b(ecmVar, null)) {
            return;
        }
        this.d.a(this.c, ecmVar);
    }

    private boolean b(ecm ecmVar, IOException iOException) {
        if (k || !Thread.holdsLock(this)) {
            synchronized (this) {
                if (this.i != null) {
                    return false;
                }
                if (this.e.b && this.f.b) {
                    return false;
                }
                this.i = ecmVar;
                this.j = iOException;
                notifyAll();
                this.d.b(this.c);
                return true;
            }
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0029 A[Catch: all -> 0x003f, TryCatch #0 {, blocks: (B:9:0x0012, B:13:0x001a, B:14:0x0020, B:16:0x0029, B:17:0x002d, B:18:0x0034), top: B:25:0x0012 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void a(defpackage.ear r3, boolean r4) {
        /*
            r2 = this;
            boolean r0 = defpackage.ect.k
            if (r0 != 0) goto L11
            boolean r0 = java.lang.Thread.holdsLock(r2)
            if (r0 != 0) goto Lb
            goto L11
        Lb:
            java.lang.AssertionError r3 = new java.lang.AssertionError
            r3.<init>()
            throw r3
        L11:
            monitor-enter(r2)
            boolean r0 = r2.m     // Catch: java.lang.Throwable -> L3f
            r1 = 1
            if (r0 == 0) goto L20
            if (r4 != 0) goto L1a
            goto L20
        L1a:
            ect$b r0 = r2.e     // Catch: java.lang.Throwable -> L3f
            defpackage.ect.b.a(r0, r3)     // Catch: java.lang.Throwable -> L3f
            goto L27
        L20:
            r2.m = r1     // Catch: java.lang.Throwable -> L3f
            java.util.Deque<ear> r0 = r2.l     // Catch: java.lang.Throwable -> L3f
            r0.add(r3)     // Catch: java.lang.Throwable -> L3f
        L27:
            if (r4 == 0) goto L2d
            ect$b r3 = r2.e     // Catch: java.lang.Throwable -> L3f
            r3.b = r1     // Catch: java.lang.Throwable -> L3f
        L2d:
            boolean r3 = r2.a()     // Catch: java.lang.Throwable -> L3f
            r2.notifyAll()     // Catch: java.lang.Throwable -> L3f
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            if (r3 != 0) goto L3e
            ecq r3 = r2.d
            int r4 = r2.c
            r3.b(r4)
        L3e:
            return
        L3f:
            r3 = move-exception
            monitor-exit(r2)     // Catch: java.lang.Throwable -> L3f
            throw r3
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ect.a(ear, boolean):void");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void b(ecm ecmVar) {
        if (this.i == null) {
            this.i = ecmVar;
            notifyAll();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ect$b */
    /* loaded from: classes2.dex */
    public final class b implements een {
        static final /* synthetic */ boolean c = !ect.class.desiredAssertionStatus();
        boolean a;
        boolean b;
        private final edu e = new edu();
        private final edu f = new edu();
        private final long g;
        private ear h;

        b(long j) {
            this.g = j;
        }

        /* JADX WARN: Removed duplicated region for block: B:34:0x009b  */
        /* JADX WARN: Removed duplicated region for block: B:36:0x009f  */
        @Override // defpackage.een
        /*
            Code decompiled incorrectly, please refer to instructions dump.
            To view partially-correct code enable 'Show inconsistent code' option in preferences
        */
        public final long a(defpackage.edu r11, long r12) throws java.io.IOException {
            /*
                r10 = this;
                r0 = 0
                int r2 = (r12 > r0 ? 1 : (r12 == r0 ? 0 : -1))
                if (r2 < 0) goto Lb7
            L6:
                r2 = 0
                ect r3 = defpackage.ect.this
                monitor-enter(r3)
                ect r4 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lb4
                ect$c r4 = r4.g     // Catch: java.lang.Throwable -> Lb4
                r4.A_()     // Catch: java.lang.Throwable -> Lb4
                ect r4 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lab
                ecm r4 = r4.i     // Catch: java.lang.Throwable -> Lab
                if (r4 == 0) goto L2b
                ect r2 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lab
                java.io.IOException r2 = r2.j     // Catch: java.lang.Throwable -> Lab
                if (r2 == 0) goto L22
                ect r2 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lab
                java.io.IOException r2 = r2.j     // Catch: java.lang.Throwable -> Lab
                goto L2b
            L22:
                okhttp3.internal.http2.StreamResetException r2 = new okhttp3.internal.http2.StreamResetException     // Catch: java.lang.Throwable -> Lab
                ect r4 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lab
                ecm r4 = r4.i     // Catch: java.lang.Throwable -> Lab
                r2.<init>(r4)     // Catch: java.lang.Throwable -> Lab
            L2b:
                boolean r4 = r10.a     // Catch: java.lang.Throwable -> Lab
                if (r4 != 0) goto La3
                edu r4 = r10.f     // Catch: java.lang.Throwable -> Lab
                long r4 = r4.b     // Catch: java.lang.Throwable -> Lab
                r6 = -1
                int r8 = (r4 > r0 ? 1 : (r4 == r0 ? 0 : -1))
                if (r8 <= 0) goto L79
                edu r4 = r10.f     // Catch: java.lang.Throwable -> Lab
                edu r5 = r10.f     // Catch: java.lang.Throwable -> Lab
                long r8 = r5.b     // Catch: java.lang.Throwable -> Lab
                long r12 = java.lang.Math.min(r12, r8)     // Catch: java.lang.Throwable -> Lab
                long r11 = r4.a(r11, r12)     // Catch: java.lang.Throwable -> Lab
                ect r13 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lab
                long r4 = r13.a     // Catch: java.lang.Throwable -> Lab
                long r4 = r4 + r11
                r13.a = r4     // Catch: java.lang.Throwable -> Lab
                if (r2 != 0) goto L8f
                ect r13 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lab
                long r4 = r13.a     // Catch: java.lang.Throwable -> Lab
                ect r13 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lab
                ecq r13 = r13.d     // Catch: java.lang.Throwable -> Lab
                ecx r13 = r13.n     // Catch: java.lang.Throwable -> Lab
                int r13 = r13.b()     // Catch: java.lang.Throwable -> Lab
                int r13 = r13 / 2
                long r8 = (long) r13     // Catch: java.lang.Throwable -> Lab
                int r13 = (r4 > r8 ? 1 : (r4 == r8 ? 0 : -1))
                if (r13 < 0) goto L8f
                ect r13 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lab
                ecq r13 = r13.d     // Catch: java.lang.Throwable -> Lab
                ect r4 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lab
                int r4 = r4.c     // Catch: java.lang.Throwable -> Lab
                ect r5 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lab
                long r8 = r5.a     // Catch: java.lang.Throwable -> Lab
                r13.a(r4, r8)     // Catch: java.lang.Throwable -> Lab
                ect r13 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lab
                r13.a = r0     // Catch: java.lang.Throwable -> Lab
                goto L8f
            L79:
                boolean r4 = r10.b     // Catch: java.lang.Throwable -> Lab
                if (r4 != 0) goto L8e
                if (r2 != 0) goto L8e
                ect r2 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lab
                r2.g()     // Catch: java.lang.Throwable -> Lab
                ect r2 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lb4
                ect$c r2 = r2.g     // Catch: java.lang.Throwable -> Lb4
                r2.b()     // Catch: java.lang.Throwable -> Lb4
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb4
                goto L6
            L8e:
                r11 = r6
            L8f:
                ect r13 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lb4
                ect$c r13 = r13.g     // Catch: java.lang.Throwable -> Lb4
                r13.b()     // Catch: java.lang.Throwable -> Lb4
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb4
                int r13 = (r11 > r6 ? 1 : (r11 == r6 ? 0 : -1))
                if (r13 == 0) goto L9f
                r10.a(r11)
                return r11
            L9f:
                if (r2 != 0) goto La2
                return r6
            La2:
                throw r2
            La3:
                java.io.IOException r11 = new java.io.IOException     // Catch: java.lang.Throwable -> Lab
                java.lang.String r12 = "stream closed"
                r11.<init>(r12)     // Catch: java.lang.Throwable -> Lab
                throw r11     // Catch: java.lang.Throwable -> Lab
            Lab:
                r11 = move-exception
                ect r12 = defpackage.ect.this     // Catch: java.lang.Throwable -> Lb4
                ect$c r12 = r12.g     // Catch: java.lang.Throwable -> Lb4
                r12.b()     // Catch: java.lang.Throwable -> Lb4
                throw r11     // Catch: java.lang.Throwable -> Lb4
            Lb4:
                r11 = move-exception
                monitor-exit(r3)     // Catch: java.lang.Throwable -> Lb4
                throw r11
            Lb7:
                java.lang.IllegalArgumentException r11 = new java.lang.IllegalArgumentException
                java.lang.String r0 = "byteCount < 0: "
                java.lang.String r12 = java.lang.String.valueOf(r12)
                java.lang.String r12 = r0.concat(r12)
                r11.<init>(r12)
                throw r11
            */
            throw new UnsupportedOperationException("Method not decompiled: defpackage.ect.b.a(edu, long):long");
        }

        private void a(long j) {
            if (c || !Thread.holdsLock(ect.this)) {
                ect.this.d.a(j);
                return;
            }
            throw new AssertionError();
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        public final void a(edw edwVar, long j) throws IOException {
            boolean z;
            boolean z2;
            boolean z3;
            long j2;
            if (c || !Thread.holdsLock(ect.this)) {
                while (j > 0) {
                    synchronized (ect.this) {
                        z = this.b;
                        z2 = true;
                        z3 = this.f.b + j > this.g;
                    }
                    if (z3) {
                        edwVar.h(j);
                        ect.this.a(ecm.FLOW_CONTROL_ERROR);
                        return;
                    } else if (z) {
                        edwVar.h(j);
                        return;
                    } else {
                        long a = edwVar.a(this.e, j);
                        if (a == -1) {
                            throw new EOFException();
                        }
                        j -= a;
                        synchronized (ect.this) {
                            if (this.a) {
                                j2 = this.e.b;
                                this.e.q();
                            } else {
                                if (this.f.b != 0) {
                                    z2 = false;
                                }
                                this.f.a((een) this.e);
                                if (z2) {
                                    ect.this.notifyAll();
                                }
                                j2 = 0;
                            }
                        }
                        if (j2 > 0) {
                            a(j2);
                        }
                    }
                }
                return;
            }
            throw new AssertionError();
        }

        @Override // defpackage.een
        public final eeo a() {
            return ect.this.g;
        }

        @Override // defpackage.een, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            long j;
            synchronized (ect.this) {
                this.a = true;
                j = this.f.b;
                this.f.q();
                ect.this.notifyAll();
            }
            if (j > 0) {
                a(j);
            }
            ect.this.e();
        }
    }

    final void e() throws IOException {
        boolean z;
        boolean a2;
        if (k || !Thread.holdsLock(this)) {
            synchronized (this) {
                z = !this.e.b && this.e.a && (this.f.b || this.f.a);
                a2 = a();
            }
            if (z) {
                a(ecm.CANCEL, (IOException) null);
                return;
            } else if (a2) {
                return;
            } else {
                this.d.b(this.c);
                return;
            }
        }
        throw new AssertionError();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ect$a */
    /* loaded from: classes2.dex */
    public final class a implements eem {
        static final /* synthetic */ boolean c = !ect.class.desiredAssertionStatus();
        boolean a;
        boolean b;
        private final edu e = new edu();
        private ear f;

        a() {
        }

        @Override // defpackage.eem
        public final void a_(edu eduVar, long j) throws IOException {
            if (c || !Thread.holdsLock(ect.this)) {
                this.e.a_(eduVar, j);
                while (this.e.b >= 16384) {
                    a(false);
                }
                return;
            }
            throw new AssertionError();
        }

        private void a(boolean z) throws IOException {
            long min;
            boolean z2;
            synchronized (ect.this) {
                ect.this.h.A_();
                while (ect.this.b <= 0 && !this.b && !this.a && ect.this.i == null) {
                    ect.this.g();
                }
                ect.this.h.b();
                ect.this.f();
                min = Math.min(ect.this.b, this.e.b);
                ect.this.b -= min;
            }
            ect.this.h.A_();
            if (z) {
                try {
                    if (min == this.e.b) {
                        z2 = true;
                        ect.this.d.a(ect.this.c, z2, this.e, min);
                        ect.this.h.b();
                    }
                } catch (Throwable th) {
                    ect.this.h.b();
                    throw th;
                }
            }
            z2 = false;
            ect.this.d.a(ect.this.c, z2, this.e, min);
            ect.this.h.b();
        }

        @Override // defpackage.eem, java.io.Flushable
        public final void flush() throws IOException {
            if (c || !Thread.holdsLock(ect.this)) {
                synchronized (ect.this) {
                    ect.this.f();
                }
                while (this.e.b > 0) {
                    a(false);
                    ect.this.d.q.b();
                }
                return;
            }
            throw new AssertionError();
        }

        @Override // defpackage.eem
        public final eeo a() {
            return ect.this.h;
        }

        @Override // defpackage.eem, java.io.Closeable, java.lang.AutoCloseable
        public final void close() throws IOException {
            if (c || !Thread.holdsLock(ect.this)) {
                synchronized (ect.this) {
                    if (this.a) {
                        return;
                    }
                    if (!ect.this.f.b) {
                        boolean z = this.e.b > 0;
                        if (this.f != null) {
                            while (this.e.b > 0) {
                                a(false);
                            }
                            ect.this.d.q.a(true, ect.this.c, ebk.a(this.f));
                        } else if (!z) {
                            ect.this.d.a(ect.this.c, true, null, 0L);
                        } else {
                            while (this.e.b > 0) {
                                a(true);
                            }
                        }
                    }
                    synchronized (ect.this) {
                        this.a = true;
                    }
                    ect.this.d.q.b();
                    ect.this.e();
                    return;
                }
            }
            throw new AssertionError();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(long j) {
        this.b += j;
        if (j > 0) {
            notifyAll();
        }
    }

    final void f() throws IOException {
        if (this.f.a) {
            throw new IOException("stream closed");
        }
        if (this.f.b) {
            throw new IOException("stream finished");
        }
        if (this.i == null) {
            return;
        }
        IOException iOException = this.j;
        if (iOException == null) {
            throw new StreamResetException(this.i);
        }
    }

    final void g() throws InterruptedIOException {
        try {
            wait();
        } catch (InterruptedException unused) {
            Thread.currentThread().interrupt();
            throw new InterruptedIOException();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ect$c */
    /* loaded from: classes2.dex */
    public class c extends eds {
        c() {
        }

        @Override // defpackage.eds
        public final void a() {
            ect.this.a(ecm.CANCEL);
            final ecq ecqVar = ect.this.d;
            synchronized (ecqVar) {
                if (ecqVar.j < ecqVar.i) {
                    return;
                }
                ecqVar.i++;
                ecqVar.k = System.nanoTime() + 1000000000;
                try {
                    ecqVar.g.execute(new ebi("OkHttp %s ping", ecqVar.d) { // from class: ecq.3
                        @Override // defpackage.ebi
                        public final void b() {
                            ecqVar.a(false, 2, 0);
                        }
                    });
                } catch (RejectedExecutionException unused) {
                }
            }
        }

        @Override // defpackage.eds
        public final IOException a(IOException iOException) {
            SocketTimeoutException socketTimeoutException = new SocketTimeoutException("timeout");
            if (iOException != null) {
                socketTimeoutException.initCause(iOException);
            }
            return socketTimeoutException;
        }

        public final void b() throws IOException {
            if (!B_()) {
                return;
            }
            throw a((IOException) null);
        }
    }
}
