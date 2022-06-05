package defpackage;

/* renamed from: bqr  reason: default package */
/* loaded from: classes2.dex */
final class bqr implements Runnable {
    private final /* synthetic */ bvd a;
    private final /* synthetic */ bva b;
    private final /* synthetic */ bqm c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqr(bqm bqmVar, bvd bvdVar, bva bvaVar) {
        this.c = bqmVar;
        this.a = bvdVar;
        this.b = bvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        buj bujVar;
        buj bujVar2;
        bujVar = this.c.a;
        bujVar.k();
        bujVar2 = this.c.a;
        bujVar2.a(this.a, this.b);
    }
}
