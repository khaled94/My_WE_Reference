package defpackage;

import java.lang.ref.WeakReference;

/* renamed from: wx  reason: default package */
/* loaded from: classes2.dex */
final class wx extends bvr {
    private final WeakReference<xa> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wx(xa xaVar) {
        this.a = new WeakReference<>(xaVar);
    }

    @Override // defpackage.bvr, defpackage.bvt
    public final void a(bvz bvzVar) {
        xa xaVar = this.a.get();
        if (xaVar == null) {
            return;
        }
        xaVar.a.a(new ww(xaVar, xaVar, bvzVar));
    }
}
