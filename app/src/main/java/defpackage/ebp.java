package defpackage;

import java.io.Closeable;
import java.io.File;
import java.io.Flushable;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.concurrent.Executor;
import java.util.regex.Pattern;

/* renamed from: ebp  reason: default package */
/* loaded from: classes2.dex */
public final class ebp implements Closeable, Flushable {
    final ede b;
    final int c;
    edv d;
    final LinkedHashMap<String, b> e;
    int f;
    boolean g;
    boolean h;
    boolean i;
    private long k;
    private long l;
    private final Executor m;
    private final Runnable n;
    static final /* synthetic */ boolean j = !ebp.class.desiredAssertionStatus();
    static final Pattern a = Pattern.compile("[a-z0-9_-]{1,120}");

    /* renamed from: ebp$a */
    /* loaded from: classes2.dex */
    public final class a {
        final b a;
        boolean b;
        final /* synthetic */ ebp c;
    }

    private synchronized void a(a aVar) throws IOException {
        b bVar = aVar.a;
        if (bVar.f != aVar) {
            throw new IllegalStateException();
        }
        for (int i = 0; i < this.c; i++) {
            this.b.a(bVar.d[i]);
        }
        this.f++;
        bVar.f = null;
        if (false | bVar.e) {
            bVar.e = true;
            this.d.b("CLEAN").h(32);
            this.d.b(bVar.a);
            bVar.a(this.d);
            this.d.h(10);
        } else {
            this.e.remove(bVar.a);
            this.d.b("REMOVE").h(32);
            this.d.b(bVar.a);
            this.d.h(10);
        }
        this.d.flush();
        if (this.l > this.k || a()) {
            this.m.execute(this.n);
        }
    }

    private boolean a() {
        int i = this.f;
        return i >= 2000 && i >= this.e.size();
    }

    private boolean a(b bVar) throws IOException {
        if (bVar.f != null) {
            a aVar = bVar.f;
            if (aVar.a.f == aVar) {
                for (int i = 0; i < aVar.c.c; i++) {
                    try {
                        aVar.c.b.a(aVar.a.d[i]);
                    } catch (IOException unused) {
                    }
                }
                aVar.a.f = null;
            }
        }
        for (int i2 = 0; i2 < this.c; i2++) {
            this.b.a(bVar.c[i2]);
            this.l -= bVar.b[i2];
            bVar.b[i2] = 0;
        }
        this.f++;
        this.d.b("REMOVE").h(32).b(bVar.a).h(10);
        this.e.remove(bVar.a);
        if (a()) {
            this.m.execute(this.n);
        }
        return true;
    }

    private synchronized boolean b() {
        return this.h;
    }

    private synchronized void c() {
        if (b()) {
            throw new IllegalStateException("cache is closed");
        }
    }

    @Override // java.io.Flushable
    public final synchronized void flush() throws IOException {
        if (!this.g) {
            return;
        }
        c();
        d();
        this.d.flush();
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public final synchronized void close() throws IOException {
        b[] bVarArr;
        if (this.g && !this.h) {
            for (b bVar : (b[]) this.e.values().toArray(new b[this.e.size()])) {
                if (bVar.f != null) {
                    a aVar = bVar.f;
                    synchronized (aVar.c) {
                        if (aVar.b) {
                            throw new IllegalStateException();
                        }
                        if (aVar.a.f == aVar) {
                            aVar.c.a(aVar);
                        }
                        aVar.b = true;
                    }
                }
            }
            d();
            this.d.close();
            this.d = null;
            this.h = true;
            return;
        }
        this.h = true;
    }

    private void d() throws IOException {
        while (this.l > this.k) {
            a(this.e.values().iterator().next());
        }
        this.i = false;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ebp$b */
    /* loaded from: classes2.dex */
    public final class b {
        final String a;
        final long[] b;
        final File[] c;
        final File[] d;
        boolean e;
        a f;

        final void a(edv edvVar) throws IOException {
            for (long j : this.b) {
                edvVar.h(32).l(j);
            }
        }
    }
}
