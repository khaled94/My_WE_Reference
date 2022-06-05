package defpackage;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.view.animation.Animation;
import android.view.animation.Interpolator;
import android.view.animation.OvershootInterpolator;
import android.view.animation.ScaleAnimation;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import co.kyash.targetinstructions.R;
import defpackage.q;
import java.lang.ref.WeakReference;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u001f\n\u0002\u0010\u0002\n\u0002\b\u0007\u0018\u00002\u00020\u0001:\u0001?B\u009f\u0001\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u0003\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\r\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u0010\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0012\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0014\u0012\b\b\u0002\u0010\u0015\u001a\u00020\u0010\u0012\u0006\u0010\u0016\u001a\u00020\u0017\u0012\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019¢\u0006\u0002\u0010\u001aJ\u0010\u00108\u001a\u0002092\u0006\u0010:\u001a\u00020\u0003H\u0002J\r\u0010;\u001a\u000209H\u0010¢\u0006\u0002\b<J\r\u0010=\u001a\u000209H\u0010¢\u0006\u0002\b>R\u0014\u0010\u000f\u001a\u00020\u0010X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u001b\u0010\u001cR\u001e\u0010\u0013\u001a\u0004\u0018\u00010\u0014X\u0096\u000e¢\u0006\u0010\n\u0002\u0010!\u001a\u0004\b\u001d\u0010\u001e\"\u0004\b\u001f\u0010 R\u001a\u0010\u0006\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\"\u0010#\"\u0004\b$\u0010%R\u0014\u0010\u000b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b&\u0010#R\u0014\u0010\b\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0014\u0010\n\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0014\u0010\t\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b)\u0010#R\u0014\u0010\u0007\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u001a\u0010\u0002\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b+\u0010#\"\u0004\b,\u0010%R\u0010\u0010\u0018\u001a\u0004\u0018\u00010\u0019X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0017X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\f\u001a\u00020\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b-\u0010.R\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u0012X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b/\u00100\"\u0004\b1\u00102R\u0016\u0010\u000e\u001a\u0004\u0018\u00010\rX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b3\u0010.R\u001a\u0010\u0004\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b4\u0010#\"\u0004\b5\u0010%R\u001a\u0010\u0005\u001a\u00020\u0003X\u0096\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u0010#\"\u0004\b7\u0010%¨\u0006@"}, d2 = {"Lco/kyash/targetinstructions/targets/SimpleTarget;", "Lco/kyash/targetinstructions/targets/Target;", "left", "", "top", "width", "height", "highlightRadius", "highlightPaddingLeft", "highlightPaddingTop", "highlightPaddingRight", "highlightPaddingBottom", "messageView", "Landroid/view/View;", "targetView", "delay", "", "positionType", "Lco/kyash/targetinstructions/targets/Target$Position;", "gravity", "", "messageAnimationDuration", "messageInterpolator", "Landroid/view/animation/Interpolator;", "listener", "Lco/kyash/targetinstructions/targets/Target$OnStateChangedListener;", "(FFFFFFFFFLandroid/view/View;Landroid/view/View;JLco/kyash/targetinstructions/targets/Target$Position;Ljava/lang/Integer;JLandroid/view/animation/Interpolator;Lco/kyash/targetinstructions/targets/Target$OnStateChangedListener;)V", "getDelay", "()J", "getGravity", "()Ljava/lang/Integer;", "setGravity", "(Ljava/lang/Integer;)V", "Ljava/lang/Integer;", "getHeight", "()F", "setHeight", "(F)V", "getHighlightPaddingBottom", "getHighlightPaddingLeft", "getHighlightPaddingRight", "getHighlightPaddingTop", "getHighlightRadius", "getLeft", "setLeft", "getMessageView", "()Landroid/view/View;", "getPositionType", "()Lco/kyash/targetinstructions/targets/Target$Position;", "setPositionType", "(Lco/kyash/targetinstructions/targets/Target$Position;)V", "getTargetView", "getTop", "setTop", "getWidth", "setWidth", "animateMessage", "", "pivotY", "hideImmediately", "hideImmediately$library_release", "showImmediately", "showImmediately$library_release", "Builder", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: p  reason: default package */
/* loaded from: classes2.dex */
public final class p extends q {
    float a;
    final float b;
    final View c;
    private float e;
    private float f;
    private float g;
    private final float h;
    private final float i;
    private final float j;
    private final float k;
    private final View l;
    private final long m;
    private q.b n;
    private Integer o;
    private final long p;
    private final Interpolator q;
    private final q.a r;

    @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
    /* renamed from: p$b */
    /* loaded from: classes2.dex */
    public /* synthetic */ class b {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[q.b.values().length];
            iArr[q.b.ABOVE.ordinal()] = 1;
            iArr[q.b.BELOW.ordinal()] = 2;
            $EnumSwitchMapping$0 = iArr;
        }
    }

    @Override // defpackage.q
    public final float a() {
        return this.e;
    }

    @Override // defpackage.q
    public final void a(float f) {
        this.e = f;
    }

    @Override // defpackage.q
    public final float b() {
        return this.a;
    }

    @Override // defpackage.q
    public final void b(float f) {
        this.a = f;
    }

    @Override // defpackage.q
    public final float c() {
        return this.f;
    }

    @Override // defpackage.q
    public final void c(float f) {
        this.f = f;
    }

    @Override // defpackage.q
    public final float d() {
        return this.g;
    }

    @Override // defpackage.q
    public final void d(float f) {
        this.g = f;
    }

    @Override // defpackage.q
    public final float e() {
        return this.h;
    }

    @Override // defpackage.q
    public final float f() {
        return this.i;
    }

    @Override // defpackage.q
    public final float g() {
        return this.b;
    }

    @Override // defpackage.q
    public final float h() {
        return this.j;
    }

    @Override // defpackage.q
    public final float i() {
        return this.k;
    }

    @Override // defpackage.q
    public final View j() {
        return this.c;
    }

    @Override // defpackage.q
    public final View k() {
        return this.l;
    }

    @Override // defpackage.q
    public final long l() {
        return this.m;
    }

    @Override // defpackage.q
    public final void a(q.b bVar) {
        this.n = bVar;
    }

    @Override // defpackage.q
    public final q.b m() {
        return this.n;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public p(float f, float f2, float f3, float f4, float f5, float f6, float f7, float f8, float f9, View view, View view2, long j, q.b bVar, Integer num, long j2, Interpolator interpolator, q.a aVar) {
        super(f, f2, f3, f4, f5, f6, f7, f8, f9, view, view2, j, bVar, num);
        dqc.d(view, "messageView");
        dqc.d(interpolator, "messageInterpolator");
        this.e = f;
        this.a = f2;
        this.f = f3;
        this.g = f4;
        this.h = f5;
        this.i = f6;
        this.b = f7;
        this.j = f8;
        this.k = f9;
        this.c = view;
        this.l = view2;
        this.m = j;
        this.n = bVar;
        this.o = num;
        this.p = j2;
        this.q = interpolator;
        this.r = aVar;
    }

    @Metadata(d1 = {"\u0000\u0011\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016¨\u0006\u0004"}, d2 = {"co/kyash/targetinstructions/targets/SimpleTarget$showImmediately$1", "Landroid/view/ViewTreeObserver$OnGlobalLayoutListener;", "onGlobalLayout", "", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: p$d */
    /* loaded from: classes2.dex */
    public static final class d implements ViewTreeObserver.OnGlobalLayoutListener {
        final /* synthetic */ ImageView b;
        final /* synthetic */ LinearLayout c;

        d(ImageView imageView, LinearLayout linearLayout) {
            this.b = imageView;
            this.c = linearLayout;
        }

        @Override // android.view.ViewTreeObserver.OnGlobalLayoutListener
        public final void onGlobalLayout() {
            p.this.c.getViewTreeObserver().removeOnGlobalLayoutListener(this);
            this.b.setX(p.this.q() - (this.b.getWidth() / 2));
            this.b.setVisibility(0);
            this.c.setY(((p.this.a - this.c.getHeight()) - p.this.b) - this.b.getHeight());
            p.this.e(this.c.getY());
        }
    }

    final void e(float f) {
        ScaleAnimation scaleAnimation = new ScaleAnimation(0.5f, 1.0f, 0.5f, 1.0f, 1, 0.5f, 0, f);
        scaleAnimation.setInterpolator(this.q);
        scaleAnimation.setRepeatCount(0);
        scaleAnimation.setDuration(this.p);
        scaleAnimation.setFillAfter(true);
        scaleAnimation.setAnimationListener(new c());
        this.c.startAnimation(scaleAnimation);
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\b"}, d2 = {"co/kyash/targetinstructions/targets/SimpleTarget$animateMessage$animation$1$1", "Landroid/view/animation/Animation$AnimationListener;", "onAnimationEnd", "", "animation", "Landroid/view/animation/Animation;", "onAnimationRepeat", "onAnimationStart", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: p$c */
    /* loaded from: classes2.dex */
    public static final class c implements Animation.AnimationListener {
        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationEnd(Animation animation) {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationRepeat(Animation animation) {
        }

        c() {
        }

        @Override // android.view.animation.Animation.AnimationListener
        public final void onAnimationStart(Animation animation) {
            p.this.c.setVisibility(0);
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\r\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\r\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00020\u0001B\r\u0012\u0006\u0010\u0003\u001a\u00020\u0004¢\u0006\u0002\u0010\u0005J\b\u0010\u0011\u001a\u00020\u0002H\u0016J\r\u0010\u0012\u001a\u00020\u0000H\u0010¢\u0006\u0002\b\u0013J\u000e\u0010\u0014\u001a\u00020\u00002\u0006\u0010\u0006\u001a\u00020\u0007J\u000e\u0010\u0015\u001a\u00020\u00002\u0006\u0010\b\u001a\u00020\tJ\u000e\u0010\u0016\u001a\u00020\u00002\u0006\u0010\u0017\u001a\u00020\u000bJ\u000e\u0010\u0018\u001a\u00020\u00002\u0006\u0010\u0019\u001a\u00020\rJ\u0010\u0010\u001a\u001a\u00020\u00002\b\b\u0001\u0010\u000e\u001a\u00020\u000fJ\u000e\u0010\u001b\u001a\u00020\u00002\u0006\u0010\u0010\u001a\u00020\u0007R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\u0012\u0010\u000e\u001a\u00020\u000f8\u0002@\u0002X\u0083\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0082.¢\u0006\u0002\n\u0000¨\u0006\u001c"}, d2 = {"Lco/kyash/targetinstructions/targets/SimpleTarget$Builder;", "Lco/kyash/targetinstructions/AbstractTargetBuilder;", "Lco/kyash/targetinstructions/targets/SimpleTarget;", "context", "Landroid/content/Context;", "(Landroid/content/Context;)V", "description", "", "listener", "Lco/kyash/targetinstructions/targets/Target$OnStateChangedListener;", "messageAnimationDuration", "", "messageInterpolator", "Landroid/view/animation/Interpolator;", "messageLayoutResId", "", "title", "build", "self", "self$library_release", "setDescription", "setListener", "setMessageAnimationDuration", TypedValues.Transition.S_DURATION, "setMessageInterpolator", "interpolator", "setMessageLayoutResId", "setTitle", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: p$a */
    /* loaded from: classes2.dex */
    public static final class a extends m<a, p> {
        private CharSequence o;
        private CharSequence p;
        private int q = R.layout.item_tutorial_layout;
        private long r = 300;
        private Interpolator s = new OvershootInterpolator();
        private q.a t;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(Context context) {
            super(context);
            dqc.d(context, "context");
        }

        @Override // defpackage.m
        public final /* bridge */ /* synthetic */ a a() {
            return this;
        }

        public final a a(CharSequence charSequence) {
            dqc.d(charSequence, "title");
            a aVar = this;
            aVar.o = charSequence;
            return aVar;
        }

        public final a b(CharSequence charSequence) {
            dqc.d(charSequence, "description");
            a aVar = this;
            aVar.p = charSequence;
            return aVar;
        }

        public final p b() {
            Context context = this.a.get();
            if (context == null) {
                throw new IllegalStateException("activity is null");
            }
            WeakReference<View> weakReference = this.b;
            View view = weakReference == null ? null : weakReference.get();
            View inflate = LayoutInflater.from(context).inflate(this.q, (ViewGroup) null);
            inflate.setLayoutParams(new FrameLayout.LayoutParams(-1, -2));
            TextView textView = (TextView) inflate.findViewById(R.id.title);
            CharSequence charSequence = this.o;
            if (charSequence == null) {
                dqc.a("title");
                throw null;
            }
            textView.setText(charSequence);
            TextView textView2 = (TextView) inflate.findViewById(R.id.description);
            CharSequence charSequence2 = this.p;
            if (charSequence2 == null) {
                dqc.a("description");
                throw null;
            }
            textView2.setText(charSequence2);
            float f = this.c;
            float f2 = this.d;
            float f3 = this.e;
            float f4 = this.f;
            float f5 = this.g;
            float f6 = this.h;
            float f7 = this.i;
            float f8 = this.j;
            float f9 = this.k;
            dqc.b(inflate, "messageView");
            return new p(f, f2, f3, f4, f5, f6, f7, f8, f9, inflate, view, this.n, this.l, this.m, this.r, this.s, this.t);
        }
    }

    @Override // defpackage.q
    public final void n() {
        LinearLayout linearLayout = (LinearLayout) this.c.findViewById(R.id.container);
        ImageView imageView = (ImageView) linearLayout.findViewById(R.id.top_caret);
        ImageView imageView2 = (ImageView) linearLayout.findViewById(R.id.bottom_caret);
        Integer num = this.o;
        dqc.a(num);
        linearLayout.setGravity(num.intValue());
        q.b bVar = this.n;
        int i = bVar == null ? -1 : b.$EnumSwitchMapping$0[bVar.ordinal()];
        if (i != 1) {
            if (i != 2) {
                return;
            }
            imageView.setX(q() - (imageView.getWidth() / 2));
            imageView.setVisibility(0);
            linearLayout.setY(this.a + this.g + this.k + imageView2.getHeight());
            e(linearLayout.getY());
        } else if (linearLayout.getHeight() > 0) {
            imageView2.setX(q() - (imageView2.getWidth() / 2));
            imageView2.setVisibility(0);
            linearLayout.setY(((this.a - linearLayout.getHeight()) - this.b) - imageView2.getHeight());
            e(linearLayout.getY());
        } else {
            this.c.getViewTreeObserver().addOnGlobalLayoutListener(new d(imageView2, linearLayout));
        }
    }
}
