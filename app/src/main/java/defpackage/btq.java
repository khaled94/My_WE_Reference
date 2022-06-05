package defpackage;

/* renamed from: btq  reason: default package */
/* loaded from: classes2.dex */
final class btq implements Runnable {
    private final /* synthetic */ boz a;
    private final /* synthetic */ btp b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public btq(btp btpVar, boz bozVar) {
        this.b = btpVar;
        this.a = bozVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b) {
            this.b.a = false;
            if (!this.b.c.v()) {
                this.b.c.q().j.a("Connected to remote service");
                this.b.c.a(this.a);
            }
        }
    }
}
