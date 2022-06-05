package defpackage;

import androidx.core.util.Pools;
import defpackage.lh;
import defpackage.lj;

/* renamed from: ed  reason: default package */
/* loaded from: classes2.dex */
final class ed<Z> implements ee<Z>, lh.c {
    private static final Pools.Pool<ed<?>> a = lh.a(20, new lh.a<ed<?>>() { // from class: ed.1
        @Override // defpackage.lh.a
        public final /* synthetic */ ed<?> a() {
            return new ed<>();
        }
    });
    private final lj b = new lj.a();
    private ee<Z> c;
    private boolean d;
    private boolean e;

    /* JADX INFO: Access modifiers changed from: package-private */
    public static <Z> ed<Z> a(ee<Z> eeVar) {
        ed<Z> edVar = (ed) lf.a(a.acquire(), "Argument must not be null");
        ((ed) edVar).e = false;
        ((ed) edVar).d = true;
        ((ed) edVar).c = eeVar;
        return edVar;
    }

    ed() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final synchronized void e() {
        this.b.a();
        if (!this.d) {
            throw new IllegalStateException("Already unlocked");
        }
        this.d = false;
        if (this.e) {
            d();
        }
    }

    @Override // defpackage.ee
    public final Class<Z> a() {
        return this.c.a();
    }

    @Override // defpackage.ee
    public final Z b() {
        return this.c.b();
    }

    @Override // defpackage.ee
    public final int c() {
        return this.c.c();
    }

    @Override // defpackage.ee
    public final synchronized void d() {
        this.b.a();
        this.e = true;
        if (!this.d) {
            this.c.d();
            this.c = null;
            a.release(this);
        }
    }

    @Override // defpackage.lh.c
    public final lj a_() {
        return this.b;
    }
}
