package defpackage;

import android.app.PendingIntent;
import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import com.google.android.gms.common.api.internal.BasePendingResult;
import defpackage.vc;

/* renamed from: vq  reason: default package */
/* loaded from: classes2.dex */
public final class vq {

    /* renamed from: vq$a */
    /* loaded from: classes2.dex */
    public static abstract class a<R extends vi, A extends vc.b> extends BasePendingResult<R> {
        final vc.c<A> a;
        final vc<?> b;

        private void a(RemoteException remoteException) {
            b(new Status(8, remoteException.getLocalizedMessage(), (PendingIntent) null));
        }

        protected abstract void a(A a) throws RemoteException;

        public final void b(A a) throws DeadObjectException {
            try {
                a((a<R, A>) a);
            } catch (DeadObjectException e) {
                a(e);
                throw e;
            } catch (RemoteException e2) {
                a(e2);
            }
        }

        /* JADX INFO: Access modifiers changed from: protected */
        public a(vc<?> vcVar, vf vfVar) {
            super((vf) aat.a(vfVar, "GoogleApiClient must not be null"));
            aat.a(vcVar, "Api must not be null");
            this.a = vcVar.b;
            this.b = vcVar;
        }

        public final void b(Status status) {
            aat.a(!status.c(), "Failed result must not be success");
            a((a<R, A>) a(status));
        }
    }
}
