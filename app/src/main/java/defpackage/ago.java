package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.afn;

/* renamed from: ago  reason: default package */
/* loaded from: classes.dex */
public final class ago extends aiu implements IInterface {
    public ago(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoader");
    }

    public final int a() throws RemoteException {
        Parcel a = a(6, c());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final int a(afn afnVar, String str, boolean z) throws RemoteException {
        Parcel c = c();
        aiw.a(c, afnVar);
        c.writeString(str);
        aiw.a(c, z);
        Parcel a = a(3, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final afn a(afn afnVar, String str, int i) throws RemoteException {
        Parcel c = c();
        aiw.a(c, afnVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = a(2, c);
        afn a2 = afn.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final afn a(afn afnVar, String str, int i, afn afnVar2) throws RemoteException {
        Parcel c = c();
        aiw.a(c, afnVar);
        c.writeString(str);
        c.writeInt(i);
        aiw.a(c, afnVar2);
        Parcel a = a(8, c);
        afn a2 = afn.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final afn a(afn afnVar, String str, boolean z, long j) throws RemoteException {
        Parcel c = c();
        aiw.a(c, afnVar);
        c.writeString(str);
        aiw.a(c, z);
        c.writeLong(j);
        Parcel a = a(7, c);
        afn a2 = afn.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final int b(afn afnVar, String str, boolean z) throws RemoteException {
        Parcel c = c();
        aiw.a(c, afnVar);
        c.writeString(str);
        aiw.a(c, z);
        Parcel a = a(5, c);
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }

    public final afn b(afn afnVar, String str, int i) throws RemoteException {
        Parcel c = c();
        aiw.a(c, afnVar);
        c.writeString(str);
        c.writeInt(i);
        Parcel a = a(4, c);
        afn a2 = afn.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
