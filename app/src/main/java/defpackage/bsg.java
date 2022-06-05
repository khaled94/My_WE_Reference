package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bsg  reason: default package */
/* loaded from: classes2.dex */
public final class bsg implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ brs b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bsg(brs brsVar, boolean z) {
        this.b = brsVar;
        this.a = z;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean r = this.b.w.r();
        boolean o = this.b.w.o();
        this.b.w.a(this.a);
        if (o == this.a) {
            this.b.w.q().k.a("Default data collection state already set to", Boolean.valueOf(this.a));
        }
        if (this.b.w.r() == r || this.b.w.r() != this.b.w.o()) {
            this.b.w.q().h.a("Default data collection is different than actual status", Boolean.valueOf(this.a), Boolean.valueOf(r));
        }
        this.b.F();
    }
}
