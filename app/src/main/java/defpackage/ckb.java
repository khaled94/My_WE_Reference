package defpackage;

import android.app.Application;
import android.content.Context;

/* renamed from: ckb  reason: default package */
/* loaded from: classes2.dex */
public final class ckb {
    public final ckz a;
    volatile boolean b;
    private volatile int c;

    public ckb(cgw cgwVar) {
        this(cgwVar.a(), new ckz(cgwVar));
    }

    private ckb(Context context, ckz ckzVar) {
        this.b = false;
        this.c = 0;
        this.a = ckzVar;
        vp.a((Application) context.getApplicationContext());
        vp.a().a(new cke(this));
    }

    public final void a(alf alfVar) {
        if (alfVar == null) {
            return;
        }
        long a = alfVar.a();
        if (a <= 0) {
            a = 3600;
        }
        ckz ckzVar = this.a;
        ckzVar.b = alfVar.d.longValue() + (a * 1000);
        ckzVar.c = -1L;
        if (!a()) {
            return;
        }
        this.a.a();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean a() {
        return this.c > 0 && !this.b;
    }
}
