package defpackage;

/* renamed from: cjk  reason: default package */
/* loaded from: classes2.dex */
final class cjk implements Runnable {
    private final /* synthetic */ cjn a;
    private final /* synthetic */ cjh b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public cjk(cjh cjhVar, cjn cjnVar) {
        this.b = cjhVar;
        this.a = cjnVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        synchronized (this.b.a.h) {
            if (!this.b.a.h.isEmpty()) {
                cjn cjnVar = this.a;
                this.b.a.h.get(0);
                cjnVar.a();
            }
        }
    }
}
