package com.ucare.we.presentation.corporateprepaid;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
import android.net.Uri;
import android.os.Bundle;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.Toolbar;
import androidx.drawerlayout.widget.DrawerLayout;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentManager;
import androidx.fragment.app.FragmentTransaction;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.ucare.we.BalanceActivity;
import com.ucare.we.BalanceRechargeActivity;
import com.ucare.we.HelpAndSupport_Activity;
import com.ucare.we.NewRequestActivity;
import com.ucare.we.R;
import com.ucare.we.SettingActivity;
import com.ucare.we.SocialMediaActivity;
import com.ucare.we.SuspendAndResumeActivity;
import com.ucare.we.chatwithus.ChatWithUsActivity;
import com.ucare.we.model.AreasModel.Area;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.CitiesModel.City;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.StoreResponseBody;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.remote.pushnotification.NotificationCount;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.presentation.auth.signin.SignInActivity;
import com.ucare.we.presentation.inbox.NotificationInboxActivity;
import com.ucare.we.presentation.offers.OffersAndExtraActivity;
import com.ucare.we.presentation.search.SearchActivity;
import com.ucare.we.presentation.ussdddetails.USSDDetails;
import com.ucare.we.presentation.wepay.WePayActivity;
import com.ucare.we.switchaccount.ChooseAccountActivity;
import java.text.DecimalFormat;
import java.text.NumberFormat;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class CorporatePrePaidMainActivity extends czy implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener, cwj, czn, czs, dfx, dhk, dht {
    public static CorporatePrePaidMainActivity a;
    LinearLayout A;
    LinearLayout B;
    LinearLayout C;
    public Button H;
    private View J;
    private TextView K;
    private TextView L;
    private TextView M;
    private ImageView N;
    private Button O;
    private Button P;
    private TextView Q;
    private TextView R;
    private TextView S;
    private TextView T;
    private TextView U;
    private TextView V;
    private TextView W;
    private TextView X;
    private TextView Y;
    private BottomNavigationView.OnNavigationItemSelectedListener Z;
    @Inject
    protected djb b;
    @Inject
    protected dhp c;
    @Inject
    protected dio d;
    @Inject
    dhu e;
    @Inject
    djw f;
    @Inject
    djx g;
    @Inject
    dja h;
    @Inject
    dhn i;
    City k;
    Area l;
    public ImageView m;
    DrawerLayout n;
    BottomNavigationView o;
    NavigationView p;
    Toolbar q;
    public TextView r;
    TextView s;
    TextView t;
    TextView u;
    Context y;
    @Inject
    dfw z;
    FragmentManager j = getSupportFragmentManager();
    String x = "1";
    View.OnClickListener D = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateprepaid.CorporatePrePaidMainActivity.1
        {
            CorporatePrePaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporatePrePaidMainActivity.this.startActivity(new Intent(CorporatePrePaidMainActivity.this, ChooseAccountActivity.class));
        }
    };
    View.OnClickListener E = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateprepaid.CorporatePrePaidMainActivity.2
        {
            CorporatePrePaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporatePrePaidMainActivity.this.startActivity(new Intent(CorporatePrePaidMainActivity.this, SuspendAndResumeActivity.class));
        }
    };
    View.OnClickListener F = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateprepaid.-$$Lambda$CorporatePrePaidMainActivity$Q3_40Df6RAwNU9bpkuDMJFG8_fM
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporatePrePaidMainActivity.lambda$Q3_40Df6RAwNU9bpkuDMJFG8_fM(CorporatePrePaidMainActivity.this, view);
        }
    };
    View.OnClickListener G = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateprepaid.CorporatePrePaidMainActivity.3
        {
            CorporatePrePaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporatePrePaidMainActivity.this, NewRequestActivity.class);
            CorporatePrePaidMainActivity.this.n.closeDrawer(5);
            CorporatePrePaidMainActivity.this.startActivity(intent);
        }
    };
    private FragmentTransaction I = getSupportFragmentManager().beginTransaction();

    public static /* synthetic */ void lambda$Q3_40Df6RAwNU9bpkuDMJFG8_fM(CorporatePrePaidMainActivity corporatePrePaidMainActivity, View view) {
        corporatePrePaidMainActivity.a(view);
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
    }

    @Override // defpackage.dht
    public final void a(String str) {
    }

    @Override // defpackage.dht
    public final void a(String str, String str2) {
    }

    @Override // defpackage.dht
    public final void a(ArrayList<ExtrasList> arrayList) {
    }

    @Override // defpackage.dht
    public final void a(List<SummarizedLineUsageItem> list) {
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
    }

    @Override // defpackage.dht
    public final void a_(int i) {
    }

    @Override // defpackage.dht
    public final void a_(String str) {
    }

    @Override // defpackage.dht
    public final void b(int i, String str) {
    }

    @Override // defpackage.dht
    public final void b(String str) {
    }

    @Override // defpackage.dht
    public final void b(ArrayList<SpecialList> arrayList) {
    }

    @Override // defpackage.dht
    public final void b(List<MainPlanResponseBody> list) {
    }

    @Override // defpackage.dht
    public final void c(String str) {
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
    }

    @Override // defpackage.dht
    public final void e() {
    }

    @Override // defpackage.dht
    public final void e(String str) {
    }

    @Override // defpackage.dht
    public final void f() {
    }

    @Override // defpackage.dht
    public final void g() {
    }

    @Override // defpackage.dht
    public final void h() {
    }

    @Override // defpackage.dht
    public final void i() {
    }

    @Override // defpackage.dht
    public final void j() {
    }

    @Override // android.app.Activity
    public boolean onCreateOptionsMenu(Menu menu) {
        return true;
    }

    @Override // defpackage.dht
    public final void p_() {
    }

    @Override // defpackage.dht
    public final void q_() {
    }

    @Override // defpackage.dht
    public final void r_() {
    }

    @Override // defpackage.dht
    public final void s_() {
    }

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(this, OffersAndExtraActivity.class));
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a = this;
        setContentView(R.layout.activity_corporate_pre_paid_main);
        View findViewById = findViewById(R.id.content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.q = toolbar;
        setSupportActionBar(toolbar);
        this.r = (TextView) findViewById(R.id.tv_title_account);
        this.M = (TextView) findViewById(R.id.tv_title_account);
        Button button = (Button) findViewById(R.id.btnSwitch);
        this.H = button;
        button.setOnClickListener(this.D);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.n = drawerLayout;
        drawerLayout.setScrimColor(0);
        this.y = this;
        djy djyVar = new djy(this, findViewById, this.n);
        this.n.addDrawerListener(djyVar);
        djyVar.syncState();
        this.q.findViewById(R.id.hamburger).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateprepaid.CorporatePrePaidMainActivity.4
            {
                CorporatePrePaidMainActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (CorporatePrePaidMainActivity.this.n.isDrawerOpen(5)) {
                    CorporatePrePaidMainActivity.this.n.closeDrawer(5);
                } else {
                    CorporatePrePaidMainActivity.this.n.openDrawer(5);
                }
                CorporatePrePaidMainActivity.this.z.a();
                djm.b(CorporatePrePaidMainActivity.this);
            }
        });
        djm.c(this);
        ((ImageView) findViewById(R.id.searchImageView)).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateprepaid.CorporatePrePaidMainActivity.5
            {
                CorporatePrePaidMainActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CorporatePrePaidMainActivity.this.startActivity(new Intent(CorporatePrePaidMainActivity.this, SearchActivity.class));
            }
        });
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        this.p = navigationView;
        navigationView.setNavigationItemSelectedListener(this);
        this.p.setItemIconTintList(null);
        ImageView imageView = (ImageView) findViewById(R.id.iv_logo);
        this.m = imageView;
        imageView.setOnClickListener(this);
        this.Z = new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: com.ucare.we.presentation.corporateprepaid.CorporatePrePaidMainActivity.6
            {
                CorporatePrePaidMainActivity.this = this;
            }

            @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home /* 2131362641 */:
                        if (!CorporatePrePaidMainActivity.this.o.getMenu().getItem(0).isChecked()) {
                            CorporatePrePaidMainActivity.this.b(0);
                            CorporatePrePaidMainActivity.this.a(new ddv());
                            CorporatePrePaidMainActivity.this.r.setVisibility(8);
                            CorporatePrePaidMainActivity.this.M.setVisibility(8);
                            CorporatePrePaidMainActivity.this.H.setVisibility(8);
                            if (CorporatePrePaidMainActivity.this.d.a()) {
                                CorporatePrePaidMainActivity.this.m.setVisibility(0);
                            } else {
                                CorporatePrePaidMainActivity.this.m.setVisibility(8);
                            }
                            CorporatePrePaidMainActivity.this.q.setVisibility(0);
                        }
                        return true;
                    case R.id.navigation_my_account /* 2131362642 */:
                        if (!CorporatePrePaidMainActivity.this.o.getMenu().getItem(3).isChecked() && CorporatePrePaidMainActivity.this.d.a()) {
                            CorporatePrePaidMainActivity.this.b(3);
                            CorporatePrePaidMainActivity.this.a(new dfy());
                            CorporatePrePaidMainActivity.this.r.setVisibility(8);
                            CorporatePrePaidMainActivity.this.M.setVisibility(8);
                            CorporatePrePaidMainActivity.this.H.setVisibility(8);
                            CorporatePrePaidMainActivity.this.M.setText(CorporatePrePaidMainActivity.this.getString(R.string.my_account));
                            CorporatePrePaidMainActivity.this.m.setVisibility(8);
                            CorporatePrePaidMainActivity.this.q.setVisibility(8);
                        }
                        return true;
                    case R.id.navigation_promotions /* 2131362643 */:
                        if (!CorporatePrePaidMainActivity.this.o.getMenu().getItem(1).isChecked()) {
                            CorporatePrePaidMainActivity.this.b(1);
                            CorporatePrePaidMainActivity.this.a(new czf());
                            CorporatePrePaidMainActivity.this.r.setVisibility(0);
                            CorporatePrePaidMainActivity.this.r.setText(CorporatePrePaidMainActivity.this.getString(R.string.title_promotions));
                            CorporatePrePaidMainActivity.this.H.setVisibility(8);
                            CorporatePrePaidMainActivity.this.m.setVisibility(8);
                            CorporatePrePaidMainActivity.this.q.setVisibility(8);
                        }
                        return true;
                    case R.id.navigation_store_locator /* 2131362644 */:
                        if (!CorporatePrePaidMainActivity.this.o.getMenu().getItem(2).isChecked()) {
                            CorporatePrePaidMainActivity.this.b(2);
                            CorporatePrePaidMainActivity.this.a(czh.a(false));
                            CorporatePrePaidMainActivity.this.r.setText(CorporatePrePaidMainActivity.this.getString(R.string.title_store_locator));
                            CorporatePrePaidMainActivity.this.r.setVisibility(0);
                            CorporatePrePaidMainActivity.this.H.setVisibility(8);
                            CorporatePrePaidMainActivity.this.m.setVisibility(8);
                            CorporatePrePaidMainActivity.this.q.setVisibility(0);
                        }
                        return true;
                    default:
                        return true;
                }
            }
        };
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        this.o = bottomNavigationView;
        bottomNavigationView.setOnNavigationItemSelectedListener(this.Z);
        this.o.getMenu().getItem(0).setIcon(R.drawable.home_selected);
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) this.o.getChildAt(0);
        for (int i = 0; i < bottomNavigationMenuView.getChildCount(); i++) {
            View findViewById2 = bottomNavigationMenuView.getChildAt(i).findViewById(R.id.icon);
            ViewGroup.LayoutParams layoutParams = findViewById2.getLayoutParams();
            getResources().getDisplayMetrics();
            BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) bottomNavigationMenuView.getChildAt(i);
            bottomNavigationItemView.setLabelVisibilityMode(1);
            bottomNavigationItemView.setChecked(false);
            layoutParams.height = (int) getResources().getDimension(R.dimen.bottom_navigation_icon_size);
            layoutParams.width = (int) getResources().getDimension(R.dimen.bottom_navigation_icon_size);
            findViewById2.setLayoutParams(layoutParams);
        }
        this.o.setItemIconTintList(null);
        Bundle bundle2 = new Bundle();
        bundle2.putString("params", this.x);
        ddv ddvVar = new ddv();
        ddvVar.setArguments(bundle2);
        a(ddvVar);
        View headerView = this.p.getHeaderView(0);
        this.J = headerView;
        this.K = (TextView) headerView.findViewById(R.id.tv_balance);
        this.A = (LinearLayout) this.J.findViewById(R.id.llOutstandingContainer);
        this.O = (Button) this.J.findViewById(R.id.btn_balance_services);
        this.P = (Button) this.J.findViewById(R.id.btn_recharge);
        this.Q = (TextView) this.J.findViewById(R.id.txtFAQ);
        this.R = (TextView) this.J.findViewById(R.id.txtAppSettings);
        this.S = (TextView) this.J.findViewById(R.id.tvLiveChat);
        this.T = (TextView) this.J.findViewById(R.id.txtFollowUs);
        this.U = (TextView) this.J.findViewById(R.id.txtLogOut);
        this.N = (ImageView) this.J.findViewById(R.id.iv_balance);
        this.L = (TextView) this.J.findViewById(R.id.tv_current_balance);
        TextView textView = (TextView) this.J.findViewById(R.id.offerAndExtras);
        this.u = textView;
        textView.setOnClickListener(this.F);
        this.O.setOnClickListener(this);
        this.P.setOnClickListener(this);
        this.Q.setOnClickListener(this);
        this.R.setOnClickListener(this);
        this.S.setOnClickListener(this);
        this.T.setOnClickListener(this);
        this.U.setOnClickListener(this);
        this.V = (TextView) this.J.findViewById(R.id.tvUSSDCode);
        this.X = (TextView) this.J.findViewById(R.id.txtInbox);
        this.Y = (TextView) this.J.findViewById(R.id.tvNotificationCount);
        this.W = (TextView) this.J.findViewById(R.id.txtWePay);
        this.t = (TextView) this.J.findViewById(R.id.tvNewRequest);
        this.C = (LinearLayout) this.J.findViewById(R.id.newRequestLinearLayout);
        this.t.setOnClickListener(this.G);
        this.V.setOnClickListener(this);
        this.X.setOnClickListener(this);
        this.W.setOnClickListener(this);
        this.B = (LinearLayout) this.J.findViewById(R.id.icSuspendReactivateServiceLinearLayout);
        TextView textView2 = (TextView) this.J.findViewById(R.id.icSuspendReactivateService);
        this.s = textView2;
        textView2.setOnClickListener(this.E);
        this.J.findViewById(R.id.btn_sign_in).setOnClickListener(this);
        b(!this.d.a());
        try {
            if (!this.f.f() || this.f.Q() || !this.i.f.isFeatureSuspendandResume()) {
                this.s.setVisibility(8);
                this.B.setVisibility(8);
            }
        } catch (Exception unused) {
            this.s.setVisibility(8);
            this.B.setVisibility(8);
        }
        if (this.d.h()) {
            if (this.c.g != null && this.c.g.getSuspendAndResumeSideMenuItem().contains(this.f.w())) {
                this.s.setVisibility(0);
                this.B.setVisibility(0);
            } else {
                this.s.setVisibility(8);
                this.B.setVisibility(8);
            }
        }
        this.A.setVisibility(this.c.m().booleanValue() ? 0 : 8);
        this.P.setVisibility(this.c.k().booleanValue() ? 0 : 8);
        if (this.c.c().booleanValue()) {
            this.t.setVisibility(0);
            this.C.setVisibility(0);
            return;
        }
        this.t.setVisibility(8);
        this.C.setVisibility(8);
    }

    public void b(int i) {
        if (i == 0) {
            this.o.getMenu().getItem(0).setIcon(R.drawable.home_selected);
        } else {
            this.o.getMenu().getItem(0).setIcon(R.drawable.home);
        }
        if (i == 1) {
            this.o.getMenu().getItem(1).setIcon(R.drawable.promotions_selected);
        } else {
            this.o.getMenu().getItem(1).setIcon(R.drawable.promotions);
        }
        if (i == 2) {
            this.o.getMenu().getItem(2).setIcon(R.drawable.storelocator_selected);
        } else {
            this.o.getMenu().getItem(2).setIcon(R.drawable.storelocator);
        }
        if (i == 3) {
            this.o.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
            return;
        }
        this.o.getMenu().getItem(3).setIcon(R.drawable.my_account);
        if (this.d.a()) {
            return;
        }
        this.o.getMenu().getItem(3).getIcon().mutate().setAlpha(50);
    }

    @Override // defpackage.czy, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(5)) {
            drawerLayout.closeDrawer(5);
        } else if (this.o.getMenu().getItem(0).isChecked()) {
            super.onBackPressed();
            finishAffinity();
        } else if (this.o.getMenu().getItem(2).isChecked()) {
            if (this.j.getBackStackEntryCount() > 0) {
                this.j.popBackStack();
                return;
            }
            this.o.getMenu().getItem(0).setIcon(R.drawable.home_selected);
            this.o.getMenu().getItem(0).setChecked(true);
            b(0);
            a(new ddv());
            this.r.setVisibility(8);
            this.H.setVisibility(8);
            if (!this.d.a()) {
                return;
            }
            this.m.setVisibility(0);
        } else {
            this.o.getMenu().getItem(0).setIcon(R.drawable.home_selected);
            this.o.getMenu().getItem(0).setChecked(true);
            b(0);
            a(new ddv());
            this.r.setVisibility(8);
            this.H.setVisibility(8);
            if (!this.d.a()) {
                return;
            }
            this.m.setVisibility(0);
        }
    }

    @Override // android.app.Activity
    public boolean onOptionsItemSelected(MenuItem menuItem) {
        menuItem.getItemId();
        return super.onOptionsItemSelected(menuItem);
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
    }

    @Override // com.google.android.material.navigation.NavigationView.OnNavigationItemSelectedListener
    public boolean onNavigationItemSelected(MenuItem menuItem) {
        int itemId = menuItem.getItemId();
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (itemId == R.id.nav_logout) {
            this.d.a(this.y);
            return true;
        } else if (itemId == R.id.nav_settings) {
            this.g.b(this, SettingActivity.class);
            drawerLayout.closeDrawer(5);
            return true;
        } else if (itemId == R.id.nav_live_chat) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3="));
            startActivity(intent);
            drawerLayout.closeDrawer(5);
            return true;
        } else if (itemId != R.id.nav_faq) {
            if (itemId != R.id.nav_follow) {
                return true;
            }
            this.g.b(this, SocialMediaActivity.class);
            drawerLayout.closeDrawer(5);
            return true;
        } else if (this.b.f()) {
            if (this.i.f == null) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://te.eg/wps/portal/te/Personal?1dmy&urile=wcm%3apath%3a%2Fte%2Fhelp%2Ffaq%2Ffaq")));
                drawerLayout.closeDrawer(5);
                return true;
            }
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.i.f.getFaqAr())));
            drawerLayout.closeDrawer(5);
            return true;
        } else if (this.i.f == null) {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://te.eg/wps/portal/te/Personal?1dmy&urile=wcm%3apath%3a%2Fte%2Fhelp%2Ffaq%2Ffaq")));
            drawerLayout.closeDrawer(5);
            return true;
        } else {
            startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.i.f.getFaqEn())));
            drawerLayout.closeDrawer(5);
            return true;
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        ((DrawerLayout) findViewById(R.id.drawer_layout)).closeDrawer(5);
        super.onConfigurationChanged(configuration);
        this.b.a();
    }

    public final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content_main, fragment);
        beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        beginTransaction.commit();
    }

    private void a(Fragment fragment, String str) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.I = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment, str);
        if (this.j.findFragmentByTag(str) == null) {
            this.I.addToBackStack(str);
        }
        this.I.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.I.commit();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.d.b(this);
        this.e.b(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        this.d.a((dhk) this);
        this.e.a(this);
        this.z.a(this);
        this.z.a();
        super.onResume();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.d.b(this);
        this.e.b(this);
        super.onPause();
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        if (i != 1) {
            return;
        }
        b(false);
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        if (i != 1) {
            return;
        }
        b(true);
    }

    private void b(boolean z) {
        int i = 0;
        if (this.d.a()) {
            this.o.getMenu().getItem(2).setEnabled(true);
            this.o.getMenu().getItem(2).getIcon().mutate().setAlpha(255);
        } else {
            this.o.getMenu().getItem(3).getIcon().mutate().setAlpha(50);
            this.o.getMenu().getItem(3).setEnabled(false);
            this.N.setAlpha(0.15f);
            this.L.setAlpha(0.15f);
            this.K.setAlpha(0.15f);
        }
        this.J.findViewById(R.id.btn_sign_in).setVisibility(z ? 0 : 8);
        this.J.findViewById(R.id.sign_in_note).setVisibility(z ? 0 : 8);
        ImageView imageView = this.m;
        if (z) {
            i = 8;
        }
        imageView.setVisibility(i);
        this.p.getMenu().setGroupVisible(R.id.grp5, !z);
    }

    @Override // defpackage.dht
    public final void a(float f) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(new Locale("en", "US"));
        decimalFormat.applyPattern("##.##");
        TextView textView = this.K;
        textView.setText(decimalFormat.format(f) + getString(R.string.blance_egp));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        switch (id) {
            case R.id.btn_balance_services /* 2131362012 */:
                djx.a(this, BalanceActivity.class, this.K.getText().toString());
                drawerLayout.closeDrawer(5);
                return;
            case R.id.btn_recharge /* 2131362039 */:
                this.g.b(this, BalanceRechargeActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.btn_sign_in /* 2131362047 */:
                this.g.b(this, SignInActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.iv_logo /* 2131362408 */:
                this.o.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
                this.o.getMenu().getItem(3).setChecked(true);
                b(3);
                a(new dgq());
                this.r.setText(getString(R.string.my_account));
                this.r.setVisibility(0);
                this.H.setVisibility(0);
                this.m.setVisibility(8);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.tvLiveChat /* 2131363040 */:
                this.g.b(this, ChatWithUsActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.tvUSSDCode /* 2131363093 */:
                this.g.b(this, USSDDetails.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.txtAppSettings /* 2131363201 */:
                this.g.b(this, SettingActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.txtFAQ /* 2131363227 */:
                this.g.b(this, HelpAndSupport_Activity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.txtFollowUs /* 2131363233 */:
                this.g.b(this, SocialMediaActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.txtInbox /* 2131363237 */:
                this.g.b(this, NotificationInboxActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.txtLogOut /* 2131363248 */:
                this.d.a(this.y);
                return;
            case R.id.txtWePay /* 2131363291 */:
                this.g.b(this, WePayActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            default:
                return;
        }
    }

    public final void c(ArrayList<StoreResponseBody> arrayList) {
        a(cze.a(arrayList), "Locator_Result");
        this.r.setVisibility(0);
        this.r.setText(getString(R.string.title_store_locator));
        this.m.setVisibility(8);
        this.H.setVisibility(8);
        this.m.setVisibility(8);
    }

    public final void k() {
        a(cyy.a(false), "Select_Location");
        this.r.setVisibility(0);
        this.r.setText(getString(R.string.choose_location));
        this.m.setVisibility(8);
        this.H.setVisibility(8);
        this.m.setVisibility(8);
    }

    public final void g(String str) {
        this.r.setText(str);
    }

    @Override // defpackage.czs
    public final City c() {
        return this.k;
    }

    @Override // defpackage.czs
    public final void a(City city) {
        this.k = city;
    }

    @Override // defpackage.czn
    public final Area d() {
        return this.l;
    }

    @Override // defpackage.czn
    public final void a(Area area) {
        this.l = area;
    }

    @Override // defpackage.dfx
    public final void a(NotificationCount notificationCount) {
        if (notificationCount.getCount().intValue() == 0) {
            this.Y.setVisibility(8);
            return;
        }
        this.Y.setVisibility(0);
        this.Y.setText(String.valueOf(notificationCount.getCount()));
    }

    @Override // defpackage.dfx
    public final void m() {
        this.Y.setVisibility(8);
    }
}
