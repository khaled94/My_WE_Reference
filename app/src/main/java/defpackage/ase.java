package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ase  reason: default package */
/* loaded from: classes.dex */
public abstract class ase extends aom implements atc {
    public static atc a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.finsky.externalreferrer.IGetInstallReferrerService");
        if (queryLocalInterface instanceof atc) {
            return (atc) queryLocalInterface;
        }
        return new atz(iBinder);
    }
}
