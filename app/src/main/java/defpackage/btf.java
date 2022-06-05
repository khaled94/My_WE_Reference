package defpackage;

import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: btf  reason: default package */
/* loaded from: classes2.dex */
public final class btf implements Runnable {
    private final /* synthetic */ bst a;
    private final /* synthetic */ bsx b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btf(bsx bsxVar, bst bstVar) {
        this.b = bsxVar;
        this.a = bstVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boz bozVar = this.b.b;
        if (bozVar == null) {
            this.b.q().c.a("Failed to send current screen to service");
            return;
        }
        try {
            if (this.a == null) {
                bozVar.a(0L, (String) null, (String) null, this.b.m().getPackageName());
            } else {
                bozVar.a(this.a.c, this.a.a, this.a.b, this.b.m().getPackageName());
            }
            this.b.z();
        } catch (RemoteException e) {
            this.b.q().c.a("Failed to send current screen to the service", e);
        }
    }
}
