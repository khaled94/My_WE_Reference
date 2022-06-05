package defpackage;

/* renamed from: bpz  reason: default package */
/* loaded from: classes2.dex */
final class bpz implements Runnable {
    private final /* synthetic */ bql a;
    private final /* synthetic */ bpi b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bpz(bql bqlVar, bpi bpiVar) {
        this.a = bqlVar;
        this.b = bpiVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (this.a.i == null) {
            this.b.c.a("Install Referrer Reporter is null");
            return;
        }
        bpv bpvVar = this.a.i;
        bpvVar.a(bpvVar.a.m().getPackageName());
    }
}
