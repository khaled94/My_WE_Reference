package defpackage;

import android.os.IBinder;
import android.os.IInterface;
import android.os.Parcel;
import android.os.RemoteException;

/* renamed from: abf  reason: default package */
/* loaded from: classes.dex */
public final class abf extends ail implements IInterface {
    /* JADX INFO: Access modifiers changed from: package-private */
    public abf(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.common.internal.service.IClientTelemetryService");
    }

    public final void a(aax aaxVar) throws RemoteException {
        Parcel a = a();
        ain.a(a, aaxVar);
        try {
            this.a.transact(1, a, null, 1);
        } finally {
            a.recycle();
        }
    }
}
