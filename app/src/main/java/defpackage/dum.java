package defpackage;

import androidx.exifinterface.media.ExifInterface;
import defpackage.dmb;
import java.util.concurrent.CancellationException;
import kotlin.Metadata;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0003\n\u0002\b\u000e\b \u0018\u0000*\u0006\b\u0000\u0010\u0001 \u00002\u00060\u0002j\u0002`\u0003B\r\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0002\u0010\u0006J\u001f\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000e2\u0006\u0010\u000f\u001a\u00020\u0010H\u0010¢\u0006\u0002\b\u0011J\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00102\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0002\b\u0014J\u001f\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0001\u0010\u00012\b\u0010\u0013\u001a\u0004\u0018\u00010\u000eH\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0018\u001a\u00020\f2\b\u0010\u0019\u001a\u0004\u0018\u00010\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u0010J\u0006\u0010\u001b\u001a\u00020\fJ\u000f\u0010\u001c\u001a\u0004\u0018\u00010\u000eH ¢\u0006\u0002\b\u001dR\u0018\u0010\u0007\u001a\b\u0012\u0004\u0012\u00028\u00000\bX \u0004¢\u0006\u0006\u001a\u0004\b\t\u0010\nR\u0012\u0010\u0004\u001a\u00020\u00058\u0006@\u0006X\u0087\u000e¢\u0006\u0002\n\u0000¨\u0006\u001e"}, d2 = {"Lkotlinx/coroutines/DispatchedTask;", ExifInterface.GPS_DIRECTION_TRUE, "Lkotlinx/coroutines/scheduling/Task;", "Lkotlinx/coroutines/SchedulerTask;", "resumeMode", "", "(I)V", "delegate", "Lkotlin/coroutines/Continuation;", "getDelegate$kotlinx_coroutines_core", "()Lkotlin/coroutines/Continuation;", "cancelCompletedResult", "", "takenState", "", "cause", "", "cancelCompletedResult$kotlinx_coroutines_core", "getExceptionalResult", "state", "getExceptionalResult$kotlinx_coroutines_core", "getSuccessfulResult", "getSuccessfulResult$kotlinx_coroutines_core", "(Ljava/lang/Object;)Ljava/lang/Object;", "handleFatalException", "exception", "finallyException", "run", "takeState", "takeState$kotlinx_coroutines_core", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dum  reason: default package */
/* loaded from: classes2.dex */
public abstract class dum<T> extends dzs {
    public int c;

    public abstract dnu<T> a();

    public void a(Object obj, Throwable th) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    public <T> T c(Object obj) {
        return obj;
    }

    public abstract Object d();

    public dum(int i) {
        this.c = i;
    }

    public Throwable d(Object obj) {
        dtr dtrVar = obj instanceof dtr ? (dtr) obj : null;
        if (dtrVar == null) {
            return null;
        }
        return dtrVar.a;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Object obj;
        Object obj2;
        CancellationException cancellationException;
        if (dug.a()) {
            if (!(this.c != -1)) {
                throw new AssertionError();
            }
        }
        dzt dztVar = this.h;
        try {
            dyf dyfVar = (dyf) a();
            dnu<T> dnuVar = dyfVar.b;
            Object obj3 = dyfVar.e;
            dnw context = dnuVar.getContext();
            Object a = dzc.a(context, obj3);
            dwe<?> a2 = a != dzc.a ? dtw.a(dnuVar, context, a) : null;
            dnw context2 = dnuVar.getContext();
            Object d = d();
            Throwable d2 = d(d);
            dvi dviVar = (d2 != null || !dun.a(this.c)) ? null : (dvi) context2.get(dvi.b);
            if (dviVar != null && !dviVar.a()) {
                CancellationException g = dviVar.g();
                a(d, g);
                dmb.a aVar = dmb.a;
                if (dug.c() && (dnuVar instanceof dof)) {
                    cancellationException = dyx.a(g, (dof) dnuVar);
                    dnuVar.resumeWith(dmb.d(dmc.a(cancellationException)));
                }
                cancellationException = g;
                dnuVar.resumeWith(dmb.d(dmc.a(cancellationException)));
            } else if (d2 != null) {
                dmb.a aVar2 = dmb.a;
                dnuVar.resumeWith(dmb.d(dmc.a(d2)));
            } else {
                T c = c(d);
                dmb.a aVar3 = dmb.a;
                dnuVar.resumeWith(dmb.d(c));
            }
            dmg dmgVar = dmg.a;
            if (a2 == null || a2.m()) {
                dzc.b(context, a);
            }
            try {
                dmb.a aVar4 = dmb.a;
                dztVar.b();
                obj2 = dmb.d(dmg.a);
            } catch (Throwable th) {
                dmb.a aVar5 = dmb.a;
                obj2 = dmb.d(dmc.a(th));
            }
            a((Throwable) null, dmb.c(obj2));
        } catch (Throwable th2) {
            try {
                dmb.a aVar6 = dmb.a;
                dztVar.b();
                obj = dmb.d(dmg.a);
            } catch (Throwable th3) {
                dmb.a aVar7 = dmb.a;
                obj = dmb.d(dmc.a(th3));
            }
            a(th2, dmb.c(obj));
        }
    }

    public final void a(Throwable th, Throwable th2) {
        if (th == null && th2 == null) {
            return;
        }
        if (th != null && th2 != null) {
            dlr.a(th, th2);
        }
        if (th == null) {
            th = th2;
        }
        dqc.a((Object) th);
        dtz.a(a().getContext(), new duf("Fatal exception in coroutines machinery for " + this + ". Please read KDoc to 'handleFatalException' method and report this incident to maintainers", th));
    }
}
