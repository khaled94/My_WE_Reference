package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bjy  reason: default package */
/* loaded from: classes2.dex */
public abstract class bjy extends aod implements bjx {
    public bjy() {
        super("com.google.android.gms.maps.internal.IOnMapReadyCallback");
    }

    @Override // defpackage.aod
    public final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        bjo bjoVar;
        if (i == 1) {
            IBinder readStrongBinder = parcel.readStrongBinder();
            if (readStrongBinder == null) {
                bjoVar = null;
            } else {
                IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IGoogleMapDelegate");
                if (queryLocalInterface instanceof bjo) {
                    bjoVar = (bjo) queryLocalInterface;
                } else {
                    bjoVar = new bkj(readStrongBinder);
                }
            }
            a(bjoVar);
            parcel2.writeNoException();
            return true;
        }
        return false;
    }
}
