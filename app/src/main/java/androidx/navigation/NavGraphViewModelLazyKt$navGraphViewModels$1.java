package androidx.navigation;

import androidx.lifecycle.ViewModelProvider;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001\"\n\b\u0000\u0010\u0002\u0018\u0001*\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "Landroidx/lifecycle/ViewModelProvider$Factory;", "VM", "Landroidx/lifecycle/ViewModel;", "invoke"}, k = 3, mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class NavGraphViewModelLazyKt$navGraphViewModels$1 extends dqd implements dov<ViewModelProvider.Factory> {
    final /* synthetic */ dlv $backStackEntry;
    final /* synthetic */ drj $backStackEntry$metadata;
    final /* synthetic */ dov $factoryProducer;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NavGraphViewModelLazyKt$navGraphViewModels$1(dov dovVar, dlv dlvVar, drj drjVar) {
        super(0);
        this.$factoryProducer = dovVar;
        this.$backStackEntry = dlvVar;
        this.$backStackEntry$metadata = drjVar;
    }

    /* JADX WARN: Can't rename method to resolve collision */
    @Override // defpackage.dov
    public final ViewModelProvider.Factory invoke() {
        ViewModelProvider.Factory factory;
        dov dovVar = this.$factoryProducer;
        if (dovVar == null || (factory = (ViewModelProvider.Factory) dovVar.invoke()) == null) {
            NavBackStackEntry navBackStackEntry = (NavBackStackEntry) this.$backStackEntry.getValue();
            dqc.a((Object) navBackStackEntry, "backStackEntry");
            ViewModelProvider.Factory defaultViewModelProviderFactory = navBackStackEntry.getDefaultViewModelProviderFactory();
            dqc.a((Object) defaultViewModelProviderFactory, "backStackEntry.defaultViewModelProviderFactory");
            return defaultViewModelProviderFactory;
        }
        return factory;
    }
}
