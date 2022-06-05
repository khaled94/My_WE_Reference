package defpackage;

/* renamed from: yl  reason: default package */
/* loaded from: classes2.dex */
final class yl implements Runnable {
    final /* synthetic */ bvz a;
    final /* synthetic */ yn b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public yl(yn ynVar, bvz bvzVar) {
        this.b = ynVar;
        this.a = bvzVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        yn.a(this.b, this.a);
    }
}
