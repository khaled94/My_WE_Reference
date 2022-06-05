package defpackage;

import java.lang.ref.WeakReference;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xe  reason: default package */
/* loaded from: classes2.dex */
public final class xe extends xw {
    private final WeakReference<xf> a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xe(xf xfVar) {
        this.a = new WeakReference<>(xfVar);
    }

    @Override // defpackage.xw
    public final void a() {
        xf xfVar = this.a.get();
        if (xfVar == null) {
            return;
        }
        xf.a(xfVar);
    }
}
