package defpackage;

import com.google.android.gms.common.api.internal.BasePendingResult;

/* renamed from: yp  reason: default package */
/* loaded from: classes2.dex */
final class yp implements Runnable {
    final /* synthetic */ vi a;
    final /* synthetic */ ys b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yp(ys ysVar, vi viVar) {
        this.b = ysVar;
        this.a = viVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        vf vfVar;
        try {
            try {
                BasePendingResult.c.set(Boolean.TRUE);
                vg a = ((vl) aat.a(this.b.a)).a();
                ys ysVar = this.b;
                ysVar.h.sendMessage(ysVar.h.obtainMessage(0, a));
                BasePendingResult.c.set(Boolean.FALSE);
                ys.b(this.a);
                vfVar = this.b.g.get();
                if (vfVar == null) {
                    return;
                }
            } catch (RuntimeException e) {
                ys ysVar2 = this.b;
                ysVar2.h.sendMessage(ysVar2.h.obtainMessage(1, e));
                BasePendingResult.c.set(Boolean.FALSE);
                ys.b(this.a);
                vfVar = this.b.g.get();
                if (vfVar == null) {
                    return;
                }
            }
            vfVar.b(this.b);
        } catch (Throwable th) {
            BasePendingResult.c.set(Boolean.FALSE);
            ys.b(this.a);
            vf vfVar2 = this.b.g.get();
            if (vfVar2 != null) {
                vfVar2.b(this.b);
            }
            throw th;
        }
    }
}
