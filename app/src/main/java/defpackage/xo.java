package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: xo  reason: default package */
/* loaded from: classes2.dex */
public final class xo implements Runnable {
    final /* synthetic */ int a;
    final /* synthetic */ xr b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xo(xr xrVar, int i) {
        this.b = xrVar;
        this.a = i;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.b.b(this.a);
    }
}
