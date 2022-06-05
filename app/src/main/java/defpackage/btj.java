package defpackage;

import android.os.RemoteException;
import android.text.TextUtils;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: btj  reason: default package */
/* loaded from: classes2.dex */
public final class btj implements Runnable {
    private final /* synthetic */ boolean a = true;
    private final /* synthetic */ boolean b;
    private final /* synthetic */ bli c;
    private final /* synthetic */ bva d;
    private final /* synthetic */ String e;
    private final /* synthetic */ bsx f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btj(bsx bsxVar, boolean z, bli bliVar, bva bvaVar, String str) {
        this.f = bsxVar;
        this.b = z;
        this.c = bliVar;
        this.d = bvaVar;
        this.e = str;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boz bozVar = this.f.b;
        if (bozVar == null) {
            this.f.q().c.a("Discarding data. Failed to send event to service");
            return;
        }
        if (this.a) {
            this.f.a(bozVar, this.b ? null : this.c, this.d);
        } else {
            try {
                if (TextUtils.isEmpty(this.e)) {
                    bozVar.a(this.c, this.d);
                } else {
                    bozVar.a(this.c, this.e, this.f.q().n_());
                }
            } catch (RemoteException e) {
                this.f.q().c.a("Failed to send event to the service", e);
            }
        }
        this.f.z();
    }
}
