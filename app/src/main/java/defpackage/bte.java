package defpackage;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bte  reason: default package */
/* loaded from: classes2.dex */
public final class bte implements Runnable {
    private final /* synthetic */ bli a;
    private final /* synthetic */ String b;
    private final /* synthetic */ bas c;
    private final /* synthetic */ bsx d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bte(bsx bsxVar, bli bliVar, String str, bas basVar) {
        this.d = bsxVar;
        this.a = bliVar;
        this.b = str;
        this.c = basVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        byte[] bArr = null;
        try {
            boz bozVar = this.d.b;
            if (bozVar == null) {
                this.d.q().c.a("Discarding data. Failed to send event to service to bundle");
                return;
            }
            bArr = bozVar.a(this.a, this.b);
            this.d.z();
        } catch (RemoteException e) {
            this.d.q().c.a("Failed to send event to the service to bundle", e);
        } finally {
            this.d.o().a(this.c, bArr);
        }
    }
}
