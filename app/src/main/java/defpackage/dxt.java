package defpackage;

import defpackage.dnw;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0000\u0018\u0000 \t2\u00020\u0001:\u0001\tB\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004R\u0010\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u0018\u0010\u0005\u001a\u0006\u0012\u0002\b\u00030\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lkotlinx/coroutines/flow/internal/DownstreamExceptionElement;", "Lkotlin/coroutines/CoroutineContext$Element;", "e", "", "(Ljava/lang/Throwable;)V", "key", "Lkotlin/coroutines/CoroutineContext$Key;", "getKey", "()Lkotlin/coroutines/CoroutineContext$Key;", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dxt  reason: default package */
/* loaded from: classes2.dex */
public final class dxt implements dnw.b {
    public static final a a = new a((byte) 0);
    public final Throwable b;
    private final dnw.c<?> c = a;

    @Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lkotlinx/coroutines/flow/internal/DownstreamExceptionElement$Key;", "Lkotlin/coroutines/CoroutineContext$Key;", "Lkotlinx/coroutines/flow/internal/DownstreamExceptionElement;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dxt$a */
    /* loaded from: classes2.dex */
    public static final class a implements dnw.c<dxt> {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }

    public dxt(Throwable th) {
        this.b = th;
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
        return this.c;
    }
}
