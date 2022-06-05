package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: cob  reason: default package */
/* loaded from: classes2.dex */
public final class cob implements Runnable {
    private final /* synthetic */ coa a;
    private final /* synthetic */ coc b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cob(coc cocVar, coa coaVar) {
        this.b = cocVar;
        this.a = coaVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        cny cnyVar;
        cnyVar = this.b.a;
        cnyVar.b(this.a.a);
        this.a.a();
    }
}
