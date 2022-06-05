package com.ucare.we.presentation.corporateadslprepaid;

import android.content.Context;
import android.content.Intent;
import android.content.res.Configuration;
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
import com.ucare.we.BalanceRechargeActivity;
import com.ucare.we.HelpAndSupport_Activity;
import com.ucare.we.NewRequestActivity;
import com.ucare.we.R;
import com.ucare.we.RequestDeviceActivity;
import com.ucare.we.RequestRouterUserNamePasswordActivity;
import com.ucare.we.SettingActivity;
import com.ucare.we.SocialMediaActivity;
import com.ucare.we.SuspendAndResumeActivity;
import com.ucare.we.adslbalanceservices.ADSLBalanceServicesActivity;
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
import com.ucare.we.presentation.deactivatefbb.DeactivationConfirmationActivity;
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
public class CorporateADSLPrePaidMainActivity extends czy implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener, cwj, czn, czs, dfx, dhk, dht {
    private static final String M = CorporateADSLPrePaidMainActivity.class.getSimpleName();
    public static CorporateADSLPrePaidMainActivity a;
    LinearLayout F;
    LinearLayout G;
    LinearLayout H;
    LinearLayout I;
    LinearLayout J;
    LinearLayout K;
    public Button L;
    private View O;
    private TextView P;
    private TextView Q;
    private TextView R;
    private ImageView S;
    private Button T;
    private Button U;
    private TextView V;
    private TextView W;
    private TextView X;
    private TextView Y;
    private TextView Z;
    private TextView aa;
    private TextView ab;
    private TextView ac;
    private TextView ad;
    private TextView ae;
    private TextView af;
    private TextView ag;
    private TextView ah;
    private TextView ai;
    private TextView aj;
    private BottomNavigationView.OnNavigationItemSelectedListener ak;
    @Inject
    protected djb b;
    @Inject
    protected dio c;
    @Inject
    dhp d;
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
    @Inject
    dfw j;
    City l;
    Area m;
    public ImageView n;
    BottomNavigationView o;
    NavigationView p;
    Toolbar q;
    Context r;
    public TextView s;
    FragmentManager k = getSupportFragmentManager();
    String t = "1";
    View.OnClickListener u = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslprepaid.-$$Lambda$CorporateADSLPrePaidMainActivity$vZMnvPTdo-hBHffVFQOw8mlZAL8
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPrePaidMainActivity.this.i(view);
        }
    };
    View.OnClickListener x = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslprepaid.-$$Lambda$CorporateADSLPrePaidMainActivity$Z0v4Pohn-nRQG33wVTR6VoOHYWM
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPrePaidMainActivity.this.h(view);
        }
    };
    View.OnClickListener y = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslprepaid.-$$Lambda$CorporateADSLPrePaidMainActivity$cKWN3SaWfE67PVWnqslCZgbn420
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPrePaidMainActivity.this.g(view);
        }
    };
    View.OnClickListener z = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslprepaid.-$$Lambda$CorporateADSLPrePaidMainActivity$2NOFyJKE2I4F7mM_V98V8SCZYOM
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPrePaidMainActivity.this.f(view);
        }
    };
    View.OnClickListener A = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslprepaid.-$$Lambda$CorporateADSLPrePaidMainActivity$8dbkfRB0MEYtYjUBbmCVTwi4h8Q
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPrePaidMainActivity.this.e(view);
        }
    };
    View.OnClickListener B = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslprepaid.-$$Lambda$CorporateADSLPrePaidMainActivity$JX_IO9rLASYCvBGjWyiYAWgpDGs
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPrePaidMainActivity.this.d(view);
        }
    };
    View.OnClickListener C = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslprepaid.-$$Lambda$CorporateADSLPrePaidMainActivity$cSOqdzIxDa_AMZV964PzeR2Bpfs
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPrePaidMainActivity.this.c(view);
        }
    };
    View.OnClickListener D = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslprepaid.-$$Lambda$CorporateADSLPrePaidMainActivity$0huU-JzSiURtnXsXkqQ10lAf0gc
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPrePaidMainActivity.this.b(view);
        }
    };
    View.OnClickListener E = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslprepaid.-$$Lambda$CorporateADSLPrePaidMainActivity$u9xr9uv6AnnbWJ9O-6j6L-FGz7M
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPrePaidMainActivity.this.a(view);
        }
    };
    private FragmentTransaction N = getSupportFragmentManager().beginTransaction();

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

    public /* synthetic */ void i(View view) {
        startActivity(new Intent(this, ChooseAccountActivity.class));
    }

    public /* synthetic */ void h(View view) {
        startActivity(new Intent(this, RequestRouterUserNamePasswordActivity.class));
    }

    public /* synthetic */ void g(View view) {
        startActivity(new Intent(this, OffersAndExtraActivity.class));
    }

    public /* synthetic */ void f(View view) {
        startActivity(new Intent(this, NewRequestActivity.class));
    }

    public /* synthetic */ void e(View view) {
        startActivity(new Intent(this, SuspendAndResumeActivity.class));
    }

    public /* synthetic */ void d(View view) {
        startActivity(new Intent(this, RequestDeviceActivity.class));
    }

    public /* synthetic */ void c(View view) {
        startActivity(new Intent(this, USSDDetails.class));
    }

    public /* synthetic */ void b(View view) {
        startActivity(new Intent(this, ChatWithUsActivity.class));
    }

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(this, WePayActivity.class));
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a = this;
        setContentView(R.layout.activity_corporate_adslpre_paid_main);
        View findViewById = findViewById(R.id.content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.q = toolbar;
        setSupportActionBar(toolbar);
        this.s = (TextView) findViewById(R.id.tv_title_account);
        this.R = (TextView) findViewById(R.id.tv_title_account);
        Button button = (Button) findViewById(R.id.btnSwitch);
        this.L = button;
        button.setOnClickListener(this.u);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerLayout.setScrimColor(0);
        this.r = this;
        djy djyVar = new djy(this, findViewById, drawerLayout);
        drawerLayout.addDrawerListener(djyVar);
        djyVar.syncState();
        this.q.findViewById(R.id.hamburger).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslprepaid.CorporateADSLPrePaidMainActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (drawerLayout.isDrawerOpen(5)) {
                    drawerLayout.closeDrawer(5);
                } else {
                    drawerLayout.openDrawer(5);
                }
                CorporateADSLPrePaidMainActivity.this.j.a();
                djm.b(CorporateADSLPrePaidMainActivity.this);
            }
        });
        ((ImageView) findViewById(R.id.searchImageView)).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslprepaid.CorporateADSLPrePaidMainActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CorporateADSLPrePaidMainActivity.this.startActivity(new Intent(CorporateADSLPrePaidMainActivity.this, SearchActivity.class));
            }
        });
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        this.p = navigationView;
        navigationView.setNavigationItemSelectedListener(this);
        this.p.setItemIconTintList(null);
        ImageView imageView = (ImageView) findViewById(R.id.iv_logo);
        this.n = imageView;
        imageView.setOnClickListener(this);
        this.ak = new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: com.ucare.we.presentation.corporateadslprepaid.-$$Lambda$CorporateADSLPrePaidMainActivity$KcQ8x13DyqwTp2neAZZwx2CTQ4I
            @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                boolean a2;
                a2 = CorporateADSLPrePaidMainActivity.this.a(menuItem);
                return a2;
            }
        };
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        this.o = bottomNavigationView;
        bottomNavigationView.setOnNavigationItemSelectedListener(this.ak);
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
        bundle2.putString("params", this.t);
        ddt ddtVar = new ddt();
        ddtVar.setArguments(bundle2);
        a(ddtVar);
        View headerView = this.p.getHeaderView(0);
        this.O = headerView;
        this.G = (LinearLayout) headerView.findViewById(R.id.newRequestLinearLayout);
        this.J = (LinearLayout) this.O.findViewById(R.id.requestDeviceLinearLayout);
        this.F = (LinearLayout) this.O.findViewById(R.id.llOutstandingContainer);
        this.W = (TextView) this.O.findViewById(R.id.tvUSSDCode);
        this.ae = (TextView) this.O.findViewById(R.id.tvLiveChat);
        this.aa = (TextView) this.O.findViewById(R.id.txtWePay);
        this.Y = (TextView) this.O.findViewById(R.id.txtInbox);
        this.ai = (TextView) this.O.findViewById(R.id.tvNotificationCount);
        this.ai = (TextView) this.O.findViewById(R.id.tvNotificationCount);
        this.I = (LinearLayout) this.O.findViewById(R.id.icSuspendReactivateServiceLinearLayout);
        this.H = (LinearLayout) this.O.findViewById(R.id.requestUserNameAndPasswordLinearLayout);
        this.P = (TextView) this.O.findViewById(R.id.tv_balance);
        this.T = (Button) this.O.findViewById(R.id.btn_balance_services);
        this.U = (Button) this.O.findViewById(R.id.btn_recharge);
        this.Z = (TextView) this.O.findViewById(R.id.tvFAQ);
        this.ab = (TextView) this.O.findViewById(R.id.txtAppSettings);
        this.X = (TextView) this.O.findViewById(R.id.tvNewRequest);
        this.V = (TextView) this.O.findViewById(R.id.requestDevice);
        this.ac = (TextView) this.O.findViewById(R.id.txtFollowUs);
        this.ah = (TextView) this.O.findViewById(R.id.offerAndExtras);
        this.ad = (TextView) this.O.findViewById(R.id.txtLogOut);
        this.aj = (TextView) this.O.findViewById(R.id.txtDeactivateFBB);
        this.K = (LinearLayout) this.O.findViewById(R.id.llDeactivateFbb);
        this.af = (TextView) this.O.findViewById(R.id.requestUserNameAndPassword);
        this.ag = (TextView) this.O.findViewById(R.id.icSuspendReactivateService);
        this.S = (ImageView) this.O.findViewById(R.id.iv_balance);
        this.Q = (TextView) this.O.findViewById(R.id.tv_current_balance);
        this.X.setOnClickListener(this.z);
        this.af.setOnClickListener(this.x);
        this.ah.setOnClickListener(this.y);
        this.T.setOnClickListener(this);
        this.U.setOnClickListener(this);
        this.Z.setOnClickListener(this);
        this.ag.setOnClickListener(this);
        this.ab.setOnClickListener(this);
        this.ac.setOnClickListener(this);
        this.ad.setOnClickListener(this);
        this.aj.setOnClickListener(this);
        this.Y.setOnClickListener(this);
        TextView textView = (TextView) this.O.findViewById(R.id.requestDevice);
        this.V = textView;
        textView.setOnClickListener(this.B);
        this.W.setOnClickListener(this.C);
        this.ae.setOnClickListener(this.D);
        this.aa.setOnClickListener(this.E);
        this.O.findViewById(R.id.btn_sign_in).setOnClickListener(this);
        if (this.c.j()) {
            this.aj.setVisibility(0);
            this.K.setVisibility(0);
        } else {
            this.aj.setVisibility(8);
            this.K.setVisibility(8);
        }
        this.F.setVisibility(this.d.m().booleanValue() ? 0 : 8);
        this.U.setVisibility(this.d.k().booleanValue() ? 0 : 8);
        if (this.d.c().booleanValue()) {
            this.X.setVisibility(0);
            this.G.setVisibility(0);
        } else {
            this.X.setVisibility(8);
            this.G.setVisibility(8);
        }
        if (this.d.d().booleanValue()) {
            this.V.setVisibility(0);
            this.J.setVisibility(0);
        } else {
            this.V.setVisibility(8);
            this.J.setVisibility(8);
        }
        b(!this.c.a());
        this.F.setVisibility(this.d.m().booleanValue() ? 0 : 8);
        this.U.setVisibility(this.d.k().booleanValue() ? 0 : 8);
        if (this.d.c().booleanValue()) {
            this.X.setVisibility(0);
            this.G.setVisibility(0);
        } else {
            this.X.setVisibility(8);
            this.G.setVisibility(8);
        }
        if (this.d.d().booleanValue()) {
            this.V.setVisibility(0);
            this.J.setVisibility(0);
        } else {
            this.V.setVisibility(8);
            this.J.setVisibility(8);
        }
        try {
            if (!this.f.f() || ((this.c.h() && this.c.i()) || !this.i.f.isFeature_suspendandresume_ADSL_corporate() || !this.i.f.isFeature_suspendandresume_ADSL() || this.f.Q())) {
                this.ag.setVisibility(8);
                this.I.setVisibility(8);
            }
        } catch (Exception unused) {
            this.ag.setVisibility(8);
            this.I.setVisibility(8);
        }
        if (!this.f.g()) {
            this.af.setVisibility(8);
            this.H.setVisibility(8);
        }
    }

    public /* synthetic */ boolean a(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.navigation_home /* 2131362641 */:
                if (!this.o.getMenu().getItem(0).isChecked()) {
                    b(0);
                    a(new ddt());
                    this.s.setVisibility(8);
                    this.R.setVisibility(8);
                    this.L.setVisibility(8);
                    if (this.c.a()) {
                        this.n.setVisibility(0);
                    } else {
                        this.n.setVisibility(8);
                    }
                    this.q.setVisibility(0);
                }
                return true;
            case R.id.navigation_my_account /* 2131362642 */:
                if (!this.o.getMenu().getItem(3).isChecked() && this.c.a()) {
                    b(3);
                    a(new dfy());
                    this.s.setVisibility(8);
                    this.R.setVisibility(8);
                    this.L.setVisibility(8);
                    this.R.setText(getString(R.string.my_account));
                    this.n.setVisibility(8);
                    this.q.setVisibility(8);
                }
                return true;
            case R.id.navigation_promotions /* 2131362643 */:
                if (!this.o.getMenu().getItem(1).isChecked()) {
                    b(1);
                    a(new czf());
                    this.s.setVisibility(0);
                    this.s.setText(getString(R.string.title_promotions));
                    this.L.setVisibility(8);
                    this.n.setVisibility(8);
                    this.q.setVisibility(8);
                }
                return true;
            case R.id.navigation_store_locator /* 2131362644 */:
                if (!this.o.getMenu().getItem(2).isChecked()) {
                    b(2);
                    a(czh.a(false));
                    this.s.setText(getString(R.string.title_store_locator));
                    this.s.setVisibility(0);
                    this.L.setVisibility(8);
                    this.n.setVisibility(8);
                    this.q.setVisibility(0);
                }
                return true;
            default:
                return true;
        }
    }

    private void b(int i) {
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
        if (this.c.a()) {
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
            if (this.k.getBackStackEntryCount() > 0) {
                this.k.popBackStack();
                return;
            }
            this.o.getMenu().getItem(0).setIcon(R.drawable.home_selected);
            this.o.getMenu().getItem(0).setChecked(true);
            b(0);
            a(new ddt());
            this.s.setVisibility(8);
            this.L.setVisibility(8);
            if (!this.c.a()) {
                return;
            }
            this.n.setVisibility(0);
        } else {
            this.o.getMenu().getItem(0).setIcon(R.drawable.home_selected);
            this.o.getMenu().getItem(0).setChecked(true);
            b(0);
            a(new ddt());
            this.s.setVisibility(8);
            this.L.setVisibility(8);
            if (!this.c.a()) {
                return;
            }
            this.n.setVisibility(0);
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
            this.c.a(this.r);
            return true;
        } else if (itemId == R.id.nav_settings) {
            this.g.b(this, SettingActivity.class);
            drawerLayout.closeDrawer(5);
            return true;
        } else if (itemId == R.id.nav_faq) {
            this.g.b(this, HelpAndSupport_Activity.class);
            drawerLayout.closeDrawer(5);
            return true;
        } else if (itemId != R.id.nav_follow) {
            return true;
        } else {
            this.g.b(this, SocialMediaActivity.class);
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
        this.N = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment);
        this.N.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.N.commit();
    }

    private void a(Fragment fragment, String str) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.N = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment, str);
        if (this.k.findFragmentByTag(str) == null) {
            this.N.addToBackStack(str);
        }
        this.N.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.N.commit();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.c.b(this);
        this.e.b(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        this.c.a((dhk) this);
        this.e.a(this);
        this.j.a(this);
        this.j.a();
        super.onResume();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.c.b(this);
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
        if (this.c.a()) {
            this.o.getMenu().getItem(2).setEnabled(true);
            this.o.getMenu().getItem(2).getIcon().mutate().setAlpha(255);
        } else {
            this.o.getMenu().getItem(3).getIcon().mutate().setAlpha(50);
            this.o.getMenu().getItem(3).setEnabled(false);
            this.S.setAlpha(0.15f);
            this.Q.setAlpha(0.15f);
            this.P.setAlpha(0.15f);
        }
        this.O.findViewById(R.id.btn_sign_in).setVisibility(z ? 0 : 8);
        this.O.findViewById(R.id.sign_in_note).setVisibility(z ? 0 : 8);
        this.n.setVisibility(z ? 8 : 0);
        this.O.findViewById(R.id.btn_balance_services).setVisibility(z ? 8 : 0);
        View findViewById = this.O.findViewById(R.id.btn_recharge);
        if (z) {
            i = 8;
        }
        findViewById.setVisibility(i);
        this.p.getMenu().setGroupVisible(R.id.grp5, !z);
    }

    @Override // defpackage.dht
    public final void a(float f) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(new Locale("en", "US"));
        decimalFormat.applyPattern("##.##");
        TextView textView = this.P;
        textView.setText(decimalFormat.format(f) + getString(R.string.blance_egp));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_balance_services /* 2131362012 */:
                djx.a(this, ADSLBalanceServicesActivity.class, this.P.getText().toString());
                break;
            case R.id.btn_recharge /* 2131362039 */:
                this.g.b(this, BalanceRechargeActivity.class);
                break;
            case R.id.btn_sign_in /* 2131362047 */:
                this.g.b(this, SignInActivity.class);
                break;
            case R.id.icSuspendReactivateService /* 2131362321 */:
                this.g.b(this, SuspendAndResumeActivity.class);
                break;
            case R.id.iv_logo /* 2131362408 */:
                this.o.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
                this.o.getMenu().getItem(3).setChecked(true);
                b(3);
                a(new dgq());
                this.s.setText(getString(R.string.my_account));
                this.s.setVisibility(0);
                this.L.setVisibility(0);
                this.n.setVisibility(8);
                break;
            case R.id.tvFAQ /* 2131363024 */:
                this.g.b(this, HelpAndSupport_Activity.class);
                break;
            case R.id.tvNewRequest /* 2131363053 */:
                this.g.b(this, NewRequestActivity.class);
                break;
            case R.id.txtAppSettings /* 2131363201 */:
                this.g.b(this, SettingActivity.class);
                break;
            case R.id.txtDeactivateFBB /* 2131363221 */:
                DeactivationConfirmationActivity.a(this.r);
                break;
            case R.id.txtFollowUs /* 2131363233 */:
                this.g.b(this, SocialMediaActivity.class);
                break;
            case R.id.txtInbox /* 2131363237 */:
                this.g.b(this, NotificationInboxActivity.class);
                break;
            case R.id.txtLogOut /* 2131363248 */:
                this.c.a(this.r);
                break;
        }
        ((DrawerLayout) findViewById(R.id.drawer_layout)).closeDrawer(5);
    }

    public final void c(ArrayList<StoreResponseBody> arrayList) {
        a(cze.a(arrayList), "Locator_Result");
        this.s.setVisibility(0);
        this.s.setText(getString(R.string.title_store_locator));
        this.n.setVisibility(8);
        this.L.setVisibility(8);
        this.n.setVisibility(8);
    }

    public final void k() {
        a(cyy.a(false), "Select_Location");
        this.s.setVisibility(0);
        this.s.setText(R.string.choose_location);
        this.n.setVisibility(8);
        this.L.setVisibility(8);
        this.n.setVisibility(8);
    }

    public final void g(String str) {
        this.s.setText(str);
    }

    @Override // defpackage.czs
    public final City c() {
        return this.l;
    }

    @Override // defpackage.czs
    public final void a(City city) {
        this.l = city;
    }

    @Override // defpackage.czn
    public final Area d() {
        return this.m;
    }

    @Override // defpackage.czn
    public final void a(Area area) {
        this.m = area;
    }

    @Override // defpackage.dfx
    public final void a(NotificationCount notificationCount) {
        if (notificationCount.getCount().intValue() == 0) {
            this.ai.setVisibility(8);
            return;
        }
        this.ai.setVisibility(0);
        this.ai.setText(String.valueOf(notificationCount.getCount()));
    }

    @Override // defpackage.dfx
    public final void m() {
        this.ai.setVisibility(8);
    }
}
