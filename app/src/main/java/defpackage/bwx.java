package defpackage;

/* renamed from: bwx  reason: default package */
/* loaded from: classes2.dex */
final class bwx implements Runnable {
    final /* synthetic */ bwl a;
    final /* synthetic */ bwy b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bwx(bwy bwyVar, bwl bwlVar) {
        this.b = bwyVar;
        this.a = bwlVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a) {
            bwy bwyVar = this.b;
            if (bwyVar.b != null) {
                bwyVar.b.onComplete(this.a);
            }
        }
    }
}
