package defpackage;

import com.google.android.gms.common.api.Status;
import defpackage.vi;
import java.lang.ref.WeakReference;

/* renamed from: ys  reason: default package */
/* loaded from: classes2.dex */
public final class ys<R extends vi> extends vm<R> implements vj<R> {
    vl<? super R, ? extends vi> a;
    ys<? extends vi> b;
    volatile vk<? super R> c;
    vg<R> d;
    final Object e;
    Status f;
    final WeakReference<vf> g;
    final yq h;
    boolean i;

    private final boolean a() {
        return (this.c == null || this.g.get() == null) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static final void b(vi viVar) {
        if (viVar instanceof vh) {
            try {
                ((vh) viVar).b();
            } catch (RuntimeException unused) {
                String valueOf = String.valueOf(viVar);
                String.valueOf(valueOf).length();
                "Unable to release ".concat(String.valueOf(valueOf));
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(Status status) {
        synchronized (this.e) {
            this.f = status;
            b(status);
        }
    }

    @Override // defpackage.vj
    public final void a(R r) {
        synchronized (this.e) {
            if (!r.a().c()) {
                a(r.a());
                b(r);
            } else if (this.a != null) {
                yi.a().submit(new yp(this, r));
            } else if (a()) {
                aat.a(this.c);
            }
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void b(Status status) {
        synchronized (this.e) {
            if (this.a != null) {
                ((ys) aat.a(this.b)).a((Status) aat.a(status, "onFailure must not return null"));
            } else if (a()) {
                aat.a(this.c);
            }
        }
    }
}
