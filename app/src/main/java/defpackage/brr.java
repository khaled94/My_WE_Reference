package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: brr  reason: default package */
/* loaded from: classes2.dex */
public final class brr implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ brs b;

    public brr(brs brsVar, AtomicReference atomicReference) {
        this.b = brsVar;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a) {
            this.a.set(Boolean.valueOf(this.b.s().d(this.b.f().v(), blk.K)));
            this.a.notify();
        }
    }
}
