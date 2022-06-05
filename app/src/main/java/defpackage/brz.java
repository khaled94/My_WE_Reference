package defpackage;

import java.util.concurrent.atomic.AtomicReference;

/* renamed from: brz  reason: default package */
/* loaded from: classes2.dex */
public final class brz implements Runnable {
    private final /* synthetic */ AtomicReference a;
    private final /* synthetic */ brs b;

    public brz(brs brsVar, AtomicReference atomicReference) {
        this.b = brsVar;
        this.a = atomicReference;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str;
        synchronized (this.a) {
            AtomicReference atomicReference = this.a;
            bvf s = this.b.s();
            String v = this.b.f().v();
            bow<String> bowVar = blk.L;
            if (v == null) {
                str = bowVar.a(null);
            } else {
                str = bowVar.a(s.a.a(v, bowVar.a));
            }
            atomicReference.set(str);
            this.a.notify();
        }
    }
}
