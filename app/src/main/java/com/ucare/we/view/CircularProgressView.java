package com.ucare.we.view;

import android.animation.ValueAnimator;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.SweepGradient;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.DecelerateInterpolator;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.res.ResourcesCompat;
import androidx.core.view.ViewCompat;
import com.ucare.we.R;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0014\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u0019\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006¢\u0006\u0002\u0010\u0007B!\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nJ\u0010\u0010&\u001a\u00020\f2\u0006\u0010'\u001a\u00020\fH\u0002J \u0010(\u001a\u00020)2\u0006\u0010\u000f\u001a\u00020\f2\u0006\u0010*\u001a\u00020+2\u0006\u0010,\u001a\u00020\u0013H\u0002J\u0018\u0010-\u001a\u00020\t2\u0006\u0010.\u001a\u00020\t2\u0006\u0010/\u001a\u00020\fH\u0002J\u0010\u00100\u001a\u00020)2\u0006\u0010*\u001a\u00020+H\u0014J(\u00101\u001a\u00020)2\u0006\u00102\u001a\u00020\t2\u0006\u00103\u001a\u00020\t2\u0006\u00104\u001a\u00020\t2\u0006\u00105\u001a\u00020\tH\u0014J\u0006\u00106\u001a\u00020)J\u0018\u00107\u001a\u00020)2\b\b\u0001\u0010'\u001a\u00020\f2\u0006\u00108\u001a\u000209J\u000e\u0010:\u001a\u00020)2\u0006\u0010.\u001a\u00020\tJ\u000e\u0010;\u001a\u00020)2\u0006\u0010.\u001a\u00020\tJ\u000e\u0010<\u001a\u00020)2\u0006\u00102\u001a\u00020\fJ\b\u0010=\u001a\u00020)H\u0002R\u000e\u0010\u000b\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\fX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0011X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u0014\u0010\u0018\u001a\u00020\u00198BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001a\u0010\u001bR\u000e\u0010\u001c\u001a\u00020\fX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\tX\u0082D¢\u0006\u0002\n\u0000R\u0014\u0010\u001e\u001a\u00020\u00118BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u001f\u0010 R\u000e\u0010!\u001a\u00020\u0013X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\"\u001a\u00020#X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010$\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000R\u000e\u0010%\u001a\u00020\fX\u0082D¢\u0006\u0002\n\u0000¨\u0006>"}, d2 = {"Lcom/ucare/we/view/CircularProgressView;", "Landroid/view/View;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "attrs", "Landroid/util/AttributeSet;", "(Landroid/content/Context;Landroid/util/AttributeSet;)V", "defStyleAttr", "", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "BODY_STROKE_WIDTH", "", "GLOW_STROKE_WIDTH", "PADDING", "angle", "backgroundFromToColors", "", "backgroundPaint", "Landroid/graphics/Paint;", "diameter", "glowColorCenter", "glowColorEnd", "glowColorStart", "mGradientFromToPositions", "", "getMGradientFromToPositions", "()[F", "maxAngle", "maxProgress", "progressFromToColors", "getProgressFromToColors", "()[I", "progressPaint", "rect", "Landroid/graphics/RectF;", "rotate", "startAngle", "calculateAngle", "progress", "drawCircle", "", "canvas", "Landroid/graphics/Canvas;", "paint", "getColorWithAlpha", TypedValues.Custom.S_COLOR, "ratio", "onDraw", "onSizeChanged", "width", "height", "oldWidth", "oldHeight", "setGlowingProgress", "setProgress", "animate", "", "setProgressBackgroundColor", "setProgressColor", "setProgressWidth", "updateRect", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class CircularProgressView extends View {
    public final float a;
    public final float b;
    public float c;
    public final Paint e;
    public final Paint f;
    private int i;
    private final int[] j;
    private final float l;
    private float o;
    private float p;
    public int d = ResourcesCompat.getColor(getResources(), R.color.progress_start, null);
    private int h = ResourcesCompat.getColor(getResources(), R.color.progress_center, null);
    private final RectF k = new RectF();
    public float g = 360.0f;
    private final int m = 100;
    private final float n = -90.0f;

    /* renamed from: lambda$2IcB7hOc-Z1Hei-_jG7_4NNPwoA */
    public static /* synthetic */ void m75lambda$2IcB7hOcZ1Hei_jG7_4NNPwoA(CircularProgressView circularProgressView, ValueAnimator valueAnimator) {
        a(circularProgressView, valueAnimator);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CircularProgressView(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        dqc.d(context, "context");
        float a = djr.a(7);
        this.a = a;
        this.b = 3.0f * a;
        this.c = a;
        int color = ResourcesCompat.getColor(getResources(), R.color.progress_end, null);
        this.i = color;
        this.j = new int[]{a(color), a(this.h), a(this.d)};
        Paint paint = new Paint(1);
        paint.setStyle(Paint.Style.STROKE);
        paint.setStrokeWidth(djr.a(4));
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setStrokeJoin(Paint.Join.BEVEL);
        dmg dmgVar = dmg.a;
        this.e = paint;
        Paint paint2 = new Paint(1);
        paint2.setStyle(Paint.Style.STROKE);
        dmg dmgVar2 = dmg.a;
        this.f = paint2;
    }

    private final int[] getProgressFromToColors() {
        return ViewCompat.getLayoutDirection(this) == 0 ? new int[]{this.i, this.h, this.d} : new int[]{this.d, this.h, this.i};
    }

    private final float[] getMGradientFromToPositions() {
        return ViewCompat.getLayoutDirection(this) == 0 ? new float[]{0.1f, 0.4f, 0.8f} : new float[]{0.1f, 0.5f, 0.8f};
    }

    @Override // android.view.View
    protected final void onDraw(Canvas canvas) {
        dqc.d(canvas, "canvas");
        canvas.rotate(this.n, getWidth() / 2, getHeight() / 2);
        float f = this.c;
        this.k.set(f, f, getWidth() - this.c, getHeight() - this.c);
        a(this.p, canvas, this.e);
        a(this.g, canvas, this.f);
    }

    @Override // android.view.View
    protected final void onSizeChanged(int i, int i2, int i3, int i4) {
        this.o = Math.min(i, i2);
        float f = i / 2.0f;
        float f2 = i2 / 2.0f;
        this.e.setShader(new SweepGradient(f, f2, getProgressFromToColors(), getMGradientFromToPositions()));
        this.f.setShader(new SweepGradient(f, f2, this.j, getMGradientFromToPositions()));
        a();
    }

    private final void a() {
        float strokeWidth = this.f.getStrokeWidth();
        RectF rectF = this.k;
        float f = this.o;
        rectF.set(strokeWidth, strokeWidth, f - strokeWidth, f - strokeWidth);
    }

    private final void a(float f, Canvas canvas, Paint paint) {
        canvas.drawArc(this.k, this.l, f, false, paint);
    }

    public static final void a(CircularProgressView circularProgressView, ValueAnimator valueAnimator) {
        dqc.d(circularProgressView, "this$0");
        Object animatedValue = valueAnimator.getAnimatedValue();
        if (animatedValue == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        circularProgressView.p = ((Float) animatedValue).floatValue();
        Object animatedValue2 = valueAnimator.getAnimatedValue();
        if (animatedValue2 == null) {
            throw new NullPointerException("null cannot be cast to non-null type kotlin.Float");
        }
        circularProgressView.g = ((Float) animatedValue2).floatValue();
        circularProgressView.invalidate();
    }

    public final void setProgressColor(int i) {
        this.e.setColor(i);
        invalidate();
    }

    public final void setProgressBackgroundColor(int i) {
        this.f.setColor(i);
        invalidate();
    }

    public final void setProgressWidth(float f) {
        this.e.setStrokeWidth(f);
        this.f.setStrokeWidth(f);
        a();
        invalidate();
    }

    private static int a(int i) {
        return Color.argb(dqn.a(Color.alpha(i) * 0.2f), Color.red(i), Color.green(i), Color.blue(i));
    }

    public final void a(float f, boolean z) {
        float f2;
        if (ViewCompat.getLayoutDirection(this) == 0) {
            f2 = (360.0f / this.m) * f;
            f = -1.0f;
        } else {
            f2 = 360.0f / this.m;
        }
        float f3 = f2 * f;
        this.p = f3;
        if (z) {
            ValueAnimator ofFloat = ValueAnimator.ofFloat(0.0f, f3);
            ofFloat.setInterpolator(new DecelerateInterpolator());
            ofFloat.setDuration(4000L);
            ofFloat.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: com.ucare.we.view.-$$Lambda$CircularProgressView$2IcB7hOc-Z1Hei-_jG7_4NNPwoA
                @Override // android.animation.ValueAnimator.AnimatorUpdateListener
                public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                    CircularProgressView.m75lambda$2IcB7hOcZ1Hei_jG7_4NNPwoA(CircularProgressView.this, valueAnimator);
                }
            });
            ofFloat.start();
            return;
        }
        invalidate();
    }
}
