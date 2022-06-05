package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.dnw;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0002\b&\u0018\u0000 \u00172\u00020\u00012\u00020\u0002:\u0001\u0017B\u0005¢\u0006\u0002\u0010\u0003J\u001c\u0010\u0004\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH&J\u001c\u0010\u000b\u001a\u00020\u00052\u0006\u0010\u0006\u001a\u00020\u00072\n\u0010\b\u001a\u00060\tj\u0002`\nH\u0017J \u0010\f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\r\"\u0004\b\u0000\u0010\u000e2\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u0002H\u000e0\rJ\u0010\u0010\u0010\u001a\u00020\u00112\u0006\u0010\u0006\u001a\u00020\u0007H\u0016J\u0011\u0010\u0012\u001a\u00020\u00002\u0006\u0010\u0013\u001a\u00020\u0000H\u0087\u0002J\u0012\u0010\u0014\u001a\u00020\u00052\n\u0010\u000f\u001a\u0006\u0012\u0002\b\u00030\rJ\b\u0010\u0015\u001a\u00020\u0016H\u0016¨\u0006\u0018"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher;", "Lkotlin/coroutines/AbstractCoroutineContextElement;", "Lkotlin/coroutines/ContinuationInterceptor;", "()V", "dispatch", "", "context", "Lkotlin/coroutines/CoroutineContext;", "block", "Ljava/lang/Runnable;", "Lkotlinx/coroutines/Runnable;", "dispatchYield", "interceptContinuation", "Lkotlin/coroutines/Continuation;", ExifInterface.GPS_DIRECTION_TRUE, "continuation", "isDispatchNeeded", "", "plus", "other", "releaseInterceptedContinuation", "toString", "", "Key", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dtx  reason: default package */
/* loaded from: classes2.dex */
public abstract class dtx extends dnr implements dnv {
    public static final a Key = new a((byte) 0);

    public abstract void dispatch(dnw dnwVar, Runnable runnable);

    public boolean isDispatchNeeded(dnw dnwVar) {
        return true;
    }

    public final dtx plus(dtx dtxVar) {
        return dtxVar;
    }

    @Override // defpackage.dnr, defpackage.dnw.b, defpackage.dnw
    public <E extends dnw.b> E get(dnw.c<E> cVar) {
        dtx dtxVar = this;
        dqc.d(cVar, "key");
        if (cVar instanceof dns) {
            dns dnsVar = (dns) cVar;
            if (!dnsVar.a(dtxVar.getKey())) {
                return null;
            }
            E e = (E) dnsVar.a(dtxVar);
            if (e instanceof dnw.b) {
                return e;
            }
            return null;
        } else if (dnv.a != cVar) {
            return null;
        } else {
            return dtxVar;
        }
    }

    @Override // defpackage.dnr, defpackage.dnw
    public dnw minusKey(dnw.c<?> cVar) {
        dtx dtxVar = this;
        dqc.d(cVar, "key");
        if (!(cVar instanceof dns)) {
            return dnv.a == cVar ? dnx.a : dtxVar;
        }
        dns dnsVar = (dns) cVar;
        return (!dnsVar.a(dtxVar.getKey()) || dnsVar.a(dtxVar) == null) ? dtxVar : dnx.a;
    }

    public dtx() {
        super(dnv.a);
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0087\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0004¨\u0006\u0005"}, d2 = {"Lkotlinx/coroutines/CoroutineDispatcher$Key;", "Lkotlin/coroutines/AbstractCoroutineContextKey;", "Lkotlin/coroutines/ContinuationInterceptor;", "Lkotlinx/coroutines/CoroutineDispatcher;", "()V", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: dtx$a */
    /* loaded from: classes2.dex */
    public static final class a extends dns<dnv, dtx> {
        public /* synthetic */ a(byte b) {
            this();
        }

        @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u0004\u0018\u00010\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "Lkotlinx/coroutines/CoroutineDispatcher;", "it", "Lkotlin/coroutines/CoroutineContext$Element;"}, k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: dtx$a$1  reason: invalid class name */
        /* loaded from: classes2.dex */
        static final class AnonymousClass1 extends dqd implements dow<dnw.b, dtx> {
            public static final AnonymousClass1 a = new AnonymousClass1();

            AnonymousClass1() {
                super(1);
            }

            @Override // defpackage.dow
            public final /* bridge */ /* synthetic */ dtx invoke(dnw.b bVar) {
                dnw.b bVar2 = bVar;
                if (bVar2 instanceof dtx) {
                    return (dtx) bVar2;
                }
                return null;
            }
        }

        private a() {
            super(dnv.a, AnonymousClass1.a);
        }
    }

    public void dispatchYield(dnw dnwVar, Runnable runnable) {
        dispatch(dnwVar, runnable);
    }

    @Override // defpackage.dnv
    public final <T> dnu<T> interceptContinuation(dnu<? super T> dnuVar) {
        return new dyf(this, dnuVar);
    }

    @Override // defpackage.dnv
    public final void releaseInterceptedContinuation(dnu<?> dnuVar) {
        dyf dyfVar = (dyf) dnuVar;
        do {
        } while (dyfVar._reusableCancellableContinuation == dyg.a);
        Object obj = dyfVar._reusableCancellableContinuation;
        dtg dtgVar = obj instanceof dtg ? (dtg) obj : null;
        if (dtgVar != null) {
            dtgVar.g();
        }
    }

    public String toString() {
        return getClass().getSimpleName() + '@' + Integer.toHexString(System.identityHashCode(this));
    }
}
