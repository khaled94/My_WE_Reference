package defpackage;

import android.os.Bundle;
import android.os.IBinder;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: bav  reason: default package */
/* loaded from: classes.dex */
public final class bav extends apc implements bat {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bav(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.measurement.api.internal.IEventHandlerProxy");
    }

    @Override // defpackage.bat
    public final void a(String str, String str2, Bundle bundle, long j) throws RemoteException {
        Parcel k_ = k_();
        k_.writeString(str);
        k_.writeString(str2);
        ard.a(k_, bundle);
        k_.writeLong(j);
        b(1, k_);
    }

    @Override // defpackage.bat
    public final int a() throws RemoteException {
        Parcel a = a(2, k_());
        int readInt = a.readInt();
        a.recycle();
        return readInt;
    }
}
