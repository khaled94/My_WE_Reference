package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import defpackage.afn;

/* renamed from: bkl  reason: default package */
/* loaded from: classes2.dex */
public final class bkl extends aoc implements bjq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bkl(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapViewDelegate");
    }

    @Override // defpackage.bjq
    public final void a(Bundle bundle) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, bundle);
        b(2, f_);
    }

    @Override // defpackage.bjq
    public final void a() throws RemoteException {
        b(3, f_());
    }

    @Override // defpackage.bjq
    public final void b() throws RemoteException {
        b(4, f_());
    }

    @Override // defpackage.bjq
    public final void c() throws RemoteException {
        b(5, f_());
    }

    @Override // defpackage.bjq
    public final void d() throws RemoteException {
        b(6, f_());
    }

    @Override // defpackage.bjq
    public final void b(Bundle bundle) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, bundle);
        Parcel a = a(7, f_);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    @Override // defpackage.bjq
    public final afn e() throws RemoteException {
        Parcel a = a(8, f_());
        afn a2 = afn.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // defpackage.bjq
    public final void a(bjx bjxVar) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, bjxVar);
        b(9, f_);
    }

    @Override // defpackage.bjq
    public final void f() throws RemoteException {
        b(12, f_());
    }

    @Override // defpackage.bjq
    public final void g() throws RemoteException {
        b(13, f_());
    }
}
