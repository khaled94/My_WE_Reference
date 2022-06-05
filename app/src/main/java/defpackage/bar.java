package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bar  reason: default package */
/* loaded from: classes.dex */
public abstract class bar extends aom implements bas {
    public bar() {
        super("com.google.android.gms.measurement.api.internal.IBundleReceiver");
    }

    @Override // defpackage.aom
    protected final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            a((Bundle) ard.a(parcel, Bundle.CREATOR));
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
