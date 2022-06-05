package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: aoh  reason: default package */
/* loaded from: classes.dex */
public abstract class aoh extends aod implements aog {
    public static aog a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IBitmapDescriptorFactoryDelegate");
        if (queryLocalInterface instanceof aog) {
            return (aog) queryLocalInterface;
        }
        return new aoi(iBinder);
    }
}
