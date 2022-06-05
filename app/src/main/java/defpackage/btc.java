package defpackage;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: btc  reason: default package */
/* loaded from: classes2.dex */
public final class btc implements Runnable {
    private final /* synthetic */ bva a;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ bsx c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btc(bsx bsxVar, bva bvaVar, boolean z) {
        this.c = bsxVar;
        this.a = bvaVar;
        this.b = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boz bozVar = this.c.b;
        if (bozVar == null) {
            this.c.q().c.a("Discarding data. Failed to send app launch");
            return;
        }
        try {
            bozVar.a(this.a);
            if (this.b) {
                this.c.i().x();
            }
            this.c.a(bozVar, (abb) null, this.a);
            this.c.z();
        } catch (RemoteException e) {
            this.c.q().c.a("Failed to send app launch to the service", e);
        }
    }
}
