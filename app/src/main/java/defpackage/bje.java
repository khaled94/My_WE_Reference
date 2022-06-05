package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: bje  reason: default package */
/* loaded from: classes2.dex */
public final class bje {
    static bjn a;

    private bje() {
    }

    public static bjd a(LatLng latLng) {
        try {
            return new bjd(((bjn) aat.a(a, "CameraUpdateFactory is not initialized")).a(latLng));
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
