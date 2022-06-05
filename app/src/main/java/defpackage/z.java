package defpackage;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.RippleDrawable;
import android.graphics.drawable.ShapeDrawable;
import android.graphics.drawable.StateListDrawable;
import android.graphics.drawable.shapes.OvalShape;
import android.os.Build;
import android.util.TypedValue;
import android.widget.FrameLayout;
import androidx.core.content.ContextCompat;

/* renamed from: z  reason: default package */
/* loaded from: classes2.dex */
public final class z extends FrameLayout {
    private final int a;
    private final int b;
    private final Paint c;
    private final Paint d;
    private final Paint e;
    private boolean f;

    public z(Context context) {
        this(context, (byte) 0);
    }

    private z(Context context, byte b) {
        super(context, null, 0);
        Resources resources = getResources();
        this.a = (int) TypedValue.applyDimension(1, 3.0f, resources.getDisplayMetrics());
        this.b = (int) TypedValue.applyDimension(1, 5.0f, resources.getDisplayMetrics());
        Paint paint = new Paint();
        this.d = paint;
        paint.setAntiAlias(true);
        this.d.setColor(-1);
        Paint paint2 = new Paint();
        this.e = paint2;
        paint2.setAntiAlias(true);
        Paint paint3 = new Paint();
        this.c = paint3;
        paint3.setAntiAlias(true);
        a(-12303292);
        setWillNotDraw(false);
    }

    private void a(int i) {
        this.e.setColor(i);
        this.c.setColor(a(i, 0.9f));
        Drawable c = c(i);
        if (Build.VERSION.SDK_INT >= 21) {
            setForeground(new RippleDrawable(new ColorStateList(new int[][]{new int[]{16842919}}, new int[]{a(i, 1.1f)}), c, null));
        } else {
            setForeground(c);
        }
    }

    @Override // android.view.View
    public final void setBackgroundColor(int i) {
        a(i);
        requestLayout();
        invalidate();
    }

    @Override // android.view.View
    public final void setBackgroundResource(int i) {
        setBackgroundColor(ContextCompat.getColor(getContext(), i));
    }

    @Override // android.view.View
    @Deprecated
    public final void setBackground(Drawable drawable) {
        throw new IllegalStateException("Cannot use setBackground() on CircleView.");
    }

    @Override // android.view.View
    @Deprecated
    public final void setBackgroundDrawable(Drawable drawable) {
        throw new IllegalStateException("Cannot use setBackgroundDrawable() on CircleView.");
    }

    @Override // android.view.View
    @Deprecated
    public final void setActivated(boolean z) {
        throw new IllegalStateException("Cannot use setActivated() on CircleView.");
    }

    @Override // android.view.View
    public final void setSelected(boolean z) {
        this.f = z;
        requestLayout();
        invalidate();
    }

    @Override // android.widget.FrameLayout, android.view.View
    protected final void onMeasure(int i, int i2) {
        super.onMeasure(i, i);
        setMeasuredDimension(getMeasuredWidth(), getMeasuredWidth());
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        super.onDraw(canvas);
        int measuredWidth = getMeasuredWidth() / 2;
        if (this.f) {
            int i = measuredWidth - this.b;
            int i2 = i - this.a;
            canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, this.c);
            canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, i, this.d);
            canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, i2, this.e);
            return;
        }
        canvas.drawCircle(getMeasuredWidth() / 2, getMeasuredHeight() / 2, measuredWidth, this.e);
    }

    private static int b(int i) {
        return Color.argb(Math.round(Color.alpha(i) * 0.7f), Color.red(i), Color.green(i), Color.blue(i));
    }

    private static Drawable c(int i) {
        ShapeDrawable shapeDrawable = new ShapeDrawable(new OvalShape());
        shapeDrawable.getPaint().setColor(b(a(i, 1.1f)));
        StateListDrawable stateListDrawable = new StateListDrawable();
        stateListDrawable.addState(new int[]{16842919}, shapeDrawable);
        return stateListDrawable;
    }

    private static int a(int i, float f) {
        if (f == 1.0f) {
            return i;
        }
        Color.colorToHSV(i, r0);
        float[] fArr = {0.0f, 0.0f, fArr[2] * f};
        return Color.HSVToColor(fArr);
    }
}
