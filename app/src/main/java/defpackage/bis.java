package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bis  reason: default package */
/* loaded from: classes2.dex */
public abstract class bis extends ann implements bit {
    public bis() {
        super("com.google.android.gms.location.ILocationListener");
    }

    public static bit a(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationListener");
        if (queryLocalInterface instanceof bit) {
            return (bit) queryLocalInterface;
        }
        return new bir(iBinder);
    }

    @Override // defpackage.ann
    public final boolean a(int i, Parcel parcel) throws RemoteException {
        if (i == 1) {
            a((Location) anu.a(parcel, Location.CREATOR));
            return true;
        }
        return false;
    }
}
