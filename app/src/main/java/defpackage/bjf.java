package defpackage;

import android.os.RemoteException;
import com.google.android.gms.maps.model.RuntimeRemoteException;

/* renamed from: bjf  reason: default package */
/* loaded from: classes2.dex */
public final class bjf {
    public final bjo a;
    private bjm b;

    public bjf(bjo bjoVar) {
        this.a = (bjo) aat.a(bjoVar);
    }

    public final bko a(bkp bkpVar) {
        try {
            aoj a = this.a.a(bkpVar);
            if (a == null) {
                return null;
            }
            return new bko(a);
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }

    public final bjm a() {
        try {
            if (this.b == null) {
                this.b = new bjm(this.a.c());
            }
            return this.b;
        } catch (RemoteException e) {
            throw new RuntimeRemoteException(e);
        }
    }
}
