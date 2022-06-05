package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.dmb;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000J\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\u001a;\u0010\u0006\u001a\u00020\u0007*\u0006\u0012\u0002\b\u00030\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\u0006\u0010\u000b\u001a\u00020\f2\b\b\u0002\u0010\r\u001a\u00020\u00072\f\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u00100\u000fH\u0082\b\u001aU\u0010\u0011\u001a\u00020\u0010\"\u0004\b\u0000\u0010\u0012*\b\u0012\u0004\u0012\u0002H\u00120\u00132\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u0002H\u00120\u00152%\b\u0002\u0010\u0016\u001a\u001f\u0012\u0013\u0012\u00110\u0018¢\u0006\f\b\u0019\u0012\b\b\u001a\u0012\u0004\b\b(\u001b\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u0017H\u0007ø\u0001\u0000¢\u0006\u0002\u0010\u001c\u001a\u0012\u0010\u001d\u001a\u00020\u0007*\b\u0012\u0004\u0012\u00020\u00100\bH\u0000\"\u0016\u0010\u0000\u001a\u00020\u00018\u0000X\u0081\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0002\u0010\u0003\"\u0016\u0010\u0004\u001a\u00020\u00018\u0002X\u0083\u0004¢\u0006\b\n\u0000\u0012\u0004\b\u0005\u0010\u0003\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001e"}, d2 = {"REUSABLE_CLAIMED", "Lkotlinx/coroutines/internal/Symbol;", "getREUSABLE_CLAIMED$annotations", "()V", "UNDEFINED", "getUNDEFINED$annotations", "executeUnconfined", "", "Lkotlinx/coroutines/internal/DispatchedContinuation;", "contState", "", "mode", "", "doYield", "block", "Lkotlin/Function0;", "", "resumeCancellableWith", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlin/coroutines/Continuation;", "result", "Lkotlin/Result;", "onCancellation", "Lkotlin/Function1;", "", "Lkotlin/ParameterName;", "name", "cause", "(Lkotlin/coroutines/Continuation;Ljava/lang/Object;Lkotlin/jvm/functions/Function1;)V", "yieldUndispatched", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: dyg */
/* loaded from: classes2.dex */
public final class dyg {
    private static final dyy b = new dyy("UNDEFINED");
    public static final dyy a = new dyy("REUSABLE_CLAIMED");

    public static final <T> void a(dnu<? super T> dnuVar, Object obj) {
        boolean z;
        if (!(dnuVar instanceof dyf)) {
            dnuVar.resumeWith(obj);
            return;
        }
        dyf dyfVar = (dyf) dnuVar;
        Object a2 = dtu.a(obj);
        if (dyfVar.a.isDispatchNeeded(dyfVar.getContext())) {
            dyfVar.d = a2;
            dyfVar.c = 1;
            dyfVar.a.dispatch(dyfVar.getContext(), dyfVar);
            return;
        }
        dug.a();
        dwc dwcVar = dwc.a;
        dut a3 = dwc.a();
        if (a3.f()) {
            dyfVar.d = a2;
            dyfVar.c = 1;
            a3.a(dyfVar);
            return;
        }
        dyf dyfVar2 = dyfVar;
        a3.a(true);
        try {
            dvi dviVar = (dvi) dyfVar.getContext().get(dvi.b);
            if (dviVar == null || dviVar.a()) {
                z = false;
            } else {
                CancellationException g = dviVar.g();
                dyfVar.a(a2, g);
                dmb.a aVar = dmb.a;
                dyfVar.resumeWith(dmb.d(dmc.a(g)));
                z = true;
            }
            if (!z) {
                dnu<T> dnuVar2 = dyfVar.b;
                Object obj2 = dyfVar.e;
                dnw context = dnuVar2.getContext();
                Object a4 = dzc.a(context, obj2);
                dwe<?> a5 = a4 != dzc.a ? dtw.a(dnuVar2, context, a4) : null;
                dyfVar.b.resumeWith(obj);
                dmg dmgVar = dmg.a;
                if (a5 == null || a5.m()) {
                    dzc.b(context, a4);
                }
            }
            do {
            } while (a3.e());
        } catch (Throwable th) {
            try {
                dyfVar2.a(th, (Throwable) null);
            } finally {
                a3.b(true);
            }
        }
    }
}
