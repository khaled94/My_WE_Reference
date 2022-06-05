package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.cuc;

/* renamed from: cuq  reason: default package */
/* loaded from: classes2.dex */
public final class cuq extends cuo {
    private cug f = new cug();
    private int g;
    private int h;

    public cuq(cuc.a aVar) {
        super(aVar);
    }

    @Override // defpackage.cuo
    /* renamed from: d */
    public final ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cuq.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                cuq.a(cuq.this, valueAnimator2);
            }
        });
        return valueAnimator;
    }

    public final cuq a(int i, int i2, int i3, int i4) {
        if (this.c != 0) {
            if ((this.d == i && this.e == i2 && this.g == i3 && this.h == i4) ? false : true) {
                this.d = i;
                this.e = i2;
                this.g = i3;
                this.h = i4;
                ((ValueAnimator) this.c).setValues(a(false), a(true), b(false), b(true), c(false), c(true));
            }
        }
        return this;
    }

    private PropertyValuesHolder b(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.g;
            i2 = i / 2;
            str = "ANIMATION_RADIUS_REVERSE";
        } else {
            i2 = this.g;
            i = i2 / 2;
            str = "ANIMATION_RADIUS";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i2, i);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    private PropertyValuesHolder c(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.g;
            str = "ANIMATION_STROKE_REVERSE";
            i2 = 0;
        } else {
            str = "ANIMATION_STROKE";
            i2 = this.g;
            i = 0;
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i, i2);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    static /* synthetic */ void a(cuq cuqVar, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_RADIUS_REVERSE")).intValue();
        int intValue5 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE")).intValue();
        int intValue6 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_STROKE_REVERSE")).intValue();
        cuqVar.f.a = intValue;
        cuqVar.f.b = intValue2;
        cuqVar.f.c = intValue3;
        cuqVar.f.d = intValue4;
        cuqVar.f.e = intValue5;
        cuqVar.f.f = intValue6;
        if (cuqVar.b != null) {
            cuqVar.b.a(cuqVar.f);
        }
    }
}
