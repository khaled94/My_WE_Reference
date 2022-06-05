package androidx.navigation;

import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentViewModelLazyKt;
import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\"\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a;\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\b\b\u0001\u0010\u0005\u001a\u00020\u00062\u0010\b\n\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\t\u0018\u00010\bH\u0087\b¨\u0006\n"}, d2 = {"navGraphViewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "navGraphId", "", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "navigation-fragment-ktx_release"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt {
    public static /* synthetic */ dlv navGraphViewModels$default(Fragment fragment, int i, dov dovVar, int i2, Object obj) {
        if ((i2 & 2) != 0) {
            dovVar = null;
        }
        dqc.c(fragment, "$this$navGraphViewModels");
        dlv a = dlw.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i));
        dqc.b();
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, dqg.b(ViewModel.class), new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(a, null), new NavGraphViewModelLazyKt$navGraphViewModels$1(dovVar, a, null));
    }

    public static final /* synthetic */ <VM extends ViewModel> dlv<VM> navGraphViewModels(Fragment fragment, int i, dov<? extends ViewModelProvider.Factory> dovVar) {
        dqc.c(fragment, "$this$navGraphViewModels");
        dlv a = dlw.a(new NavGraphViewModelLazyKt$navGraphViewModels$backStackEntry$2(fragment, i));
        dqc.b();
        return FragmentViewModelLazyKt.createViewModelLazy(fragment, dqg.b(ViewModel.class), new NavGraphViewModelLazyKt$navGraphViewModels$storeProducer$1(a, null), new NavGraphViewModelLazyKt$navGraphViewModels$1(dovVar, a, null));
    }
}
