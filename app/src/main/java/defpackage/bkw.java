package defpackage;

import android.os.RemoteException;

/* renamed from: bkw  reason: default package */
/* loaded from: classes2.dex */
final class bkw extends bjy {
    private final /* synthetic */ bjh a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bkw(bjh bjhVar) {
        this.a = bjhVar;
    }

    @Override // defpackage.bjx
    public final void a(bjo bjoVar) throws RemoteException {
        this.a.onMapReady(new bjf(bjoVar));
    }
}
