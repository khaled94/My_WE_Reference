package com.ucare.we.presentation.postpaid;

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
import com.ucare.we.billlimit.BillLimitActivity;
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
import com.ucare.we.presentation.contactus.ContactUsActivity;
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
public class PostPaidMainActivity extends czy implements View.OnClickListener, cwj, czn, czs, dfx, dhk, dht, dju {
    public static PostPaidMainActivity a;
    TextView A;
    TextView B;
    TextView C;
    TextView D;
    TextView E;
    TextView F;
    TextView G;
    TextView H;
    LinearLayout I;
    LinearLayout J;
    LinearLayout K;
    LinearLayout L;
    LinearLayout M;
    public Button ae;
    public ImageView af;
    private View ai;
    private TextView aj;
    private TextView ak;
    private TextView al;
    private TextView am;
    private Button an;
    private Button ao;
    private BottomNavigationView.OnNavigationItemSelectedListener ap;
    @Inject
    protected djb b;
    @Inject
    protected dio c;
    @Inject
    protected dhp d;
    City e;
    Area f;
    @Inject
    dhu g;
    @Inject
    djw h;
    @Inject
    djx i;
    @Inject
    dfw j;
    @Inject
    dja k;
    public ImageView l;
    BottomNavigationView m;
    @Inject
    dhn n;
    Context o;
    NavigationView p;
    public Toolbar r;
    DrawerLayout s;
    TextView t;
    public TextView u;
    TextView x;
    TextView y;
    TextView z;
    private final int ag = 1;
    FragmentManager q = getSupportFragmentManager();
    String N = "1";
    View.OnClickListener O = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.1
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(PostPaidMainActivity.this, BillServicesActivity.class);
            PostPaidMainActivity.this.s.closeDrawer(5);
            PostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener P = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.12
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(PostPaidMainActivity.this, PayBillNumberTypeActivity.class);
            PostPaidMainActivity.this.s.closeDrawer(5);
            PostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener Q = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.13
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(PostPaidMainActivity.this, NewRequestActivity.class);
            PostPaidMainActivity.this.s.closeDrawer(5);
            PostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener R = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.14
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(PostPaidMainActivity.this, SettingActivity.class);
            PostPaidMainActivity.this.s.closeDrawer(5);
            PostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener S = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.-$$Lambda$PostPaidMainActivity$rnzLvkKtqcq9zLl0I8-TjrUppzs
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostPaidMainActivity.m57lambda$rnzLvkKtqcq9zLl0I8TjrUppzs(PostPaidMainActivity.this, view);
        }
    };
    View.OnClickListener T = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.-$$Lambda$PostPaidMainActivity$2URHpRnfIsOXcdbfYlmMIVfH3xk
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostPaidMainActivity.lambda$2URHpRnfIsOXcdbfYlmMIVfH3xk(PostPaidMainActivity.this, view);
        }
    };
    View.OnClickListener U = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.15
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostPaidMainActivity.this.c.a(PostPaidMainActivity.this.o);
        }
    };
    View.OnClickListener V = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.16
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(PostPaidMainActivity.this, ContactUsActivity.class);
            PostPaidMainActivity.this.s.closeDrawer(5);
            PostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener W = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.17
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String liveChat = PostPaidMainActivity.this.n.f == null ? "https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3=" : PostPaidMainActivity.this.n.f.getLiveChat();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(liveChat));
            PostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener X = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.18
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(PostPaidMainActivity.this, PreferedNumberActivity.class);
            PostPaidMainActivity.this.s.closeDrawer(5);
            PostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener Y = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.19
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(PostPaidMainActivity.this, BillLimitActivity.class);
            PostPaidMainActivity.this.s.closeDrawer(5);
            PostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener Z = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.2
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(PostPaidMainActivity.this, FamilyNumberActivity.class);
            PostPaidMainActivity.this.s.closeDrawer(5);
            PostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener aa = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.3
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(PostPaidMainActivity.this, SocialMediaActivity.class);
            PostPaidMainActivity.this.s.closeDrawer(5);
            PostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener ab = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.4
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(PostPaidMainActivity.this, ChatWithUsActivity.class);
            PostPaidMainActivity.this.s.closeDrawer(5);
            PostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener ac = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.5
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(PostPaidMainActivity.this, WePayActivity.class);
            PostPaidMainActivity.this.s.closeDrawer(5);
            PostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener ad = new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.6
        {
            PostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PostPaidMainActivity.this.startActivity(new Intent(PostPaidMainActivity.this, ChooseAccountActivity.class));
        }
    };
    private FragmentTransaction ah = getSupportFragmentManager().beginTransaction();
    private au.b<JSONObject> aq = new au.b<JSONObject>() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.7
        {
            PostPaidMainActivity.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            PostPaidBalanceResponse postPaidBalanceResponse = (PostPaidBalanceResponse) new Gson().a(jSONObject.toString(), (Class<Object>) PostPaidBalanceResponse.class);
            if (postPaidBalanceResponse == null || postPaidBalanceResponse.header == null) {
                return;
            }
            if (postPaidBalanceResponse.header.responseCode.equals("0")) {
                TextView textView = PostPaidMainActivity.this.aj;
                textView.setText(postPaidBalanceResponse.body.outstandingAmount + " " + PostPaidMainActivity.this.getString(R.string.egp));
            } else if (!postPaidBalanceResponse.header.responseCode.equals("1200")) {
            } else {
                PostPaidMainActivity.this.b(1);
            }
        }
    };
    private au.a ar = new au.a() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.8
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }

        {
            PostPaidMainActivity.this = this;
        }
    };

    public static /* synthetic */ void lambda$2URHpRnfIsOXcdbfYlmMIVfH3xk(PostPaidMainActivity postPaidMainActivity, View view) {
        postPaidMainActivity.a(view);
    }

    /* renamed from: lambda$rnzLvkKtqcq9zLl0I8-TjrUppzs */
    public static /* synthetic */ void m57lambda$rnzLvkKtqcq9zLl0I8TjrUppzs(PostPaidMainActivity postPaidMainActivity, View view) {
        postPaidMainActivity.b(view);
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

    public /* synthetic */ void b(View view) {
        startActivity(new Intent(this, OffersAndExtraActivity.class));
    }

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(this, NotificationInboxActivity.class));
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.h.l("postpaid");
        a = this;
        setContentView(R.layout.post_paid_activity_main);
        View findViewById = findViewById(R.id.content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.r = toolbar;
        setSupportActionBar(toolbar);
        this.u = (TextView) findViewById(R.id.tv_title);
        Button button = (Button) findViewById(R.id.btnSwitch);
        this.ae = button;
        button.setOnClickListener(this.ad);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        this.o = this;
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.s = drawerLayout;
        drawerLayout.setScrimColor(0);
        djy djyVar = new djy(this, findViewById, this.s);
        this.s.addDrawerListener(djyVar);
        djyVar.syncState();
        this.r.findViewById(R.id.hamburger).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.9
            {
                PostPaidMainActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (PostPaidMainActivity.this.s.isDrawerOpen(5)) {
                    PostPaidMainActivity.this.s.closeDrawer(5);
                } else {
                    PostPaidMainActivity.this.s.openDrawer(5);
                }
                PostPaidMainActivity.this.j.a();
                djm.b(PostPaidMainActivity.this);
            }
        });
        ((ImageView) findViewById(R.id.searchImageView)).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.10
            {
                PostPaidMainActivity.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                PostPaidMainActivity.this.startActivity(new Intent(PostPaidMainActivity.this, SearchActivity.class));
            }
        });
        this.p = (NavigationView) findViewById(R.id.nav_view);
        this.af = (ImageView) findViewById(R.id.imgIndigoIcon);
        this.p.setItemIconTintList(null);
        ImageView imageView = (ImageView) findViewById(R.id.iv_logo);
        this.l = imageView;
        imageView.setOnClickListener(this);
        this.ap = new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: com.ucare.we.presentation.postpaid.PostPaidMainActivity.11
            {
                PostPaidMainActivity.this = this;
            }

            @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home /* 2131362641 */:
                        if (!PostPaidMainActivity.this.m.getMenu().getItem(0).isChecked()) {
                            PostPaidMainActivity.this.c(0);
                            PostPaidMainActivity.this.a(new dge());
                            PostPaidMainActivity.this.u.setVisibility(8);
                            PostPaidMainActivity.this.ae.setVisibility(8);
                            if (PostPaidMainActivity.this.c.a()) {
                                PostPaidMainActivity.this.l.setVisibility(0);
                            } else {
                                PostPaidMainActivity.this.l.setVisibility(8);
                            }
                            PostPaidMainActivity.this.r.setVisibility(0);
                            PostPaidMainActivity.this.af.setVisibility(8);
                        }
                        return true;
                    case R.id.navigation_my_account /* 2131362642 */:
                        if (!PostPaidMainActivity.this.m.getMenu().getItem(3).isChecked() && PostPaidMainActivity.this.c.a()) {
                            PostPaidMainActivity.this.c(3);
                            PostPaidMainActivity.this.a(new dfy());
                            PostPaidMainActivity.this.u.setText(PostPaidMainActivity.this.getString(R.string.my_account));
                            PostPaidMainActivity.this.u.setVisibility(8);
                            PostPaidMainActivity.this.l.setVisibility(8);
                            PostPaidMainActivity.this.ae.setVisibility(8);
                            PostPaidMainActivity.this.af.setVisibility(8);
                            PostPaidMainActivity.this.r.setVisibility(8);
                        }
                        return true;
                    case R.id.navigation_promotions /* 2131362643 */:
                        if (!PostPaidMainActivity.this.m.getMenu().getItem(1).isChecked()) {
                            PostPaidMainActivity.this.c(1);
                            PostPaidMainActivity.this.a(new czf());
                            PostPaidMainActivity.this.u.setText(PostPaidMainActivity.this.getString(R.string.title_promotions));
                            PostPaidMainActivity.this.u.setVisibility(0);
                            PostPaidMainActivity.this.ae.setVisibility(8);
                            PostPaidMainActivity.this.af.setVisibility(8);
                            PostPaidMainActivity.this.l.setVisibility(8);
                            PostPaidMainActivity.this.r.setVisibility(8);
                        }
                        return true;
                    case R.id.navigation_store_locator /* 2131362644 */:
                        if (!PostPaidMainActivity.this.m.getMenu().getItem(2).isChecked()) {
                            PostPaidMainActivity.this.c(2);
                            PostPaidMainActivity.this.a(czh.a(false));
                            PostPaidMainActivity.this.u.setText(PostPaidMainActivity.this.getString(R.string.title_store_locator));
                            PostPaidMainActivity.this.u.setVisibility(0);
                            PostPaidMainActivity.this.l.setVisibility(8);
                            PostPaidMainActivity.this.ae.setVisibility(8);
                            PostPaidMainActivity.this.r.setVisibility(0);
                            PostPaidMainActivity.this.af.setVisibility(8);
                        }
                        return true;
                    default:
                        return true;
                }
            }
        };
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        this.m = bottomNavigationView;
        bottomNavigationView.setOnNavigationItemSelectedListener(this.ap);
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
        bundle2.putString("params", this.N);
        dge dgeVar = new dge();
        dgeVar.setArguments(bundle2);
        a(dgeVar);
        View headerView = this.p.getHeaderView(0);
        this.ai = headerView;
        this.t = (TextView) headerView.findViewById(R.id.tvNewRequest);
        this.M = (LinearLayout) this.ai.findViewById(R.id.requestDeviceLinearLayout);
        this.I = (LinearLayout) this.ai.findViewById(R.id.llOutstandingContainer);
        this.J = (LinearLayout) this.ai.findViewById(R.id.newRequestLinearLayout);
        this.L = (LinearLayout) this.ai.findViewById(R.id.icSuspendReactivateServiceLinearLayout);
        this.K = (LinearLayout) this.ai.findViewById(R.id.requestUserNameAndPasswordLinearLayout);
        this.aj = (TextView) this.ai.findViewById(R.id.txtBalance);
        this.an = (Button) this.ai.findViewById(R.id.btnBillServices);
        this.ao = (Button) this.ai.findViewById(R.id.btnPayBill);
        this.ak = (TextView) this.ai.findViewById(R.id.txtAppSettings);
        this.al = (TextView) this.ai.findViewById(R.id.txtLogOut);
        this.am = (TextView) this.ai.findViewById(R.id.txtContactUs);
        this.E = (TextView) this.ai.findViewById(R.id.txtPreferedNumbers);
        this.B = (TextView) this.ai.findViewById(R.id.txtBillLimit);
        this.C = (TextView) this.ai.findViewById(R.id.txtFamilyNumbers);
        this.F = (TextView) this.ai.findViewById(R.id.txtFollowUs);
        this.D = (TextView) this.ai.findViewById(R.id.txtWePay);
        this.z = (TextView) this.ai.findViewById(R.id.txtInbox);
        this.A = (TextView) this.ai.findViewById(R.id.tvNotificationCount);
        TextView textView = (TextView) this.ai.findViewById(R.id.offerAndExtras);
        this.G = textView;
        textView.setOnClickListener(this.S);
        this.an.setOnClickListener(this.O);
        this.ao.setOnClickListener(this.P);
        this.ak.setOnClickListener(this.R);
        this.al.setOnClickListener(this.U);
        this.z.setOnClickListener(this.T);
        this.am.setOnClickListener(this.V);
        this.E.setOnClickListener(this.X);
        this.B.setOnClickListener(this.Y);
        this.C.setOnClickListener(this.Z);
        this.F.setOnClickListener(this.aa);
        this.D.setOnClickListener(this.ac);
        b(!this.c.a());
        this.H = (TextView) this.ai.findViewById(R.id.tvUSSDCode);
        this.t.setOnClickListener(this.Q);
        this.H.setOnClickListener(this);
        this.y = (TextView) this.ai.findViewById(R.id.tvFAQ);
        TextView textView2 = (TextView) this.ai.findViewById(R.id.tvLiveChat);
        this.x = textView2;
        textView2.setOnClickListener(this.ab);
        this.x.setOnClickListener(this);
        this.y.setOnClickListener(this);
        this.I.setVisibility(this.d.m().booleanValue() ? 0 : 8);
        if (this.d.c().booleanValue()) {
            this.t.setVisibility(0);
            this.J.setVisibility(0);
            return;
        }
        this.t.setVisibility(8);
        this.J.setVisibility(8);
    }

    public void c(int i) {
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
            if (this.q.getBackStackEntryCount() > 0) {
                this.q.popBackStack();
                return;
            }
            startActivity(new Intent(this, PostPaidMainActivity.class));
            finish();
        } else {
            startActivity(new Intent(this, PostPaidMainActivity.class));
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
        this.ah = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment);
        this.ah.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.ah.commit();
    }

    private void a(Fragment fragment, String str) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.ah = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment, str);
        if (this.q.findFragmentByTag(str) == null) {
            this.ah.addToBackStack(str);
        }
        this.ah.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.ah.commit();
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
        try {
            djl.a(this).d(this.aq, this.ar);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.j.a(this);
        this.j.a();
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
        this.p.getMenu().setGroupVisible(R.id.grp5, !z);
    }

    @Override // defpackage.dht
    public final void a(float f) {
        new DecimalFormat("##.##");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_recharge /* 2131362039 */:
                this.i.b(this, BalanceRechargeActivity.class);
                break;
            case R.id.btn_sign_in /* 2131362047 */:
                this.i.b(this, SignInActivity.class);
                break;
            case R.id.iv_logo /* 2131362408 */:
                this.m.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
                this.m.getMenu().getItem(3).setChecked(true);
                c(3);
                a(new dgm());
                this.u.setText(getString(R.string.my_account));
                this.u.setVisibility(0);
                this.l.setVisibility(8);
                this.ae.setVisibility(0);
                this.af.setVisibility(8);
                this.r.setVisibility(0);
                break;
            case R.id.tvFAQ /* 2131363024 */:
                this.i.b(this, HelpAndSupport_Activity.class);
                break;
            case R.id.tvLiveChat /* 2131363040 */:
                this.i.b(this, ChatWithUsActivity.class);
                break;
            case R.id.tvUSSDCode /* 2131363093 */:
                this.i.b(this, USSDDetails.class);
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
            djl.a(this).d(this.aq, this.ar);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void c(ArrayList<StoreResponseBody> arrayList) {
        a(cze.a(arrayList), "Locator_Result");
        this.u.setVisibility(0);
        this.u.setText(getString(R.string.title_store_locator));
        this.l.setVisibility(8);
        this.ae.setVisibility(8);
        this.r.setVisibility(0);
        this.af.setVisibility(8);
    }

    public final void k() {
        a(cyy.a(false), "Select_Location");
        this.u.setVisibility(0);
        this.u.setText(getString(R.string.choose_location));
        this.l.setVisibility(8);
        this.ae.setVisibility(8);
        this.r.setVisibility(0);
        this.af.setVisibility(8);
    }

    public final void g(String str) {
        this.u.setText(str);
    }

    @Override // defpackage.czs
    public final City c() {
        return this.e;
    }

    @Override // defpackage.czs
    public final void a(City city) {
        this.e = city;
    }

    @Override // defpackage.czn
    public final Area d() {
        return this.f;
    }

    @Override // defpackage.czn
    public final void a(Area area) {
        this.f = area;
    }

    @Override // defpackage.dfx
    public final void a(NotificationCount notificationCount) {
        if (notificationCount.getCount().intValue() == 0) {
            this.A.setVisibility(8);
            return;
        }
        this.A.setVisibility(0);
        this.A.setText(String.valueOf(notificationCount.getCount()));
    }

    @Override // defpackage.dfx
    public final void m() {
        this.A.setVisibility(8);
    }
}
