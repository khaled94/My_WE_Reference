package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000 \n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u000b\u001aÉ\u0001\u0010\u0000\u001a\u00020\u0001*\u00020\u00022#\b\u0006\u0010\u0003\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\t\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\n\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\u000b\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u00042#\b\u0006\u0010\f\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\r\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u000f\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0010\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0011\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u001a5\u0010\u0012\u001a\u00020\u0001*\u00020\u00022#\b\u0004\u0010\u000e\u001a\u001d\u0012\u0013\u0012\u00110\u0002¢\u0006\f\b\u0005\u0012\b\b\u0006\u0012\u0004\b\b(\u0007\u0012\u0004\u0012\u00020\b0\u0004H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0013"}, d2 = {"addListener", "Landroid/transition/Transition$TransitionListener;", "Landroid/transition/Transition;", "onEnd", "Lkotlin/Function1;", "Lkotlin/ParameterName;", "name", "transition", "", "onStart", "onCancel", "onResume", "onPause", "doOnCancel", "action", "doOnEnd", "doOnPause", "doOnResume", "doOnStart", "core-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransitionKt {
    public static /* synthetic */ Transition.TransitionListener addListener$default(Transition transition, dow dowVar, dow dowVar2, dow dowVar3, dow dowVar4, dow dowVar5, int i, Object obj) {
        if ((i & 1) != 0) {
            dowVar = TransitionKt$addListener$1.INSTANCE;
        }
        if ((i & 2) != 0) {
            dowVar2 = TransitionKt$addListener$2.INSTANCE;
        }
        dow dowVar6 = dowVar2;
        if ((i & 4) != 0) {
            dowVar3 = TransitionKt$addListener$3.INSTANCE;
        }
        dow dowVar7 = dowVar3;
        if ((i & 8) != 0) {
            dowVar4 = TransitionKt$addListener$4.INSTANCE;
        }
        if ((i & 16) != 0) {
            dowVar5 = TransitionKt$addListener$5.INSTANCE;
        }
        dqc.d(transition, "<this>");
        dqc.d(dowVar, "onEnd");
        dqc.d(dowVar6, "onStart");
        dqc.d(dowVar7, "onCancel");
        dqc.d(dowVar4, "onResume");
        dqc.d(dowVar5, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(dowVar, dowVar4, dowVar5, dowVar7, dowVar6);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final Transition.TransitionListener addListener(Transition transition, dow<? super Transition, dmg> dowVar, dow<? super Transition, dmg> dowVar2, dow<? super Transition, dmg> dowVar3, dow<? super Transition, dmg> dowVar4, dow<? super Transition, dmg> dowVar5) {
        dqc.d(transition, "<this>");
        dqc.d(dowVar, "onEnd");
        dqc.d(dowVar2, "onStart");
        dqc.d(dowVar3, "onCancel");
        dqc.d(dowVar4, "onResume");
        dqc.d(dowVar5, "onPause");
        TransitionKt$addListener$listener$1 transitionKt$addListener$listener$1 = new TransitionKt$addListener$listener$1(dowVar, dowVar4, dowVar5, dowVar3, dowVar2);
        transition.addListener(transitionKt$addListener$listener$1);
        return transitionKt$addListener$listener$1;
    }

    public static final Transition.TransitionListener doOnEnd(Transition transition, final dow<? super Transition, dmg> dowVar) {
        dqc.d(transition, "<this>");
        dqc.d(dowVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnEnd$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition2) {
                dqc.d(transition2, "transition");
                dow.this.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnStart(Transition transition, final dow<? super Transition, dmg> dowVar) {
        dqc.d(transition, "<this>");
        dqc.d(dowVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnStart$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition2) {
                dqc.d(transition2, "transition");
                dow.this.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnCancel(Transition transition, final dow<? super Transition, dmg> dowVar) {
        dqc.d(transition, "<this>");
        dqc.d(dowVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnCancel$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition2) {
                dqc.d(transition2, "transition");
                dow.this.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnResume(Transition transition, final dow<? super Transition, dmg> dowVar) {
        dqc.d(transition, "<this>");
        dqc.d(dowVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnResume$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition transition2) {
                dqc.d(transition2, "transition");
                dow.this.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }

    public static final Transition.TransitionListener doOnPause(Transition transition, final dow<? super Transition, dmg> dowVar) {
        dqc.d(transition, "<this>");
        dqc.d(dowVar, "action");
        Transition.TransitionListener transitionListener = new Transition.TransitionListener() { // from class: androidx.core.transition.TransitionKt$doOnPause$$inlined$addListener$default$1
            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionCancel(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionEnd(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionResume(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionStart(Transition transition2) {
                dqc.d(transition2, "transition");
            }

            @Override // android.transition.Transition.TransitionListener
            public final void onTransitionPause(Transition transition2) {
                dqc.d(transition2, "transition");
                dow.this.invoke(transition2);
            }
        };
        transition.addListener(transitionListener);
        return transitionListener;
    }
}
