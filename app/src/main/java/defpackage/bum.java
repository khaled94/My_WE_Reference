package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bum  reason: default package */
/* loaded from: classes2.dex */
public final class bum implements Runnable {
    private final /* synthetic */ bup a;
    private final /* synthetic */ buj b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bum(buj bujVar, bup bupVar) {
        this.b = bujVar;
        this.a = bupVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        buj.a(this.b);
        this.b.a();
    }
}
