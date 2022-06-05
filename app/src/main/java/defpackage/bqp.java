package defpackage;

/* renamed from: bqp  reason: default package */
/* loaded from: classes2.dex */
final class bqp implements Runnable {
    private final /* synthetic */ bva a;
    private final /* synthetic */ bqm b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqp(bqm bqmVar, bva bvaVar) {
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
        bva bvaVar = this.a;
        bujVar2.g();
        bujVar2.h();
        aat.a(bvaVar.a);
        bujVar2.c(bvaVar);
    }
}
