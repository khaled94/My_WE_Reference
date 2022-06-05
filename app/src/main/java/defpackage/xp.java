package defpackage;

/* renamed from: xp  reason: default package */
/* loaded from: classes2.dex */
final class xp implements Runnable {
    final /* synthetic */ xq a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public xp(xq xqVar) {
        this.a = xqVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        xr xrVar = this.a.a;
        xrVar.a.a(String.valueOf(xrVar.a.getClass().getName()).concat(" disconnecting because it was signed out."));
    }
}
