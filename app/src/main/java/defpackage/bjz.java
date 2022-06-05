package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import defpackage.afn;

/* renamed from: bjz  reason: default package */
/* loaded from: classes2.dex */
public final class bjz extends aoc implements bjn {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bjz(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.ICameraUpdateFactoryDelegate");
    }

    @Override // defpackage.bjn
    public final afn a(LatLng latLng) throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, latLng);
        f_.writeFloat(14.0f);
        Parcel a = a(9, f_);
        afn a2 = afn.a.a(a.readStrongBinder());
        a.recycle();
        return a2;
    }
}
