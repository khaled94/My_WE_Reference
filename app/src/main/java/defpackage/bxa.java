package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bxa  reason: default package */
/* loaded from: classes2.dex */
public final class bxa<TResult> implements bxf<TResult> {
    final Object a = new Object();
    bwi b;
    private final Executor c;

    public bxa(Executor executor, bwi bwiVar) {
        this.c = executor;
        this.b = bwiVar;
    }

    @Override // defpackage.bxf
    public final void a(bwl<TResult> bwlVar) {
        if (bwlVar.e() || bwlVar.c()) {
            return;
        }
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.c.execute(new bwz(this, bwlVar));
        }
    }
}
