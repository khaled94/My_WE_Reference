package defpackage;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: btd  reason: default package */
/* loaded from: classes2.dex */
public final class btd implements Runnable {
    private final /* synthetic */ bva a;
    private final /* synthetic */ bas b;
    private final /* synthetic */ bsx c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btd(bsx bsxVar, bva bvaVar, bas basVar) {
        this.c = bsxVar;
        this.a = bvaVar;
        this.b = basVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        String str = null;
        try {
            boz bozVar = this.c.b;
            if (bozVar == null) {
                this.c.q().c.a("Failed to get app instance id");
                return;
            }
            str = bozVar.c(this.a);
            if (str != null) {
                this.c.e().a(str);
                this.c.r().k.a(str);
            }
            this.c.z();
        } catch (RemoteException e) {
            this.c.q().c.a("Failed to get app instance id", e);
        } finally {
            this.c.o().a(this.b, str);
        }
    }
}
