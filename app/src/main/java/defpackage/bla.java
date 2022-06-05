package defpackage;

import android.os.Handler;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bla  reason: default package */
/* loaded from: classes2.dex */
public abstract class bla {
    private static volatile Handler b;
    private final brk a;
    private final Runnable c;
    private volatile long d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bla(brk brkVar) {
        aat.a(brkVar);
        this.a = brkVar;
        this.c = new bld(this, brkVar);
    }

    public abstract void a();

    public final void a(long j) {
        c();
        if (j >= 0) {
            this.d = this.a.l().a();
            if (d().postDelayed(this.c, j)) {
                return;
            }
            this.a.q().c.a("Failed to schedule delayed post. time", Long.valueOf(j));
        }
    }

    public final boolean b() {
        return this.d != 0;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void c() {
        this.d = 0L;
        d().removeCallbacks(this.c);
    }

    private final Handler d() {
        Handler handler;
        if (b != null) {
            return b;
        }
        synchronized (bla.class) {
            if (b == null) {
                b = new ava(this.a.m().getMainLooper());
            }
            handler = b;
        }
        return handler;
    }
}
