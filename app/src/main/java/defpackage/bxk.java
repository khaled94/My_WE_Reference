package defpackage;

import java.util.concurrent.Callable;

/* renamed from: bxk  reason: default package */
/* loaded from: classes2.dex */
public final class bxk implements Runnable {
    final /* synthetic */ bxj a;
    final /* synthetic */ Callable b;

    public bxk(bxj bxjVar, Callable callable) {
        this.a = bxjVar;
        this.b = callable;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            this.a.a((bxj) this.b.call());
        } catch (Exception e) {
            this.a.a(e);
        } catch (Throwable th) {
            this.a.a((Exception) new RuntimeException(th));
        }
    }
}
