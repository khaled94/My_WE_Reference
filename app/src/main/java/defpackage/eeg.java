package defpackage;

import java.util.concurrent.TimeUnit;

/* renamed from: eeg  reason: default package */
/* loaded from: classes2.dex */
final class eeg extends eeo {
    private eeo a;
    private boolean b;
    private long d;
    private long e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(eeo eeoVar) {
        this.a = eeoVar;
        boolean E_ = eeoVar.E_();
        this.b = E_;
        this.d = E_ ? eeoVar.c() : -1L;
        long C_ = eeoVar.C_();
        this.e = C_;
        eeoVar.a(a(C_, C_()), TimeUnit.NANOSECONDS);
        if (this.b && E_()) {
            eeoVar.a(Math.min(c(), this.d));
        } else if (!E_()) {
        } else {
            eeoVar.a(c());
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void g() {
        this.a.a(this.e, TimeUnit.NANOSECONDS);
        if (this.b) {
            this.a.a(this.d);
        } else {
            this.a.D_();
        }
    }
}
