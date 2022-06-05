package defpackage;

/* renamed from: brf  reason: default package */
/* loaded from: classes2.dex */
final class brf implements Runnable {
    private final /* synthetic */ String a;
    private final /* synthetic */ String b;
    private final /* synthetic */ String c;
    private final /* synthetic */ long d;
    private final /* synthetic */ bqm e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public brf(bqm bqmVar, String str, String str2, String str3, long j) {
        this.e = bqmVar;
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = j;
    }

    @Override // java.lang.Runnable
    public final void run() {
        buj bujVar;
        buj bujVar2;
        String str = this.a;
        if (str != null) {
            bst bstVar = new bst(this.c, str, this.d);
            bujVar = this.e.a;
            bujVar.b.h().a(this.b, bstVar);
            return;
        }
        bujVar2 = this.e.a;
        bujVar2.b.h().a(this.b, (bst) null);
    }
}
