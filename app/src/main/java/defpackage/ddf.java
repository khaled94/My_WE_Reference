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

/* renamed from: ddf  reason: default package */
/* loaded from: classes2.dex */
public class ddf extends dab implements View.OnClickListener, dcv, dhk, dht, dic, die, dju {
    private static String V = ddf.class.getSimpleName();
    View D;
    int F;
    int G;
    cyq L;
    SwipeRefreshLayout M;
    TextView N;
    cyx O;
    Activity R;
    private Button W;
    private Button X;
    private Button Y;
    private View Z;
    @Inject
    protected dhp a;
    private View aa;
    private View ab;
    private View ac;
    private Context ad;
    private View ae;
    private View af;
    private float ag;
    private cxf ah;
    private RecyclerView ai;
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
    CustomLinearLayoutManager t;
    ProgressBar x;
    TabLayout y;
    MainPlanResponseBody f = null;
    boolean h = false;
    int u = 1;
    int v = 1;
    int w = 1;
    int z = 0;
    boolean A = true;
    boolean B = false;
    String C = "";
    int E = 0;
    boolean H = true;
    boolean I = false;
    int J = 0;
    int K = 1;
    List<SummarizedLineUsageItem> P = new ArrayList();
    au.a Q = new au.a() { // from class: ddf.1
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ddf.this.m.a();
        }
    };
    au.b<JSONObject> S = new au.b<JSONObject>() { // from class: ddf.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (ddf.this.R.getWindow() != null) {
                ddf.this.m.a();
                if (ddf.this.getActivity() == null) {
                    return;
                }
                RegionalPlansResponse regionalPlansResponse = (RegionalPlansResponse) new Gson().a(jSONObject2.toString(), (Class<Object>) RegionalPlansResponse.class);
                if (regionalPlansResponse.getHeader().getResponseCode() == null || !regionalPlansResponse.getHeader().getResponseCode().equals("0") || regionalPlansResponse.getBody().size() == 0) {
                    return;
                }
                Intent intent = new Intent(ddf.this.getActivity(), RegionalProductsActivity.class);
                intent.putExtra("response", jSONObject2.toString());
                ddf.this.startActivity(intent);
                ddf.this.g.n(false);
            }
        }
    };
    au.a T = new au.a() { // from class: ddf.3
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ddf.this.k();
            ddf.this.B = true;
            if (ddf.this.g.M()) {
                try {
                    djl.a(ddf.this.getActivity()).c(ddf.this.S, ddf.this.Q);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
            ddf.this.m.a();
        }
    };
    au.b<JSONObject> U = new au.b<JSONObject>() { // from class: ddf.4
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (ddf.this.R.getWindow() == null || ddf.this.getActivity() == null) {
                return;
            }
            ddf.this.g.q(false);
            Gson gson = new Gson();
            ResponseViewMoreBundle responseViewMoreBundle = (ResponseViewMoreBundle) gson.a(jSONObject2.toString(), (Class<Object>) ResponseViewMoreBundle.class);
            if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("0")) {
                if (responseViewMoreBundle.getBody().size() != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= responseViewMoreBundle.getBody().size()) {
                            break;
                        } else if (responseViewMoreBundle.getBody().get(i).getMain()) {
                            ddf.this.h = true;
                            ddf.this.g.q(true);
                            ddf.this.g.B(gson.a(responseViewMoreBundle.getBody().get(i)));
                            if (!ddf.this.e.f()) {
                                if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                    ddf.this.p.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    if (ddf.this.g.K() && ddf.this.d.f.isFeatureSalfny()) {
                                        ddf.this.startActivity(new Intent(ddf.this.getActivity(), PromiseToPayAndSalefnyActivity.class));
                                        ddf.this.g.l(false);
                                        ddf.this.B = true;
                                    } else if (ddf.this.g.M()) {
                                        try {
                                            djl.a(ddf.this.getActivity()).c(ddf.this.S, ddf.this.Q);
                                        } catch (JSONException e) {
                                            e.printStackTrace();
                                        }
                                    } else {
                                        ddf.this.m.a();
                                    }
                                } else if (ddf.f(responseViewMoreBundle.getBody().get(i).getRenewalDate())) {
                                    ddf.this.p.setText(djm.a(responseViewMoreBundle.getBody().get(i).getRenewalDate()));
                                    if (ddf.this.g.M()) {
                                        try {
                                            djl.a(ddf.this.getActivity()).c(ddf.this.S, ddf.this.Q);
                                        } catch (JSONException e2) {
                                            e2.printStackTrace();
                                        }
                                    } else {
                                        ddf.this.m.a();
                                    }
                                } else {
                                    ddf.this.p.setText("");
                                    if (ddf.this.g.M()) {
                                        try {
                                            djl.a(ddf.this.getActivity()).c(ddf.this.S, ddf.this.Q);
                                        } catch (JSONException e3) {
                                            e3.printStackTrace();
                                        }
                                    } else {
                                        ddf.this.m.a();
                                    }
                                }
                                ddf.this.o.setText(responseViewMoreBundle.getBody().get(i).getOfferEnName());
                            } else {
                                if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                    ddf.this.p.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    if (ddf.this.g.K() && ddf.this.d.f.isFeatureSalfny()) {
                                        ddf.this.startActivity(new Intent(ddf.this.getActivity(), PromiseToPayAndSalefnyActivity.class));
                                        ddf.this.g.l(false);
                                        ddf.this.B = true;
                                    } else if (ddf.this.g.M()) {
                                        try {
                                            djl.a(ddf.this.getActivity()).c(ddf.this.S, ddf.this.Q);
                                        } catch (JSONException e4) {
                                            e4.printStackTrace();
                                        }
                                    } else {
                                        ddf.this.m.a();
                                    }
                                } else if (ddf.f(responseViewMoreBundle.getBody().get(i).getRenewalDate())) {
                                    ddf.this.p.setText(responseViewMoreBundle.getBody().get(i).getRenewalDate());
                                    if (ddf.this.g.M()) {
                                        try {
                                            djl.a(ddf.this.getActivity()).c(ddf.this.S, ddf.this.Q);
                                        } catch (JSONException e5) {
                                            e5.printStackTrace();
                                        }
                                    } else {
                                        ddf.this.m.a();
                                    }
                                } else {
                                    ddf.this.p.setText("");
                                    if (ddf.this.g.M()) {
                                        try {
                                            djl.a(ddf.this.getActivity()).c(ddf.this.S, ddf.this.Q);
                                        } catch (JSONException e6) {
                                            e6.printStackTrace();
                                        }
                                    } else {
                                        ddf.this.m.a();
                                    }
                                }
                                ddf.this.o.setText(responseViewMoreBundle.getBody().get(i).getOfferArName());
                            }
                            ddf.this.W.setText(ddf.this.getString(R.string.manage_plan));
                        } else {
                            i++;
                        }
                    }
                    if (ddf.this.h) {
                        return;
                    }
                    ddf.this.A = false;
                    ddf.this.k();
                    return;
                }
                ddf.this.A = false;
                ddf.this.k();
                if (ddf.this.g.M()) {
                    try {
                        djl.a(ddf.this.getActivity()).c(ddf.this.S, ddf.this.Q);
                        return;
                    } catch (JSONException e7) {
                        e7.printStackTrace();
                        return;
                    }
                }
                ddf.this.m.a();
                return;
            }
            ddf.this.A = false;
            ddf.this.k();
            ddf.this.B = true;
            if (ddf.this.g.M()) {
                try {
                    djl.a(ddf.this.getActivity()).c(ddf.this.S, ddf.this.Q);
                    return;
                } catch (JSONException e8) {
                    e8.printStackTrace();
                    return;
                }
            }
            ddf.this.m.a();
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

    public ddf() {
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.D = layoutInflater.inflate(R.layout.fragment_adslpre_paid_home, viewGroup, false);
        this.R = getActivity();
        Button button = (Button) this.D.findViewById(R.id.btn_balance_recharge_main);
        this.j = button;
        if (button != null) {
            button.setOnClickListener(this);
        }
        Button button2 = (Button) this.D.findViewById(R.id.btn_balance_services_main);
        this.s = button2;
        if (button2 != null) {
            button2.setOnClickListener(this);
        }
        this.q = (TextView) this.D.findViewById(R.id.welcome);
        this.i = (Button) this.D.findViewById(R.id.btn_current_number);
        this.Z = this.D.findViewById(R.id.plan_labels);
        this.o = (TextView) this.D.findViewById(R.id.tv_main_plan_home);
        this.p = (TextView) this.D.findViewById(R.id.tv_main_plan_renewal_date_home);
        this.ae = this.D.findViewById(R.id.user_view);
        this.af = this.D.findViewById(R.id.user_bottom_view);
        this.aa = this.D.findViewById(R.id.guest_view);
        this.ab = this.D.findViewById(R.id.guest_bottom_view);
        this.W = (Button) this.D.findViewById(R.id.btn_change_plan);
        this.Y = (Button) this.D.findViewById(R.id.btn_subscribe);
        this.X = (Button) this.D.findViewById(R.id.btn_extra_bundles);
        this.x = (ProgressBar) this.D.findViewById(R.id.progressBar);
        this.y = (TabLayout) this.D.findViewById(R.id.tab_layout);
        this.N = (TextView) this.D.findViewById(R.id.lastModificationDate);
        TabLayout tabLayout = this.y;
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_selector), true);
        this.ac = this.D.findViewById(R.id.subscribe_to_plan);
        this.W.setOnClickListener(this);
        this.Y.setOnClickListener(this);
        this.X.setOnClickListener(this);
        this.i.setOnClickListener(this);
        this.D.findViewById(R.id.btn_sign_in).setOnClickListener(this);
        this.D.findViewById(R.id.btn_signup).setOnClickListener(this);
        this.D.findViewById(R.id.btn_live_chat).setOnClickListener(this);
        this.ai = (RecyclerView) this.D.findViewById(R.id.rv_slider);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(getActivity());
        this.t = customLinearLayoutManager;
        customLinearLayoutManager.setOrientation(0);
        this.ai.setLayoutManager(this.t);
        cxf cxfVar = new cxf(this);
        this.ah = cxfVar;
        this.ai.setAdapter(cxfVar);
        this.ai.setHasFixedSize(true);
        if (getArguments() != null) {
            this.z = Integer.parseInt(getArguments().getString("params"));
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.D.findViewById(R.id.swipeRefreshLayout);
        this.M = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary);
        this.M.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: ddf.5
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                if (ddf.this.l.a()) {
                    ddf.this.c.d();
                    ddf.this.c.a();
                    return;
                }
                ddf.this.b(true);
            }
        });
        this.ai.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: ddf.6
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (ddf.this.v >= 0 && i != 0) {
                    ddf.this.ah.c(ddf.this.v).a = false;
                    ddf.this.ah.notifyDataSetChanged();
                }
                if (i == 0) {
                    ddf.this.w = 1;
                }
                ddf ddfVar = ddf.this;
                ddfVar.u = ddfVar.t.findFirstCompletelyVisibleItemPosition() + 1;
                ddf ddfVar2 = ddf.this;
                ddfVar2.v = ddfVar2.t.findLastCompletelyVisibleItemPosition() - 1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    return;
                }
                if (ddf.this.u == ddf.this.v && ddf.this.v == 1 && ddf.this.w >= ddf.this.v && ddf.this.ah.getItemCount() != 3) {
                    ddf.this.ai.scrollToPosition(ddf.this.ah.getItemCount() - 2);
                    ddf ddfVar = ddf.this;
                    ddfVar.u = ddfVar.ah.getItemCount() - 3;
                    ddf ddfVar2 = ddf.this;
                    ddfVar2.v = ddfVar2.u;
                }
                if (ddf.this.u == ddf.this.v && ddf.this.v == ddf.this.ah.getItemCount() - 2 && ddf.this.w <= ddf.this.v && ddf.this.ah.getItemCount() != 3) {
                    ddf.this.ai.scrollToPosition(1);
                    ddf.this.u = 2;
                    ddf ddfVar3 = ddf.this;
                    ddfVar3.v = ddfVar3.u;
                }
                if (ddf.this.u != ddf.this.v) {
                    return;
                }
                ddf.this.ah.a(ddf.this.u);
                TabLayout.Tab tabAt = ddf.this.y.getTabAt(ddf.this.u - 2);
                if (tabAt != null && !tabAt.isSelected()) {
                    ddf.this.H = false;
                    tabAt.select();
                    ddf ddfVar4 = ddf.this;
                    ddfVar4.E = ddfVar4.u - 2;
                }
                if (ddf.this.w == ddf.this.u) {
                    return;
                }
                ddf ddfVar5 = ddf.this;
                ddfVar5.w = ddfVar5.u;
                ddf ddfVar6 = ddf.this;
                ddfVar6.a(ddfVar6.u, ddf.this.D);
            }
        });
        new LinearSnapHelper() { // from class: ddf.7
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
                    ddf r5 = defpackage.ddf.this
                    djb r5 = r5.e
                    boolean r5 = r5.f()
                    if (r5 != 0) goto L2c
                    goto L29
                L1f:
                    ddf r5 = defpackage.ddf.this
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ddf.AnonymousClass7.findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
            }
        }.attachToRecyclerView(this.ai);
        this.t.setSmoothScrollbarEnabled(true);
        this.y.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: ddf.8
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabSelected(TabLayout.Tab tab) {
                if (!ddf.this.H) {
                    ddf.this.H = true;
                    return;
                }
                int i = 0;
                ddf ddfVar = ddf.this;
                ddfVar.F = ddfVar.t.findFirstCompletelyVisibleItemPosition();
                ddf ddfVar2 = ddf.this;
                ddfVar2.G = ddfVar2.t.findLastCompletelyVisibleItemPosition();
                if (ddf.this.E < tab.getPosition()) {
                    i = (tab.getPosition() - ddf.this.E) + ddf.this.G;
                } else if (ddf.this.E > tab.getPosition()) {
                    i = ddf.this.F - (ddf.this.E - tab.getPosition());
                }
                ddf.this.E = tab.getPosition();
                ddf.this.ai.smoothScrollToPosition(i);
                if (i != 0) {
                    return;
                }
                ddf ddfVar3 = ddf.this;
                ddfVar3.a(2, ddfVar3.D);
            }
        });
        this.ah.b();
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, View view) {
        boolean z;
        if (view == null) {
            return;
        }
        int b = this.ah.b(i);
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
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.x, "progress", 0, i2);
        ofInt.setDuration(2000L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
        if (this.ah.getItemCount() > 3) {
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
        this.c.d();
        this.c.a();
        try {
            this.m.a(this.ad, getString(R.string.loading));
            djl.a(getActivity()).a(this.g.O(), this.U, this.T);
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
        this.ac.setVisibility(8);
        this.ae.setVisibility(z ? 8 : 0);
        this.af.setVisibility(z ? 8 : 0);
        this.aa.setVisibility(z ? 0 : 8);
        View view = this.ab;
        if (!z) {
            i2 = 8;
        }
        view.setVisibility(i2);
        this.t.a = !z;
        this.ai.setEnabled(!z);
        this.ai.setAlpha(z ? 0.15f : 1.0f);
        if (z) {
            this.ah.b();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.btn_balance_recharge_main /* 2131362011 */:
                this.n.b(getActivity(), BalanceRechargeActivity.class);
                return;
            case R.id.btn_balance_services_main /* 2131362013 */:
                djx.a(getActivity(), ADSLBalanceServicesActivity.class, String.valueOf(this.ag));
                return;
            case R.id.btn_change_plan /* 2131362018 */:
                if (this.A) {
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
        this.ag = f;
        this.ah.a(f);
        this.g.a(f);
        this.M.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void r_() {
        this.ag = -1.0f;
        this.ah.a(-1.0f);
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
        djm.a(this.R.getBaseContext());
        TextView textView = this.N;
        this.R.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        this.M.setRefreshing(false);
        this.P = list;
        this.ah.d(0);
        if (this.y.getTabCount() != 1) {
            this.y.removeAllTabs();
            TabLayout tabLayout = this.y;
            tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_selector), true);
        }
        if (list.size() > 0) {
            this.ah.a(this.ag, list);
            this.ah.notifyDataSetChanged();
            if (this.y.getTabCount() == 1) {
                this.y.removeAllTabs();
                TabLayout tabLayout2 = this.y;
                tabLayout2.addTab(tabLayout2.newTab().setIcon(R.drawable.tab_selector), true);
                for (int i = 0; i < list.size(); i++) {
                    if (list.get(i).getMesaureUnitId().equalsIgnoreCase("1120")) {
                        this.J = i + 3;
                    }
                    TabLayout tabLayout3 = this.y;
                    tabLayout3.addTab(tabLayout3.newTab().setIcon(R.drawable.tab_selector), false);
                }
            }
            if (this.z == 1) {
                this.t.setStackFromEnd(true);
                this.ai.smoothScrollToPosition(1);
                this.E = 0;
                this.K = 2;
                this.z = 0;
                return;
            }
            this.ah.c(2).a = true;
            this.ah.notifyDataSetChanged();
            int findFirstCompletelyVisibleItemPosition = this.t.findFirstCompletelyVisibleItemPosition();
            this.t.findLastCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition == 0) {
                this.ai.scrollToPosition(3);
            } else {
                this.ai.scrollToPosition(1);
            }
            a(2, this.D);
            this.y.getTabAt(0).select();
            this.E = 0;
            return;
        }
        this.ah.a(this.ag);
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
            this.Z.setVisibility(4);
            this.ac.setVisibility(0);
            this.W.setVisibility(8);
            this.Y.setVisibility(0);
            return;
        }
        this.Z.setVisibility(0);
        this.ac.setVisibility(4);
        this.W.setVisibility(0);
        this.Y.setVisibility(8);
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
            this.q.setText(djm.c(this.R) + " " + this.l.s);
            this.i.setText(this.g.m());
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
        this.q.setText(djm.c(this.R) + " " + this.l.s);
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
        this.ad = getActivity();
        this.O = new cyx(getActivity(), this);
        cgw.a(getContext());
        FirebaseInstanceId.a().e().a(new bwh<cmu>() { // from class: ddf.9
            @Override // defpackage.bwh
            public final void onComplete(bwl<cmu> bwlVar) {
                if (!bwlVar.e()) {
                    return;
                }
                String a = bwlVar.b().a();
                ddf.this.g.t(a);
                ddf.this.O.a(a, "add");
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
