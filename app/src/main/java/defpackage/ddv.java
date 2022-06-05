package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.volley.VolleyError;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.gson.Gson;
import com.ucare.we.BalanceActivity;
import com.ucare.we.BalanceRechargeActivity;
import com.ucare.we.ErrorHandlerActivity;
import com.ucare.we.R;
import com.ucare.we.SuccessHandlerActivity;
import com.ucare.we.adapters.CustomLinearLayoutManager;
import com.ucare.we.manageplanspostpaid.ManagePostPaidPlanActivity;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.MoreBundleModel.ResponseViewMoreBundle;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import com.ucare.we.model.ProfileInfoResponseBody;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.morebundle.MoreBundleActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.presentation.auth.signin.SignInActivity;
import com.ucare.we.presentation.auth.signup.SignUpActivity;
import com.ucare.we.presentation.switchaccount.SwitchAccountPostPaidActivity;
import defpackage.au;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ddv */
/* loaded from: classes2.dex */
public class ddv extends dab implements View.OnClickListener, dcv, dhk, dht, dic, die, dju {
    View C;
    int E;
    int F;
    Activity K;
    cyq L;
    TextView M;
    SwipeRefreshLayout N;
    cyx O;
    LinearLayout P;
    LinearLayout Q;
    private Button W;
    private Button X;
    private View Y;
    private View Z;
    @Inject
    protected dhp a;
    private View aa;
    private View ab;
    private Context ac;
    private View ad;
    private View ae;
    private float af;
    private cxf ag;
    private RecyclerView ah;
    @Inject
    djx b;
    @Inject
    dhu c;
    @Inject
    djb d;
    @Inject
    djw f;
    Button h;
    Button i;
    @Inject
    did j;
    @Inject
    dio k;
    @Inject
    djg l;
    @Inject
    djx m;
    @Inject
    dhn n;
    TextView o;
    TextView p;
    TextView q;
    cwj r;
    Button s;
    Button t;
    CustomLinearLayoutManager u;
    ProgressBar y;
    TabLayout z;
    private final int V = 2;
    MainPlanResponseBody e = null;
    boolean g = false;
    int v = 1;
    int w = 1;
    int x = 1;
    int A = 0;
    String B = "";
    int D = 0;
    boolean G = true;
    boolean H = false;
    int I = 0;
    int J = 1;
    boolean R = true;
    List<SummarizedLineUsageItem> S = new ArrayList();
    au.b<JSONObject> T = new au.b<JSONObject>() { // from class: ddv.1
        {
            ddv.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            ddv.this.l.a();
            if (ddv.this.getActivity() != null) {
                ddv.this.f.q(false);
                Gson gson = new Gson();
                ResponseViewMoreBundle responseViewMoreBundle = (ResponseViewMoreBundle) gson.a(jSONObject2.toString(), (Class<Object>) ResponseViewMoreBundle.class);
                if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("0")) {
                    if (responseViewMoreBundle.getBody().size() != 0) {
                        int i = 0;
                        while (true) {
                            if (i >= responseViewMoreBundle.getBody().size()) {
                                break;
                            } else if (responseViewMoreBundle.getBody().get(i).getMain()) {
                                ddv.this.g = true;
                                ddv.this.f.q(true);
                                ddv.this.f.B(gson.a(responseViewMoreBundle.getBody().get(i)));
                                if (!ddv.this.d.f()) {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        ddv.this.p.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (ddv.f(responseViewMoreBundle.getBody().get(i).getRenewalDate())) {
                                        ddv.this.p.setText(djm.a(responseViewMoreBundle.getBody().get(i).getRenewalDate()));
                                    } else {
                                        ddv.this.p.setText("");
                                    }
                                    ddv.this.o.setText(responseViewMoreBundle.getBody().get(i).getOfferEnName());
                                } else {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        ddv.this.p.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (ddv.f(responseViewMoreBundle.getBody().get(i).getRenewalDate())) {
                                        ddv.this.p.setText(responseViewMoreBundle.getBody().get(i).getRenewalDate());
                                    } else {
                                        ddv.this.p.setText("");
                                    }
                                    ddv.this.o.setText(responseViewMoreBundle.getBody().get(i).getOfferArName());
                                }
                            } else {
                                i++;
                            }
                        }
                        if (ddv.this.g) {
                            return;
                        }
                    } else {
                        ddv.this.R = false;
                        ddv.this.k();
                        return;
                    }
                } else if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("1200")) {
                    ddv.this.b(2);
                    return;
                }
                ddv.this.R = false;
                ddv.this.k();
            }
        }
    };
    au.a U = new au.a() { // from class: ddv.2
        {
            ddv.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ddv.this.l.a();
        }
    };

    public static /* synthetic */ void lambda$2T8mr1yd5O6pX_B4QkSdA57WadM(ddv ddvVar) {
        ddvVar.m();
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
    public final void a_(String str) {
    }

    @Override // defpackage.dht
    public final void b(ArrayList<SpecialList> arrayList) {
    }

    @Override // defpackage.dht
    public final void b(List<MainPlanResponseBody> list) {
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

    public ddv() {
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.C = layoutInflater.inflate(R.layout.fragment_corporate_pre_paid_home, viewGroup, false);
        this.K = getActivity();
        Button button = (Button) this.C.findViewById(R.id.btn_balance_recharge_main);
        this.i = button;
        if (button != null) {
            button.setOnClickListener(this);
        }
        if (this.a.k().booleanValue()) {
            this.i.setAlpha(1.0f);
            this.i.setClickable(true);
        } else {
            this.i.setAlpha(0.5f);
            this.i.setClickable(false);
        }
        Button button2 = (Button) this.C.findViewById(R.id.btn_balance_services_main);
        this.s = button2;
        if (button2 != null) {
            button2.setOnClickListener(this);
        }
        this.q = (TextView) this.C.findViewById(R.id.welcome);
        this.h = (Button) this.C.findViewById(R.id.btn_current_number);
        this.Y = this.C.findViewById(R.id.plan_labels);
        this.o = (TextView) this.C.findViewById(R.id.tv_main_plan_home);
        this.p = (TextView) this.C.findViewById(R.id.tv_main_plan_renewal_date_home);
        this.ad = this.C.findViewById(R.id.user_view);
        this.ae = this.C.findViewById(R.id.user_bottom_view);
        this.Z = this.C.findViewById(R.id.guest_view);
        this.aa = this.C.findViewById(R.id.guest_bottom_view);
        this.t = (Button) this.C.findViewById(R.id.btn_change_plan);
        this.X = (Button) this.C.findViewById(R.id.btn_subscribe);
        this.W = (Button) this.C.findViewById(R.id.btn_extra_bundles);
        this.y = (ProgressBar) this.C.findViewById(R.id.progressBar);
        TabLayout tabLayout = (TabLayout) this.C.findViewById(R.id.tab_layout);
        this.z = tabLayout;
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_selector), true);
        this.M = (TextView) this.C.findViewById(R.id.lastModificationDate);
        this.P = (LinearLayout) this.C.findViewById(R.id.top_buttons_layout);
        this.Q = (LinearLayout) this.C.findViewById(R.id.lower_buttons_layout);
        this.ab = this.C.findViewById(R.id.subscribe_to_plan);
        this.X.setOnClickListener(this);
        this.W.setOnClickListener(this);
        this.h.setOnClickListener(this);
        this.t.setOnClickListener(this);
        this.C.findViewById(R.id.btn_sign_in).setOnClickListener(this);
        this.C.findViewById(R.id.btn_signup).setOnClickListener(this);
        this.C.findViewById(R.id.btn_live_chat).setOnClickListener(this);
        this.ah = (RecyclerView) this.C.findViewById(R.id.rv_slider);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(getActivity());
        this.u = customLinearLayoutManager;
        customLinearLayoutManager.setOrientation(0);
        this.ah.setLayoutManager(this.u);
        cxf cxfVar = new cxf(this);
        this.ag = cxfVar;
        this.ah.setAdapter(cxfVar);
        this.ah.setHasFixedSize(true);
        if (getArguments() != null) {
            this.A = Integer.parseInt(getArguments().getString("params"));
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.C.findViewById(R.id.swipeRefreshLayout);
        this.N = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary);
        this.N.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: -$$Lambda$ddv$2T8mr1yd5O6pX_B4QkSdA57WadM
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                ddv.lambda$2T8mr1yd5O6pX_B4QkSdA57WadM(ddv.this);
            }
        });
        TextView textView = this.M;
        this.K.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        this.ah.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: ddv.3
            {
                ddv.this = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (ddv.this.w >= 0 && i != 0) {
                    ddv.this.ag.c(ddv.this.w).a = false;
                    ddv.this.ag.notifyDataSetChanged();
                }
                if (i == 0) {
                    ddv.this.x = 1;
                }
                ddv ddvVar = ddv.this;
                ddvVar.v = ddvVar.u.findFirstCompletelyVisibleItemPosition() + 1;
                ddv ddvVar2 = ddv.this;
                ddvVar2.w = ddvVar2.u.findLastCompletelyVisibleItemPosition() - 1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    return;
                }
                if (ddv.this.v == ddv.this.w && ddv.this.w == 1 && ddv.this.x >= ddv.this.w && ddv.this.ag.getItemCount() != 3) {
                    ddv.this.ah.scrollToPosition(ddv.this.ag.getItemCount() - 2);
                    ddv ddvVar = ddv.this;
                    ddvVar.v = ddvVar.ag.getItemCount() - 3;
                    ddv ddvVar2 = ddv.this;
                    ddvVar2.w = ddvVar2.v;
                }
                if (ddv.this.v == ddv.this.w && ddv.this.w == ddv.this.ag.getItemCount() - 2 && ddv.this.x <= ddv.this.w && ddv.this.ag.getItemCount() != 3) {
                    ddv.this.ah.scrollToPosition(1);
                    ddv.this.v = 2;
                    ddv ddvVar3 = ddv.this;
                    ddvVar3.w = ddvVar3.v;
                }
                if (ddv.this.v != ddv.this.w) {
                    return;
                }
                ddv.this.ag.a(ddv.this.v);
                TabLayout.Tab tabAt = ddv.this.z.getTabAt(ddv.this.v - 2);
                if (tabAt != null && !tabAt.isSelected()) {
                    ddv.this.G = false;
                    tabAt.select();
                    ddv ddvVar4 = ddv.this;
                    ddvVar4.D = ddvVar4.v - 2;
                }
                if (ddv.this.x == ddv.this.v) {
                    return;
                }
                ddv ddvVar5 = ddv.this;
                ddvVar5.x = ddvVar5.v;
                ddv ddvVar6 = ddv.this;
                ddvVar6.a(ddvVar6.v, ddv.this.C);
            }
        });
        new LinearSnapHelper() { // from class: ddv.4
            {
                ddv.this = this;
            }

            /* JADX WARN: Code restructure failed: missing block: B:12:0x0029, code lost:
                r1 = r0 - 1;
             */
            @Override // androidx.recyclerview.widget.LinearSnapHelper, androidx.recyclerview.widget.SnapHelper
            /*
                Code decompiled incorrectly, please refer to instructions dump.
                To view partially-correct code enable 'Show inconsistent code' option in preferences
            */
            public final int findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView.LayoutManager r4, int r5, int r6) {
                /*
                    r3 = this;
                    android.view.View r0 = r3.findSnapView(r4)
                    r1 = -1
                    if (r0 != 0) goto L8
                    return r1
                L8:
                    int r0 = r4.getPosition(r0)
                    boolean r2 = r4.canScrollHorizontally()
                    if (r2 == 0) goto L2e
                    if (r5 >= 0) goto L1f
                    ddv r5 = defpackage.ddv.this
                    djb r5 = r5.d
                    boolean r5 = r5.f()
                    if (r5 != 0) goto L2c
                    goto L29
                L1f:
                    ddv r5 = defpackage.ddv.this
                    djb r5 = r5.d
                    boolean r5 = r5.f()
                    if (r5 == 0) goto L2c
                L29:
                    int r1 = r0 + (-1)
                    goto L2e
                L2c:
                    int r1 = r0 + 1
                L2e:
                    boolean r5 = r4.canScrollVertically()
                    if (r5 == 0) goto L3b
                    if (r6 >= 0) goto L39
                    int r1 = r0 + (-1)
                    goto L3b
                L39:
                    int r1 = r0 + 1
                L3b:
                    int r4 = r4.getItemCount()
                    int r4 = r4 + (-1)
                    r5 = 0
                    int r5 = java.lang.Math.max(r1, r5)
                    int r4 = java.lang.Math.min(r4, r5)
                    return r4
                */
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ddv.AnonymousClass4.findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
            }
        }.attachToRecyclerView(this.ah);
        this.u.setSmoothScrollbarEnabled(true);
        this.z.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: ddv.5
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabUnselected(TabLayout.Tab tab) {
            }

            {
                ddv.this = this;
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabSelected(TabLayout.Tab tab) {
                if (!ddv.this.G) {
                    ddv.this.G = true;
                    return;
                }
                int i = 0;
                ddv ddvVar = ddv.this;
                ddvVar.E = ddvVar.u.findFirstCompletelyVisibleItemPosition();
                ddv ddvVar2 = ddv.this;
                ddvVar2.F = ddvVar2.u.findLastCompletelyVisibleItemPosition();
                if (ddv.this.D < tab.getPosition()) {
                    i = (tab.getPosition() - ddv.this.D) + ddv.this.F;
                } else if (ddv.this.D > tab.getPosition()) {
                    i = ddv.this.E - (ddv.this.D - tab.getPosition());
                }
                ddv.this.D = tab.getPosition();
                ddv.this.ah.smoothScrollToPosition(i);
                if (i != 0) {
                    return;
                }
                ddv ddvVar3 = ddv.this;
                ddvVar3.a(2, ddvVar3.C);
            }
        });
        this.ag.b();
        return this.C;
    }

    public void a(int i, View view) {
        boolean z;
        if (view == null) {
            return;
        }
        int b = this.ag.b(i);
        int i2 = 100;
        if (i == this.I) {
            b = 100;
        }
        if (b == -1) {
            z = true;
        } else {
            i2 = b;
            z = false;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.y, "progress", 0, i2);
        ofInt.setDuration(2000L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
        if (this.ag.getItemCount() > 3) {
            this.J = 2;
        } else {
            this.J = 1;
        }
        if (this.J != i && this.I != i) {
            ((TextView) view.findViewById(R.id.percentage)).setVisibility(0);
            ((TextView) view.findViewById(R.id.percentage)).setText(i2 + "%");
        } else {
            ((TextView) view.findViewById(R.id.percentage)).setVisibility(4);
        }
        if (z) {
            ((TextView) view.findViewById(R.id.percentage)).setVisibility(4);
        } else {
            ((TextView) view.findViewById(R.id.percentage)).setVisibility(0);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onAttach(Context context) {
        super.onAttach(context);
        if (context instanceof cwj) {
            this.r = (cwj) context;
            return;
        }
        throw new RuntimeException(context.toString());
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* renamed from: l */
    public void m() {
        if (!isAdded()) {
            return;
        }
        b(false);
        this.q.setText(djm.c(this.K) + " " + this.k.s);
        this.h.setText(this.k.t);
        this.c.d();
        this.c.a();
        try {
            this.l.a(this.ac, getString(R.string.loading));
            djl.a(getActivity()).a(this.f.O(), this.T, this.U);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void b(boolean z) {
        int i = 4;
        int i2 = 0;
        this.q.setVisibility(z ? 4 : 0);
        Button button = this.h;
        if (!z) {
            i = 0;
        }
        button.setVisibility(i);
        this.ab.setVisibility(8);
        this.ad.setVisibility(z ? 8 : 0);
        this.ae.setVisibility(z ? 8 : 0);
        this.Z.setVisibility(z ? 0 : 8);
        View view = this.aa;
        if (!z) {
            i2 = 8;
        }
        view.setVisibility(i2);
        this.u.a = !z;
        this.ah.setEnabled(!z);
        this.ah.setAlpha(z ? 0.15f : 1.0f);
        if (z) {
            this.ag.b();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_balance_recharge_main /* 2131362011 */:
                this.m.b(getActivity(), BalanceRechargeActivity.class);
                return;
            case R.id.btn_balance_services_main /* 2131362013 */:
                djx.a(getActivity(), BalanceActivity.class, String.valueOf(this.af));
                return;
            case R.id.btn_change_plan /* 2131362018 */:
                if (this.R) {
                    this.b.a(this.e, getActivity(), ManagePostPaidPlanActivity.class);
                    return;
                } else if (this.f.b("en").equalsIgnoreCase("en")) {
                    UnNavigateResponseActivity.a(getContext(), this.n.f.getMobile_app_main_invalid_en(), this.n.f.getMobile_app_main_invalid_desc_en(), true);
                    return;
                } else {
                    UnNavigateResponseActivity.a(getContext(), this.n.f.getMobile_app_main_invalid_ar(), this.n.f.getMobile_app_main_invalid_desc_ar(), true);
                    return;
                }
            case R.id.btn_current_number /* 2131362023 */:
                this.b.b(getActivity(), SwitchAccountPostPaidActivity.class);
                return;
            case R.id.btn_extra_bundles /* 2131362027 */:
                this.b.b(getActivity(), MoreBundleActivity.class);
                return;
            case R.id.btn_live_chat /* 2131362030 */:
                Intent intent = new Intent("android.intent.action.VIEW");
                intent.setData(Uri.parse("https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3="));
                startActivity(intent);
                return;
            case R.id.btn_sign_in /* 2131362047 */:
                this.b.b(getActivity(), SignInActivity.class);
                return;
            case R.id.btn_signup /* 2131362048 */:
                this.b.b(getActivity(), SignUpActivity.class);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.dht
    public final void a(float f) {
        this.N.setRefreshing(false);
        this.af = f;
        this.ag.a(f);
        this.f.a(f);
    }

    @Override // defpackage.dht
    public final void r_() {
        this.N.setRefreshing(false);
        this.af = -1.0f;
        this.ag.a(-1.0f);
    }

    @Override // defpackage.dht
    public final void b(String str) {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void s_() {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void b(int i, String str) {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void a(List<SummarizedLineUsageItem> list) {
        this.N.setRefreshing(false);
        this.S = list;
        djm.a(this.K.getBaseContext());
        TextView textView = this.M;
        this.K.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        this.ag.d(0);
        if (this.z.getTabCount() != 1) {
            this.z.removeAllTabs();
            TabLayout tabLayout = this.z;
            tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_selector), true);
        }
        if (list.size() > 0) {
            this.ag.a(this.af, list);
            this.ag.notifyDataSetChanged();
            if (this.z.getTabCount() == 1) {
                this.z.removeAllTabs();
                TabLayout tabLayout2 = this.z;
                tabLayout2.addTab(tabLayout2.newTab().setIcon(R.drawable.tab_selector), true);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getMesaureUnitId().equalsIgnoreCase("1120")) {
                        this.I = i + 3;
                    }
                    TabLayout tabLayout3 = this.z;
                    tabLayout3.addTab(tabLayout3.newTab().setIcon(R.drawable.tab_selector), false);
                }
            }
            if (this.A == 1) {
                this.u.setStackFromEnd(true);
                this.ah.smoothScrollToPosition(1);
                this.D = 0;
                this.J = 2;
                this.A = 0;
                return;
            }
            this.ag.c(2).a = true;
            this.ag.notifyDataSetChanged();
            int findFirstCompletelyVisibleItemPosition = this.u.findFirstCompletelyVisibleItemPosition();
            this.u.findLastCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition == 0) {
                this.ah.scrollToPosition(3);
            } else {
                this.ah.scrollToPosition(1);
            }
            a(2, this.C);
            this.z.getTabAt(0).select();
            this.D = 0;
            return;
        }
        this.ag.a(this.af);
        a(1, this.C);
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
        this.L = cyqVar;
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void c(String str) {
        this.h.setText(str);
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void a_(int i) {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void p_() {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void q_() {
        this.N.setRefreshing(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.j.a(this);
        this.k.a(this);
        this.c.a(this);
        if (this.k.a()) {
            this.f.e(this.k.s);
            this.q.setText(djm.c(this.K) + " " + this.k.s);
            this.h.setText(this.f.m());
            new StringBuilder("test=>").append(getClass().getSimpleName());
            this.f.m();
            m();
            return;
        }
        b(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.j.b(this);
        this.k.b(this);
        this.c.b(this);
    }

    @Override // defpackage.die
    public final void a(ProfileInfoResponseBody profileInfoResponseBody) {
        this.N.setRefreshing(false);
        this.q.setText(djm.c(this.K) + " " + profileInfoResponseBody.getCustomerName());
        this.h.setText(profileInfoResponseBody.getMsisdn());
    }

    @Override // defpackage.die
    public final void e(int i, String str) {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        if (!isAdded()) {
            return;
        }
        this.N.setRefreshing(false);
        m();
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
        if (!isAdded()) {
            return;
        }
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void a_(List<PlansAndBundlesResponseBody> list) {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void o_() {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void b_(String str) {
        this.N.setRefreshing(false);
        this.l.a();
        FragmentActivity activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        djx.b(getActivity(), str, SuccessHandlerActivity.class, getString(R.string.plan_renewed));
    }

    @Override // defpackage.dic
    public final void a_(int i, String str) {
        this.N.setRefreshing(false);
        this.l.a();
        this.m.a(getActivity(), str, i, ErrorHandlerActivity.class);
    }

    @Override // defpackage.dic
    public final void c_(String str) {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void b_(int i, String str) {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d_(String str) {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void c(int i, String str) {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d(String str) {
        this.N.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d(int i, String str) {
        this.N.setRefreshing(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.ac = getActivity();
        this.O = new cyx(getActivity(), this);
        cgw.a(getContext());
        FirebaseInstanceId.a().e().a(new bwh<cmu>() { // from class: ddv.6
            {
                ddv.this = this;
            }

            @Override // defpackage.bwh
            public final void onComplete(bwl<cmu> bwlVar) {
                if (!bwlVar.e()) {
                    return;
                }
                String a = bwlVar.b().a();
                ddv.this.f.t(a);
                ddv.this.O.a(a, "add");
            }
        });
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(getActivity(), this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i != 2) {
            if (i != 101) {
                return;
            }
            this.O.a(this.f.H(), "add");
            return;
        }
        try {
            djl.a(getActivity()).a(this.f.O(), this.T, this.U);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public static boolean f(String str) {
        return str != null && !str.isEmpty() && !str.equals("");
    }

    public final void k() {
        if (this.f.b("en").equalsIgnoreCase("en")) {
            this.p.setText(this.n.f.getMobile_app_main_invalid_date_en());
            this.o.setText(this.n.f.getMobile_app_main_invalid_en());
            return;
        }
        this.p.setText(this.n.f.getMobile_app_main_invalid_date_ar());
        this.o.setText(this.n.f.getMobile_app_main_invalid_ar());
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        b(true);
    }
}
