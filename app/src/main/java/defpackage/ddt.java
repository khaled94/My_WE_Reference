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
import com.ucare.we.BalanceRechargeActivity;
import com.ucare.we.ErrorHandlerActivity;
import com.ucare.we.ManagePlansActivity;
import com.ucare.we.R;
import com.ucare.we.SuccessHandlerActivity;
import com.ucare.we.adapters.CustomLinearLayoutManager;
import com.ucare.we.adslbalanceservices.ADSLBalanceServicesActivity;
import com.ucare.we.manageplanspostpaid.ManagePostPaidPlanActivity;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.MoreBundleModel.ResponseViewMoreBundle;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import com.ucare.we.model.ProfileInfoResponseBody;
import com.ucare.we.model.RegionalProducts.RegionalPlansResponse;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.morebundle.MoreBundleActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.presentation.RegionalProducts.RegionalProductsActivity;
import com.ucare.we.presentation.auth.signin.SignInActivity;
import com.ucare.we.presentation.auth.signup.SignUpActivity;
import com.ucare.we.presentation.promisetopayandsalefny.PromiseToPayAndSalefnyActivity;
import com.ucare.we.presentation.switchaccount.SwitchAccountPostPaidActivity;
import defpackage.au;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ddt  reason: default package */
/* loaded from: classes2.dex */
public class ddt extends dab implements View.OnClickListener, dcv, dhk, dht, dic, die, dju {
    private static String X = ddt.class.getSimpleName();
    View D;
    int F;
    int G;
    cyq L;
    SwipeRefreshLayout M;
    TextView N;
    cyx O;
    LinearLayout P;
    LinearLayout Q;
    Activity T;
    private Button Y;
    private Button Z;
    @Inject
    protected dhp a;
    private Button aa;
    private View ab;
    private View ac;
    private View ad;
    private View ae;
    private Context af;
    private View ag;
    private View ah;
    private float ai;
    private cxf aj;
    private RecyclerView ak;
    @Inject
    djx b;
    @Inject
    dhu c;
    @Inject
    dhn d;
    @Inject
    djb e;
    @Inject
    djw g;
    Button i;
    Button j;
    @Inject
    did k;
    @Inject
    dio l;
    @Inject
    djg m;
    @Inject
    djx n;
    TextView o;
    TextView p;
    TextView q;
    cwj r;
    Button s;
    CustomLinearLayoutManager u;
    ProgressBar y;
    TabLayout z;
    MainPlanResponseBody f = null;
    boolean h = false;
    boolean t = false;
    int v = 1;
    int w = 1;
    int x = 1;
    int A = 0;
    boolean B = true;
    String C = "";
    int E = 0;
    boolean H = true;
    boolean I = false;
    int J = 0;
    int K = 1;
    List<SummarizedLineUsageItem> R = new ArrayList();
    au.a S = new au.a() { // from class: ddt.1
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ddt.this.m.a();
        }
    };
    au.b<JSONObject> U = new au.b<JSONObject>() { // from class: ddt.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (ddt.this.T.getWindow() != null) {
                ddt.this.m.a();
                if (ddt.this.getActivity() == null) {
                    return;
                }
                RegionalPlansResponse regionalPlansResponse = (RegionalPlansResponse) new Gson().a(jSONObject2.toString(), (Class<Object>) RegionalPlansResponse.class);
                if (regionalPlansResponse.getHeader().getResponseCode() == null || !regionalPlansResponse.getHeader().getResponseCode().equals("0") || regionalPlansResponse.getBody().size() == 0) {
                    return;
                }
                Intent intent = new Intent(ddt.this.getActivity(), RegionalProductsActivity.class);
                intent.putExtra("response", jSONObject2.toString());
                ddt.this.startActivity(intent);
                ddt.this.g.n(false);
            }
        }
    };
    au.a V = new au.a() { // from class: ddt.3
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ddt.this.k();
            ddt.this.t = true;
            if (ddt.this.g.M()) {
                try {
                    djl.a(ddt.this.getActivity()).c(ddt.this.U, ddt.this.S);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            ddt.this.m.a();
        }
    };
    au.b<JSONObject> W = new au.b<JSONObject>() { // from class: ddt.4
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (ddt.this.getActivity() != null) {
                ddt.this.g.q(false);
                Gson gson = new Gson();
                ResponseViewMoreBundle responseViewMoreBundle = (ResponseViewMoreBundle) gson.a(jSONObject2.toString(), (Class<Object>) ResponseViewMoreBundle.class);
                if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("0")) {
                    if (responseViewMoreBundle.getBody().size() != 0) {
                        int i = 0;
                        while (true) {
                            if (i >= responseViewMoreBundle.getBody().size()) {
                                break;
                            } else if (responseViewMoreBundle.getBody().get(i).getMain()) {
                                ddt.this.h = true;
                                ddt.this.g.q(true);
                                ddt.this.g.B(gson.a(responseViewMoreBundle.getBody().get(i)));
                                if (!ddt.this.e.f()) {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        ddt.this.p.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                        if (ddt.this.g.K() && ddt.this.d.f.isFeatureSalfny()) {
                                            ddt.this.startActivity(new Intent(ddt.this.getActivity(), PromiseToPayAndSalefnyActivity.class));
                                            ddt.this.g.l(false);
                                            ddt.this.t = true;
                                        } else {
                                            ddt.this.t = true;
                                            if (ddt.this.g.M()) {
                                                try {
                                                    djl.a(ddt.this.getActivity()).c(ddt.this.U, ddt.this.S);
                                                } catch (JSONException e) {
                                                    e.printStackTrace();
                                                }
                                            } else {
                                                ddt.this.m.a();
                                            }
                                        }
                                    } else if (ddt.f(responseViewMoreBundle.getBody().get(i).getRenewalDate())) {
                                        ddt.this.t = true;
                                        if (ddt.this.g.M()) {
                                            try {
                                                djl.a(ddt.this.getActivity()).c(ddt.this.U, ddt.this.S);
                                            } catch (JSONException e2) {
                                                e2.printStackTrace();
                                            }
                                        } else {
                                            ddt.this.m.a();
                                        }
                                        ddt.this.p.setText(djm.a(responseViewMoreBundle.getBody().get(i).getRenewalDate()));
                                    } else {
                                        ddt.this.p.setText("");
                                        ddt.this.t = true;
                                        if (ddt.this.g.M()) {
                                            try {
                                                djl.a(ddt.this.getActivity()).c(ddt.this.U, ddt.this.S);
                                            } catch (JSONException e3) {
                                                e3.printStackTrace();
                                            }
                                        } else {
                                            ddt.this.m.a();
                                        }
                                    }
                                    ddt.this.o.setText(responseViewMoreBundle.getBody().get(i).getOfferEnName());
                                } else {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        ddt.this.p.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                        if (ddt.this.g.K() && ddt.this.d.f.isFeatureSalfny()) {
                                            ddt.this.startActivity(new Intent(ddt.this.getActivity(), PromiseToPayAndSalefnyActivity.class));
                                            ddt.this.g.l(false);
                                            ddt.this.t = true;
                                        } else if (ddt.this.g.M()) {
                                            try {
                                                djl.a(ddt.this.getActivity()).c(ddt.this.U, ddt.this.S);
                                            } catch (JSONException e4) {
                                                e4.printStackTrace();
                                            }
                                        } else {
                                            ddt.this.m.a();
                                        }
                                    } else if (ddt.f(responseViewMoreBundle.getBody().get(i).getRenewalDate())) {
                                        ddt.this.p.setText(responseViewMoreBundle.getBody().get(i).getRenewalDate());
                                        ddt.this.t = true;
                                        if (ddt.this.g.M()) {
                                            try {
                                                djl.a(ddt.this.getActivity()).c(ddt.this.U, ddt.this.S);
                                            } catch (JSONException e5) {
                                                e5.printStackTrace();
                                            }
                                        } else {
                                            ddt.this.m.a();
                                        }
                                    } else {
                                        ddt.this.p.setText("");
                                        ddt.this.t = true;
                                        if (ddt.this.g.M()) {
                                            try {
                                                djl.a(ddt.this.getActivity()).c(ddt.this.U, ddt.this.S);
                                            } catch (JSONException e6) {
                                                e6.printStackTrace();
                                            }
                                        } else {
                                            ddt.this.m.a();
                                        }
                                    }
                                    ddt.this.o.setText(responseViewMoreBundle.getBody().get(i).getOfferArName());
                                }
                                ddt.this.Y.setText(ddt.this.getString(R.string.manage_plan));
                            } else {
                                i++;
                            }
                        }
                        if (ddt.this.h) {
                            return;
                        }
                        ddt.this.B = false;
                        ddt.this.k();
                        return;
                    }
                    ddt.this.B = false;
                    ddt.this.k();
                    ddt.this.t = true;
                    if (ddt.this.g.M()) {
                        try {
                            djl.a(ddt.this.getActivity()).c(ddt.this.U, ddt.this.S);
                            return;
                        } catch (JSONException e7) {
                            e7.printStackTrace();
                            return;
                        }
                    }
                    ddt.this.m.a();
                    return;
                }
                ddt.this.B = false;
                ddt.this.k();
                ddt.this.t = true;
                if (ddt.this.g.M()) {
                    try {
                        djl.a(ddt.this.getActivity()).c(ddt.this.U, ddt.this.S);
                        return;
                    } catch (JSONException e8) {
                        e8.printStackTrace();
                        return;
                    }
                }
                ddt.this.m.a();
            }
        }
    };

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

    public ddt() {
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.D = layoutInflater.inflate(R.layout.fragment_corporate_adslpre_paid_home, viewGroup, false);
        this.T = getActivity();
        Button button = (Button) this.D.findViewById(R.id.btn_balance_recharge_main);
        this.j = button;
        if (button != null) {
            button.setOnClickListener(this);
        }
        if (this.a.k().booleanValue()) {
            this.j.setAlpha(1.0f);
            this.j.setClickable(true);
        } else {
            this.j.setAlpha(0.5f);
            this.j.setClickable(false);
        }
        Button button2 = (Button) this.D.findViewById(R.id.btn_balance_services_main);
        this.s = button2;
        if (button2 != null) {
            button2.setOnClickListener(this);
        }
        this.q = (TextView) this.D.findViewById(R.id.welcome);
        this.i = (Button) this.D.findViewById(R.id.btn_current_number);
        this.ab = this.D.findViewById(R.id.plan_labels);
        this.o = (TextView) this.D.findViewById(R.id.tv_main_plan_home);
        this.p = (TextView) this.D.findViewById(R.id.tv_main_plan_renewal_date_home);
        this.ag = this.D.findViewById(R.id.user_view);
        this.ah = this.D.findViewById(R.id.user_bottom_view);
        this.ac = this.D.findViewById(R.id.guest_view);
        this.ad = this.D.findViewById(R.id.guest_bottom_view);
        this.Y = (Button) this.D.findViewById(R.id.btn_change_plan);
        this.aa = (Button) this.D.findViewById(R.id.btn_subscribe);
        this.Z = (Button) this.D.findViewById(R.id.btn_extra_bundles);
        this.y = (ProgressBar) this.D.findViewById(R.id.progressBar);
        this.z = (TabLayout) this.D.findViewById(R.id.tab_layout);
        this.N = (TextView) this.D.findViewById(R.id.lastModificationDate);
        TabLayout tabLayout = this.z;
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_selector), true);
        this.ae = this.D.findViewById(R.id.subscribe_to_plan);
        this.Y.setOnClickListener(this);
        this.aa.setOnClickListener(this);
        this.Z.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.P = (LinearLayout) this.D.findViewById(R.id.top_buttons_layout);
        this.Q = (LinearLayout) this.D.findViewById(R.id.lower_buttons_layout);
        this.D.findViewById(R.id.btn_sign_in).setOnClickListener(this);
        this.D.findViewById(R.id.btn_signup).setOnClickListener(this);
        this.D.findViewById(R.id.btn_live_chat).setOnClickListener(this);
        this.ak = (RecyclerView) this.D.findViewById(R.id.rv_slider);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(getActivity());
        this.u = customLinearLayoutManager;
        customLinearLayoutManager.setOrientation(0);
        this.ak.setLayoutManager(this.u);
        cxf cxfVar = new cxf(this);
        this.aj = cxfVar;
        this.ak.setAdapter(cxfVar);
        this.ak.setHasFixedSize(true);
        if (getArguments() != null) {
            this.A = Integer.parseInt(getArguments().getString("params"));
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.D.findViewById(R.id.swipeRefreshLayout);
        this.M = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary);
        this.M.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: ddt.5
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                if (ddt.this.l.a()) {
                    ddt.this.c.d();
                    ddt.this.c.a();
                    return;
                }
                ddt.this.b(true);
            }
        });
        this.ak.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: ddt.6
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (ddt.this.w >= 0 && i != 0) {
                    ddt.this.aj.c(ddt.this.w).a = false;
                    ddt.this.aj.notifyDataSetChanged();
                }
                if (i == 0) {
                    ddt.this.x = 1;
                }
                ddt ddtVar = ddt.this;
                ddtVar.v = ddtVar.u.findFirstCompletelyVisibleItemPosition() + 1;
                ddt ddtVar2 = ddt.this;
                ddtVar2.w = ddtVar2.u.findLastCompletelyVisibleItemPosition() - 1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    return;
                }
                if (ddt.this.v == ddt.this.w && ddt.this.w == 1 && ddt.this.x >= ddt.this.w && ddt.this.aj.getItemCount() != 3) {
                    ddt.this.ak.scrollToPosition(ddt.this.aj.getItemCount() - 2);
                    ddt ddtVar = ddt.this;
                    ddtVar.v = ddtVar.aj.getItemCount() - 3;
                    ddt ddtVar2 = ddt.this;
                    ddtVar2.w = ddtVar2.v;
                }
                if (ddt.this.v == ddt.this.w && ddt.this.w == ddt.this.aj.getItemCount() - 2 && ddt.this.x <= ddt.this.w && ddt.this.aj.getItemCount() != 3) {
                    ddt.this.ak.scrollToPosition(1);
                    ddt.this.v = 2;
                    ddt ddtVar3 = ddt.this;
                    ddtVar3.w = ddtVar3.v;
                }
                if (ddt.this.v != ddt.this.w) {
                    return;
                }
                ddt.this.aj.a(ddt.this.v);
                TabLayout.Tab tabAt = ddt.this.z.getTabAt(ddt.this.v - 2);
                if (tabAt != null && !tabAt.isSelected()) {
                    ddt.this.H = false;
                    tabAt.select();
                    ddt ddtVar4 = ddt.this;
                    ddtVar4.E = ddtVar4.v - 2;
                }
                if (ddt.this.x == ddt.this.v) {
                    return;
                }
                ddt ddtVar5 = ddt.this;
                ddtVar5.x = ddtVar5.v;
                ddt ddtVar6 = ddt.this;
                ddtVar6.a(ddtVar6.v, ddt.this.D);
            }
        });
        new LinearSnapHelper() { // from class: ddt.7
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
                    ddt r5 = defpackage.ddt.this
                    djb r5 = r5.e
                    boolean r5 = r5.f()
                    if (r5 != 0) goto L2c
                    goto L29
                L1f:
                    ddt r5 = defpackage.ddt.this
                    djb r5 = r5.e
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ddt.AnonymousClass7.findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
            }
        }.attachToRecyclerView(this.ak);
        this.u.setSmoothScrollbarEnabled(true);
        this.z.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: ddt.8
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabSelected(TabLayout.Tab tab) {
                if (!ddt.this.H) {
                    ddt.this.H = true;
                    return;
                }
                int i = 0;
                ddt ddtVar = ddt.this;
                ddtVar.F = ddtVar.u.findFirstCompletelyVisibleItemPosition();
                ddt ddtVar2 = ddt.this;
                ddtVar2.G = ddtVar2.u.findLastCompletelyVisibleItemPosition();
                if (ddt.this.E < tab.getPosition()) {
                    i = (tab.getPosition() - ddt.this.E) + ddt.this.G;
                } else if (ddt.this.E > tab.getPosition()) {
                    i = ddt.this.F - (ddt.this.E - tab.getPosition());
                }
                ddt.this.E = tab.getPosition();
                ddt.this.ak.smoothScrollToPosition(i);
                if (i != 0) {
                    return;
                }
                ddt ddtVar3 = ddt.this;
                ddtVar3.a(2, ddtVar3.D);
            }
        });
        this.aj.b();
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, View view) {
        boolean z;
        if (view == null) {
            return;
        }
        int b = this.aj.b(i);
        int i2 = 100;
        if (i == this.J) {
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
        if (this.aj.getItemCount() > 3) {
            this.K = 2;
        } else {
            this.K = 1;
        }
        if (this.K != i && this.J != i) {
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

    private void l() {
        if (!isAdded()) {
            return;
        }
        b(false);
        this.q.setText(djm.c(this.T) + " " + this.l.s);
        this.c.a();
        this.c.d();
        try {
            this.m.a(this.af, getString(R.string.loading));
            djl.a(getActivity()).a(this.g.O(), this.W, this.V);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b(boolean z) {
        int i = 4;
        int i2 = 0;
        this.q.setVisibility(z ? 4 : 0);
        Button button = this.i;
        if (!z) {
            i = 0;
        }
        button.setVisibility(i);
        this.ae.setVisibility(8);
        this.ag.setVisibility(z ? 8 : 0);
        this.ah.setVisibility(z ? 8 : 0);
        this.ac.setVisibility(z ? 0 : 8);
        View view = this.ad;
        if (!z) {
            i2 = 8;
        }
        view.setVisibility(i2);
        this.u.a = !z;
        this.ak.setEnabled(!z);
        this.ak.setAlpha(z ? 0.15f : 1.0f);
        if (z) {
            this.aj.b();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_balance_recharge_main /* 2131362011 */:
                this.n.b(getActivity(), BalanceRechargeActivity.class);
                return;
            case R.id.btn_balance_services_main /* 2131362013 */:
                djx.a(getActivity(), ADSLBalanceServicesActivity.class, String.valueOf(this.ai));
                return;
            case R.id.btn_change_plan /* 2131362018 */:
                if (this.B) {
                    this.b.a(this.f, getActivity(), ManagePostPaidPlanActivity.class);
                    return;
                } else if (this.g.b("en").equalsIgnoreCase("en")) {
                    UnNavigateResponseActivity.a(getContext(), this.d.f.getMobile_app_main_invalid_en(), this.d.f.getMobile_app_main_invalid_desc_en(), true);
                    return;
                } else {
                    UnNavigateResponseActivity.a(getContext(), this.d.f.getMobile_app_main_invalid_ar(), this.d.f.getMobile_app_main_invalid_desc_ar(), true);
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
            case R.id.btn_subscribe /* 2131362050 */:
                this.b.a(getActivity(), ManagePlansActivity.class);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.dht
    public final void a(float f) {
        this.ai = f;
        this.aj.a(f);
        this.g.a(f);
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void r_() {
        this.ai = -1.0f;
        this.aj.a(-1.0f);
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void b(String str) {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void s_() {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void b(int i, String str) {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void a(List<SummarizedLineUsageItem> list) {
        this.M.setRefreshing(false);
        this.R = list;
        djm.a(this.T.getBaseContext());
        TextView textView = this.N;
        this.T.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        this.M.setRefreshing(false);
        this.aj.d(0);
        if (this.z.getTabCount() != 1) {
            this.z.removeAllTabs();
            TabLayout tabLayout = this.z;
            tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_selector), true);
        }
        if (list.size() > 0) {
            this.aj.a(this.ai, list);
            this.aj.notifyDataSetChanged();
            if (this.z.getTabCount() == 1) {
                this.z.removeAllTabs();
                TabLayout tabLayout2 = this.z;
                tabLayout2.addTab(tabLayout2.newTab().setIcon(R.drawable.tab_selector), true);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getMesaureUnitId().equalsIgnoreCase("1120")) {
                        this.J = i + 3;
                    }
                    TabLayout tabLayout3 = this.z;
                    tabLayout3.addTab(tabLayout3.newTab().setIcon(R.drawable.tab_selector), false);
                }
            }
            if (this.A == 1) {
                this.u.setStackFromEnd(true);
                this.ak.smoothScrollToPosition(1);
                this.E = 0;
                this.K = 2;
                this.A = 0;
                return;
            }
            this.aj.c(2).a = true;
            this.aj.notifyDataSetChanged();
            int findFirstCompletelyVisibleItemPosition = this.u.findFirstCompletelyVisibleItemPosition();
            this.u.findLastCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition == 0) {
                this.ak.scrollToPosition(3);
            } else {
                this.ak.scrollToPosition(1);
            }
            a(2, this.D);
            this.z.getTabAt(0).select();
            this.E = 0;
            return;
        }
        this.aj.a(this.ai);
        a(1, this.D);
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
        this.L = cyqVar;
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void c(String str) {
        this.i.setText(str);
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void a_(int i) {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void b(List<MainPlanResponseBody> list) {
        this.M.setRefreshing(false);
        this.o.setText("");
        this.p.setText("");
        this.f = null;
        new StringBuilder().append(list);
        int i = 0;
        while (true) {
            if (i >= list.size()) {
                break;
            }
            new StringBuilder().append(list.get(i).isMainPlan());
            if (list.get(i).isMainPlan()) {
                MainPlanResponseBody mainPlanResponseBody = list.get(i);
                this.o.setText(mainPlanResponseBody.getServiceName());
                if (f(mainPlanResponseBody.getRenewalDate())) {
                    this.p.setText(mainPlanResponseBody.getRenewalDate());
                }
                this.f = list.get(i);
            } else {
                i++;
            }
        }
        if (this.f == null) {
            this.ab.setVisibility(4);
            this.ae.setVisibility(0);
            this.Y.setVisibility(8);
            this.aa.setVisibility(0);
            return;
        }
        this.ab.setVisibility(0);
        this.ae.setVisibility(4);
        this.Y.setVisibility(0);
        this.aa.setVisibility(8);
    }

    @Override // defpackage.dht
    public final void p_() {
        this.M.setRefreshing(false);
        this.o.setText("");
        this.p.setText("");
        this.f = null;
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void q_() {
        this.M.setRefreshing(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.k.a(this);
        this.l.a(this);
        this.c.a(this);
        if (this.l.a()) {
            l();
            this.g.e(this.l.s);
            this.q.setText(djm.c(this.T) + " " + this.l.s);
            this.i.setText(this.g.m());
            new StringBuilder("test=>").append(getClass().getSimpleName());
            this.g.m();
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
        this.k.b(this);
        this.l.b(this);
        this.c.b(this);
    }

    @Override // defpackage.die
    public final void a(ProfileInfoResponseBody profileInfoResponseBody) {
        this.M.setRefreshing(false);
        this.q.setText(djm.c(this.T) + " " + this.l.s);
        this.i.setText(profileInfoResponseBody.getMsisdn());
    }

    @Override // defpackage.die
    public final void e(int i, String str) {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        if (!isAdded()) {
            return;
        }
        l();
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
        if (!isAdded()) {
            return;
        }
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void a_(List<PlansAndBundlesResponseBody> list) {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void o_() {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void b_(String str) {
        this.M.setRefreshing(false);
        this.c.e();
        this.m.a();
        FragmentActivity activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        djx.b(getActivity(), str, SuccessHandlerActivity.class, getString(R.string.plan_renewed));
    }

    @Override // defpackage.dic
    public final void a_(int i, String str) {
        this.M.setRefreshing(false);
        this.m.a();
        this.n.a(getActivity(), str, i, ErrorHandlerActivity.class);
    }

    @Override // defpackage.dic
    public final void c_(String str) {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void b_(int i, String str) {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d_(String str) {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void c(int i, String str) {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d(String str) {
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d(int i, String str) {
        this.M.setRefreshing(false);
    }

    public static boolean f(String str) {
        return str != null && !str.isEmpty() && !str.equals("");
    }

    public final void k() {
        if (this.g.b("en").equalsIgnoreCase("en")) {
            this.p.setText(this.d.f.getMobile_app_main_invalid_date_en());
            this.o.setText(this.d.f.getMobile_app_main_invalid_en());
            return;
        }
        this.p.setText(this.d.f.getMobile_app_main_invalid_date_ar());
        this.o.setText(this.d.f.getMobile_app_main_invalid_ar());
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.af = getActivity();
        this.O = new cyx(getActivity(), this);
        cgw.a(getContext());
        FirebaseInstanceId.a().e().a(new bwh<cmu>() { // from class: ddt.9
            @Override // defpackage.bwh
            public final void onComplete(bwl<cmu> bwlVar) {
                if (!bwlVar.e()) {
                    return;
                }
                String a = bwlVar.b().a();
                ddt.this.g.t(a);
                ddt.this.O.a(a, "add");
            }
        });
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(getActivity(), this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i != 101) {
            return;
        }
        this.O.a(this.g.H(), "add");
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        b(true);
        this.M.setRefreshing(false);
    }
}
