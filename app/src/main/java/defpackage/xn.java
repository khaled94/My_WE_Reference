package defpackage;

/* renamed from: xn  reason: default package */
/* loaded from: classes2.dex */
final class xn implements Runnable {
    final /* synthetic */ xr a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xn(xr xrVar) {
        this.a = xrVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        this.a.c();
    }
}
