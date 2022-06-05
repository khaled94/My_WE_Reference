package kotlinx.coroutines;

import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u00022\b\u0012\u0004\u0012\u00020\u00000\u0003B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\n\u0010\u000b\u001a\u0004\u0018\u00010\u0000H\u0016J\u0013\u0010\f\u001a\u00020\r2\b\u0010\u000e\u001a\u0004\u0018\u00010\u000fH\u0096\u0002J\b\u0010\u0010\u001a\u00020\u0007H\u0016J\b\u0010\u0011\u001a\u00020\u0012H\u0016J\b\u0010\u0013\u001a\u00020\u0005H\u0016R\u0010\u0010\b\u001a\u00020\t8\u0000X\u0081\u0004¢\u0006\u0002\n\u0000¨\u0006\u0014"}, d2 = {"Lkotlinx/coroutines/JobCancellationException;", "Ljava/util/concurrent/CancellationException;", "Lkotlinx/coroutines/CancellationException;", "Lkotlinx/coroutines/CopyableThrowable;", "message", "", "cause", "", "job", "Lkotlinx/coroutines/Job;", "(Ljava/lang/String;Ljava/lang/Throwable;Lkotlinx/coroutines/Job;)V", "createCopy", "equals", "", "other", "", "fillInStackTrace", "hashCode", "", "toString", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class JobCancellationException extends CancellationException implements dtv<JobCancellationException> {
    public final dvi a;

    public JobCancellationException(String str, Throwable th, dvi dviVar) {
        super(str);
        this.a = dviVar;
        if (th != null) {
            initCause(th);
        }
    }

    @Override // java.lang.Throwable
    public final Throwable fillInStackTrace() {
        if (dug.b()) {
            return super.fillInStackTrace();
        }
        setStackTrace(new StackTraceElement[0]);
        return this;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return super.toString() + "; job=" + this.a;
    }

    public final boolean equals(Object obj) {
        if (obj != this) {
            if (!(obj instanceof JobCancellationException)) {
                return false;
            }
            JobCancellationException jobCancellationException = (JobCancellationException) obj;
            return dqc.a((Object) jobCancellationException.getMessage(), (Object) getMessage()) && dqc.a(jobCancellationException.a, this.a) && dqc.a(jobCancellationException.getCause(), getCause());
        }
        return true;
    }

    public final int hashCode() {
        String message = getMessage();
        dqc.a((Object) message);
        int hashCode = ((message.hashCode() * 31) + this.a.hashCode()) * 31;
        Throwable cause = getCause();
        return hashCode + (cause == null ? 0 : cause.hashCode());
    }

    @Override // defpackage.dtv
    public final /* synthetic */ JobCancellationException a() {
        JobCancellationException jobCancellationException;
        if (dug.b()) {
            String message = getMessage();
            dqc.a((Object) message);
            jobCancellationException = new JobCancellationException(message, this, this.a);
        } else {
            jobCancellationException = null;
        }
        return jobCancellationException;
    }
}
