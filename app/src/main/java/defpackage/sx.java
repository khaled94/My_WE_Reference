package defpackage;

import android.os.Binder;
import android.os.Bundle;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: sx  reason: default package */
/* loaded from: classes2.dex */
public interface sx extends IInterface {
    Bundle a(Bundle bundle) throws RemoteException;

    /* renamed from: sx$a */
    /* loaded from: classes2.dex */
    public static abstract class a extends Binder implements sx {
        public a() {
            attachInterface(this, "com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        }

        public static sx a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            if (queryLocalInterface != null && (queryLocalInterface instanceof sx)) {
                return (sx) queryLocalInterface;
            }
            return new C0048a(iBinder);
        }

        @Override // android.os.Binder
        public boolean onTransact(int i, Parcel parcel, Parcel parcel2, int i2) throws RemoteException {
            if (i != 1) {
                if (i == 1598968902) {
                    parcel2.writeString("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    return true;
                }
                return super.onTransact(i, parcel, parcel2, i2);
            }
            parcel.enforceInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
            Bundle a = a(parcel.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(parcel) : null);
            parcel2.writeNoException();
            if (a != null) {
                parcel2.writeInt(1);
                a.writeToParcel(parcel2, 1);
            } else {
                parcel2.writeInt(0);
            }
            return true;
        }

        /* renamed from: sx$a$a  reason: collision with other inner class name */
        /* loaded from: classes2.dex */
        static class C0048a implements sx {
            private IBinder a;

            C0048a(IBinder iBinder) {
                this.a = iBinder;
            }

            @Override // android.os.IInterface
            public final IBinder asBinder() {
                return this.a;
            }

            @Override // defpackage.sx
            public final Bundle a(Bundle bundle) throws RemoteException {
                Parcel obtain = Parcel.obtain();
                Parcel obtain2 = Parcel.obtain();
                try {
                    obtain.writeInterfaceToken("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
                    if (bundle != null) {
                        obtain.writeInt(1);
                        bundle.writeToParcel(obtain, 0);
                    } else {
                        obtain.writeInt(0);
                    }
                    this.a.transact(1, obtain, obtain2, 0);
                    obtain2.readException();
                    return obtain2.readInt() != 0 ? (Bundle) Bundle.CREATOR.createFromParcel(obtain2) : null;
                } finally {
                    obtain2.recycle();
                    obtain.recycle();
                }
            }
        }
    }
}
