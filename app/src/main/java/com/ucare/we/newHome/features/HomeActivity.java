package com.ucare.we.newHome.features;

import android.content.Intent;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import androidx.core.content.ContextCompat;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import androidx.recyclerview.widget.ItemTouchHelper;
import com.android.volley.VolleyError;
import com.google.android.material.badge.BadgeDrawable;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.chatwithus.ChatWithUsActivity;
import com.ucare.we.model.FMCModel.FMCMemebrsResponse;
import com.ucare.we.view.FabBottomNavigation;
import defpackage.au;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0010\u0010:\u001a\u00020;2\u0006\u0010<\u001a\u00020=H\u0002J\u0018\u0010>\u001a\u00020;2\u0006\u0010<\u001a\u00020=2\u0006\u0010?\u001a\u00020@H\u0002J\u0006\u0010A\u001a\u00020;J\u0006\u0010B\u001a\u00020;J\b\u0010C\u001a\u00020;H\u0003J\b\u0010D\u001a\u00020;H\u0002J\b\u0010E\u001a\u00020;H\u0017J\u0012\u0010F\u001a\u00020;2\b\u0010G\u001a\u0004\u0018\u00010HH\u0014J\u000e\u0010I\u001a\u00020;2\u0006\u0010J\u001a\u00020\u0004J\u000e\u0010K\u001a\u00020;2\u0006\u0010L\u001a\u00020\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\u0006R\u0014\u0010\t\u001a\u00020\u0004X\u0086D¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u0006R\u001e\u0010\u000b\u001a\u00020\f8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0011\u001a\u00020\u0012X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\u00020\u0018X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\u0019\u0010\u001a\"\u0004\b\u001b\u0010\u001cR\u000e\u0010\u001d\u001a\u00020\u001eX\u0082.¢\u0006\u0002\n\u0000R\u001a\u0010\u001f\u001a\u00020 X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b!\u0010\"\"\u0004\b#\u0010$R\u000e\u0010%\u001a\u00020&X\u0082\u000e¢\u0006\u0002\n\u0000R\u000e\u0010'\u001a\u00020(X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010)\u001a\b\u0012\u0004\u0012\u00020+0*X\u0082\u0004¢\u0006\u0002\n\u0000R\u001e\u0010,\u001a\u00020-8\u0006@\u0006X\u0087.¢\u0006\u000e\n\u0000\u001a\u0004\b.\u0010/\"\u0004\b0\u00101R*\u00102\u001a\u0012\u0012\u0004\u0012\u00020403j\b\u0012\u0004\u0012\u000204`5X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b6\u00107\"\u0004\b8\u00109¨\u0006M"}, d2 = {"Lcom/ucare/we/newHome/features/HomeActivity;", "Lcom/ucare/we/injection/BaseActivity;", "()V", "SWIPE_MAX_OFF_PATH", "", "getSWIPE_MAX_OFF_PATH", "()I", "SWIPE_MIN_DISTANCE", "getSWIPE_MIN_DISTANCE", "SWIPE_THRESHOLD_VELOCITY", "getSWIPE_THRESHOLD_VELOCITY", "authenticationProvider", "Lcom/ucare/we/provider/auth/AuthenticationProvider;", "getAuthenticationProvider", "()Lcom/ucare/we/provider/auth/AuthenticationProvider;", "setAuthenticationProvider", "(Lcom/ucare/we/provider/auth/AuthenticationProvider;)V", "faBottomBar", "Lcom/ucare/we/view/FabBottomNavigation;", "getFaBottomBar", "()Lcom/ucare/we/view/FabBottomNavigation;", "setFaBottomBar", "(Lcom/ucare/we/view/FabBottomNavigation;)V", "fab", "Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "getFab", "()Lcom/google/android/material/floatingactionbutton/FloatingActionButton;", "setFab", "(Lcom/google/android/material/floatingactionbutton/FloatingActionButton;)V", "fmcMemebrsResponse", "Lcom/ucare/we/model/FMCModel/FMCMemebrsResponse;", "fragmentManager", "Landroidx/fragment/app/FragmentManager;", "getFragmentManager", "()Landroidx/fragment/app/FragmentManager;", "setFragmentManager", "(Landroidx/fragment/app/FragmentManager;)V", "ft", "Landroidx/fragment/app/FragmentTransaction;", "getFMCMembersErrorListener", "Lcom/android/volley/Response$ErrorListener;", "getFMCMembersSuccessListener", "Lcom/android/volley/Response$Listener;", "Lorg/json/JSONObject;", "homeViewModel", "Lcom/ucare/we/newHome/features/HomeViewModel;", "getHomeViewModel", "()Lcom/ucare/we/newHome/features/HomeViewModel;", "setHomeViewModel", "(Lcom/ucare/we/newHome/features/HomeViewModel;)V", "listOfTargets", "Ljava/util/ArrayList;", "Lco/kyash/targetinstructions/targets/Target;", "Lkotlin/collections/ArrayList;", "getListOfTargets", "()Ljava/util/ArrayList;", "setListOfTargets", "(Ljava/util/ArrayList;)V", "changeFragment", "", "fm", "Landroidx/fragment/app/Fragment;", "changeFragmentWithBackStack", "fmName", "", "getFMCMembers", "goBackHome", "initViews", "loadHomeFragment", "onBackPressed", "onCreate", "savedInstanceState", "Landroid/os/Bundle;", "updateBottomNavigationIcons", "selectedItem", "updateInboxCounter", "count", "app_googleProductionRelease"}, k = 1, mv = {1, 5, 1}, xi = 48)
/* loaded from: classes2.dex */
public final class HomeActivity extends czy {
    public FabBottomNavigation a;
    @Inject
    public dbp b;
    public FloatingActionButton c;
    @Inject
    public dio d;
    private FragmentTransaction f;
    private FragmentManager g;
    private FMCMemebrsResponse k;
    private final int h = 120;
    private final int i = 250;
    private final int j = ItemTouchHelper.Callback.DEFAULT_DRAG_ANIMATION_DURATION;
    public ArrayList<q> e = new ArrayList<>();
    private final au.b<JSONObject> l = new au.b() { // from class: com.ucare.we.newHome.features.-$$Lambda$HomeActivity$ytkmWQ-iXKEUWUDAoER_mhK7_Ig
        @Override // defpackage.au.b
        public final void onResponse(Object obj) {
            HomeActivity.m26lambda$ytkmWQiXKEUWUDAoER_mhK7_Ig(HomeActivity.this, (JSONObject) obj);
        }
    };
    private final au.a m = $$Lambda$HomeActivity$1QpsQeMtdXgN2vpWoqtUysrzMSo.INSTANCE;

    public static final void a(MenuItem menuItem) {
        dqc.d(menuItem, "it");
    }

    public static final void a(VolleyError volleyError) {
    }

    public static /* synthetic */ void lambda$mvwRLXBpcK2VTez4yToRsKTx2Lk(HomeActivity homeActivity, View view) {
        a(homeActivity, view);
    }

    /* renamed from: lambda$tQPa2Wgkjh6oqT4HqS-aB4g_anU */
    public static /* synthetic */ boolean m25lambda$tQPa2Wgkjh6oqT4HqSaB4g_anU(HomeActivity homeActivity, MenuItem menuItem) {
        return a(homeActivity, menuItem);
    }

    /* renamed from: lambda$ytkmWQ-iXKEUWUDAoER_mhK7_Ig */
    public static /* synthetic */ void m26lambda$ytkmWQiXKEUWUDAoER_mhK7_Ig(HomeActivity homeActivity, JSONObject jSONObject) {
        a(homeActivity, jSONObject);
    }

    public HomeActivity() {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        dqc.b(beginTransaction, "supportFragmentManager.beginTransaction()");
        this.f = beginTransaction;
        FragmentManager supportFragmentManager = getSupportFragmentManager();
        dqc.b(supportFragmentManager, "supportFragmentManager");
        this.g = supportFragmentManager;
    }

    private FabBottomNavigation a() {
        FabBottomNavigation fabBottomNavigation = this.a;
        if (fabBottomNavigation != null) {
            return fabBottomNavigation;
        }
        dqc.a("faBottomBar");
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
        if (n().O()) {
            try {
                djl.a(this).y(this.l, this.m);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        setContentView(R.layout.activity_home_new);
        View findViewById = findViewById(R.id.fab);
        dqc.b(findViewById, "findViewById(R.id.fab)");
        FloatingActionButton floatingActionButton = (FloatingActionButton) findViewById;
        dqc.d(floatingActionButton, "<set-?>");
        this.c = floatingActionButton;
        View findViewById2 = findViewById(R.id.fab_bottom_bar);
        dqc.b(findViewById2, "findViewById(R.id.fab_bottom_bar)");
        FabBottomNavigation fabBottomNavigation = (FabBottomNavigation) findViewById2;
        dqc.d(fabBottomNavigation, "<set-?>");
        this.a = fabBottomNavigation;
        a().setOnNavigationItemReselectedListener($$Lambda$HomeActivity$tEDFFmSqXrAoDO_rePtgJcdQPZA.INSTANCE);
        a().setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: com.ucare.we.newHome.features.-$$Lambda$HomeActivity$tQPa2Wgkjh6oqT4HqS-aB4g_anU
            @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return HomeActivity.m25lambda$tQPa2Wgkjh6oqT4HqSaB4g_anU(HomeActivity.this, menuItem);
            }
        });
        FabBottomNavigation a = a();
        a.setItemIconTintList(null);
        a.getMenu().getItem(2).setEnabled(false);
        a.getMenu().getItem(2).setCheckable(false);
        b().setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.newHome.features.-$$Lambda$HomeActivity$mvwRLXBpcK2VTez4yToRsKTx2Lk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                HomeActivity.lambda$mvwRLXBpcK2VTez4yToRsKTx2Lk(HomeActivity.this, view);
            }
        });
        getSupportFragmentManager().beginTransaction().replace(R.id.homeFragmentsContainer, new cwg()).commit();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public static final boolean a(HomeActivity homeActivity, MenuItem menuItem) {
        dqc.d(homeActivity, "this$0");
        dqc.d(menuItem, "it");
        switch (menuItem.getItemId()) {
            case R.id.navHome /* 2131362626 */:
                homeActivity.b(0);
                homeActivity.a(new cwg());
                return true;
            case R.id.navInbox /* 2131362627 */:
                homeActivity.b(3);
                homeActivity.a(new dft());
                return true;
            case R.id.navLiveChat /* 2131362628 */:
                break;
            case R.id.navMore /* 2131362629 */:
                homeActivity.b(4);
                homeActivity.a(new dfy());
                break;
            case R.id.navPromotions /* 2131362630 */:
                homeActivity.a().setVisibility(8);
                homeActivity.a().setVisibility(8);
                homeActivity.b().setVisibility(8);
                homeActivity.b(1);
                homeActivity.a(new czf());
                return true;
            default:
                return false;
        }
        return true;
    }

    public static final void a(HomeActivity homeActivity, View view) {
        dqc.d(homeActivity, "this$0");
        homeActivity.startActivity(new Intent(homeActivity, ChatWithUsActivity.class));
    }

    private final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        dqc.b(beginTransaction, "supportFragmentManager.beginTransaction()");
        this.f = beginTransaction;
        beginTransaction.replace(R.id.homeFragmentsContainer, fragment);
        this.f.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.f.commit();
    }

    private void b(int i) {
        int i2 = 0;
        Integer valueOf = Integer.valueOf((int) R.drawable.ic_nav_inbox_selected);
        List b = dmq.b(Integer.valueOf((int) R.drawable.ic_nav_home_selected), Integer.valueOf((int) R.drawable.ic_nav_promotion_selected), valueOf, valueOf, Integer.valueOf((int) R.drawable.ic_nav_more_selected));
        Integer valueOf2 = Integer.valueOf((int) R.drawable.ic_nav_inbox);
        List b2 = dmq.b(Integer.valueOf((int) R.drawable.ic_nav_home), Integer.valueOf((int) R.drawable.ic_nav_promotion), valueOf2, valueOf2, Integer.valueOf((int) R.drawable.ic_nav_more));
        Menu menu = a().getMenu();
        dqc.b(menu, "faBottomBar.menu");
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
        Menu menu2 = a().getMenu();
        dqc.b(menu2, "faBottomBar.menu");
        MenuItem item2 = menu2.getItem(i);
        dqc.b(item2, "getItem(index)");
        item2.setIcon(((Number) b.get(i)).intValue());
    }

    @Override // defpackage.czy, androidx.activity.ComponentActivity, android.app.Activity
    public final void onBackPressed() {
        if (a().getMenu().getItem(0).isChecked()) {
            super.onBackPressed();
            finishAffinity();
        } else if (a().getMenu().getItem(2).isChecked()) {
            if (this.g.getBackStackEntryCount() > 0) {
                this.g.popBackStack();
                return;
            }
            startActivity(new Intent(this, HomeActivity.class));
            finish();
            b(0);
        } else {
            startActivity(new Intent(this, HomeActivity.class));
            finish();
            b(0);
        }
    }

    public final void a(int i) {
        if (i > 0) {
            BadgeDrawable orCreateBadge = a().getOrCreateBadge(a().getMenu().getItem(3).getItemId());
            dqc.b(orCreateBadge, "faBottomBar.getOrCreateBadge(menuItemId)");
            orCreateBadge.setNumber(i);
            orCreateBadge.setBackgroundColor(ContextCompat.getColor(this, R.color.colorPrimary));
            return;
        }
        a().removeBadge(a().getMenu().getItem(3).getItemId());
    }

    public static final void a(HomeActivity homeActivity, JSONObject jSONObject) {
        dqc.d(homeActivity, "this$0");
        Object a = new Gson().a(jSONObject.toString(), (Class<Object>) FMCMemebrsResponse.class);
        dqc.b(a, "gson.fromJson(\n                response.toString(),\n                FMCMemebrsResponse::class.java\n            )");
        FMCMemebrsResponse fMCMemebrsResponse = (FMCMemebrsResponse) a;
        homeActivity.k = fMCMemebrsResponse;
        if (fMCMemebrsResponse != null) {
            if (!dqc.a((Object) fMCMemebrsResponse.getHeader().getResponseCode(), (Object) "0")) {
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            int i = 0;
            FMCMemebrsResponse fMCMemebrsResponse2 = homeActivity.k;
            if (fMCMemebrsResponse2 == null) {
                dqc.a("fmcMemebrsResponse");
                throw null;
            }
            int size = fMCMemebrsResponse2.getBody().getGroupMembers().size() - 1;
            if (size >= 0) {
                while (true) {
                    int i2 = i + 1;
                    FMCMemebrsResponse fMCMemebrsResponse3 = homeActivity.k;
                    if (fMCMemebrsResponse3 == null) {
                        dqc.a("fmcMemebrsResponse");
                        throw null;
                    }
                    if (dsg.b(fMCMemebrsResponse3.getBody().getGroupMembers().get(i).getNetworkType(), "MOBILE")) {
                        FMCMemebrsResponse fMCMemebrsResponse4 = homeActivity.k;
                        if (fMCMemebrsResponse4 != null) {
                            arrayList2.add(fMCMemebrsResponse4.getBody().getGroupMembers().get(i).getServiceNumber());
                        } else {
                            dqc.a("fmcMemebrsResponse");
                            throw null;
                        }
                    } else {
                        FMCMemebrsResponse fMCMemebrsResponse5 = homeActivity.k;
                        if (fMCMemebrsResponse5 == null) {
                            dqc.a("fmcMemebrsResponse");
                            throw null;
                        } else if (dsg.b(fMCMemebrsResponse5.getBody().getGroupMembers().get(i).getNetworkType(), "BROADBAND")) {
                            FMCMemebrsResponse fMCMemebrsResponse6 = homeActivity.k;
                            if (fMCMemebrsResponse6 != null) {
                                arrayList.add(fMCMemebrsResponse6.getBody().getGroupMembers().get(i).getServiceNumber());
                            } else {
                                dqc.a("fmcMemebrsResponse");
                                throw null;
                            }
                        }
                    }
                    if (i2 > size) {
                        break;
                    }
                    i = i2;
                }
            }
            homeActivity.n().b(arrayList);
            homeActivity.n().a(arrayList2);
            return;
        }
        dqc.a("fmcMemebrsResponse");
        throw null;
    }
}
