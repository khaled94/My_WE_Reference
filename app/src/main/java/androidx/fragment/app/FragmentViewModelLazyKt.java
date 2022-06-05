package androidx.fragment.app;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import androidx.lifecycle.ViewModelStore;
import androidx.lifecycle.ViewModelStoreOwner;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u00002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u001aJ\u0010\b\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\b\b\u0000\u0010\u0002*\u00020\u0003*\u00020\u00042\f\u0010\t\u001a\b\u0012\u0004\u0012\u0002H\u00020\n2\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\f0\u00062\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0007\u001aD\u0010\r\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u000e\b\n\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\u00062\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\u0010"}, d2 = {"activityViewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/fragment/app/Fragment;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "createViewModelLazy", "viewModelClass", "Lkotlin/reflect/KClass;", "storeProducer", "Landroidx/lifecycle/ViewModelStore;", "viewModels", "ownerProducer", "Landroidx/lifecycle/ViewModelStoreOwner;", "fragment-ktx_release"}, k = 2, mv = {1, 4, 1})
/* loaded from: classes.dex */
public final class FragmentViewModelLazyKt {
    public static /* synthetic */ dlv viewModels$default(Fragment fragment, dov dovVar, dov dovVar2, int i, Object obj) {
        if ((i & 1) != 0) {
            dovVar = new FragmentViewModelLazyKt$viewModels$1(fragment);
        }
        if ((i & 2) != 0) {
            dovVar2 = null;
        }
        dqc.d(fragment, "$this$viewModels");
        dqc.d(dovVar, "ownerProducer");
        dqc.b();
        return createViewModelLazy(fragment, dqg.b(ViewModel.class), new FragmentViewModelLazyKt$viewModels$2(dovVar), dovVar2);
    }

    public static final /* synthetic */ <VM extends ViewModel> dlv<VM> viewModels(Fragment fragment, dov<? extends ViewModelStoreOwner> dovVar, dov<? extends ViewModelProvider.Factory> dovVar2) {
        dqc.d(fragment, "$this$viewModels");
        dqc.d(dovVar, "ownerProducer");
        dqc.b();
        return createViewModelLazy(fragment, dqg.b(ViewModel.class), new FragmentViewModelLazyKt$viewModels$2(dovVar), dovVar2);
    }

    public static /* synthetic */ dlv activityViewModels$default(Fragment fragment, dov dovVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dovVar = null;
        }
        dqc.d(fragment, "$this$activityViewModels");
        dqc.b();
        drg b = dqg.b(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        if (dovVar == null) {
            dovVar = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        }
        return createViewModelLazy(fragment, b, fragmentViewModelLazyKt$activityViewModels$1, dovVar);
    }

    public static final /* synthetic */ <VM extends ViewModel> dlv<VM> activityViewModels(Fragment fragment, dov<? extends ViewModelProvider.Factory> dovVar) {
        dqc.d(fragment, "$this$activityViewModels");
        dqc.b();
        drg b = dqg.b(ViewModel.class);
        FragmentViewModelLazyKt$activityViewModels$1 fragmentViewModelLazyKt$activityViewModels$1 = new FragmentViewModelLazyKt$activityViewModels$1(fragment);
        if (dovVar == null) {
            dovVar = new FragmentViewModelLazyKt$activityViewModels$2(fragment);
        }
        return createViewModelLazy(fragment, b, fragmentViewModelLazyKt$activityViewModels$1, dovVar);
    }

    public static /* synthetic */ dlv createViewModelLazy$default(Fragment fragment, drg drgVar, dov dovVar, dov dovVar2, int i, Object obj) {
        if ((i & 4) != 0) {
            dovVar2 = null;
        }
        return createViewModelLazy(fragment, drgVar, dovVar, dovVar2);
    }

    public static final <VM extends ViewModel> dlv<VM> createViewModelLazy(Fragment fragment, drg<VM> drgVar, dov<? extends ViewModelStore> dovVar, dov<? extends ViewModelProvider.Factory> dovVar2) {
        dqc.d(fragment, "$this$createViewModelLazy");
        dqc.d(drgVar, "viewModelClass");
        dqc.d(dovVar, "storeProducer");
        if (dovVar2 == null) {
            dovVar2 = new FragmentViewModelLazyKt$createViewModelLazy$factoryPromise$1(fragment);
        }
        return new ViewModelLazy(drgVar, dovVar, dovVar2);
    }
}
