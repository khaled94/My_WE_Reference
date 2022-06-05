package defpackage;

import java.util.concurrent.locks.Lock;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: wz  reason: default package */
/* loaded from: classes2.dex */
public abstract class wz implements Runnable {
    final /* synthetic */ xa b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public /* synthetic */ wz(xa xaVar) {
        this.b = xaVar;
    }

    protected abstract void a();

    @Override // java.lang.Runnable
    public final void run() {
        Lock lock;
        this.b.b.lock();
        try {
            try {
                if (!Thread.interrupted()) {
                    a();
                    lock = this.b.b;
                } else {
                    lock = this.b.b;
                }
            } catch (RuntimeException e) {
                xj xjVar = this.b.a;
                xjVar.e.sendMessage(xjVar.e.obtainMessage(2, e));
                lock = this.b.b;
            }
            lock.unlock();
        } catch (Throwable th) {
            this.b.b.unlock();
            throw th;
        }
    }
}
