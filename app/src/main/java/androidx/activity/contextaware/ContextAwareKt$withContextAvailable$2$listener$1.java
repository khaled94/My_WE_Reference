package androidx.activity.contextaware;

import android.content.Context;
import defpackage.dmb;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u0017\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J\u0010\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u0016¨\u0006\u0006"}, d2 = {"androidx/activity/contextaware/ContextAwareKt$withContextAvailable$2$listener$1", "Landroidx/activity/contextaware/OnContextAvailableListener;", "onContextAvailable", "", "context", "Landroid/content/Context;", "activity-ktx_release"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ContextAwareKt$withContextAvailable$2$listener$1 implements OnContextAvailableListener {
    final /* synthetic */ dtf<R> $co;
    final /* synthetic */ dow<Context, R> $onContextAvailable;

    /* JADX WARN: Multi-variable type inference failed */
    public ContextAwareKt$withContextAvailable$2$listener$1(dtf<? super R> dtfVar, dow<? super Context, ? extends R> dowVar) {
        this.$co = dtfVar;
        this.$onContextAvailable = dowVar;
    }

    @Override // androidx.activity.contextaware.OnContextAvailableListener
    public final void onContextAvailable(Context context) {
        Object obj;
        dqc.d(context, "context");
        dnu dnuVar = this.$co;
        dow<Context, R> dowVar = this.$onContextAvailable;
        try {
            dmb.a aVar = dmb.a;
            obj = dmb.d(dowVar.invoke(context));
        } catch (Throwable th) {
            dmb.a aVar2 = dmb.a;
            obj = dmb.d(dmc.a(th));
        }
        dnuVar.resumeWith(obj);
    }
}
