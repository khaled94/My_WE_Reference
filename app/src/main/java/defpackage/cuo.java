package defpackage;

import android.animation.ArgbEvaluator;
import android.animation.PropertyValuesHolder;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.cuc;

/* renamed from: cuo  reason: default package */
/* loaded from: classes2.dex */
public class cuo extends cun<ValueAnimator> {
    int d;
    int e;
    private cue f = new cue();

    public cuo(cuc.a aVar) {
        super(aVar);
    }

    /* renamed from: d */
    public ValueAnimator a() {
        ValueAnimator valueAnimator = new ValueAnimator();
        valueAnimator.setDuration(350L);
        valueAnimator.setInterpolator(new AccelerateDecelerateInterpolator());
        valueAnimator.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cuo.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator2) {
                cuo.a(cuo.this, valueAnimator2);
            }
        });
        return valueAnimator;
    }

    public final cuo a(int i, int i2) {
        if (this.c != 0) {
            if ((this.d == i && this.e == i2) ? false : true) {
                this.d = i;
                this.e = i2;
                ((ValueAnimator) this.c).setValues(a(false), a(true));
            }
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final PropertyValuesHolder a(boolean z) {
        int i;
        String str;
        int i2;
        if (z) {
            i = this.e;
            i2 = this.d;
            str = "ANIMATION_COLOR_REVERSE";
        } else {
            i = this.d;
            i2 = this.e;
            str = "ANIMATION_COLOR";
        }
        PropertyValuesHolder ofInt = PropertyValuesHolder.ofInt(str, i, i2);
        ofInt.setEvaluator(new ArgbEvaluator());
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

    static /* synthetic */ void a(cuo cuoVar, ValueAnimator valueAnimator) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR")).intValue();
        int intValue2 = ((Integer) valueAnimator.getAnimatedValue("ANIMATION_COLOR_REVERSE")).intValue();
        cuoVar.f.a = intValue;
        cuoVar.f.b = intValue2;
        if (cuoVar.b != null) {
            cuoVar.b.a(cuoVar.f);
        }
    }
}
