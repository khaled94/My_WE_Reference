package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: and  reason: default package */
/* loaded from: classes.dex */
public final class and extends amz implements ane {
    /* JADX INFO: Access modifiers changed from: package-private */
    public and(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.internal.IGoogleLocationManagerService");
    }

    @Override // defpackage.ane
    public final void a(anq anqVar) throws RemoteException {
        Parcel a = a();
        anu.a(a, anqVar);
        a(59, a);
    }

    @Override // defpackage.ane
    public final void a(anz anzVar) throws RemoteException {
        Parcel a = a();
        anu.a(a, anzVar);
        a(75, a);
    }

    @Override // defpackage.ane
    public final void b() throws RemoteException {
        Parcel a = a();
        anu.a(a);
        a(12, a);
    }
}
