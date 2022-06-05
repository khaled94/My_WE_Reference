package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bkj  reason: default package */
/* loaded from: classes2.dex */
public final class bkj extends aoc implements bjo {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bkj(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IGoogleMapDelegate");
    }

    @Override // defpackage.bjo
    public final void a(afn afnVar) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, afnVar);
        b(5, f_);
    }

    @Override // defpackage.bjo
    public final aoj a(bkp bkpVar) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, bkpVar);
        Parcel a = a(11, f_);
        aoj a2 = aok.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }

    @Override // defpackage.bjo
    public final void a() throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, true);
        b(18, f_);
    }

    @Override // defpackage.bjo
    public final void b() throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, false);
        b(22, f_);
    }

    @Override // defpackage.bjo
    public final bjt c() throws RemoteException {
        bjt bjtVar;
        Parcel a = a(25, f_());
        IBinder readStrongBinder = a.readStrongBinder();
        if (readStrongBinder == null) {
            bjtVar = null;
        } else {
            IInterface queryLocalInterface = readStrongBinder.queryLocalInterface("com.google.android.gms.maps.internal.IUiSettingsDelegate");
            if (queryLocalInterface instanceof bjt) {
                bjtVar = (bjt) queryLocalInterface;
            } else {
                bjtVar = new bke(readStrongBinder);
            }
        }
        a.recycle();
        return bjtVar;
    }
}
