package defpackage;

import android.os.IBinder;
import android.os.Message;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: cos  reason: default package */
/* loaded from: classes2.dex */
public final class cos implements coq {
    private final IBinder a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cos(IBinder iBinder) {
        this.a = iBinder;
    }

    @Override // defpackage.coq
    public final void a(Message message) throws RemoteException {
        Parcel obtain = Parcel.obtain();
        obtain.writeInterfaceToken("com.google.android.gms.iid.IMessengerCompat");
        obtain.writeInt(1);
        message.writeToParcel(obtain, 0);
        try {
            this.a.transact(1, obtain, null, 1);
        } finally {
            obtain.recycle();
        }
    }

    @Override // android.os.IInterface
    public final IBinder asBinder() {
        return this.a;
    }
}
