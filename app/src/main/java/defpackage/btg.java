package defpackage;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: btg  reason: default package */
/* loaded from: classes2.dex */
public final class btg implements Runnable {
    private final /* synthetic */ bva a;
    private final /* synthetic */ bsx b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btg(bsx bsxVar, bva bvaVar) {
        this.b = bsxVar;
        this.a = bvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boz bozVar = this.b.b;
        if (bozVar == null) {
            this.b.q().c.a("Failed to send measurementEnabled to service");
            return;
        }
        try {
            bozVar.b(this.a);
            this.b.z();
        } catch (RemoteException e) {
            this.b.q().c.a("Failed to send measurementEnabled to the service", e);
        }
    }
}
