package com.ucare.we.presentation.corporateadslpostpaid;

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
import com.android.volley.VolleyError;
import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationMenuView;
import com.google.android.material.bottomnavigation.BottomNavigationView;
import com.google.android.material.navigation.NavigationView;
import com.google.gson.Gson;
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
import com.ucare.we.billlimit.BillLimitActivity;
import com.ucare.we.chatwithus.ChatWithUsActivity;
import com.ucare.we.familynumber.FamilyNumberActivity;
import com.ucare.we.model.AreasModel.Area;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.CitiesModel.City;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.PostPaidBalanceResponse;
import com.ucare.we.model.StoreResponseBody;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.remote.pushnotification.NotificationCount;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.preferrednumber.PreferedNumberActivity;
import com.ucare.we.presentation.auth.signin.SignInActivity;
import com.ucare.we.presentation.deactivatefbb.DeactivationConfirmationActivity;
import com.ucare.we.presentation.inbox.NotificationInboxActivity;
import com.ucare.we.presentation.offers.OffersAndExtraActivity;
import com.ucare.we.presentation.paybillnumbertype.PayBillNumberTypeActivity;
import com.ucare.we.presentation.search.SearchActivity;
import com.ucare.we.presentation.ussdddetails.USSDDetails;
import com.ucare.we.presentation.wepay.WePayActivity;
import com.ucare.we.switchaccount.ChooseAccountActivity;
import defpackage.au;
import java.text.DecimalFormat;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CorporateADSLPostPaidMainActivity extends czy implements View.OnClickListener, cwj, czn, czs, dfx, dhk, dht, dju {
    public static CorporateADSLPostPaidMainActivity a;
    TextView A;
    TextView B;
    TextView C;
    TextView D;
    TextView E;
    TextView F;
    TextView G;
    TextView H;
    TextView I;
    @Inject
    dhn K;
    LinearLayout L;
    LinearLayout M;
    LinearLayout N;
    LinearLayout O;
    LinearLayout P;
    Context Q;
    private ImageView aA;
    public Button aj;
    private LinearLayout am;
    private LinearLayout an;
    private LinearLayout ao;
    private LinearLayout ap;
    private LinearLayout aq;
    private View as;
    private TextView at;
    private TextView au;
    private TextView av;
    private TextView aw;
    private Button ax;
    private Button ay;
    private BottomNavigationView.OnNavigationItemSelectedListener az;
    @Inject
    protected djb b;
    @Inject
    protected dio c;
    City d;
    Area e;
    @Inject
    dhp f;
    @Inject
    dhu g;
    @Inject
    djw h;
    @Inject
    djx i;
    @Inject
    dja j;
    @Inject
    dfw k;
    public ImageView l;
    BottomNavigationView m;
    NavigationView n;
    public Toolbar p;
    DrawerLayout q;
    TextView r;
    public TextView s;
    TextView t;
    TextView u;
    TextView x;
    TextView y;
    TextView z;
    private final int ak = 1;
    FragmentManager o = getSupportFragmentManager();
    String J = "1";
    View.OnClickListener R = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporateADSLPostPaidMainActivity.this, ADSLBalanceServicesActivity.class);
            CorporateADSLPostPaidMainActivity.this.q.closeDrawer(5);
            CorporateADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener S = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.-$$Lambda$CorporateADSLPostPaidMainActivity$zEGKLVzM0FEnnil09t4UGopYHqg
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPostPaidMainActivity.this.d(view);
        }
    };
    View.OnClickListener T = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.11
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporateADSLPostPaidMainActivity.this, PayBillNumberTypeActivity.class);
            CorporateADSLPostPaidMainActivity.this.q.closeDrawer(5);
            CorporateADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener U = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.12
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporateADSLPostPaidMainActivity.this, SettingActivity.class);
            CorporateADSLPostPaidMainActivity.this.q.closeDrawer(5);
            CorporateADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener V = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.13
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporateADSLPostPaidMainActivity.this, SuspendAndResumeActivity.class);
            CorporateADSLPostPaidMainActivity.this.q.closeDrawer(5);
            CorporateADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener W = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.14
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPostPaidMainActivity.this.c.a(CorporateADSLPostPaidMainActivity.this.Q);
        }
    };
    View.OnClickListener X = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.15
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporateADSLPostPaidMainActivity.this, RequestRouterUserNamePasswordActivity.class);
            CorporateADSLPostPaidMainActivity.this.q.closeDrawer(5);
            CorporateADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener Y = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.16
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporateADSLPostPaidMainActivity.this, NewRequestActivity.class);
            CorporateADSLPostPaidMainActivity.this.q.closeDrawer(5);
            CorporateADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener Z = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.17
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporateADSLPostPaidMainActivity.this, PreferedNumberActivity.class);
            CorporateADSLPostPaidMainActivity.this.q.closeDrawer(5);
            CorporateADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener aa = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.-$$Lambda$CorporateADSLPostPaidMainActivity$-cVK_rdZ-2KiyIjy0SKWlDD5cLI
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPostPaidMainActivity.this.c(view);
        }
    };
    View.OnClickListener ab = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.18
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporateADSLPostPaidMainActivity.this, BillLimitActivity.class);
            CorporateADSLPostPaidMainActivity.this.q.closeDrawer(5);
            CorporateADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener ac = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporateADSLPostPaidMainActivity.this, USSDDetails.class);
            CorporateADSLPostPaidMainActivity.this.q.closeDrawer(5);
            CorporateADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener ad = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporateADSLPostPaidMainActivity.this, ChatWithUsActivity.class);
            CorporateADSLPostPaidMainActivity.this.q.closeDrawer(5);
            CorporateADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener ae = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporateADSLPostPaidMainActivity.this, WePayActivity.class);
            CorporateADSLPostPaidMainActivity.this.q.closeDrawer(5);
            CorporateADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener af = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporateADSLPostPaidMainActivity.this, FamilyNumberActivity.class);
            CorporateADSLPostPaidMainActivity.this.q.closeDrawer(5);
            CorporateADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener ag = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.6
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporateADSLPostPaidMainActivity.this, SocialMediaActivity.class);
            CorporateADSLPostPaidMainActivity.this.q.closeDrawer(5);
            CorporateADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener ah = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.7
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPostPaidMainActivity.this.startActivity(new Intent(CorporateADSLPostPaidMainActivity.this, ChooseAccountActivity.class));
        }
    };
    View.OnClickListener ai = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.-$$Lambda$CorporateADSLPostPaidMainActivity$WTYcshwOTB2_rUjvmVtxC7efY7I
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporateADSLPostPaidMainActivity.this.b(view);
        }
    };
    private FragmentTransaction al = getSupportFragmentManager().beginTransaction();
    private String ar = CorporateADSLPostPaidMainActivity.class.getSimpleName();
    private au.b<JSONObject> aB = new au.b<JSONObject>() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.8
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            PostPaidBalanceResponse postPaidBalanceResponse = (PostPaidBalanceResponse) new Gson().a(jSONObject.toString(), (Class<Object>) PostPaidBalanceResponse.class);
            if (postPaidBalanceResponse == null || postPaidBalanceResponse.header == null) {
                return;
            }
            if (postPaidBalanceResponse.header.responseCode.equals("0")) {
                TextView textView = CorporateADSLPostPaidMainActivity.this.at;
                textView.setText(postPaidBalanceResponse.body.outstandingAmount + " " + CorporateADSLPostPaidMainActivity.this.getString(R.string.egp));
            } else if (!postPaidBalanceResponse.header.responseCode.equals("1200")) {
            } else {
                CorporateADSLPostPaidMainActivity.this.b(1);
            }
        }
    };
    private au.a aC = new au.a() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.9
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }
    };

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

    public /* synthetic */ void d(View view) {
        startActivity(new Intent(this, OffersAndExtraActivity.class));
    }

    public /* synthetic */ void c(View view) {
        Intent intent = new Intent(this, NotificationInboxActivity.class);
        this.q.closeDrawer(5);
        startActivity(intent);
    }

    public /* synthetic */ void b(View view) {
        this.q.closeDrawer(5);
        DeactivationConfirmationActivity.a(this.Q);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.h.l("postpaid");
        a = this;
        setContentView(R.layout.activity_corporate_adslpost_paid_main);
        View findViewById = findViewById(R.id.content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.p = toolbar;
        setSupportActionBar(toolbar);
        this.s = (TextView) findViewById(R.id.tv_title);
        Button button = (Button) findViewById(R.id.btnSwitch);
        this.aj = button;
        button.setOnClickListener(this.ah);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        this.Q = this;
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.q = drawerLayout;
        drawerLayout.setScrimColor(0);
        djy djyVar = new djy(this, findViewById, this.q);
        this.q.addDrawerListener(djyVar);
        djyVar.syncState();
        this.p.findViewById(R.id.hamburger).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.-$$Lambda$CorporateADSLPostPaidMainActivity$h564I0F6gcd4nSFLf0px-CQL__c
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CorporateADSLPostPaidMainActivity.this.a(view);
            }
        });
        ((ImageView) findViewById(R.id.searchImageView)).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity.10
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CorporateADSLPostPaidMainActivity.this.startActivity(new Intent(CorporateADSLPostPaidMainActivity.this, SearchActivity.class));
            }
        });
        this.n = (NavigationView) findViewById(R.id.nav_view);
        ImageView imageView = (ImageView) findViewById(R.id.imgIndigoIcon);
        this.aA = imageView;
        imageView.setVisibility(8);
        this.n.setItemIconTintList(null);
        ImageView imageView2 = (ImageView) findViewById(R.id.iv_logo);
        this.l = imageView2;
        imageView2.setOnClickListener(this);
        this.az = new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: com.ucare.we.presentation.corporateadslpostpaid.-$$Lambda$CorporateADSLPostPaidMainActivity$mwLr3HY3a2MEHT_Sg6t840J8Ug4
            @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                boolean a2;
                a2 = CorporateADSLPostPaidMainActivity.this.a(menuItem);
                return a2;
            }
        };
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        this.m = bottomNavigationView;
        bottomNavigationView.setOnNavigationItemSelectedListener(this.az);
        this.m.getMenu().getItem(0).setIcon(R.drawable.home_selected);
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) this.m.getChildAt(0);
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
        this.m.setItemIconTintList(null);
        Bundle bundle2 = new Bundle();
        bundle2.putString("params", this.J);
        dds ddsVar = new dds();
        ddsVar.setArguments(bundle2);
        a(ddsVar);
        View headerView = this.n.getHeaderView(0);
        this.as = headerView;
        this.r = (TextView) headerView.findViewById(R.id.tvNewRequest);
        this.L = (LinearLayout) this.as.findViewById(R.id.newRequestLinearLayout);
        this.am = (LinearLayout) this.as.findViewById(R.id.llOutstandingContainer);
        this.P = (LinearLayout) this.as.findViewById(R.id.requestDeviceLinearLayout);
        this.O = (LinearLayout) this.as.findViewById(R.id.icSuspendReactivateServiceLinearLayout);
        this.N = (LinearLayout) this.as.findViewById(R.id.requestUserNameAndPasswordLinearLayout);
        this.aq = (LinearLayout) this.as.findViewById(R.id.linearLayoutContactUs);
        this.at = (TextView) this.as.findViewById(R.id.txtBalance);
        this.ax = (Button) this.as.findViewById(R.id.btnBillServices);
        this.ay = (Button) this.as.findViewById(R.id.btnPayBill);
        this.au = (TextView) this.as.findViewById(R.id.txtAppSettings);
        this.av = (TextView) this.as.findViewById(R.id.txtLogOut);
        this.aw = (TextView) this.as.findViewById(R.id.txtDeactivateFBB);
        this.M = (LinearLayout) this.as.findViewById(R.id.dividerDeactivateFBB);
        this.r = (TextView) this.as.findViewById(R.id.tvNewRequest);
        this.G = (TextView) this.as.findViewById(R.id.requestDevice);
        this.D = (TextView) this.as.findViewById(R.id.txtPreferedNumbers);
        this.an = (LinearLayout) this.as.findViewById(R.id.llPreferedNumbers);
        this.ao = (LinearLayout) this.as.findViewById(R.id.llBillLimit);
        this.ap = (LinearLayout) this.as.findViewById(R.id.llOfferAndExtras);
        this.y = (TextView) this.as.findViewById(R.id.txtBillLimit);
        this.x = (TextView) this.as.findViewById(R.id.txtInbox);
        this.z = (TextView) this.as.findViewById(R.id.tvNotificationCount);
        this.u = (TextView) this.as.findViewById(R.id.tvUSSDCode);
        this.t = (TextView) this.as.findViewById(R.id.tvFAQ);
        this.C = (TextView) this.as.findViewById(R.id.tvLiveChat);
        this.B = (TextView) this.as.findViewById(R.id.txtWePay);
        this.F = (TextView) this.as.findViewById(R.id.requestUserNameAndPassword);
        LinearLayout linearLayout = (LinearLayout) this.as.findViewById(R.id.llOutstandingContainer);
        this.am = linearLayout;
        linearLayout.setVisibility(8);
        this.A = (TextView) this.as.findViewById(R.id.txtFamilyNumbers);
        this.H = (TextView) this.as.findViewById(R.id.icSuspendReactivateService);
        this.E = (TextView) this.as.findViewById(R.id.txtFollowUs);
        TextView textView = (TextView) this.as.findViewById(R.id.offerAndExtras);
        this.I = textView;
        textView.setOnClickListener(this.S);
        this.ax.setOnClickListener(this.R);
        this.ay.setOnClickListener(this.T);
        this.au.setOnClickListener(this.U);
        this.av.setOnClickListener(this.W);
        this.aw.setOnClickListener(this.ai);
        this.F.setOnClickListener(this.X);
        this.D.setOnClickListener(this.Z);
        this.y.setOnClickListener(this.ab);
        this.x.setOnClickListener(this.aa);
        this.u.setOnClickListener(this.ac);
        this.C.setOnClickListener(this.ad);
        this.B.setOnClickListener(this.ae);
        this.A.setOnClickListener(this.af);
        this.H.setOnClickListener(this.V);
        this.r.setOnClickListener(this.Y);
        this.E.setOnClickListener(this.ag);
        this.t.setOnClickListener(this);
        b(!this.c.a());
        this.am.setVisibility(this.f.m().booleanValue() ? 0 : 8);
        this.ay.setVisibility(this.f.l().booleanValue() ? 0 : 8);
        if (this.f.c().booleanValue()) {
            this.r.setVisibility(0);
            this.L.setVisibility(0);
        } else {
            this.r.setVisibility(8);
            this.L.setVisibility(8);
        }
        if (this.f.d().booleanValue()) {
            this.G.setVisibility(0);
            this.P.setVisibility(0);
        } else {
            this.G.setVisibility(8);
            this.P.setVisibility(8);
        }
        try {
            if (!this.h.f() || ((this.c.h() && this.c.i()) || !this.K.f.isFeature_suspendandresume_ADSL_corporate() || !this.K.f.isFeature_suspendandresume_ADSL() || this.h.Q())) {
                this.H.setVisibility(8);
                this.O.setVisibility(8);
            }
        } catch (Exception unused) {
            this.H.setVisibility(8);
            this.O.setVisibility(8);
        }
        if (!this.h.g()) {
            this.F.setVisibility(8);
            this.N.setVisibility(8);
        }
        if (!this.K.f.isFeature_bill_limit_ADSL()) {
            this.ao.setVisibility(8);
            this.y.setVisibility(8);
        }
        if (this.c.h()) {
            this.ax.setVisibility(8);
            this.am.setVisibility(this.f.m().booleanValue() ? 0 : 8);
            this.ay.setVisibility(this.f.l().booleanValue() ? 0 : 8);
            if (this.f.c().booleanValue()) {
                this.r.setVisibility(0);
                this.L.setVisibility(0);
            } else {
                this.r.setVisibility(8);
                this.L.setVisibility(8);
            }
            this.ao.setVisibility(8);
            this.y.setVisibility(8);
            this.an.setVisibility(8);
            this.D.setVisibility(8);
            this.M.setVisibility(8);
            if (this.c.k() || this.c.i()) {
                this.ap.setVisibility(8);
                this.I.setVisibility(8);
            }
        }
        if (this.c.j()) {
            this.aw.setVisibility(0);
            this.M.setVisibility(0);
            return;
        }
        this.aw.setVisibility(8);
        this.M.setVisibility(8);
    }

    public /* synthetic */ void a(View view) {
        if (this.q.isDrawerOpen(5)) {
            this.q.closeDrawer(5);
        } else {
            this.q.openDrawer(5);
        }
        this.k.a();
        djm.b(this);
    }

    public /* synthetic */ boolean a(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.navigation_home /* 2131362641 */:
                if (!this.m.getMenu().getItem(0).isChecked()) {
                    c(0);
                    a(new dds());
                    this.s.setVisibility(8);
                    this.aj.setVisibility(8);
                    if (this.c.a()) {
                        this.l.setVisibility(0);
                    } else {
                        this.l.setVisibility(8);
                    }
                    this.p.setVisibility(0);
                }
                return true;
            case R.id.navigation_my_account /* 2131362642 */:
                if (!this.m.getMenu().getItem(3).isChecked() && this.c.a()) {
                    c(3);
                    a(new dfy());
                    this.s.setText(getString(R.string.my_account));
                    this.s.setVisibility(8);
                    this.l.setVisibility(8);
                    this.aj.setVisibility(8);
                    this.p.setVisibility(8);
                }
                return true;
            case R.id.navigation_promotions /* 2131362643 */:
                if (!this.m.getMenu().getItem(1).isChecked()) {
                    c(1);
                    a(new czf());
                    this.s.setText(getString(R.string.title_promotions));
                    this.s.setVisibility(0);
                    this.aj.setVisibility(8);
                    this.l.setVisibility(8);
                    this.p.setVisibility(8);
                }
                return true;
            case R.id.navigation_store_locator /* 2131362644 */:
                if (!this.m.getMenu().getItem(2).isChecked()) {
                    c(2);
                    a(czh.a(false));
                    this.s.setText(getString(R.string.title_store_locator));
                    this.s.setVisibility(0);
                    this.l.setVisibility(8);
                    this.aj.setVisibility(8);
                    this.p.setVisibility(0);
                }
                return true;
            default:
                return true;
        }
    }

    private void c(int i) {
        if (i == 0) {
            this.m.getMenu().getItem(0).setIcon(R.drawable.home_selected);
        } else {
            this.m.getMenu().getItem(0).setIcon(R.drawable.home);
        }
        if (i == 1) {
            this.m.getMenu().getItem(1).setIcon(R.drawable.promotions_selected);
        } else {
            this.m.getMenu().getItem(1).setIcon(R.drawable.promotions);
        }
        if (i == 2) {
            this.m.getMenu().getItem(2).setIcon(R.drawable.storelocator_selected);
        } else {
            this.m.getMenu().getItem(2).setIcon(R.drawable.storelocator);
        }
        if (i == 3) {
            this.m.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
            return;
        }
        this.m.getMenu().getItem(3).setIcon(R.drawable.my_account);
        if (this.c.a()) {
            return;
        }
        this.m.getMenu().getItem(3).getIcon().mutate().setAlpha(50);
    }

    @Override // defpackage.czy, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(5)) {
            drawerLayout.closeDrawer(5);
        } else if (this.m.getMenu().getItem(0).isChecked()) {
            super.onBackPressed();
            finishAffinity();
        } else if (this.m.getMenu().getItem(2).isChecked()) {
            if (this.o.getBackStackEntryCount() > 0) {
                this.o.popBackStack();
                return;
            }
            startActivity(new Intent(this, CorporateADSLPostPaidMainActivity.class));
            finish();
        } else {
            startActivity(new Intent(this, CorporateADSLPostPaidMainActivity.class));
            finish();
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

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity, android.content.ComponentCallbacks
    public void onConfigurationChanged(Configuration configuration) {
        ((DrawerLayout) findViewById(R.id.drawer_layout)).closeDrawer(5);
        super.onConfigurationChanged(configuration);
        this.b.a();
    }

    public final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.al = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment);
        this.al.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.al.commit();
    }

    private void a(Fragment fragment, String str) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.al = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment, str);
        if (this.o.findFragmentByTag(str) == null) {
            this.al.addToBackStack(str);
        }
        this.al.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.al.commit();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.c.b(this);
        this.g.b(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        this.c.a((dhk) this);
        this.g.a(this);
        this.k.a(this);
        this.k.a();
        super.onResume();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.c.b(this);
        this.g.b(this);
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
            this.m.getMenu().getItem(2).setEnabled(true);
            this.m.getMenu().getItem(2).getIcon().mutate().setAlpha(255);
        } else {
            this.m.getMenu().getItem(2).getIcon().mutate().setAlpha(50);
            this.m.getMenu().getItem(2).setEnabled(false);
        }
        ImageView imageView = this.l;
        if (z) {
            i = 8;
        }
        imageView.setVisibility(i);
        this.n.getMenu().setGroupVisible(R.id.grp5, !z);
    }

    @Override // defpackage.dht
    public final void a(float f) {
        new DecimalFormat("##.##");
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_recharge /* 2131362039 */:
                this.i.b(this, BalanceRechargeActivity.class);
                break;
            case R.id.btn_sign_in /* 2131362047 */:
                this.i.b(this, SignInActivity.class);
                this.i.b(this, RequestDeviceActivity.class);
                break;
            case R.id.icSuspendReactivateService /* 2131362321 */:
                this.i.b(this, SuspendAndResumeActivity.class);
                break;
            case R.id.iv_logo /* 2131362408 */:
                this.m.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
                this.m.getMenu().getItem(3).setChecked(true);
                c(3);
                a(new dgm());
                this.s.setText(getString(R.string.my_account));
                this.s.setVisibility(0);
                this.l.setVisibility(8);
                this.aj.setVisibility(0);
                this.p.setVisibility(0);
                break;
            case R.id.tvFAQ /* 2131363024 */:
                this.i.b(this, HelpAndSupport_Activity.class);
                break;
            case R.id.tvNewRequest /* 2131363053 */:
                this.i.b(this, RequestDeviceActivity.class);
                break;
        }
        ((DrawerLayout) findViewById(R.id.drawer_layout)).closeDrawer(5);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i != 1) {
            return;
        }
        try {
            djl.a(this).d(this.aB, this.aC);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void c(ArrayList<StoreResponseBody> arrayList) {
        a(cze.a(arrayList), "Locator_Result");
        this.s.setVisibility(0);
        this.s.setText(getString(R.string.title_store_locator));
        this.l.setVisibility(8);
        this.aj.setVisibility(8);
        this.p.setVisibility(0);
    }

    public final void k() {
        a(cyy.a(false), "Select_Location");
        this.s.setVisibility(0);
        this.s.setText(getString(R.string.choose_location));
        this.l.setVisibility(8);
        this.aj.setVisibility(8);
        this.p.setVisibility(0);
    }

    public final void g(String str) {
        this.s.setText(str);
    }

    @Override // defpackage.czs
    public final City c() {
        return this.d;
    }

    @Override // defpackage.czs
    public final void a(City city) {
        this.d = city;
    }

    @Override // defpackage.czn
    public final Area d() {
        return this.e;
    }

    @Override // defpackage.czn
    public final void a(Area area) {
        this.e = area;
    }

    @Override // defpackage.dfx
    public final void a(NotificationCount notificationCount) {
        if (notificationCount.getCount().intValue() == 0) {
            this.z.setVisibility(8);
            return;
        }
        this.z.setVisibility(0);
        this.z.setText(String.valueOf(notificationCount.getCount()));
    }

    @Override // defpackage.dfx
    public final void m() {
        this.z.setVisibility(8);
    }
}
