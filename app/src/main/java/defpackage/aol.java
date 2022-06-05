package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: aol  reason: default package */
/* loaded from: classes.dex */
public final class aol extends aoc implements aoj {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aol(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.model.internal.IMarkerDelegate");
    }

    @Override // defpackage.aoj
    public final void a() throws RemoteException {
        b(1, f_());
    }

    @Override // defpackage.aoj
    public final boolean a(aoj aojVar) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, aojVar);
        Parcel a = a(16, f_);
        boolean a2 = aoe.a(a);
        a.recycle();
        return a2;
    }

    @Override // defpackage.aoj
    public final int b() throws RemoteException {
        Parcel a = a(17, f_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
