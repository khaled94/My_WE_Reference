package com.ucare.we.newHome.features;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.lifecycle.ViewModelKt;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.ucare.we.R;
import com.ucare.we.view.FabBottomNavigation;
import defpackage.dbn;
import defpackage.dbp;
import defpackage.dxp;
import defpackage.dxq;
import defpackage.egv;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000d\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010\u001f\u001a\u00020 2\u0006\u0010!\u001a\u00020\"H\u0002J\u0018\u0010#\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010$\u001a\u00020%H\u0002J\u0018\u0010&\u001a\u00020 2\u0006\u0010!\u001a\u00020\"2\u0006\u0010'\u001a\u00020(H\u0002J\b\u0010)\u001a\u00020 H\u0002J\b\u0010*\u001a\u00020 H\u0017J\u0012\u0010+\u001a\u00020 2\b\u0010,\u001a\u0004\u0018\u00010-H\u0014J\b\u0010.\u001a\u00020 H\u0014J\u0010\u0010/\u001a\u00020 2\u0006\u00100\u001a\u000201H\u0002R\u001e\u0010\u0003\u001a\u00020\u00048\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0005\u0010\u0006\"\u0004\b\u0007\u0010\bR\u000e\u0010\t\u001a\u00020\nX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u000b\u001a\u00020\fX\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u000e\u0010\u0017\u001a\u00020\u0018X\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u0019\u001a\u00020\u001a8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\u001b\u0010\u001c\"\u0004\b\u001d\u0010\u001e¨\u00062"}, d2 = {"Lcom/ucare/we/newHome/features/AnonymousNewHomeActivity;", "Lcom/ucare/we/injection/BaseActivity;", "()V", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "faBottomBar", "Lcom/ucare/we/view/FabBottomNavigation;", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "getFab", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "setFab", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "ft", "Landroidx/fragment/app/FragmentTransaction;", "homeViewModel", "Lcom/ucare/we/newHome/features/HomeViewModel;", "getHomeViewModel", "()Lcom/ucare/we/newHome/features/HomeViewModel;", "setHomeViewModel", "(Lcom/ucare/we/newHome/features/HomeViewModel;)V", "changeFragment", "", "fm", "Landroidx/fragment/app/Fragment;", "changeFragmentWithBackStack", "fmName", "", "changeFragmentWithFlag", "guestFlag", "", "initViews", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "onResume", "updateBottomNavigationIcons", "selectedItem", "", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class AnonymousNewHomeActivity extends czy {
    @Inject
    public dbp a;
    @Inject
    public dio b;
    public FloatingActionButton c;
    private FabBottomNavigation d;
    private FragmentTransaction e;
    private FragmentManager f;

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(MenuItem menuItem) {
        dqc.d(menuItem, "it");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void a(View view) {
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void b(MenuItem menuItem) {
        dqc.d(menuItem, "it");
    }

    public AnonymousNewHomeActivity() {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        dqc.b(beginTransaction, "supportFragmentManager.beginTransaction()");
        this.e = beginTransaction;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        dqc.b(supportFragmentManager, "supportFragmentManager");
        this.f = supportFragmentManager;
    }

    private dbp a() {
        dbp dbpVar = this.a;
        if (dbpVar != null) {
            return dbpVar;
        }
        dqc.a("homeViewModel");
        throw null;
    }

    private FloatingActionButton b() {
        FloatingActionButton floatingActionButton = this.c;
        if (floatingActionButton != null) {
            return floatingActionButton;
        }
        dqc.a("fab");
        throw null;
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_home_new_anonnymous);
        View findViewById = findViewById(R.id.llMask);
        dqc.b(findViewById, "findViewById(R.id.llMask)");
        LinearLayoutCompat linearLayoutCompat = (LinearLayoutCompat) findViewById;
        View findViewById2 = findViewById(R.id.fab_bottom_bar);
        dqc.b(findViewById2, "findViewById(R.id.fab_bottom_bar)");
        FabBottomNavigation fabBottomNavigation = (FabBottomNavigation) findViewById2;
        this.d = fabBottomNavigation;
        if (fabBottomNavigation != null) {
            fabBottomNavigation.setOnNavigationItemReselectedListener($$Lambda$AnonymousNewHomeActivity$4OthuNQwVgoYjeeJhhDy9huPUww.INSTANCE);
            View findViewById3 = findViewById(R.id.fab);
            dqc.b(findViewById3, "findViewById(R.id.fab)");
            FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById3;
            dqc.d(floatingActionButton, "<set-?>");
            this.c = floatingActionButton;
            linearLayoutCompat.setVisibility(8);
            FabBottomNavigation fabBottomNavigation2 = this.d;
            if (fabBottomNavigation2 == null) {
                dqc.a("faBottomBar");
                throw null;
            }
            fabBottomNavigation2.setVisibility(0);
            b().setClickable(false);
            b().setEnabled(true);
            FabBottomNavigation fabBottomNavigation3 = this.d;
            if (fabBottomNavigation3 == null) {
                dqc.a("faBottomBar");
                throw null;
            }
            fabBottomNavigation3.setOnNavigationItemReselectedListener($$Lambda$AnonymousNewHomeActivity$EW9yPCOvk0_Xx_eoJvqxRlZOhhg.INSTANCE);
            FabBottomNavigation fabBottomNavigation4 = this.d;
            if (fabBottomNavigation4 == null) {
                dqc.a("faBottomBar");
                throw null;
            }
            fabBottomNavigation4.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: com.ucare.we.newHome.features.-$$Lambda$AnonymousNewHomeActivity$PUrR3baYjNVYtmuSMU47DksC78o
                @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
                public final boolean onNavigationItemSelected(MenuItem menuItem) {
                    boolean a;
                    a = AnonymousNewHomeActivity.a(AnonymousNewHomeActivity.this, menuItem);
                    return a;
                }
            });
            FabBottomNavigation fabBottomNavigation5 = this.d;
            if (fabBottomNavigation5 == null) {
                dqc.a("faBottomBar");
                throw null;
            }
            fabBottomNavigation5.setItemIconTintList(null);
            fabBottomNavigation5.getMenu().getItem(1).setEnabled(false);
            fabBottomNavigation5.getMenu().getItem(1).setCheckable(false);
            fabBottomNavigation5.getMenu().getItem(2).setEnabled(false);
            fabBottomNavigation5.getMenu().getItem(2).setCheckable(false);
            fabBottomNavigation5.getMenu().getItem(3).setCheckable(false);
            fabBottomNavigation5.getMenu().getItem(3).setEnabled(false);
            b().setOnClickListener($$Lambda$AnonymousNewHomeActivity$Drtu4Jvw46NPF69xacY1bizfRn0.INSTANCE);
            getSupportFragmentManager().beginTransaction().replace(R.id.homeFragmentsContainer, new dbo()).commit();
            return;
        }
        dqc.a("faBottomBar");
        throw null;
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public final void onResume() {
        super.onResume();
        try {
            dta.a(ViewModelKt.getViewModelScope(r1), (dnw) null, new dxp.a(new dxq.a(dxn.a(new dbn.a(a().a, null, null)), new dbp.a(null)), null), 3);
        } catch (Exception e) {
            egv.a aVar = egv.a;
            e.printStackTrace();
            aVar.b(dmg.a.toString(), new Object[0]);
        }
        egv.a.b(a().toString(), new Object[0]);
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean a(AnonymousNewHomeActivity anonymousNewHomeActivity, MenuItem menuItem) {
        dqc.d(anonymousNewHomeActivity, "this$0");
        dqc.d(menuItem, "it");
        switch (menuItem.getItemId()) {
            case R.id.navHome /* 2131362626 */:
                anonymousNewHomeActivity.a(0);
                anonymousNewHomeActivity.a(new dbo());
                return true;
            case R.id.navInbox /* 2131362627 */:
            case R.id.navLiveChat /* 2131362628 */:
                break;
            case R.id.navMore /* 2131362629 */:
                anonymousNewHomeActivity.a(4);
                anonymousNewHomeActivity.a(new dbq());
                break;
            case R.id.navPromotions /* 2131362630 */:
                return true;
            default:
                return false;
        }
        return true;
    }

    private final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        dqc.b(beginTransaction, "supportFragmentManager.beginTransaction()");
        this.e = beginTransaction;
        beginTransaction.replace(R.id.homeFragmentsContainer, fragment);
        this.e.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.e.commit();
    }

    private final void a(int i) {
        int i2 = 0;
        Integer valueOf = Integer.valueOf((int) R.drawable.ic_nav_inbox_selected);
        List b = dmq.b(Integer.valueOf((int) R.drawable.ic_nav_home_selected), Integer.valueOf((int) R.drawable.ic_nav_promotion_selected), valueOf, valueOf, Integer.valueOf((int) R.drawable.ic_nav_more_selected));
        Integer valueOf2 = Integer.valueOf((int) R.drawable.ic_inbox);
        List b2 = dmq.b(Integer.valueOf((int) R.drawable.ic_nav_home), Integer.valueOf((int) R.drawable.ic_nav_promotion), valueOf2, valueOf2, Integer.valueOf((int) R.drawable.ic_nav_more));
        FabBottomNavigation fabBottomNavigation = this.d;
        if (fabBottomNavigation == null) {
            dqc.a("faBottomBar");
            throw null;
        }
        Menu menu = fabBottomNavigation.getMenu();
        dqc.b(menu, "faBottomBar.getMenu()");
        int size = menu.size();
        if (size > 0) {
            while (true) {
                int i3 = i2 + 1;
                MenuItem item = menu.getItem(i2);
                dqc.b(item, "getItem(index)");
                if (i2 != 2) {
                    item.setIcon(((Number) b2.get(i2)).intValue());
                }
                if (i3 >= size) {
                    break;
                }
                i2 = i3;
            }
        }
        FabBottomNavigation fabBottomNavigation2 = this.d;
        if (fabBottomNavigation2 == null) {
            dqc.a("faBottomBar");
            throw null;
        }
        Menu menu2 = fabBottomNavigation2.getMenu();
        dqc.b(menu2, "faBottomBar.getMenu()");
        MenuItem item2 = menu2.getItem(i);
        dqc.b(item2, "getItem(index)");
        item2.setIcon(((Number) b.get(i)).intValue());
    }

    @Override // defpackage.czy, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        FabBottomNavigation fabBottomNavigation = this.d;
        if (fabBottomNavigation == null) {
            dqc.a("faBottomBar");
            throw null;
        } else if (fabBottomNavigation.getMenu().getItem(0).isChecked()) {
            super.onBackPressed();
            finishAffinity();
        } else {
            FabBottomNavigation fabBottomNavigation2 = this.d;
            if (fabBottomNavigation2 == null) {
                dqc.a("faBottomBar");
                throw null;
            } else if (fabBottomNavigation2.getMenu().getItem(2).isChecked()) {
                if (this.f.getBackStackEntryCount() > 0) {
                    this.f.popBackStack();
                    return;
                }
                startActivity(new Intent(this, AnonymousNewHomeActivity.class));
                finish();
            } else {
                startActivity(new Intent(this, AnonymousNewHomeActivity.class));
                finish();
            }
        }
    }
}
