package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;

/* renamed from: yy  reason: default package */
/* loaded from: classes2.dex */
public abstract class yy {
    public final int c;

    public yy(int i) {
        this.c = i;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static /* synthetic */ Status a(RemoteException remoteException) {
        return new Status(19, remoteException.getClass().getSimpleName() + ": " + remoteException.getLocalizedMessage());
    }

    public abstract void a(Status status);

    public abstract void a(Exception exc);

    public abstract void a(wj wjVar, boolean z);

    public abstract void d(xr<?> xrVar) throws DeadObjectException;
}
