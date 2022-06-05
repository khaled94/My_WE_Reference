package androidx.activity;

import androidx.lifecycle.ViewModel;
import androidx.lifecycle.ViewModelLazy;
import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a4\u0010\u0000\u001a\b\u0012\u0004\u0012\u0002H\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003*\u00020\u00042\u0010\b\n\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006H\u0087\bø\u0001\u0000\u0082\u0002\u0007\n\u0005\b\u009920\u0001¨\u0006\b"}, d2 = {"viewModels", "Lkotlin/Lazy;", "VM", "Landroidx/lifecycle/ViewModel;", "Landroidx/activity/ComponentActivity;", "factoryProducer", "Lkotlin/Function0;", "Landroidx/lifecycle/ViewModelProvider$Factory;", "activity-ktx_release"}, k = 2, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes.dex */
public final class ActivityViewModelLazyKt {
    public static /* synthetic */ dlv viewModels$default(ComponentActivity componentActivity, dov dovVar, int i, Object obj) {
        if ((i & 1) != 0) {
            dovVar = null;
        }
        dqc.d(componentActivity, "<this>");
        if (dovVar == null) {
            dovVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        dqc.b();
        return new ViewModelLazy(dqg.b(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), dovVar);
    }

    public static final /* synthetic */ <VM extends ViewModel> dlv<VM> viewModels(ComponentActivity componentActivity, dov<? extends ViewModelProvider.Factory> dovVar) {
        dqc.d(componentActivity, "<this>");
        if (dovVar == null) {
            dovVar = new ActivityViewModelLazyKt$viewModels$factoryPromise$1(componentActivity);
        }
        dqc.b();
        return new ViewModelLazy(dqg.b(ViewModel.class), new ActivityViewModelLazyKt$viewModels$1(componentActivity), dovVar);
    }
}
