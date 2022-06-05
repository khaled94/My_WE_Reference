package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bld  reason: default package */
/* loaded from: classes2.dex */
public final class bld implements Runnable {
    private final /* synthetic */ brk a;
    private final /* synthetic */ bla b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bld(bla blaVar, brk brkVar) {
        this.b = blaVar;
        this.a = brkVar;
    }

    @Override // java.lang.Runnable
    public final void run() {
        if (bve.a()) {
            this.a.p().a(this);
            return;
        }
        boolean b = this.b.b();
        this.b.d = 0L;
        if (!b) {
            return;
        }
        this.b.a();
    }
}
