package defpackage;

import android.animation.Animator;
import android.animation.ObjectAnimator;
import android.animation.TimeInterpolator;
import android.app.Activity;
import android.os.Handler;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.FrameLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.content.ContextCompat;
import co.kyash.targetinstructions.R;
import defpackage.n;
import defpackage.p;
import java.util.ArrayList;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010 \n\u0002\b\u0007\u0018\u0000 <2\u00020\u0001:\u0001<B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0006\u0010.\u001a\u00020\u0010J\b\u0010/\u001a\u00020\u0010H\u0002J\u0006\u00100\u001a\u00020\u0010J\u0006\u00101\u001a\u00020\u0010J\u000e\u00102\u001a\u00020\u00002\u0006\u0010\n\u001a\u00020\u000bJ\u000e\u00103\u001a\u00020\u00002\u0006\u0010\f\u001a\u00020\rJ\u0010\u00104\u001a\u00020\u00002\b\b\u0001\u0010\u001d\u001a\u00020\u0007J\u0014\u00105\u001a\u00020\u00002\f\u0010*\u001a\b\u0012\u0004\u0012\u00020\t06J\u0006\u00107\u001a\u00020\u0010J\u0006\u00108\u001a\u00020\u0010J\u0006\u00109\u001a\u00020\u0010J\b\u0010:\u001a\u00020\u0010H\u0002J\u0006\u0010;\u001a\u00020\u0010R\u000e\u0010\u0005\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0010\u0010\b\u001a\u0004\u0018\u00010\tX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082\u000e¢\u0006\u0002\n\u0000R\"\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\u0010\u0018\u00010\u000fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u0012\"\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0015\u001a\u00020\u0016X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\u000e\u0010\u001b\u001a\u00020\u001cX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000R\u0011\u0010\u001e\u001a\u00020\u001f¢\u0006\b\n\u0000\u001a\u0004\b \u0010!RC\u0010\"\u001a+\u0012\u0013\u0012\u00110\t¢\u0006\f\b$\u0012\b\b%\u0012\u0004\b\b(\b\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00100\u000f\u0012\u0004\u0012\u00020\u0010\u0018\u00010#X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b&\u0010'\"\u0004\b(\u0010)R\u001e\u0010*\u001a\u0012\u0012\u0004\u0012\u00020\t0+j\b\u0012\u0004\u0012\u00020\t`,X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010-\u001a\u00020\u0007X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006="}, d2 = {"Lco/kyash/targetinstructions/TargetInstructions;", "", "activity", "Landroid/app/Activity;", "(Landroid/app/Activity;)V", "activityWeakReference", "currentPosition", "", "currentTarget", "Lco/kyash/targetinstructions/targets/Target;", "fadeDuration", "", "fadeInterpolator", "Landroid/animation/TimeInterpolator;", "finishCallbackListener", "Lkotlin/Function0;", "", "getFinishCallbackListener", "()Lkotlin/jvm/functions/Function0;", "setFinishCallbackListener", "(Lkotlin/jvm/functions/Function0;)V", "handler", "Landroid/os/Handler;", "getHandler", "()Landroid/os/Handler;", "setHandler", "(Landroid/os/Handler;)V", "instructionsViewWeakReference", "Lco/kyash/targetinstructions/InstructionsView;", "overlayColorResId", "target1", "Lco/kyash/targetinstructions/targets/SimpleTarget;", "getTarget1", "()Lco/kyash/targetinstructions/targets/SimpleTarget;", "targetCallbackListener", "Lkotlin/Function2;", "Lkotlin/ParameterName;", "name", "getTargetCallbackListener", "()Lkotlin/jvm/functions/Function2;", "setTargetCallbackListener", "(Lkotlin/jvm/functions/Function2;)V", "targets", "Ljava/util/ArrayList;", "Lkotlin/collections/ArrayList;", "targetsSize", "finish", "finishInstruction", "hideCurrentTarget", "removeViews", "setFadeDuration", "setFadeInterpolator", "setOverlayColorResId", "setTargets", "", "showCurrentTarget", "showNextTarget", "start", "startInstruction", "updateAll", "Companion", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* renamed from: o  reason: default package */
/* loaded from: classes2.dex */
public final class o {
    public static final a a = new a((byte) 0);
    private static final int o = R.color.default_cover;
    private static final TimeInterpolator p = new DecelerateInterpolator();
    public final n b;
    public final Activity c;
    public int e;
    public dph<? super q, ? super dov<dmg>, dmg> f;
    public dov<dmg> g;
    public final p h;
    private q m;
    public ArrayList<q> d = new ArrayList<>();
    private long i = 300;
    private TimeInterpolator j = p;
    private int k = o;
    private int l = 1;
    private Handler n = new Handler();

    public o(Activity activity) {
        dqc.d(activity, "activity");
        this.c = activity;
        Activity activity2 = activity;
        this.h = new p.a(activity2).a("Floating Action Button").b("This is the floating action button.").b();
        View decorView = activity.getWindow().getDecorView();
        dqc.b(decorView, "activity.window.decorView");
        n nVar = new n(activity2, (byte) 0);
        nVar.setOverlayColor$library_release(ContextCompat.getColor(nVar.getContext(), this.k));
        nVar.setLayoutParams(new FrameLayout.LayoutParams(-1, -1));
        nVar.setListener$library_release(new c());
        this.b = nVar;
        ((ViewGroup) decorView).addView(nVar);
    }

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u000e\u0010\u000b\u001a\u00020\f2\u0006\u0010\r\u001a\u00020\u000eR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0007\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0004X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u000f"}, d2 = {"Lco/kyash/targetinstructions/TargetInstructions$Companion;", "", "()V", "DEFAULT_FADE_DURATION", "", "DEFAULT_FADE_INTERPOLATOR", "Landroid/animation/TimeInterpolator;", "DEFAULT_OVERLAY_COLOR", "", "INSTRUCTIONS_DURATION", "lastClickTime", "with", "Lco/kyash/targetinstructions/TargetInstructions;", "activity", "Landroid/app/Activity;", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: o$a */
    /* loaded from: classes2.dex */
    public static final class a {
        public /* synthetic */ a(byte b) {
            this();
        }

        private a() {
        }
    }

    @Metadata(d1 = {"\u0000\u0013\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\b\u0010\u0002\u001a\u00020\u0003H\u0016J\b\u0010\u0004\u001a\u00020\u0003H\u0016J\b\u0010\u0005\u001a\u00020\u0003H\u0016J\b\u0010\u0006\u001a\u00020\u0003H\u0017¨\u0006\u0007"}, d2 = {"co/kyash/targetinstructions/TargetInstructions$instructionsView$1$1", "Lco/kyash/targetinstructions/InstructionsView$OnStateChangedListener;", "onNextClick", "", "onSkipClick", "onTargetClicked", "onTargetClosed", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: o$c */
    /* loaded from: classes2.dex */
    public static final class c implements n.a {
        c() {
        }

        @Override // defpackage.n.a
        public final void a() {
            o oVar;
            dph<? super q, ? super dov<dmg>, dmg> dphVar;
            if (!o.this.d.isEmpty()) {
                StringBuilder sb = new StringBuilder();
                sb.append(o.this.l);
                sb.append(" -> ");
                sb.append(o.this.e);
                o oVar2 = o.this;
                oVar2.l++;
                int unused = oVar2.l;
                o.this.d.remove(0);
                if (!o.this.d.isEmpty()) {
                    TextView textView = (TextView) ((q) o.this.d.get(0)).j().findViewById(R.id.tvCount);
                    StringBuilder sb2 = new StringBuilder();
                    Activity activity = o.this.c;
                    String str = null;
                    sb2.append((Object) (activity == null ? null : activity.getString(R.string.step)));
                    sb2.append(' ');
                    sb2.append(o.this.l - 1);
                    sb2.append(" / ");
                    sb2.append(o.this.e - 1);
                    textView.setText(sb2.toString());
                    if (o.this.l == o.this.e) {
                        TextView textView2 = (TextView) ((q) o.this.d.get(0)).j().findViewById(R.id.btnOk);
                        Activity activity2 = o.this.c;
                        if (activity2 != null) {
                            str = activity2.getString(R.string.finish);
                        }
                        textView2.setText(String.valueOf(str));
                        ((TextView) ((q) o.this.d.get(0)).j().findViewById(R.id.btnSkip)).setVisibility(8);
                    }
                    q qVar = o.this.m;
                    if (qVar == null || (dphVar = (oVar = o.this).f) == null) {
                        return;
                    }
                    dphVar.invoke(qVar, new a(oVar));
                    return;
                }
                o.g(o.this);
            }
        }

        @Override // defpackage.n.a
        public final void b() {
            o oVar = o.this;
            if (!oVar.d.isEmpty()) {
                if (oVar.b != null) {
                    n.a(oVar.d);
                }
                q qVar = oVar.d.get(0);
                dqc.b(qVar, "targets[0]");
                q qVar2 = qVar;
                n nVar = oVar.b;
                if (nVar == null) {
                    return;
                }
                dqc.d(qVar2, TypedValues.Attributes.S_TARGET);
                n.a aVar = nVar.b;
                if (aVar == null) {
                    return;
                }
                aVar.a();
            }
        }

        @Override // defpackage.n.a
        public final void c() {
            o.g(o.this);
        }

        @Metadata(k = 3, mv = {1, 5, 1}, xi = 48)
        /* renamed from: o$c$a */
        /* loaded from: classes2.dex */
        /* synthetic */ class a extends dqa implements dov<dmg> {
            a(o oVar) {
                super(0, oVar, o.class, "showNextTarget", "showNextTarget()V", 0);
            }

            @Override // defpackage.dov
            public final /* synthetic */ dmg invoke() {
                ((o) this.receiver).a();
                return dmg.a;
            }
        }
    }

    public final void a() {
        if (!this.d.isEmpty()) {
            if (this.b != null) {
                n.a(this.d);
            }
            this.m = this.d.get(0);
            n nVar = this.b;
            if (nVar == null) {
                return;
            }
            q qVar = this.d.get(0);
            dqc.b(qVar, "targets[0]");
            nVar.a(qVar);
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"co/kyash/targetinstructions/TargetInstructions$startInstruction$1$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: o$d */
    /* loaded from: classes2.dex */
    public static final class d implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        public d() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            if (o.this.b != null) {
                n.a(o.this.d);
            }
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
            if (o.this.b != null) {
                n.a(o.this.d);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0019\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\u0007\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016J\u0012\u0010\b\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H\u0016¨\u0006\t"}, d2 = {"co/kyash/targetinstructions/TargetInstructions$finishInstruction$1$1", "Landroid/animation/Animator$AnimatorListener;", "onAnimationCancel", "", "animation", "Landroid/animation/Animator;", "onAnimationEnd", "onAnimationRepeat", "onAnimationStart", "library_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
    /* renamed from: o$b */
    /* loaded from: classes2.dex */
    public static final class b implements Animator.AnimatorListener {
        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationCancel(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationRepeat(Animator animator) {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationStart(Animator animator) {
        }

        b() {
        }

        @Override // android.animation.Animator.AnimatorListener
        public final void onAnimationEnd(Animator animator) {
            o oVar = o.this;
            Activity activity = oVar.c;
            if (activity != null) {
                View decorView = activity.getWindow().getDecorView();
                dqc.b(decorView, "activity.window.decorView");
                ((ViewGroup) decorView).removeView(oVar.b);
            }
        }
    }

    public static final /* synthetic */ void g(o oVar) {
        dov<dmg> dovVar = oVar.g;
        if (dovVar != null) {
            dovVar.invoke();
        }
        ObjectAnimator ofFloat = ObjectAnimator.ofFloat(oVar.b, "alpha", 1.0f, 0.0f);
        ofFloat.setDuration(300L);
        ofFloat.addListener(new b());
        ofFloat.start();
    }
}
