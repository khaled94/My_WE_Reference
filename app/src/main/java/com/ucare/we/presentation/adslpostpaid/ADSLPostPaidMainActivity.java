package com.ucare.we.presentation.adslpostpaid;

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
public class ADSLPostPaidMainActivity extends czy implements View.OnClickListener, cwj, czn, czs, dfx, dhk, dht, dju {
    public TextView R;
    public Button S;
    private Context U;
    private DrawerLayout V;
    private TextView W;
    private TextView X;
    private TextView Y;
    private TextView Z;
    public ADSLPostPaidMainActivity a;
    private TextView aa;
    private TextView ab;
    private TextView ac;
    private TextView ad;
    private TextView ae;
    private TextView af;
    private TextView ag;
    private TextView ah;
    private TextView ai;
    private LinearLayout aj;
    private LinearLayout ak;
    private LinearLayout al;
    private LinearLayout am;
    private LinearLayout an;
    private View ao;
    private TextView ap;
    private TextView aq;
    private TextView ar;
    private TextView as;
    private Button at;
    private Button au;
    private TextView av;
    private TextView aw;
    private BottomNavigationView.OnNavigationItemSelectedListener ax;
    private ImageView ay;
    private ImageView az;
    @Inject
    protected djb b;
    @Inject
    protected dhn c;
    @Inject
    protected dhp d;
    @Inject
    protected dio e;
    @Inject
    dhu f;
    @Inject
    djw g;
    @Inject
    djx h;
    @Inject
    dfw i;
    public ImageView j;
    BottomNavigationView k;
    daj l;
    City m;
    Area n;
    View p;
    View q;
    LinearLayout r;
    NavigationView s;
    public Toolbar z;
    private final int T = 1;
    String o = "1";
    FragmentManager t = getSupportFragmentManager();
    View.OnClickListener u = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.-$$Lambda$ADSLPostPaidMainActivity$NCBfdj14cKtoKWUY3XDOmXNQDBo
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ADSLPostPaidMainActivity.lambda$NCBfdj14cKtoKWUY3XDOmXNQDBo(ADSLPostPaidMainActivity.this, view);
        }
    };
    View.OnClickListener x = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.-$$Lambda$ADSLPostPaidMainActivity$OjQTJ8vlkeoNxEUWmDP_CldrT4Y
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ADSLPostPaidMainActivity.lambda$OjQTJ8vlkeoNxEUWmDP_CldrT4Y(ADSLPostPaidMainActivity.this, view);
        }
    };
    View.OnClickListener y = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.-$$Lambda$ADSLPostPaidMainActivity$bOsugTCky61Dn7KrzGy-dKFOU1U
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ADSLPostPaidMainActivity.m30lambda$bOsugTCky61Dn7KrzGydKFOU1U(ADSLPostPaidMainActivity.this, view);
        }
    };
    View.OnClickListener A = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.1
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, ADSLBalanceServicesActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener B = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.10
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, PayBillNumberTypeActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener C = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.11
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, SettingActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener D = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.12
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, NotificationInboxActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener E = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.13
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, SuspendAndResumeActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener F = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.14
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, RequestDeviceActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener G = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.-$$Lambda$ADSLPostPaidMainActivity$Kmo27md_cTht0m0Dx9Fd7yxd9yc
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ADSLPostPaidMainActivity.lambda$Kmo27md_cTht0m0Dx9Fd7yxd9yc(ADSLPostPaidMainActivity.this, view);
        }
    };
    View.OnClickListener H = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.15
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, RequestRouterUserNamePasswordActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener I = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.16
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, NewRequestActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener J = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.17
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, PreferedNumberActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener K = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.2
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, BillLimitActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener L = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.3
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, USSDDetails.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener M = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.4
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, ChatWithUsActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener N = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.5
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, WePayActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener O = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.6
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, HelpAndSupport_Activity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener P = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.7
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, FamilyNumberActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    View.OnClickListener Q = new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.8
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(ADSLPostPaidMainActivity.this, SocialMediaActivity.class);
            ADSLPostPaidMainActivity.this.V.closeDrawer(5);
            ADSLPostPaidMainActivity.this.startActivity(intent);
        }
    };
    private FragmentTransaction aA = getSupportFragmentManager().beginTransaction();
    private String aB = ADSLPostPaidMainActivity.class.getSimpleName();
    private au.b<JSONObject> aC = new au.b<JSONObject>() { // from class: com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity.9
        {
            ADSLPostPaidMainActivity.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            PostPaidBalanceResponse postPaidBalanceResponse = (PostPaidBalanceResponse) new Gson().a(jSONObject.toString(), (Class<Object>) PostPaidBalanceResponse.class);
            if (postPaidBalanceResponse == null || postPaidBalanceResponse.header == null) {
                return;
            }
            if (postPaidBalanceResponse.header.responseCode.equals("0")) {
                TextView textView = ADSLPostPaidMainActivity.this.ap;
                textView.setText(postPaidBalanceResponse.body.outstandingAmount + " " + ADSLPostPaidMainActivity.this.getString(R.string.egp));
            } else if (!postPaidBalanceResponse.header.responseCode.equals("1200")) {
            } else {
                ADSLPostPaidMainActivity.this.b(1);
            }
        }
    };
    private au.a aD = $$Lambda$ADSLPostPaidMainActivity$QmwyPEv5l2ogt9vvMurD8RwUzRw.INSTANCE;

    public static /* synthetic */ void a(VolleyError volleyError) {
    }

    public static /* synthetic */ void lambda$0K_erWFP31c1uFZJ2QqehpLmph8(ADSLPostPaidMainActivity aDSLPostPaidMainActivity, boolean z) {
        aDSLPostPaidMainActivity.b(z);
    }

    public static /* synthetic */ boolean lambda$7SUkcWWm5IHTbkgHHcAKBtwupws(ADSLPostPaidMainActivity aDSLPostPaidMainActivity, MenuItem menuItem) {
        return aDSLPostPaidMainActivity.a(menuItem);
    }

    public static /* synthetic */ void lambda$JQKjTIBUVNfBfBtia5LkNqdMC2Q(ADSLPostPaidMainActivity aDSLPostPaidMainActivity, View view) {
        aDSLPostPaidMainActivity.a(view);
    }

    public static /* synthetic */ void lambda$Kmo27md_cTht0m0Dx9Fd7yxd9yc(ADSLPostPaidMainActivity aDSLPostPaidMainActivity, View view) {
        aDSLPostPaidMainActivity.c(view);
    }

    public static /* synthetic */ void lambda$NCBfdj14cKtoKWUY3XDOmXNQDBo(ADSLPostPaidMainActivity aDSLPostPaidMainActivity, View view) {
        aDSLPostPaidMainActivity.f(view);
    }

    public static /* synthetic */ void lambda$OjQTJ8vlkeoNxEUWmDP_CldrT4Y(ADSLPostPaidMainActivity aDSLPostPaidMainActivity, View view) {
        aDSLPostPaidMainActivity.e(view);
    }

    public static /* synthetic */ void lambda$Zk72SMrdi5hxFDsOn53KvuW7sos(ADSLPostPaidMainActivity aDSLPostPaidMainActivity, View view) {
        aDSLPostPaidMainActivity.b(view);
    }

    /* renamed from: lambda$bOsugTCky61Dn7KrzGy-dKFOU1U */
    public static /* synthetic */ void m30lambda$bOsugTCky61Dn7KrzGydKFOU1U(ADSLPostPaidMainActivity aDSLPostPaidMainActivity, View view) {
        aDSLPostPaidMainActivity.d(view);
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
        startActivity(new Intent(this, OffersAndExtraActivity.class));
    }

    public /* synthetic */ void e(View view) {
        this.e.a((Context) this);
    }

    public /* synthetic */ void d(View view) {
        startActivity(new Intent(this, ChooseAccountActivity.class));
    }

    public /* synthetic */ void c(View view) {
        this.V.closeDrawer(5);
        DeactivationConfirmationActivity.a(this.U);
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.g.l("postpaid");
        this.a = this;
        this.U = this;
        this.l = new daj(this, new dak() { // from class: com.ucare.we.presentation.adslpostpaid.-$$Lambda$ADSLPostPaidMainActivity$0K_erWFP31c1uFZJ2QqehpLmph8
            @Override // defpackage.dak
            public final void showProgress(boolean z) {
                ADSLPostPaidMainActivity.lambda$0K_erWFP31c1uFZJ2QqehpLmph8(ADSLPostPaidMainActivity.this, z);
            }
        }, this);
        setContentView(R.layout.activity_adslpost_paid_main);
        this.R = (TextView) findViewById(R.id.tv_title);
        this.S = (Button) findViewById(R.id.btnSwitch);
        this.s = (NavigationView) findViewById(R.id.nav_view);
        this.V = (DrawerLayout) findViewById(R.id.drawer_layout);
        View headerView = this.s.getHeaderView(0);
        this.ao = headerView;
        this.an = (LinearLayout) headerView.findViewById(R.id.requestDeviceLinearLayout);
        this.r = (LinearLayout) this.ao.findViewById(R.id.llOutstandingContainer);
        this.am = (LinearLayout) this.ao.findViewById(R.id.icSuspendReactivateServiceLinearLayout);
        this.aj = (LinearLayout) this.ao.findViewById(R.id.newRequestLinearLayout);
        this.al = (LinearLayout) this.ao.findViewById(R.id.requestUserNameAndPasswordLinearLayout);
        this.an = (LinearLayout) this.ao.findViewById(R.id.requestDeviceLinearLayout);
        this.ap = (TextView) this.ao.findViewById(R.id.txtBalance);
        this.at = (Button) this.ao.findViewById(R.id.btnBillServices);
        this.au = (Button) this.ao.findViewById(R.id.btnPayBill);
        this.aq = (TextView) this.ao.findViewById(R.id.txtAppSettings);
        this.ar = (TextView) this.ao.findViewById(R.id.txtLogOut);
        this.as = (TextView) this.ao.findViewById(R.id.txtDeactivateFBB);
        this.af = (TextView) this.ao.findViewById(R.id.tvNewRequest);
        this.ac = (TextView) this.ao.findViewById(R.id.txtPreferedNumbers);
        this.W = (TextView) this.ao.findViewById(R.id.txtBillLimit);
        this.ak = (LinearLayout) this.ao.findViewById(R.id.llBillLimit);
        this.X = (TextView) this.ao.findViewById(R.id.tvUSSDCode);
        this.aw = (TextView) this.ao.findViewById(R.id.tvNotificationCount);
        this.av = (TextView) this.ao.findViewById(R.id.txtInbox);
        this.Y = (TextView) this.ao.findViewById(R.id.tvFAQ);
        this.Z = (TextView) this.ao.findViewById(R.id.tvLiveChat);
        this.aa = (TextView) this.ao.findViewById(R.id.txtWePay);
        this.ae = (TextView) this.ao.findViewById(R.id.requestUserNameAndPassword);
        this.ab = (TextView) this.ao.findViewById(R.id.txtFamilyNumbers);
        this.ag = (TextView) this.ao.findViewById(R.id.icSuspendReactivateService);
        this.ad = (TextView) this.ao.findViewById(R.id.txtFollowUs);
        this.ah = (TextView) this.ao.findViewById(R.id.offerAndExtras);
        this.ai = (TextView) this.ao.findViewById(R.id.requestDevice);
        this.az = (ImageView) findViewById(R.id.searchImageView);
        this.p = findViewById(R.id.content);
        Toolbar toolbar = (Toolbar) findViewById(R.id.toolbar);
        this.z = toolbar;
        this.q = toolbar.findViewById(R.id.hamburger);
        this.k = (BottomNavigationView) findViewById(R.id.bottom_navigation);
        ImageView imageView = (ImageView) findViewById(R.id.imgIndigoIcon);
        this.ay = imageView;
        imageView.setVisibility(8);
        this.s.setItemIconTintList(null);
        this.j = (ImageView) findViewById(R.id.iv_logo);
        setSupportActionBar(this.z);
        getSupportActionBar().setDisplayShowTitleEnabled(false);
        getSupportActionBar().setDisplayHomeAsUpEnabled(false);
        this.ai.setOnClickListener(this.F);
        this.ah.setOnClickListener(this.u);
        this.at.setOnClickListener(this.A);
        this.au.setOnClickListener(this.B);
        this.aq.setOnClickListener(this.C);
        this.av.setOnClickListener(this.D);
        this.ar.setOnClickListener(this.x);
        this.as.setOnClickListener(this.G);
        this.ae.setOnClickListener(this.H);
        this.ac.setOnClickListener(this.J);
        this.W.setOnClickListener(this.K);
        this.X.setOnClickListener(this.L);
        this.Y.setOnClickListener(this.O);
        this.Z.setOnClickListener(this.M);
        this.aa.setOnClickListener(this.N);
        this.ab.setOnClickListener(this.P);
        this.ag.setOnClickListener(this.E);
        this.af.setOnClickListener(this.I);
        this.ad.setOnClickListener(this.Q);
        this.S.setOnClickListener(this.y);
        this.j.setOnClickListener(this);
        BottomNavigationView.OnNavigationItemSelectedListener onNavigationItemSelectedListener = new BottomNavigationView.OnNavigationItemSelectedListener() { // from class: com.ucare.we.presentation.adslpostpaid.-$$Lambda$ADSLPostPaidMainActivity$7SUkcWWm5IHTbkgHHcAKBtwupws
            @Override // com.google.android.material.bottomnavigation.BottomNavigationView.OnNavigationItemSelectedListener
            public final boolean onNavigationItemSelected(MenuItem menuItem) {
                return ADSLPostPaidMainActivity.lambda$7SUkcWWm5IHTbkgHHcAKBtwupws(ADSLPostPaidMainActivity.this, menuItem);
            }
        };
        this.ax = onNavigationItemSelectedListener;
        this.k.setOnNavigationItemSelectedListener(onNavigationItemSelectedListener);
        this.k.getMenu().getItem(0).setIcon(R.drawable.home_selected);
        BottomNavigationMenuView bottomNavigationMenuView = (BottomNavigationMenuView) this.k.getChildAt(0);
        for (int i = 0; i < bottomNavigationMenuView.getChildCount(); i++) {
            View findViewById = bottomNavigationMenuView.getChildAt(i).findViewById(R.id.icon);
            ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
            getResources().getDisplayMetrics();
            BottomNavigationItemView bottomNavigationItemView = (BottomNavigationItemView) bottomNavigationMenuView.getChildAt(i);
            bottomNavigationItemView.setLabelVisibilityMode(1);
            bottomNavigationItemView.setChecked(false);
            layoutParams.height = (int) getResources().getDimension(R.dimen.bottom_navigation_icon_size);
            layoutParams.width = (int) getResources().getDimension(R.dimen.bottom_navigation_icon_size);
            findViewById.setLayoutParams(layoutParams);
        }
        this.k.setItemIconTintList(null);
        this.V.setScrimColor(0);
        djy djyVar = new djy(this, this.p, this.V);
        this.V.addDrawerListener(djyVar);
        djyVar.syncState();
        this.q.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.-$$Lambda$ADSLPostPaidMainActivity$Zk72SMrdi5hxFDsOn53KvuW7sos
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ADSLPostPaidMainActivity.lambda$Zk72SMrdi5hxFDsOn53KvuW7sos(ADSLPostPaidMainActivity.this, view);
            }
        });
        this.az.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.presentation.adslpostpaid.-$$Lambda$ADSLPostPaidMainActivity$JQKjTIBUVNfBfBtia5LkNqdMC2Q
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                ADSLPostPaidMainActivity.lambda$JQKjTIBUVNfBfBtia5LkNqdMC2Q(ADSLPostPaidMainActivity.this, view);
            }
        });
        Bundle bundle2 = new Bundle();
        bundle2.putString("params", this.o);
        dde ddeVar = new dde();
        ddeVar.setArguments(bundle2);
        a(ddeVar);
        b(!this.e.a());
        this.r.setVisibility(this.d.m().booleanValue() ? 0 : 8);
        this.au.setVisibility(this.d.l().booleanValue() ? 0 : 8);
        if (this.d.c().booleanValue()) {
            this.af.setVisibility(0);
            this.aj.setVisibility(0);
        } else {
            this.af.setVisibility(8);
            this.aj.setVisibility(8);
        }
        if (this.d.d().booleanValue()) {
            this.ai.setVisibility(0);
            this.an.setVisibility(0);
        } else {
            this.ai.setVisibility(8);
            this.an.setVisibility(8);
        }
        try {
            if (!this.g.f() || this.g.Q() || !this.c.f.isFeature_suspendandresume_ADSL() || !this.c.f.isFeatureSuspendandResume()) {
                this.ag.setVisibility(8);
                this.am.setVisibility(8);
            }
        } catch (Exception unused) {
            this.ag.setVisibility(8);
            this.am.setVisibility(8);
        }
        if (!this.g.g()) {
            this.ae.setVisibility(8);
            this.al.setVisibility(8);
        }
        try {
            if (this.c.f.isFeature_bill_limit_ADSL()) {
                return;
            }
            this.ak.setVisibility(8);
            this.W.setVisibility(8);
        } catch (Exception unused2) {
            this.ak.setVisibility(8);
            this.W.setVisibility(8);
        }
    }

    public /* synthetic */ void b(View view) {
        if (this.V.isDrawerOpen(5)) {
            this.V.closeDrawer(5);
        } else {
            this.V.openDrawer(5);
        }
        djm.b(this);
        this.i.a();
    }

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(this, SearchActivity.class));
    }

    public /* synthetic */ boolean a(MenuItem menuItem) {
        switch (menuItem.getItemId()) {
            case R.id.navigation_home /* 2131362641 */:
                if (!this.k.getMenu().getItem(0).isChecked()) {
                    c(0);
                    a(new dde());
                    this.R.setVisibility(8);
                    this.S.setVisibility(8);
                    if (this.e.a()) {
                        this.j.setVisibility(0);
                    } else {
                        this.j.setVisibility(8);
                    }
                    this.z.setVisibility(0);
                }
                return true;
            case R.id.navigation_my_account /* 2131362642 */:
                if (!this.k.getMenu().getItem(3).isChecked() && this.e.a()) {
                    c(3);
                    a(new dfy());
                    this.R.setText(getString(R.string.my_account));
                    this.R.setVisibility(8);
                    this.j.setVisibility(8);
                    this.S.setVisibility(8);
                    this.z.setVisibility(8);
                }
                return true;
            case R.id.navigation_promotions /* 2131362643 */:
                if (!this.k.getMenu().getItem(1).isChecked()) {
                    c(1);
                    a(new czf());
                    this.R.setText(getString(R.string.title_promotions));
                    this.R.setVisibility(0);
                    this.S.setVisibility(8);
                    this.j.setVisibility(8);
                    this.z.setVisibility(8);
                }
                return true;
            case R.id.navigation_store_locator /* 2131362644 */:
                if (!this.k.getMenu().getItem(2).isChecked()) {
                    c(2);
                    a(czh.a(false));
                    this.R.setText(getString(R.string.title_store_locator));
                    this.R.setVisibility(0);
                    this.j.setVisibility(8);
                    this.S.setVisibility(8);
                    this.z.setVisibility(0);
                }
                return true;
            default:
                return true;
        }
    }

    private void c(int i) {
        if (i == 0) {
            this.k.getMenu().getItem(0).setIcon(R.drawable.home_selected);
        } else {
            this.k.getMenu().getItem(0).setIcon(R.drawable.home);
        }
        if (i == 1) {
            this.k.getMenu().getItem(1).setIcon(R.drawable.promotions_selected);
        } else {
            this.k.getMenu().getItem(1).setIcon(R.drawable.promotions);
        }
        if (i == 2) {
            this.k.getMenu().getItem(2).setIcon(R.drawable.storelocator_selected);
        } else {
            this.k.getMenu().getItem(2).setIcon(R.drawable.storelocator);
        }
        if (i == 3) {
            this.k.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
            return;
        }
        this.k.getMenu().getItem(3).setIcon(R.drawable.my_account);
        if (this.e.a()) {
            return;
        }
        this.k.getMenu().getItem(3).getIcon().mutate().setAlpha(50);
    }

    @Override // defpackage.czy, androidx.activity.ComponentActivity, android.app.Activity
    public void onBackPressed() {
        DrawerLayout drawerLayout = (DrawerLayout) findViewById(R.id.drawer_layout);
        if (drawerLayout.isDrawerOpen(5)) {
            drawerLayout.closeDrawer(5);
        } else if (this.k.getMenu().getItem(0).isChecked()) {
            super.onBackPressed();
            finishAffinity();
        } else if (this.k.getMenu().getItem(2).isChecked()) {
            if (this.t.getBackStackEntryCount() > 0) {
                this.t.popBackStack();
                return;
            }
            startActivity(new Intent(this, ADSLPostPaidMainActivity.class));
            finish();
        } else {
            startActivity(new Intent(this, ADSLPostPaidMainActivity.class));
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
        this.aA = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment);
        this.aA.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.aA.commit();
    }

    private void a(Fragment fragment, String str) {
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        this.aA = beginTransaction;
        beginTransaction.replace(R.id.content_main, fragment, str);
        if (this.t.findFragmentByTag(str) == null) {
            this.aA.addToBackStack(str);
        }
        this.aA.setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE);
        this.aA.commit();
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.e.b(this);
        this.f.b(this);
        super.onDestroy();
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        this.e.a((dhk) this);
        this.f.a(this);
        this.i.a(this);
        this.i.a();
        try {
            djl.a(this).d(this.aC, this.aD);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        super.onResume();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onPause() {
        this.e.b(this);
        this.f.b(this);
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

    public void b(boolean z) {
        int i = 0;
        if (this.e.a()) {
            this.k.getMenu().getItem(2).setEnabled(true);
            this.k.getMenu().getItem(2).getIcon().mutate().setAlpha(255);
        } else {
            this.k.getMenu().getItem(2).getIcon().mutate().setAlpha(50);
            this.k.getMenu().getItem(2).setEnabled(false);
        }
        ImageView imageView = this.j;
        if (z) {
            i = 8;
        }
        imageView.setVisibility(i);
        this.s.getMenu().setGroupVisible(R.id.grp5, !z);
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
                this.h.b(this, BalanceRechargeActivity.class);
                break;
            case R.id.btn_sign_in /* 2131362047 */:
                this.h.b(this, SignInActivity.class);
                this.h.b(this, RequestDeviceActivity.class);
                break;
            case R.id.icSuspendReactivateService /* 2131362321 */:
                this.h.b(this, SuspendAndResumeActivity.class);
                break;
            case R.id.iv_logo /* 2131362408 */:
                this.k.getMenu().getItem(3).setIcon(R.drawable.my_account_selected);
                this.k.getMenu().getItem(3).setChecked(true);
                c(3);
                a(new dgm());
                this.R.setText(getString(R.string.my_account));
                this.R.setVisibility(0);
                this.j.setVisibility(8);
                this.S.setVisibility(0);
                this.z.setVisibility(0);
                break;
            case R.id.tvNewRequest /* 2131363053 */:
                this.h.b(this, RequestDeviceActivity.class);
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
            djl.a(this).d(this.aC, this.aD);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void c(ArrayList<StoreResponseBody> arrayList) {
        a(cze.a(arrayList), "Locator_Result");
        this.R.setVisibility(0);
        this.R.setText(getString(R.string.title_store_locator));
        this.j.setVisibility(8);
        this.S.setVisibility(8);
        this.z.setVisibility(0);
    }

    public final void k() {
        a(cyy.a(false), "Select_Location");
        this.R.setVisibility(0);
        this.R.setText(getString(R.string.choose_location));
        this.j.setVisibility(8);
        this.S.setVisibility(8);
        this.z.setVisibility(0);
    }

    public final void g(String str) {
        this.R.setText(str);
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
            this.aw.setVisibility(8);
            return;
        }
        this.aw.setVisibility(0);
        this.aw.setText(String.valueOf(notificationCount.getCount()));
    }

    @Override // defpackage.dfx
    public final void m() {
        this.aw.setVisibility(8);
    }
}
