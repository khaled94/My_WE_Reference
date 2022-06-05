package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ahn  reason: default package */
/* loaded from: classes.dex */
public abstract class ahn extends ahj implements ahm {
    public static ahm a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.ads.identifier.internal.IAdvertisingIdService");
        return queryLocalInterface instanceof ahm ? (ahm) queryLocalInterface : new aho(iBinder);
    }
}
