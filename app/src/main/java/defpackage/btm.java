package defpackage;

import android.os.Bundle;
import android.os.RemoteException;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: btm  reason: default package */
/* loaded from: classes2.dex */
public final class btm implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ boolean c;
    private final /* synthetic */ bva d;
    private final /* synthetic */ bas e;
    private final /* synthetic */ bsx f;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btm(bsx bsxVar, String str, String str2, boolean z, bva bvaVar, bas basVar) {
        this.f = bsxVar;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = bvaVar;
        this.e = basVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        Bundle bundle = new Bundle();
        try {
            boz bozVar = this.f.b;
            if (bozVar == null) {
                this.f.q().c.a("Failed to get user properties", this.a, this.b);
                return;
            }
            bundle = buv.a(bozVar.a(this.a, this.b, this.c, this.d));
            this.f.z();
        } catch (RemoteException e) {
            this.f.q().c.a("Failed to get user properties", this.a, e);
        } finally {
            this.f.o().a(this.e, bundle);
        }
    }
}
