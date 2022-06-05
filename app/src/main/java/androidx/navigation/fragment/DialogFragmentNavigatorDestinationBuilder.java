package androidx.navigation.fragment;

import androidx.fragment.app.DialogFragment;
import androidx.navigation.NavDestinationBuilder;
import androidx.navigation.NavDestinationDsl;
import androidx.navigation.fragment.DialogFragmentNavigator;
import kotlin.Metadata;

@NavDestinationDsl
@Metadata(bv = {1, 0, 3}, d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\u000e\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\b¢\u0006\u0002\u0010\nJ\b\u0010\u000b\u001a\u00020\u0002H\u0016R\u0016\u0010\u0007\u001a\n\u0012\u0006\b\u0001\u0012\u00020\t0\bX\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Landroidx/navigation/fragment/DialogFragmentNavigatorDestinationBuilder;", "Landroidx/navigation/NavDestinationBuilder;", "Landroidx/navigation/fragment/DialogFragmentNavigator$Destination;", "navigator", "Landroidx/navigation/fragment/DialogFragmentNavigator;", "id", "", "fragmentClass", "Lkotlin/reflect/KClass;", "Landroidx/fragment/app/DialogFragment;", "(Landroidx/navigation/fragment/DialogFragmentNavigator;ILkotlin/reflect/KClass;)V", "build", "navigation-fragment-ktx_release"}, k = 1, mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class DialogFragmentNavigatorDestinationBuilder extends NavDestinationBuilder<DialogFragmentNavigator.Destination> {
    private final drg<? extends DialogFragment> fragmentClass;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DialogFragmentNavigatorDestinationBuilder(DialogFragmentNavigator dialogFragmentNavigator, int i, drg<? extends DialogFragment> drgVar) {
        super(dialogFragmentNavigator, i);
        dqc.c(dialogFragmentNavigator, "navigator");
        dqc.c(drgVar, "fragmentClass");
        this.fragmentClass = drgVar;
    }

    @Override // androidx.navigation.NavDestinationBuilder
    public final DialogFragmentNavigator.Destination build() {
        DialogFragmentNavigator.Destination destination = (DialogFragmentNavigator.Destination) super.build();
        destination.setClassName(dot.a(this.fragmentClass).getName());
        return destination;
    }
}
