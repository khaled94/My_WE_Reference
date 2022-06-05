package defpackage;

import java.util.concurrent.Executor;

/* renamed from: bwl  reason: default package */
/* loaded from: classes2.dex */
public abstract class bwl<TResult> {
    public <TContinuationResult> bwl<TContinuationResult> a(bwf<TResult, bwl<TContinuationResult>> bwfVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public abstract bwl<TResult> a(bwi bwiVar);

    public abstract bwl<TResult> a(Executor executor, bwi bwiVar);

    public abstract bwl<TResult> a(Executor executor, bwj<? super TResult> bwjVar);

    public abstract Exception a();

    public abstract <X extends Throwable> TResult a(Class<X> cls) throws Throwable;

    public abstract TResult b();

    public abstract boolean c();

    public abstract boolean d();

    public abstract boolean e();

    public bwl<TResult> a(bwh<TResult> bwhVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }

    public <TContinuationResult> bwl<TContinuationResult> a(Executor executor, bwf<TResult, TContinuationResult> bwfVar) {
        throw new UnsupportedOperationException("continueWith is not implemented");
    }

    public <TContinuationResult> bwl<TContinuationResult> a(Executor executor, bwk<TResult, TContinuationResult> bwkVar) {
        throw new UnsupportedOperationException("onSuccessTask is not implemented");
    }

    public <TContinuationResult> bwl<TContinuationResult> b(Executor executor, bwf<TResult, bwl<TContinuationResult>> bwfVar) {
        throw new UnsupportedOperationException("continueWithTask is not implemented");
    }

    public bwl<TResult> a(Executor executor, bwg bwgVar) {
        throw new UnsupportedOperationException("addOnCanceledListener is not implemented");
    }

    public bwl<TResult> a(Executor executor, bwh<TResult> bwhVar) {
        throw new UnsupportedOperationException("addOnCompleteListener is not implemented");
    }
}
