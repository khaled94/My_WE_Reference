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

/* renamed from: dde */
/* loaded from: classes2.dex */
public class dde extends dab implements dcv, dhk, dht, dic, die, dju {
    CustomLinearLayoutManager A;
    ProgressBar E;
    TabLayout F;
    View J;
    int L;
    int M;
    int Q;
    cyq S;
    Activity T;
    SwipeRefreshLayout U;
    TextView V;
    cyx W;
    @Inject
    protected dhp a;
    private Context al;
    private float am;
    private View an;
    private View ao;
    private cxf ap;
    private RecyclerView aq;
    @Inject
    djx c;
    @Inject
    dhu d;
    @Inject
    dhn e;
    @Inject
    djb f;
    @Inject
    djw h;
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
    ddc o;
    TextView p;
    TextView q;
    TextView r;
    Button t;
    Button u;
    Button v;
    LinearLayout y;
    LinearLayout z;
    private final int ai = 1;
    private final int aj = 2;
    private final int ak = 5;
    List<SummarizedLineUsageItem> b = new ArrayList();
    MainPlanResponseBody g = null;
    boolean s = false;
    int w = 2;
    int x = 2;
    int B = 1;
    int C = 1;
    int D = 1;
    int G = 0;
    String H = "";
    boolean I = false;
    int K = 0;
    boolean N = true;
    boolean O = true;
    boolean P = false;
    boolean R = true;
    View.OnClickListener X = new View.OnClickListener() { // from class: dde.1
        {
            dde.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dde.this.startActivity(new Intent(dde.this.getActivity(), SwitchAccountPostPaidActivity.class));
        }
    };
    au.b<JSONObject> Y = new au.b<JSONObject>() { // from class: dde.9
        {
            dde.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (dde.this.T.getWindow() == null || dde.this.getActivity() == null) {
                return;
            }
            dde.this.h.q(false);
            Gson gson = new Gson();
            ResponseViewMoreBundle responseViewMoreBundle = (ResponseViewMoreBundle) gson.a(jSONObject2.toString(), (Class<Object>) ResponseViewMoreBundle.class);
            if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("0")) {
                if (responseViewMoreBundle.getBody().size() != 0) {
                    int i = 0;
                    while (true) {
                        if (i >= responseViewMoreBundle.getBody().size()) {
                            break;
                        } else if (responseViewMoreBundle.getBody().get(i).getMain()) {
                            dde.this.s = true;
                            dde.this.h.q(true);
                            dde.this.h.B(gson.a(responseViewMoreBundle.getBody().get(i)));
                            if (!dde.this.f.f()) {
                                if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                    dde.this.q.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                } else if (responseViewMoreBundle.getBody().get(i).getRenewalDate() != null) {
                                    dde.this.q.setText(djm.a(responseViewMoreBundle.getBody().get(i).getRenewalDate()));
                                } else {
                                    dde.this.q.setText("");
                                }
                                dde.this.p.setText(responseViewMoreBundle.getBody().get(i).getOfferEnName());
                            } else {
                                if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                    dde.this.q.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                } else if (responseViewMoreBundle.getBody().get(i).getRenewalDate() != null) {
                                    dde.this.q.setText(responseViewMoreBundle.getBody().get(i).getRenewalDate());
                                } else {
                                    dde.this.q.setText("");
                                }
                                dde.this.p.setText(responseViewMoreBundle.getBody().get(i).getOfferArName());
                            }
                        } else {
                            i++;
                        }
                    }
                    if (dde.this.s) {
                        return;
                    }
                } else {
                    dde.this.O = false;
                    dde.this.k();
                    return;
                }
            } else if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("1200")) {
                dde.this.b(2);
                return;
            }
            dde.this.O = false;
            dde.this.k();
        }
    };
    au.a Z = new au.a() { // from class: dde.10
        {
            dde.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dde.this.k();
            dde.this.m.a();
        }
    };
    au.b<JSONObject> aa = new au.b<JSONObject>() { // from class: dde.11
        {
            dde.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            if (dde.this.T.getWindow() != null) {
                dde.this.m.a();
                if (dde.this.getActivity() == null) {
                    return;
                }
                RegionalPlansResponse regionalPlansResponse = (RegionalPlansResponse) new Gson().a(jSONObject2.toString(), (Class<Object>) RegionalPlansResponse.class);
                if (regionalPlansResponse.getHeader().getResponseCode() == null || !regionalPlansResponse.getHeader().getResponseCode().equals("0") || regionalPlansResponse.getBody().size() == 0) {
                    return;
                }
                Intent intent = new Intent(dde.this.getActivity(), RegionalProductsActivity.class);
                intent.putExtra("response", jSONObject2.toString());
                dde.this.startActivity(intent);
                dde.this.h.n(false);
            }
        }
    };
    View.OnClickListener ab = new View.OnClickListener() { // from class: -$$Lambda$dde$99EAbbYKrB33SIzKHMRyzKqJglE
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dde.lambda$99EAbbYKrB33SIzKHMRyzKqJglE(dde.this, view);
        }
    };
    View.OnClickListener ac = new View.OnClickListener() { // from class: dde.12
        {
            dde.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dde.this.startActivity(new Intent(dde.this.getActivity(), BillSummaryActivity.class));
        }
    };
    View.OnClickListener ad = new View.OnClickListener() { // from class: dde.13
        {
            dde.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dde.this.O) {
                dde.this.startActivity(new Intent(dde.this.getActivity(), ManagePostPaidPlanActivity.class));
            } else if (dde.this.h.b("en").equalsIgnoreCase("en")) {
                UnNavigateResponseActivity.a(dde.this.getContext(), dde.this.e.f.getMobile_app_main_invalid_en(), dde.this.e.f.getMobile_app_main_invalid_desc_en(), true);
            } else {
                UnNavigateResponseActivity.a(dde.this.getContext(), dde.this.e.f.getMobile_app_main_invalid_ar(), dde.this.e.f.getMobile_app_main_invalid_desc_ar(), true);
            }
        }
    };
    View.OnClickListener ae = new View.OnClickListener() { // from class: dde.14
        {
            dde.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            dde.this.startActivity(new Intent(dde.this.getActivity(), PayBillNumberTypeActivity.class));
        }
    };
    au.b<JSONObject> af = new au.b<JSONObject>() { // from class: dde.15
        {
            dde.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            dde.this.m.a();
            if (dde.this.getActivity() != null) {
                PromiseToPayResponse promiseToPayResponse = (PromiseToPayResponse) new Gson().a(jSONObject2.toString(), (Class<Object>) PromiseToPayResponse.class);
                if (promiseToPayResponse.getHeader().getResponseCode() != null && promiseToPayResponse.getHeader().getResponseCode().equals("0")) {
                    if (promiseToPayResponse.isShowPromiseToPay()) {
                        dde.this.startActivity(new Intent(dde.this.getActivity(), PromiseToPayAndSalefnyActivity.class));
                        dde.this.I = true;
                        dde.this.h.l(false);
                    } else if (!dde.this.h.M()) {
                    } else {
                        try {
                            djl.a(dde.this.getActivity()).c(dde.this.aa, dde.this.ah);
                        } catch (JSONException e) {
                            e.printStackTrace();
                        }
                    }
                } else if (!promiseToPayResponse.getHeader().getResponseCode().equals("1200")) {
                } else {
                    dde.this.b(5);
                }
            }
        }
    };
    au.a ag = new au.a() { // from class: dde.16
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }

        {
            dde.this = this;
        }
    };
    au.a ah = new au.a() { // from class: dde.2
        {
            dde.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            Toast.makeText(dde.this.al, volleyError.toString(), 0);
            dde.this.m.a();
        }
    };
    private au.b<JSONObject> ar = new au.b<JSONObject>() { // from class: dde.3
        {
            dde.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ProfilePostPaidResponse profilePostPaidResponse = (ProfilePostPaidResponse) new Gson().a(jSONObject.toString(), (Class<Object>) ProfilePostPaidResponse.class);
            if (profilePostPaidResponse != null && profilePostPaidResponse.header.responseCode.equals("0")) {
                if (profilePostPaidResponse.body == null || profilePostPaidResponse.body.customerProfile == null || profilePostPaidResponse.body.customerProfile.customerName == null || !dde.this.isAdded()) {
                    return;
                }
                dde.this.h.e(dde.this.l.s);
                dde.this.h.h(profilePostPaidResponse.body.customerProfile.email);
                dde.this.i.setText(dde.this.l.t);
                dde.this.r.setText(djm.c(dde.this.T) + " " + profilePostPaidResponse.body.customerProfile.customerName);
            } else if (profilePostPaidResponse == null || !profilePostPaidResponse.header.responseCode.equals("1200")) {
            } else {
                dde.this.b(1);
            }
        }
    };
    private au.a as = new au.a() { // from class: dde.4
        {
            dde.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            if (dde.this.getActivity() != null) {
                Toast.makeText(dde.this.getActivity(), dde.this.getActivity().getString(R.string.generic_error), 0).show();
            }
        }
    };

    public static /* synthetic */ void lambda$99EAbbYKrB33SIzKHMRyzKqJglE(dde ddeVar, View view) {
        ddeVar.a(view);
    }

    /* renamed from: lambda$ZHy-oIz5zwaQIoZ31TkI0fwKQOQ */
    public static /* synthetic */ void m100lambda$ZHyoIz5zwaQIoZ31TkI0fwKQOQ(dde ddeVar, bwl bwlVar) {
        ddeVar.a(bwlVar);
    }

    public static /* synthetic */ void lambda$gUqF_9tJ3YEbBUVlmjABxPmoQ6c(dde ddeVar, boolean z) {
        ddeVar.b(z);
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

    public /* synthetic */ void a(View view) {
        startActivity(new Intent(getActivity(), MoreBundleActivity.class));
    }

    public dde() {
        setRetainInstance(true);
    }

    public void a(int i, View view) {
        boolean z;
        if (view == null) {
            return;
        }
        int b = this.ap.b(i);
        int i2 = 100;
        if (i == this.Q) {
            b = 100;
        }
        if (b == -1) {
            z = true;
        } else {
            i2 = b;
            z = false;
        }
        ObjectAnimator ofInt = ObjectAnimator.ofInt(this.E, "progress", 0, i2);
        ofInt.setDuration(4000L);
        ofInt.setInterpolator(new DecelerateInterpolator());
        ofInt.start();
        ((TextView) view.findViewById(R.id.percentage)).setVisibility(0);
        ((TextView) view.findViewById(R.id.percentage)).setText(i2 + "%");
        if (this.P && i == this.Q + 1) {
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
        this.d.d();
        try {
            this.m.a(this.al, getString(R.string.loading));
            djl.a(getActivity()).a(this.h.O(), this.Y, this.Z);
            if (this.h.K() && this.e.f.isFeature_promisetopay()) {
                djl.a(getActivity()).z(this.af, this.ag);
            } else if (this.h.M()) {
                djl.a(getActivity()).c(this.aa, this.ah);
            } else {
                this.m.a();
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public void b(boolean z) {
        int i = 4;
        int i2 = 0;
        this.r.setVisibility(z ? 4 : 0);
        Button button = this.i;
        if (!z) {
            i = 0;
        }
        button.setVisibility(i);
        this.an.setVisibility(z ? 8 : 0);
        View view = this.ao;
        if (z) {
            i2 = 8;
        }
        view.setVisibility(i2);
        this.A.a = !z;
        this.aq.setEnabled(!z);
        this.aq.setAlpha(z ? 0.15f : 1.0f);
        if (z) {
            this.ap.a();
        }
    }

    @Override // defpackage.dht
    public final void a(float f) {
        this.ap.a(f);
        a(1, this.J);
        this.h.a(f);
    }

    @Override // defpackage.dht
    public final void r_() {
        this.am = -1.0f;
        this.ap.a(-1.0f);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 105 && i2 == -1) {
            this.k.a(this.g.getServiceId());
            this.m.a(getActivity(), getString(R.string.loading));
        }
    }

    @Override // defpackage.dht
    public final void a(List<SummarizedLineUsageItem> list) {
        this.b = list;
        djm.a(this.T.getBaseContext());
        TextView textView = this.V;
        this.T.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        this.U.setRefreshing(false);
        this.ap.d(-1);
        if (list.size() > 0) {
            this.ap.a(list);
            this.ap.notifyDataSetChanged();
            this.F.removeAllTabs();
            for (int i = 0; i < list.size(); i++) {
                TabLayout tabLayout = this.F;
                tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_selector), false);
            }
            if (this.G == 1) {
                this.A.setStackFromEnd(true);
                this.aq.smoothScrollToPosition(1);
                this.K = 0;
                this.G = 0;
                return;
            }
            this.ap.c(2).a = true;
            this.ap.notifyDataSetChanged();
            int findFirstCompletelyVisibleItemPosition = this.A.findFirstCompletelyVisibleItemPosition();
            this.A.findLastCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition == 0) {
                this.aq.scrollToPosition(3);
            } else {
                this.aq.scrollToPosition(1);
            }
            a(2, this.J);
            this.F.getTabAt(0).select();
            this.K = 0;
            return;
        }
        this.A.a = false;
        this.aq.setEnabled(false);
        this.aq.setAlpha(0.15f);
        this.ap.a();
        ((TextView) this.J.findViewById(R.id.percentage)).setText("");
        this.F.removeAllTabs();
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
        this.S = cyqVar;
        this.U.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void c(String str) {
        this.U.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void a_(int i) {
        this.U.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void q_() {
        this.U.setRefreshing(false);
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
        this.d.a(this);
        if (this.l.a()) {
            this.h.e(this.l.s);
            this.r.setText(djm.c(this.T) + " " + this.l.s);
            this.i.setText(this.h.m());
            new StringBuilder("test=>").append(getClass().getSimpleName());
            this.h.m();
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
        this.al = getActivity();
        this.W = new cyx(getActivity(), this);
        this.o = new ddc(getActivity(), new ddd() { // from class: -$$Lambda$dde$gUqF_9tJ3YEbBUVlmjABxPmoQ6c
            @Override // defpackage.ddd
            public final void showProgress(boolean z) {
                dde.lambda$gUqF_9tJ3YEbBUVlmjABxPmoQ6c(dde.this, z);
            }
        }, this);
        cgw.a(getContext());
        FirebaseInstanceId.a().e().a(new bwh() { // from class: -$$Lambda$dde$ZHy-oIz5zwaQIoZ31TkI0fwKQOQ
            @Override // defpackage.bwh
            public final void onComplete(bwl bwlVar) {
                dde.m100lambda$ZHyoIz5zwaQIoZ31TkI0fwKQOQ(dde.this, bwlVar);
            }
        });
    }

    public /* synthetic */ void a(bwl bwlVar) {
        if (!bwlVar.e()) {
            return;
        }
        String a = ((cmu) bwlVar.b()).a();
        this.h.t(a);
        this.W.a(a, "add");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.k.b(this);
        this.l.b(this);
        this.d.b(this);
        this.F.removeAllTabs();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.k.b(this);
        this.l.b(this);
        this.d.b(this);
        this.F.removeAllTabs();
        djl.a(getActivity()).a();
    }

    @Override // defpackage.die
    public final void a(ProfileInfoResponseBody profileInfoResponseBody) {
        this.U.setRefreshing(false);
        this.h.e(profileInfoResponseBody.getCustomerName());
        this.h.h(profileInfoResponseBody.getEmail());
        this.r.setText(djm.c(this.T) + " " + this.l.s);
    }

    @Override // defpackage.die
    public final void e(int i, String str) {
        this.U.setRefreshing(false);
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
        this.U.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void a_(List<PlansAndBundlesResponseBody> list) {
        this.U.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void o_() {
        this.U.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void b_(String str) {
        this.U.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void a_(int i, String str) {
        this.U.setRefreshing(false);
        this.m.a();
        this.n.a(getActivity(), str, i, ErrorHandlerActivity.class);
    }

    @Override // defpackage.dic
    public final void c_(String str) {
        this.U.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void b_(int i, String str) {
        this.U.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d_(String str) {
        this.U.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void c(int i, String str) {
        this.U.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d(String str) {
        this.U.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d(int i, String str) {
        this.U.setRefreshing(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.T = getActivity();
        View inflate = layoutInflater.inflate(R.layout.fragment_adslpost_paid_home, viewGroup, false);
        this.J = inflate;
        this.r = (TextView) inflate.findViewById(R.id.welcome);
        this.i = (Button) this.J.findViewById(R.id.btn_current_number);
        this.j = (Button) this.J.findViewById(R.id.btn_balance_recharge_main);
        this.p = (TextView) this.J.findViewById(R.id.txtPlanName);
        this.q = (TextView) this.J.findViewById(R.id.txtRenewalDate);
        this.an = this.J.findViewById(R.id.user_view);
        this.ao = this.J.findViewById(R.id.user_bottom_view);
        this.E = (ProgressBar) this.J.findViewById(R.id.progressBar);
        this.F = (TabLayout) this.J.findViewById(R.id.tab_layout);
        this.t = (Button) this.J.findViewById(R.id.btnManagePlan);
        this.u = (Button) this.J.findViewById(R.id.btn_extra_bundles);
        this.v = (Button) this.J.findViewById(R.id.btn_balance_services_main);
        this.V = (TextView) this.J.findViewById(R.id.lastModificationDate);
        this.aq = (RecyclerView) this.J.findViewById(R.id.rv_slider);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(getActivity());
        this.A = customLinearLayoutManager;
        customLinearLayoutManager.setOrientation(0);
        this.aq.setLayoutManager(this.A);
        this.t.setOnClickListener(this.ad);
        this.u.setOnClickListener(this.ab);
        this.v.setOnClickListener(this.ac);
        this.j.setOnClickListener(this.ae);
        cxf cxfVar = new cxf(this);
        this.ap = cxfVar;
        this.aq.setAdapter(cxfVar);
        this.aq.setHasFixedSize(true);
        this.y = (LinearLayout) this.J.findViewById(R.id.plan_labels);
        this.z = (LinearLayout) this.J.findViewById(R.id.subscribe_to_plan);
        this.i.setOnClickListener(this.X);
        if (getArguments() != null) {
            this.G = Integer.parseInt(getArguments().getString("params"));
        }
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.J.findViewById(R.id.swipeRefreshLayout);
        this.U = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary);
        this.U.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: dde.5
            {
                dde.this = this;
            }

            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                if (dde.this.l.a()) {
                    dde.this.d.e();
                    dde.this.d.d();
                    dde.this.d.a();
                    return;
                }
                dde.this.b(true);
            }
        });
        this.aq.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: dde.6
            {
                dde.this = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (dde.this.C >= 0 && i != 0) {
                    dde.this.ap.c(dde.this.C).a = false;
                    dde.this.ap.notifyDataSetChanged();
                }
                if (i == 0) {
                    dde.this.D = 1;
                }
                dde ddeVar = dde.this;
                ddeVar.B = ddeVar.A.findFirstCompletelyVisibleItemPosition() + 1;
                dde ddeVar2 = dde.this;
                ddeVar2.C = ddeVar2.A.findLastCompletelyVisibleItemPosition() - 1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    return;
                }
                if (dde.this.B == dde.this.C && dde.this.C == 1 && dde.this.D >= dde.this.C && dde.this.ap.getItemCount() != 3) {
                    dde.this.aq.scrollToPosition(dde.this.ap.getItemCount() - 2);
                    dde ddeVar = dde.this;
                    ddeVar.B = ddeVar.ap.getItemCount() - 3;
                    dde ddeVar2 = dde.this;
                    ddeVar2.C = ddeVar2.B;
                }
                if (dde.this.B == dde.this.C && dde.this.C == dde.this.ap.getItemCount() - 2 && dde.this.D <= dde.this.C && dde.this.ap.getItemCount() != 3) {
                    dde.this.aq.scrollToPosition(1);
                    dde.this.B = 2;
                    dde ddeVar3 = dde.this;
                    ddeVar3.C = ddeVar3.B;
                }
                if (dde.this.B != dde.this.C) {
                    return;
                }
                dde.this.ap.a(dde.this.B);
                TabLayout.Tab tabAt = dde.this.F.getTabAt(dde.this.B - 2);
                if (tabAt != null && !tabAt.isSelected()) {
                    dde.this.N = false;
                    tabAt.select();
                    dde ddeVar4 = dde.this;
                    ddeVar4.K = ddeVar4.B - 2;
                }
                if (dde.this.D == dde.this.B) {
                    return;
                }
                dde ddeVar5 = dde.this;
                ddeVar5.D = ddeVar5.B;
                dde ddeVar6 = dde.this;
                ddeVar6.a(ddeVar6.B, dde.this.J);
            }
        });
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper() { // from class: dde.7
            {
                dde.this = this;
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
                    dde r5 = defpackage.dde.this
                    djb r5 = r5.f
                    boolean r5 = r5.f()
                    if (r5 != 0) goto L2c
                    goto L29
                L1f:
                    dde r5 = defpackage.dde.this
                    djb r5 = r5.f
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.dde.AnonymousClass7.findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
            }
        };
        linearSnapHelper.attachToRecyclerView(this.aq);
        this.A.setSmoothScrollbarEnabled(true);
        linearSnapHelper.onFling(300, 100);
        this.F.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: dde.8
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabUnselected(TabLayout.Tab tab) {
            }

            {
                dde.this = this;
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabSelected(TabLayout.Tab tab) {
                int i;
                if (!dde.this.N) {
                    dde.this.N = true;
                    return;
                }
                dde ddeVar = dde.this;
                ddeVar.L = ddeVar.A.findFirstCompletelyVisibleItemPosition();
                dde ddeVar2 = dde.this;
                ddeVar2.M = ddeVar2.A.findLastCompletelyVisibleItemPosition();
                int i2 = 0;
                if (dde.this.K < tab.getPosition()) {
                    i = (tab.getPosition() - dde.this.K) + dde.this.M;
                } else {
                    i = dde.this.K > tab.getPosition() ? dde.this.L - (dde.this.K - tab.getPosition()) : 0;
                }
                dde.this.K = tab.getPosition();
                if (i >= 0) {
                    i2 = i;
                }
                dde.this.aq.smoothScrollToPosition(i2);
                if (i2 != 0) {
                    return;
                }
                dde ddeVar3 = dde.this;
                ddeVar3.a(1, ddeVar3.J);
            }
        });
        return this.J;
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
                this.m.a(this.al, getString(R.string.loading));
                djl.a(getActivity()).a(this.h.O(), this.Y, this.Z);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        } else if (i != 5) {
            if (i != 101) {
                return;
            }
            this.W.a(this.h.H(), "add");
        } else {
            try {
                djl.a(getActivity()).z(this.af, this.ag);
            } catch (JSONException e3) {
                e3.printStackTrace();
            }
        }
    }

    public final void k() {
        if (this.h.b("en").equalsIgnoreCase("en")) {
            this.q.setText(this.e.f.getMobile_app_main_invalid_date_en());
            this.p.setText(this.e.f.getMobile_app_main_invalid_en());
            return;
        }
        this.q.setText(this.e.f.getMobile_app_main_invalid_date_ar());
        this.p.setText(this.e.f.getMobile_app_main_invalid_ar());
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        b(true);
        this.U.setRefreshing(false);
    }
}
