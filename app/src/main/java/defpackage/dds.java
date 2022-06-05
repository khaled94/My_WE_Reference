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
import android.widget.Toast;
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
import com.ucare.we.model.PromiseToPayModel.PromiseToPayResponse;
import com.ucare.we.model.RegionalProducts.RegionalPlansResponse;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.morebundle.MoreBundleActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.presentation.RegionalProducts.RegionalProductsActivity;
import com.ucare.we.presentation.paybillnumbertype.PayBillNumberTypeActivity;
import com.ucare.we.presentation.promisetopayandsalefny.PromiseToPayAndSalefnyActivity;
import com.ucare.we.presentation.switchaccount.SwitchAccountPostPaidActivity;
import defpackage.au;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dds */
/* loaded from: classes2.dex */
public class dds extends dab implements dcv, dhk, dht, dic, die, dju {
    ProgressBar C;
    TabLayout D;
    View G;
    int I;
    int J;
    int N;
    cyq O;
    Activity P;
    SwipeRefreshLayout Q;
    TextView R;
    cyx S;
    LinearLayout T;
    LinearLayout U;
    @Inject
    protected dhp a;
    private Context ak;
    private float al;
    private View am;
    private View an;
    private cxf ao;
    private RecyclerView ap;
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
    private final int ah = 1;
    private final int ai = 2;
    private final int aj = 5;
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
    List<SummarizedLineUsageItem> V = new ArrayList();
    View.OnClickListener W = new View.OnClickListener() { // from class: dds.1
        {
            dds.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dds.this.startActivity(new Intent(dds.this.getActivity(), SwitchAccountPostPaidActivity.class));
        }
    };
    au.b<JSONObject> X = new au.b<JSONObject>() { // from class: dds.9
        {
            dds.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (dds.this.getActivity() != null) {
                dds.this.g.q(false);
                Gson gson = new Gson();
                ResponseViewMoreBundle responseViewMoreBundle = (ResponseViewMoreBundle) gson.a(jSONObject2.toString(), (Class<Object>) ResponseViewMoreBundle.class);
                if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("0")) {
                    if (responseViewMoreBundle.getBody().size() != 0) {
                        int i = 0;
                        while (true) {
                            if (i >= responseViewMoreBundle.getBody().size()) {
                                break;
                            } else if (responseViewMoreBundle.getBody().get(i).getMain()) {
                                dds.this.q = true;
                                dds.this.g.q(true);
                                dds.this.g.B(gson.a(responseViewMoreBundle.getBody().get(i)));
                                if (!dds.this.e.f()) {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        dds.this.o.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (responseViewMoreBundle.getBody().get(i).getRenewalDate() != null) {
                                        dds.this.o.setText(djm.a(responseViewMoreBundle.getBody().get(i).getRenewalDate()));
                                    } else {
                                        dds.this.o.setText("");
                                    }
                                    dds.this.n.setText(responseViewMoreBundle.getBody().get(i).getOfferEnName());
                                } else {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        dds.this.o.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (responseViewMoreBundle.getBody().get(i).getRenewalDate() != null) {
                                        dds.this.o.setText(responseViewMoreBundle.getBody().get(i).getRenewalDate());
                                    } else {
                                        dds.this.o.setText("");
                                    }
                                    dds.this.n.setText(responseViewMoreBundle.getBody().get(i).getOfferArName());
                                }
                            } else {
                                i++;
                            }
                        }
                        if (dds.this.q) {
                            return;
                        }
                    } else {
                        dds.this.L = false;
                        dds.this.k();
                        return;
                    }
                } else if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("1200")) {
                    dds.this.b(2);
                    return;
                }
                dds.this.L = false;
                dds.this.k();
            }
        }
    };
    au.a Y = new au.a() { // from class: dds.10
        {
            dds.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            volleyError.getMessage();
            dds.this.k();
            dds.this.l.a();
        }
    };
    au.b<JSONObject> Z = new au.b<JSONObject>() { // from class: dds.11
        {
            dds.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (dds.this.P.getWindow() != null) {
                dds.this.l.a();
                if (dds.this.getActivity() == null) {
                    return;
                }
                RegionalPlansResponse regionalPlansResponse = (RegionalPlansResponse) new Gson().a(jSONObject2.toString(), (Class<Object>) RegionalPlansResponse.class);
                if (regionalPlansResponse.getHeader().getResponseCode() == null || !regionalPlansResponse.getHeader().getResponseCode().equals("0") || regionalPlansResponse.getBody().size() == 0) {
                    return;
                }
                Intent intent = new Intent(dds.this.getActivity(), RegionalProductsActivity.class);
                intent.putExtra("response", jSONObject2.toString());
                dds.this.startActivity(intent);
                dds.this.g.n(false);
            }
        }
    };
    View.OnClickListener aa = new View.OnClickListener() { // from class: dds.12
        {
            dds.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dds.this.startActivity(new Intent(dds.this.getActivity(), MoreBundleActivity.class));
        }
    };
    View.OnClickListener ab = new View.OnClickListener() { // from class: dds.13
        {
            dds.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dds.this.startActivity(new Intent(dds.this.getActivity(), BillSummaryActivity.class));
        }
    };
    View.OnClickListener ac = new View.OnClickListener() { // from class: dds.14
        {
            dds.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dds.this.L) {
                dds.this.startActivity(new Intent(dds.this.getActivity(), ManagePostPaidPlanActivity.class));
            } else if (dds.this.g.b("en").equalsIgnoreCase("en")) {
                UnNavigateResponseActivity.a(dds.this.getContext(), dds.this.d.f.getMobile_app_main_invalid_en(), dds.this.d.f.getMobile_app_main_invalid_desc_en(), true);
            } else {
                UnNavigateResponseActivity.a(dds.this.getContext(), dds.this.d.f.getMobile_app_main_invalid_ar(), dds.this.d.f.getMobile_app_main_invalid_desc_ar(), true);
            }
        }
    };
    View.OnClickListener ad = new View.OnClickListener() { // from class: dds.15
        {
            dds.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dds.this.startActivity(new Intent(dds.this.getActivity(), PayBillNumberTypeActivity.class));
        }
    };
    au.b<JSONObject> ae = new au.b<JSONObject>() { // from class: dds.16
        {
            dds.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            dds.this.l.a();
            if (dds.this.getActivity() != null) {
                PromiseToPayResponse promiseToPayResponse = (PromiseToPayResponse) new Gson().a(jSONObject2.toString(), (Class<Object>) PromiseToPayResponse.class);
                if (promiseToPayResponse.getHeader().getResponseCode() != null && promiseToPayResponse.getHeader().getResponseCode().equals("0")) {
                    if (promiseToPayResponse.isShowPromiseToPay()) {
                        dds.this.startActivity(new Intent(dds.this.getActivity(), PromiseToPayAndSalefnyActivity.class));
                        dds.this.g.l(false);
                    } else if (!dds.this.g.M()) {
                    } else {
                        try {
                            djl.a(dds.this.getActivity()).c(dds.this.Z, dds.this.ag);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                } else if (!promiseToPayResponse.getHeader().getResponseCode().equals("1200")) {
                } else {
                    dds.this.b(5);
                }
            }
        }
    };
    au.a af = $$Lambda$dds$J4KrVQr4RUp6UujXCfEeLtMEanE.INSTANCE;
    au.a ag = new au.a() { // from class: dds.2
        {
            dds.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            Toast.makeText(dds.this.ak, volleyError.toString(), 0);
            dds.this.l.a();
        }
    };
    private au.b<JSONObject> aq = new au.b<JSONObject>() { // from class: dds.3
        {
            dds.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ProfilePostPaidResponse profilePostPaidResponse = (ProfilePostPaidResponse) new Gson().a(jSONObject.toString(), (Class<Object>) ProfilePostPaidResponse.class);
            if (profilePostPaidResponse != null && profilePostPaidResponse.header.responseCode.equals("0")) {
                if (profilePostPaidResponse.body == null || profilePostPaidResponse.body.customerProfile == null || profilePostPaidResponse.body.customerProfile.customerName == null || !dds.this.isAdded()) {
                    return;
                }
                dds.this.g.e(profilePostPaidResponse.body.customerProfile.customerName);
                dds.this.g.h(profilePostPaidResponse.body.customerProfile.email);
                dds.this.h.setText(profilePostPaidResponse.body.customerProfile.msisdn);
                dds.this.p.setText(djm.c(dds.this.P) + " " + profilePostPaidResponse.body.customerProfile.customerName);
            } else if (profilePostPaidResponse == null || !profilePostPaidResponse.header.responseCode.equals("1200")) {
            } else {
                dds.this.b(1);
            }
        }
    };
    private au.a ar = new au.a() { // from class: -$$Lambda$dds$Bs45TBgFFEQ-79ze7ksRu61kMbE
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dds.m104lambda$Bs45TBgFFEQ79ze7ksRu61kMbE(dds.this, volleyError);
        }
    };

    /* renamed from: lambda$Bs45TBgFFEQ-79ze7ksRu61kMbE */
    public static /* synthetic */ void m104lambda$Bs45TBgFFEQ79ze7ksRu61kMbE(dds ddsVar, VolleyError volleyError) {
        ddsVar.a(volleyError);
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
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

    @Override // defpackage.dht
    public final void p_() {
    }

    @Override // defpackage.dht
    public final void s_() {
    }

    public /* synthetic */ void a(VolleyError volleyError) {
        if (getActivity() != null) {
            Toast.makeText(getActivity(), getActivity().getString(R.string.generic_error), 0).show();
            volleyError.getMessage();
        }
    }

    public dds() {
        setRetainInstance(true);
    }

    public void a(int i, View view) {
        boolean z;
        if (view == null) {
            return;
        }
        int b = this.ao.b(i);
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
        this.p.setText(djm.c(this.P) + " " + this.k.s);
        this.c.d();
        try {
            this.l.a(this.ak, getString(R.string.loading));
            djl.a(getActivity()).a(this.g.O(), this.X, this.Y);
            if (this.g.K() && this.d.f.isFeature_promisetopay()) {
                djl.a(getActivity()).z(this.ae, this.af);
            } else if (this.g.M()) {
                djl.a(getActivity()).c(this.Z, this.ag);
            } else {
                this.l.a();
            }
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
        this.am.setVisibility(z ? 8 : 0);
        View view = this.an;
        if (z) {
            i2 = 8;
        }
        view.setVisibility(i2);
        this.y.a = !z;
        this.ap.setEnabled(!z);
        this.ap.setAlpha(z ? 0.15f : 1.0f);
        if (z) {
            this.ao.a();
        }
    }

    @Override // defpackage.dht
    public final void a(float f) {
        this.ao.a(f);
        a(1, this.G);
        this.g.a(f);
    }

    @Override // defpackage.dht
    public final void r_() {
        this.al = -1.0f;
        this.ao.a(-1.0f);
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
        this.V = list;
        TextView textView = this.R;
        this.P.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        this.Q.setRefreshing(false);
        this.ao.d(-1);
        if (list.size() > 0) {
            this.ao.a(list);
            this.ao.notifyDataSetChanged();
            this.D.removeAllTabs();
            for (int i = 0; i < list.size(); i++) {
                TabLayout tabLayout = this.D;
                tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_selector), false);
            }
            if (this.E == 1) {
                this.y.setStackFromEnd(true);
                this.ap.smoothScrollToPosition(1);
                this.H = 0;
                this.E = 0;
                return;
            }
            this.ao.c(2).a = true;
            this.ao.notifyDataSetChanged();
            int findFirstCompletelyVisibleItemPosition = this.y.findFirstCompletelyVisibleItemPosition();
            this.y.findLastCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition == 0) {
                this.ap.scrollToPosition(3);
            } else {
                this.ap.scrollToPosition(1);
            }
            a(2, this.G);
            this.D.getTabAt(0).select();
            this.H = 0;
            return;
        }
        this.y.a = false;
        this.ap.setEnabled(false);
        this.ap.setAlpha(0.15f);
        this.ao.a();
        ((TextView) this.G.findViewById(R.id.percentage)).setText("");
        this.D.removeAllTabs();
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
        this.O = cyqVar;
        this.Q.setRefreshing(false);
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
    public final void q_() {
        this.Q.setRefreshing(false);
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
            new StringBuilder("test_ActiveUserMobile=>").append(getClass().getSimpleName());
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
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.ak = getActivity();
        this.S = new cyx(getActivity(), this);
        cgw.a(getContext());
        FirebaseInstanceId.a().e().a(new bwh<cmu>() { // from class: dds.4
            {
                dds.this = this;
            }

            @Override // defpackage.bwh
            public final void onComplete(bwl<cmu> bwlVar) {
                if (!bwlVar.e()) {
                    return;
                }
                String a = bwlVar.b().a();
                dds.this.g.t(a);
                dds.this.S.a(a, "add");
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
        View inflate = layoutInflater.inflate(R.layout.fragment_corporate_adslpost_paid_home, viewGroup, false);
        this.G = inflate;
        this.p = (TextView) inflate.findViewById(R.id.welcome);
        this.h = (Button) this.G.findViewById(R.id.btn_current_number);
        this.i = (Button) this.G.findViewById(R.id.btn_balance_recharge_main);
        this.n = (TextView) this.G.findViewById(R.id.txtPlanName);
        this.o = (TextView) this.G.findViewById(R.id.txtRenewalDate);
        this.am = this.G.findViewById(R.id.user_view);
        this.an = this.G.findViewById(R.id.user_bottom_view);
        this.C = (ProgressBar) this.G.findViewById(R.id.progressBar);
        this.D = (TabLayout) this.G.findViewById(R.id.tab_layout);
        this.r = (Button) this.G.findViewById(R.id.btnManagePlan);
        this.s = (Button) this.G.findViewById(R.id.btn_extra_bundles);
        this.t = (Button) this.G.findViewById(R.id.btn_balance_services_main);
        this.R = (TextView) this.G.findViewById(R.id.lastModificationDate);
        this.ap = (RecyclerView) this.G.findViewById(R.id.rv_slider);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(getActivity());
        this.y = customLinearLayoutManager;
        customLinearLayoutManager.setOrientation(0);
        this.ap.setLayoutManager(this.y);
        this.r.setOnClickListener(this.ac);
        this.s.setOnClickListener(this.aa);
        this.t.setAlpha(0.6f);
        this.i.setOnClickListener(this.ad);
        cxf cxfVar = new cxf(this);
        this.ao = cxfVar;
        this.ap.setAdapter(cxfVar);
        this.ap.setHasFixedSize(true);
        this.w = (LinearLayout) this.G.findViewById(R.id.plan_labels);
        this.x = (LinearLayout) this.G.findViewById(R.id.subscribe_to_plan);
        this.h.setOnClickListener(this.W);
        this.T = (LinearLayout) this.G.findViewById(R.id.top_buttons_layout);
        this.U = (LinearLayout) this.G.findViewById(R.id.lower_buttons_layout);
        if (this.a.l().booleanValue()) {
            this.i.setAlpha(1.0f);
            this.i.setClickable(true);
        } else {
            this.i.setAlpha(0.5f);
            this.i.setClickable(false);
        }
        if (this.a.h().booleanValue()) {
            this.t.setAlpha(1.0f);
            this.t.setClickable(true);
        } else {
            this.t.setAlpha(0.3f);
            this.t.setClickable(false);
        }
        if (getArguments() != null) {
            this.E = Integer.parseInt(getArguments().getString("params"));
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.G.findViewById(R.id.swipeRefreshLayout);
        this.Q = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary);
        this.Q.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: dds.5
            {
                dds.this = this;
            }

            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                if (dds.this.k.a()) {
                    dds.this.c.e();
                    dds.this.c.d();
                    dds.this.c.a();
                    return;
                }
                dds.this.b(true);
            }
        });
        this.ap.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: dds.6
            {
                dds.this = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (dds.this.A >= 0 && i != 0) {
                    dds.this.ao.c(dds.this.A).a = false;
                    dds.this.ao.notifyDataSetChanged();
                }
                if (i == 0) {
                    dds.this.B = 1;
                }
                dds ddsVar = dds.this;
                ddsVar.z = ddsVar.y.findFirstCompletelyVisibleItemPosition() + 1;
                dds ddsVar2 = dds.this;
                ddsVar2.A = ddsVar2.y.findLastCompletelyVisibleItemPosition() - 1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    return;
                }
                if (dds.this.z == dds.this.A && dds.this.A == 1 && dds.this.B >= dds.this.A && dds.this.ao.getItemCount() != 3) {
                    dds.this.ap.scrollToPosition(dds.this.ao.getItemCount() - 2);
                    dds ddsVar = dds.this;
                    ddsVar.z = ddsVar.ao.getItemCount() - 3;
                    dds ddsVar2 = dds.this;
                    ddsVar2.A = ddsVar2.z;
                }
                if (dds.this.z == dds.this.A && dds.this.A == dds.this.ao.getItemCount() - 2 && dds.this.B <= dds.this.A && dds.this.ao.getItemCount() != 3) {
                    dds.this.ap.scrollToPosition(1);
                    dds.this.z = 2;
                    dds ddsVar3 = dds.this;
                    ddsVar3.A = ddsVar3.z;
                }
                if (dds.this.z != dds.this.A) {
                    return;
                }
                dds.this.ao.a(dds.this.z);
                TabLayout.Tab tabAt = dds.this.D.getTabAt(dds.this.z - 2);
                if (tabAt != null && !tabAt.isSelected()) {
                    dds.this.K = false;
                    tabAt.select();
                    dds ddsVar4 = dds.this;
                    ddsVar4.H = ddsVar4.z - 2;
                }
                if (dds.this.B == dds.this.z) {
                    return;
                }
                dds ddsVar5 = dds.this;
                ddsVar5.B = ddsVar5.z;
                dds ddsVar6 = dds.this;
                ddsVar6.a(ddsVar6.z, dds.this.G);
            }
        });
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper() { // from class: dds.7
            {
                dds.this = this;
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
                    dds r5 = defpackage.dds.this
                    djb r5 = r5.e
                    boolean r5 = r5.f()
                    if (r5 != 0) goto L2c
                    goto L29
                L1f:
                    dds r5 = defpackage.dds.this
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dds.AnonymousClass7.findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
            }
        };
        linearSnapHelper.attachToRecyclerView(this.ap);
        this.y.setSmoothScrollbarEnabled(true);
        linearSnapHelper.onFling(300, 100);
        this.D.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: dds.8
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabUnselected(TabLayout.Tab tab) {
            }

            {
                dds.this = this;
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabSelected(TabLayout.Tab tab) {
                int i;
                if (!dds.this.K) {
                    dds.this.K = true;
                    return;
                }
                dds ddsVar = dds.this;
                ddsVar.I = ddsVar.y.findFirstCompletelyVisibleItemPosition();
                dds ddsVar2 = dds.this;
                ddsVar2.J = ddsVar2.y.findLastCompletelyVisibleItemPosition();
                int i2 = 0;
                if (dds.this.H < tab.getPosition()) {
                    i = (tab.getPosition() - dds.this.H) + dds.this.J;
                } else {
                    i = dds.this.H > tab.getPosition() ? dds.this.I - (dds.this.H - tab.getPosition()) : 0;
                }
                dds.this.H = tab.getPosition();
                if (i >= 0) {
                    i2 = i;
                }
                dds.this.ap.smoothScrollToPosition(i2);
                if (i2 != 0) {
                    return;
                }
                dds ddsVar3 = dds.this;
                ddsVar3.a(1, ddsVar3.G);
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
            try {
                l();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i == 2) {
            try {
                this.l.a(this.ak, getString(R.string.loading));
                djl.a(getActivity()).a(this.g.O(), this.X, this.Y);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else if (i != 5) {
            if (i != 101) {
                return;
            }
            this.S.a(this.g.H(), "add");
        } else {
            try {
                djl.a(getActivity()).z(this.ae, this.af);
            } catch (JSONException e3) {
                e3.printStackTrace();
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

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        b(true);
        this.Q.setRefreshing(false);
    }
}
