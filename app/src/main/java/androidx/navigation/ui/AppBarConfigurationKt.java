package androidx.navigation.ui;

import android.view.Menu;
import androidx.customview.widget.Openable;
import androidx.navigation.NavGraph;
import androidx.navigation.ui.AppBarConfiguration;
import java.util.Set;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, d1 = {"\u0000.\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\"\n\u0002\u0010\b\n\u0000\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\b\u001a-\u0010\u0000\u001a\u00020\u00012\u0006\u0010\t\u001a\u00020\n2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\b\u001a3\u0010\u0000\u001a\u00020\u00012\f\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\r0\f2\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u000e\b\n\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u0007H\u0086\b¨\u0006\u000e"}, d2 = {"AppBarConfiguration", "Landroidx/navigation/ui/AppBarConfiguration;", "topLevelMenu", "Landroid/view/Menu;", "drawerLayout", "Landroidx/customview/widget/Openable;", "fallbackOnNavigateUpListener", "Lkotlin/Function0;", "", "navGraph", "Landroidx/navigation/NavGraph;", "topLevelDestinationIds", "", "", "navigation-ui-ktx_release"}, k = 2, mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class AppBarConfigurationKt {
    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(NavGraph navGraph, Openable openable, dov dovVar, int i, Object obj) {
        if ((i & 2) != 0) {
            openable = null;
        }
        if ((i & 4) != 0) {
            dovVar = AppBarConfigurationKt$AppBarConfiguration$1.INSTANCE;
        }
        dqc.c(navGraph, "navGraph");
        dqc.c(dovVar, "fallbackOnNavigateUpListener");
        AppBarConfiguration build = new AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(dovVar)).build();
        dqc.a((Object) build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    public static final AppBarConfiguration AppBarConfiguration(NavGraph navGraph, Openable openable, dov<Boolean> dovVar) {
        dqc.c(navGraph, "navGraph");
        dqc.c(dovVar, "fallbackOnNavigateUpListener");
        AppBarConfiguration build = new AppBarConfiguration.Builder(navGraph).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(dovVar)).build();
        dqc.a((Object) build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Menu menu, Openable openable, dov dovVar, int i, Object obj) {
        if ((i & 2) != 0) {
            openable = null;
        }
        if ((i & 4) != 0) {
            dovVar = AppBarConfigurationKt$AppBarConfiguration$2.INSTANCE;
        }
        dqc.c(menu, "topLevelMenu");
        dqc.c(dovVar, "fallbackOnNavigateUpListener");
        AppBarConfiguration build = new AppBarConfiguration.Builder(menu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(dovVar)).build();
        dqc.a((Object) build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    public static final AppBarConfiguration AppBarConfiguration(Menu menu, Openable openable, dov<Boolean> dovVar) {
        dqc.c(menu, "topLevelMenu");
        dqc.c(dovVar, "fallbackOnNavigateUpListener");
        AppBarConfiguration build = new AppBarConfiguration.Builder(menu).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(dovVar)).build();
        dqc.a((Object) build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    public static /* synthetic */ AppBarConfiguration AppBarConfiguration$default(Set set, Openable openable, dov dovVar, int i, Object obj) {
        if ((i & 2) != 0) {
            openable = null;
        }
        if ((i & 4) != 0) {
            dovVar = AppBarConfigurationKt$AppBarConfiguration$3.INSTANCE;
        }
        dqc.c(set, "topLevelDestinationIds");
        dqc.c(dovVar, "fallbackOnNavigateUpListener");
        AppBarConfiguration build = new AppBarConfiguration.Builder(set).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(dovVar)).build();
        dqc.a((Object) build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }

    public static final AppBarConfiguration AppBarConfiguration(Set<Integer> set, Openable openable, dov<Boolean> dovVar) {
        dqc.c(set, "topLevelDestinationIds");
        dqc.c(dovVar, "fallbackOnNavigateUpListener");
        AppBarConfiguration build = new AppBarConfiguration.Builder(set).setOpenableLayout(openable).setFallbackOnNavigateUpListener(new AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(dovVar)).build();
        dqc.a((Object) build, "AppBarConfiguration.Buil…eUpListener)\n    .build()");
        return build;
    }
}
