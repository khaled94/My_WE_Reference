package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: sg  reason: default package */
/* loaded from: classes2.dex */
public interface sg extends IInterface {
    int a(Bundle bundle) throws RemoteException;

    /* renamed from: sg$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements sg {
        public a() {
            attachInterface(this, "com.facebook.ppml.receiver.IReceiverService");
        }

        public static sg a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.facebook.ppml.receiver.IReceiverService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof sg)) {
                return (sg) queryLocalInterface;
            }
            return new C0047a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString("com.facebook.ppml.receiver.IReceiverService");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.facebook.ppml.receiver.IReceiverService");
            int a = a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            parcel2.writeInt(a);
            return true;
        }

        /* JADX INFO: Access modifiers changed from: package-private */
        /* renamed from: sg$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        public static class C0047a implements sg {
            public static sg a;
            private IBinder b;

            C0047a(IBinder iBinder) {
                this.b = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.b;
            }

            @Override // defpackage.sg
            public final int a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.facebook.ppml.receiver.IReceiverService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    if (!this.b.transact(1, obtain, obtain2, 0) && a.a() != null) {
                        return a.a().a(bundle);
                    }
                    obtain2.readException();
                    return obtain2.readInt();
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }

        public static sg a() {
            return C0047a.a;
        }
    }
}
