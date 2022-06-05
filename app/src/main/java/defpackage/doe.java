package defpackage;

import defpackage.dnw;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0000\b!\u0018\u00002\u00020\u0001B\u0019\b\u0016\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0005B!\u0012\u0010\u0010\u0002\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0002\u0010\bJ\u000e\u0010\f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0003J\b\u0010\r\u001a\u00020\u000eH\u0014R\u0010\u0010\u0006\u001a\u0004\u0018\u00010\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\t\u001a\u00020\u00078VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010\u0003X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lkotlin/coroutines/jvm/internal/ContinuationImpl;", "Lkotlin/coroutines/jvm/internal/BaseContinuationImpl;", "completion", "Lkotlin/coroutines/Continuation;", "", "(Lkotlin/coroutines/Continuation;)V", "_context", "Lkotlin/coroutines/CoroutineContext;", "(Lkotlin/coroutines/Continuation;Lkotlin/coroutines/CoroutineContext;)V", "context", "getContext", "()Lkotlin/coroutines/CoroutineContext;", "intercepted", "releaseIntercepted", "", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* renamed from: doe  reason: default package */
/* loaded from: classes2.dex */
public abstract class doe extends doc {
    private final dnw _context;
    private transient dnu<Object> intercepted;

    public doe(dnu<Object> dnuVar, dnw dnwVar) {
        super(dnuVar);
        this._context = dnwVar;
    }

    public doe(dnu<Object> dnuVar) {
        this(dnuVar, dnuVar != null ? dnuVar.getContext() : null);
    }

    @Override // defpackage.dnu
    public dnw getContext() {
        dnw dnwVar = this._context;
        dqc.a(dnwVar);
        return dnwVar;
    }

    public final dnu<Object> intercepted() {
        doe doeVar = this.intercepted;
        if (doeVar == null) {
            dnv dnvVar = (dnv) getContext().get(dnv.a);
            if (dnvVar == null || (doeVar = dnvVar.interceptContinuation(this)) == null) {
                doeVar = this;
            }
            this.intercepted = doeVar;
        }
        return doeVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // defpackage.doc
    public void releaseIntercepted() {
        dnu<?> dnuVar = this.intercepted;
        if (dnuVar != null && dnuVar != this) {
            dnw.b bVar = getContext().get(dnv.a);
            dqc.a(bVar);
            ((dnv) bVar).releaseInterceptedContinuation(dnuVar);
        }
        this.intercepted = dod.a;
    }
}
