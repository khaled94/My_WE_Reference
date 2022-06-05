package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: aho  reason: default package */
/* loaded from: classes.dex */
public final class aho extends ahi implements ahm {
    /* JADX INFO: Access modifiers changed from: package-private */
    public aho(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
    }

    @Override // defpackage.ahm
    public final String a() throws RemoteException {
        Parcel a = a(1, e_());
        String readString = a.readString();
        a.recycle();
        return readString;
    }

    @Override // defpackage.ahm
    public final boolean b() throws RemoteException {
        Parcel e_ = e_();
        ahk.b(e_);
        Parcel a = a(2, e_);
        boolean a2 = ahk.a(a);
        a.recycle();
        return a2;
    }

    @Override // defpackage.ahm
    public final boolean c() throws RemoteException {
        Parcel a = a(6, e_());
        boolean a2 = ahk.a(a);
        a.recycle();
        return a2;
    }
}
