package defpackage;

import android.os.Bundle;

/* JADX INFO: Access modifiers changed from: package-private */
/* renamed from: bsv  reason: default package */
/* loaded from: classes2.dex */
public final class bsv implements Runnable {
    private final /* synthetic */ boolean a;
    private final /* synthetic */ bst b;
    private final /* synthetic */ bst c;
    private final /* synthetic */ bss d;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bsv(bss bssVar, boolean z, bst bstVar, bst bstVar2) {
        this.d = bssVar;
        this.a = z;
        this.b = bstVar;
        this.c = bstVar2;
    }

    @Override // java.lang.Runnable
    public final void run() {
        boolean z;
        boolean z2 = false;
        if (this.d.s().k(this.d.f().v())) {
            z = this.a && this.d.a != null;
            if (z) {
                bss bssVar = this.d;
                bss.a(bssVar, bssVar.a, true);
            }
        } else {
            if (this.a && this.d.a != null) {
                bss bssVar2 = this.d;
                bss.a(bssVar2, bssVar2.a, true);
            }
            z = false;
        }
        bst bstVar = this.b;
        if (bstVar == null || bstVar.c != this.c.c || !buv.d(this.b.b, this.c.b) || !buv.d(this.b.a, this.c.a)) {
            z2 = true;
        }
        if (z2) {
            Bundle bundle = new Bundle();
            bss.a(this.c, bundle, true);
            bst bstVar2 = this.b;
            if (bstVar2 != null) {
                if (bstVar2.a != null) {
                    bundle.putString("_pn", this.b.a);
                }
                bundle.putString("_pc", this.b.b);
                bundle.putLong("_pi", this.b.c);
            }
            if (this.d.s().k(this.d.f().v()) && z) {
                long w = this.d.j().w();
                if (w > 0) {
                    this.d.o().a(bundle, w);
                }
            }
            brs e = this.d.e();
            e.c();
            e.a("auto", "_vs", e.l().a(), bundle);
        }
        this.d.a = this.c;
        this.d.g().a(this.c);
    }
}
