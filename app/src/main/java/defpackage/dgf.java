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
import android.widget.RelativeLayout;
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
import com.ucare.we.ManagePlansActivity;
import com.ucare.we.R;
import com.ucare.we.SuccessHandlerActivity;
import com.ucare.we.adapters.CustomLinearLayoutManager;
import com.ucare.we.manageplanspostpaid.ManagePostPaidPlanActivity;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.MoreBundleModel.ResponseViewMoreBundle;
import com.ucare.we.model.PlansAndBundlesResponseBody;
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

/* renamed from: dgf  reason: default package */
/* loaded from: classes2.dex */
public class dgf extends dab implements View.OnClickListener, dcv, dhk, dht, dic, dju {
    private static String U = dgf.class.getSimpleName();
    View D;
    int F;
    int G;
    cyq L;
    TextView M;
    SwipeRefreshLayout N;
    cyx O;
    RelativeLayout P;
    Activity S;
    private Button V;
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
    TextView r;
    cwj s;
    Button t;
    CustomLinearLayoutManager u;
    ProgressBar y;
    TabLayout z;
    MainPlanResponseBody f = null;
    boolean h = false;
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
    List<SummarizedLineUsageItem> Q = new ArrayList();
    au.a R = new au.a() { // from class: dgf.1
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgf.this.k();
            dgf.this.m.a();
        }
    };
    au.b<JSONObject> T = new au.b<JSONObject>() { // from class: dgf.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            dgf.this.m.a();
            if (dgf.this.getActivity() != null) {
                dgf.this.g.q(false);
                Gson gson = new Gson();
                ResponseViewMoreBundle responseViewMoreBundle = (ResponseViewMoreBundle) gson.a(jSONObject2.toString(), (Class<Object>) ResponseViewMoreBundle.class);
                if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("0")) {
                    if (responseViewMoreBundle.getBody().size() != 0) {
                        int i = 0;
                        while (true) {
                            if (i >= responseViewMoreBundle.getBody().size()) {
                                break;
                            } else if (responseViewMoreBundle.getBody().get(i).getMain()) {
                                dgf.this.h = true;
                                dgf.this.g.q(true);
                                dgf.this.g.B(gson.a(responseViewMoreBundle.getBody().get(i)));
                                if (!dgf.this.e.f()) {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        dgf.this.p.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (dgf.f(responseViewMoreBundle.getBody().get(i).getRenewalDate())) {
                                        dgf.this.p.setText(djm.a(responseViewMoreBundle.getBody().get(i).getRenewalDate()));
                                    } else {
                                        dgf.this.p.setText("");
                                    }
                                    dgf.this.o.setText(responseViewMoreBundle.getBody().get(i).getOfferEnName());
                                } else {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        dgf.this.p.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (dgf.f(responseViewMoreBundle.getBody().get(i).getRenewalDate())) {
                                        dgf.this.p.setText(responseViewMoreBundle.getBody().get(i).getRenewalDate());
                                    } else {
                                        dgf.this.p.setText("");
                                    }
                                    dgf.this.o.setText(responseViewMoreBundle.getBody().get(i).getOfferArName());
                                }
                                dgf.this.V.setText(dgf.this.getString(R.string.manage_plan));
                            } else {
                                i++;
                            }
                        }
                        if (dgf.this.h) {
                            return;
                        }
                    } else {
                        dgf.this.B = false;
                        return;
                    }
                }
                dgf.this.B = false;
                dgf.this.k();
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

    public dgf() {
        setRetainInstance(true);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.D = layoutInflater.inflate(R.layout.fragment_home_constraint, viewGroup, false);
        this.S = getActivity();
        Button button = (Button) this.D.findViewById(R.id.btn_balance_recharge_main);
        this.j = button;
        if (button != null) {
            button.setOnClickListener(this);
        }
        Button button2 = (Button) this.D.findViewById(R.id.btn_balance_services_main);
        this.t = button2;
        if (button2 != null) {
            button2.setOnClickListener(this);
        }
        this.q = (TextView) this.D.findViewById(R.id.welcome);
        this.r = (TextView) this.D.findViewById(R.id.guest_welcome);
        this.i = (Button) this.D.findViewById(R.id.btn_current_number);
        this.Y = this.D.findViewById(R.id.plan_labels);
        this.o = (TextView) this.D.findViewById(R.id.tv_main_plan_home);
        this.p = (TextView) this.D.findViewById(R.id.tv_main_plan_renewal_date_home);
        this.ad = this.D.findViewById(R.id.user_view);
        this.ae = this.D.findViewById(R.id.user_bottom_view);
        this.Z = this.D.findViewById(R.id.guest_view);
        this.aa = this.D.findViewById(R.id.guest_bottom_view);
        this.V = (Button) this.D.findViewById(R.id.btn_change_plan);
        this.X = (Button) this.D.findViewById(R.id.btn_subscribe);
        this.W = (Button) this.D.findViewById(R.id.btn_extra_bundles);
        this.y = (ProgressBar) this.D.findViewById(R.id.progressBar);
        TabLayout tabLayout = (TabLayout) this.D.findViewById(R.id.tab_layout);
        this.z = tabLayout;
        tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_selector), true);
        this.ab = this.D.findViewById(R.id.subscribe_to_plan);
        this.M = (TextView) this.D.findViewById(R.id.lastModificationDate);
        this.P = (RelativeLayout) this.D.findViewById(R.id.lastModificationDateRelativeLayout);
        this.V.setOnClickListener(this);
        this.X.setOnClickListener(this);
        this.W.setOnClickListener(this);
        this.i.setOnClickListener(this);
        if (!djm.c(this.S).isEmpty()) {
            this.r.setText(djm.c(this.S));
        }
        this.N = (SwipeRefreshLayout) this.D.findViewById(R.id.swipeRefreshLayout);
        if (this.l.a()) {
            this.N.setEnabled(true);
        } else {
            this.N.setEnabled(false);
            this.P.setVisibility(8);
        }
        this.N.setColorSchemeResources(R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary);
        this.N.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: dgf.3
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                dgf.this.l();
            }
        });
        TextView textView = this.M;
        this.S.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        this.D.findViewById(R.id.btn_sign_in).setOnClickListener(this);
        this.D.findViewById(R.id.btn_signup).setOnClickListener(this);
        this.D.findViewById(R.id.btn_live_chat).setOnClickListener(this);
        this.ah = (RecyclerView) this.D.findViewById(R.id.rv_slider);
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
        this.ah.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: dgf.4
            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (dgf.this.w >= 0 && i != 0) {
                    dgf.this.ag.c(dgf.this.w).a = false;
                    dgf.this.ag.notifyDataSetChanged();
                }
                if (i == 0) {
                    dgf.this.x = 1;
                }
                dgf dgfVar = dgf.this;
                dgfVar.v = dgfVar.u.findFirstCompletelyVisibleItemPosition() + 1;
                dgf dgfVar2 = dgf.this;
                dgfVar2.w = dgfVar2.u.findLastCompletelyVisibleItemPosition() - 1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    return;
                }
                if (dgf.this.v == dgf.this.w && dgf.this.w == 1 && dgf.this.x >= dgf.this.w && dgf.this.ag.getItemCount() != 3) {
                    dgf.this.ah.scrollToPosition(dgf.this.ag.getItemCount() - 2);
                    dgf dgfVar = dgf.this;
                    dgfVar.v = dgfVar.ag.getItemCount() - 3;
                    dgf dgfVar2 = dgf.this;
                    dgfVar2.w = dgfVar2.v;
                }
                if (dgf.this.v == dgf.this.w && dgf.this.w == dgf.this.ag.getItemCount() - 2 && dgf.this.x <= dgf.this.w && dgf.this.ag.getItemCount() != 3) {
                    dgf.this.ah.scrollToPosition(1);
                    dgf.this.v = 2;
                    dgf dgfVar3 = dgf.this;
                    dgfVar3.w = dgfVar3.v;
                }
                if (dgf.this.v != dgf.this.w) {
                    return;
                }
                dgf.this.ag.a(dgf.this.v);
                TabLayout.Tab tabAt = dgf.this.z.getTabAt(dgf.this.v - 2);
                if (tabAt != null && !tabAt.isSelected()) {
                    dgf.this.H = false;
                    tabAt.select();
                    dgf dgfVar4 = dgf.this;
                    dgfVar4.E = dgfVar4.v - 2;
                }
                if (dgf.this.x == dgf.this.v) {
                    return;
                }
                dgf dgfVar5 = dgf.this;
                dgfVar5.x = dgfVar5.v;
                dgf dgfVar6 = dgf.this;
                dgfVar6.a(dgfVar6.v, dgf.this.D);
            }
        });
        new LinearSnapHelper() { // from class: dgf.5
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
                    dgf r5 = defpackage.dgf.this
                    djb r5 = r5.e
                    boolean r5 = r5.f()
                    if (r5 != 0) goto L2c
                    goto L29
                L1f:
                    dgf r5 = defpackage.dgf.this
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dgf.AnonymousClass5.findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
            }
        }.attachToRecyclerView(this.ah);
        this.u.setSmoothScrollbarEnabled(true);
        this.z.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: dgf.6
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabUnselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabSelected(TabLayout.Tab tab) {
                if (!dgf.this.H) {
                    dgf.this.H = true;
                    return;
                }
                int i = 0;
                dgf dgfVar = dgf.this;
                dgfVar.F = dgfVar.u.findFirstCompletelyVisibleItemPosition();
                dgf dgfVar2 = dgf.this;
                dgfVar2.G = dgfVar2.u.findLastCompletelyVisibleItemPosition();
                if (dgf.this.E < tab.getPosition()) {
                    i = (tab.getPosition() - dgf.this.E) + dgf.this.G;
                } else if (dgf.this.E > tab.getPosition()) {
                    i = dgf.this.F - (dgf.this.E - tab.getPosition());
                }
                dgf.this.E = tab.getPosition();
                dgf.this.ah.smoothScrollToPosition(i);
                if (i != 0) {
                    return;
                }
                dgf dgfVar3 = dgf.this;
                dgfVar3.a(2, dgfVar3.D);
            }
        });
        this.ag.b();
        return this.D;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void a(int i, View view) {
        boolean z;
        if (view == null) {
            return;
        }
        int b = this.ag.b(i);
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
        if (this.ag.getItemCount() > 3) {
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
            this.s = (cwj) context;
            return;
        }
        throw new RuntimeException(context.toString());
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void l() {
        if (!isAdded()) {
            return;
        }
        b(false);
        this.c.a();
        this.c.d();
        this.g.I();
        try {
            this.m.a(this.ac, getString(R.string.loading));
            djl.a(getActivity()).a(this.g.O(), this.T, this.R);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void b(boolean z) {
        int i = 4;
        int i2 = 0;
        this.q.setVisibility(z ? 4 : 0);
        this.r.setVisibility(z ? 0 : 4);
        Button button = this.i;
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
                this.n.b(getActivity(), BalanceRechargeActivity.class);
                return;
            case R.id.btn_balance_services_main /* 2131362013 */:
                djx.a(getActivity(), BalanceActivity.class, String.valueOf(this.af));
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
        this.N.setRefreshing(false);
        this.af = f;
        this.ag.a(f);
        this.g.a(f);
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
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
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
        djm.a(this.S.getBaseContext());
        this.Q = list;
        TextView textView = this.M;
        this.S.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
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
                        this.J = i + 3;
                    }
                    TabLayout tabLayout3 = this.z;
                    tabLayout3.addTab(tabLayout3.newTab().setIcon(R.drawable.tab_selector), false);
                }
            }
            if (this.A == 1) {
                this.u.setStackFromEnd(true);
                this.ah.smoothScrollToPosition(1);
                this.E = 0;
                this.K = 2;
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
            a(2, this.D);
            this.z.getTabAt(0).select();
            this.E = 0;
            return;
        }
        this.ag.a(this.af);
        a(1, this.D);
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
        this.N.setRefreshing(false);
        this.L = cyqVar;
    }

    @Override // defpackage.dht
    public final void c(String str) {
        this.i.setText(str);
    }

    @Override // defpackage.dht
    public final void a_(int i) {
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
    }

    @Override // defpackage.dht
    public final void b(List<MainPlanResponseBody> list) {
        this.N.setRefreshing(false);
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
            this.Y.setVisibility(4);
            this.ab.setVisibility(0);
            this.V.setVisibility(8);
            this.X.setVisibility(0);
            return;
        }
        this.Y.setVisibility(0);
        this.ab.setVisibility(8);
        this.V.setVisibility(0);
        this.X.setVisibility(8);
    }

    @Override // defpackage.dht
    public final void p_() {
        this.N.setRefreshing(false);
        this.o.setText("");
        this.p.setText("");
        this.f = null;
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
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
        if (this.l.a()) {
            this.k.a(this);
            this.l.a(this);
            this.c.a(this);
            this.g.e(this.l.s);
            this.q.setText(djm.c(this.S) + " " + this.l.s);
            this.i.setText(this.g.m());
            new StringBuilder("test=>").append(getClass().getSimpleName());
            StringBuilder sb = new StringBuilder();
            sb.append(this.g.u());
            sb.append("===");
            l();
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
        if (this.l.a()) {
            this.k.b(this);
            this.l.b(this);
            this.c.b(this);
        }
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        if (!isAdded()) {
            return;
        }
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
        l();
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
        if (!isAdded()) {
            return;
        }
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        if (!isAdded()) {
            return;
        }
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
        b(true);
    }

    @Override // defpackage.dic
    public final void a_(List<PlansAndBundlesResponseBody> list) {
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
    }

    @Override // defpackage.dic
    public final void o_() {
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
    }

    @Override // defpackage.dic
    public final void b_(String str) {
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
        this.m.a();
        FragmentActivity activity = getActivity();
        if (!isAdded() || activity == null) {
            return;
        }
        djx.b(getActivity(), str, SuccessHandlerActivity.class, getString(R.string.plan_renewed));
    }

    @Override // defpackage.dic
    public final void a_(int i, String str) {
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
        this.m.a();
        this.n.a(getActivity(), str, i, ErrorHandlerActivity.class);
    }

    @Override // defpackage.dic
    public final void c_(String str) {
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
    }

    @Override // defpackage.dic
    public final void b_(int i, String str) {
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
    }

    @Override // defpackage.dic
    public final void d_(String str) {
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
    }

    @Override // defpackage.dic
    public final void c(int i, String str) {
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
    }

    @Override // defpackage.dic
    public final void d(String str) {
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
    }

    @Override // defpackage.dic
    public final void d(int i, String str) {
        if (this.l.a()) {
            this.N.setRefreshing(true);
        } else {
            this.N.setRefreshing(false);
        }
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
        this.ac = getActivity();
        if (this.l.a()) {
            this.O = new cyx(getActivity(), this);
            cgw.a(getContext());
            FirebaseInstanceId.a().e().a(new bwh<cmu>() { // from class: dgf.7
                @Override // defpackage.bwh
                public final void onComplete(bwl<cmu> bwlVar) {
                    if (!bwlVar.e()) {
                        return;
                    }
                    String a = bwlVar.b().a();
                    dgf.this.g.t(a);
                    dgf.this.O.a(a, "add");
                }
            });
        }
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
}
