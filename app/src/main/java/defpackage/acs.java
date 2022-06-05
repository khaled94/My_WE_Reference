package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.common.ConnectionResult;
import defpackage.aad;

/* renamed from: acs  reason: default package */
/* loaded from: classes.dex */
public final class acs extends acg {
    public final IBinder e;
    final /* synthetic */ aad f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public acs(aad aadVar, int i, IBinder iBinder, Bundle bundle) {
        super(aadVar, i, bundle);
        this.f = aadVar;
        this.e = iBinder;
    }

    @Override // defpackage.acg
    protected final void a(ConnectionResult connectionResult) {
        if (this.f.A != null) {
            this.f.A.a(connectionResult);
        }
        this.f.a(connectionResult);
    }

    @Override // defpackage.acg
    protected final boolean b() {
        aad.a aVar;
        aad.a aVar2;
        try {
            IBinder iBinder = this.e;
            aat.a(iBinder);
            String interfaceDescriptor = iBinder.getInterfaceDescriptor();
            if (!this.f.c().equals(interfaceDescriptor)) {
                String c = this.f.c();
                StringBuilder sb = new StringBuilder(String.valueOf(c).length() + 34 + String.valueOf(interfaceDescriptor).length());
                sb.append("service descriptor mismatch: ");
                sb.append(c);
                sb.append(" vs. ");
                sb.append(interfaceDescriptor);
                return false;
            }
            IInterface a = this.f.a(this.e);
            if (a == null) {
                return false;
            }
            if (!aad.a(this.f, 2, 4, a) && !aad.a(this.f, 3, 4, a)) {
                return false;
            }
            this.f.C = null;
            aad aadVar = this.f;
            aVar = aadVar.z;
            if (aVar != null) {
                aVar2 = aadVar.z;
                aVar2.a();
            }
            return true;
        } catch (RemoteException unused) {
            return false;
        }
    }
}
