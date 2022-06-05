package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: ahw  reason: default package */
/* loaded from: classes.dex */
public abstract class ahw extends aht implements ahx {
    public ahw() {
        super("com.google.android.gms.auth.api.phone.internal.ISmsRetrieverResultCallback");
    }

    @Override // defpackage.aht
    protected final boolean a(int i, Parcel parcel) throws RemoteException {
        if (i == 1) {
            a((Status) ahu.a(parcel, Status.CREATOR));
            return true;
        }
        return false;
    }
}
