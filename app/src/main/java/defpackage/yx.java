package defpackage;

import android.os.RemoteException;
import defpackage.vw;

/* renamed from: yx  reason: default package */
/* loaded from: classes2.dex */
public final class yx extends yr<Boolean> {
    public final vw.a<?> b;

    public yx(vw.a<?> aVar, bwm<Boolean> bwmVar) {
        super(bwmVar);
        this.b = aVar;
    }

    @Override // defpackage.yr, defpackage.yy
    public final /* bridge */ /* synthetic */ void a(wj wjVar, boolean z) {
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.yr
    public final void c(xr<?> xrVar) throws RemoteException {
        yh remove = xrVar.d.remove(this.b);
        if (remove == null) {
            bwm<T> bwmVar = this.a;
            bwmVar.a.b((bxj<TResult>) Boolean.FALSE);
            return;
        }
        remove.a.a.a();
    }

    @Override // defpackage.xz
    public final boolean a(xr<?> xrVar) {
        yh yhVar = xrVar.d.get(this.b);
        return yhVar != null && yhVar.a.c;
    }

    @Override // defpackage.xz
    public final uw[] b(xr<?> xrVar) {
        yh yhVar = xrVar.d.get(this.b);
        if (yhVar == null) {
            return null;
        }
        return yhVar.a.b;
    }
}
