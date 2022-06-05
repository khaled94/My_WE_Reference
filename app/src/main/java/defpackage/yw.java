package defpackage;

import android.os.DeadObjectException;
import android.os.RemoteException;
import com.google.android.gms.common.api.Status;
import defpackage.vc;

/* renamed from: yw  reason: default package */
/* loaded from: classes2.dex */
public final class yw<ResultT> extends xz {
    private final wf<vc.b, ResultT> a;
    private final bwm<ResultT> b;
    private final wd d;

    public yw(int i, wf<vc.b, ResultT> wfVar, bwm<ResultT> bwmVar, wd wdVar) {
        super(i);
        this.b = bwmVar;
        this.a = wfVar;
        this.d = wdVar;
        if (i != 2 || !wfVar.b) {
            return;
        }
        throw new IllegalArgumentException("Best-effort write calls cannot pass methods that should auto-resolve missing features.");
    }

    @Override // defpackage.yy
    public final void a(Status status) {
        this.b.b(this.d.a(status));
    }

    @Override // defpackage.yy
    public final void a(Exception exc) {
        this.b.b(exc);
    }

    @Override // defpackage.yy
    public final void a(wj wjVar, boolean z) {
        bwm<ResultT> bwmVar = this.b;
        wjVar.b.put(bwmVar, Boolean.valueOf(z));
        bwmVar.a.a(new wi(wjVar, bwmVar));
    }

    @Override // defpackage.xz
    public final boolean a(xr<?> xrVar) {
        return this.a.b;
    }

    @Override // defpackage.xz
    public final uw[] b(xr<?> xrVar) {
        return this.a.a;
    }

    @Override // defpackage.yy
    public final void d(xr<?> xrVar) throws DeadObjectException {
        try {
            this.a.a(xrVar.a, this.b);
        } catch (DeadObjectException e) {
            throw e;
        } catch (RemoteException e2) {
            a(yy.a(e2));
        } catch (RuntimeException e3) {
            this.b.b(e3);
        }
    }
}
