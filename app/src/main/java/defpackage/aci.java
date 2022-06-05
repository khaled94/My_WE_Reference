package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: aci  reason: default package */
/* loaded from: classes.dex */
final class aci implements aao {
    private final IBinder a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public aci(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.aao
    public final void a(aan aanVar, aah aahVar) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        Parcel obtain2 = Parcel.obtain();
        try {
            obtain.writeInterfaceToken("com.google.android.gms.common.internal.IGmsServiceBroker");
            obtain.writeStrongBinder(aanVar.asBinder());
            obtain.writeInt(1);
            acx.a(aahVar, obtain, 0);
            this.a.transact(46, obtain, obtain2, 0);
            obtain2.readException();
        } finally {
            obtain2.recycle();
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
