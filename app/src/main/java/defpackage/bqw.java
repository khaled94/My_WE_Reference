package defpackage;

/* renamed from: bqw  reason: default package */
/* loaded from: classes2.dex */
final class bqw implements Runnable {
    private final /* synthetic */ bva a;
    private final /* synthetic */ bqm b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqw(bqm bqmVar, bva bvaVar) {
        this.b = bqmVar;
        this.a = bvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        buj bujVar;
        buj bujVar2;
        bujVar = this.b.a;
        bujVar.k();
        bujVar2 = this.b.a;
        bujVar2.a(this.a);
    }
}
