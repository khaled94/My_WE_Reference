package com.ucare.we.presentation.corporatepostpaid;

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
import androidx.core.app.ActivityCompat;
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
import com.ucare.we.SettingActivity;
import com.ucare.we.SocialMediaActivity;
import com.ucare.we.SuspendAndResumeActivity;
import com.ucare.we.billservices.BillServicesActivity;
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
public class CorporatePostPaidMainActivity extends czy implements View.OnClickListener, cwj, czn, czs, dfx, dhk, dht, dju {
    public static CorporatePostPaidMainActivity a;
    TextView A;
    TextView B;
    TextView C;
    TextView D;
    TextView E;
    TextView F;
    TextView G;
    TextView H;
    TextView I;
    Context K;
    LinearLayout L;
    LinearLayout M;
    public Button aa;
    public ImageView ab;
    private View ae;
    private TextView af;
    private TextView ag;
    private TextView ah;
    private Button ai;
    private Button aj;
    private BottomNavigationView.OnNavigationItemSelectedListener ak;
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
    dhn g;
    @Inject
    djx h;
    @Inject
    dja i;
    @Inject
    dfw j;
    City l;
    Area m;
    public ImageView n;
    BottomNavigationView o;
    NavigationView p;
    TextView q;
    TextView r;
    TextView s;
    public Toolbar t;
    DrawerLayout u;
    LinearLayout x;
    LinearLayout y;
    public TextView z;
    private final int ac = 1;
    FragmentManager k = getSupportFragmentManager();
    String J = "1";
    View.OnClickListener N = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.1
        {
            CorporatePostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporatePostPaidMainActivity.this, BillServicesActivity.class);
            CorporatePostPaidMainActivity.this.u.closeDrawer(5);
            CorporatePostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener O = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.9
        {
            CorporatePostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporatePostPaidMainActivity.this, PayBillNumberTypeActivity.class);
            CorporatePostPaidMainActivity.this.u.closeDrawer(5);
            CorporatePostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener P = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.10
        {
            CorporatePostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporatePostPaidMainActivity.this.startActivity(new Intent(CorporatePostPaidMainActivity.this, OffersAndExtraActivity.class));
        }
    };
    View.OnClickListener Q = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.11
        {
            CorporatePostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporatePostPaidMainActivity.this, SettingActivity.class);
            CorporatePostPaidMainActivity.this.u.closeDrawer(5);
            CorporatePostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener R = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.12
        {
            CorporatePostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporatePostPaidMainActivity.this.c.a(CorporatePostPaidMainActivity.this.K);
        }
    };
    View.OnClickListener S = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.13
        {
            CorporatePostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporatePostPaidMainActivity.this.c.a(CorporatePostPaidMainActivity.this.K);
            CorporatePostPaidMainActivity.a(CorporatePostPaidMainActivity.this);
            CorporatePostPaidMainActivity.this.finish();
        }
    };
    View.OnClickListener T = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.14
        {
            CorporatePostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporatePostPaidMainActivity.this, SuspendAndResumeActivity.class);
            CorporatePostPaidMainActivity.this.u.closeDrawer(5);
            CorporatePostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener U = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.15
        {
            CorporatePostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporatePostPaidMainActivity.this, NewRequestActivity.class);
            CorporatePostPaidMainActivity.this.u.closeDrawer(5);
            CorporatePostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener V = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.16
        {
            CorporatePostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporatePostPaidMainActivity.this, PreferedNumberActivity.class);
            CorporatePostPaidMainActivity.this.u.closeDrawer(5);
            CorporatePostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener W = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.2
        {
            CorporatePostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporatePostPaidMainActivity.this, FamilyNumberActivity.class);
            CorporatePostPaidMainActivity.this.u.closeDrawer(5);
            CorporatePostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener X = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.3
        {
            CorporatePostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(CorporatePostPaidMainActivity.this, SocialMediaActivity.class);
            CorporatePostPaidMainActivity.this.u.closeDrawer(5);
            CorporatePostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener Y = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.-$$Lambda$CorporatePostPaidMainActivity$G2PZUNqC15YNjtGCX9fGSTvCeBI
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporatePostPaidMainActivity.lambda$G2PZUNqC15YNjtGCX9fGSTvCeBI(CorporatePostPaidMainActivity.this, view);
        }
    };
    View.OnClickListener Z = new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.-$$Lambda$CorporatePostPaidMainActivity$ECSY94edzPiDQ5WsG6MI4idhffE
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CorporatePostPaidMainActivity.lambda$ECSY94edzPiDQ5WsG6MI4idhffE(CorporatePostPaidMainActivity.this, view);
        }
    };
    private FragmentTransaction ad = getSupportFragmentManager().beginTransaction();
    private au.b<JSONObject> al = new au.b<JSONObject>() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.4
        {
            CorporatePostPaidMainActivity.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            PostPaidBalanceResponse postPaidBalanceResponse = (PostPaidBalanceResponse) new Gson().a(jSONObject.toString(), (Class<Object>) PostPaidBalanceResponse.class);
            if (postPaidBalanceResponse == null || postPaidBalanceResponse.header == null) {
                return;
            }
            if (postPaidBalanceResponse.header.responseCode.equals("0")) {
                TextView textView = CorporatePostPaidMainActivity.this.af;
                textView.setText("0 " + CorporatePostPaidMainActivity.this.getString(R.string.egp));
            } else if (!postPaidBalanceResponse.header.responseCode.equals("1200")) {
            } else {
                CorporatePostPaidMainActivity.this.b(1);
            }
        }
    };
    private au.a am = new au.a() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.5
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }

        {
            CorporatePostPaidMainActivity.this = this;
        }
    };

    public static /* synthetic */ void lambda$ECSY94edzPiDQ5WsG6MI4idhffE(CorporatePostPaidMainActivity corporatePostPaidMainActivity, View view) {
        corporatePostPaidMainActivity.a(view);
    }

    public static /* synthetic */ void lambda$G2PZUNqC15YNjtGCX9fGSTvCeBI(CorporatePostPaidMainActivity corporatePostPaidMainActivity, View view) {
        corporatePostPaidMainActivity.b(view);
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

    @Override // defpackage.dfx
    public final void m() {
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

    public /* synthetic */ void b(View view) {
        startActivity(new Intent(this, ChooseAccountActivity.class));
    }

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(this, ChatWithUsActivity.class));
        this.u.closeDrawer(5);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.f.l("postpaid");
        a = this;
        setContentView(R.layout.activity_corporate_post_paid_main);
        View findViewById = findViewById(R.id.content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.t = toolbar;
        setSupportActionBar(toolbar);
        this.z = (TextView) findViewById(R.id.tv_title);
        Button button = (Button) findViewById(R.id.btnSwitch);
        this.aa = button;
        button.setOnClickListener(this.Y);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.u = drawerLayout;
        drawerLayout.setScrimColor(0);
        this.K = this;
        djy djyVar = new djy(this, findViewById, this.u);
        this.u.addDrawerListener(djyVar);
        djyVar.syncState();
        this.t.findViewById(R.id.hamburger).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.6
            {
                CorporatePostPaidMainActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (CorporatePostPaidMainActivity.this.u.isDrawerOpen(5)) {
                    CorporatePostPaidMainActivity.this.u.closeDrawer(5);
                } else {
                    CorporatePostPaidMainActivity.this.u.openDrawer(5);
                }
                CorporatePostPaidMainActivity.this.j.a();
                djm.b(CorporatePostPaidMainActivity.this);
            }
        });
        ((ImageView) findViewById(R.id.searchImageView)).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.7
            {
                CorporatePostPaidMainActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                CorporatePostPaidMainActivity.this.startActivity(new Intent(CorporatePostPaidMainActivity.this, SearchActivity.class));
            }
        });
        this.p = (NavigationView) findViewById(R.id.nav_view);
        this.ab = (ImageView) findViewById(R.id.imgIndigoIcon);
        this.p.setItemIconTintList(null);
        ImageView imageView = (ImageView) findViewById(R.id.iv_logo);
        this.n = imageView;
        imageView.setOnClickListener(this);
        this.ak = new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity.8
            {
                CorporatePostPaidMainActivity.this = this;
            }

            @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home /* 2131362641 */:
                        if (!CorporatePostPaidMainActivity.this.o.getMenu().getItem(0).isChecked()) {
                            CorporatePostPaidMainActivity.this.c(0);
                            CorporatePostPaidMainActivity.this.a(new ddu());
                            CorporatePostPaidMainActivity.this.z.setVisibility(8);
                            CorporatePostPaidMainActivity.this.aa.setVisibility(8);
                            if (CorporatePostPaidMainActivity.this.c.a()) {
                                CorporatePostPaidMainActivity.this.n.setVisibility(0);
                            } else {
                                CorporatePostPaidMainActivity.this.n.setVisibility(8);
                            }
                            CorporatePostPaidMainActivity.this.t.setVisibility(0);
                            CorporatePostPaidMainActivity.this.ab.setVisibility(8);
                        }
                        return true;
                    case R.id.navigation_my_account /* 2131362642 */:
                        if (!CorporatePostPaidMainActivity.this.o.getMenu().getItem(3).isChecked() && CorporatePostPaidMainActivity.this.c.a()) {
                            CorporatePostPaidMainActivity.this.c(3);
                            CorporatePostPaidMainActivity.this.a(new dfy());
                            CorporatePostPaidMainActivity.this.z.setText(CorporatePostPaidMainActivity.this.getString(R.string.my_account));
                            CorporatePostPaidMainActivity.this.z.setVisibility(8);
                            CorporatePostPaidMainActivity.this.n.setVisibility(8);
                            CorporatePostPaidMainActivity.this.aa.setVisibility(8);
                            CorporatePostPaidMainActivity.this.ab.setVisibility(8);
                            CorporatePostPaidMainActivity.this.t.setVisibility(8);
                        }
                        return true;
                    case R.id.navigation_promotions /* 2131362643 */:
                        if (!CorporatePostPaidMainActivity.this.o.getMenu().getItem(1).isChecked()) {
                            CorporatePostPaidMainActivity.this.c(1);
                            CorporatePostPaidMainActivity.this.a(new czf());
                            CorporatePostPaidMainActivity.this.z.setText(CorporatePostPaidMainActivity.this.getString(R.string.title_promotions));
                            CorporatePostPaidMainActivity.this.z.setVisibility(0);
                            CorporatePostPaidMainActivity.this.aa.setVisibility(8);
                            CorporatePostPaidMainActivity.this.ab.setVisibility(8);
                            CorporatePostPaidMainActivity.this.n.setVisibility(8);
                            CorporatePostPaidMainActivity.this.t.setVisibility(8);
                        }
                        return true;
                    case R.id.navigation_store_locator /* 2131362644 */:
                        if (!CorporatePostPaidMainActivity.this.o.getMenu().getItem(2).isChecked()) {
                            CorporatePostPaidMainActivity.this.c(2);
                            CorporatePostPaidMainActivity.this.a(czh.a(false));
                            CorporatePostPaidMainActivity.this.z.setText(CorporatePostPaidMainActivity.this.getString(R.string.title_store_locator));
                            CorporatePostPaidMainActivity.this.z.setVisibility(0);
                            CorporatePostPaidMainActivity.this.n.setVisibility(8);
                            CorporatePostPaidMainActivity.this.aa.setVisibility(8);
                            CorporatePostPaidMainActivity.this.t.setVisibility(0);
                            CorporatePostPaidMainActivity.this.ab.setVisibility(8);
                        }
                        return true;
                    default:
                        return true;
                }
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
        bundle2.putString("params", this.J);
        ddu dduVar = new ddu();
        dduVar.setArguments(bundle2);
        a(dduVar);
        View headerView = this.p.getHeaderView(0);
        this.ae = headerView;
        this.af = (TextView) headerView.findViewById(R.id.txtBalance);
        this.ai = (Button) this.ae.findViewById(R.id.btnBillServices);
        this.L = (LinearLayout) this.ae.findViewById(R.id.llOutstandingContainer);
        this.aj = (Button) this.ae.findViewById(R.id.btnPayBill);
        this.ag = (TextView) this.ae.findViewById(R.id.txtAppSettings);
        this.ah = (TextView) this.ae.findViewById(R.id.txtLogOut);
        this.y = (LinearLayout) this.ae.findViewById(R.id.llOfferAndExtras);
        this.L = (LinearLayout) this.ae.findViewById(R.id.llOutstandingContainer);
        this.x = (LinearLayout) this.ae.findViewById(R.id.icSuspendReactivateServiceLinearLayout);
        TextView textView = (TextView) this.ae.findViewById(R.id.icSuspendReactivateService);
        this.r = textView;
        textView.setOnClickListener(this.T);
        this.L.setVisibility(8);
        this.D = (TextView) this.ae.findViewById(R.id.txtPreferedNumbers);
        this.E = (TextView) this.ae.findViewById(R.id.tvLiveChat);
        this.C = (TextView) this.ae.findViewById(R.id.txtFamilyNumbers);
        this.B = (TextView) this.ae.findViewById(R.id.tvNewRequest);
        this.M = (LinearLayout) this.ae.findViewById(R.id.newRequestLinearLayout);
        this.F = (TextView) this.ae.findViewById(R.id.txtFollowUs);
        this.q = (TextView) this.ae.findViewById(R.id.offerAndExtras);
        this.G = (TextView) this.ae.findViewById(R.id.tvUSSDCode);
        this.I = (TextView) this.ae.findViewById(R.id.txtWePay);
        this.A = (TextView) this.ae.findViewById(R.id.txtInbox);
        this.H = (TextView) this.ae.findViewById(R.id.tvNotificationCount);
        this.s = (TextView) this.ae.findViewById(R.id.txtFAQ);
        this.G.setOnClickListener(this);
        this.I.setOnClickListener(this);
        this.s.setOnClickListener(this);
        this.A.setOnClickListener(this);
        this.q.setOnClickListener(this.P);
        this.ai.setOnClickListener(this.N);
        this.aj.setOnClickListener(this.O);
        this.ag.setOnClickListener(this.Q);
        this.ah.setOnClickListener(this.R);
        this.D.setOnClickListener(this.V);
        this.C.setOnClickListener(this.W);
        this.B.setOnClickListener(this.U);
        this.F.setOnClickListener(this.X);
        this.E.setOnClickListener(this.Z);
        b(!this.c.a());
        if (this.c.h()) {
            this.ai.setVisibility(8);
            if (this.d.g != null && !this.d.g.getOffersAndExtrasSideMenuItem().contains(this.f.w())) {
                this.y.setVisibility(8);
                this.q.setVisibility(8);
            }
        }
        try {
            if (this.c.h()) {
                if (this.d.g != null && this.d.g.getSuspendAndResumeSideMenuItem().contains(this.f.w())) {
                    this.r.setVisibility(0);
                    this.x.setVisibility(0);
                } else {
                    this.r.setVisibility(8);
                    this.x.setVisibility(8);
                }
            }
        } catch (Exception unused) {
            this.r.setVisibility(8);
            this.x.setVisibility(8);
        }
        this.L.setVisibility(this.d.m().booleanValue() ? 0 : 8);
        this.aj.setVisibility(this.d.l().booleanValue() ? 0 : 8);
        if (this.d.c().booleanValue()) {
            this.B.setVisibility(0);
            this.M.setVisibility(0);
            return;
        }
        this.B.setVisibility(8);
        this.M.setVisibility(8);
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
            startActivity(new Intent(this, CorporatePostPaidMainActivity.class));
            finish();
        } else {
            startActivity(new Intent(this, CorporatePostPaidMainActivity.class));
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
        if (this.c.a()) {
            this.o.getMenu().getItem(2).setEnabled(true);
            this.o.getMenu().getItem(2).getIcon().mutate().setAlpha(255);
        }
        this.n.setVisibility(z ? 8 : 0);
        this.p.getMenu().setGroupVisible(R.id.grp5, !z);
    }

    public void c(int i) {
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

    public final void a(Fragment fragment) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        beginTransaction.replace(R.id.content_main, fragment);
        beginTransaction.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        beginTransaction.commit();
    }

    private void a(Fragment fragment, String str) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.ad = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment, str);
        if (this.k.findFragmentByTag(str) == null) {
            this.ad.addToBackStack(str);
        }
        this.ad.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.ad.commit();
    }

    @Override // defpackage.dht
    public final void a(float f) {
        new DecimalFormat("##.##");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_recharge /* 2131362039 */:
                this.h.b(this, BalanceRechargeActivity.class);
                break;
            case R.id.btn_sign_in /* 2131362047 */:
                this.h.b(this, SignInActivity.class);
                break;
            case R.id.iv_logo /* 2131362408 */:
                this.o.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
                this.o.getMenu().getItem(3).setChecked(true);
                c(3);
                a(new dgm());
                this.z.setText(getString(R.string.my_account));
                this.z.setVisibility(0);
                this.n.setVisibility(8);
                this.aa.setVisibility(0);
                this.ab.setVisibility(8);
                this.t.setVisibility(0);
                break;
            case R.id.tvLiveChat /* 2131363040 */:
                this.h.b(this, ChatWithUsActivity.class);
                break;
            case R.id.tvUSSDCode /* 2131363093 */:
                this.h.b(this, USSDDetails.class);
                break;
            case R.id.txtFAQ /* 2131363227 */:
                this.h.b(this, HelpAndSupport_Activity.class);
                break;
            case R.id.txtInbox /* 2131363237 */:
                this.h.b(this, NotificationInboxActivity.class);
                break;
            case R.id.txtWePay /* 2131363291 */:
                this.h.b(this, WePayActivity.class);
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
            djl.a(this).d(this.al, this.am);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void c(ArrayList<StoreResponseBody> arrayList) {
        a(cze.a(arrayList), "Locator_Result");
        this.z.setVisibility(0);
        this.z.setText(getString(R.string.title_store_locator));
        this.n.setVisibility(8);
        this.aa.setVisibility(8);
        this.t.setVisibility(0);
        this.ab.setVisibility(8);
    }

    public final void k() {
        a(cyy.a(false), "Select_Location");
        this.z.setVisibility(0);
        this.z.setText(getString(R.string.choose_location));
        this.n.setVisibility(8);
        this.aa.setVisibility(8);
        this.t.setVisibility(0);
        this.ab.setVisibility(8);
    }

    public final void g(String str) {
        this.z.setText(str);
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
            this.H.setVisibility(8);
            return;
        }
        this.H.setVisibility(0);
        this.H.setText(String.valueOf(notificationCount.getCount()));
    }

    static /* synthetic */ void a(CorporatePostPaidMainActivity corporatePostPaidMainActivity) {
        corporatePostPaidMainActivity.f.k(true);
        ActivityCompat.finishAffinity(corporatePostPaidMainActivity);
        Intent intent = new Intent(corporatePostPaidMainActivity.getApplicationContext(), SignInActivity.class);
        intent.addFlags(67108864);
        corporatePostPaidMainActivity.startActivity(intent);
    }
}
