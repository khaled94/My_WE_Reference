package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.ApiException;
import com.google.android.gms.common.api.Status;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: yr  reason: default package */
/* loaded from: classes2.dex */
public abstract class yr<T> extends xz {
    protected final bwm<T> a;

    public yr(bwm<T> bwmVar) {
        super(4);
        this.a = bwmVar;
    }

    @Override // defpackage.yy
    public final void a(Status status) {
        this.a.b(new ApiException(status));
    }

    @Override // defpackage.yy
    public final void a(Exception exc) {
        this.a.b(exc);
    }

    @Override // defpackage.yy
    public void a(wj wjVar, boolean z) {
    }

    protected abstract void c(xr<?> xrVar) throws RemoteException;

    @Override // defpackage.yy
    public final void d(xr<?> xrVar) throws DeadObjectException {
        try {
            c(xrVar);
        } catch (DeadObjectException e) {
            a(yy.a((RemoteException) e));
            throw e;
        } catch (RemoteException e2) {
            a(yy.a(e2));
        } catch (RuntimeException e3) {
            this.a.b(e3);
        }
    }
}
