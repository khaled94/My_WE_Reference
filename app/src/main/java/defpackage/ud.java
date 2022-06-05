package defpackage;

import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ud  reason: default package */
/* loaded from: classes2.dex */
public abstract class ud extends aib implements ue {
    public ud() {
        super("com.google.android.gms.auth.api.signin.internal.IRevocationService");
    }

    @Override // defpackage.aib
    public final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
        if (i == 1) {
            b();
        } else if (i != 2) {
            return false;
        } else {
            a();
        }
        return true;
    }
}
