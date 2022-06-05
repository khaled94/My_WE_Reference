package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import android.os.RemoteException;
import defpackage.afn;

/* renamed from: bkd  reason: default package */
/* loaded from: classes2.dex */
public final class bkd extends aoc implements bjs {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bkd(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
    }

    @Override // defpackage.bjs
    public final void a(afn afnVar, Bundle bundle) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, afnVar);
        aoe.a(f_, (Parcelable) null);
        aoe.a(f_, bundle);
        b(2, f_);
    }

    @Override // defpackage.bjs
    public final void a(Bundle bundle) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, bundle);
        b(3, f_);
    }

    @Override // defpackage.bjs
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

    @Override // defpackage.bjs
    public final void a() throws RemoteException {
        b(5, f_());
    }

    @Override // defpackage.bjs
    public final void b() throws RemoteException {
        b(6, f_());
    }

    @Override // defpackage.bjs
    public final void c() throws RemoteException {
        b(7, f_());
    }

    @Override // defpackage.bjs
    public final void d() throws RemoteException {
        b(8, f_());
    }

    @Override // defpackage.bjs
    public final void e() throws RemoteException {
        b(9, f_());
    }

    @Override // defpackage.bjs
    public final void b(Bundle bundle) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, bundle);
        Parcel a = a(10, f_);
        if (a.readInt() != 0) {
            bundle.readFromParcel(a);
        }
        a.recycle();
    }

    @Override // defpackage.bjs
    public final void a(bka bkaVar) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, bkaVar);
        b(12, f_);
    }

    @Override // defpackage.bjs
    public final void f() throws RemoteException {
        b(13, f_());
    }

    @Override // defpackage.bjs
    public final void g() throws RemoteException {
        b(14, f_());
    }
}
