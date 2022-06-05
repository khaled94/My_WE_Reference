package defpackage;

import java.util.concurrent.CancellationException;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.TimeUnit;
import java.util.concurrent.TimeoutException;

/* renamed from: bwo  reason: default package */
/* loaded from: classes2.dex */
public final class bwo {
    private bwo() {
    }

    public static <TResult> bwl<TResult> a(Exception exc) {
        bxj bxjVar = new bxj();
        bxjVar.a(exc);
        return bxjVar;
    }

    public static <TResult> bwl<TResult> a(TResult tresult) {
        bxj bxjVar = new bxj();
        bxjVar.a((bxj) tresult);
        return bxjVar;
    }

    public static <TResult> TResult a(bwl<TResult> bwlVar) throws ExecutionException {
        if (bwlVar.e()) {
            return bwlVar.b();
        }
        if (bwlVar.c()) {
            throw new CancellationException("Task is already canceled");
        }
        throw new ExecutionException(bwlVar.a());
    }

    public static <T> void a(bwl<T> bwlVar, bwq<? super T> bwqVar) {
        bwlVar.a(bwn.b, (bwj<? super T>) bwqVar);
        bwlVar.a(bwn.b, (bwi) bwqVar);
        bwlVar.a(bwn.b, (bwg) bwqVar);
    }

    public static <TResult> TResult a(bwl<TResult> bwlVar, long j, TimeUnit timeUnit) throws ExecutionException, InterruptedException, TimeoutException {
        aat.c("Must not be called on the main application thread");
        aat.a(bwlVar, "Task must not be null");
        aat.a(timeUnit, "TimeUnit must not be null");
        if (bwlVar.d()) {
            return (TResult) a((bwl<Object>) bwlVar);
        }
        bwp bwpVar = new bwp((byte) 0);
        a(bwlVar, bwpVar);
        if (!bwpVar.a.await(j, timeUnit)) {
            throw new TimeoutException("Timed out waiting for Task");
        }
        return (TResult) a((bwl<Object>) bwlVar);
    }
}
