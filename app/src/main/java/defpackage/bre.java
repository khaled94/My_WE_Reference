package defpackage;

/* renamed from: bre  reason: default package */
/* loaded from: classes2.dex */
final class bre implements Runnable {
    private final /* synthetic */ buq a;
    private final /* synthetic */ bva b;
    private final /* synthetic */ bqm c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bre(bqm bqmVar, buq buqVar, bva bvaVar) {
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
        bujVar2.a(this.a, this.b);
    }
}
