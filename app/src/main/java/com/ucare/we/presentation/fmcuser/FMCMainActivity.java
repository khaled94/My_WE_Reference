package com.ucare.we.presentation.fmcuser;

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
import com.ucare.we.RequestRouterUserNamePasswordActivity;
import com.ucare.we.SettingActivity;
import com.ucare.we.SocialMediaActivity;
import com.ucare.we.billlimit.BillLimitActivity;
import com.ucare.we.billservices.BillServicesActivity;
import com.ucare.we.chatwithus.ChatWithUsActivity;
import com.ucare.we.familynumber.FamilyNumberActivity;
import com.ucare.we.model.AreasModel.Area;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.CitiesModel.City;
import com.ucare.we.model.FMCModel.FMCMemebrsResponse;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.PostPaidBalanceResponse;
import com.ucare.we.model.StoreResponseBody;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.remote.pushnotification.NotificationCount;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.preferrednumber.PreferedNumberActivity;
import com.ucare.we.presentation.auth.signin.SignInActivity;
import com.ucare.we.presentation.fmcuser.FMCMSISDNSelector.FMCMSISDNSelector;
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
public class FMCMainActivity extends czy implements View.OnClickListener, cwj, czn, czs, dfx, dhk, dht, dju {
    public static FMCMainActivity a;
    TextView A;
    TextView B;
    TextView C;
    TextView D;
    TextView E;
    TextView F;
    TextView G;
    LinearLayout H;
    LinearLayout I;
    LinearLayout J;
    LinearLayout K;
    LinearLayout L;
    LinearLayout M;
    public Button ae;
    public ImageView af;
    private FMCMemebrsResponse ah;
    private View aj;
    private TextView ak;
    private TextView al;
    private TextView am;
    private TextView an;
    private TextView ao;
    private TextView ap;
    private TextView aq;
    private Button ar;
    private Button as;
    private BottomNavigationView.OnNavigationItemSelectedListener at;
    @Inject
    protected djb b;
    @Inject
    protected dhp c;
    @Inject
    protected dio d;
    City e;
    Area f;
    @Inject
    dhu g;
    @Inject
    djw h;
    @Inject
    djx i;
    @Inject
    dja j;
    @Inject
    dhn k;
    @Inject
    dfw l;
    public ImageView m;
    BottomNavigationView n;
    NavigationView o;
    Context p;
    public Toolbar r;
    DrawerLayout s;
    TextView t;
    TextView u;
    public TextView x;
    TextView y;
    TextView z;
    private final int ag = 1;
    FragmentManager q = getSupportFragmentManager();
    String N = "1";
    View.OnClickListener O = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(FMCMainActivity.this, BillServicesActivity.class);
            FMCMainActivity.this.s.closeDrawer(5);
            FMCMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener P = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.12
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(FMCMainActivity.this, PayBillNumberTypeActivity.class);
            FMCMainActivity.this.s.closeDrawer(5);
            FMCMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener Q = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.14
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(FMCMainActivity.this, SettingActivity.class);
            FMCMainActivity.this.s.closeDrawer(5);
            FMCMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener R = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.-$$Lambda$FMCMainActivity$oWKI64GEZkE6UEcTxBsqvI9Y1CU
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FMCMainActivity.this.c(view);
        }
    };
    View.OnClickListener S = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.15
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(FMCMainActivity.this, NewRequestActivity.class);
            FMCMainActivity.this.s.closeDrawer(5);
            FMCMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener T = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.16
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(FMCMainActivity.this, FMCMSISDNSelector.class);
            FMCMainActivity.this.s.closeDrawer(5);
            intent.putExtra("FMC_NUMBER_TYPE", 2);
            FMCMainActivity.this.startActivityForResult(intent, 92);
        }
    };
    View.OnClickListener U = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.17
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(FMCMainActivity.this, HelpAndSupport_Activity.class);
            FMCMainActivity.this.s.closeDrawer(5);
            FMCMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener V = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.18
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FMCMainActivity.this.d.a(FMCMainActivity.this.p);
        }
    };
    View.OnClickListener W = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.19
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(FMCMainActivity.this, FMCMSISDNSelector.class);
            FMCMainActivity.this.s.closeDrawer(5);
            intent.putExtra("FMC_NUMBER_TYPE", 1);
            FMCMainActivity.this.startActivityForResult(intent, 90);
        }
    };
    View.OnClickListener X = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.20
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(FMCMainActivity.this, BillLimitActivity.class);
            FMCMainActivity.this.s.closeDrawer(5);
            FMCMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener Y = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(FMCMainActivity.this, FamilyNumberActivity.class);
            FMCMainActivity.this.s.closeDrawer(5);
            FMCMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener Z = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(FMCMainActivity.this, SocialMediaActivity.class);
            FMCMainActivity.this.s.closeDrawer(5);
            FMCMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener aa = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FMCMainActivity.this.startActivity(new Intent(FMCMainActivity.this, ChooseAccountActivity.class));
        }
    };
    View.OnClickListener ab = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.-$$Lambda$FMCMainActivity$pyQxzgya3ElM2NhlVD3Qi7-D9u0
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            FMCMainActivity.this.b(view);
        }
    };
    View.OnClickListener ac = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(FMCMainActivity.this, ChatWithUsActivity.class);
            FMCMainActivity.this.s.closeDrawer(5);
            FMCMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener ad = new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.6
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(FMCMainActivity.this, WePayActivity.class);
            FMCMainActivity.this.s.closeDrawer(5);
            FMCMainActivity.this.startActivity(intent);
        }
    };
    private FragmentTransaction ai = getSupportFragmentManager().beginTransaction();
    private au.b<JSONObject> au = new au.b<JSONObject>() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.7
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            PostPaidBalanceResponse postPaidBalanceResponse = (PostPaidBalanceResponse) new Gson().a(jSONObject.toString(), (Class<Object>) PostPaidBalanceResponse.class);
            if (postPaidBalanceResponse == null || postPaidBalanceResponse.header == null) {
                return;
            }
            if (postPaidBalanceResponse.header.responseCode.equals("0")) {
                TextView textView = FMCMainActivity.this.ak;
                textView.setText(postPaidBalanceResponse.body.outstandingAmount + " " + FMCMainActivity.this.getString(R.string.egp));
            } else if (!postPaidBalanceResponse.header.responseCode.equals("1200")) {
            } else {
                FMCMainActivity.this.b(1);
            }
        }
    };
    private au.a av = new au.a() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.8
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }
    };
    private au.b<JSONObject> aw = new au.b<JSONObject>() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.9
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            Gson gson = new Gson();
            FMCMainActivity.this.ah = (FMCMemebrsResponse) gson.a(jSONObject.toString(), (Class<Object>) FMCMemebrsResponse.class);
            if (!FMCMainActivity.this.ah.getHeader().getResponseCode().equals("0")) {
                if (!FMCMainActivity.this.ah.getHeader().getResponseCode().equals("1200")) {
                    return;
                }
                FMCMainActivity.this.b(1);
                return;
            }
            ArrayList<String> arrayList = new ArrayList<>();
            ArrayList<String> arrayList2 = new ArrayList<>();
            for (int i = 0; i < FMCMainActivity.this.ah.getBody().getGroupMembers().size(); i++) {
                if (FMCMainActivity.this.ah.getBody().getGroupMembers().get(i).getNetworkType().equalsIgnoreCase("MOBILE")) {
                    arrayList2.add(FMCMainActivity.this.ah.getBody().getGroupMembers().get(i).getServiceNumber());
                } else if (FMCMainActivity.this.ah.getBody().getGroupMembers().get(i).getNetworkType().equalsIgnoreCase("BROADBAND")) {
                    arrayList.add(FMCMainActivity.this.ah.getBody().getGroupMembers().get(i).getServiceNumber());
                }
            }
            FMCMainActivity.this.h.b(arrayList);
            FMCMainActivity.this.h.a(arrayList2);
            if (arrayList2.size() <= 0) {
                FMCMainActivity.this.J.setVisibility(8);
                FMCMainActivity.this.C.setVisibility(8);
                FMCMainActivity.this.K.setVisibility(8);
                FMCMainActivity.this.y.setVisibility(8);
            }
            if (arrayList.size() > 0) {
                return;
            }
            FMCMainActivity.this.D.setVisibility(8);
            FMCMainActivity.this.L.setVisibility(8);
        }
    };
    private au.a ax = new au.a() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.10
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

    public /* synthetic */ void c(View view) {
        startActivity(new Intent(this, OffersAndExtraActivity.class));
    }

    public /* synthetic */ void b(View view) {
        startActivity(new Intent(this, NotificationInboxActivity.class));
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.h.l("postpaid");
        a = this;
        setContentView(R.layout.activity_fmcmain);
        View findViewById = findViewById(R.id.content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.r = toolbar;
        setSupportActionBar(toolbar);
        this.x = (TextView) findViewById(R.id.tv_title);
        Button button = (Button) findViewById(R.id.btnSwitch);
        this.ae = button;
        button.setOnClickListener(this.aa);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        this.p = this;
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        this.s = drawerLayout;
        drawerLayout.setScrimColor(0);
        djy djyVar = new djy(this, findViewById, this.s);
        this.s.addDrawerListener(djyVar);
        djyVar.syncState();
        this.r.findViewById(R.id.hamburger).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.-$$Lambda$FMCMainActivity$ylSFH4CKJO9piV2Xug0ZQIdndSY
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FMCMainActivity.this.a(view);
            }
        });
        ((ImageView) findViewById(R.id.searchImageView)).setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.11
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                FMCMainActivity.this.startActivity(new Intent(FMCMainActivity.this, SearchActivity.class));
            }
        });
        this.h.w();
        this.o = (NavigationView) findViewById(R.id.nav_view);
        this.af = (ImageView) findViewById(R.id.imgIndigoIcon);
        this.o.setItemIconTintList(null);
        ImageView imageView = (ImageView) findViewById(R.id.iv_logo);
        this.m = imageView;
        imageView.setOnClickListener(this);
        this.at = new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: com.ucare.we.presentation.fmcuser.FMCMainActivity.13
            @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                switch (menuItem.getItemId()) {
                    case R.id.navigation_home /* 2131362641 */:
                        if (!FMCMainActivity.this.n.getMenu().getItem(0).isChecked()) {
                            FMCMainActivity.this.c(0);
                            FMCMainActivity.this.a(new dfs());
                            FMCMainActivity.this.x.setVisibility(8);
                            FMCMainActivity.this.ae.setVisibility(8);
                            if (FMCMainActivity.this.d.a()) {
                                FMCMainActivity.this.m.setVisibility(0);
                            } else {
                                FMCMainActivity.this.m.setVisibility(8);
                            }
                            FMCMainActivity.this.r.setVisibility(0);
                            FMCMainActivity.this.af.setVisibility(8);
                        }
                        return true;
                    case R.id.navigation_my_account /* 2131362642 */:
                        if (!FMCMainActivity.this.n.getMenu().getItem(3).isChecked() && FMCMainActivity.this.d.a()) {
                            FMCMainActivity.this.c(3);
                            FMCMainActivity.this.a(new dfy());
                            FMCMainActivity.this.x.setText(FMCMainActivity.this.getString(R.string.my_account));
                            FMCMainActivity.this.x.setVisibility(8);
                            FMCMainActivity.this.m.setVisibility(8);
                            FMCMainActivity.this.ae.setVisibility(8);
                            FMCMainActivity.this.af.setVisibility(8);
                            FMCMainActivity.this.r.setVisibility(8);
                        }
                        return true;
                    case R.id.navigation_promotions /* 2131362643 */:
                        if (!FMCMainActivity.this.n.getMenu().getItem(1).isChecked()) {
                            FMCMainActivity.this.c(1);
                            FMCMainActivity.this.a(new czf());
                            FMCMainActivity.this.x.setText(FMCMainActivity.this.getString(R.string.title_promotions));
                            FMCMainActivity.this.x.setVisibility(0);
                            FMCMainActivity.this.ae.setVisibility(8);
                            FMCMainActivity.this.af.setVisibility(8);
                            FMCMainActivity.this.m.setVisibility(8);
                            FMCMainActivity.this.r.setVisibility(8);
                        }
                        return true;
                    case R.id.navigation_store_locator /* 2131362644 */:
                        if (!FMCMainActivity.this.n.getMenu().getItem(2).isChecked()) {
                            FMCMainActivity.this.c(2);
                            FMCMainActivity.this.a(czh.a(false));
                            FMCMainActivity.this.x.setText(FMCMainActivity.this.getString(R.string.title_store_locator));
                            FMCMainActivity.this.x.setVisibility(0);
                            FMCMainActivity.this.m.setVisibility(8);
                            FMCMainActivity.this.ae.setVisibility(8);
                            FMCMainActivity.this.r.setVisibility(0);
                            FMCMainActivity.this.af.setVisibility(8);
                        }
                        return true;
                    default:
                        return true;
                }
            }
        };
        BottomNavigationView bottomNavigationView = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        this.n = bottomNavigationView;
        bottomNavigationView.setOnNavigationItemSelectedListener(this.at);
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
        bundle2.putString("params", this.N);
        dfs dfsVar = new dfs();
        dfsVar.setArguments(bundle2);
        a(dfsVar);
        View headerView = this.o.getHeaderView(0);
        this.aj = headerView;
        this.H = (LinearLayout) headerView.findViewById(R.id.llOutstandingContainer);
        this.t = (TextView) this.aj.findViewById(R.id.tvNewRequest);
        this.I = (LinearLayout) this.aj.findViewById(R.id.newRequestLinearLayout);
        this.J = (LinearLayout) this.aj.findViewById(R.id.llPreferedNumbers);
        this.M = (LinearLayout) this.aj.findViewById(R.id.icSuspendReactivateServiceLinearLayout);
        this.L = (LinearLayout) this.aj.findViewById(R.id.requestUserNameAndPasswordLinearLayout);
        this.D = (TextView) this.aj.findViewById(R.id.requestUserNameAndPassword);
        this.ak = (TextView) this.aj.findViewById(R.id.txtBalance);
        this.ar = (Button) this.aj.findViewById(R.id.btnBillServices);
        this.as = (Button) this.aj.findViewById(R.id.btnPayBill);
        this.al = (TextView) this.aj.findViewById(R.id.txtAppSettings);
        this.ao = (TextView) this.aj.findViewById(R.id.txtLogOut);
        this.am = (TextView) this.aj.findViewById(R.id.tvLiveChat);
        this.an = (TextView) this.aj.findViewById(R.id.txtWePay);
        this.ap = (TextView) this.aj.findViewById(R.id.txtContactUs);
        this.aq = (TextView) this.aj.findViewById(R.id.txtLiveChat);
        this.C = (TextView) this.aj.findViewById(R.id.txtPreferedNumbers);
        this.y = (TextView) this.aj.findViewById(R.id.txtBillLimit);
        this.K = (LinearLayout) this.aj.findViewById(R.id.llBillLimit);
        this.A = (TextView) this.aj.findViewById(R.id.txtFamilyNumbers);
        this.E = (TextView) this.aj.findViewById(R.id.txtFollowUs);
        this.u = (TextView) this.aj.findViewById(R.id.tvFAQ);
        this.B = (TextView) this.aj.findViewById(R.id.txtInbox);
        this.z = (TextView) this.aj.findViewById(R.id.tvNotificationCount);
        TextView textView = (TextView) this.aj.findViewById(R.id.offerAndExtras);
        this.F = textView;
        textView.setOnClickListener(this.R);
        this.u.setOnClickListener(this.U);
        this.B.setOnClickListener(this.ab);
        this.t.setOnClickListener(this.S);
        this.ar.setOnClickListener(this.O);
        this.as.setOnClickListener(this.P);
        this.al.setOnClickListener(this.Q);
        this.am.setOnClickListener(this.ac);
        this.an.setOnClickListener(this.ad);
        this.ao.setOnClickListener(this.V);
        this.C.setOnClickListener(this.W);
        this.y.setOnClickListener(this.X);
        this.A.setOnClickListener(this.Y);
        this.E.setOnClickListener(this.Z);
        this.D.setOnClickListener(this.T);
        b(!this.d.a());
        TextView textView2 = (TextView) this.aj.findViewById(R.id.tvUSSDCode);
        this.G = textView2;
        textView2.setOnClickListener(this);
        this.H.setVisibility(this.c.m().booleanValue() ? 0 : 8);
        this.as.setVisibility(this.c.l().booleanValue() ? 0 : 8);
        if (this.c.c().booleanValue()) {
            this.t.setVisibility(0);
            this.I.setVisibility(0);
        } else {
            this.t.setVisibility(8);
            this.I.setVisibility(8);
        }
        if (!this.h.g()) {
            this.D.setVisibility(8);
            this.L.setVisibility(8);
        }
    }

    public /* synthetic */ void a(View view) {
        if (this.s.isDrawerOpen(5)) {
            this.s.closeDrawer(5);
        } else {
            this.s.openDrawer(5);
        }
        this.l.a();
        djm.b(this);
    }

    public void c(int i) {
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
        if (this.d.a()) {
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
            if (this.q.getBackStackEntryCount() > 0) {
                this.q.popBackStack();
                return;
            }
            startActivity(new Intent(this, FMCMainActivity.class));
            finish();
        } else {
            startActivity(new Intent(this, FMCMainActivity.class));
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
        if (i == 90) {
            if (intent == null) {
                return;
            }
            this.s.closeDrawer(5);
            String stringExtra = intent.getStringExtra("FMC_SELECTED_MSISDN");
            Intent intent2 = new Intent(this, PreferedNumberActivity.class);
            intent2.putExtra("FMC_SELECTED_MSISDN", stringExtra);
            startActivity(intent2);
        } else if (i != 92 || intent == null) {
        } else {
            this.s.closeDrawer(5);
            String stringExtra2 = intent.getStringExtra("FMC_SELECTED_MSISDN");
            Intent intent3 = new Intent(this, RequestRouterUserNamePasswordActivity.class);
            intent3.putExtra("FMC_SELECTED_MSISDN", stringExtra2);
            startActivity(intent3);
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
        this.ai = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment);
        this.ai.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.ai.commit();
    }

    private void a(Fragment fragment, String str) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.ai = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment, str);
        if (this.q.findFragmentByTag(str) == null) {
            this.ai.addToBackStack(str);
        }
        this.ai.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.ai.commit();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.d.b(this);
        this.g.b(this);
        super.onDestroy();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onStart() {
        super.onStart();
        try {
            djl.a(this).y(this.aw, this.ax);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        this.d.a((dhk) this);
        this.g.a(this);
        this.l.a(this);
        this.l.a();
        try {
            djl.a(this).d(this.au, this.av);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        super.onResume();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.d.b(this);
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
        if (this.d.a()) {
            this.n.getMenu().getItem(2).setEnabled(true);
            this.n.getMenu().getItem(2).getIcon().mutate().setAlpha(255);
        } else {
            this.n.getMenu().getItem(2).getIcon().mutate().setAlpha(50);
            this.n.getMenu().getItem(2).setEnabled(false);
        }
        ImageView imageView = this.m;
        if (z) {
            i = 8;
        }
        imageView.setVisibility(i);
        this.o.getMenu().setGroupVisible(R.id.grp5, !z);
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
                this.n.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
                this.n.getMenu().getItem(3).setChecked(true);
                c(3);
                a(new dgm());
                this.x.setText(getString(R.string.my_account));
                this.x.setVisibility(0);
                this.m.setVisibility(8);
                this.ae.setVisibility(0);
                this.af.setVisibility(8);
                this.r.setVisibility(0);
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
            djl.a(this).d(this.au, this.av);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void c(ArrayList<StoreResponseBody> arrayList) {
        a(cze.a(arrayList), "Locator_Result");
        this.x.setVisibility(0);
        this.x.setText(getString(R.string.title_store_locator));
        this.m.setVisibility(8);
        this.ae.setVisibility(8);
        this.r.setVisibility(0);
        this.af.setVisibility(8);
    }

    public final void k() {
        a(cyy.a(false), "Select_Location");
        this.x.setVisibility(0);
        this.x.setText(getString(R.string.choose_location));
        this.m.setVisibility(8);
        this.ae.setVisibility(8);
        this.r.setVisibility(0);
        this.af.setVisibility(8);
    }

    public final void g(String str) {
        this.x.setText(str);
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
        new Gson().a(notificationCount);
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
