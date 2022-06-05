package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bti  reason: default package */
/* loaded from: classes2.dex */
public final class bti implements Runnable {
    private final /* synthetic */ boolean a = true;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ bvd c;
    private final /* synthetic */ bva d;
    private final /* synthetic */ bvd e;
    private final /* synthetic */ bsx f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bti(bsx bsxVar, boolean z, bvd bvdVar, bva bvaVar, bvd bvdVar2) {
        this.f = bsxVar;
        this.b = z;
        this.c = bvdVar;
        this.d = bvaVar;
        this.e = bvdVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boz bozVar = this.f.b;
        if (bozVar == null) {
            this.f.q().c.a("Discarding data. Failed to send conditional user property to service");
            return;
        }
        if (this.a) {
            this.f.a(bozVar, this.b ? null : this.c, this.d);
        } else {
            try {
                if (TextUtils.isEmpty(this.e.a)) {
                    bozVar.a(this.c, this.d);
                } else {
                    bozVar.a(this.c);
                }
            } catch (RemoteException e) {
                this.f.q().c.a("Failed to send conditional user property to the service", e);
            }
        }
        this.f.z();
    }
}
