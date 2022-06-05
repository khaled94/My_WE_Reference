package defpackage;

/* renamed from: bpr  reason: default package */
/* loaded from: classes2.dex */
final class bpr implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ bpo b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bpr(bpo bpoVar, boolean z) {
        this.b = bpoVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        buj bujVar;
        bujVar = this.b.b;
        bujVar.j();
    }
}
