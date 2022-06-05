package defpackage;

import android.app.Dialog;

/* renamed from: zd  reason: default package */
/* loaded from: classes2.dex */
final class zd extends xw {
    final /* synthetic */ Dialog a;
    final /* synthetic */ ze b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zd(ze zeVar, Dialog dialog) {
        this.b = zeVar;
        this.a = dialog;
    }

    @Override // defpackage.xw
    public final void a() {
        this.b.a.f();
        if (this.a.isShowing()) {
            this.a.dismiss();
        }
    }
}
