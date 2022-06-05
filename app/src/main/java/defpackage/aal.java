package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: aal  reason: default package */
/* loaded from: classes.dex */
public interface aal extends IInterface {

    /* renamed from: aal$a */
    /* loaded from: classes.dex */
    public static abstract class a extends aiv implements aal {
        public a() {
            super("com.google.android.gms.common.internal.IAccountAccessor");
        }

        public static aal a(IBinder iBinder) {
            if (iBinder == null) {
                return null;
            }
            IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IAccountAccessor");
            return queryLocalInterface instanceof aal ? (aal) queryLocalInterface : new adf(iBinder);
        }

        @Override // defpackage.aiv
        public final boolean a(int i, Parcel parcel, Parcel parcel2) throws RemoteException {
            if (i == 2) {
                Account a = a();
                parcel2.writeNoException();
                aiw.b(parcel2, a);
                return true;
            }
            return false;
        }
    }

    Account a() throws RemoteException;
}
