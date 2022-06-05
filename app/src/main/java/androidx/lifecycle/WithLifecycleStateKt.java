package androidx.lifecycle;

import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.core.app.NotificationCompat;
import androidx.lifecycle.Lifecycle;
import defpackage.dmb;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000,\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\b\u001aA\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\b2\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0081@ø\u0001\u0000¢\u0006\u0002\u0010\u000b\u001a+\u0010\f\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\r\u001a+\u0010\f\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000e2\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a+\u0010\u0010\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\r\u001a+\u0010\u0010\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000e2\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a+\u0010\u0011\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\r\u001a+\u0010\u0011\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000e2\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u000f\u001a3\u0010\u0012\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0013\u001a3\u0010\u0012\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u000e2\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0014\u001a3\u0010\u0015\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u00042\u000e\b\u0004\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00010\nH\u0081Hø\u0001\u0000¢\u0006\u0002\u0010\u0013\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0016"}, d2 = {"suspendWithStateAtLeastUnchecked", "R", "Landroidx/lifecycle/Lifecycle;", "state", "Landroidx/lifecycle/Lifecycle$State;", "dispatchNeeded", "", "lifecycleDispatcher", "Lkotlinx/coroutines/CoroutineDispatcher;", "block", "Lkotlin/Function0;", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;ZLkotlinx/coroutines/CoroutineDispatcher;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withCreated", "(Landroidx/lifecycle/Lifecycle;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Landroidx/lifecycle/LifecycleOwner;", "(Landroidx/lifecycle/LifecycleOwner;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withResumed", "withStarted", "withStateAtLeast", "(Landroidx/lifecycle/Lifecycle;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "(Landroidx/lifecycle/LifecycleOwner;Landroidx/lifecycle/Lifecycle$State;Lkotlin/jvm/functions/Function0;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "withStateAtLeastUnchecked", "lifecycle-runtime-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class WithLifecycleStateKt {
    public static final <R> Object withStateAtLeast(Lifecycle lifecycle, Lifecycle.State state, dov<? extends R> dovVar, dnu<? super R> dnuVar) {
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException("target state must be CREATED or greater, found ".concat(String.valueOf(state)).toString());
        }
        dvr a = dup.b().a();
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    private static final Object withStateAtLeast$$forInline(Lifecycle lifecycle, Lifecycle.State state, dov dovVar, dnu dnuVar) {
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException("target state must be CREATED or greater, found ".concat(String.valueOf(state)).toString());
        }
        dvr a = dup.b().a();
        dnu dnuVar2 = null;
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar2.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    public static final <R> Object withCreated(Lifecycle lifecycle, dov<? extends R> dovVar, dnu<? super R> dnuVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        dvr a = dup.b().a();
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    private static final Object withCreated$$forInline(Lifecycle lifecycle, dov dovVar, dnu dnuVar) {
        Lifecycle.State state = Lifecycle.State.CREATED;
        dvr a = dup.b().a();
        dnu dnuVar2 = null;
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar2.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    public static final <R> Object withStarted(Lifecycle lifecycle, dov<? extends R> dovVar, dnu<? super R> dnuVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        dvr a = dup.b().a();
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    private static final Object withStarted$$forInline(Lifecycle lifecycle, dov dovVar, dnu dnuVar) {
        Lifecycle.State state = Lifecycle.State.STARTED;
        dvr a = dup.b().a();
        dnu dnuVar2 = null;
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar2.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    public static final <R> Object withResumed(Lifecycle lifecycle, dov<? extends R> dovVar, dnu<? super R> dnuVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        dvr a = dup.b().a();
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    private static final Object withResumed$$forInline(Lifecycle lifecycle, dov dovVar, dnu dnuVar) {
        Lifecycle.State state = Lifecycle.State.RESUMED;
        dvr a = dup.b().a();
        dnu dnuVar2 = null;
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar2.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    public static final <R> Object withStateAtLeast(LifecycleOwner lifecycleOwner, Lifecycle.State state, dov<? extends R> dovVar, dnu<? super R> dnuVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        dqc.b(lifecycle, "lifecycle");
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException("target state must be CREATED or greater, found ".concat(String.valueOf(state)).toString());
        }
        dvr a = dup.b().a();
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    private static final Object withStateAtLeast$$forInline(LifecycleOwner lifecycleOwner, Lifecycle.State state, dov dovVar, dnu dnuVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        dqc.b(lifecycle, "lifecycle");
        if (!(state.compareTo(Lifecycle.State.CREATED) >= 0)) {
            throw new IllegalArgumentException("target state must be CREATED or greater, found ".concat(String.valueOf(state)).toString());
        }
        dvr a = dup.b().a();
        dnu dnuVar2 = null;
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar2.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    public static final <R> Object withCreated(LifecycleOwner lifecycleOwner, dov<? extends R> dovVar, dnu<? super R> dnuVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        dqc.b(lifecycle, "lifecycle");
        Lifecycle.State state = Lifecycle.State.CREATED;
        dvr a = dup.b().a();
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    private static final Object withCreated$$forInline(LifecycleOwner lifecycleOwner, dov dovVar, dnu dnuVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        dqc.b(lifecycle, "lifecycle");
        Lifecycle.State state = Lifecycle.State.CREATED;
        dvr a = dup.b().a();
        dnu dnuVar2 = null;
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar2.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    public static final <R> Object withStarted(LifecycleOwner lifecycleOwner, dov<? extends R> dovVar, dnu<? super R> dnuVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        dqc.b(lifecycle, "lifecycle");
        Lifecycle.State state = Lifecycle.State.STARTED;
        dvr a = dup.b().a();
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    private static final Object withStarted$$forInline(LifecycleOwner lifecycleOwner, dov dovVar, dnu dnuVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        dqc.b(lifecycle, "lifecycle");
        Lifecycle.State state = Lifecycle.State.STARTED;
        dvr a = dup.b().a();
        dnu dnuVar2 = null;
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar2.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    public static final <R> Object withResumed(LifecycleOwner lifecycleOwner, dov<? extends R> dovVar, dnu<? super R> dnuVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        dqc.b(lifecycle, "lifecycle");
        Lifecycle.State state = Lifecycle.State.RESUMED;
        dvr a = dup.b().a();
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    private static final Object withResumed$$forInline(LifecycleOwner lifecycleOwner, dov dovVar, dnu dnuVar) {
        Lifecycle lifecycle = lifecycleOwner.getLifecycle();
        dqc.b(lifecycle, "lifecycle");
        Lifecycle.State state = Lifecycle.State.RESUMED;
        dvr a = dup.b().a();
        dnu dnuVar2 = null;
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar2.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    public static final <R> Object withStateAtLeastUnchecked(Lifecycle lifecycle, Lifecycle.State state, dov<? extends R> dovVar, dnu<? super R> dnuVar) {
        dvr a = dup.b().a();
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    private static final Object withStateAtLeastUnchecked$$forInline(Lifecycle lifecycle, Lifecycle.State state, dov dovVar, dnu dnuVar) {
        dvr a = dup.b().a();
        dnu dnuVar2 = null;
        boolean isDispatchNeeded = a.isDispatchNeeded(dnuVar2.getContext());
        if (!isDispatchNeeded) {
            if (lifecycle.getCurrentState() == Lifecycle.State.DESTROYED) {
                throw new LifecycleDestroyedException();
            }
            if (lifecycle.getCurrentState().compareTo(state) >= 0) {
                return dovVar.invoke();
            }
        }
        return suspendWithStateAtLeastUnchecked(lifecycle, state, isDispatchNeeded, a, new WithLifecycleStateKt$withStateAtLeastUnchecked$2(dovVar), dnuVar);
    }

    /* JADX WARN: Type inference failed for: r10v0, types: [androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1] */
    public static final <R> Object suspendWithStateAtLeastUnchecked(final Lifecycle lifecycle, final Lifecycle.State state, final boolean z, final dtx dtxVar, final dov<? extends R> dovVar, dnu<? super R> dnuVar) {
        dtg dtgVar = new dtg(dnz.a(dnuVar), 1);
        dtgVar.b();
        final dtg dtgVar2 = dtgVar;
        final ?? r10 = new LifecycleEventObserver() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1
            @Override // androidx.lifecycle.LifecycleEventObserver
            public final void onStateChanged(LifecycleOwner lifecycleOwner, Lifecycle.Event event) {
                Object obj;
                dqc.d(lifecycleOwner, "source");
                dqc.d(event, NotificationCompat.CATEGORY_EVENT);
                if (event == Lifecycle.Event.upTo(state)) {
                    lifecycle.removeObserver(this);
                    dtf dtfVar = dtf.this;
                    dov dovVar2 = dovVar;
                    try {
                        dmb.a aVar = dmb.a;
                        obj = dmb.d(dovVar2.invoke());
                    } catch (Throwable th) {
                        dmb.a aVar2 = dmb.a;
                        obj = dmb.d(dmc.a(th));
                    }
                    dtfVar.resumeWith(obj);
                } else if (event != Lifecycle.Event.ON_DESTROY) {
                } else {
                    lifecycle.removeObserver(this);
                    dmb.a aVar3 = dmb.a;
                    dtf.this.resumeWith(dmb.d(dmc.a(new LifecycleDestroyedException())));
                }
            }
        };
        if (z) {
            dtxVar.dispatch(dnx.a, new Runnable() { // from class: androidx.lifecycle.WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$2
                @Override // java.lang.Runnable
                public final void run() {
                    lifecycle.addObserver(WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$1.this);
                }
            });
        } else {
            lifecycle.addObserver((LifecycleObserver) r10);
        }
        dtgVar2.a((dow<? super Throwable, dmg>) new WithLifecycleStateKt$suspendWithStateAtLeastUnchecked$$inlined$suspendCancellableCoroutine$lambda$3(r10, lifecycle, state, dovVar, z, dtxVar));
        Object e = dtgVar.e();
        if (e == dny.COROUTINE_SUSPENDED) {
            dqc.d(dnuVar, TypedValues.Attributes.S_FRAME);
        }
        return e;
    }
}
