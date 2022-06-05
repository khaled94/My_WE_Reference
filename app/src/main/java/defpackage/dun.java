package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.dmb;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000<\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0003\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u001a \u0010\f\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\u0006\u0010\u0010\u001a\u00020\u0001H\u0000\u001a.\u0010\u0011\u001a\u00020\r\"\u0004\b\u0000\u0010\u000e*\b\u0012\u0004\u0012\u0002H\u000e0\u000f2\f\u0010\u0012\u001a\b\u0012\u0004\u0012\u0002H\u000e0\u00132\u0006\u0010\u0014\u001a\u00020\tH\u0000\u001a\u0010\u0010\u0015\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000fH\u0002\u001a\u0019\u0010\u0016\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u00132\u0006\u0010\u0017\u001a\u00020\u0018H\u0080\b\u001a'\u0010\u0019\u001a\u00020\r*\u0006\u0012\u0002\b\u00030\u000f2\u0006\u0010\u001a\u001a\u00020\u001b2\f\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\r0\u001dH\u0080\b\"\u000e\u0010\u0000\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0016\u0010\u0002\u001a\u00020\u00018\u0000X\u0081T¢\u0006\b\n\u0000\u0012\u0004\b\u0003\u0010\u0004\"\u000e\u0010\u0005\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0006\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u000e\u0010\u0007\u001a\u00020\u0001X\u0080T¢\u0006\u0002\n\u0000\"\u0018\u0010\b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\b\u0010\n\"\u0018\u0010\u000b\u001a\u00020\t*\u00020\u00018@X\u0080\u0004¢\u0006\u0006\u001a\u0004\b\u000b\u0010\n¨\u0006\u001e"}, d2 = {"MODE_ATOMIC", "", "MODE_CANCELLABLE", "getMODE_CANCELLABLE$annotations", "()V", "MODE_CANCELLABLE_REUSABLE", "MODE_UNDISPATCHED", "MODE_UNINITIALIZED", "isCancellableMode", "", "(I)Z", "isReusableMode", "dispatch", "", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/DispatchedTask;", "mode", "resume", "delegate", "Lkotlin/coroutines/Continuation;", "undispatched", "resumeUnconfined", "resumeWithStackTrace", "exception", "", "runUnconfinedEventLoop", "eventLoop", "Lkotlinx/coroutines/EventLoop;", "block", "Lkotlin/Function0;", "kotlinx-coroutines-core"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* renamed from: dun  reason: default package */
/* loaded from: classes2.dex */
public final class dun {
    public static final boolean a(int i) {
        return i == 1 || i == 2;
    }

    public static final <T> void a(dum<? super T> dumVar, int i) {
        boolean z = true;
        if (dug.a()) {
            if (!(i != -1)) {
                throw new AssertionError();
            }
        }
        dnu<? super T> a = dumVar.a();
        if (i != 4) {
            z = false;
        }
        if (!z && (a instanceof dyf) && a(i) == a(dumVar.c)) {
            dtx dtxVar = ((dyf) a).a;
            dnw context = a.getContext();
            if (dtxVar.isDispatchNeeded(context)) {
                dtxVar.dispatch(context, dumVar);
                return;
            } else {
                a(dumVar);
                return;
            }
        }
        a(dumVar, a, z);
    }

    private static <T> void a(dum<? super T> dumVar, dnu<? super T> dnuVar, boolean z) {
        Object obj;
        boolean m;
        Object d = dumVar.d();
        Throwable d2 = dumVar.d(d);
        if (d2 != null) {
            dmb.a aVar = dmb.a;
            obj = dmc.a(d2);
        } else {
            dmb.a aVar2 = dmb.a;
            obj = dumVar.c(d);
        }
        Object d3 = dmb.d(obj);
        if (z) {
            dyf dyfVar = (dyf) dnuVar;
            dnu<T> dnuVar2 = dyfVar.b;
            Object obj2 = dyfVar.e;
            dnw context = dnuVar2.getContext();
            Object a = dzc.a(context, obj2);
            dwe<?> a2 = a != dzc.a ? dtw.a(dnuVar2, context, a) : null;
            try {
                dyfVar.b.resumeWith(d3);
                dmg dmgVar = dmg.a;
                if (a2 != null) {
                    if (!m) {
                        return;
                    }
                }
                return;
            } finally {
                if (a2 == null || a2.m()) {
                    dzc.b(context, a);
                }
            }
        }
        dnuVar.resumeWith(d3);
    }

    private static final void a(dum<?> dumVar) {
        dwc dwcVar = dwc.a;
        dut a = dwc.a();
        if (a.f()) {
            a.a(dumVar);
            return;
        }
        a.a(true);
        try {
            a(dumVar, dumVar.a(), true);
            do {
            } while (a.e());
        } catch (Throwable th) {
            try {
                dumVar.a(th, (Throwable) null);
            } finally {
                a.b(true);
            }
        }
    }
}
