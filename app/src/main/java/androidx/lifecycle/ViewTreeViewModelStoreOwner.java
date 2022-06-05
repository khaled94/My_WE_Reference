package androidx.lifecycle;

import android.view.View;
import android.view.ViewParent;
import androidx.lifecycle.viewmodel.R;

/* loaded from: classes.dex */
public class ViewTreeViewModelStoreOwner {
    private ViewTreeViewModelStoreOwner() {
    }

    public static void set(View view, ViewModelStoreOwner viewModelStoreOwner) {
        view.setTag(R.id.view_tree_view_model_store_owner, viewModelStoreOwner);
    }

    public static ViewModelStoreOwner get(View view) {
        ViewModelStoreOwner viewModelStoreOwner = (ViewModelStoreOwner) view.getTag(R.id.view_tree_view_model_store_owner);
        if (viewModelStoreOwner != null) {
            return viewModelStoreOwner;
        }
        while (true) {
            ViewParent parent = view.getParent();
            if (viewModelStoreOwner != null || !(parent instanceof View)) {
                break;
            }
            view = (View) parent;
            viewModelStoreOwner = (ViewModelStoreOwner) view.getTag(R.id.view_tree_view_model_store_owner);
        }
        return viewModelStoreOwner;
    }
}
