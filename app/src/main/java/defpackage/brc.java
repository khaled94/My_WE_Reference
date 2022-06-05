package defpackage;

/* renamed from: brc  reason: default package */
/* loaded from: classes2.dex */
public abstract class brc extends boc {
    private boolean a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public brc(bql bqlVar) {
        super(bqlVar);
        this.w.j++;
    }

    protected abstract boolean t();

    protected void u() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean A() {
        return this.a;
    }

    public final void B() {
        if (A()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void C() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (t()) {
            return;
        }
        this.w.t();
        this.a = true;
    }

    public final void D() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        u();
        this.w.t();
        this.a = true;
    }
}
