package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.cuc;

/* renamed from: cur  reason: default package */
/* loaded from: classes2.dex */
public final class cur extends cuo {
    private int f;
    private float g;
    private cuh h = new cuh();

    public cur(cuc.a aVar) {
        super(aVar);
    }

    @Override // defpackage.cuo
    /* renamed from: d */
    public final ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cur.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                cur.a(cur.this, valueAnimator2);
            }
        });
        return valueAnimator;
    }

    public final cur a(int i, int i2, int i3, float f) {
        if (this.c != 0) {
            if ((this.d == i && this.e == i2 && this.f == i3 && this.g == f) ? false : true) {
                this.d = i;
                this.e = i2;
                this.f = i3;
                this.g = f;
                ((ValueAnimator) this.c).setValues(a(false), a(true), b(false), b(true));
            }
        }
        return this;
    }

    private PropertyValuesHolder b(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.f;
            i2 = (int) (i * this.g);
            str = "ANIMATION_SCALE_REVERSE";
        } else {
            i2 = this.f;
            i = (int) (i2 * this.g);
            str = "ANIMATION_SCALE";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i, i2);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
    }

    static /* synthetic */ void a(cur curVar, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        int intValue3 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE")).intValue();
        int intValue4 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_SCALE_REVERSE")).intValue();
        curVar.h.a = intValue;
        curVar.h.b = intValue2;
        curVar.h.c = intValue3;
        curVar.h.d = intValue4;
        if (curVar.b != null) {
            curVar.b.a(curVar.h);
        }
    }
}
