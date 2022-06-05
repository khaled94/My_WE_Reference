package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bvu  reason: default package */
/* loaded from: classes2.dex */
public final class bvu extends ail implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bvu(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.signin.internal.ISignInService");
    }

    public final void a(int i) throws RemoteException {
        Parcel a = a();
        a.writeInt(i);
        a(7, a);
    }

    public final void a(aal aalVar, int i, boolean z) throws RemoteException {
        Parcel a = a();
        ain.a(a, aalVar);
        a.writeInt(i);
        ain.a(a, z);
        a(9, a);
    }

    public final void a(bvx bvxVar, bvt bvtVar) throws RemoteException {
        Parcel a = a();
        ain.a(a, bvxVar);
        ain.a(a, bvtVar);
        a(12, a);
    }
}
