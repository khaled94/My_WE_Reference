package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bww  reason: default package */
/* loaded from: classes2.dex */
public final class bww<TResult> implements bxf<TResult> {
    final Object a = new Object();
    bwg b;
    private final Executor c;

    public bww(Executor executor, bwg bwgVar) {
        this.c = executor;
        this.b = bwgVar;
    }

    @Override // defpackage.bxf
    public final void a(bwl<TResult> bwlVar) {
        if (bwlVar.c()) {
            synchronized (this.a) {
                if (this.b == null) {
                    return;
                }
                this.c.execute(new bwv(this));
            }
        }
    }
}
