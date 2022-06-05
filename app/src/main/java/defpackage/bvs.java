package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.common.api.Status;

/* renamed from: bvs  reason: default package */
/* loaded from: classes2.dex */
public abstract class bvs extends aim implements bvt {
    public bvs() {
        super("com.google.android.gms.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.aim
    public final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 3:
                ain.a(parcel, ConnectionResult.CREATOR);
                ain.a(parcel, bvp.CREATOR);
                break;
            case 4:
                ain.a(parcel, Status.CREATOR);
                break;
            case 5:
            default:
                return false;
            case 6:
                ain.a(parcel, Status.CREATOR);
                break;
            case 7:
                ain.a(parcel, Status.CREATOR);
                ain.a(parcel, GoogleSignInAccount.CREATOR);
                break;
            case 8:
                a((bvz) ain.a(parcel, bvz.CREATOR));
                break;
            case 9:
                ain.a(parcel, bvv.CREATOR);
                break;
        }
        parcel2.writeNoException();
        return true;
    }
}
