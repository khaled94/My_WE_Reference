package androidx.navigation;

import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000 \n\u0000\n\u0002\u0010\u000b\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\u001a\u0017\u0010\u0000\u001a\u00020\u0001*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0086\u0002\u001a\u0017\u0010\u0005\u001a\u00020\u0006*\u00020\u00022\b\b\u0001\u0010\u0003\u001a\u00020\u0004H\u0086\n\u001a\u0015\u0010\u0007\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\b*\u00020\u00022\u0006\u0010\t\u001a\u00020\u0006H\u0086\n\u001a\u0015\u0010\n\u001a\u00020\b*\u00020\u00022\u0006\u0010\u000b\u001a\u00020\u0002H\u0086\n¨\u0006\f"}, d2 = {"contains", "", "Landroidx/navigation/NavGraph;", "id", "", "get", "Landroidx/navigation/NavDestination;", "minusAssign", "", "node", "plusAssign", "other", "navigation-common-ktx_release"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class NavGraphKt {
    public static final NavDestination get(NavGraph navGraph, int i) {
        dqc.c(navGraph, "$this$get");
        NavDestination findNode = navGraph.findNode(i);
        if (findNode != null) {
            return findNode;
        }
        throw new IllegalArgumentException("No destination for " + i + " was found in " + navGraph);
    }

    public static final boolean contains(NavGraph navGraph, int i) {
        dqc.c(navGraph, "$this$contains");
        return navGraph.findNode(i) != null;
    }

    public static final void plusAssign(NavGraph navGraph, NavDestination navDestination) {
        dqc.c(navGraph, "$this$plusAssign");
        dqc.c(navDestination, "node");
        navGraph.addDestination(navDestination);
    }

    public static final void plusAssign(NavGraph navGraph, NavGraph navGraph2) {
        dqc.c(navGraph, "$this$plusAssign");
        dqc.c(navGraph2, "other");
        navGraph.addAll(navGraph2);
    }

    public static final void minusAssign(NavGraph navGraph, NavDestination navDestination) {
        dqc.c(navGraph, "$this$minusAssign");
        dqc.c(navDestination, "node");
        navGraph.remove(navDestination);
    }
}
