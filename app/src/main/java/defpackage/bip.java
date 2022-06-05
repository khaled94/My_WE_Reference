package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: bip  reason: default package */
/* loaded from: classes2.dex */
public abstract class bip extends ann implements biq {
    public bip() {
        super("com.google.android.gms.location.ILocationCallback");
    }

    public static biq a(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.location.ILocationCallback");
        if (queryLocalInterface instanceof biq) {
            return (biq) queryLocalInterface;
        }
        return new bio(iBinder);
    }

    @Override // defpackage.ann
    public final boolean a(int i, Parcel parcel) throws RemoteException {
        if (i == 1) {
            a((LocationResult) anu.a(parcel, LocationResult.CREATOR));
        } else if (i != 2) {
            return false;
        } else {
            a((LocationAvailability) anu.a(parcel, LocationAvailability.CREATOR));
        }
        return true;
    }
}
