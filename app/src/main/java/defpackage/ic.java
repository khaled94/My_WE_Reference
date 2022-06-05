package defpackage;

import android.content.Context;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.ColorFilter;
import android.graphics.Paint;
import android.graphics.Rect;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.view.Gravity;
import androidx.vectordrawable.graphics.drawable.Animatable2Compat;
import defpackage.ig;
import java.nio.ByteBuffer;
import java.util.ArrayList;
import java.util.List;

/* renamed from: ic  reason: default package */
/* loaded from: classes2.dex */
public class ic extends Drawable implements Animatable, Animatable2Compat, ig.b {
    final a a;
    boolean b;
    private boolean c;
    private boolean d;
    private boolean e;
    private int f;
    private int g;
    private boolean h;
    private Paint i;
    private Rect j;
    private List<Animatable2Compat.AnimationCallback> k;

    @Override // android.graphics.drawable.Drawable
    public int getOpacity() {
        return -2;
    }

    public ic(Context context, ca caVar, cq<Bitmap> cqVar, int i, int i2, Bitmap bitmap) {
        this(new a(new ig(bo.a(context), caVar, i, i2, cqVar, bitmap)));
    }

    ic(a aVar) {
        this.e = true;
        this.g = -1;
        this.a = (a) lf.a(aVar, "Argument must not be null");
    }

    public final Bitmap a() {
        return this.a.a.h;
    }

    public final ByteBuffer b() {
        return this.a.a.a.a().asReadOnlyBuffer();
    }

    @Override // android.graphics.drawable.Animatable
    public void start() {
        this.d = true;
        this.f = 0;
        if (this.e) {
            d();
        }
    }

    @Override // android.graphics.drawable.Animatable
    public void stop() {
        this.d = false;
        e();
    }

    private void d() {
        lf.a(!this.b, "You cannot start a recycled Drawable. Ensure thatyou clear any references to the Drawable when clearing the corresponding request.");
        if (this.a.a.a() == 1) {
            invalidateSelf();
        } else if (this.c) {
        } else {
            this.c = true;
            this.a.a.a(this);
            invalidateSelf();
        }
    }

    private void e() {
        this.c = false;
        this.a.a.b(this);
    }

    @Override // android.graphics.drawable.Drawable
    public boolean setVisible(boolean z, boolean z2) {
        lf.a(!this.b, "Cannot change the visibility of a recycled resource. Ensure that you unset the Drawable from your View before changing the View's visibility.");
        this.e = z;
        if (!z) {
            e();
        } else if (this.d) {
            d();
        }
        return super.setVisible(z, z2);
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicWidth() {
        return this.a.a.k;
    }

    @Override // android.graphics.drawable.Drawable
    public int getIntrinsicHeight() {
        return this.a.a.l;
    }

    @Override // android.graphics.drawable.Animatable
    public boolean isRunning() {
        return this.c;
    }

    @Override // android.graphics.drawable.Drawable
    protected void onBoundsChange(Rect rect) {
        super.onBoundsChange(rect);
        this.h = true;
    }

    @Override // android.graphics.drawable.Drawable
    public void draw(Canvas canvas) {
        Bitmap bitmap;
        if (this.b) {
            return;
        }
        if (this.h) {
            Gravity.apply(119, getIntrinsicWidth(), getIntrinsicHeight(), getBounds(), f());
            this.h = false;
        }
        ig igVar = this.a.a;
        if (igVar.e == null) {
            bitmap = igVar.h;
        } else {
            bitmap = igVar.e.b;
        }
        canvas.drawBitmap(bitmap, (Rect) null, f(), g());
    }

    @Override // android.graphics.drawable.Drawable
    public void setAlpha(int i) {
        g().setAlpha(i);
    }

    @Override // android.graphics.drawable.Drawable
    public void setColorFilter(ColorFilter colorFilter) {
        g().setColorFilter(colorFilter);
    }

    private Rect f() {
        if (this.j == null) {
            this.j = new Rect();
        }
        return this.j;
    }

    private Paint g() {
        if (this.i == null) {
            this.i = new Paint(2);
        }
        return this.i;
    }

    @Override // android.graphics.drawable.Drawable
    public Drawable.ConstantState getConstantState() {
        return this.a;
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void registerAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        if (animationCallback == null) {
            return;
        }
        if (this.k == null) {
            this.k = new ArrayList();
        }
        this.k.add(animationCallback);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public boolean unregisterAnimationCallback(Animatable2Compat.AnimationCallback animationCallback) {
        List<Animatable2Compat.AnimationCallback> list = this.k;
        if (list == null || animationCallback == null) {
            return false;
        }
        return list.remove(animationCallback);
    }

    @Override // androidx.vectordrawable.graphics.drawable.Animatable2Compat
    public void clearAnimationCallbacks() {
        List<Animatable2Compat.AnimationCallback> list = this.k;
        if (list != null) {
            list.clear();
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: ic$a */
    /* loaded from: classes2.dex */
    public static final class a extends Drawable.ConstantState {
        final ig a;

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final int getChangingConfigurations() {
            return 0;
        }

        a(ig igVar) {
            this.a = igVar;
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable(Resources resources) {
            return newDrawable();
        }

        @Override // android.graphics.drawable.Drawable.ConstantState
        public final Drawable newDrawable() {
            return new ic(this);
        }
    }

    @Override // defpackage.ig.b
    public final void c() {
        Drawable.Callback callback = getCallback();
        while (callback instanceof Drawable) {
            callback = ((Drawable) callback).getCallback();
        }
        if (callback == null) {
            stop();
            invalidateSelf();
            return;
        }
        invalidateSelf();
        ig igVar = this.a.a;
        if ((igVar.e != null ? igVar.e.a : -1) == this.a.a.a() - 1) {
            this.f++;
        }
        int i = this.g;
        if (i == -1 || this.f < i) {
            return;
        }
        List<Animatable2Compat.AnimationCallback> list = this.k;
        if (list != null) {
            int size = list.size();
            for (int i2 = 0; i2 < size; i2++) {
                this.k.get(i2).onAnimationEnd(this);
            }
        }
        stop();
    }
}
