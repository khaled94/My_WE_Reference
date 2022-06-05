package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: adh  reason: default package */
/* loaded from: classes.dex */
public abstract class adh extends aiv implements adi {
    public adh() {
        super("com.google.android.gms.common.internal.ICertData");
    }

    public static adi a(IBinder iBinder) {
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.ICertData");
        return queryLocalInterface instanceof adi ? (adi) queryLocalInterface : new adg(iBinder);
    }

    @Override // defpackage.aiv
    public final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            afn b = b();
            parcel2.writeNoException();
            aiw.a(parcel2, b);
        } else if (i != 2) {
            return false;
        } else {
            int a = a();
            parcel2.writeNoException();
            parcel2.writeInt(a);
        }
        return true;
    }
}
