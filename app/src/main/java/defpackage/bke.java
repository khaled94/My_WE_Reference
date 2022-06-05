package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bke  reason: default package */
/* loaded from: classes2.dex */
public final class bke extends aoc implements bjt {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bke(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.maps.internal.IUiSettingsDelegate");
    }

    @Override // defpackage.bjt
    public final void a() throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, false);
        b(2, f_);
    }

    @Override // defpackage.bjt
    public final void b() throws RemoteException {
        Parcel f_ = f_();
        aoe.a(f_, true);
        b(7, f_);
    }
}
