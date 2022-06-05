package defpackage;

import defpackage.dnw;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\b'\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004R\u0018\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "(Lkotlin/coroutines/CoroutineContext$Key;)V", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlin-stdlib"}, k = 1, mv = {1, 5, 1})
/* renamed from: dnr  reason: default package */
/* loaded from: classes2.dex */
public abstract class dnr implements dnw.b {
    private final dnw.c<?> key;

    public dnr(dnw.c<?> cVar) {
        dqc.d(cVar, "key");
        this.key = cVar;
    }

    @Override // defpackage.dnw
    public <R> R fold(R r, dph<? super R, ? super dnw.b, ? extends R> dphVar) {
        dqc.d(dphVar, "operation");
        return (R) dnw.b.a.a(this, r, dphVar);
    }

    @Override // defpackage.dnw.b, defpackage.dnw
    public <E extends dnw.b> E get(dnw.c<E> cVar) {
        dqc.d(cVar, "key");
        return (E) dnw.b.a.a(this, cVar);
    }

    @Override // defpackage.dnw.b
    public dnw.c<?> getKey() {
        return this.key;
    }

    @Override // defpackage.dnw
    public dnw minusKey(dnw.c<?> cVar) {
        dqc.d(cVar, "key");
        return dnw.b.a.b(this, cVar);
    }

    @Override // defpackage.dnw
    public dnw plus(dnw dnwVar) {
        dqc.d(dnwVar, "context");
        return dnw.b.a.a(this, dnwVar);
    }
}
