package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.GoogleMapOptions;

/* renamed from: bki  reason: default package */
/* loaded from: classes2.dex */
public final class bki extends aoc implements bkh {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bki(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICreator");
    }

    @Override // defpackage.bkh
    public final bjp a(afn afnVar) throws RemoteException {
        bjp bjpVar;
        Parcel f_ = f_();
        aoe.a(f_, afnVar);
        Parcel a = a(2, f_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bjpVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapFragmentDelegate");
            if (queryLocalInterface instanceof bjp) {
                bjpVar = (bjp) queryLocalInterface;
            } else {
                bjpVar = new bkk(readStrongBinder);
            }
        }
        a.recycle();
        return bjpVar;
    }

    @Override // defpackage.bkh
    public final bjq a(afn afnVar, GoogleMapOptions googleMapOptions) throws RemoteException {
        bjq bjqVar;
        Parcel f_ = f_();
        aoe.a(f_, afnVar);
        aoe.a(f_, googleMapOptions);
        Parcel a = a(3, f_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bjqVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IMapViewDelegate");
            if (queryLocalInterface instanceof bjq) {
                bjqVar = (bjq) queryLocalInterface;
            } else {
                bjqVar = new bkl(readStrongBinder);
            }
        }
        a.recycle();
        return bjqVar;
    }

    @Override // defpackage.bkh
    public final bjn a() throws RemoteException {
        bjn bjnVar;
        Parcel a = a(4, f_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bjnVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
            if (queryLocalInterface instanceof bjn) {
                bjnVar = (bjn) queryLocalInterface;
            } else {
                bjnVar = new bjz(readStrongBinder);
            }
        }
        a.recycle();
        return bjnVar;
    }

    @Override // defpackage.bkh
    public final aog b() throws RemoteException {
        Parcel a = a(5, f_());
        aog a2 = aoh.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // defpackage.bkh
    public final void a(afn afnVar, int i) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, afnVar);
        f_.writeInt(i);
        b(6, f_);
    }

    @Override // defpackage.bkh
    public final bjs b(afn afnVar) throws RemoteException {
        bjs bjsVar;
        Parcel f_ = f_();
        aoe.a(f_, afnVar);
        Parcel a = a(8, f_);
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bjsVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IStreetViewPanoramaFragmentDelegate");
            if (queryLocalInterface instanceof bjs) {
                bjsVar = (bjs) queryLocalInterface;
            } else {
                bjsVar = new bkd(readStrongBinder);
            }
        }
        a.recycle();
        return bjsVar;
    }
}
