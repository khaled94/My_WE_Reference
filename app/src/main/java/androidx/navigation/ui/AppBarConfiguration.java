package androidx.navigation.ui;

import android.view.Menu;
import androidx.customview.widget.Openable;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.navigation.NavGraph;
import java.util.HashSet;
import java.util.Set;

/* loaded from: classes.dex */
public final class AppBarConfiguration {
    private final OnNavigateUpListener mFallbackOnNavigateUpListener;
    private final Openable mOpenableLayout;
    private final Set<Integer> mTopLevelDestinations;

    /* loaded from: classes.dex */
    public interface OnNavigateUpListener {
        boolean onNavigateUp();
    }

    private AppBarConfiguration(Set<Integer> set, Openable openable, OnNavigateUpListener onNavigateUpListener) {
        this.mTopLevelDestinations = set;
        this.mOpenableLayout = openable;
        this.mFallbackOnNavigateUpListener = onNavigateUpListener;
    }

    public final Set<Integer> getTopLevelDestinations() {
        return this.mTopLevelDestinations;
    }

    public final Openable getOpenableLayout() {
        return this.mOpenableLayout;
    }

    @Deprecated
    public final DrawerLayout getDrawerLayout() {
        Openable openable = this.mOpenableLayout;
        if (openable instanceof DrawerLayout) {
            return (DrawerLayout) openable;
        }
        return null;
    }

    public final OnNavigateUpListener getFallbackOnNavigateUpListener() {
        return this.mFallbackOnNavigateUpListener;
    }

    /* loaded from: classes.dex */
    public static final class Builder {
        private OnNavigateUpListener mFallbackOnNavigateUpListener;
        private Openable mOpenableLayout;
        private final Set<Integer> mTopLevelDestinations;

        public Builder(NavGraph navGraph) {
            HashSet hashSet = new HashSet();
            this.mTopLevelDestinations = hashSet;
            hashSet.add(Integer.valueOf(NavigationUI.findStartDestination(navGraph).getId()));
        }

        public Builder(Menu menu) {
            this.mTopLevelDestinations = new HashSet();
            int size = menu.size();
            for (int i = 0; i < size; i++) {
                this.mTopLevelDestinations.add(Integer.valueOf(menu.getItem(i).getItemId()));
            }
        }

        public Builder(int... iArr) {
            this.mTopLevelDestinations = new HashSet();
            for (int i : iArr) {
                this.mTopLevelDestinations.add(Integer.valueOf(i));
            }
        }

        public Builder(Set<Integer> set) {
            HashSet hashSet = new HashSet();
            this.mTopLevelDestinations = hashSet;
            hashSet.addAll(set);
        }

        @Deprecated
        public final Builder setDrawerLayout(DrawerLayout drawerLayout) {
            this.mOpenableLayout = drawerLayout;
            return this;
        }

        public final Builder setOpenableLayout(Openable openable) {
            this.mOpenableLayout = openable;
            return this;
        }

        public final Builder setFallbackOnNavigateUpListener(OnNavigateUpListener onNavigateUpListener) {
            this.mFallbackOnNavigateUpListener = onNavigateUpListener;
            return this;
        }

        public final AppBarConfiguration build() {
            return new AppBarConfiguration(this.mTopLevelDestinations, this.mOpenableLayout, this.mFallbackOnNavigateUpListener);
        }
    }
}
