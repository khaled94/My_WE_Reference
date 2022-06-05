package defpackage;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bta  reason: default package */
/* loaded from: classes2.dex */
public final class bta implements Runnable {
    private final /* synthetic */ bva a;
    private final /* synthetic */ bsx b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bta(bsx bsxVar, bva bvaVar) {
        this.b = bsxVar;
        this.a = bvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boz bozVar = this.b.b;
        if (bozVar == null) {
            this.b.q().c.a("Failed to reset data on the service; null service");
            return;
        }
        try {
            bozVar.d(this.a);
        } catch (RemoteException e) {
            this.b.q().c.a("Failed to reset data on the service", e);
        }
        this.b.z();
    }
}
