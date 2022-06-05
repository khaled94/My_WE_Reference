package defpackage;

/* renamed from: zk  reason: default package */
/* loaded from: classes2.dex */
final class zk implements Runnable {
    final /* synthetic */ wg a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public zk(wg wgVar) {
        this.a = wgVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.g.lock();
        try {
            wg.a(this.a);
        } finally {
            this.a.g.unlock();
        }
    }
}
