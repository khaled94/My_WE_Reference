package defpackage;

import android.os.DeadObjectException;
import com.google.android.gms.common.api.Status;
import defpackage.vc;
import defpackage.vq;
import defpackage.vq.a;

/* renamed from: yv  reason: default package */
/* loaded from: classes2.dex */
public final class yv<A extends vq.a<? extends vi, vc.b>> extends yy {
    protected final A a;

    public yv(int i, A a) {
        super(i);
        this.a = (A) aat.a(a, "Null methods are not runnable.");
    }

    @Override // defpackage.yy
    public final void a(Status status) {
        try {
            this.a.b(status);
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.yy
    public final void a(Exception exc) {
        String simpleName = exc.getClass().getSimpleName();
        String localizedMessage = exc.getLocalizedMessage();
        StringBuilder sb = new StringBuilder(String.valueOf(simpleName).length() + 2 + String.valueOf(localizedMessage).length());
        sb.append(simpleName);
        sb.append(": ");
        sb.append(localizedMessage);
        try {
            this.a.b(new Status(10, sb.toString()));
        } catch (IllegalStateException unused) {
        }
    }

    @Override // defpackage.yy
    public final void a(wj wjVar, boolean z) {
        A a = this.a;
        wjVar.a.put(a, Boolean.valueOf(z));
        a.a(new wh(wjVar, a));
    }

    @Override // defpackage.yy
    public final void d(xr<?> xrVar) throws DeadObjectException {
        try {
            this.a.b(xrVar.a);
        } catch (RuntimeException e) {
            a(e);
        }
    }
}
