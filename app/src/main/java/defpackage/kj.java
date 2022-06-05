package defpackage;

import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.widget.ImageView;

/* renamed from: kj  reason: default package */
/* loaded from: classes2.dex */
public abstract class kj<Z> extends kn<ImageView, Z> {
    private Animatable b;

    protected abstract void b(Z z);

    public kj(ImageView imageView) {
        super(imageView);
    }

    private void d(Drawable drawable) {
        ((ImageView) this.a).setImageDrawable(drawable);
    }

    @Override // defpackage.kn, defpackage.kf, defpackage.km
    public final void b(Drawable drawable) {
        super.b(drawable);
        c((kj<Z>) null);
        d(drawable);
    }

    @Override // defpackage.kf, defpackage.km
    public final void c(Drawable drawable) {
        super.c(drawable);
        c((kj<Z>) null);
        d(drawable);
    }

    @Override // defpackage.kn, defpackage.kf, defpackage.km
    public final void a(Drawable drawable) {
        super.a(drawable);
        Animatable animatable = this.b;
        if (animatable != null) {
            animatable.stop();
        }
        c((kj<Z>) null);
        d(drawable);
    }

    @Override // defpackage.km
    public final void a(Z z) {
        c((kj<Z>) z);
    }

    @Override // defpackage.kf, defpackage.jd
    public final void a() {
        Animatable animatable = this.b;
        if (animatable != null) {
            animatable.start();
        }
    }

    @Override // defpackage.kf, defpackage.jd
    public final void b() {
        Animatable animatable = this.b;
        if (animatable != null) {
            animatable.stop();
        }
    }

    private void c(Z z) {
        b((kj<Z>) z);
        d((kj<Z>) z);
    }

    private void d(Z z) {
        if (z instanceof Animatable) {
            Animatable animatable = (Animatable) z;
            this.b = animatable;
            animatable.start();
            return;
        }
        this.b = null;
    }
}
