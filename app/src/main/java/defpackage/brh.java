package defpackage;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: brh  reason: default package */
/* loaded from: classes2.dex */
public abstract class brh extends bri {
    private boolean a;

    /* JADX INFO: Access modifiers changed from: package-private */
    public brh(bql bqlVar) {
        super(bqlVar);
        this.w.j++;
    }

    protected abstract boolean d();

    protected void e() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean v() {
        return this.a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void w() {
        if (v()) {
            return;
        }
        throw new IllegalStateException("Not initialized");
    }

    public final void x() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        if (d()) {
            return;
        }
        this.w.t();
        this.a = true;
    }

    public final void y() {
        if (this.a) {
            throw new IllegalStateException("Can't initialize twice");
        }
        e();
        this.w.t();
        this.a = true;
    }
}
