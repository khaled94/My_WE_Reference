package defpackage;

import defpackage.dnw;
import kotlin.Metadata;

/* JADX INFO: Access modifiers changed from: package-private */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\bÂ\u0002\u0018\u00002\u00020\u00012\b\u0012\u0004\u0012\u00020\u00000\u0002B\u0007\b\u0002¢\u0006\u0002\u0010\u0003R\u0018\u0010\u0004\u001a\u0006\u0012\u0002\b\u00030\u00028VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0005\u0010\u0006¨\u0006\u0007"}, d2 = {"Lkotlinx/coroutines/UndispatchedMarker;", "Lkotlin/coroutines/CoroutineContext$Element;", "Lkotlin/coroutines/CoroutineContext$Key;", "()V", "key", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dwf  reason: default package */
/* loaded from: classes2.dex */
public final class dwf implements dnw.b, dnw.c<dwf> {
    public static final dwf a = new dwf();

    private dwf() {
    }

    @Override // defpackage.dnw
    public final <R> R fold(R r, dph<? super R, ? super dnw.b, ? extends R> dphVar) {
        return (R) dnw.b.a.a(this, r, dphVar);
    }

    @Override // defpackage.dnw.b, defpackage.dnw
    public final <E extends dnw.b> E get(dnw.c<E> cVar) {
        return (E) dnw.b.a.a(this, cVar);
    }

    @Override // defpackage.dnw
    public final dnw minusKey(dnw.c<?> cVar) {
        return dnw.b.a.b(this, cVar);
    }

    @Override // defpackage.dnw
    public final dnw plus(dnw dnwVar) {
        return dnw.b.a.a(this, dnwVar);
    }

    @Override // defpackage.dnw.b
    public final dnw.c<?> getKey() {
        return this;
    }
}
