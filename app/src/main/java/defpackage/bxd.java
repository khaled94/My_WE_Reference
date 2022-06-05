package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;
import java.util.concurrent.CancellationException;

/* renamed from: bxd  reason: default package */
/* loaded from: classes2.dex */
final class bxd implements Runnable {
    final /* synthetic */ bwl a;
    final /* synthetic */ bxe b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bxd(bxe bxeVar, bwl bwlVar) {
        this.b = bxeVar;
        this.a = bwlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        try {
            bwl a = this.b.a.a(this.a.b());
            if (a == null) {
                this.b.a((Exception) new NullPointerException("Continuation returned null"));
                return;
            }
            a.a(bwn.b, (bwj) this.b);
            a.a(bwn.b, (bwi) this.b);
            a.a(bwn.b, (bwg) this.b);
        } catch (RuntimeExecutionException e) {
            if (e.getCause() instanceof Exception) {
                this.b.a((Exception) e.getCause());
            } else {
                this.b.a((Exception) e);
            }
        } catch (CancellationException unused) {
            this.b.a();
        } catch (Exception e2) {
            this.b.a(e2);
        }
    }
}
