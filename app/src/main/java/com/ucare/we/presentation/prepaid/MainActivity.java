package com.ucare.we.presentation.prepaid;

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
import com.ucare.we.presentation.contactus.ContactUsActivity;
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
public class MainActivity extends czy implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener, cwj, czn, czs, dfx, dhk, dht {
    public static MainActivity a;
    public Button D;
    private View E;
    private TextView F;
    private TextView G;
    private TextView H;
    private ImageView I;
    private Button J;
    private Button K;
    private TextView L;
    private TextView M;
    private TextView N;
    private TextView O;
    private TextView P;
    private TextView Q;
    private TextView R;
    private TextView S;
    private TextView T;
    private LinearLayout U;
    private LinearLayout V;
    private BottomNavigationView.OnNavigationItemSelectedListener W;
    @Inject
    protected djb b;
    @Inject
    protected dio c;
    @Inject
    protected dhp d;
    @Inject
    dhu e;
    @Inject
    djw f;
    @Inject
    djx g;
    @Inject
    dfw h;
    @Inject
    dja i;
    @Inject
    dhn j;
    City k;
    Area l;
    public ImageView m;
    BottomNavigationView n;
    NavigationView o;
    Context p;
    Toolbar q;
    public TextView r;
    TextView s;
    TextView t;
    LinearLayout u;
    DrawerLayout z;
    String x = "1";
    FragmentManager y = getSupportFragmentManager();
    View.OnClickListener A = new View.OnClickListener() { // from class: com.ucare.we.presentation.prepaid.-$$Lambda$MainActivity$bZqU2taLTN-I30NSDVwDTYKR82Q
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MainActivity.m60lambda$bZqU2taLTNI30NSDVwDTYKR82Q(MainActivity.this, view);
        }
    };
    View.OnClickListener B = new View.OnClickListener() { // from class: com.ucare.we.presentation.prepaid.-$$Lambda$MainActivity$HnI-xmlKvsEtdkO1edbV0Mz4xlU
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MainActivity.m58lambda$HnIxmlKvsEtdkO1edbV0Mz4xlU(MainActivity.this, view);
        }
    };
    View.OnClickListener C = new View.OnClickListener() { // from class: com.ucare.we.presentation.prepaid.-$$Lambda$MainActivity$_CG_XjIgIgFjv97nojYefsllT3s
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            MainActivity.lambda$_CG_XjIgIgFjv97nojYefsllT3s(MainActivity.this, view);
        }
    };
    private FragmentTransaction X = getSupportFragmentManager().beginTransaction();

    public static /* synthetic */ boolean lambda$7B_9b80Jlu8W1KzhP9eVhx6fwV8(MainActivity mainActivity, MenuItem menuItem) {
        return mainActivity.a(menuItem);
    }

    /* renamed from: lambda$HnI-xmlKvsEtdkO1edbV0Mz4xlU */
    public static /* synthetic */ void m58lambda$HnIxmlKvsEtdkO1edbV0Mz4xlU(MainActivity mainActivity, View view) {
        mainActivity.d(view);
    }

    /* renamed from: lambda$WRMkr-IdN5QucInV4buN1D-z-os */
    public static /* synthetic */ void m59lambda$WRMkrIdN5QucInV4buN1Dzos(MainActivity mainActivity, View view) {
        mainActivity.b(view);
    }

    public static /* synthetic */ void lambda$_CG_XjIgIgFjv97nojYefsllT3s(MainActivity mainActivity, View view) {
        mainActivity.c(view);
    }

    /* renamed from: lambda$bZqU2taLTN-I30NSDVwDTYKR82Q */
    public static /* synthetic */ void m60lambda$bZqU2taLTNI30NSDVwDTYKR82Q(MainActivity mainActivity, View view) {
        mainActivity.e(view);
    }

    public static /* synthetic */ void lambda$yIGjE00BFOjWQ8cH1Rx7_aNmq8Y(MainActivity mainActivity, View view) {
        mainActivity.a(view);
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

    public /* synthetic */ void e(View view) {
        startActivity(new Intent(this, ChooseAccountActivity.class));
    }

    public /* synthetic */ void d(View view) {
        startActivity(new Intent(this, OffersAndExtraActivity.class));
    }

    public /* synthetic */ void c(View view) {
        startActivity(new Intent(this, ChatWithUsActivity.class));
        this.z.closeDrawer(5);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a = this;
        setContentView(R.layout.activity_main);
        View findViewById = findViewById(R.id.content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.q = toolbar;
        setSupportActionBar(toolbar);
        this.r = (TextView) findViewById(R.id.tv_title_account);
        this.H = (TextView) findViewById(R.id.tv_title_account);
        Button button = (Button) findViewById(R.id.btnSwitch);
        this.D = button;
        button.setOnClickListener(this.A);
        this.p = this;
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.z = drawerLayout;
        drawerLayout.setScrimColor(0);
        djy djyVar = new djy(this, findViewById, this.z);
        this.z.addDrawerListener(djyVar);
        djyVar.syncState();
        this.q.findViewById(R.id.hamburger).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.prepaid.-$$Lambda$MainActivity$WRMkr-IdN5QucInV4buN1D-z-os
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.m59lambda$WRMkrIdN5QucInV4buN1Dzos(MainActivity.this, view);
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.searchImageView);
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.prepaid.-$$Lambda$MainActivity$yIGjE00BFOjWQ8cH1Rx7_aNmq8Y
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                MainActivity.lambda$yIGjE00BFOjWQ8cH1Rx7_aNmq8Y(MainActivity.this, view);
            }
        });
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        this.o = navigationView;
        navigationView.setNavigationItemSelectedListener(this);
        this.o.setItemIconTintList(null);
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_logo);
        this.m = imageView2;
        imageView2.setOnClickListener(this);
        this.W = new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: com.ucare.we.presentation.prepaid.-$$Lambda$MainActivity$7B_9b80Jlu8W1KzhP9eVhx6fwV8
            @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return MainActivity.lambda$7B_9b80Jlu8W1KzhP9eVhx6fwV8(MainActivity.this, menuItem);
            }
        };
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        this.n = bottomNavigationView;
        bottomNavigationView.setOnNavigationItemSelectedListener(this.W);
        this.n.getMenu().getItem(0).setIcon(R.drawable.home_selected);
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) this.n.getChildAt(0);
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
        this.n.setItemIconTintList(null);
        Bundle bundle2 = new Bundle();
        bundle2.putString("params", this.x);
        dgf dgfVar = new dgf();
        dgfVar.setArguments(bundle2);
        a(dgfVar);
        View headerView = this.o.getHeaderView(0);
        this.E = headerView;
        this.F = (TextView) headerView.findViewById(R.id.tv_balance);
        this.U = (LinearLayout) this.E.findViewById(R.id.llOutstandingContainer);
        this.J = (Button) this.E.findViewById(R.id.btn_balance_services);
        this.K = (Button) this.E.findViewById(R.id.btn_recharge);
        this.L = (TextView) this.E.findViewById(R.id.txtFAQ);
        this.O = (TextView) this.E.findViewById(R.id.txtAppSettings);
        this.M = (TextView) this.E.findViewById(R.id.txtInbox);
        this.N = (TextView) this.E.findViewById(R.id.tvNotificationCount);
        this.Q = (TextView) this.E.findViewById(R.id.txtFollowUs);
        this.R = (TextView) this.E.findViewById(R.id.txtLogOut);
        this.F = (TextView) this.E.findViewById(R.id.tv_balance);
        this.J = (Button) this.E.findViewById(R.id.btn_balance_services);
        this.u = (LinearLayout) this.E.findViewById(R.id.llOffersAndExtrasContainer);
        this.I = (ImageView) this.E.findViewById(R.id.iv_balance);
        this.G = (TextView) this.E.findViewById(R.id.tv_current_balance);
        this.s = (TextView) this.E.findViewById(R.id.offerAndExtras);
        this.t = (TextView) this.E.findViewById(R.id.tvLiveChat);
        this.S = (TextView) this.E.findViewById(R.id.tvUSSDCode);
        this.V = (LinearLayout) this.E.findViewById(R.id.newRequestLinearLayout);
        this.P = (TextView) this.E.findViewById(R.id.txtWePay);
        this.T = (TextView) this.E.findViewById(R.id.tvNewRequest);
        this.S.setOnClickListener(this);
        this.T.setOnClickListener(this);
        this.s.setOnClickListener(this.B);
        this.t.setOnClickListener(this.C);
        this.J.setOnClickListener(this);
        this.K.setOnClickListener(this);
        this.L.setOnClickListener(this);
        this.O.setOnClickListener(this);
        this.P.setOnClickListener(this);
        this.M.setOnClickListener(this);
        this.Q.setOnClickListener(this);
        this.R.setOnClickListener(this);
        this.E.findViewById(R.id.btn_sign_in).setOnClickListener(this);
        if (!this.c.a()) {
            imageView.setVisibility(8);
        }
        b(!this.c.a());
    }

    public /* synthetic */ void b(View view) {
        if (this.z.isDrawerOpen(5)) {
            this.z.closeDrawer(5);
        } else {
            this.z.openDrawer(5);
        }
        this.h.a();
        djm.b(this);
    }

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(this, SearchActivity.class));
    }

    public /* synthetic */ boolean a(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.navigation_home /* 2131362641 */:
                if (!this.n.getMenu().getItem(0).isChecked()) {
                    b(0);
                    a(new dgf());
                    this.r.setVisibility(8);
                    this.H.setVisibility(8);
                    this.D.setVisibility(8);
                    if (this.c.a()) {
                        this.m.setVisibility(0);
                    } else {
                        this.m.setVisibility(8);
                    }
                    this.q.setVisibility(0);
                }
                return true;
            case R.id.navigation_my_account /* 2131362642 */:
                if (!this.n.getMenu().getItem(3).isChecked() && this.c.a()) {
                    b(3);
                    a(new dfy());
                    this.r.setVisibility(8);
                    this.H.setVisibility(8);
                    this.D.setVisibility(8);
                    this.H.setText(getString(R.string.my_account));
                    this.m.setVisibility(8);
                    this.q.setVisibility(8);
                }
                return true;
            case R.id.navigation_promotions /* 2131362643 */:
                if (!this.n.getMenu().getItem(1).isChecked()) {
                    b(1);
                    a(new czf());
                    this.r.setVisibility(0);
                    this.r.setText(getString(R.string.title_promotions));
                    this.D.setVisibility(8);
                    this.m.setVisibility(8);
                    this.q.setVisibility(8);
                }
                return true;
            case R.id.navigation_store_locator /* 2131362644 */:
                if (!this.n.getMenu().getItem(2).isChecked()) {
                    b(2);
                    a(czh.a(false));
                    this.r.setText(getString(R.string.title_store_locator));
                    this.r.setVisibility(0);
                    this.D.setVisibility(8);
                    this.m.setVisibility(8);
                    this.q.setVisibility(0);
                }
                return true;
            default:
                return true;
        }
    }

    private void b(int i) {
        if (i == 0) {
            this.n.getMenu().getItem(0).setIcon(R.drawable.home_selected);
        } else {
            this.n.getMenu().getItem(0).setIcon(R.drawable.home);
        }
        if (i == 1) {
            this.n.getMenu().getItem(1).setIcon(R.drawable.promotions_selected);
        } else {
            this.n.getMenu().getItem(1).setIcon(R.drawable.promotions);
        }
        if (i == 2) {
            this.n.getMenu().getItem(2).setIcon(R.drawable.storelocator_selected);
        } else {
            this.n.getMenu().getItem(2).setIcon(R.drawable.storelocator);
        }
        if (i == 3) {
            this.n.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
            return;
        }
        this.n.getMenu().getItem(3).setIcon(R.drawable.my_account);
        if (this.c.a()) {
            return;
        }
        this.n.getMenu().getItem(3).getIcon().mutate().setAlpha(50);
    }

    @Override // defpackage.czy, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(5)) {
            drawerLayout.closeDrawer(5);
        } else if (this.n.getMenu().getItem(0).isChecked()) {
            super.onBackPressed();
            finishAffinity();
        } else if (this.n.getMenu().getItem(2).isChecked()) {
            if (this.y.getBackStackEntryCount() > 0) {
                this.y.popBackStack();
                return;
            }
            this.n.getMenu().getItem(0).setIcon(R.drawable.home_selected);
            this.n.getMenu().getItem(0).setChecked(true);
            b(0);
            a(new dgf());
            this.r.setVisibility(8);
            this.D.setVisibility(8);
            if (!this.c.a()) {
                return;
            }
            this.m.setVisibility(0);
        } else {
            this.n.getMenu().getItem(0).setIcon(R.drawable.home_selected);
            this.n.getMenu().getItem(0).setChecked(true);
            b(0);
            a(new dgf());
            this.r.setVisibility(8);
            this.D.setVisibility(8);
            if (this.c.a()) {
                this.m.setVisibility(0);
            }
            this.q.setVisibility(0);
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
        if (itemId == R.id.nav_logout) {
            l();
            finish();
        } else if (itemId == R.id.nav_settings) {
            this.g.b(this, SettingActivity.class);
        } else if (itemId == R.id.nav_live_chat) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3="));
            startActivity(intent);
        } else if (itemId == R.id.nav_faq) {
            if (this.b.f()) {
                if (this.j.f == null) {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://te.eg/wps/portal/te/Personal?1dmy&urile=wcm%3apath%3a%2Fte%2Fhelp%2Ffaq%2Ffaq")));
                } else {
                    startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.j.f.getFaqAr())));
                }
            } else if (this.j.f == null) {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://te.eg/wps/portal/te/Personal?1dmy&urile=wcm%3apath%3a%2Fte%2Fhelp%2Ffaq%2Ffaq")));
            } else {
                startActivity(new Intent("android.intent.action.VIEW", Uri.parse(this.j.f.getFaqEn())));
            }
        } else if (itemId == R.id.nav_follow) {
            this.g.b(this, SocialMediaActivity.class);
        }
        ((DrawerLayout) findViewById(R.id.drawer_layout)).closeDrawer(5);
        return true;
    }

    private void l() {
        this.c.a(this.p);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        ((DrawerLayout) findViewById(R.id.drawer_layout)).closeDrawer(5);
        super.onConfigurationChanged(configuration);
        this.b.a();
    }

    public final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.X = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment);
        this.X.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.X.commit();
    }

    private void a(Fragment fragment, String str) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.X = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment, str);
        if (this.y.findFragmentByTag(str) == null) {
            this.X.addToBackStack(str);
        }
        this.X.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.X.commit();
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
        this.h.a(this);
        this.h.a();
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
        if (this.c.a()) {
            this.n.getMenu().getItem(2).setEnabled(true);
            this.n.getMenu().getItem(2).getIcon().mutate().setAlpha(255);
        } else {
            this.n.getMenu().getItem(3).getIcon().mutate().setAlpha(50);
            this.n.getMenu().getItem(3).setEnabled(false);
            this.I.setAlpha(0.5f);
            this.G.setAlpha(0.5f);
            this.F.setAlpha(0.5f);
        }
        this.E.findViewById(R.id.btn_sign_in).setVisibility(z ? 0 : 8);
        this.E.findViewById(R.id.sign_in_note).setVisibility(z ? 0 : 8);
        this.m.setVisibility(z ? 8 : 0);
        this.E.findViewById(R.id.btn_balance_services).setVisibility(z ? 8 : 0);
        this.E.findViewById(R.id.btn_recharge).setVisibility(z ? 8 : 0);
        this.E.findViewById(R.id.llInbox).setVisibility(z ? 8 : 0);
        this.E.findViewById(R.id.ll_inbox).setVisibility(z ? 8 : 0);
        this.E.findViewById(R.id.ll_liveChat).setVisibility(z ? 8 : 0);
        this.E.findViewById(R.id.tvLiveChat).setVisibility(z ? 8 : 0);
        this.E.findViewById(R.id.tvNewRequest).setVisibility(z ? 8 : 0);
        this.E.findViewById(R.id.newRequestLinearLayout).setVisibility(z ? 8 : 0);
        this.o.getMenu().setGroupVisible(R.id.grp5, !z);
        boolean booleanValue = this.d.m().booleanValue();
        if (!z) {
            this.U.setVisibility(booleanValue ? 0 : 8);
        }
        if (z) {
            this.f.o(false);
            this.f.x("");
            this.f.p(false);
            if (this.d.c().booleanValue() && !z) {
                this.T.setVisibility(0);
                this.V.setVisibility(0);
            } else {
                this.T.setVisibility(8);
                this.V.setVisibility(8);
            }
            this.f.m("PREPAID_INDIVIDUAL_DEFAULT_USER");
            this.f.l("PREPAID");
            this.E.findViewById(R.id.llLogOutNavHeaderMain).setVisibility(8);
            this.E.findViewById(R.id.llLogOutNavDivider).setVisibility(8);
            this.u.setVisibility(8);
            return;
        }
        this.E.findViewById(R.id.llLogOutNavHeaderMain).setVisibility(0);
    }

    @Override // defpackage.dht
    public final void a(float f) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(new Locale("en", "US"));
        decimalFormat.applyPattern("##.##");
        TextView textView = this.F;
        textView.setText(decimalFormat.format(f) + getString(R.string.blance_egp));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        switch (id) {
            case R.id.btn_balance_services /* 2131362012 */:
                djx.a(this, BalanceActivity.class, this.F.getText().toString());
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
                this.n.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
                this.n.getMenu().getItem(3).setChecked(true);
                b(3);
                a(new dgq());
                this.r.setText(getString(R.string.my_account));
                this.r.setVisibility(0);
                this.D.setVisibility(0);
                this.m.setVisibility(8);
                return;
            case R.id.tvLiveChat /* 2131363040 */:
                this.g.b(this, ChatWithUsActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.tvNewRequest /* 2131363053 */:
                this.g.b(this, NewRequestActivity.class);
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
            case R.id.txtContactUs /* 2131363217 */:
                this.g.b(this, ContactUsActivity.class);
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
            case R.id.txtLiveChat /* 2131363247 */:
                String liveChat = this.j.f == null ? "https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3=" : this.j.f.getLiveChat();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(liveChat));
                startActivity(intent);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.txtLogOut /* 2131363248 */:
                l();
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
        this.D.setVisibility(8);
        this.m.setVisibility(8);
    }

    public final void k() {
        a(cyy.a(false), "Select_Location");
        this.r.setVisibility(0);
        this.r.setText(R.string.choose_location);
        this.m.setVisibility(8);
        this.D.setVisibility(8);
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
            this.N.setVisibility(8);
            return;
        }
        this.N.setVisibility(0);
        this.N.setText(String.valueOf(notificationCount.getCount()));
    }

    @Override // defpackage.dfx
    public final void m() {
        this.N.setVisibility(8);
    }
}
