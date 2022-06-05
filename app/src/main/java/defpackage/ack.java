package defpackage;

import android.os.IBinder;
import android.os.IInterface;

/* renamed from: ack  reason: default package */
/* loaded from: classes.dex */
public abstract class ack extends aiv implements acl {
    public static acl a(IBinder iBinder) {
        if (iBinder == null) {
            return null;
        }
        IInterface queryLocalInterface = iBinder.queryLocalInterface("com.google.android.gms.common.internal.IGoogleCertificatesApi");
        return queryLocalInterface instanceof acl ? (acl) queryLocalInterface : new acj(iBinder);
    }
}
