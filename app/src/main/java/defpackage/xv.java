package defpackage;

import android.os.Looper;
import defpackage.vc;
import defpackage.vc.d;
import defpackage.vq;
import org.checkerframework.checker.initialization.qual.NotOnlyInitialized;

/* renamed from: xv  reason: default package */
/* loaded from: classes2.dex */
public final class xv<O extends vc.d> extends wm {
    @NotOnlyInitialized
    private final ve<O> a;

    public xv(ve<O> veVar) {
        this.a = veVar;
    }

    @Override // defpackage.vf
    public final Looper a() {
        return this.a.e;
    }

    @Override // defpackage.vf
    public final <A extends vc.b, R extends vi, T extends vq.a<R, A>> T a(T t) {
        return (T) this.a.a((ve<O>) t);
    }

    @Override // defpackage.vf
    public final void a(ys ysVar) {
    }

    @Override // defpackage.vf
    public final <A extends vc.b, T extends vq.a<? extends vi, A>> T b(T t) {
        return (T) this.a.b((ve<O>) t);
    }

    @Override // defpackage.vf
    public final void b(ys ysVar) {
    }
}
