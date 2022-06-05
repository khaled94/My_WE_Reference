package defpackage;

import androidx.exifinterface.media.ExifInterface;
import kotlin.Metadata;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\b\u0000\u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\b\u0012\u0004\u0012\u0002H\u00010\u0002B\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00028\u00000\u0006¢\u0006\u0002\u0010\u0007J\u0012\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\nH\u0014J\u0006\u0010\u000e\u001a\u00020\u000fJ\u0018\u0010\u0010\u001a\u00020\f2\u0006\u0010\u0003\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\nR\u0010\u0010\b\u001a\u0004\u0018\u00010\u0004X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\t\u001a\u0004\u0018\u00010\nX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lkotlinx/coroutines/UndispatchedCoroutine;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/internal/ScopeCoroutine;", "context", "Lkotlin/coroutines/CoroutineContext;", "uCont", "Lkotlin/coroutines/Continuation;", "(Lkotlin/coroutines/CoroutineContext;Lkotlin/coroutines/Continuation;)V", "savedContext", "savedOldValue", "", "afterResume", "", "state", "clearThreadContext", "", "saveThreadContext", "oldValue", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dwe  reason: default package */
/* loaded from: classes2.dex */
public final class dwe<T> extends dyw<T> {
    dnw a;
    Object d;

    public dwe(dnw dnwVar, dnu<? super T> dnuVar) {
        super(dnwVar.get(dwf.a) == null ? dnwVar.plus(dwf.a) : dnwVar, dnuVar);
    }

    public final boolean m() {
        if (this.a == null) {
            return false;
        }
        this.a = null;
        this.d = null;
        return true;
    }

    @Override // defpackage.dyw, defpackage.dst
    public final void b(Object obj) {
        dnw dnwVar = this.a;
        dwe<?> dweVar = null;
        if (dnwVar != null) {
            dzc.b(dnwVar, this.d);
            this.a = null;
            this.d = null;
        }
        Object a = dtu.a(obj, this.e);
        dnu<T> dnuVar = this.e;
        dnw context = dnuVar.getContext();
        Object a2 = dzc.a(context, null);
        if (a2 != dzc.a) {
            dweVar = dtw.a(dnuVar, context, a2);
        }
        try {
            this.e.resumeWith(a);
            dmg dmgVar = dmg.a;
        } finally {
            if (dweVar == null || dweVar.m()) {
                dzc.b(context, a2);
            }
        }
    }
}
