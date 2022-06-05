package androidx.savedstate;

import android.view.View;
import android.view.ViewParent;

/* loaded from: classes.dex */
public final class ViewTreeSavedStateRegistryOwner {
    private ViewTreeSavedStateRegistryOwner() {
    }

    public static void set(View view, SavedStateRegistryOwner savedStateRegistryOwner) {
        view.setTag(R.id.view_tree_saved_state_registry_owner, savedStateRegistryOwner);
    }

    public static SavedStateRegistryOwner get(View view) {
        SavedStateRegistryOwner savedStateRegistryOwner = (SavedStateRegistryOwner) view.getTag(R.id.view_tree_saved_state_registry_owner);
        if (savedStateRegistryOwner != null) {
            return savedStateRegistryOwner;
        }
        while (true) {
            ViewParent parent = view.getParent();
            if (savedStateRegistryOwner != null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            savedStateRegistryOwner = (SavedStateRegistryOwner) view.getTag(R.id.view_tree_saved_state_registry_owner);
        }
        return savedStateRegistryOwner;
    }
}
