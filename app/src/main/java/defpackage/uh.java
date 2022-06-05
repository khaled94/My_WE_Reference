package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.auth.api.signin.GoogleSignInOptions;

/* renamed from: uh  reason: default package */
/* loaded from: classes2.dex */
public final class uh extends aia implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public uh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.auth.api.signin.internal.ISignInService");
    }

    public final void a(ug ugVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel a = a();
        aid.a(a, ugVar);
        aid.a(a, googleSignInOptions);
        a(103, a);
    }

    public final void b(ug ugVar, GoogleSignInOptions googleSignInOptions) throws RemoteException {
        Parcel a = a();
        aid.a(a, ugVar);
        aid.a(a, googleSignInOptions);
        a(102, a);
    }
}
