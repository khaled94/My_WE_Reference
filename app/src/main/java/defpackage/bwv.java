package defpackage;

/* renamed from: bwv  reason: default package */
/* loaded from: classes2.dex */
final class bwv implements Runnable {
    final /* synthetic */ bww a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bwv(bww bwwVar) {
        this.a = bwwVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.a.a) {
            bww bwwVar = this.a;
            if (bwwVar.b != null) {
                bwwVar.b.a();
            }
        }
    }
}
