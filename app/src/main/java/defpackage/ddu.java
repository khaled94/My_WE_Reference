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

/* renamed from: ddu */
/* loaded from: classes2.dex */
public class ddu extends dab implements dcv, dhk, dht, dic, die, dju {
    ProgressBar C;
    TabLayout D;
    View H;
    int J;
    int K;
    int N;
    Activity O;
    cyq P;
    TextView Q;
    SwipeRefreshLayout R;
    cyx S;
    LinearLayout T;
    LinearLayout U;
    @Inject
    protected dhp a;
    private Context ah;
    private float ai;
    private View aj;
    private View ak;
    private cxf al;
    private RecyclerView am;
    @Inject
    djx b;
    @Inject
    dhu c;
    @Inject
    djb d;
    @Inject
    djw f;
    Button g;
    Button h;
    @Inject
    did i;
    @Inject
    dio j;
    @Inject
    djg k;
    @Inject
    djx l;
    @Inject
    dhn m;
    TextView o;
    TextView p;
    TextView q;
    Button r;
    Button s;
    Button t;
    LinearLayout w;
    LinearLayout x;
    CustomLinearLayoutManager y;
    private final int af = 1;
    private final int ag = 2;
    MainPlanResponseBody e = null;
    boolean n = false;
    int u = 2;
    int v = 2;
    int z = 1;
    int A = 1;
    int B = 1;
    int E = 0;
    String F = "";
    boolean G = true;
    int I = 0;
    boolean L = true;
    boolean M = false;
    List<SummarizedLineUsageItem> V = new ArrayList();
    View.OnClickListener W = new View.OnClickListener() { // from class: ddu.1
        {
            ddu.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ddu.this.startActivity(new Intent(ddu.this.getActivity(), SwitchAccountPostPaidActivity.class));
        }
    };
    au.b<JSONObject> X = new au.b<JSONObject>() { // from class: ddu.4
        {
            ddu.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            ddu.this.k.a();
            if (ddu.this.getActivity() != null) {
                ddu.this.f.q(false);
                Gson gson = new Gson();
                ResponseViewMoreBundle responseViewMoreBundle = (ResponseViewMoreBundle) gson.a(jSONObject2.toString(), (Class<Object>) ResponseViewMoreBundle.class);
                if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("0")) {
                    if (responseViewMoreBundle.getBody().size() != 0) {
                        int i = 0;
                        while (true) {
                            if (i >= responseViewMoreBundle.getBody().size()) {
                                break;
                            } else if (responseViewMoreBundle.getBody().get(i).getMain()) {
                                ddu.this.n = true;
                                ddu.this.f.q(true);
                                ddu.this.f.B(gson.a(responseViewMoreBundle.getBody().get(i)));
                                if (!ddu.this.d.f()) {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        ddu.this.p.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (ddu.f(responseViewMoreBundle.getBody().get(i).getRenewalDate())) {
                                        ddu.this.p.setText(djm.a(responseViewMoreBundle.getBody().get(i).getRenewalDate()));
                                    } else {
                                        ddu.this.p.setText("");
                                    }
                                    ddu.this.o.setText(responseViewMoreBundle.getBody().get(i).getOfferEnName());
                                } else {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        ddu.this.p.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (ddu.f(responseViewMoreBundle.getBody().get(i).getRenewalDate())) {
                                        ddu.this.p.setText(responseViewMoreBundle.getBody().get(i).getRenewalDate());
                                    } else {
                                        ddu.this.p.setText("");
                                    }
                                    ddu.this.o.setText(responseViewMoreBundle.getBody().get(i).getOfferArName());
                                }
                                ddu.this.r.setText(ddu.this.getString(R.string.manage_plan));
                            } else {
                                i++;
                            }
                        }
                        if (ddu.this.n) {
                            return;
                        }
                    } else {
                        ddu.this.G = false;
                        ddu.this.k();
                        return;
                    }
                } else if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("1200")) {
                    ddu.this.b(2);
                    return;
                }
                ddu.this.G = false;
                ddu.this.k();
            }
        }
    };
    au.a Y = new au.a() { // from class: ddu.5
        {
            ddu.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ddu.this.k();
            ddu.this.k.a();
        }
    };
    View.OnClickListener Z = new View.OnClickListener() { // from class: -$$Lambda$ddu$S8DOh2uOXZXmfoZgHdUwGPZ2nt8
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ddu.lambda$S8DOh2uOXZXmfoZgHdUwGPZ2nt8(ddu.this, view);
        }
    };
    View.OnClickListener aa = new View.OnClickListener() { // from class: ddu.6
        {
            ddu.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ddu.this.startActivity(new Intent(ddu.this.getActivity(), BillSummaryActivity.class));
        }
    };
    View.OnClickListener ab = new View.OnClickListener() { // from class: ddu.7
        {
            ddu.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (ddu.this.G) {
                ddu.this.startActivity(new Intent(ddu.this.getActivity(), ManagePostPaidPlanActivity.class));
            } else if (ddu.this.f.b("en").equalsIgnoreCase("en")) {
                UnNavigateResponseActivity.a(ddu.this.getContext(), ddu.this.m.f.getMobile_app_main_invalid_en(), ddu.this.m.f.getMobile_app_main_invalid_desc_en(), true);
            } else {
                UnNavigateResponseActivity.a(ddu.this.getContext(), ddu.this.m.f.getMobile_app_main_invalid_ar(), ddu.this.m.f.getMobile_app_main_invalid_desc_ar(), true);
            }
        }
    };
    View.OnClickListener ac = new View.OnClickListener() { // from class: -$$Lambda$ddu$40DTXwJkojR0TkuO_3RnVq1iV1Q
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ddu.lambda$40DTXwJkojR0TkuO_3RnVq1iV1Q(ddu.this, view);
        }
    };
    View.OnClickListener ad = new View.OnClickListener() { // from class: ddu.8
        {
            ddu.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (ddu.this.d.f()) {
                if (ddu.this.m.f == null) {
                    ddu.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://te.eg/wps/portal/te/Personal?1dmy&urile=wcm%3apath%3a%2Fte%2Fhelp%2Ffaq%2Ffaq")));
                    return;
                }
                ddu.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ddu.this.m.f.getFaqAr())));
            } else if (ddu.this.m.f == null) {
                ddu.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse("https://te.eg/wps/portal/te/Personal?1dmy&urile=wcm%3apath%3a%2Fte%2Fhelp%2Ffaq%2Ffaq")));
            } else {
                ddu.this.startActivity(new Intent("android.intent.action.VIEW", Uri.parse(ddu.this.m.f.getFaqEn())));
            }
        }
    };
    View.OnClickListener ae = new View.OnClickListener() { // from class: ddu.9
        {
            ddu.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            String liveChat = ddu.this.m.f == null ? "https://www.livehelpnow.net/lhn/lcv.aspx?d=0&ms=&zzwindow=0&lhnid=20584&custom1=&custom2=&custom3=" : ddu.this.m.f.getLiveChat();
            Intent intent = new Intent("android.intent.action.VIEW");
            intent.setData(Uri.parse(liveChat));
            ddu.this.startActivity(intent);
        }
    };

    public static /* synthetic */ void lambda$40DTXwJkojR0TkuO_3RnVq1iV1Q(ddu dduVar, View view) {
        dduVar.a(view);
    }

    public static /* synthetic */ void lambda$S8DOh2uOXZXmfoZgHdUwGPZ2nt8(ddu dduVar, View view) {
        dduVar.b(view);
    }

    public static /* synthetic */ void lambda$ywavmevBjX2bEfB7eRYGS3au8iU(ddu dduVar) {
        dduVar.m();
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

    public /* synthetic */ void b(View view) {
        startActivity(new Intent(getActivity(), MoreBundleActivity.class));
    }

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(getActivity(), PayBillNumberTypeActivity.class));
    }

    public ddu() {
        setRetainInstance(true);
    }

    public void a(int i, View view) {
        boolean z;
        if (view == null) {
            return;
        }
        int b = this.al.b(i);
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
        this.f.e(this.j.s);
        this.q.setText(djm.c(this.O) + " " + this.j.s);
        this.g.setText(this.f.m());
        this.c.d();
        try {
            this.k.a(this.ah, getString(R.string.loading));
            djl.a(getActivity()).a(this.f.O(), this.X, this.Y);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void b(boolean z) {
        int i = 4;
        int i2 = 0;
        this.q.setVisibility(z ? 4 : 0);
        Button button = this.g;
        if (!z) {
            i = 0;
        }
        button.setVisibility(i);
        this.aj.setVisibility(z ? 8 : 0);
        View view = this.ak;
        if (z) {
            i2 = 8;
        }
        view.setVisibility(i2);
        this.y.a = !z;
        this.am.setEnabled(!z);
        this.am.setAlpha(z ? 0.15f : 1.0f);
        if (z) {
            this.al.a();
        }
    }

    @Override // defpackage.dht
    public final void a(float f) {
        this.R.setRefreshing(false);
        this.al.a(f);
        a(1, this.H);
        this.f.a(f);
    }

    @Override // defpackage.dht
    public final void r_() {
        this.R.setRefreshing(false);
        this.ai = -1.0f;
        this.al.a(-1.0f);
    }

    @Override // defpackage.dht
    public final void b(String str) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void s_() {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void b(int i, String str) {
        this.R.setRefreshing(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 105 && i2 == -1) {
            this.i.a(this.e.getServiceId());
            this.k.a(getActivity(), getString(R.string.loading));
        }
    }

    @Override // defpackage.dht
    public final void a(List<SummarizedLineUsageItem> list) {
        djm.a(this.O.getBaseContext());
        TextView textView = this.Q;
        this.O.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        this.R.setRefreshing(false);
        this.V = list;
        this.al.d(-1);
        if (list.size() > 0) {
            this.al.a(list);
            this.al.notifyDataSetChanged();
            this.D.removeAllTabs();
            for (int i = 0; i < list.size(); i++) {
                TabLayout tabLayout = this.D;
                tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_selector), false);
            }
            if (this.E == 1) {
                this.y.setStackFromEnd(true);
                this.am.smoothScrollToPosition(1);
                this.I = 0;
                this.E = 0;
                return;
            }
            this.al.c(2).a = true;
            this.al.notifyDataSetChanged();
            int findFirstCompletelyVisibleItemPosition = this.y.findFirstCompletelyVisibleItemPosition();
            this.y.findLastCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition == 0) {
                this.am.scrollToPosition(3);
            } else {
                this.am.scrollToPosition(1);
            }
            a(2, this.H);
            this.D.getTabAt(0).select();
            this.I = 0;
            return;
        }
        this.y.a = false;
        this.am.setEnabled(false);
        this.am.setAlpha(0.15f);
        this.al.a();
        ((TextView) this.H.findViewById(R.id.percentage)).setText("");
        this.D.removeAllTabs();
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
        this.P = cyqVar;
    }

    @Override // defpackage.dht
    public final void c(String str) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void a_(int i) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void b(List<MainPlanResponseBody> list) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void p_() {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void q_() {
        this.R.setRefreshing(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.i.a(this);
        this.j.a(this);
        this.c.a(this);
        if (this.j.a()) {
            this.q.setText(djm.c(this.O) + " " + this.j.s);
            this.g.setText(this.f.m());
            new StringBuilder("test=>").append(getClass().getSimpleName());
            this.f.m();
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
        this.ah = getActivity();
        this.S = new cyx(getActivity(), this);
        cgw.a(getContext());
        FirebaseInstanceId.a().e().a(new bwh<cmu>() { // from class: ddu.10
            {
                ddu.this = this;
            }

            @Override // defpackage.bwh
            public final void onComplete(bwl<cmu> bwlVar) {
                if (!bwlVar.e()) {
                    return;
                }
                String a = bwlVar.b().a();
                ddu.this.f.t(a);
                ddu.this.S.a(a, "add");
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.i.b(this);
        this.j.b(this);
        this.c.b(this);
        this.D.removeAllTabs();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.i.b(this);
        this.j.b(this);
        this.c.b(this);
        this.D.removeAllTabs();
        djl.a(getActivity()).a();
    }

    @Override // defpackage.die
    public final void a(ProfileInfoResponseBody profileInfoResponseBody) {
        this.R.setRefreshing(false);
        this.f.e(profileInfoResponseBody.getCustomerName());
        this.f.h(profileInfoResponseBody.getEmail());
        this.q.setText(djm.c(this.O) + " " + profileInfoResponseBody.getCustomerName());
        this.g.setText(profileInfoResponseBody.getMsisdn());
    }

    @Override // defpackage.die
    public final void e(int i, String str) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        if (!isAdded()) {
            return;
        }
        this.R.setRefreshing(false);
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
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void a_(List<PlansAndBundlesResponseBody> list) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void o_() {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void b_(String str) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void a_(int i, String str) {
        this.R.setRefreshing(false);
        this.k.a();
        this.l.a(getActivity(), str, i, ErrorHandlerActivity.class);
    }

    @Override // defpackage.dic
    public final void c_(String str) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void b_(int i, String str) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d_(String str) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void c(int i, String str) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d(String str) {
        this.R.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d(int i, String str) {
        this.R.setRefreshing(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.H = layoutInflater.inflate(R.layout.fragment_corporate_postpaid, viewGroup, false);
        this.O = getActivity();
        this.q = (TextView) this.H.findViewById(R.id.welcome);
        this.g = (Button) this.H.findViewById(R.id.btn_current_number);
        this.h = (Button) this.H.findViewById(R.id.btn_balance_recharge_main);
        this.o = (TextView) this.H.findViewById(R.id.txtPlanName);
        this.p = (TextView) this.H.findViewById(R.id.txtRenewalDate);
        this.aj = this.H.findViewById(R.id.user_view);
        this.ak = this.H.findViewById(R.id.user_bottom_view);
        this.C = (ProgressBar) this.H.findViewById(R.id.progressBar);
        this.D = (TabLayout) this.H.findViewById(R.id.tab_layout);
        this.r = (Button) this.H.findViewById(R.id.btnManagePlan);
        this.s = (Button) this.H.findViewById(R.id.btn_extra_bundles);
        this.t = (Button) this.H.findViewById(R.id.btn_balance_services_main);
        this.am = (RecyclerView) this.H.findViewById(R.id.rv_slider);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(getActivity());
        this.y = customLinearLayoutManager;
        customLinearLayoutManager.setOrientation(0);
        this.am.setLayoutManager(this.y);
        this.r.setOnClickListener(this.ab);
        this.Q = (TextView) this.H.findViewById(R.id.lastModificationDate);
        this.s.setOnClickListener(this.Z);
        this.t.setAlpha(0.6f);
        this.h.setOnClickListener(this.ac);
        if (this.a.l().booleanValue()) {
            this.h.setClickable(true);
            this.h.setAlpha(1.0f);
        } else {
            this.h.setClickable(false);
            this.h.setAlpha(0.5f);
        }
        if (this.a.h().booleanValue()) {
            this.t.setAlpha(1.0f);
            this.t.setClickable(true);
        } else {
            this.t.setAlpha(0.3f);
            this.t.setClickable(false);
        }
        cxf cxfVar = new cxf(this);
        this.al = cxfVar;
        this.am.setAdapter(cxfVar);
        this.am.setHasFixedSize(true);
        this.w = (LinearLayout) this.H.findViewById(R.id.plan_labels);
        this.x = (LinearLayout) this.H.findViewById(R.id.subscribe_to_plan);
        this.T = (LinearLayout) this.H.findViewById(R.id.top_buttons_layout);
        this.U = (LinearLayout) this.H.findViewById(R.id.lower_buttons_layout);
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.H.findViewById(R.id.swipeRefreshLayout);
        this.R = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary);
        this.R.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: -$$Lambda$ddu$ywavmevBjX2bEfB7eRYGS3au8iU
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                ddu.lambda$ywavmevBjX2bEfB7eRYGS3au8iU(ddu.this);
            }
        });
        TextView textView = this.Q;
        this.O.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        this.t.setEnabled(false);
        this.g.setOnClickListener(this.W);
        if (getArguments() != null) {
            this.E = Integer.parseInt(getArguments().getString("params"));
        }
        this.am.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: ddu.11
            {
                ddu.this = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (ddu.this.A >= 0 && i != 0) {
                    ddu.this.al.c(ddu.this.A).a = false;
                    ddu.this.al.notifyDataSetChanged();
                }
                if (i == 0) {
                    ddu.this.B = 1;
                }
                ddu dduVar = ddu.this;
                dduVar.z = dduVar.y.findFirstCompletelyVisibleItemPosition() + 1;
                ddu dduVar2 = ddu.this;
                dduVar2.A = dduVar2.y.findLastCompletelyVisibleItemPosition() - 1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    return;
                }
                if (ddu.this.z == ddu.this.A && ddu.this.A == 1 && ddu.this.B >= ddu.this.A && ddu.this.al.getItemCount() != 3) {
                    ddu.this.am.scrollToPosition(ddu.this.al.getItemCount() - 2);
                    ddu dduVar = ddu.this;
                    dduVar.z = dduVar.al.getItemCount() - 3;
                    ddu dduVar2 = ddu.this;
                    dduVar2.A = dduVar2.z;
                }
                if (ddu.this.z == ddu.this.A && ddu.this.A == ddu.this.al.getItemCount() - 2 && ddu.this.B <= ddu.this.A && ddu.this.al.getItemCount() != 3) {
                    ddu.this.am.scrollToPosition(1);
                    ddu.this.z = 2;
                    ddu dduVar3 = ddu.this;
                    dduVar3.A = dduVar3.z;
                }
                if (ddu.this.z != ddu.this.A) {
                    return;
                }
                ddu.this.al.a(ddu.this.z);
                TabLayout.Tab tabAt = ddu.this.D.getTabAt(ddu.this.z - 2);
                if (tabAt != null && !tabAt.isSelected()) {
                    ddu.this.L = false;
                    tabAt.select();
                    ddu dduVar4 = ddu.this;
                    dduVar4.I = dduVar4.z - 2;
                }
                if (ddu.this.B == ddu.this.z) {
                    return;
                }
                ddu dduVar5 = ddu.this;
                dduVar5.B = dduVar5.z;
                ddu dduVar6 = ddu.this;
                dduVar6.a(dduVar6.z, ddu.this.H);
            }
        });
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper() { // from class: ddu.2
            {
                ddu.this = this;
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
                    ddu r5 = defpackage.ddu.this
                    djb r5 = r5.d
                    boolean r5 = r5.f()
                    if (r5 != 0) goto L2c
                    goto L29
                L1f:
                    ddu r5 = defpackage.ddu.this
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.ddu.AnonymousClass2.findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
            }
        };
        linearSnapHelper.attachToRecyclerView(this.am);
        this.y.setSmoothScrollbarEnabled(true);
        linearSnapHelper.onFling(300, 100);
        this.D.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: ddu.3
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabUnselected(TabLayout.Tab tab) {
            }

            {
                ddu.this = this;
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabSelected(TabLayout.Tab tab) {
                int i;
                if (!ddu.this.L) {
                    ddu.this.L = true;
                    return;
                }
                ddu dduVar = ddu.this;
                dduVar.J = dduVar.y.findFirstCompletelyVisibleItemPosition();
                ddu dduVar2 = ddu.this;
                dduVar2.K = dduVar2.y.findLastCompletelyVisibleItemPosition();
                int i2 = 0;
                if (ddu.this.I < tab.getPosition()) {
                    i = (tab.getPosition() - ddu.this.I) + ddu.this.K;
                } else {
                    i = ddu.this.I > tab.getPosition() ? ddu.this.J - (ddu.this.I - tab.getPosition()) : 0;
                }
                ddu.this.I = tab.getPosition();
                if (i >= 0) {
                    i2 = i;
                }
                ddu.this.am.smoothScrollToPosition(i2);
                if (i2 != 0) {
                    return;
                }
                ddu dduVar3 = ddu.this;
                dduVar3.a(1, dduVar3.H);
            }
        });
        return this.H;
    }

    public /* synthetic */ void m() {
        this.c.e();
        this.c.d();
        this.c.a();
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
            this.S.a(this.f.H(), "add");
        } else {
            try {
                this.k.a(this.ah, getString(R.string.loading));
                djl.a(getActivity()).a(this.f.O(), this.X, this.Y);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    public static boolean f(String str) {
        return str != null && !str.isEmpty() && !str.equals("");
    }

    public final void k() {
        if (this.f.b("en").equalsIgnoreCase("en")) {
            this.p.setText(this.m.f.getMobile_app_main_invalid_date_en());
            this.o.setText(this.m.f.getMobile_app_main_invalid_en());
            return;
        }
        this.p.setText(this.m.f.getMobile_app_main_invalid_date_ar());
        this.o.setText(this.m.f.getMobile_app_main_invalid_ar());
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        b(true);
    }
}
