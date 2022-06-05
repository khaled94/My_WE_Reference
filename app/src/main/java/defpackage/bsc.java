package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: bsc  reason: default package */
/* loaded from: classes2.dex */
public final class bsc implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ brs b;

    public bsc(brs brsVar, AtomicReference atomicReference) {
        this.b = brsVar;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            this.a.set(Long.valueOf(this.b.s().a(this.b.f().v(), blk.M)));
            this.a.notify();
        }
    }
}
