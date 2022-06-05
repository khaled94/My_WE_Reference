package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.afn;

/* renamed from: ahg  reason: default package */
/* loaded from: classes.dex */
public abstract class ahg extends amv implements ahf {
    public ahg() {
        super("com.google.android.gms.flags.IFlagProvider");
    }

    public static ahf asInterface(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.flags.IFlagProvider");
        if (queryLocalInterface instanceof ahf) {
            return (ahf) queryLocalInterface;
        }
        return new ahh(iBinder);
    }

    @Override // defpackage.amv
    public final boolean dispatchTransaction$3d31fa39(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            init(afn.a.a(parcel.readStrongBinder()));
            parcel2.writeNoException();
        } else if (i == 2) {
            boolean booleanFlagValue = getBooleanFlagValue(parcel.readString(), amw.a(parcel), parcel.readInt());
            parcel2.writeNoException();
            amw.a(parcel2, booleanFlagValue);
        } else if (i == 3) {
            int intFlagValue = getIntFlagValue(parcel.readString(), parcel.readInt(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeInt(intFlagValue);
        } else if (i == 4) {
            long longFlagValue = getLongFlagValue(parcel.readString(), parcel.readLong(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeLong(longFlagValue);
        } else if (i != 5) {
            return false;
        } else {
            String stringFlagValue = getStringFlagValue(parcel.readString(), parcel.readString(), parcel.readInt());
            parcel2.writeNoException();
            parcel2.writeString(stringFlagValue);
        }
        return true;
    }
}
