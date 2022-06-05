package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.animation.DecelerateInterpolator;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ProgressBar;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.volley.VolleyError;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.gson.Gson;
import com.ucare.we.ErrorHandlerActivity;
import com.ucare.we.R;
import com.ucare.we.adapters.CustomLinearLayoutManager;
import com.ucare.we.billsummary.BillSummaryActivity;
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
import com.ucare.we.presentation.paybillnumbertype.PayBillNumberTypeActivity;
import com.ucare.we.presentation.switchaccount.SwitchAccountPostPaidActivity;
import defpackage.au;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dge */
/* loaded from: classes2.dex */
public class dge extends dab implements dcv, dhk, dht, dic, dju {
    ProgressBar C;
    TabLayout D;
    View G;
    int I;
    int J;
    int N;
    cyq O;
    Activity P;
    SwipeRefreshLayout Q;
    cyx R;
    TextView S;
    @Inject
    protected dhp a;
    private Context ad;
    private float ae;
    private View af;
    private View ag;
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
    TextView n;
    TextView o;
    TextView p;
    Button r;
    Button s;
    Button t;
    LinearLayout w;
    LinearLayout x;
    CustomLinearLayoutManager y;
    private final int ab = 1;
    private final int ac = 2;
    MainPlanResponseBody f = null;
    boolean q = false;
    int u = 2;
    int v = 2;
    int z = 1;
    int A = 1;
    int B = 1;
    int E = 0;
    String F = "";
    int H = 0;
    boolean K = true;
    boolean L = true;
    boolean M = false;
    List<SummarizedLineUsageItem> T = new ArrayList();
    View.OnClickListener U = new View.OnClickListener() { // from class: dge.1
        {
            dge.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dge.this.startActivity(new Intent(dge.this.getActivity(), SwitchAccountPostPaidActivity.class));
        }
    };
    au.b<JSONObject> V = new au.b<JSONObject>() { // from class: dge.2
        {
            dge.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            dge.this.l.a();
            if (dge.this.getActivity() != null) {
                dge.this.g.q(false);
                Gson gson = new Gson();
                ResponseViewMoreBundle responseViewMoreBundle = (ResponseViewMoreBundle) gson.a(jSONObject2.toString(), (Class<Object>) ResponseViewMoreBundle.class);
                if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("0")) {
                    if (responseViewMoreBundle.getBody().size() != 0) {
                        int i = 0;
                        while (true) {
                            if (i >= responseViewMoreBundle.getBody().size()) {
                                break;
                            } else if (responseViewMoreBundle.getBody().get(i).getMain()) {
                                dge.this.q = true;
                                dge.this.g.q(true);
                                dge.this.g.B(gson.a(responseViewMoreBundle.getBody().get(i)));
                                if (!dge.this.e.f()) {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        dge.this.o.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (responseViewMoreBundle.getBody().get(i).getRenewalDate() != null) {
                                        dge.this.o.setText(djm.a(responseViewMoreBundle.getBody().get(i).getRenewalDate()));
                                    } else {
                                        dge.this.o.setText("");
                                    }
                                    dge.this.n.setText(responseViewMoreBundle.getBody().get(i).getOfferEnName());
                                } else {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        dge.this.o.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (responseViewMoreBundle.getBody().get(i).getRenewalDate() != null) {
                                        dge.this.o.setText(responseViewMoreBundle.getBody().get(i).getRenewalDate());
                                    } else {
                                        dge.this.o.setText("");
                                    }
                                    dge.this.n.setText(responseViewMoreBundle.getBody().get(i).getOfferArName());
                                }
                            } else {
                                i++;
                            }
                        }
                        if (dge.this.q) {
                            return;
                        }
                    } else {
                        dge.this.L = false;
                        dge.this.k();
                        return;
                    }
                } else if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("1200")) {
                    dge.this.b(2);
                    return;
                }
                dge.this.L = false;
                dge.this.k();
            }
        }
    };
    au.a W = new au.a() { // from class: dge.3
        {
            dge.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dge.this.k();
            dge.this.l.a();
        }
    };
    View.OnClickListener X = new View.OnClickListener() { // from class: -$$Lambda$dge$gLLUviIsKK3vxT-hyf8gV5RX7qw
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dge.m115lambda$gLLUviIsKK3vxThyf8gV5RX7qw(dge.this, view);
        }
    };
    View.OnClickListener Y = new View.OnClickListener() { // from class: -$$Lambda$dge$p1xpH0vQcfvDNWRDb_XZYqepfP8
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dge.lambda$p1xpH0vQcfvDNWRDb_XZYqepfP8(dge.this, view);
        }
    };
    View.OnClickListener Z = new View.OnClickListener() { // from class: dge.4
        {
            dge.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dge.this.L) {
                dge.this.startActivity(new Intent(dge.this.getActivity(), ManagePostPaidPlanActivity.class));
            } else if (dge.this.g.b("en").equalsIgnoreCase("en")) {
                UnNavigateResponseActivity.a(dge.this.getContext(), dge.this.d.f.getMobile_app_main_invalid_en(), dge.this.d.f.getMobile_app_main_invalid_desc_en(), true);
            } else {
                UnNavigateResponseActivity.a(dge.this.getContext(), dge.this.d.f.getMobile_app_main_invalid_ar(), dge.this.d.f.getMobile_app_main_invalid_desc_ar(), true);
            }
        }
    };
    View.OnClickListener aa = new View.OnClickListener() { // from class: -$$Lambda$dge$QzP8xWZvUVmRjgdd0qSE1FmrMnA
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dge.lambda$QzP8xWZvUVmRjgdd0qSE1FmrMnA(dge.this, view);
        }
    };

    public static /* synthetic */ void lambda$QzP8xWZvUVmRjgdd0qSE1FmrMnA(dge dgeVar, View view) {
        dgeVar.a(view);
    }

    /* renamed from: lambda$gLLUviIsKK3vxT-hyf8gV5RX7qw */
    public static /* synthetic */ void m115lambda$gLLUviIsKK3vxThyf8gV5RX7qw(dge dgeVar, View view) {
        dgeVar.c(view);
    }

    public static /* synthetic */ void lambda$mvDm9pDpenBWDg2rRFYcm24aMMs(dge dgeVar) {
        dgeVar.m();
    }

    public static /* synthetic */ void lambda$p1xpH0vQcfvDNWRDb_XZYqepfP8(dge dgeVar, View view) {
        dgeVar.b(view);
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

    public /* synthetic */ void c(View view) {
        startActivity(new Intent(getActivity(), MoreBundleActivity.class));
    }

    public /* synthetic */ void b(View view) {
        startActivity(new Intent(getActivity(), BillSummaryActivity.class));
    }

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(getActivity(), PayBillNumberTypeActivity.class));
    }

    public dge() {
        setRetainInstance(true);
    }

    public void a(int i, View view) {
        boolean z;
        if (view == null) {
            return;
        }
        int b = this.ah.b(i);
        int i2 = 100;
        if (i == this.N) {
            b = 100;
        }
        if (b == -1) {
            z = true;
        } else {
            i2 = b;
            z = false;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.C, "progress", 0, i2);
        ofInt.setDuration(4000L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
        ((TextView) view.findViewById(R.id.percentage)).setVisibility(0);
        ((TextView) view.findViewById(R.id.percentage)).setText(i2 + "%");
        if (this.M && i == this.N + 1) {
            ((TextView) view.findViewById(R.id.percentage)).setVisibility(4);
        }
        if (z) {
            ((TextView) view.findViewById(R.id.percentage)).setVisibility(4);
        } else {
            ((TextView) view.findViewById(R.id.percentage)).setVisibility(0);
        }
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    private void l() throws JSONException {
        if (!isAdded()) {
            return;
        }
        b(false);
        this.c.d();
        try {
            this.l.a(this.ad, getString(R.string.loading));
            djl.a(getActivity()).a(this.g.O(), this.V, this.W);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void b(boolean z) {
        int i = 4;
        int i2 = 0;
        this.p.setVisibility(z ? 4 : 0);
        Button button = this.h;
        if (!z) {
            i = 0;
        }
        button.setVisibility(i);
        this.af.setVisibility(z ? 8 : 0);
        View view = this.ag;
        if (z) {
            i2 = 8;
        }
        view.setVisibility(i2);
        this.y.a = !z;
        this.ai.setEnabled(!z);
        this.ai.setAlpha(z ? 0.15f : 1.0f);
        if (z) {
            this.ah.a();
        }
    }

    @Override // defpackage.dht
    public final void a(float f) {
        this.Q.setRefreshing(false);
        this.ah.a(f);
        a(1, this.G);
        this.g.a(f);
    }

    @Override // defpackage.dht
    public final void r_() {
        this.Q.setRefreshing(false);
        this.ae = -1.0f;
        this.ah.a(-1.0f);
    }

    @Override // defpackage.dht
    public final void b(String str) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void s_() {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void b(int i, String str) {
        this.Q.setRefreshing(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 105 && i2 == -1) {
            this.j.a(this.f.getServiceId());
            this.l.a(getActivity(), getString(R.string.loading));
        }
    }

    @Override // defpackage.dht
    public final void a(List<SummarizedLineUsageItem> list) {
        djm.a(this.P.getBaseContext());
        this.T = list;
        TextView textView = this.S;
        this.P.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        this.Q.setRefreshing(false);
        this.ah.d(-1);
        if (list.size() > 0) {
            this.ah.a(list);
            this.ah.notifyDataSetChanged();
            this.D.removeAllTabs();
            for (int i = 0; i < list.size(); i++) {
                TabLayout tabLayout = this.D;
                tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_selector), false);
            }
            if (this.E == 1) {
                this.y.setStackFromEnd(true);
                this.ai.smoothScrollToPosition(1);
                this.H = 0;
                this.E = 0;
                return;
            }
            this.ah.c(2).a = true;
            this.ah.notifyDataSetChanged();
            int findFirstCompletelyVisibleItemPosition = this.y.findFirstCompletelyVisibleItemPosition();
            this.y.findLastCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition == 0) {
                this.ai.scrollToPosition(3);
            } else {
                this.ai.scrollToPosition(1);
            }
            a(2, this.G);
            this.D.getTabAt(0).select();
            this.H = 0;
            return;
        }
        this.y.a = false;
        this.ai.setEnabled(false);
        this.ai.setAlpha(0.15f);
        this.ah.a();
        ((TextView) this.G.findViewById(R.id.percentage)).setText("");
        this.D.removeAllTabs();
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
        this.Q.setRefreshing(false);
        this.O = cyqVar;
    }

    @Override // defpackage.dht
    public final void c(String str) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void a_(int i) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void b(List<MainPlanResponseBody> list) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void p_() {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void q_() {
        this.Q.setRefreshing(false);
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
            this.g.e(this.k.s);
            this.p.setText(djm.c(this.P) + " " + this.k.s);
            this.h.setText(this.g.m());
            new StringBuilder("test=>").append(getClass().getSimpleName());
            this.g.m();
            try {
                l();
                return;
            } catch (JSONException e) {
                e.printStackTrace();
                return;
            }
        }
        b(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.ad = getActivity();
        this.R = new cyx(getActivity(), this);
        cgw.a(getContext());
        FirebaseInstanceId.a().e().a(new bwh<cmu>() { // from class: dge.5
            {
                dge.this = this;
            }

            @Override // defpackage.bwh
            public final void onComplete(bwl<cmu> bwlVar) {
                if (!bwlVar.e()) {
                    return;
                }
                String a = bwlVar.b().a();
                dge.this.g.t(a);
                dge.this.R.a(a, "add");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.j.b(this);
        this.k.b(this);
        this.c.b(this);
        this.D.removeAllTabs();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.j.b(this);
        this.k.b(this);
        this.c.b(this);
        this.D.removeAllTabs();
        djl.a(getActivity()).a();
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        if (!isAdded()) {
            return;
        }
        this.Q.setRefreshing(false);
        try {
            l();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
        if (!isAdded()) {
            return;
        }
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        this.Q.setRefreshing(false);
        b(true);
    }

    @Override // defpackage.dic
    public final void a_(List<PlansAndBundlesResponseBody> list) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void o_() {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void b_(String str) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void a_(int i, String str) {
        this.Q.setRefreshing(false);
        this.l.a();
        this.m.a(getActivity(), str, i, ErrorHandlerActivity.class);
    }

    @Override // defpackage.dic
    public final void c_(String str) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void b_(int i, String str) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d_(String str) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void c(int i, String str) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d(String str) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d(int i, String str) {
        this.Q.setRefreshing(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.P = getActivity();
        View inflate = layoutInflater.inflate(R.layout.fragment_post_paid_home_constraint, viewGroup, false);
        this.G = inflate;
        this.p = (TextView) inflate.findViewById(R.id.welcome);
        this.h = (Button) this.G.findViewById(R.id.btn_current_number);
        this.i = (Button) this.G.findViewById(R.id.btn_balance_recharge_main);
        this.n = (TextView) this.G.findViewById(R.id.txtPlanName);
        this.o = (TextView) this.G.findViewById(R.id.txtRenewalDate);
        this.af = this.G.findViewById(R.id.user_view);
        this.ag = this.G.findViewById(R.id.user_bottom_view);
        this.C = (ProgressBar) this.G.findViewById(R.id.progressBar);
        this.D = (TabLayout) this.G.findViewById(R.id.tab_layout);
        this.r = (Button) this.G.findViewById(R.id.btnManagePlan);
        this.s = (Button) this.G.findViewById(R.id.btn_extra_bundles);
        this.t = (Button) this.G.findViewById(R.id.btn_balance_services_main);
        this.S = (TextView) this.G.findViewById(R.id.lastModificationDate);
        this.ai = (RecyclerView) this.G.findViewById(R.id.rv_slider);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(getActivity());
        this.y = customLinearLayoutManager;
        customLinearLayoutManager.setOrientation(0);
        this.ai.setLayoutManager(this.y);
        this.r.setOnClickListener(this.Z);
        this.s.setOnClickListener(this.X);
        this.t.setOnClickListener(this.Y);
        this.i.setOnClickListener(this.aa);
        cxf cxfVar = new cxf(this);
        this.ah = cxfVar;
        this.ai.setAdapter(cxfVar);
        this.ai.setHasFixedSize(true);
        this.w = (LinearLayout) this.G.findViewById(R.id.plan_labels);
        this.x = (LinearLayout) this.G.findViewById(R.id.subscribe_to_plan);
        this.h.setOnClickListener(this.U);
        if (getArguments() != null) {
            this.E = Integer.parseInt(getArguments().getString("params"));
        }
        TextView textView = this.S;
        this.P.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.G.findViewById(R.id.swipeRefreshLayout);
        this.Q = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary);
        this.Q.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: -$$Lambda$dge$mvDm9pDpenBWDg2rRFYcm24aMMs
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                dge.lambda$mvDm9pDpenBWDg2rRFYcm24aMMs(dge.this);
            }
        });
        this.ai.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: dge.6
            {
                dge.this = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (dge.this.A >= 0 && i != 0) {
                    dge.this.ah.c(dge.this.A).a = false;
                    dge.this.ah.notifyDataSetChanged();
                }
                if (i == 0) {
                    dge.this.B = 1;
                }
                dge dgeVar = dge.this;
                dgeVar.z = dgeVar.y.findFirstCompletelyVisibleItemPosition() + 1;
                dge dgeVar2 = dge.this;
                dgeVar2.A = dgeVar2.y.findLastCompletelyVisibleItemPosition() - 1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    return;
                }
                if (dge.this.z == dge.this.A && dge.this.A == 1 && dge.this.B >= dge.this.A && dge.this.ah.getItemCount() != 3) {
                    dge.this.ai.scrollToPosition(dge.this.ah.getItemCount() - 2);
                    dge dgeVar = dge.this;
                    dgeVar.z = dgeVar.ah.getItemCount() - 3;
                    dge dgeVar2 = dge.this;
                    dgeVar2.A = dgeVar2.z;
                }
                if (dge.this.z == dge.this.A && dge.this.A == dge.this.ah.getItemCount() - 2 && dge.this.B <= dge.this.A && dge.this.ah.getItemCount() != 3) {
                    dge.this.ai.scrollToPosition(1);
                    dge.this.z = 2;
                    dge dgeVar3 = dge.this;
                    dgeVar3.A = dgeVar3.z;
                }
                if (dge.this.z != dge.this.A) {
                    return;
                }
                dge.this.ah.a(dge.this.z);
                TabLayout.Tab tabAt = dge.this.D.getTabAt(dge.this.z - 2);
                if (tabAt != null && !tabAt.isSelected()) {
                    dge.this.K = false;
                    tabAt.select();
                    dge dgeVar4 = dge.this;
                    dgeVar4.H = dgeVar4.z - 2;
                }
                if (dge.this.B == dge.this.z) {
                    return;
                }
                dge dgeVar5 = dge.this;
                dgeVar5.B = dgeVar5.z;
                dge dgeVar6 = dge.this;
                dgeVar6.a(dgeVar6.z, dge.this.G);
            }
        });
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper() { // from class: dge.7
            {
                dge.this = this;
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
                    dge r5 = defpackage.dge.this
                    djb r5 = r5.e
                    boolean r5 = r5.f()
                    if (r5 != 0) goto L2c
                    goto L29
                L1f:
                    dge r5 = defpackage.dge.this
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dge.AnonymousClass7.findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
            }
        };
        linearSnapHelper.attachToRecyclerView(this.ai);
        this.y.setSmoothScrollbarEnabled(true);
        linearSnapHelper.onFling(300, 100);
        this.D.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: dge.8
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabUnselected(TabLayout.Tab tab) {
            }

            {
                dge.this = this;
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabSelected(TabLayout.Tab tab) {
                int i;
                if (!dge.this.K) {
                    dge.this.K = true;
                    return;
                }
                dge dgeVar = dge.this;
                dgeVar.I = dgeVar.y.findFirstCompletelyVisibleItemPosition();
                dge dgeVar2 = dge.this;
                dgeVar2.J = dgeVar2.y.findLastCompletelyVisibleItemPosition();
                int i2 = 0;
                if (dge.this.H < tab.getPosition()) {
                    i = (tab.getPosition() - dge.this.H) + dge.this.J;
                } else {
                    i = dge.this.H > tab.getPosition() ? dge.this.I - (dge.this.H - tab.getPosition()) : 0;
                }
                dge.this.H = tab.getPosition();
                if (i >= 0) {
                    i2 = i;
                }
                dge.this.ai.smoothScrollToPosition(i2);
                if (i2 != 0) {
                    return;
                }
                dge dgeVar3 = dge.this;
                dgeVar3.a(1, dgeVar3.G);
            }
        });
        return this.G;
    }

    public /* synthetic */ void m() {
        if (this.k.a()) {
            this.c.d();
            this.c.a();
            return;
        }
        b(true);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(getContext(), this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            try {
                l();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i != 2) {
            if (i != 101) {
                return;
            }
            this.R.a(this.g.H(), "add");
        } else {
            try {
                this.l.a(this.ad, getString(R.string.loading));
                djl.a(getActivity()).a(this.g.O(), this.V, this.W);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public final void k() {
        if (this.g.b("en").equalsIgnoreCase("en")) {
            this.o.setText(this.d.f.getMobile_app_main_invalid_date_en());
            this.n.setText(this.d.f.getMobile_app_main_invalid_en());
            return;
        }
        this.o.setText(this.d.f.getMobile_app_main_invalid_date_ar());
        this.n.setText(this.d.f.getMobile_app_main_invalid_ar());
    }
}
