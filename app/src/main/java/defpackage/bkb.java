package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bkb  reason: default package */
/* loaded from: classes2.dex */
public abstract class bkb extends aod implements bka {
    public bkb() {
        super("com.google.android.gms.maps.internal.IOnStreetViewPanoramaReadyCallback");
    }

    @Override // defpackage.aod
    public final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        bjr bjrVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                bjrVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaDelegate");
                if (queryLocalInterface instanceof bjr) {
                    bjrVar = (bjr) queryLocalInterface;
                } else {
                    bjrVar = new bkc(readStrongBinder);
                }
            }
            a(bjrVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
