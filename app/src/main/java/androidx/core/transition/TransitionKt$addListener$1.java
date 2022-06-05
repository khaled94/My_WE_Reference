package androidx.core.transition;

import android.transition.Transition;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n"}, d2 = {"<anonymous>", "", "it", "Landroid/transition/Transition;"}, k = 3, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class TransitionKt$addListener$1 extends dqd implements dow<Transition, dmg> {
    public static final TransitionKt$addListener$1 INSTANCE = new TransitionKt$addListener$1();

    public TransitionKt$addListener$1() {
        super(1);
    }

    /* renamed from: invoke  reason: avoid collision after fix types in other method */
    public final void invoke2(Transition transition) {
        dqc.d(transition, "it");
    }

    @Override // defpackage.dow
    public final /* bridge */ /* synthetic */ dmg invoke(Transition transition) {
        invoke2(transition);
        return dmg.a;
    }
}
