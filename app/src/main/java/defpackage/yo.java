package defpackage;

import android.os.RemoteException;
import defpackage.vc;
import defpackage.wf;

/* renamed from: yo  reason: default package */
/* loaded from: classes2.dex */
final class yo extends wf {
    final /* synthetic */ wf.a d;

    /* JADX INFO: Access modifiers changed from: package-private */
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public yo(wf.a aVar, uw[] uwVarArr, boolean z, int i) {
        super(uwVarArr, z, i);
        this.d = aVar;
    }

    @Override // defpackage.wf
    protected final void a(vc.b bVar, bwm bwmVar) throws RemoteException {
        this.d.a.a(bVar, bwmVar);
    }
}
