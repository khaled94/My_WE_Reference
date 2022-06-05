package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bse  reason: default package */
/* loaded from: classes2.dex */
public final class bse implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ brs b;

    public bse(brs brsVar, AtomicReference atomicReference) {
        this.b = brsVar;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            this.a.set(Double.valueOf(this.b.s().c(this.b.f().v(), blk.O)));
            this.a.notify();
        }
    }
}
