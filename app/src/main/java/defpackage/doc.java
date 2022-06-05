package defpackage;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import defpackage.dmb;
import defpackage.doi;
import java.io.Serializable;
import java.lang.reflect.Method;
import kotlin.Metadata;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0000\b!\u0018\u00002\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00012\u00020\u00032\u00020\u0004B\u0017\u0012\u0010\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\u0002\u0010\u0006J$\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\b\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\u001a\u0010\f\u001a\b\u0012\u0004\u0012\u00020\r0\u00012\n\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0001H\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u0010H\u0016J\"\u0010\u0011\u001a\u0004\u0018\u00010\u00022\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013H$ø\u0001\u0000¢\u0006\u0002\u0010\u0014J\b\u0010\u0015\u001a\u00020\rH\u0014J\u001e\u0010\u0016\u001a\u00020\r2\u000e\u0010\u0012\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u0013ø\u0001\u0000¢\u0006\u0002\u0010\u0017J\b\u0010\u0018\u001a\u00020\u0019H\u0016R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u00038VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\tR\u001b\u0010\u0005\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0002\u0018\u00010\u0001¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001a"}, d2 = {"Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "Lkotlin/coroutines/Continuation;", "", "Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "Ljava/io/Serializable;", "completion", "(Lkotlin/coroutines/Continuation;)V", "callerFrame", "getCallerFrame", "()Lkotlin/coroutines/jvm/internal/CoroutineStackFrame;", "getCompletion", "()Lkotlin/coroutines/Continuation;", "create", "", "value", "getStackTraceElement", "Ljava/lang/StackTraceElement;", "invokeSuspend", "result", "Lkotlin/Result;", "(Ljava/lang/Object;)Ljava/lang/Object;", "releaseIntercepted", "resumeWith", "(Ljava/lang/Object;)V", "toString", "", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* renamed from: doc  reason: default package */
/* loaded from: classes2.dex */
public abstract class doc implements dnu<Object>, dof, Serializable {
    private final dnu<Object> completion;

    protected abstract Object invokeSuspend(Object obj);

    protected void releaseIntercepted() {
    }

    public doc(dnu<Object> dnuVar) {
        this.completion = dnuVar;
    }

    public final dnu<Object> getCompletion() {
        return this.completion;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.dnu
    public final void resumeWith(Object obj) {
        Object invokeSuspend;
        dnu dnuVar = this;
        while (true) {
            doc docVar = (doc) dnuVar;
            dqc.d(docVar, TypedValues.Attributes.S_FRAME);
            dnu dnuVar2 = docVar.completion;
            dqc.a(dnuVar2);
            try {
                invokeSuspend = docVar.invokeSuspend(obj);
            } catch (Throwable th) {
                dmb.a aVar = dmb.a;
                obj = dmb.d(dmc.a(th));
            }
            if (invokeSuspend == dny.COROUTINE_SUSPENDED) {
                return;
            }
            dmb.a aVar2 = dmb.a;
            obj = dmb.d(invokeSuspend);
            docVar.releaseIntercepted();
            if (dnuVar2 instanceof doc) {
                dnuVar = dnuVar2;
            } else {
                dnuVar2.resumeWith(obj);
                return;
            }
        }
    }

    public dnu<dmg> create(dnu<?> dnuVar) {
        dqc.d(dnuVar, "completion");
        throw new UnsupportedOperationException("create(Continuation) has not been overridden");
    }

    public dnu<dmg> create(Object obj, dnu<?> dnuVar) {
        dqc.d(dnuVar, "completion");
        throw new UnsupportedOperationException("create(Any?;Continuation) has not been overridden");
    }

    public String toString() {
        StringBuilder sb = new StringBuilder("Continuation at ");
        Serializable stackTraceElement = getStackTraceElement();
        if (stackTraceElement == null) {
            stackTraceElement = getClass().getName();
        }
        sb.append(stackTraceElement);
        return sb.toString();
    }

    @Override // defpackage.dof
    public dof getCallerFrame() {
        dnu<Object> dnuVar = this.completion;
        if (!(dnuVar instanceof dof)) {
            dnuVar = null;
        }
        return (dof) dnuVar;
    }

    @Override // defpackage.dof
    public StackTraceElement getStackTraceElement() {
        String str;
        Method method;
        Object invoke;
        Method method2;
        Object invoke2;
        dqc.d(this, "$this$getStackTraceElementImpl");
        dog dogVar = (dog) getClass().getAnnotation(dog.class);
        String str2 = null;
        if (dogVar == null) {
            return null;
        }
        int a = dogVar.a();
        if (a <= 1) {
            int a2 = doh.a(this);
            int i = a2 < 0 ? -1 : dogVar.c()[a2];
            doi doiVar = doi.c;
            dqc.d(this, "continuation");
            doi.a aVar = doi.b;
            if (aVar == null) {
                aVar = doi.a(this);
            }
            if (aVar != doi.a && (method = aVar.a) != null && (invoke = method.invoke(getClass(), new Object[0])) != null && (method2 = aVar.b) != null && (invoke2 = method2.invoke(invoke, new Object[0])) != null) {
                Method method3 = aVar.c;
                Object invoke3 = method3 != null ? method3.invoke(invoke2, new Object[0]) : null;
                if (invoke3 instanceof String) {
                    str2 = invoke3;
                }
                str2 = str2;
            }
            if (str2 == null) {
                str = dogVar.e();
            } else {
                str = str2 + '/' + dogVar.e();
            }
            return new StackTraceElement(str, dogVar.d(), dogVar.b(), i);
        }
        throw new IllegalStateException(("Debug metadata version mismatch. Expected: 1, got " + a + ". Please update the Kotlin standard library.").toString());
    }
}
