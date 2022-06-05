package defpackage;

/* renamed from: bwz  reason: default package */
/* loaded from: classes2.dex */
final class bwz implements Runnable {
    final /* synthetic */ bwl a;
    final /* synthetic */ bxa b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bwz(bxa bxaVar, bwl bwlVar) {
        this.b = bxaVar;
        this.a = bwlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            bxa bxaVar = this.b;
            if (bxaVar.b != null) {
                bxaVar.b.a((Exception) aat.a(this.a.a()));
            }
        }
    }
}
