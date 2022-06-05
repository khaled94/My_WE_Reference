package androidx.core.animation;

import android.animation.Animator;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000(\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\u001a¤\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u001aZ\u0010\f\u001a\u00020\r*\u00020\u00022#\b\u0006\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0010\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u001a5\u0010\u0012\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u001a5\u0010\u0013\u001a\u00020\r*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0014\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u001a5\u0010\u0015\u001a\u00020\r*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0016\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u0011\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0086\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0017"}, d2 = {"addListener", "Landroid/animation/Animator$AnimatorListener;", "Landroid/animation/Animator;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "animator", "", "onStart", "onCancel", "onRepeat", "addPauseListener", "Landroid/animation/Animator$AnimatorPauseListener;", "onResume", "onPause", "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnRepeat", "doOnResume", "doOnStart", "core-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class AnimatorKt {
    public static /* synthetic */ Animator.AnimatorListener addListener$default(Animator animator, dow dowVar, dow dowVar2, dow dowVar3, dow dowVar4, int i, Object obj) {
        if ((i & 1) != 0) {
            dowVar = AnimatorKt$addListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            dowVar2 = AnimatorKt$addListener$2.INSTANCE;
        }
        if ((i & 4) != 0) {
            dowVar3 = AnimatorKt$addListener$3.INSTANCE;
        }
        if ((i & 8) != 0) {
            dowVar4 = AnimatorKt$addListener$4.INSTANCE;
        }
        dqc.d(animator, "<this>");
        dqc.d(dowVar, "onEnd");
        dqc.d(dowVar2, "onStart");
        dqc.d(dowVar3, "onCancel");
        dqc.d(dowVar4, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(dowVar4, dowVar, dowVar3, dowVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static final Animator.AnimatorListener addListener(Animator animator, dow<? super Animator, dmg> dowVar, dow<? super Animator, dmg> dowVar2, dow<? super Animator, dmg> dowVar3, dow<? super Animator, dmg> dowVar4) {
        dqc.d(animator, "<this>");
        dqc.d(dowVar, "onEnd");
        dqc.d(dowVar2, "onStart");
        dqc.d(dowVar3, "onCancel");
        dqc.d(dowVar4, "onRepeat");
        AnimatorKt$addListener$listener$1 animatorKt$addListener$listener$1 = new AnimatorKt$addListener$listener$1(dowVar4, dowVar, dowVar3, dowVar2);
        animator.addListener(animatorKt$addListener$listener$1);
        return animatorKt$addListener$listener$1;
    }

    public static /* synthetic */ Animator.AnimatorPauseListener addPauseListener$default(Animator animator, dow dowVar, dow dowVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            dowVar = AnimatorKt$addPauseListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            dowVar2 = AnimatorKt$addPauseListener$2.INSTANCE;
        }
        dqc.d(animator, "<this>");
        dqc.d(dowVar, "onResume");
        dqc.d(dowVar2, "onPause");
        AnimatorKt$addPauseListener$listener$1 animatorKt$addPauseListener$listener$1 = new AnimatorKt$addPauseListener$listener$1(dowVar2, dowVar);
        animator.addPauseListener(animatorKt$addPauseListener$listener$1);
        return animatorKt$addPauseListener$listener$1;
    }

    public static final Animator.AnimatorPauseListener addPauseListener(Animator animator, dow<? super Animator, dmg> dowVar, dow<? super Animator, dmg> dowVar2) {
        dqc.d(animator, "<this>");
        dqc.d(dowVar, "onResume");
        dqc.d(dowVar2, "onPause");
        AnimatorKt$addPauseListener$listener$1 animatorKt$addPauseListener$listener$1 = new AnimatorKt$addPauseListener$listener$1(dowVar2, dowVar);
        animator.addPauseListener(animatorKt$addPauseListener$listener$1);
        return animatorKt$addPauseListener$listener$1;
    }

    public static final Animator.AnimatorListener doOnEnd(Animator animator, final dow<? super Animator, dmg> dowVar) {
        dqc.d(animator, "<this>");
        dqc.d(dowVar, "action");
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                dqc.d(animator2, "animator");
                dow.this.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnStart(Animator animator, final dow<? super Animator, dmg> dowVar) {
        dqc.d(animator, "<this>");
        dqc.d(dowVar, "action");
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnStart$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator2) {
                dqc.d(animator2, "animator");
                dow.this.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnCancel(Animator animator, final dow<? super Animator, dmg> dowVar) {
        dqc.d(animator, "<this>");
        dqc.d(dowVar, "action");
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator2) {
                dqc.d(animator2, "animator");
                dow.this.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorListener doOnRepeat(Animator animator, final dow<? super Animator, dmg> dowVar) {
        dqc.d(animator, "<this>");
        dqc.d(dowVar, "action");
        Animator.AnimatorListener animatorListener = new Animator.AnimatorListener() { // from class: androidx.core.animation.AnimatorKt$doOnRepeat$$inlined$addListener$default$1
            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationCancel(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationEnd(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationStart(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorListener
            public final void onAnimationRepeat(Animator animator2) {
                dqc.d(animator2, "animator");
                dow.this.invoke(animator2);
            }
        };
        animator.addListener(animatorListener);
        return animatorListener;
    }

    public static final Animator.AnimatorPauseListener doOnResume(Animator animator, final dow<? super Animator, dmg> dowVar) {
        dqc.d(animator, "<this>");
        dqc.d(dowVar, "action");
        Animator.AnimatorPauseListener animatorPauseListener = new Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$doOnResume$$inlined$addPauseListener$default$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public final void onAnimationPause(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public final void onAnimationResume(Animator animator2) {
                dqc.d(animator2, "animator");
                dow.this.invoke(animator2);
            }
        };
        animator.addPauseListener(animatorPauseListener);
        return animatorPauseListener;
    }

    public static final Animator.AnimatorPauseListener doOnPause(Animator animator, final dow<? super Animator, dmg> dowVar) {
        dqc.d(animator, "<this>");
        dqc.d(dowVar, "action");
        Animator.AnimatorPauseListener animatorPauseListener = new Animator.AnimatorPauseListener() { // from class: androidx.core.animation.AnimatorKt$doOnPause$$inlined$addPauseListener$default$1
            @Override // android.animation.Animator.AnimatorPauseListener
            public final void onAnimationResume(Animator animator2) {
                dqc.d(animator2, "animator");
            }

            @Override // android.animation.Animator.AnimatorPauseListener
            public final void onAnimationPause(Animator animator2) {
                dqc.d(animator2, "animator");
                dow.this.invoke(animator2);
            }
        };
        animator.addPauseListener(animatorPauseListener);
        return animatorPauseListener;
    }
}
