package defpackage;

import android.location.Location;
import android.os.IBinder;
import android.os.RemoteException;

/* renamed from: bir  reason: default package */
/* loaded from: classes2.dex */
public final class bir extends amz implements bit {
    /* JADX INFO: Access modifiers changed from: package-private */
    public bir(IBinder iBinder) {
        super(iBinder, "com.google.android.gms.location.ILocationListener");
    }

    @Override // defpackage.bit
    public final void a(Location location) throws RemoteException {
        throw null;
    }
}
