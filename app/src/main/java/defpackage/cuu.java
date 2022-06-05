package defpackage;

import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.cuc;
import defpackage.cuv;

/* renamed from: cuu  reason: default package */
/* loaded from: classes2.dex */
public final class cuu extends cuv {
    private cuk j = new cuk();

    public cuu(cuc.a aVar) {
        super(aVar);
    }

    @Override // defpackage.cuv
    public final cuv a(int i, int i2, int i3, boolean z) {
        if (b(i, i2, i3, z)) {
            this.c = d();
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = z;
            int i4 = i3 * 2;
            this.h = i - i3;
            this.i = i + i3;
            this.j.b = this.h;
            this.j.c = this.i;
            this.j.a = i4;
            cuv.a a = a(z);
            long j = (long) (this.a * 0.8d);
            long j2 = (long) (this.a * 0.2d);
            long j3 = (long) (this.a * 0.5d);
            long j4 = (long) (this.a * 0.5d);
            ValueAnimator a2 = a(a.a, a.b, j, false, this.j);
            ValueAnimator a3 = a(a.c, a.d, j, true, this.j);
            a3.setStartDelay(j2);
            ValueAnimator a4 = a(i4, i3, j3);
            ValueAnimator a5 = a(i3, i4, j3);
            a5.setStartDelay(j4);
            ((AnimatorSet) this.c).playTogether(a2, a3, a4, a5);
        }
        return this;
    }

    private ValueAnimator a(int i, int i2, long j) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cuu.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                cuu.a(cuu.this, valueAnimator);
            }
        });
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: c */
    public cuu b(float f) {
        if (this.c != 0) {
            long j = f * ((float) this.a);
            int size = ((AnimatorSet) this.c).getChildAnimations().size();
            for (int i = 0; i < size; i++) {
                ValueAnimator valueAnimator = (ValueAnimator) ((AnimatorSet) this.c).getChildAnimations().get(i);
                long startDelay = j - valueAnimator.getStartDelay();
                long duration = valueAnimator.getDuration();
                if (startDelay > duration) {
                    startDelay = duration;
                } else if (startDelay < 0) {
                    startDelay = 0;
                }
                if ((i != size - 1 || startDelay > 0) && valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                    valueAnimator.setCurrentPlayTime(startDelay);
                }
            }
        }
        return this;
    }

    @Override // defpackage.cuv
    public final /* bridge */ /* synthetic */ cuv b(long j) {
        super.a(j);
        return this;
    }

    @Override // defpackage.cuv, defpackage.cun
    public final /* synthetic */ cun a(long j) {
        super.a(j);
        return this;
    }

    static /* synthetic */ void a(cuu cuuVar, ValueAnimator valueAnimator) {
        cuuVar.j.a = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (cuuVar.b != null) {
            cuuVar.b.a(cuuVar.j);
        }
    }
}
