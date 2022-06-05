package defpackage;

/* renamed from: wi  reason: default package */
/* loaded from: classes2.dex */
final class wi implements bwh {
    final /* synthetic */ bwm a;
    final /* synthetic */ wj b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public wi(wj wjVar, bwm bwmVar) {
        this.b = wjVar;
        this.a = bwmVar;
    }

    @Override // defpackage.bwh
    public final void onComplete(bwl bwlVar) {
        this.b.b.remove(this.a);
    }
}
