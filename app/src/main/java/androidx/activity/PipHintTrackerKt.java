package androidx.activity;

import android.app.Activity;
import android.graphics.Rect;
import android.view.View;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a\u001d\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\u0006\u0010\u0003\u001a\u00020\u0004H\u0087@ø\u0001\u0000¢\u0006\u0002\u0010\u0005\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0006"}, d2 = {"trackPipAnimationHintView", "", "Landroid/app/Activity;", "view", "Landroid/view/View;", "(Landroid/app/Activity;Landroid/view/View;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class PipHintTrackerKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Rect trackPipAnimationHintView$positionInWindow(View view) {
        Rect rect = new Rect();
        view.getGlobalVisibleRect(rect);
        return rect;
    }

    public static final Object trackPipAnimationHintView(final Activity activity, View view, dnu<? super dmg> dnuVar) {
        Object a = new dxi(new PipHintTrackerKt$trackPipAnimationHintView$flow$1(view, null)).a(new dxm<Rect>() { // from class: androidx.activity.PipHintTrackerKt$trackPipAnimationHintView$$inlined$collect$1
            @Override // defpackage.dxm
            public final Object emit(Rect rect, dnu dnuVar2) {
                Api26Impl.INSTANCE.setPipParamsSourceRectHint(activity, rect);
                return dmg.a;
            }
        }, dnuVar);
        return a == dny.COROUTINE_SUSPENDED ? a : dmg.a;
    }
}
