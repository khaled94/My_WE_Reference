package defpackage;

import android.os.IInterface;
import android.os.RemoteException;
import com.google.android.gms.location.LocationAvailability;
import com.google.android.gms.location.LocationResult;

/* renamed from: biq  reason: default package */
/* loaded from: classes2.dex */
public interface biq extends IInterface {
    void a(LocationAvailability locationAvailability) throws RemoteException;

    void a(LocationResult locationResult) throws RemoteException;
}
