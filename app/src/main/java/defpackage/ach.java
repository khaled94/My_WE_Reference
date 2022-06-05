package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ach  reason: default package */
/* loaded from: classes.dex */
public abstract class ach extends aiv implements aan {
    public ach() {
        super("com.google.android.gms.common.internal.IGmsCallbacks");
    }

    @Override // defpackage.aiv
    public final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            a(parcel.readInt(), parcel.readStrongBinder(), (Bundle) aiw.a(parcel, Bundle.CREATOR));
        } else if (i == 2) {
            parcel.readInt();
            aiw.a(parcel, Bundle.CREATOR);
            a();
        } else if (i != 3) {
            return false;
        } else {
            a(parcel.readInt(), parcel.readStrongBinder(), (acu) aiw.a(parcel, acu.CREATOR));
        }
        parcel2.writeNoException();
        return true;
    }
}
