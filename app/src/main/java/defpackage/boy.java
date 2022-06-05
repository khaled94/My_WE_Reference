package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import java.util.List;

/* renamed from: boy  reason: default package */
/* loaded from: classes2.dex */
public abstract class boy extends aom implements boz {
    public boy() {
        super("com.google.android.gms.measurement.internal.IMeasurementService");
    }

    @Override // defpackage.aom
    public final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 1:
                a((bli) ard.a(parcel, bli.CREATOR), (bva) ard.a(parcel, bva.CREATOR));
                parcel2.writeNoException();
                return true;
            case 2:
                a((buq) ard.a(parcel, buq.CREATOR), (bva) ard.a(parcel, bva.CREATOR));
                parcel2.writeNoException();
                return true;
            case 3:
            case 8:
            default:
                return false;
            case 4:
                a((bva) ard.a(parcel, bva.CREATOR));
                parcel2.writeNoException();
                return true;
            case 5:
                a((bli) ard.a(parcel, bli.CREATOR), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 6:
                b((bva) ard.a(parcel, bva.CREATOR));
                parcel2.writeNoException();
                return true;
            case 7:
                List<buq> a = a((bva) ard.a(parcel, bva.CREATOR), ard.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a);
                return true;
            case 9:
                byte[] a2 = a((bli) ard.a(parcel, bli.CREATOR), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeByteArray(a2);
                return true;
            case 10:
                a(parcel.readLong(), parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                return true;
            case 11:
                String c = c((bva) ard.a(parcel, bva.CREATOR));
                parcel2.writeNoException();
                parcel2.writeString(c);
                return true;
            case 12:
                a((bvd) ard.a(parcel, bvd.CREATOR), (bva) ard.a(parcel, bva.CREATOR));
                parcel2.writeNoException();
                return true;
            case 13:
                a((bvd) ard.a(parcel, bvd.CREATOR));
                parcel2.writeNoException();
                return true;
            case 14:
                List<buq> a3 = a(parcel.readString(), parcel.readString(), ard.a(parcel), (bva) ard.a(parcel, bva.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a3);
                return true;
            case 15:
                List<buq> a4 = a(parcel.readString(), parcel.readString(), parcel.readString(), ard.a(parcel));
                parcel2.writeNoException();
                parcel2.writeTypedList(a4);
                return true;
            case 16:
                List<bvd> a5 = a(parcel.readString(), parcel.readString(), (bva) ard.a(parcel, bva.CREATOR));
                parcel2.writeNoException();
                parcel2.writeTypedList(a5);
                return true;
            case 17:
                List<bvd> a6 = a(parcel.readString(), parcel.readString(), parcel.readString());
                parcel2.writeNoException();
                parcel2.writeTypedList(a6);
                return true;
            case 18:
                d((bva) ard.a(parcel, bva.CREATOR));
                parcel2.writeNoException();
                return true;
        }
    }
}
