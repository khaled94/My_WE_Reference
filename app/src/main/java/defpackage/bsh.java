package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bsh  reason: default package */
/* loaded from: classes2.dex */
public final class bsh implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ brs b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bsh(brs brsVar, boolean z) {
        this.b = brsVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        brs.a(this.b, this.a);
    }
}
