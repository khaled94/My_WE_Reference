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
import com.ucare.we.model.ProfileInfoResponseBody;
import com.ucare.we.model.ProfilePostPaidResponse;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.morebundle.FCMMSISDNPicker.FMCMSISDNPickerActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.presentation.paybillnumbertype.PayBillNumberTypeActivity;
import com.ucare.we.presentation.switchaccount.SwitchAccountPostPaidActivity;
import defpackage.au;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dfs */
/* loaded from: classes2.dex */
public class dfs extends dab implements dcv, dhk, dht, dic, die, dju {
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
    View.OnClickListener U = new View.OnClickListener() { // from class: dfs.1
        {
            dfs.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfs.this.startActivity(new Intent(dfs.this.getActivity(), SwitchAccountPostPaidActivity.class));
        }
    };
    au.b<JSONObject> V = new au.b<JSONObject>() { // from class: dfs.6
        {
            dfs.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            dfs.this.l.a();
            if (dfs.this.getActivity() != null) {
                dfs.this.g.q(false);
                Gson gson = new Gson();
                ResponseViewMoreBundle responseViewMoreBundle = (ResponseViewMoreBundle) gson.a(jSONObject2.toString(), (Class<Object>) ResponseViewMoreBundle.class);
                if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("0")) {
                    if (responseViewMoreBundle.getBody().size() != 0) {
                        int i = 0;
                        while (true) {
                            if (i >= responseViewMoreBundle.getBody().size()) {
                                break;
                            } else if (responseViewMoreBundle.getBody().get(i).getMain()) {
                                dfs.this.q = true;
                                dfs.this.g.q(true);
                                dfs.this.g.B(gson.a(responseViewMoreBundle.getBody().get(i)));
                                if (!dfs.this.e.f()) {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        dfs.this.o.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (responseViewMoreBundle.getBody().get(i).getRenewalDate() != null) {
                                        dfs.this.o.setText(djm.a(responseViewMoreBundle.getBody().get(i).getRenewalDate()));
                                    } else {
                                        dfs.this.o.setText("");
                                    }
                                    dfs.this.n.setText(responseViewMoreBundle.getBody().get(i).getOfferEnName());
                                } else {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        dfs.this.o.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (responseViewMoreBundle.getBody().get(i).getRenewalDate() != null) {
                                        dfs.this.o.setText(responseViewMoreBundle.getBody().get(i).getRenewalDate());
                                    } else {
                                        dfs.this.o.setText("");
                                    }
                                    dfs.this.n.setText(responseViewMoreBundle.getBody().get(i).getOfferArName());
                                }
                            } else {
                                i++;
                            }
                        }
                        if (dfs.this.q) {
                            return;
                        }
                    } else {
                        dfs.this.L = false;
                        dfs.this.k();
                        return;
                    }
                } else if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("1200")) {
                    dfs.this.b(2);
                    return;
                }
                dfs.this.L = false;
                dfs.this.k();
            }
        }
    };
    au.a W = new au.a() { // from class: dfs.7
        {
            dfs.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dfs.this.k();
            dfs.this.l.a();
        }
    };
    View.OnClickListener X = new View.OnClickListener() { // from class: dfs.8
        {
            dfs.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfs.this.startActivity(new Intent(dfs.this.getActivity(), FMCMSISDNPickerActivity.class));
        }
    };
    View.OnClickListener Y = new View.OnClickListener() { // from class: dfs.9
        {
            dfs.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfs.this.startActivity(new Intent(dfs.this.getActivity(), BillSummaryActivity.class));
        }
    };
    View.OnClickListener Z = new View.OnClickListener() { // from class: dfs.10
        {
            dfs.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dfs.this.L) {
                dfs.this.startActivity(new Intent(dfs.this.getActivity(), ManagePostPaidPlanActivity.class));
            } else if (dfs.this.g.b("en").equalsIgnoreCase("en")) {
                UnNavigateResponseActivity.a(dfs.this.getContext(), dfs.this.d.f.getMobile_app_main_invalid_en(), dfs.this.d.f.getMobile_app_main_invalid_desc_en(), true);
            } else {
                UnNavigateResponseActivity.a(dfs.this.getContext(), dfs.this.d.f.getMobile_app_main_invalid_ar(), dfs.this.d.f.getMobile_app_main_invalid_desc_ar(), true);
            }
        }
    };
    View.OnClickListener aa = new View.OnClickListener() { // from class: dfs.11
        {
            dfs.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dfs.this.startActivity(new Intent(dfs.this.getActivity(), PayBillNumberTypeActivity.class));
        }
    };
    private au.b<JSONObject> aj = new au.b<JSONObject>() { // from class: dfs.12
        {
            dfs.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ProfilePostPaidResponse profilePostPaidResponse = (ProfilePostPaidResponse) new Gson().a(jSONObject.toString(), (Class<Object>) ProfilePostPaidResponse.class);
            if (profilePostPaidResponse != null && profilePostPaidResponse.header.responseCode.equals("0")) {
                if (profilePostPaidResponse.body == null || profilePostPaidResponse.body.customerProfile == null || profilePostPaidResponse.body.customerProfile.customerName == null || !dfs.this.isAdded()) {
                    return;
                }
                dfs.this.g.e(profilePostPaidResponse.body.customerProfile.customerName);
                dfs.this.g.h(profilePostPaidResponse.body.customerProfile.email);
                dfs.this.h.setText(profilePostPaidResponse.body.customerProfile.msisdn);
                dfs.this.p.setText(djm.c(dfs.this.P) + " " + profilePostPaidResponse.body.customerProfile.customerName);
            } else if (profilePostPaidResponse == null || !profilePostPaidResponse.header.responseCode.equals("1200")) {
            } else {
                dfs.this.b(1);
            }
        }
    };
    private au.a ak = new au.a() { // from class: dfs.13
        {
            dfs.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dfs.this.getActivity();
        }
    };

    /* renamed from: lambda$2D518TxPic-x9uUTp1z9FwbsUbE */
    public static /* synthetic */ void m110lambda$2D518TxPicx9uUTp1z9FwbsUbE(dfs dfsVar, bwl bwlVar) {
        dfsVar.a(bwlVar);
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

    public dfs() {
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

    public void l() {
        if (!isAdded()) {
            return;
        }
        b(false);
        this.p.setText(djm.c(this.P) + " " + this.k.s);
        this.h.setText(this.k.t);
        this.c.d();
        try {
            this.l.a(getActivity(), getString(R.string.loading));
            djl.a(getActivity()).a(this.g.O(), this.V, this.W);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void b(boolean z) {
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
            this.g.A("");
            l();
            this.g.e(this.k.s);
            this.p.setText(djm.c(this.P) + " " + this.k.s);
            this.h.setText(this.g.m());
            new StringBuilder("test=>").append(getClass().getSimpleName());
            this.g.m();
            return;
        }
        b(true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.ad = getActivity();
        this.R = new cyx(getActivity(), this);
        cgw.a(getContext());
        FirebaseInstanceId.a().e().a(new bwh() { // from class: -$$Lambda$dfs$2D518TxPic-x9uUTp1z9FwbsUbE
            @Override // defpackage.bwh
            public final void onComplete(bwl bwlVar) {
                dfs.m110lambda$2D518TxPicx9uUTp1z9FwbsUbE(dfs.this, bwlVar);
            }
        });
    }

    public /* synthetic */ void a(bwl bwlVar) {
        if (!bwlVar.e()) {
            return;
        }
        String a = ((cmu) bwlVar.b()).a();
        this.g.t(a);
        this.R.a(a, "add");
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

    @Override // defpackage.die
    public final void a(ProfileInfoResponseBody profileInfoResponseBody) {
        this.Q.setRefreshing(false);
        this.g.e(profileInfoResponseBody.getCustomerName());
        this.g.h(profileInfoResponseBody.getEmail());
        this.p.setText(djm.c(this.P) + " " + profileInfoResponseBody.getCustomerName());
        this.h.setText(profileInfoResponseBody.getMsisdn());
    }

    @Override // defpackage.die
    public final void e(int i, String str) {
        this.Q.setRefreshing(false);
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        if (!isAdded()) {
            return;
        }
        this.Q.setRefreshing(false);
        l();
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
        View inflate = layoutInflater.inflate(R.layout.fragment_fmchome, viewGroup, false);
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
        this.Q.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: dfs.2
            {
                dfs.this = this;
            }

            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                if (dfs.this.k.a()) {
                    dfs.this.l();
                    dfs.this.c.d();
                    dfs.this.c.a();
                    return;
                }
                dfs.this.b(true);
            }
        });
        this.ai.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: dfs.3
            {
                dfs.this = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (dfs.this.A >= 0 && i != 0) {
                    dfs.this.ah.c(dfs.this.A).a = false;
                    dfs.this.ah.notifyDataSetChanged();
                }
                if (i == 0) {
                    dfs.this.B = 1;
                }
                dfs dfsVar = dfs.this;
                dfsVar.z = dfsVar.y.findFirstCompletelyVisibleItemPosition() + 1;
                dfs dfsVar2 = dfs.this;
                dfsVar2.A = dfsVar2.y.findLastCompletelyVisibleItemPosition() - 1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    return;
                }
                if (dfs.this.z == dfs.this.A && dfs.this.A == 1 && dfs.this.B >= dfs.this.A && dfs.this.ah.getItemCount() != 3) {
                    dfs.this.ai.scrollToPosition(dfs.this.ah.getItemCount() - 2);
                    dfs dfsVar = dfs.this;
                    dfsVar.z = dfsVar.ah.getItemCount() - 3;
                    dfs dfsVar2 = dfs.this;
                    dfsVar2.A = dfsVar2.z;
                }
                if (dfs.this.z == dfs.this.A && dfs.this.A == dfs.this.ah.getItemCount() - 2 && dfs.this.B <= dfs.this.A && dfs.this.ah.getItemCount() != 3) {
                    dfs.this.ai.scrollToPosition(1);
                    dfs.this.z = 2;
                    dfs dfsVar3 = dfs.this;
                    dfsVar3.A = dfsVar3.z;
                }
                if (dfs.this.z != dfs.this.A) {
                    return;
                }
                dfs.this.ah.a(dfs.this.z);
                TabLayout.Tab tabAt = dfs.this.D.getTabAt(dfs.this.z - 2);
                if (tabAt != null && !tabAt.isSelected()) {
                    dfs.this.K = false;
                    tabAt.select();
                    dfs dfsVar4 = dfs.this;
                    dfsVar4.H = dfsVar4.z - 2;
                }
                if (dfs.this.B == dfs.this.z) {
                    return;
                }
                dfs dfsVar5 = dfs.this;
                dfsVar5.B = dfsVar5.z;
                dfs dfsVar6 = dfs.this;
                dfsVar6.a(dfsVar6.z, dfs.this.G);
            }
        });
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper() { // from class: dfs.4
            {
                dfs.this = this;
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
                    dfs r5 = defpackage.dfs.this
                    djb r5 = r5.e
                    boolean r5 = r5.f()
                    if (r5 != 0) goto L2c
                    goto L29
                L1f:
                    dfs r5 = defpackage.dfs.this
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dfs.AnonymousClass4.findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
            }
        };
        linearSnapHelper.attachToRecyclerView(this.ai);
        this.y.setSmoothScrollbarEnabled(true);
        linearSnapHelper.onFling(300, 100);
        this.D.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: dfs.5
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabUnselected(TabLayout.Tab tab) {
            }

            {
                dfs.this = this;
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabSelected(TabLayout.Tab tab) {
                int i;
                if (!dfs.this.K) {
                    dfs.this.K = true;
                    return;
                }
                dfs dfsVar = dfs.this;
                dfsVar.I = dfsVar.y.findFirstCompletelyVisibleItemPosition();
                dfs dfsVar2 = dfs.this;
                dfsVar2.J = dfsVar2.y.findLastCompletelyVisibleItemPosition();
                int i2 = 0;
                if (dfs.this.H < tab.getPosition()) {
                    i = (tab.getPosition() - dfs.this.H) + dfs.this.J;
                } else {
                    i = dfs.this.H > tab.getPosition() ? dfs.this.I - (dfs.this.H - tab.getPosition()) : 0;
                }
                dfs.this.H = tab.getPosition();
                if (i >= 0) {
                    i2 = i;
                }
                dfs.this.ai.smoothScrollToPosition(i2);
                if (i2 != 0) {
                    return;
                }
                dfs dfsVar3 = dfs.this;
                dfsVar3.a(1, dfsVar3.G);
            }
        });
        return this.G;
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(getContext(), this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            l();
        } else if (i != 2) {
            if (i != 101) {
                return;
            }
            this.R.a(this.g.H(), "add");
        } else {
            try {
                this.l.a(getActivity(), getString(R.string.loading));
                djl.a(getActivity()).a(this.g.O(), this.V, this.W);
            } catch (JSONException e) {
                e.printStackTrace();
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
