package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bsf  reason: default package */
/* loaded from: classes2.dex */
public final class bsf implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ brs b;

    public bsf(brs brsVar, AtomicReference atomicReference) {
        this.b = brsVar;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            this.a.set(Integer.valueOf(this.b.s().b(this.b.f().v(), blk.N)));
            this.a.notify();
        }
    }
}
