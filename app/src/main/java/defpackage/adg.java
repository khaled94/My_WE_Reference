package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.afn;

/* renamed from: adg  reason: default package */
/* loaded from: classes.dex */
public final class adg extends aiu implements adi {
    /* JADX INFO: Access modifiers changed from: package-private */
    public adg(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.ICertData");
    }

    @Override // defpackage.adi
    public final int a() throws RemoteException {
        Parcel a = a(2, c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    @Override // defpackage.adi
    public final afn b() throws RemoteException {
        Parcel a = a(1, c());
        afn a2 = afn.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
