package defpackage;

/* renamed from: bqt  reason: default package */
/* loaded from: classes2.dex */
final class bqt implements Runnable {
    private final /* synthetic */ bvd a;
    private final /* synthetic */ bqm b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqt(bqm bqmVar, bvd bvdVar) {
        this.b = bqmVar;
        this.a = bvdVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        buj bujVar;
        buj bujVar2;
        bujVar = this.b.a;
        bujVar.k();
        bujVar2 = this.b.a;
        bvd bvdVar = this.a;
        bva a = bujVar2.a(bvdVar.a);
        if (a != null) {
            bujVar2.a(bvdVar, a);
        }
    }
}
