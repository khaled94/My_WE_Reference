package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: aok  reason: default package */
/* loaded from: classes.dex */
public abstract class aok extends aod implements aoj {
    public static aoj a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.maps.model.internal.IMarkerDelegate");
        if (queryLocalInterface instanceof aoj) {
            return (aoj) queryLocalInterface;
        }
        return new aol(iBinder);
    }
}
