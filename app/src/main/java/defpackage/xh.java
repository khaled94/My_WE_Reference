package defpackage;

import java.util.concurrent.locks.Lock;

/* renamed from: xh  reason: default package */
/* loaded from: classes2.dex */
abstract class xh {
    private final xg a;

    /* JADX INFO: Access modifiers changed from: protected */
    public xh(xg xgVar) {
        this.a = xgVar;
    }

    protected abstract void a();

    public final void a(xj xjVar) {
        Lock lock;
        xjVar.a.lock();
        try {
            if (xjVar.k == this.a) {
                a();
                lock = xjVar.a;
            } else {
                lock = xjVar.a;
            }
            lock.unlock();
        } catch (Throwable th) {
            xjVar.a.unlock();
            throw th;
        }
    }
}
