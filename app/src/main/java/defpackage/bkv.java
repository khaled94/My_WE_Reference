package defpackage;

import android.os.RemoteException;

/* renamed from: bkv  reason: default package */
/* loaded from: classes2.dex */
public final class bkv extends bjy {
    private final /* synthetic */ bjh a;

    public bkv(bjh bjhVar) {
        this.a = bjhVar;
    }

    @Override // defpackage.bjx
    public final void a(bjo bjoVar) throws RemoteException {
        this.a.onMapReady(new bjf(bjoVar));
    }
}
