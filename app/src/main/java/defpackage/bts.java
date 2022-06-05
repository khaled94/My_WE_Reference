package defpackage;

/* renamed from: bts  reason: default package */
/* loaded from: classes2.dex */
final class bts implements Runnable {
    private final /* synthetic */ btp a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bts(btp btpVar) {
        this.a = btpVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c.b = null;
        this.a.c.G();
    }
}
