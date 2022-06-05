package defpackage;

/* renamed from: bue  reason: default package */
/* loaded from: classes2.dex */
final class bue implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ bty b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bue(bty btyVar, long j) {
        this.b = btyVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bty.a(this.b, this.a);
    }
}
