package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bxc  reason: default package */
/* loaded from: classes2.dex */
public final class bxc<TResult> implements bxf<TResult> {
    final Object a = new Object();
    bwj<? super TResult> b;
    private final Executor c;

    public bxc(Executor executor, bwj<? super TResult> bwjVar) {
        this.c = executor;
        this.b = bwjVar;
    }

    @Override // defpackage.bxf
    public final void a(bwl<TResult> bwlVar) {
        if (bwlVar.e()) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new bxb(this, bwlVar));
            }
        }
    }
}
