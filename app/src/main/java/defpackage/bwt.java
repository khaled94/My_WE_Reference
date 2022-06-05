package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* renamed from: bwt  reason: default package */
/* loaded from: classes2.dex */
final class bwt implements Runnable {
    final /* synthetic */ bwl a;
    final /* synthetic */ bwu b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bwt(bwu bwuVar, bwl bwlVar) {
        this.b = bwuVar;
        this.a = bwlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bwl bwlVar = (bwl) this.b.a.a(this.a);
            if (bwlVar == null) {
                this.b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            bwlVar.a(bwn.b, (bwj) this.b);
            bwlVar.a(bwn.b, (bwi) this.b);
            bwlVar.a(bwn.b, (bwg) this.b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.b.b.a((Exception) e.getCause());
            } else {
                this.b.b.a(e);
            }
        } catch (Exception e2) {
            this.b.b.a(e2);
        }
    }
}
