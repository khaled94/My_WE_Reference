package androidx.navigation;

import android.app.Activity;
import android.app.PendingIntent;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import androidx.core.app.TaskStackBuilder;
import androidx.navigation.Navigator;
import java.util.ArrayDeque;
import java.util.Iterator;

/* loaded from: classes.dex */
public final class NavDeepLinkBuilder {
    private Bundle mArgs;
    private final Context mContext;
    private int mDestId;
    private NavGraph mGraph;
    private final Intent mIntent;

    public NavDeepLinkBuilder(Context context) {
        Intent intent;
        this.mContext = context;
        if (context instanceof Activity) {
            Context context2 = this.mContext;
            intent = new Intent(context2, context2.getClass());
        } else {
            intent = context.getPackageManager().getLaunchIntentForPackage(this.mContext.getPackageName());
            if (intent == null) {
                intent = new Intent();
            }
        }
        this.mIntent = intent;
        intent.addFlags(268468224);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public NavDeepLinkBuilder(NavController navController) {
        this(navController.getContext());
        this.mGraph = navController.getGraph();
    }

    public final NavDeepLinkBuilder setComponentName(Class<? extends Activity> cls) {
        return setComponentName(new ComponentName(this.mContext, cls));
    }

    public final NavDeepLinkBuilder setComponentName(ComponentName componentName) {
        this.mIntent.setComponent(componentName);
        return this;
    }

    public final NavDeepLinkBuilder setGraph(int i) {
        return setGraph(new NavInflater(this.mContext, new PermissiveNavigatorProvider()).inflate(i));
    }

    public final NavDeepLinkBuilder setGraph(NavGraph navGraph) {
        this.mGraph = navGraph;
        if (this.mDestId != 0) {
            fillInIntent();
        }
        return this;
    }

    public final NavDeepLinkBuilder setDestination(int i) {
        this.mDestId = i;
        if (this.mGraph != null) {
            fillInIntent();
        }
        return this;
    }

    private void fillInIntent() {
        ArrayDeque arrayDeque = new ArrayDeque();
        arrayDeque.add(this.mGraph);
        NavDestination navDestination = null;
        while (!arrayDeque.isEmpty() && navDestination == null) {
            NavDestination navDestination2 = (NavDestination) arrayDeque.poll();
            if (navDestination2.getId() == this.mDestId) {
                navDestination = navDestination2;
            } else if (navDestination2 instanceof NavGraph) {
                Iterator<NavDestination> it = ((NavGraph) navDestination2).iterator();
                while (it.hasNext()) {
                    arrayDeque.add(it.next());
                }
            }
        }
        if (navDestination == null) {
            String displayName = NavDestination.getDisplayName(this.mContext, this.mDestId);
            throw new IllegalArgumentException("Navigation destination " + displayName + " cannot be found in the navigation graph " + this.mGraph);
        }
        this.mIntent.putExtra("android-support-nav:controller:deepLinkIds", navDestination.buildDeepLinkIds());
    }

    public final NavDeepLinkBuilder setArguments(Bundle bundle) {
        this.mArgs = bundle;
        this.mIntent.putExtra("android-support-nav:controller:deepLinkExtras", bundle);
        return this;
    }

    public final TaskStackBuilder createTaskStackBuilder() {
        if (this.mIntent.getIntArrayExtra("android-support-nav:controller:deepLinkIds") == null) {
            if (this.mGraph == null) {
                throw new IllegalStateException("You must call setGraph() before constructing the deep link");
            }
            throw new IllegalStateException("You must call setDestination() before constructing the deep link");
        }
        TaskStackBuilder addNextIntentWithParentStack = TaskStackBuilder.create(this.mContext).addNextIntentWithParentStack(new Intent(this.mIntent));
        for (int i = 0; i < addNextIntentWithParentStack.getIntentCount(); i++) {
            addNextIntentWithParentStack.editIntentAt(i).putExtra(NavController.KEY_DEEP_LINK_INTENT, this.mIntent);
        }
        return addNextIntentWithParentStack;
    }

    public final PendingIntent createPendingIntent() {
        Bundle bundle = this.mArgs;
        int i = 0;
        if (bundle != null) {
            int i2 = 0;
            for (String str : bundle.keySet()) {
                Object obj = this.mArgs.get(str);
                i2 = (i2 * 31) + (obj != null ? obj.hashCode() : 0);
            }
            i = i2;
        }
        return createTaskStackBuilder().getPendingIntent((i * 31) + this.mDestId, 134217728);
    }

    /* loaded from: classes.dex */
    static class PermissiveNavigatorProvider extends NavigatorProvider {
        private final Navigator<NavDestination> mDestNavigator = new Navigator<NavDestination>() { // from class: androidx.navigation.NavDeepLinkBuilder.PermissiveNavigatorProvider.1
            @Override // androidx.navigation.Navigator
            public NavDestination createDestination() {
                return new NavDestination("permissive");
            }

            @Override // androidx.navigation.Navigator
            public NavDestination navigate(NavDestination navDestination, Bundle bundle, NavOptions navOptions, Navigator.Extras extras) {
                throw new IllegalStateException("navigate is not supported");
            }

            @Override // androidx.navigation.Navigator
            public boolean popBackStack() {
                throw new IllegalStateException("popBackStack is not supported");
            }
        };

        PermissiveNavigatorProvider() {
            addNavigator(new NavGraphNavigator(this));
        }

        @Override // androidx.navigation.NavigatorProvider
        public Navigator<? extends NavDestination> getNavigator(String str) {
            try {
                return super.getNavigator(str);
            } catch (IllegalStateException unused) {
                return this.mDestNavigator;
            }
        }
    }
}