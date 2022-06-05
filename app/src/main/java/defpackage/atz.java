package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: atz  reason: default package */
/* loaded from: classes.dex */
public final class atz extends apc implements atc {
    /* JADX INFO: Access modifiers changed from: package-private */
    public atz(IBinder iBinder) {
        super(iBinder, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
    }

    @Override // defpackage.atc
    public final Bundle a(Bundle bundle) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bundle);
        Parcel a = a(1, k_);
        Bundle bundle2 = (Bundle) ard.a(a, Bundle.CREATOR);
        a.recycle();
        return bundle2;
    }
}
