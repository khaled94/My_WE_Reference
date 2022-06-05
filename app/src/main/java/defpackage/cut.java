package defpackage;

import android.animation.IntEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.cuc;

/* renamed from: cut  reason: default package */
/* loaded from: classes2.dex */
public final class cut extends cun<ValueAnimator> {
    private int d = -1;
    private int e = -1;
    private cuj f = new cuj();

    public cut(cuc.a aVar) {
        super(aVar);
    }

    public final cut a(int i, int i2) {
        if (this.c != 0) {
            if ((this.d == i && this.e == i2) ? false : true) {
                this.d = i;
                this.e = i2;
                ((ValueAnimator) this.c).setValues(a("ANIMATION_COORDINATE", i, i2), a("ANIMATION_COORDINATE_REVERSE", i2, i));
            }
        }
        return this;
    }

    private static PropertyValuesHolder a(String str, int i, int i2) {
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i, i2);
        ofInt.setEvaluator(new IntEvaluator());
        return ofInt;
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
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cut.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                cut.a(cut.this, valueAnimator2);
            }
        });
        return valueAnimator;
    }

    static /* synthetic */ void a(cut cutVar, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COORDINATE_REVERSE")).intValue();
        cutVar.f.a = intValue;
        cutVar.f.b = intValue2;
        if (cutVar.b != null) {
            cutVar.b.a(cutVar.f);
        }
    }
}
