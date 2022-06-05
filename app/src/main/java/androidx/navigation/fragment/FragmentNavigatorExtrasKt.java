package androidx.navigation.fragment;

import android.view.View;
import androidx.navigation.fragment.FragmentNavigator;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000\u001c\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\u001a7\u0010\u0000\u001a\u00020\u00012*\u0010\u0002\u001a\u0016\u0012\u0012\b\u0001\u0012\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u00040\u0003\"\u000e\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u00060\u0004¢\u0006\u0002\u0010\u0007¨\u0006\b"}, d2 = {"FragmentNavigatorExtras", "Landroidx/navigation/fragment/FragmentNavigator$Extras;", "sharedElements", "", "Lkotlin/Pair;", "Landroid/view/View;", "", "([Lkotlin/Pair;)Landroidx/navigation/fragment/FragmentNavigator$Extras;", "navigation-fragment-ktx_release"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class FragmentNavigatorExtrasKt {
    public static final FragmentNavigator.Extras FragmentNavigatorExtras(dma<? extends View, String>... dmaVarArr) {
        dqc.c(dmaVarArr, "sharedElements");
        FragmentNavigator.Extras.Builder builder = new FragmentNavigator.Extras.Builder();
        for (dma<? extends View, String> dmaVar : dmaVarArr) {
            builder.addSharedElement((View) dmaVar.a, dmaVar.b);
        }
        FragmentNavigator.Extras build = builder.build();
        dqc.a((Object) build, "FragmentNavigator.Extras…      }\n        }.build()");
        return build;
    }
}
