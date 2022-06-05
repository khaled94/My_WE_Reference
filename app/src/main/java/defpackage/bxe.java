package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bxe  reason: default package */
/* loaded from: classes2.dex */
final class bxe<TResult, TContinuationResult> implements bwg, bwi, bwj<TContinuationResult>, bxf {
    final bwk<TResult, TContinuationResult> a;
    private final Executor b;
    private final bxj<TContinuationResult> c;

    public bxe(Executor executor, bwk<TResult, TContinuationResult> bwkVar, bxj<TContinuationResult> bxjVar) {
        this.b = executor;
        this.a = bwkVar;
        this.c = bxjVar;
    }

    @Override // defpackage.bwg
    public final void a() {
        this.c.f();
    }

    @Override // defpackage.bxf
    public final void a(bwl<TResult> bwlVar) {
        this.b.execute(new bxd(this, bwlVar));
    }

    @Override // defpackage.bwi
    public final void a(Exception exc) {
        this.c.a(exc);
    }

    @Override // defpackage.bwj
    public final void a(TContinuationResult tcontinuationresult) {
        this.c.a((bxj<TContinuationResult>) tcontinuationresult);
    }
}
