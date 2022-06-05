package defpackage;

/* renamed from: bqy  reason: default package */
/* loaded from: classes2.dex */
final class bqy implements Runnable {
    private final /* synthetic */ bli a;
    private final /* synthetic */ String b;
    private final /* synthetic */ bqm c;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bqy(bqm bqmVar, bli bliVar, String str) {
        this.c = bqmVar;
        this.a = bliVar;
        this.b = str;
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
