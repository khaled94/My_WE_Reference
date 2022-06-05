package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: buk  reason: default package */
/* loaded from: classes2.dex */
public abstract class buk extends buh {
    private boolean a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public buk(buj bujVar) {
        super(bujVar);
        this.b.d++;
    }

    protected abstract boolean d();

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean j() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void t() {
        if (j()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void u() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        d();
        this.b.e++;
        this.a = true;
    }
}
