package defpackage;

/* renamed from: bra  reason: default package */
/* loaded from: classes2.dex */
final class bra implements Runnable {
    private final /* synthetic */ buq a;
    private final /* synthetic */ bva b;
    private final /* synthetic */ bqm c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bra(bqm bqmVar, buq buqVar, bva bvaVar) {
        this.c = bqmVar;
        this.a = buqVar;
        this.b = bvaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        buj bujVar;
        buj bujVar2;
        bujVar = this.c.a;
        bujVar.k();
        bujVar2 = this.c.a;
        bujVar2.b(this.a, this.b);
    }
}
