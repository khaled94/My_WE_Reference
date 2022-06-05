package androidx.navigation.fragment;

import androidx.fragment.app.Fragment;
import androidx.navigation.NavController;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\f\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\u001a\n\u0010\u0000\u001a\u00020\u0001*\u00020\u0002¨\u0006\u0003"}, d2 = {"findNavController", "Landroidx/navigation/NavController;", "Landroidx/fragment/app/Fragment;", "navigation-fragment-ktx_release"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class FragmentKt {
    public static final NavController findNavController(Fragment fragment) {
        dqc.c(fragment, "$this$findNavController");
        NavController findNavController = NavHostFragment.findNavController(fragment);
        dqc.a((Object) findNavController, "NavHostFragment.findNavController(this)");
        return findNavController;
    }
}
