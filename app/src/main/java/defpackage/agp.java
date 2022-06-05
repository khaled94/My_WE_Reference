package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.afn;

/* renamed from: agp  reason: default package */
/* loaded from: classes.dex */
public final class agp extends aiu implements IInterface {
    public agp(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.dynamite.IDynamiteLoaderV2");
    }

    public final afn a(afn afnVar, String str, int i, afn afnVar2) throws RemoteException {
        Parcel c = c();
        aiw.a(c, afnVar);
        c.writeString(str);
        c.writeInt(i);
        aiw.a(c, afnVar2);
        Parcel a = a(2, c);
        afn a2 = afn.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    public final afn b(afn afnVar, String str, int i, afn afnVar2) throws RemoteException {
        Parcel c = c();
        aiw.a(c, afnVar);
        c.writeString(str);
        c.writeInt(i);
        aiw.a(c, afnVar2);
        Parcel a = a(3, c);
        afn a2 = afn.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
