package defpackage;

import android.content.Context;
import android.os.RemoteException;
import com.google.android.gms.common.GooglePlayServicesNotAvailableException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: bjg  reason: default package */
/* loaded from: classes2.dex */
public final class bjg {
    private static boolean a = false;

    public static synchronized int a(Context context) {
        synchronized (bjg.class) {
            aat.a(context, "Context is null");
            if (a) {
                return 0;
            }
            try {
                bkh a2 = bkg.a(context);
                try {
                    bje.a = (bjn) aat.a(a2.a());
                    aog b = a2.b();
                    if (bkn.a == null) {
                        bkn.a = (aog) aat.a(b);
                    }
                    a = true;
                    return 0;
                } catch (RemoteException e) {
                    throw new RuntimeRemoteException(e);
                }
            } catch (GooglePlayServicesNotAvailableException e2) {
                return e2.a;
            }
        }
    }

    private bjg() {
    }
}
