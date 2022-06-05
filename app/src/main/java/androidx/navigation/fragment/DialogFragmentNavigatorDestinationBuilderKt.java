package androidx.navigation.fragment;

import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavGraphBuilder;
import androidx.navigation.Navigator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a#\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u0006H\u0086\b\u001a<\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0017\u0010\u0007\u001a\u0013\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u00010\b¢\u0006\u0002\b\nH\u0086\b¨\u0006\u000b"}, d2 = {"dialog", "", "F", "Landroidx/fragment/app/DialogFragment;", "Landroidx/navigation/NavGraphBuilder;", "id", "", "builder", "Lkotlin/Function1;", "Landroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilder;", "Lkotlin/ExtensionFunctionType;", "navigation-fragment-ktx_release"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogFragmentNavigatorDestinationBuilderKt {
    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, int i, dow<? super DialogFragmentNavigatorDestinationBuilder, dmg> dowVar) {
        dqc.c(navGraphBuilder, "$this$dialog");
        dqc.c(dowVar, "builder");
        Navigator navigator = navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        dqc.a((Object) navigator, "getNavigator(clazz.java)");
        dqc.b();
        DialogFragmentNavigatorDestinationBuilder dialogFragmentNavigatorDestinationBuilder = new DialogFragmentNavigatorDestinationBuilder((DialogFragmentNavigator) navigator, i, dqg.b(DialogFragment.class));
        dowVar.invoke(dialogFragmentNavigatorDestinationBuilder);
        navGraphBuilder.destination(dialogFragmentNavigatorDestinationBuilder);
    }

    public static final /* synthetic */ <F extends DialogFragment> void dialog(NavGraphBuilder navGraphBuilder, int i) {
        dqc.c(navGraphBuilder, "$this$dialog");
        Navigator navigator = navGraphBuilder.getProvider().getNavigator(DialogFragmentNavigator.class);
        dqc.a((Object) navigator, "getNavigator(clazz.java)");
        dqc.b();
        navGraphBuilder.destination(new DialogFragmentNavigatorDestinationBuilder((DialogFragmentNavigator) navigator, i, dqg.b(DialogFragment.class)));
    }
}
