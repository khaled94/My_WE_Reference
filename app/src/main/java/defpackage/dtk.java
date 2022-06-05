package defpackage;

import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u0003\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0011\u0012\n\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u0003¢\u0006\u0002\u0010\u0004J\u0013\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\bH\u0096\u0002R\u0014\u0010\u0002\u001a\u0006\u0012\u0002\b\u00030\u00038\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\t"}, d2 = {"Lkotlinx/coroutines/ChildContinuation;", "Lkotlinx/coroutines/JobCancellingNode;", "child", "Lkotlinx/coroutines/CancellableContinuationImpl;", "(Lkotlinx/coroutines/CancellableContinuationImpl;)V", "invoke", "", "cause", "", "kotlinx-coroutines-core"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: dtk  reason: default package */
/* loaded from: classes2.dex */
public final class dtk extends dvj {
    public final dtg<?> a;

    @Override // defpackage.dow
    public final /* synthetic */ dmg invoke(Throwable th) {
        a(th);
        return dmg.a;
    }

    public dtk(dtg<?> dtgVar) {
        this.a = dtgVar;
    }

    @Override // defpackage.dtt
    public final void a(Throwable th) {
        dtg<?> dtgVar = this.a;
        Throwable a = dtg.a((dvi) c());
        boolean z = true;
        if (dtgVar.c()) {
            dyf dyfVar = (dyf) dtgVar.a;
            while (true) {
                Object obj = dyfVar._reusableCancellableContinuation;
                if (dqc.a(obj, dyg.a)) {
                    if (dyf.f.compareAndSet(dyfVar, dyg.a, a)) {
                        break;
                    }
                } else if (obj instanceof Throwable) {
                    break;
                } else if (dyf.f.compareAndSet(dyfVar, obj, null)) {
                    break;
                }
            }
        }
        z = false;
        if (!z) {
            dtgVar.b(a);
            dtgVar.f();
        }
    }
}
