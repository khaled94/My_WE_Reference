package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bwu  reason: default package */
/* loaded from: classes2.dex */
final class bwu<TResult, TContinuationResult> implements bwg, bwi, bwj<TContinuationResult>, bxf {
    final bwf<TResult, bwl<TContinuationResult>> a;
    final bxj<TContinuationResult> b;
    private final Executor c;

    public bwu(Executor executor, bwf<TResult, bwl<TContinuationResult>> bwfVar, bxj<TContinuationResult> bxjVar) {
        this.c = executor;
        this.a = bwfVar;
        this.b = bxjVar;
    }

    @Override // defpackage.bwg
    public final void a() {
        this.b.f();
    }

    @Override // defpackage.bxf
    public final void a(bwl<TResult> bwlVar) {
        this.c.execute(new bwt(this, bwlVar));
    }

    @Override // defpackage.bwi
    public final void a(Exception exc) {
        this.b.a(exc);
    }

    @Override // defpackage.bwj
    public final void a(TContinuationResult tcontinuationresult) {
        this.b.a((bxj<TContinuationResult>) tcontinuationresult);
    }
}
