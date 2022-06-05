package defpackage;

/* renamed from: bxb  reason: default package */
/* loaded from: classes2.dex */
final class bxb implements Runnable {
    final /* synthetic */ bwl a;
    final /* synthetic */ bxc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bxb(bxc bxcVar, bwl bwlVar) {
        this.b = bxcVar;
        this.a = bwlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            bxc bxcVar = this.b;
            if (bxcVar.b != null) {
                bxcVar.b.a(this.a.b());
            }
        }
    }
}
