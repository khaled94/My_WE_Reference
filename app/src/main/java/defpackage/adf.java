package defpackage;

import android.accounts.Account;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: adf  reason: default package */
/* loaded from: classes.dex */
public final class adf extends aiu implements aal {
    /* JADX INFO: Access modifiers changed from: package-private */
    public adf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IAccountAccessor");
    }

    @Override // defpackage.aal
    public final Account a() throws RemoteException {
        Parcel a = a(2, c());
        Account account = (Account) aiw.a(a, Account.CREATOR);
        a.recycle();
        return account;
    }
}
