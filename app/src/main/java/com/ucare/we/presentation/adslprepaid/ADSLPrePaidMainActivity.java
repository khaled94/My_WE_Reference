package com.ucare.we.presentation.adslprepaid;

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
import com.ucare.we.presentation.contactus.ContactUsActivity;
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
public class ADSLPrePaidMainActivity extends czy implements View.OnClickListener, NavigationView.OnNavigationItemSelectedListener, cwj, czn, czs, dfx, dhk, dht, dhx {
    private static final String J = ADSLPrePaidMainActivity.class.getSimpleName();
    public static ADSLPrePaidMainActivity a;
    LinearLayout A;
    LinearLayout B;
    public Button I;
    private View L;
    private TextView M;
    private TextView N;
    private TextView O;
    private TextView P;
    private TextView Q;
    private ImageView R;
    private Button S;
    private Button T;
    private TextView U;
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
    private BottomNavigationView.OnNavigationItemSelectedListener ah;
    @Inject
    protected djb b;
    @Inject
    protected dio c;
    @Inject
    dhu d;
    @Inject
    dfw e;
    @Inject
    dhy f;
    @Inject
    djw g;
    @Inject
    djx h;
    @Inject
    dja i;
    @Inject
    dhp j;
    @Inject
    dhn k;
    City m;
    Area n;
    public ImageView o;
    BottomNavigationView p;
    NavigationView q;
    Context r;
    Toolbar s;
    public TextView t;
    LinearLayout x;
    LinearLayout y;
    LinearLayout z;
    FragmentManager l = getSupportFragmentManager();
    String u = "1";
    View.OnClickListener C = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslprepaid.-$$Lambda$ADSLPrePaidMainActivity$3CD3XhAUih2xAPHgo31E6cchoVs
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ADSLPrePaidMainActivity.lambda$3CD3XhAUih2xAPHgo31E6cchoVs(ADSLPrePaidMainActivity.this, view);
        }
    };
    View.OnClickListener D = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslprepaid.-$$Lambda$ADSLPrePaidMainActivity$s03Vq0NT2oCqlrNayT3sd7NHHiI
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ADSLPrePaidMainActivity.lambda$s03Vq0NT2oCqlrNayT3sd7NHHiI(ADSLPrePaidMainActivity.this, view);
        }
    };
    View.OnClickListener E = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslprepaid.-$$Lambda$ADSLPrePaidMainActivity$G2WTh4nmrXXpDpuyIWVIzo8yvpQ
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ADSLPrePaidMainActivity.lambda$G2WTh4nmrXXpDpuyIWVIzo8yvpQ(ADSLPrePaidMainActivity.this, view);
        }
    };
    View.OnClickListener F = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslprepaid.-$$Lambda$ADSLPrePaidMainActivity$ypWanr47V1Yv1s-xtriesuhCbMc
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ADSLPrePaidMainActivity.m33lambda$ypWanr47V1Yv1sxtriesuhCbMc(ADSLPrePaidMainActivity.this, view);
        }
    };
    View.OnClickListener G = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslprepaid.-$$Lambda$ADSLPrePaidMainActivity$49csHGp52_BRHLE6BuP0HH2hr3c
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ADSLPrePaidMainActivity.lambda$49csHGp52_BRHLE6BuP0HH2hr3c(ADSLPrePaidMainActivity.this, view);
        }
    };
    View.OnClickListener H = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslprepaid.-$$Lambda$ADSLPrePaidMainActivity$Fsj_L1kiv12zvwCzqwHbmWa5ojo
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ADSLPrePaidMainActivity.lambda$Fsj_L1kiv12zvwCzqwHbmWa5ojo(ADSLPrePaidMainActivity.this, view);
        }
    };
    private FragmentTransaction K = getSupportFragmentManager().beginTransaction();

    public static /* synthetic */ void lambda$3CD3XhAUih2xAPHgo31E6cchoVs(ADSLPrePaidMainActivity aDSLPrePaidMainActivity, View view) {
        aDSLPrePaidMainActivity.f(view);
    }

    public static /* synthetic */ void lambda$49csHGp52_BRHLE6BuP0HH2hr3c(ADSLPrePaidMainActivity aDSLPrePaidMainActivity, View view) {
        aDSLPrePaidMainActivity.b(view);
    }

    /* renamed from: lambda$DcVdeImB-bn0AVGoSDvxXebcv1Q */
    public static /* synthetic */ void m31lambda$DcVdeImBbn0AVGoSDvxXebcv1Q(ADSLPrePaidMainActivity aDSLPrePaidMainActivity, DrawerLayout drawerLayout, View view) {
        aDSLPrePaidMainActivity.a(drawerLayout, view);
    }

    public static /* synthetic */ void lambda$Fsj_L1kiv12zvwCzqwHbmWa5ojo(ADSLPrePaidMainActivity aDSLPrePaidMainActivity, View view) {
        aDSLPrePaidMainActivity.a(view);
    }

    public static /* synthetic */ void lambda$G2WTh4nmrXXpDpuyIWVIzo8yvpQ(ADSLPrePaidMainActivity aDSLPrePaidMainActivity, View view) {
        aDSLPrePaidMainActivity.d(view);
    }

    /* renamed from: lambda$IoFR95Q0RriEgFS4E0ZiY-IHu4Q */
    public static /* synthetic */ boolean m32lambda$IoFR95Q0RriEgFS4E0ZiYIHu4Q(ADSLPrePaidMainActivity aDSLPrePaidMainActivity, MenuItem menuItem) {
        return aDSLPrePaidMainActivity.a(menuItem);
    }

    public static /* synthetic */ void lambda$s03Vq0NT2oCqlrNayT3sd7NHHiI(ADSLPrePaidMainActivity aDSLPrePaidMainActivity, View view) {
        aDSLPrePaidMainActivity.e(view);
    }

    /* renamed from: lambda$ypWanr47V1Yv1s-xtriesuhCbMc */
    public static /* synthetic */ void m33lambda$ypWanr47V1Yv1sxtriesuhCbMc(ADSLPrePaidMainActivity aDSLPrePaidMainActivity, View view) {
        aDSLPrePaidMainActivity.c(view);
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

    public /* synthetic */ void f(View view) {
        startActivity(new Intent(this, ChooseAccountActivity.class));
    }

    public /* synthetic */ void e(View view) {
        startActivity(new Intent(this, RequestRouterUserNamePasswordActivity.class));
    }

    public /* synthetic */ void d(View view) {
        startActivity(new Intent(this, OffersAndExtraActivity.class));
    }

    public /* synthetic */ void c(View view) {
        startActivity(new Intent(this, SuspendAndResumeActivity.class));
    }

    public /* synthetic */ void b(View view) {
        startActivity(new Intent(this, NewRequestActivity.class));
    }

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(this, RequestDeviceActivity.class));
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        a = this;
        setContentView(R.layout.activity_adslpre_paid_main);
        View findViewById = findViewById(R.id.content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.s = toolbar;
        setSupportActionBar(toolbar);
        this.t = (TextView) findViewById(R.id.tv_title_account);
        this.O = (TextView) findViewById(R.id.tv_title_account);
        this.I = (Button) findViewById(R.id.btnSwitch);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        final DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        drawerLayout.setScrimColor(0);
        djy djyVar = new djy(this, findViewById, drawerLayout);
        this.r = this;
        drawerLayout.addDrawerListener(djyVar);
        djyVar.syncState();
        this.s.findViewById(R.id.hamburger).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.adslprepaid.-$$Lambda$ADSLPrePaidMainActivity$DcVdeImB-bn0AVGoSDvxXebcv1Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ADSLPrePaidMainActivity.m31lambda$DcVdeImBbn0AVGoSDvxXebcv1Q(ADSLPrePaidMainActivity.this, drawerLayout, view);
            }
        });
        ((ImageView) findViewById(R.id.searchImageView)).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.adslprepaid.ADSLPrePaidMainActivity.1
            {
                ADSLPrePaidMainActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ADSLPrePaidMainActivity.this.startActivity(new Intent(ADSLPrePaidMainActivity.this, SearchActivity.class));
            }
        });
        NavigationView navigationView = (NavigationView) findViewById(R.id.nav_view);
        this.q = navigationView;
        navigationView.setNavigationItemSelectedListener(this);
        this.q.setItemIconTintList(null);
        ImageView imageView = (ImageView) findViewById(R.id.iv_logo);
        this.o = imageView;
        imageView.setOnClickListener(this);
        this.ah = new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: com.ucare.we.presentation.adslprepaid.-$$Lambda$ADSLPrePaidMainActivity$IoFR95Q0RriEgFS4E0ZiY-IHu4Q
            @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return ADSLPrePaidMainActivity.m32lambda$IoFR95Q0RriEgFS4E0ZiYIHu4Q(ADSLPrePaidMainActivity.this, menuItem);
            }
        };
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        this.p = bottomNavigationView;
        bottomNavigationView.setOnNavigationItemSelectedListener(this.ah);
        this.p.getMenu().getItem(0).setIcon(R.drawable.home_selected);
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) this.p.getChildAt(0);
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
        this.p.setItemIconTintList(null);
        Bundle bundle2 = new Bundle();
        bundle2.putString("params", this.u);
        ddf ddfVar = new ddf();
        ddfVar.setArguments(bundle2);
        a(ddfVar);
        View headerView = this.q.getHeaderView(0);
        this.L = headerView;
        this.y = (LinearLayout) headerView.findViewById(R.id.newRequestLinearLayout);
        this.B = (LinearLayout) this.L.findViewById(R.id.requestDeviceLinearLayout);
        this.x = (LinearLayout) this.L.findViewById(R.id.llOutstandingContainer);
        TextView textView = (TextView) this.L.findViewById(R.id.tvUSSDCode);
        this.P = textView;
        textView.setOnClickListener(this);
        this.A = (LinearLayout) this.L.findViewById(R.id.icSuspendReactivateServiceLinearLayout);
        this.z = (LinearLayout) this.L.findViewById(R.id.requestUserNameAndPasswordLinearLayout);
        this.M = (TextView) this.L.findViewById(R.id.tv_balance);
        this.S = (Button) this.L.findViewById(R.id.btn_balance_services);
        this.T = (Button) this.L.findViewById(R.id.btn_recharge);
        this.U = (TextView) this.L.findViewById(R.id.tvFAQ);
        this.W = (TextView) this.L.findViewById(R.id.tvLiveChat);
        this.Q = (TextView) this.L.findViewById(R.id.txtDeactivateFBB);
        this.V = (TextView) this.L.findViewById(R.id.txtWePay);
        this.X = (TextView) this.L.findViewById(R.id.txtAppSettings);
        this.Y = (TextView) this.L.findViewById(R.id.txtInbox);
        this.Z = (TextView) this.L.findViewById(R.id.tvNotificationCount);
        this.aa = (TextView) this.L.findViewById(R.id.txtFollowUs);
        this.ab = (TextView) this.L.findViewById(R.id.txtLogOut);
        this.ac = (TextView) this.L.findViewById(R.id.requestUserNameAndPassword);
        this.af = (TextView) this.L.findViewById(R.id.tvNewRequest);
        this.ad = (TextView) this.L.findViewById(R.id.icSuspendReactivateService);
        this.R = (ImageView) this.L.findViewById(R.id.iv_balance);
        this.N = (TextView) this.L.findViewById(R.id.tv_current_balance);
        this.ae = (TextView) this.L.findViewById(R.id.offerAndExtras);
        this.ag = (TextView) this.L.findViewById(R.id.requestDevice);
        this.I.setOnClickListener(this.C);
        this.ag.setOnClickListener(this.H);
        this.ae.setOnClickListener(this.E);
        this.af.setOnClickListener(this.G);
        this.ac.setOnClickListener(this.D);
        this.S.setOnClickListener(this);
        this.T.setOnClickListener(this);
        this.U.setOnClickListener(this);
        this.W.setOnClickListener(this);
        this.Q.setOnClickListener(this);
        this.V.setOnClickListener(this);
        this.Y.setOnClickListener(this);
        this.ad.setOnClickListener(this);
        this.X.setOnClickListener(this);
        this.aa.setOnClickListener(this);
        this.ab.setOnClickListener(this);
        this.L.findViewById(R.id.btn_sign_in).setOnClickListener(this);
        b(!this.c.a());
        this.x.setVisibility(this.j.m().booleanValue() ? 0 : 8);
        if (this.j.c().booleanValue()) {
            this.af.setVisibility(0);
            this.y.setVisibility(0);
        } else {
            this.af.setVisibility(8);
            this.y.setVisibility(8);
        }
        if (this.j.d().booleanValue()) {
            this.ag.setVisibility(0);
            this.B.setVisibility(0);
        } else {
            this.ag.setVisibility(8);
            this.B.setVisibility(8);
        }
        try {
            if (!this.g.f() || this.g.Q() || !this.k.f.isFeature_suspendandresume_ADSL()) {
                this.ad.setVisibility(8);
                this.A.setVisibility(8);
            }
        } catch (Exception unused) {
            this.ad.setVisibility(8);
            this.A.setVisibility(8);
        }
        if (!this.g.g()) {
            this.ac.setVisibility(8);
            this.z.setVisibility(8);
        }
    }

    public /* synthetic */ void a(DrawerLayout drawerLayout, View view) {
        if (drawerLayout.isDrawerOpen(5)) {
            drawerLayout.closeDrawer(5);
        } else {
            drawerLayout.openDrawer(5);
        }
        djm.b(this);
        this.e.a();
    }

    public /* synthetic */ boolean a(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.navigation_home /* 2131362641 */:
                if (!this.p.getMenu().getItem(0).isChecked()) {
                    b(0);
                    a(new ddf());
                    this.t.setVisibility(8);
                    this.O.setVisibility(8);
                    this.I.setVisibility(8);
                    if (this.c.a()) {
                        this.o.setVisibility(0);
                    } else {
                        this.o.setVisibility(8);
                    }
                    this.s.setVisibility(0);
                }
                return true;
            case R.id.navigation_my_account /* 2131362642 */:
                if (!this.p.getMenu().getItem(3).isChecked() && this.c.a()) {
                    b(3);
                    a(new dfy());
                    this.t.setVisibility(8);
                    this.O.setVisibility(8);
                    this.I.setVisibility(8);
                    this.O.setText(getString(R.string.my_account));
                    this.o.setVisibility(8);
                    this.s.setVisibility(8);
                }
                return true;
            case R.id.navigation_promotions /* 2131362643 */:
                if (!this.p.getMenu().getItem(1).isChecked()) {
                    b(1);
                    a(new czf());
                    this.t.setVisibility(0);
                    this.t.setText(getString(R.string.title_promotions));
                    this.I.setVisibility(8);
                    this.o.setVisibility(8);
                    this.s.setVisibility(8);
                }
                return true;
            case R.id.navigation_store_locator /* 2131362644 */:
                if (!this.p.getMenu().getItem(2).isChecked()) {
                    b(2);
                    a(czh.a(false));
                    this.t.setText(getString(R.string.title_store_locator));
                    this.t.setVisibility(0);
                    this.I.setVisibility(8);
                    this.o.setVisibility(8);
                    this.s.setVisibility(0);
                }
                return true;
            default:
                return true;
        }
    }

    private void b(int i) {
        if (i == 0) {
            this.p.getMenu().getItem(0).setIcon(R.drawable.home_selected);
        } else {
            this.p.getMenu().getItem(0).setIcon(R.drawable.home);
        }
        if (i == 1) {
            this.p.getMenu().getItem(1).setIcon(R.drawable.promotions_selected);
        } else {
            this.p.getMenu().getItem(1).setIcon(R.drawable.promotions);
        }
        if (i == 2) {
            this.p.getMenu().getItem(2).setIcon(R.drawable.storelocator_selected);
        } else {
            this.p.getMenu().getItem(2).setIcon(R.drawable.storelocator);
        }
        if (i == 3) {
            this.p.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
            return;
        }
        this.p.getMenu().getItem(3).setIcon(R.drawable.my_account);
        if (this.c.a()) {
            return;
        }
        this.p.getMenu().getItem(3).getIcon().mutate().setAlpha(50);
    }

    @Override // defpackage.czy, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(5)) {
            drawerLayout.closeDrawer(5);
        } else if (this.p.getMenu().getItem(0).isChecked()) {
            super.onBackPressed();
            finishAffinity();
        } else if (this.p.getMenu().getItem(2).isChecked()) {
            if (this.l.getBackStackEntryCount() > 0) {
                this.l.popBackStack();
                return;
            }
            this.p.getMenu().getItem(0).setIcon(R.drawable.home_selected);
            this.p.getMenu().getItem(0).setChecked(true);
            b(0);
            a(new ddf());
            this.t.setVisibility(8);
            this.I.setVisibility(8);
            if (!this.c.a()) {
                return;
            }
            this.o.setVisibility(0);
        } else {
            this.p.getMenu().getItem(0).setIcon(R.drawable.home_selected);
            this.p.getMenu().getItem(0).setChecked(true);
            b(0);
            a(new ddf());
            this.t.setVisibility(8);
            this.I.setVisibility(8);
            if (!this.c.a()) {
                return;
            }
            this.o.setVisibility(0);
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
            this.h.b(this, SettingActivity.class);
            drawerLayout.closeDrawer(5);
            return true;
        } else if (itemId == R.id.tvLiveChat) {
            this.h.b(this, ChatWithUsActivity.class);
            drawerLayout.closeDrawer(5);
            return true;
        } else if (itemId == R.id.txtDeactivateFBB) {
            DeactivationConfirmationActivity.a(this.r);
            drawerLayout.closeDrawer(5);
            return true;
        } else if (itemId == R.id.txtWePay) {
            this.h.b(this, WePayActivity.class);
            drawerLayout.closeDrawer(5);
            return true;
        } else if (itemId == R.id.txtInbox) {
            this.h.b(this, NotificationInboxActivity.class);
            drawerLayout.closeDrawer(5);
            return true;
        } else if (itemId == R.id.nav_live_chat) {
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse("https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3="));
            startActivity(intent);
            drawerLayout.closeDrawer(5);
            return true;
        } else if (itemId == R.id.tvFAQ) {
            this.h.b(this, HelpAndSupport_Activity.class);
            drawerLayout.closeDrawer(5);
            return true;
        } else if (itemId != R.id.nav_follow) {
            return true;
        } else {
            this.h.b(this, SocialMediaActivity.class);
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
        this.K = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment);
        this.K.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.K.commit();
    }

    private void a(Fragment fragment, String str) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.K = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment, str);
        if (this.l.findFragmentByTag(str) == null) {
            this.K.addToBackStack(str);
        }
        this.K.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.K.commit();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.c.b(this);
        this.d.b(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        this.c.a((dhk) this);
        this.d.a(this);
        this.e.a(this);
        this.f.a(this);
        this.e.a();
        super.onResume();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.c.b(this);
        this.d.b(this);
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
            this.p.getMenu().getItem(2).setEnabled(true);
            this.p.getMenu().getItem(2).getIcon().mutate().setAlpha(255);
        } else {
            this.p.getMenu().getItem(3).getIcon().mutate().setAlpha(50);
            this.p.getMenu().getItem(3).setEnabled(false);
            this.R.setAlpha(0.15f);
            this.N.setAlpha(0.15f);
            this.M.setAlpha(0.15f);
        }
        this.L.findViewById(R.id.btn_sign_in).setVisibility(z ? 0 : 8);
        this.L.findViewById(R.id.sign_in_note).setVisibility(z ? 0 : 8);
        this.o.setVisibility(z ? 8 : 0);
        this.L.findViewById(R.id.btn_balance_services).setVisibility(z ? 8 : 0);
        View findViewById = this.L.findViewById(R.id.btn_recharge);
        if (z) {
            i = 8;
        }
        findViewById.setVisibility(i);
        this.q.getMenu().setGroupVisible(R.id.grp5, !z);
    }

    @Override // defpackage.dht
    public final void a(float f) {
        DecimalFormat decimalFormat = (DecimalFormat) NumberFormat.getInstance(new Locale("en", "US"));
        decimalFormat.applyPattern("##.##");
        TextView textView = this.M;
        textView.setText(decimalFormat.format(f) + getString(R.string.blance_egp));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        switch (id) {
            case R.id.btn_balance_services /* 2131362012 */:
                djx.a(this, ADSLBalanceServicesActivity.class, this.M.getText().toString());
                drawerLayout.closeDrawer(5);
                return;
            case R.id.btn_recharge /* 2131362039 */:
                this.h.b(this, BalanceRechargeActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.btn_sign_in /* 2131362047 */:
                this.h.b(this, SignInActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.icSuspendReactivateService /* 2131362321 */:
                this.h.b(this, SuspendAndResumeActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.iv_logo /* 2131362408 */:
                this.p.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
                this.p.getMenu().getItem(3).setChecked(true);
                b(3);
                a(new dgq());
                this.t.setText(getString(R.string.my_account));
                this.t.setVisibility(0);
                this.I.setVisibility(0);
                this.o.setVisibility(8);
                return;
            case R.id.tvFAQ /* 2131363024 */:
                this.h.b(this, HelpAndSupport_Activity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.tvLiveChat /* 2131363040 */:
                this.h.b(this, ChatWithUsActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.tvNewRequest /* 2131363053 */:
                this.h.b(this, NewRequestActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.tvUSSDCode /* 2131363093 */:
                this.h.b(this, USSDDetails.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.txtAppSettings /* 2131363201 */:
                this.h.b(this, SettingActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.txtContactUs /* 2131363217 */:
                this.h.b(this, ContactUsActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.txtDeactivateFBB /* 2131363221 */:
                DeactivationConfirmationActivity.a(this.r);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.txtFollowUs /* 2131363233 */:
                this.h.b(this, SocialMediaActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.txtInbox /* 2131363237 */:
                this.h.b(this, NotificationInboxActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.txtLiveChat /* 2131363247 */:
                String liveChat = this.k.f == null ? "https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3=" : this.k.f.getLiveChat();
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse(liveChat));
                startActivity(intent);
                drawerLayout.closeDrawer(5);
                return;
            case R.id.txtLogOut /* 2131363248 */:
                this.c.a((Context) this);
                return;
            case R.id.txtWePay /* 2131363291 */:
                this.h.b(this, WePayActivity.class);
                drawerLayout.closeDrawer(5);
                return;
            default:
                return;
        }
    }

    public final void c(ArrayList<StoreResponseBody> arrayList) {
        a(cze.a(arrayList), "Locator_Result");
        this.t.setVisibility(0);
        this.t.setText(getString(R.string.title_store_locator));
        this.o.setVisibility(8);
        this.I.setVisibility(8);
        this.o.setVisibility(8);
    }

    public final void k() {
        a(cyy.a(false), "Select_Location");
        this.t.setVisibility(0);
        this.t.setText(R.string.choose_location);
        this.o.setVisibility(8);
        this.I.setVisibility(8);
        this.o.setVisibility(8);
    }

    public final void g(String str) {
        this.t.setText(str);
    }

    @Override // defpackage.czs
    public final City c() {
        return this.m;
    }

    @Override // defpackage.czs
    public final void a(City city) {
        this.m = city;
    }

    @Override // defpackage.czn
    public final Area d() {
        return this.n;
    }

    @Override // defpackage.czn
    public final void a(Area area) {
        this.n = area;
    }

    @Override // defpackage.dfx
    public final void a(NotificationCount notificationCount) {
        if (notificationCount.getCount().intValue() == 0) {
            this.Z.setVisibility(8);
            return;
        }
        this.Z.setVisibility(0);
        this.Z.setText(String.valueOf(notificationCount.getCount()));
    }

    @Override // defpackage.dfx
    public final void m() {
        this.Z.setVisibility(8);
    }

    @Override // defpackage.dhx
    public final void l() {
        Intent intent = new Intent(this, SignInActivity.class);
        intent.addFlags(268468224);
        startActivity(intent);
    }
}
