package androidx.core.location;

import android.location.LocationListener;
import android.os.Bundle;

/* loaded from: classes.dex */
public interface LocationListenerCompat extends LocationListener {

    /* renamed from: androidx.core.location.LocationListenerCompat$-CC  reason: invalid class name */
    /* loaded from: classes.dex */
    public final /* synthetic */ class CC {
        public static void $default$onProviderDisabled(LocationListenerCompat locationListenerCompat, String str) {
        }

        public static void $default$onProviderEnabled(LocationListenerCompat locationListenerCompat, String str) {
        }

        public static void $default$onStatusChanged(LocationListenerCompat locationListenerCompat, String str, int i, Bundle bundle) {
        }
    }

    @Override // android.location.LocationListener
    void onProviderDisabled(String str);

    @Override // android.location.LocationListener
    void onProviderEnabled(String str);

    @Override // android.location.LocationListener
    void onStatusChanged(String str, int i, Bundle bundle);
}
