package androidx.navigation;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a0\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u00042\u0017\u0010\u0005\u001a\u0013\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00010\u0006¢\u0006\u0002\b\bH\u0086\b¨\u0006\t"}, d2 = {"activity", "", "Landroidx/navigation/NavGraphBuilder;", "id", "", "builder", "Lkotlin/Function1;", "Landroidx/navigation/ActivityNavigatorDestinationBuilder;", "Lkotlin/ExtensionFunctionType;", "navigation-runtime-ktx_release"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class ActivityNavigatorDestinationBuilderKt {
    public static final void activity(NavGraphBuilder navGraphBuilder, int i, dow<? super ActivityNavigatorDestinationBuilder, dmg> dowVar) {
        dqc.c(navGraphBuilder, "$this$activity");
        dqc.c(dowVar, "builder");
        Navigator navigator = navGraphBuilder.getProvider().getNavigator(ActivityNavigator.class);
        dqc.a((Object) navigator, "getNavigator(clazz.java)");
        ActivityNavigatorDestinationBuilder activityNavigatorDestinationBuilder = new ActivityNavigatorDestinationBuilder((ActivityNavigator) navigator, i);
        dowVar.invoke(activityNavigatorDestinationBuilder);
        navGraphBuilder.destination(activityNavigatorDestinationBuilder);
    }
}
