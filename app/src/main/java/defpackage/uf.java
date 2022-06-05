package defpackage;

import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInAccount;
import com.google.android.gms.common.api.Status;

/* renamed from: uf  reason: default package */
/* loaded from: classes2.dex */
public abstract class uf extends aib implements ug {
    public uf() {
        super("com.google.android.gms.auth.api.signin.internal.ISignInCallbacks");
    }

    @Override // defpackage.aib
    public final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        switch (i) {
            case 101:
                aid.a(parcel, GoogleSignInAccount.CREATOR);
                aid.a(parcel, Status.CREATOR);
                a();
                break;
            case 102:
                b((Status) aid.a(parcel, Status.CREATOR));
                break;
            case 103:
                a((Status) aid.a(parcel, Status.CREATOR));
                break;
            default:
                return false;
        }
        parcel2.writeNoException();
        return true;
    }
}
