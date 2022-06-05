package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.data.DataHolder;

/* renamed from: bgv  reason: default package */
/* loaded from: classes2.dex */
public abstract class bgv extends bbz implements bia {
    public bgv() {
        super("com.google.android.gms.location.places.internal.IPlacesCallbacks");
    }

    @Override // defpackage.bbz
    public final boolean a(int i, Parcel parcel) throws RemoteException {
        if (i == 1) {
            a((DataHolder) bew.a(parcel, DataHolder.CREATOR));
        } else if (i == 2) {
            b((DataHolder) bew.a(parcel, DataHolder.CREATOR));
        } else if (i == 3) {
            c((DataHolder) bew.a(parcel, DataHolder.CREATOR));
        } else if (i == 4) {
            a((Status) bew.a(parcel, Status.CREATOR));
        } else if (i != 5) {
            return false;
        } else {
            d((DataHolder) bew.a(parcel, DataHolder.CREATOR));
        }
        return true;
    }
}
