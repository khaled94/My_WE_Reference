package defpackage;

import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;

/* renamed from: hu  reason: default package */
/* loaded from: classes2.dex */
public abstract class hu<T extends Drawable> implements ea, ee<T> {
    protected final T a;

    public hu(T t) {
        this.a = (T) lf.a(t, "Argument must not be null");
    }

    @Override // defpackage.ea
    public void e() {
        T t = this.a;
        if (t instanceof BitmapDrawable) {
            ((BitmapDrawable) t).getBitmap().prepareToDraw();
        } else if (!(t instanceof ic)) {
        } else {
            ((ic) t).a().prepareToDraw();
        }
    }

    @Override // defpackage.ee
    public final /* synthetic */ Object b() {
        Drawable.ConstantState constantState = this.a.getConstantState();
        if (constantState == null) {
            return this.a;
        }
        return constantState.newDrawable();
    }
}
