package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bws  reason: default package */
/* loaded from: classes2.dex */
final class bws<TResult, TContinuationResult> implements bxf<TResult> {
    final bwf<TResult, TContinuationResult> a;
    final bxj<TContinuationResult> b;
    private final Executor c;

    public bws(Executor executor, bwf<TResult, TContinuationResult> bwfVar, bxj<TContinuationResult> bxjVar) {
        this.c = executor;
        this.a = bwfVar;
        this.b = bxjVar;
    }

    @Override // defpackage.bxf
    public final void a(bwl<TResult> bwlVar) {
        this.c.execute(new bwr(this, bwlVar));
    }
}
