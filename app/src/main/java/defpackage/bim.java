package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bim  reason: default package */
/* loaded from: classes2.dex */
public class bim extends ann implements bin {
    public static bin a(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.IDeviceOrientationListener");
        if (queryLocalInterface instanceof bin) {
            return (bin) queryLocalInterface;
        }
        return new bil(iBinder);
    }

    @Override // defpackage.ann
    public final boolean a(int i, Parcel parcel) throws RemoteException {
        throw null;
    }
}
