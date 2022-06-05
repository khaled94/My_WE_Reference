package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.cuc;
import java.util.Iterator;

/* renamed from: cuv  reason: default package */
/* loaded from: classes2.dex */
public class cuv extends cun<AnimatorSet> {
    int d;
    int e;
    int f;
    boolean g;
    int h;
    int i;
    private cul j = new cul();

    @Override // defpackage.cun
    public final /* synthetic */ AnimatorSet a() {
        return d();
    }

    public cuv(cuc.a aVar) {
        super(aVar);
    }

    public static AnimatorSet d() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    /* renamed from: b */
    public cuv a(long j) {
        super.a(j);
        return this;
    }

    public cuv a(int i, int i2, int i3, boolean z) {
        if (b(i, i2, i3, z)) {
            this.c = d();
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = z;
            int i4 = i - i3;
            this.h = i4;
            this.i = i + i3;
            this.j.b = i4;
            this.j.c = this.i;
            a a2 = a(z);
            long j = this.a / 2;
            ((AnimatorSet) this.c).playSequentially(a(a2.a, a2.b, j, false, this.j), a(a2.c, a2.d, j, true, this.j));
        }
        return this;
    }

    /* renamed from: b */
    public cuv a(float f) {
        if (this.c == 0) {
            return this;
        }
        long j = f * ((float) this.a);
        Iterator<Animator> it = ((AnimatorSet) this.c).getChildAnimations().iterator();
        while (it.hasNext()) {
            ValueAnimator valueAnimator = (ValueAnimator) it.next();
            long duration = valueAnimator.getDuration();
            if (j <= duration) {
                duration = j;
            }
            valueAnimator.setCurrentPlayTime(duration);
            j -= duration;
        }
        return this;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final ValueAnimator a(int i, int i2, long j, final boolean z, final cul culVar) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cuv.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                cuv.a(cuv.this, culVar, valueAnimator, z);
            }
        });
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final boolean b(int i, int i2, int i3, boolean z) {
        return (this.d == i && this.e == i2 && this.f == i3 && this.g == z) ? false : true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final a a(boolean z) {
        int i;
        int i2;
        int i3;
        int i4;
        if (z) {
            int i5 = this.d;
            int i6 = this.f;
            i4 = i5 + i6;
            int i7 = this.e;
            i2 = i7 + i6;
            i = i5 - i6;
            i3 = i7 - i6;
        } else {
            int i8 = this.d;
            int i9 = this.f;
            i4 = i8 - i9;
            int i10 = this.e;
            i2 = i10 - i9;
            i = i8 + i9;
            i3 = i10 + i9;
        }
        return new a(i4, i2, i, i3);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cuv$a */
    /* loaded from: classes2.dex */
    public class a {
        final int a;
        final int b;
        final int c;
        final int d;

        a(int i, int i2, int i3, int i4) {
            this.a = i;
            this.b = i2;
            this.c = i3;
            this.d = i4;
        }
    }

    static /* synthetic */ void a(cuv cuvVar, cul culVar, ValueAnimator valueAnimator, boolean z) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        if (cuvVar.g) {
            if (z) {
                culVar.b = intValue;
            }
            culVar.c = intValue;
        } else {
            if (!z) {
                culVar.b = intValue;
            }
            culVar.c = intValue;
        }
        if (cuvVar.b != null) {
            cuvVar.b.a(culVar);
        }
    }
}
