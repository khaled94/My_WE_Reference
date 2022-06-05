package androidx.activity.contextaware;

import android.content.Context;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0016\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u001a1\u0010\u0000\u001a\u0002H\u0001\"\u0004\b\u0000\u0010\u0001*\u00020\u00022\u0014\b\u0004\u0010\u0003\u001a\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u0002H\u00010\u0004H\u0086Hø\u0001\u0000¢\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u0007"}, d2 = {"withContextAvailable", "R", "Landroidx/activity/contextaware/ContextAware;", "onContextAvailable", "Lkotlin/Function1;", "Landroid/content/Context;", "(Landroidx/activity/contextaware/ContextAware;Lkotlin/jvm/functions/Function1;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "activity-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ContextAwareKt {
    public static final <R> Object withContextAvailable(ContextAware contextAware, dow<? super Context, ? extends R> dowVar, dnu<? super R> dnuVar) {
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return dowVar.invoke(peekAvailableContext);
        }
        dtg dtgVar = new dtg(dnz.a(dnuVar), 1);
        dtgVar.b();
        dtg dtgVar2 = dtgVar;
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(dtgVar2, dowVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        dtgVar2.a((dow<? super Throwable, dmg>) new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object e = dtgVar.e();
        if (e == dny.COROUTINE_SUSPENDED) {
            dqc.d(dnuVar, TypedValues.Attributes.S_FRAME);
        }
        return e;
    }

    private static final <R> Object withContextAvailable$$forInline(ContextAware contextAware, dow<? super Context, ? extends R> dowVar, dnu<? super R> dnuVar) {
        Context peekAvailableContext = contextAware.peekAvailableContext();
        if (peekAvailableContext != null) {
            return dowVar.invoke(peekAvailableContext);
        }
        dtg dtgVar = new dtg(dnz.a(dnuVar), 1);
        dtgVar.b();
        dtg dtgVar2 = dtgVar;
        ContextAwareKt$withContextAvailable$2$listener$1 contextAwareKt$withContextAvailable$2$listener$1 = new ContextAwareKt$withContextAvailable$2$listener$1(dtgVar2, dowVar);
        contextAware.addOnContextAvailableListener(contextAwareKt$withContextAvailable$2$listener$1);
        dtgVar2.a((dow<? super Throwable, dmg>) new ContextAwareKt$withContextAvailable$2$1(contextAware, contextAwareKt$withContextAvailable$2$listener$1));
        Object e = dtgVar.e();
        if (e == dny.COROUTINE_SUSPENDED) {
            dqc.d(dnuVar, TypedValues.Attributes.S_FRAME);
        }
        return e;
    }
}
