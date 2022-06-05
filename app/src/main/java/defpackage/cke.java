package defpackage;

import defpackage.vp;

/* renamed from: cke  reason: default package */
/* loaded from: classes2.dex */
final class cke implements vp.a {
    private final /* synthetic */ ckb a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cke(ckb ckbVar) {
        this.a = ckbVar;
    }

    @Override // defpackage.vp.a
    public final void a(boolean z) {
        if (z) {
            this.a.b = true;
            this.a.a.b();
            return;
        }
        this.a.b = false;
        if (!this.a.a()) {
            return;
        }
        this.a.a.a();
    }
}
