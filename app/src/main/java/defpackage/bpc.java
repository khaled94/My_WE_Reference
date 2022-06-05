package defpackage;

/* renamed from: bpc  reason: default package */
/* loaded from: classes2.dex */
final class bpc implements Runnable {
    private final /* synthetic */ long a;
    private final /* synthetic */ bkz b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bpc(bkz bkzVar, long j) {
        this.b = bkzVar;
        this.a = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
