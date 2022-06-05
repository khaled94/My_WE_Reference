package com.skyfishjy.library;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.util.AttributeSet;
import android.view.View;
import android.view.animation.AccelerateDecelerateInterpolator;
import android.widget.RelativeLayout;
import androidx.vectordrawable.graphics.drawable.PathInterpolatorCompat;
import java.util.ArrayList;

/* loaded from: classes.dex */
public class RippleBackground extends RelativeLayout {
    public AnimatorSet b;
    private int d;
    private float e;
    private float f;
    private int g;
    private int h;
    private int i;
    private float j;
    private int k;
    private Paint l;
    private ArrayList<Animator> m;
    private RelativeLayout.LayoutParams n;
    public boolean a = false;
    public ArrayList<a> c = new ArrayList<>();

    public RippleBackground(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        a(context, attributeSet);
    }

    private void a(Context context, AttributeSet attributeSet) {
        if (isInEditMode()) {
            return;
        }
        if (attributeSet == null) {
            throw new IllegalArgumentException("Attributes should be provided to this view,");
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R.styleable.RippleBackground);
        this.d = obtainStyledAttributes.getColor(R.styleable.RippleBackground_rb_color, getResources().getColor(R.color.rippelColor));
        this.e = obtainStyledAttributes.getDimension(R.styleable.RippleBackground_rb_strokeWidth, getResources().getDimension(R.dimen.rippleStrokeWidth));
        this.f = obtainStyledAttributes.getDimension(R.styleable.RippleBackground_rb_radius, getResources().getDimension(R.dimen.rippleRadius));
        this.g = obtainStyledAttributes.getInt(R.styleable.RippleBackground_rb_duration, PathInterpolatorCompat.MAX_NUM_POINTS);
        this.h = obtainStyledAttributes.getInt(R.styleable.RippleBackground_rb_rippleAmount, 6);
        this.j = obtainStyledAttributes.getFloat(R.styleable.RippleBackground_rb_scale, 6.0f);
        this.k = obtainStyledAttributes.getInt(R.styleable.RippleBackground_rb_type, 0);
        obtainStyledAttributes.recycle();
        this.i = this.g / this.h;
        Paint paint = new Paint();
        this.l = paint;
        paint.setAntiAlias(true);
        if (this.k == 0) {
            this.e = 0.0f;
            this.l.setStyle(Paint.Style.FILL);
        } else {
            this.l.setStyle(Paint.Style.STROKE);
        }
        this.l.setColor(this.d);
        float f = this.f;
        float f2 = this.e;
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams((int) ((f + f2) * 2.0f), (int) ((f + f2) * 2.0f));
        this.n = layoutParams;
        layoutParams.addRule(13, -1);
        AnimatorSet animatorSet = new AnimatorSet();
        this.b = animatorSet;
        animatorSet.setDuration(this.g);
        this.b.setInterpolator(new AccelerateDecelerateInterpolator());
        this.m = new ArrayList<>();
        for (int i = 0; i < this.h; i++) {
            a aVar = new a(getContext());
            addView(aVar, this.n);
            this.c.add(aVar);
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(aVar, "ScaleX", 1.0f, this.j);
            ofFloat.setRepeatCount(-1);
            ofFloat.setRepeatMode(1);
            ofFloat.setStartDelay(this.i * i);
            this.m.add(ofFloat);
            ObjectAnimator ofFloat2 = ObjectAnimator.ofFloat(aVar, "ScaleY", 1.0f, this.j);
            ofFloat2.setRepeatCount(-1);
            ofFloat2.setRepeatMode(1);
            ofFloat2.setStartDelay(this.i * i);
            this.m.add(ofFloat2);
            ObjectAnimator ofFloat3 = ObjectAnimator.ofFloat(aVar, "Alpha", 1.0f, 0.0f);
            ofFloat3.setRepeatCount(-1);
            ofFloat3.setRepeatMode(1);
            ofFloat3.setStartDelay(this.i * i);
            this.m.add(ofFloat3);
        }
        this.b.playTogether(this.m);
    }

    /* loaded from: classes.dex */
    public class a extends View {
        public a(Context context) {
            super(context);
            setVisibility(4);
        }

        @Override // android.view.View
        protected final void onDraw(Canvas canvas) {
            float min = Math.min(getWidth(), getHeight()) / 2;
            canvas.drawCircle(min, min, min - RippleBackground.this.e, RippleBackground.this.l);
        }
    }
}
