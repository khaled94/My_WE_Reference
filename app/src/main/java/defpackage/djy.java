package defpackage;

import android.app.Activity;
import android.view.View;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.drawerlayout.widget.DrawerLayout;
import com.ucare.we.R;
import javax.inject.Inject;

/* renamed from: djy  reason: default package */
/* loaded from: classes2.dex */
public final class djy extends ActionBarDrawerToggle {
    @Inject
    djb a;
    private View b;

    public djy(Activity activity, View view, DrawerLayout drawerLayout) {
        super(activity, drawerLayout, null, R.string.navigation_drawer_open, R.string.navigation_drawer_close);
        dad.a().a.inject(this);
        this.b = view;
    }

    @Override // androidx.appcompat.app.ActionBarDrawerToggle, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void onDrawerSlide(View view, float f) {
        float f2 = 0.19999999f * f;
        float f3 = 1.0f - f2;
        this.b.setScaleX(f3);
        this.b.setScaleY(f3);
        this.b.setTranslationX(((view.getWidth() * f) - ((this.b.getWidth() * f2) / 2.0f)) * (-1.0f));
    }

    @Override // androidx.appcompat.app.ActionBarDrawerToggle, androidx.drawerlayout.widget.DrawerLayout.DrawerListener
    public final void onDrawerClosed(View view) {
        super.onDrawerClosed(view);
    }
}
