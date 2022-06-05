package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ahh  reason: default package */
/* loaded from: classes.dex */
public final class ahh extends amu implements ahf {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ahh(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.flags.IFlagProvider");
    }

    @Override // defpackage.ahf
    public final void init(afn afnVar) throws RemoteException {
        Parcel a = a();
        amw.a(a, afnVar);
        Parcel obtain = Parcel.obtain();
        try {
            this.a.transact(1, a, obtain, 0);
            obtain.readException();
        } finally {
            a.recycle();
            obtain.recycle();
        }
    }

    @Override // defpackage.ahf
    public final boolean getBooleanFlagValue(String str, boolean z, int i) throws RemoteException {
        Parcel a = a();
        a.writeString(str);
        amw.a(a, z);
        a.writeInt(i);
        Parcel a2 = a(2, a);
        boolean a3 = amw.a(a2);
        a2.recycle();
        return a3;
    }

    @Override // defpackage.ahf
    public final int getIntFlagValue(String str, int i, int i2) throws RemoteException {
        Parcel a = a();
        a.writeString(str);
        a.writeInt(i);
        a.writeInt(i2);
        Parcel a2 = a(3, a);
        int readInt = a2.readInt();
        a2.recycle();
        return readInt;
    }

    @Override // defpackage.ahf
    public final long getLongFlagValue(String str, long j, int i) throws RemoteException {
        Parcel a = a();
        a.writeString(str);
        a.writeLong(j);
        a.writeInt(i);
        Parcel a2 = a(4, a);
        long readLong = a2.readLong();
        a2.recycle();
        return readLong;
    }

    @Override // defpackage.ahf
    public final String getStringFlagValue(String str, String str2, int i) throws RemoteException {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        a.writeInt(i);
        Parcel a2 = a(5, a);
        String readString = a2.readString();
        a2.recycle();
        return readString;
    }
}
