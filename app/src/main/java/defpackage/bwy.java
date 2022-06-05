package defpackage;

import java.util.concurrent.Executor;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bwy  reason: default package */
/* loaded from: classes2.dex */
public final class bwy<TResult> implements bxf<TResult> {
    final Object a = new Object();
    bwh<TResult> b;
    private final Executor c;

    public bwy(Executor executor, bwh<TResult> bwhVar) {
        this.c = executor;
        this.b = bwhVar;
    }

    @Override // defpackage.bxf
    public final void a(bwl<TResult> bwlVar) {
        synchronized (this.a) {
            if (this.b == null) {
                return;
            }
            this.c.execute(new bwx(this, bwlVar));
        }
    }
}
