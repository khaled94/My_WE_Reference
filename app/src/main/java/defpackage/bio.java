package defpackage;

import android.os.IBinder;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: bio  reason: default package */
/* loaded from: classes2.dex */
public final class bio extends amz implements biq {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bio(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationCallback");
    }

    @Override // defpackage.biq
    public final void a(LocationAvailability locationAvailability) throws RemoteException {
        throw null;
    }

    @Override // defpackage.biq
    public final void a(LocationResult locationResult) throws RemoteException {
        throw null;
    }
}
