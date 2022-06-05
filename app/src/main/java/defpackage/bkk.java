package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;
import defpackage.afn;

/* renamed from: bkk  reason: default package */
/* loaded from: classes2.dex */
public final class bkk extends aoc implements bjp {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bkk(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IMapFragmentDelegate");
    }

    @Override // defpackage.bjp
    public final void a(afn afnVar, GoogleMapOptions googleMapOptions, Bundle bundle) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, afnVar);
        aoe.a(f_, googleMapOptions);
        aoe.a(f_, bundle);
        b(2, f_);
    }

    @Override // defpackage.bjp
    public final void a(Bundle bundle) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, bundle);
        b(3, f_);
    }

    @Override // defpackage.bjp
    public final afn a(afn afnVar, afn afnVar2, Bundle bundle) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, afnVar);
        aoe.a(f_, afnVar2);
        aoe.a(f_, bundle);
        Parcel a = a(4, f_);
        afn a2 = afn.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // defpackage.bjp
    public final void a() throws RemoteException {
        b(5, f_());
    }

    @Override // defpackage.bjp
    public final void b() throws RemoteException {
        b(6, f_());
    }

    @Override // defpackage.bjp
    public final void c() throws RemoteException {
        b(7, f_());
    }

    @Override // defpackage.bjp
    public final void d() throws RemoteException {
        b(8, f_());
    }

    @Override // defpackage.bjp
    public final void e() throws RemoteException {
        b(9, f_());
    }

    @Override // defpackage.bjp
    public final void b(Bundle bundle) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, bundle);
        Parcel a = a(10, f_);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    @Override // defpackage.bjp
    public final void a(bjx bjxVar) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, bjxVar);
        b(12, f_);
    }

    @Override // defpackage.bjp
    public final void f() throws RemoteException {
        b(15, f_());
    }

    @Override // defpackage.bjp
    public final void g() throws RemoteException {
        b(16, f_());
    }
}
