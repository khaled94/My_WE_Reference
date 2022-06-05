package defpackage;

import android.animation.Animator;
import android.animation.AnimatorSet;
import android.animation.ValueAnimator;
import android.view.animation.AccelerateDecelerateInterpolator;
import defpackage.cuc;
import java.util.Iterator;

/* renamed from: cup  reason: default package */
/* loaded from: classes2.dex */
public final class cup extends cun<AnimatorSet> {
    private int d;
    private int e;
    private int f;
    private int g;
    private int h;
    private cuf i = new cuf();

    @Override // defpackage.cun
    public final /* synthetic */ AnimatorSet a() {
        return d();
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier removed */
    /* renamed from: cup$a */
    /* loaded from: classes2.dex */
    static final class a extends Enum<a> {
        public static final int a = 1;
        public static final int b = 2;
        public static final int c = 3;
        private static final /* synthetic */ int[] d = {1, 2, 3};

        public static int[] a() {
            return (int[]) d.clone();
        }
    }

    public cup(cuc.a aVar) {
        super(aVar);
    }

    private static AnimatorSet d() {
        AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setInterpolator(new AccelerateDecelerateInterpolator());
        return animatorSet;
    }

    public final cup b(long j) {
        super.a(j);
        return this;
    }

    private ValueAnimator a(int i, int i2, long j, final int i3) {
        ValueAnimator ofInt = ValueAnimator.ofInt(i, i2);
        ofInt.setInterpolator(new AccelerateDecelerateInterpolator());
        ofInt.setDuration(j);
        ofInt.addUpdateListener(new ValueAnimator.AnimatorUpdateListener() { // from class: cup.1
            @Override // android.animation.ValueAnimator.AnimatorUpdateListener
            public final void onAnimationUpdate(ValueAnimator valueAnimator) {
                cup.a(cup.this, valueAnimator, i3);
            }
        });
        return ofInt;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    /* renamed from: cup$2  reason: invalid class name */
    /* loaded from: classes2.dex */
    public static /* synthetic */ class AnonymousClass2 {
        static final /* synthetic */ int[] a;

        static {
            int[] iArr = new int[a.a().length];
            a = iArr;
            try {
                iArr[a.a - 1] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                a[a.b - 1] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                a[a.c - 1] = 3;
            } catch (NoSuchFieldError unused3) {
            }
        }
    }

    public final cup a(int i, int i2, int i3, int i4, int i5) {
        boolean z = true;
        if (this.d == i && this.e == i2 && this.f == i3 && this.g == i4 && this.h == i5) {
            z = false;
        }
        if (z) {
            this.c = d();
            this.d = i;
            this.e = i2;
            this.f = i3;
            this.g = i4;
            this.h = i5;
            int i6 = (int) (i5 / 1.5d);
            long j = this.a / 2;
            ValueAnimator a2 = a(i, i2, this.a, a.a);
            ValueAnimator a3 = a(i3, i4, j, a.b);
            ValueAnimator a4 = a(i5, i6, j, a.c);
            ValueAnimator a5 = a(i4, i3, j, a.b);
            ((AnimatorSet) this.c).play(a3).with(a4).with(a2).before(a5).before(a(i6, i5, j, a.c));
        }
        return this;
    }

    @Override // defpackage.cun
    public final /* bridge */ /* synthetic */ cun a(long j) {
        super.a(j);
        return this;
    }

    @Override // defpackage.cun
    public final /* synthetic */ cun a(float f) {
        if (this.c != 0) {
            long j = f * ((float) this.a);
            boolean z = false;
            Iterator<Animator> it = ((AnimatorSet) this.c).getChildAnimations().iterator();
            while (it.hasNext()) {
                ValueAnimator valueAnimator = (ValueAnimator) it.next();
                long duration = valueAnimator.getDuration();
                long j2 = z ? j - duration : j;
                if (j2 >= 0) {
                    if (j2 >= duration) {
                        j2 = duration;
                    }
                    if (valueAnimator.getValues() != null && valueAnimator.getValues().length > 0) {
                        valueAnimator.setCurrentPlayTime(j2);
                    }
                    if (!z && duration >= this.a) {
                        z = true;
                    }
                }
            }
        }
        return this;
    }

    static /* synthetic */ void a(cup cupVar, ValueAnimator valueAnimator, int i) {
        int intValue = ((Integer) valueAnimator.getAnimatedValue()).intValue();
        int i2 = AnonymousClass2.a[i - 1];
        if (i2 == 1) {
            cupVar.i.a = intValue;
        } else if (i2 == 2) {
            cupVar.i.b = intValue;
        } else if (i2 == 3) {
            cupVar.i.c = intValue;
        }
        if (cupVar.b != null) {
            cupVar.b.a(cupVar.i);
        }
    }
}
