package androidx.navigation.ui;

import androidx.navigation.ui.AppBarConfiguration;
import kotlin.Metadata;

@Metadata(bv = {1, 0, 3}, k = 3, mv = {1, 1, 16})
/* loaded from: classes.dex */
public final class AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0 implements AppBarConfiguration.OnNavigateUpListener {
    private final /* synthetic */ dov function;

    public AppBarConfigurationKt$sam$i$androidx_navigation_ui_AppBarConfiguration_OnNavigateUpListener$0(dov dovVar) {
        this.function = dovVar;
    }

    @Override // androidx.navigation.ui.AppBarConfiguration.OnNavigateUpListener
    public final /* synthetic */ boolean onNavigateUp() {
        Object invoke = this.function.invoke();
        dqc.a(invoke, "invoke(...)");
        return ((Boolean) invoke).booleanValue();
    }
}
