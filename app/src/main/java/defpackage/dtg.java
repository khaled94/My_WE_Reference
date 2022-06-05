package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.dvi;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicIntegerFieldUpdater;
import java.util.concurrent.atomic.AtomicReferenceFieldUpdater;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlinx.coroutines.CompletionHandlerException;

@Metadata(d1 = {"\u0000¶\u0001\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0001\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000e\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\b\u0011\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\t\u0012\u0004\u0012\u00028\u00000\u008a\u00012\t\u0012\u0004\u0012\u00028\u00000\u008b\u00012\u00060tj\u0002`uB\u001d\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000e\u001a\u00020\r2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0012\u0010\u0013JB\u0010\u0012\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0002¢\u0006\u0004\b\u0012\u0010\u0018J\u001e\u0010\u001b\u001a\u00020\u00112\f\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00110\u0019H\u0082\b¢\u0006\u0004\b\u001b\u0010\u001cJ8\u0010\u001e\u001a\u00020\u00112!\u0010\u001d\u001a\u001d\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u00142\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u001e\u0010\u0018J\u0019\u0010 \u001a\u00020\u001f2\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b \u0010!J!\u0010%\u001a\u00020\u00112\b\u0010\"\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0010\u001a\u00020\u000fH\u0010¢\u0006\u0004\b#\u0010$J\u0017\u0010&\u001a\u00020\u001f2\u0006\u0010\u0010\u001a\u00020\u000fH\u0002¢\u0006\u0004\b&\u0010!J\u0017\u0010(\u001a\u00020\u00112\u0006\u0010'\u001a\u00020\bH\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010,\u001a\u00020\u0011H\u0000¢\u0006\u0004\b*\u0010+J\u000f\u0010-\u001a\u00020\u0011H\u0002¢\u0006\u0004\b-\u0010+J\u0017\u0010/\u001a\u00020\u00112\u0006\u0010.\u001a\u00020\u0004H\u0002¢\u0006\u0004\b/\u00100J\u0017\u00103\u001a\u00020\u000f2\u0006\u00102\u001a\u000201H\u0016¢\u0006\u0004\b3\u00104J\u001b\u00108\u001a\u0004\u0018\u00010\u000f2\b\u00105\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b6\u00107J\u0011\u00109\u001a\u0004\u0018\u00010\bH\u0001¢\u0006\u0004\b9\u0010:J\u0017\u0010=\u001a\n\u0018\u00010;j\u0004\u0018\u0001`<H\u0016¢\u0006\u0004\b=\u0010>J\u001f\u0010A\u001a\u00028\u0001\"\u0004\b\u0001\u0010\u00012\b\u00105\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\b?\u0010@J\u000f\u0010B\u001a\u00020\u0011H\u0016¢\u0006\u0004\bB\u0010+J\u0011\u0010D\u001a\u0004\u0018\u00010CH\u0002¢\u0006\u0004\bD\u0010EJ8\u0010F\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0016¢\u0006\u0004\bF\u0010GJ\u000f\u0010H\u001a\u00020\u001fH\u0002¢\u0006\u0004\bH\u0010IJ8\u0010J\u001a\u00020\r2'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u0017H\u0002¢\u0006\u0004\bJ\u0010KJB\u0010L\u001a\u00020\u00112'\u0010\u000e\u001a#\u0012\u0015\u0012\u0013\u0018\u00010\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u00110\u0014j\u0002`\u00172\b\u00105\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010O\u001a\u00020NH\u0014¢\u0006\u0004\bO\u0010PJ\u0017\u0010S\u001a\u00020\u00112\u0006\u0010\u0010\u001a\u00020\u000fH\u0000¢\u0006\u0004\bQ\u0010RJ\u000f\u0010T\u001a\u00020\u0011H\u0002¢\u0006\u0004\bT\u0010+J\u000f\u0010U\u001a\u00020\u001fH\u0001¢\u0006\u0004\bU\u0010IJ<\u0010W\u001a\u00020\u00112\u0006\u0010V\u001a\u00028\u00002#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\bW\u0010XJH\u0010Y\u001a\u00020\u00112\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042%\b\u0002\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bY\u0010ZJ \u0010]\u001a\u00020\u00112\f\u0010\\\u001a\b\u0012\u0004\u0012\u00028\u00000[H\u0016ø\u0001\u0000¢\u0006\u0004\b]\u0010)JZ\u0010`\u001a\u0004\u0018\u00010\b2\u0006\u00105\u001a\u00020^2\b\u0010\t\u001a\u0004\u0018\u00010\b2\u0006\u0010\u0005\u001a\u00020\u00042#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00142\b\u0010_\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b`\u0010aJ\u0011\u0010c\u001a\u0004\u0018\u00010\bH\u0010¢\u0006\u0004\bb\u0010:J\u000f\u0010d\u001a\u00020NH\u0016¢\u0006\u0004\bd\u0010PJ\u000f\u0010e\u001a\u00020\u001fH\u0002¢\u0006\u0004\be\u0010IJ#\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010V\u001a\u00028\u00002\b\u0010_\u001a\u0004\u0018\u00010\bH\u0016¢\u0006\u0004\be\u0010fJH\u0010e\u001a\u0004\u0018\u00010\b2\u0006\u0010V\u001a\u00028\u00002\b\u0010_\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0016¢\u0006\u0004\be\u0010gJJ\u0010i\u001a\u0004\u0018\u00010h2\b\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010_\u001a\u0004\u0018\u00010\b2#\u0010\u001d\u001a\u001f\u0012\u0013\u0012\u00110\u000f¢\u0006\f\b\u0015\u0012\b\b\u0016\u0012\u0004\b\b(\u0010\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0014H\u0002¢\u0006\u0004\bi\u0010jJ\u0019\u0010l\u001a\u0004\u0018\u00010\b2\u0006\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\bl\u0010mJ\u000f\u0010n\u001a\u00020\u001fH\u0002¢\u0006\u0004\bn\u0010IJ\u001b\u0010p\u001a\u00020\u0011*\u00020o2\u0006\u0010V\u001a\u00028\u0000H\u0016¢\u0006\u0004\bp\u0010qJ\u001b\u0010r\u001a\u00020\u0011*\u00020o2\u0006\u0010k\u001a\u00020\u000fH\u0016¢\u0006\u0004\br\u0010sR\u001c\u0010x\u001a\n\u0018\u00010tj\u0004\u0018\u0001`u8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010wR\u001a\u0010z\u001a\u00020y8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}R!\u0010\u0003\u001a\b\u0012\u0004\u0012\u00028\u00000\u00028\u0000X\u0080\u0004¢\u0006\r\n\u0004\b\u0003\u0010~\u001a\u0005\b\u007f\u0010\u0080\u0001R\u0016\u0010\u0081\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0081\u0001\u0010IR\u0016\u0010\u0082\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0082\u0001\u0010IR\u0016\u0010\u0083\u0001\u001a\u00020\u001f8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0083\u0001\u0010IR\u001b\u0010\u0084\u0001\u001a\u0004\u0018\u00010C8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0084\u0001\u0010\u0085\u0001R\u0017\u00105\u001a\u0004\u0018\u00010\b8@X\u0080\u0004¢\u0006\u0007\u001a\u0005\b\u0086\u0001\u0010:R\u0016\u0010\u0088\u0001\u001a\u00020N8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0087\u0001\u0010P\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0089\u0001"}, d2 = {"Lkotlinx/coroutines/CancellableContinuationImpl;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "delegate", "", "resumeMode", "<init>", "(Lkotlin/coroutines/Continuation;I)V", "", "proposedUpdate", "", "alreadyResumedError", "(Ljava/lang/Object;)Ljava/lang/Void;", "Lkotlinx/coroutines/CancelHandler;", "handler", "", "cause", "", "callCancelHandler", "(Lkotlinx/coroutines/CancelHandler;Ljava/lang/Throwable;)V", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "Lkotlinx/coroutines/CompletionHandler;", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Throwable;)V", "Lkotlin/Function0;", "block", "callCancelHandlerSafely", "(Lkotlin/jvm/functions/Function0;)V", "onCancellation", "callOnCancellation", "", "cancel", "(Ljava/lang/Throwable;)Z", "takenState", "cancelCompletedResult$kotlinx_coroutines_core", "(Ljava/lang/Object;Ljava/lang/Throwable;)V", "cancelCompletedResult", "cancelLater", "token", "completeResume", "(Ljava/lang/Object;)V", "detachChild$kotlinx_coroutines_core", "()V", "detachChild", "detachChildIfNonResuable", "mode", "dispatchResume", "(I)V", "Lkotlinx/coroutines/Job;", "parent", "getContinuationCancellationCause", "(Lkotlinx/coroutines/Job;)Ljava/lang/Throwable;", "state", "getExceptionalResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Throwable;", "getExceptionalResult", "getResult", "()Ljava/lang/Object;", "Ljava/lang/StackTraceElement;", "Lkotlinx/coroutines/internal/StackTraceElement;", "getStackTraceElement", "()Ljava/lang/StackTraceElement;", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "getSuccessfulResult", "initCancellability", "Lkotlinx/coroutines/DisposableHandle;", "installParentHandle", "()Lkotlinx/coroutines/DisposableHandle;", "invokeOnCancellation", "(Lkotlin/jvm/functions/Function1;)V", "isReusable", "()Z", "makeCancelHandler", "(Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/CancelHandler;", "multipleHandlersError", "(Lkotlin/jvm/functions/Function1;Ljava/lang/Object;)V", "", "nameString", "()Ljava/lang/String;", "parentCancelled$kotlinx_coroutines_core", "(Ljava/lang/Throwable;)V", "parentCancelled", "releaseClaimedReusableContinuation", "resetStateReusable", "value", "resume", "(Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "resumeImpl", "(Ljava/lang/Object;ILkotlin/jvm/functions/Function1;)V", "Lkotlin/Result;", "result", "resumeWith", "Lkotlinx/coroutines/NotCompleted;", "idempotent", "resumedState", "(Lkotlinx/coroutines/NotCompleted;Ljava/lang/Object;ILkotlin/jvm/functions/Function1;Ljava/lang/Object;)Ljava/lang/Object;", "takeState$kotlinx_coroutines_core", "takeState", "toString", "tryResume", "(Ljava/lang/Object;Ljava/lang/Object;)Ljava/lang/Object;", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Ljava/lang/Object;", "Lkotlinx/coroutines/internal/Symbol;", "tryResumeImpl", "(Ljava/lang/Object;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)Lkotlinx/coroutines/internal/Symbol;", "exception", "tryResumeWithException", "(Ljava/lang/Throwable;)Ljava/lang/Object;", "trySuspend", "Lkotlinx/coroutines/CoroutineDispatcher;", "resumeUndispatched", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Object;)V", "resumeUndispatchedWithException", "(Lkotlinx/coroutines/CoroutineDispatcher;Ljava/lang/Throwable;)V", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Lkotlinx/coroutines/internal/CoroutineStackFrame;", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "callerFrame", "Lkotlin/coroutines/CoroutineContext;", "context", "Lkotlin/coroutines/CoroutineContext;", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "isActive", "isCancelled", "isCompleted", "parentHandle", "Lkotlinx/coroutines/DisposableHandle;", "getState$kotlinx_coroutines_core", "getStateDebugRepresentation", "stateDebugRepresentation", "kotlinx-coroutines-core", "Lkotlinx/coroutines/DispatchedTask;", "Lkotlinx/coroutines/CancellableContinuation;"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dtg  reason: default package */
/* loaded from: classes2.dex */
public class dtg<T> extends dum<T> implements dof, dtf<T> {
    private static final /* synthetic */ AtomicIntegerFieldUpdater e = AtomicIntegerFieldUpdater.newUpdater(dtg.class, "_decision");
    private static final /* synthetic */ AtomicReferenceFieldUpdater f = AtomicReferenceFieldUpdater.newUpdater(dtg.class, Object.class, "_state");
    volatile /* synthetic */ int _decision;
    volatile /* synthetic */ Object _state;
    final dnu<T> a;
    duq b;
    private final dnw d;

    @Override // defpackage.dof
    public StackTraceElement getStackTraceElement() {
        return null;
    }

    @Override // defpackage.dum
    public final dnu<T> a() {
        return this.a;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public dtg(dnu<? super T> dnuVar, int i) {
        super(i);
        this.a = dnuVar;
        if (dug.a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        this.d = this.a.getContext();
        this._decision = 0;
        this._state = dsw.a;
    }

    @Override // defpackage.dnu
    public dnw getContext() {
        return this.d;
    }

    public final void b() {
        duq k = k();
        if (k != null && h()) {
            k.dispose();
            this.b = dvt.a;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean c() {
        if (this.c == 2) {
            if (((dyf) this.a)._reusableCancellableContinuation != null) {
                return true;
            }
        }
        return false;
    }

    @Override // defpackage.dof
    public dof getCallerFrame() {
        dnu<T> dnuVar = this.a;
        if (dnuVar instanceof dof) {
            return (dof) dnuVar;
        }
        return null;
    }

    private void a(dtd dtdVar, Throwable th) {
        try {
            dtdVar.a(th);
        } catch (Throwable th2) {
            dtz.a(getContext(), new CompletionHandlerException(dqc.a("Exception in invokeOnCancellation handler for ", (Object) this), th2));
        }
    }

    private void b(dow<? super Throwable, dmg> dowVar, Throwable th) {
        try {
            dowVar.invoke(th);
        } catch (Throwable th2) {
            dtz.a(getContext(), new CompletionHandlerException(dqc.a("Exception in resume onCancellation handler for ", (Object) this), th2));
        }
    }

    public static Throwable a(dvi dviVar) {
        return dviVar.g();
    }

    public final Object e() {
        dvi dviVar;
        boolean c = c();
        if (i()) {
            if (this.b == null) {
                k();
            }
            if (c) {
                l();
            }
            return dny.COROUTINE_SUSPENDED;
        }
        if (c) {
            l();
        }
        Object obj = this._state;
        if (!(obj instanceof dtr)) {
            if (dun.a(this.c) && (dviVar = (dvi) getContext().get(dvi.b)) != null && !dviVar.a()) {
                CancellationException g = dviVar.g();
                a(obj, g);
                if (!dug.c()) {
                    throw g;
                }
                dtg<T> dtgVar = this;
                if (dtgVar instanceof dof) {
                    throw dyx.a(g, dtgVar);
                }
                throw g;
            }
            return c(obj);
        }
        Throwable th = ((dtr) obj).a;
        if (!dug.c()) {
            throw th;
        }
        dtg<T> dtgVar2 = this;
        if (dtgVar2 instanceof dof) {
            throw dyx.a(th, dtgVar2);
        }
        throw th;
    }

    private final duq k() {
        dvi dviVar = (dvi) getContext().get(dvi.b);
        if (dviVar == null) {
            return null;
        }
        duq a = dvi.a.a(dviVar, true, false, new dtk(this), 2);
        this.b = a;
        return a;
    }

    private final void l() {
        dnu<T> dnuVar = this.a;
        Throwable th = null;
        dyf dyfVar = dnuVar instanceof dyf ? (dyf) dnuVar : null;
        if (dyfVar != null) {
            th = dyfVar.a(this);
        }
        if (th == null) {
            return;
        }
        g();
        b(th);
    }

    @Override // defpackage.dnu
    public void resumeWith(Object obj) {
        dtg<T> dtgVar = this;
        Throwable c = dmb.c(obj);
        if (c != null) {
            if (dug.c()) {
                c = dyx.a(c, dtgVar);
            }
            obj = new dtr(c);
        }
        a(obj, this.c, null);
    }

    @Override // defpackage.dtf
    public final void b(T t, dow<? super Throwable, dmg> dowVar) {
        a(t, this.c, dowVar);
    }

    private static void a(dow<? super Throwable, dmg> dowVar, Object obj) {
        throw new IllegalStateException(("It's prohibited to register multiple handlers, tried to register " + dowVar + ", already has " + obj).toString());
    }

    private final void a(int i) {
        if (j()) {
            return;
        }
        dun.a(this, i);
    }

    private static Object a(dvu dvuVar, Object obj, int i, dow<? super Throwable, dmg> dowVar) {
        if (obj instanceof dtr) {
            dug.a();
            if (dug.a()) {
                if (!(dowVar == null)) {
                    throw new AssertionError();
                }
            }
            return obj;
        } else if (!dun.a(i) || (dowVar == null && (!(dvuVar instanceof dtd) || (dvuVar instanceof dsx)))) {
            return obj;
        } else {
            return new dtq(obj, dvuVar instanceof dtd ? (dtd) dvuVar : null, dowVar, null, null, 16);
        }
    }

    private static Void e(Object obj) {
        throw new IllegalStateException(dqc.a("Already resumed, but proposed with update ", obj).toString());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void f() {
        if (!c()) {
            g();
        }
    }

    public final void g() {
        duq duqVar = this.b;
        if (duqVar == null) {
            return;
        }
        duqVar.dispose();
        this.b = dvt.a;
    }

    @Override // defpackage.dtf
    public final Object a(T t) {
        return c(t, null);
    }

    @Override // defpackage.dtf
    public final Object a(T t, dow<? super Throwable, dmg> dowVar) {
        return c(t, dowVar);
    }

    @Override // defpackage.dtf
    public final Object a(Throwable th) {
        return c(new dtr(th), null);
    }

    @Override // defpackage.dtf
    public final void b(Object obj) {
        if (dug.a()) {
            if (!(obj == dth.a)) {
                throw new AssertionError();
            }
        }
        a(this.c);
    }

    @Override // defpackage.dtf
    public final void a(dtx dtxVar, T t) {
        dnu<T> dnuVar = this.a;
        dyf dyfVar = dnuVar instanceof dyf ? (dyf) dnuVar : null;
        a(t, (dyfVar == null ? null : dyfVar.a) == dtxVar ? 4 : this.c, null);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dum
    public final <T> T c(Object obj) {
        return obj instanceof dtq ? (T) ((dtq) obj).a : obj;
    }

    @Override // defpackage.dum
    public final Throwable d(Object obj) {
        Throwable d = super.d(obj);
        if (d == null) {
            return null;
        }
        dnu<T> dnuVar = this.a;
        return (!dug.c() || !(dnuVar instanceof dof)) ? d : dyx.a(d, (dof) dnuVar);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("CancellableContinuation(");
        sb.append(duh.a(this.a));
        sb.append("){");
        Object obj = this._state;
        sb.append(obj instanceof dvu ? "Active" : obj instanceof dtj ? "Cancelled" : "Completed");
        sb.append("}@");
        sb.append(Integer.toHexString(System.identityHashCode(this)));
        return sb.toString();
    }

    @Override // defpackage.dum
    public final void a(Object obj, Throwable th) {
        while (true) {
            Object obj2 = this._state;
            if (obj2 instanceof dvu) {
                throw new IllegalStateException("Not completed".toString());
            }
            if (obj2 instanceof dtr) {
                return;
            }
            if (obj2 instanceof dtq) {
                dtq dtqVar = (dtq) obj2;
                if (!(!dtqVar.a())) {
                    throw new IllegalStateException("Must be called at most once".toString());
                }
                if (f.compareAndSet(this, obj2, dtq.a(dtqVar, null, null, null, null, th, 15))) {
                    dtd dtdVar = dtqVar.b;
                    if (dtdVar != null) {
                        a(dtdVar, th);
                    }
                    dow<Throwable, dmg> dowVar = dtqVar.c;
                    if (dowVar == null) {
                        return;
                    }
                    b(dowVar, th);
                    return;
                }
            } else if (f.compareAndSet(this, obj2, new dtq(obj2, null, null, null, th, 14))) {
                return;
            }
        }
    }

    @Override // defpackage.dtf
    public final boolean b(Throwable th) {
        Object obj;
        boolean z;
        do {
            obj = this._state;
            if (!(obj instanceof dvu)) {
                return false;
            }
            z = obj instanceof dtd;
        } while (!f.compareAndSet(this, obj, new dtj(this, th, z)));
        dtd dtdVar = z ? (dtd) obj : null;
        if (dtdVar != null) {
            a(dtdVar, th);
        }
        f();
        a(this.c);
        return true;
    }

    private final void a(dow<? super Throwable, dmg> dowVar, Throwable th) {
        try {
            dowVar.invoke(th);
        } catch (Throwable th2) {
            dtz.a(getContext(), new CompletionHandlerException(dqc.a("Exception in invokeOnCancellation handler for ", (Object) this), th2));
        }
    }

    private final boolean i() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i != 2) {
                    throw new IllegalStateException("Already suspended".toString());
                }
                return false;
            }
        } while (!e.compareAndSet(this, 0, 1));
        return true;
    }

    private final boolean j() {
        do {
            int i = this._decision;
            if (i != 0) {
                if (i != 1) {
                    throw new IllegalStateException("Already resumed".toString());
                }
                return false;
            }
        } while (!e.compareAndSet(this, 0, 2));
        return true;
    }

    private final void a(Object obj, int i, dow<? super Throwable, dmg> dowVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof dvu) {
            } else {
                if (obj2 instanceof dtj) {
                    dtj dtjVar = (dtj) obj2;
                    if (dtjVar.a()) {
                        if (dowVar == null) {
                            return;
                        }
                        b(dowVar, dtjVar.a);
                        return;
                    }
                }
                e(obj);
                throw new KotlinNothingValueException();
            }
        } while (!f.compareAndSet(this, obj2, a((dvu) obj2, obj, i, dowVar)));
        f();
        a(i);
    }

    private final dyy c(Object obj, dow<? super Throwable, dmg> dowVar) {
        Object obj2;
        do {
            obj2 = this._state;
            if (obj2 instanceof dvu) {
            } else {
                if (obj2 instanceof dtq) {
                }
                return null;
            }
        } while (!f.compareAndSet(this, obj2, a((dvu) obj2, obj, this.c, dowVar)));
        f();
        return dth.a;
    }

    private boolean h() {
        return !(this._state instanceof dvu);
    }

    @Override // defpackage.dum
    public final Object d() {
        return this._state;
    }

    @Override // defpackage.dtf
    public final void a(dow<? super Throwable, dmg> dowVar) {
        dvf dvfVar = dowVar instanceof dtd ? (dtd) dowVar : new dvf(dowVar);
        while (true) {
            Object obj = this._state;
            if (obj instanceof dsw) {
                if (f.compareAndSet(this, obj, dvfVar)) {
                    return;
                }
            } else if (obj instanceof dtd) {
                a(dowVar, obj);
            } else {
                boolean z = obj instanceof dtr;
                if (z) {
                    dtr dtrVar = (dtr) obj;
                    if (!dtrVar.b()) {
                        a(dowVar, obj);
                    }
                    if (!(obj instanceof dtj)) {
                        return;
                    }
                    Throwable th = null;
                    if (!z) {
                        dtrVar = null;
                    }
                    if (dtrVar != null) {
                        th = dtrVar.a;
                    }
                    a(dowVar, th);
                    return;
                } else if (obj instanceof dtq) {
                    dtq dtqVar = (dtq) obj;
                    if (dtqVar.b != null) {
                        a(dowVar, obj);
                    }
                    if (dvfVar instanceof dsx) {
                        return;
                    }
                    if (dtqVar.a()) {
                        a(dowVar, dtqVar.e);
                        return;
                    } else {
                        if (f.compareAndSet(this, obj, dtq.a(dtqVar, null, dvfVar, null, null, null, 29))) {
                            return;
                        }
                    }
                } else if (dvfVar instanceof dsx) {
                    return;
                } else {
                    if (f.compareAndSet(this, obj, new dtq(obj, dvfVar, null, null, null, 28))) {
                        return;
                    }
                }
            }
        }
    }
}
