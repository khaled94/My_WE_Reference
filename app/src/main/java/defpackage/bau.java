package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bau  reason: default package */
/* loaded from: classes.dex */
public final class bau extends apc implements bas {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bau(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.bas
    public final void a(Bundle bundle) throws RemoteException {
        Parcel k_ = k_();
        ard.a(k_, bundle);
        b(1, k_);
    }
}
