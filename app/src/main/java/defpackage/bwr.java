package defpackage;

import com.google.android.gms.tasks.RuntimeExecutionException;

/* renamed from: bwr  reason: default package */
/* loaded from: classes2.dex */
final class bwr implements Runnable {
    final /* synthetic */ bwl a;
    final /* synthetic */ bws b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bwr(bws bwsVar, bwl bwlVar) {
        this.b = bwsVar;
        this.a = bwlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.c()) {
            this.b.b.f();
            return;
        }
        try {
            this.b.b.a((bxj<TContinuationResult>) this.b.a.a(this.a));
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
