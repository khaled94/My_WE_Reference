package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: acj  reason: default package */
/* loaded from: classes.dex */
public final class acj extends aiu implements acl {
    /* JADX INFO: Access modifiers changed from: package-private */
    public acj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.IGoogleCertificatesApi");
    }

    @Override // defpackage.acl
    public final afg a(afd afdVar) throws RemoteException {
        Parcel c = c();
        aiw.a(c, afdVar);
        Parcel a = a(6, c);
        afg afgVar = (afg) aiw.a(a, afg.CREATOR);
        a.recycle();
        return afgVar;
    }

    @Override // defpackage.acl
    public final boolean a() throws RemoteException {
        Parcel a = a(7, c());
        boolean a2 = aiw.a(a);
        a.recycle();
        return a2;
    }

    @Override // defpackage.acl
    public final boolean a(afi afiVar, afn afnVar) throws RemoteException {
        Parcel c = c();
        aiw.a(c, afiVar);
        aiw.a(c, afnVar);
        Parcel a = a(5, c);
        boolean a2 = aiw.a(a);
        a.recycle();
        return a2;
    }
}
