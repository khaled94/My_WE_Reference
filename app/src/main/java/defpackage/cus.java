package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.cuc;

/* renamed from: cus  reason: default package */
/* loaded from: classes2.dex */
public final class cus extends cun<ValueAnimator> {
    private int e = -1;
    private int f = -1;
    private cui d = new cui();

    public cus(cuc.a aVar) {
        super(aVar);
    }

    public final cus a(int i, int i2) {
        if (this.c != 0) {
            if ((this.e == i && this.f == i2) ? false : true) {
                this.e = i;
                this.f = i2;
                PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt("ANIMATION_COORDINATE", i, i2);
                ofInt.setEvaluator(new IntEvaluator());
                ((ValueAnimator) this.c).setValues(ofInt);
            }
        }
        return this;
    }

    @Override // defpackage.cun
    public final /* synthetic */ cun a(float f) {
        if (this.c != 0) {
            long j = f * ((float) this.a);
            if (((ValueAnimator) this.c).getValues() != null && ((ValueAnimator) this.c).getValues().length > 0) {
                ((ValueAnimator) this.c).setCurrentPlayTime(j);
            }
        }
        return this;
    }

    @Override // defpackage.cun
    public final /* synthetic */ ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cus.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                cus.a(cus.this, valueAnimator2);
            }
        });
        return valueAnimator;
    }

    static /* synthetic */ void a(cus cusVar, ValueAnimator valueAnimator) {
        cusVar.d.a = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        if (cusVar.b != null) {
            cusVar.b.a(cusVar.d);
        }
    }
}
