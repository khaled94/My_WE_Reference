package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: ciz  reason: default package */
/* loaded from: classes2.dex */
public final class ciz extends ajy implements ciy {
    /* JADX INFO: Access modifiers changed from: package-private */
    public ciz(IBinder iBinder) {
        super(iBinder, "com.google.firebase.auth.api.internal.IFirebaseAuthService");
    }

    @Override // defpackage.ciy
    public final void a(String str, ciw ciwVar) throws RemoteException {
        Parcel a = a();
        a.writeString(str);
        akp.a(a, ciwVar);
        a(1, a);
    }

    @Override // defpackage.ciy
    public final void a(alr alrVar, ciw ciwVar) throws RemoteException {
        Parcel a = a();
        akp.a(a, alrVar);
        akp.a(a, ciwVar);
        a(3, a);
    }

    @Override // defpackage.ciy
    public final void a(String str, String str2, ciw ciwVar) throws RemoteException {
        Parcel a = a();
        a.writeString(str);
        a.writeString(str2);
        akp.a(a, ciwVar);
        a(8, a);
    }

    @Override // defpackage.ciy
    public final void a(String str, alr alrVar, ciw ciwVar) throws RemoteException {
        Parcel a = a();
        a.writeString(str);
        akp.a(a, alrVar);
        akp.a(a, ciwVar);
        a(12, a);
    }

    @Override // defpackage.ciy
    public final void a(chj chjVar, ciw ciwVar) throws RemoteException {
        Parcel a = a();
        akp.a(a, chjVar);
        akp.a(a, ciwVar);
        a(29, a);
    }

    @Override // defpackage.ciy
    public final void a(akm akmVar, ciw ciwVar) throws RemoteException {
        Parcel a = a();
        akp.a(a, akmVar);
        akp.a(a, ciwVar);
        a(101, a);
    }

    @Override // defpackage.ciy
    public final void a(akr akrVar, ciw ciwVar) throws RemoteException {
        Parcel a = a();
        akp.a(a, akrVar);
        akp.a(a, ciwVar);
        a(103, a);
    }

    @Override // defpackage.ciy
    public final void a(akt aktVar, ciw ciwVar) throws RemoteException {
        Parcel a = a();
        akp.a(a, aktVar);
        akp.a(a, ciwVar);
        a(108, a);
    }

    @Override // defpackage.ciy
    public final void a(ako akoVar, ciw ciwVar) throws RemoteException {
        Parcel a = a();
        akp.a(a, akoVar);
        akp.a(a, ciwVar);
        a(112, a);
    }

    @Override // defpackage.ciy
    public final void a(akv akvVar, ciw ciwVar) throws RemoteException {
        Parcel a = a();
        akp.a(a, akvVar);
        akp.a(a, ciwVar);
        a(129, a);
    }
}
