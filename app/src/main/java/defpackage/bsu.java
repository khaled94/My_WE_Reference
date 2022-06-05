package defpackage;

/* renamed from: bsu  reason: default package */
/* loaded from: classes2.dex */
final class bsu implements Runnable {
    private final /* synthetic */ bst a;
    private final /* synthetic */ bss b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bsu(bss bssVar, bst bstVar) {
        this.b = bssVar;
        this.a = bstVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        bss.a(this.b, this.a, false);
        this.b.a = null;
        this.b.g().a((bst) null);
    }
}
