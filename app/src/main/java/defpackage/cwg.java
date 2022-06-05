package defpackage;

import android.animation.ObjectAnimator;
import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.BlurMaskFilter;
import android.graphics.Paint;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.util.Pair;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewTreeObserver;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.constraintlayout.motion.widget.MotionLayout;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.content.ContextCompat;
import androidx.core.view.GravityCompat;
import androidx.core.widget.NestedScrollView;
import androidx.lifecycle.Observer;
import androidx.recyclerview.widget.LinearSnapHelper;
import androidx.recyclerview.widget.RecyclerView;
import androidx.swiperefreshlayout.widget.SwipeRefreshLayout;
import com.android.volley.VolleyError;
import com.google.android.material.appbar.AppBarLayout;
import com.google.android.material.appbar.CollapsingToolbarLayout;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.tabs.TabLayout;
import com.google.firebase.iid.FirebaseInstanceId;
import com.google.gson.Gson;
import com.ucare.we.BalanceActivity;
import com.ucare.we.BalanceRechargeActivity;
import com.ucare.we.ErrorHandlerActivity;
import com.ucare.we.R;
import com.ucare.we.UsageDetailsScreenActivity;
import com.ucare.we.WebViewActivity;
import com.ucare.we.adapters.CustomLinearLayoutManager;
import com.ucare.we.adslbalanceservices.ADSLBalanceServicesActivity;
import com.ucare.we.billsummary.BillSummaryActivity;
import com.ucare.we.manageplanspostpaid.ManagePostPaidPlanActivity;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.MoreBundleModel.ResponseViewMoreBundle;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import com.ucare.we.model.PostPaidBalanceResponse;
import com.ucare.we.model.ProfileInfoResponseBody;
import com.ucare.we.model.ProfilePostPaidResponse;
import com.ucare.we.model.PromiseToPayModel.PromiseToPayResponse;
import com.ucare.we.model.RegionalProducts.RegionalPlansResponse;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.remote.pushnotification.NotificationCount;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.morebundle.FCMMSISDNPicker.FMCMSISDNPickerActivity;
import com.ucare.we.morebundle.MoreBundleActivity;
import com.ucare.we.newHome.features.HomeActivity;
import com.ucare.we.paybillautheduser.PayBillForUserActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.presentation.RegionalProducts.RegionalProductsActivity;
import com.ucare.we.presentation.family.groupConsumptionSharedDetails.GroupDetailsActivity;
import com.ucare.we.presentation.paybillnumbertype.PayBillNumberTypeActivity;
import com.ucare.we.presentation.promisetopayandsalefny.PromiseToPayAndSalefnyActivity;
import com.ucare.we.presentation.search.SearchActivity;
import com.ucare.we.presentation.switchaccount.SwitchAccountPostPaidActivity;
import com.ucare.we.presentation.wepay.WePayActivity;
import com.ucare.we.view.CircularProgressView;
import com.ucare.we.view.MyAppBarLayout;
import defpackage.au;
import defpackage.djd;
import defpackage.o;
import defpackage.p;
import defpackage.q;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cwg */
/* loaded from: classes2.dex */
public class cwg extends dab implements View.OnClickListener, AppBarLayout.OnOffsetChangedListener, cwk, cwq, dcv, dfx, dhk, dht, dic, die, dju {
    TextView A;
    TextView B;
    TextView C;
    TextView D;
    TextView E;
    TextView F;
    TextView G;
    TextView H;
    TextView I;
    ImageView J;
    ImageView K;
    RelativeLayout L;
    RelativeLayout M;
    ConstraintLayout N;
    ImageView P;
    ImageView Q;
    ImageView R;
    ImageView S;
    ImageView T;
    ImageView U;
    ImageView V;
    LinearLayoutCompat W;
    LinearLayoutCompat X;
    LinearLayoutCompat Y;
    LinearLayoutCompat Z;
    int aB;
    int aC;
    int aG;
    cyq aH;
    Activity aI;
    TextView aJ;
    SwipeRefreshLayout aK;
    cyx aL;
    TextView aM;
    TextView aN;
    MotionLayout aP;
    NestedScrollView aQ;
    MyAppBarLayout aR;
    CollapsingToolbarLayout aS;
    LinearLayoutCompat aT;
    FloatingActionButton aU;
    LinearLayoutCompat aa;
    LinearLayoutCompat ab;
    LinearLayoutCompat ac;
    LinearLayoutCompat ad;
    LinearLayoutCompat ae;
    FrameLayout af;
    FrameLayout ag;
    LinearLayoutCompat ah;
    LinearLayoutCompat ai;
    ConstraintLayout aj;
    NestedScrollView ak;
    LinearLayoutCompat an;
    LinearLayoutCompat ao;
    LinearLayoutCompat ap;
    RelativeLayout aq;
    CustomLinearLayoutManager ar;
    CircularProgressView av;
    TabLayout aw;
    View az;
    @Inject
    protected dhp b;
    private View bA;
    private View bB;
    private cxa bC;
    private RecyclerView bD;
    private ResponseViewMoreBundle bE;
    boolean bc;
    SummarizedLineUsageItem bj;
    private Context by;
    private float bz;
    @Inject
    dfw c;
    @Inject
    djx d;
    @Inject
    djx e;
    @Inject
    dhu f;
    @Inject
    dhn g;
    @Inject
    djb h;
    Long j;
    @Inject
    djw l;
    LinearLayoutCompat m;
    LinearLayoutCompat n;
    TextView o;
    ImageView p;
    @Inject
    did q;
    @Inject
    dio r;
    @Inject
    djg s;
    LinearLayoutCompat u;
    TextView v;
    TextView w;
    TextView x;
    TextView y;
    TextView z;
    private final int bl = 1;
    private final int bm = 2;
    private final int bn = 5;
    private final int bo = 8;
    private final String bp = "FREE_UNIT_USAGE";
    private final String bq = "MAIN_PLAN";
    private final String br = "OUTSTANDING_AMOUNT";
    private final String bs = "BALANCE";
    private final au.a bt = new au.a() { // from class: cwg.1
        {
            cwg.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cwg.this.getActivity();
        }
    };
    public dje<Pair<String, Boolean>> a = new dje<>();
    private final au.a bu = new au.a() { // from class: cwg.12
        {
            cwg.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cwg.this.a.postValue(new Pair<>("OUTSTANDING_AMOUNT", Boolean.FALSE));
        }
    };
    MainPlanResponseBody i = null;
    boolean k = false;
    boolean t = false;
    private final au.b<JSONObject> bv = new au.b<JSONObject>() { // from class: cwg.18
        {
            cwg.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ProfilePostPaidResponse profilePostPaidResponse = (ProfilePostPaidResponse) new Gson().a(jSONObject.toString(), (Class<Object>) ProfilePostPaidResponse.class);
            if (profilePostPaidResponse == null || !profilePostPaidResponse.header.responseCode.equals("0")) {
                if (profilePostPaidResponse == null) {
                    return;
                }
                profilePostPaidResponse.header.responseCode.equals("1200");
            } else if (profilePostPaidResponse.body == null || profilePostPaidResponse.body.customerProfile == null || profilePostPaidResponse.body.customerProfile.customerName == null || !cwg.this.isAdded()) {
            } else {
                String str = profilePostPaidResponse.body.customerProfile.customerName;
                cwg.this.l.e(profilePostPaidResponse.body.customerProfile.customerName);
                cwg.this.l.h(profilePostPaidResponse.body.customerProfile.email);
                cwg.this.G.setText(profilePostPaidResponse.body.customerProfile.msisdn);
                cwg.this.F.setText(str);
            }
        }
    };
    boolean O = false;
    int al = 2;
    int am = 2;
    int as = 1;
    int at = 1;
    int au = 1;
    int ax = 1;
    String ay = "";
    int aA = 0;
    boolean aD = true;
    boolean aE = true;
    boolean aF = false;
    private final au.b<JSONObject> bw = new au.b<JSONObject>() { // from class: cwg.19
        {
            cwg.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            PostPaidBalanceResponse postPaidBalanceResponse = (PostPaidBalanceResponse) new Gson().a(jSONObject.toString(), (Class<Object>) PostPaidBalanceResponse.class);
            if (postPaidBalanceResponse == null || postPaidBalanceResponse.header == null) {
                return;
            }
            if (postPaidBalanceResponse.header.responseCode.equals("0")) {
                cwg.this.a.postValue(new Pair<>("OUTSTANDING_AMOUNT", Boolean.TRUE));
                if (cwg.this.r.e()) {
                    cwg.a(cwg.this, Float.valueOf(postPaidBalanceResponse.body.outstandingAmount));
                    return;
                } else if (!cwg.this.r.d()) {
                    return;
                } else {
                    cwg.this.a(Float.valueOf(postPaidBalanceResponse.body.balance));
                    return;
                }
            }
            postPaidBalanceResponse.header.responseCode.equals("1200");
        }
    };
    List<SummarizedLineUsageItem> aO = new ArrayList();
    View.OnClickListener aV = new View.OnClickListener() { // from class: cwg.20
        {
            cwg.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cwg.this.startActivity(new Intent(cwg.this.getActivity(), SwitchAccountPostPaidActivity.class));
        }
    };
    au.a aW = new au.a() { // from class: cwg.21
        {
            cwg.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cwg.this.k();
            cwg.this.s.a();
            cwg.this.a.postValue(new Pair<>("MAIN_PLAN", Boolean.FALSE));
        }
    };
    View.OnClickListener aX = new View.OnClickListener() { // from class: cwg.22
        {
            cwg.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cwg.this.r.l()) {
                cwg.this.startActivity(new Intent(cwg.this.getActivity(), FMCMSISDNPickerActivity.class));
                return;
            }
            cwg.this.startActivity(new Intent(cwg.this.getActivity(), MoreBundleActivity.class));
        }
    };
    View.OnClickListener aY = new View.OnClickListener() { // from class: cwg.23
        {
            cwg.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cwg.this.aE) {
                cwg.this.startActivity(new Intent(cwg.this.getActivity(), ManagePostPaidPlanActivity.class));
            } else if (cwg.this.l.b("en").equalsIgnoreCase("en")) {
                UnNavigateResponseActivity.a(cwg.this.getContext(), cwg.this.g.f.getMobile_app_main_invalid_en(), cwg.this.g.f.getMobile_app_main_invalid_desc_en(), true);
            } else {
                UnNavigateResponseActivity.a(cwg.this.getContext(), cwg.this.g.f.getMobile_app_main_invalid_ar(), cwg.this.g.f.getMobile_app_main_invalid_desc_ar(), true);
            }
        }
    };
    View.OnClickListener aZ = new View.OnClickListener() { // from class: cwg.24
        {
            cwg.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cwg.this.r.d()) {
                cwg.this.startActivity(new Intent(cwg.this.getActivity(), BalanceRechargeActivity.class));
            } else if (!cwg.this.r.e()) {
            } else {
                cwg.this.startActivity(new Intent(cwg.this.getActivity(), PayBillNumberTypeActivity.class));
            }
        }
    };
    au.a ba = new au.a() { // from class: cwg.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }

        {
            cwg.this = this;
        }
    };
    boolean bb = false;
    au.b<JSONObject> bd = new au.b<JSONObject>() { // from class: cwg.3
        {
            cwg.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            cwg.this.bb = false;
            if (cwg.this.aI.getWindow() != null) {
                cwg.this.s.a();
                if (cwg.this.getActivity() == null) {
                    return;
                }
                RegionalPlansResponse regionalPlansResponse = (RegionalPlansResponse) new Gson().a(jSONObject2.toString(), (Class<Object>) RegionalPlansResponse.class);
                if (regionalPlansResponse.getHeader().getResponseCode() == null || !regionalPlansResponse.getHeader().getResponseCode().equals("0") || regionalPlansResponse.getBody().size() == 0) {
                    return;
                }
                cwg.this.bc = true;
                Intent intent = new Intent(cwg.this.getActivity(), RegionalProductsActivity.class);
                intent.putExtra("response", jSONObject2.toString());
                cwg.this.startActivity(intent);
                cwg.this.l.n(false);
            }
        }
    };
    private boolean bx = false;
    au.a be = new au.a() { // from class: cwg.4
        {
            cwg.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cwg.this.bb = false;
            Toast.makeText(cwg.this.by, volleyError.toString(), 0);
            cwg.this.s.a();
        }
    };
    au.a bf = new au.a() { // from class: cwg.5
        {
            cwg.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cwg.this.k();
            cwg.this.a.postValue(new Pair<>("MAIN_PLAN", Boolean.FALSE));
            cwg.this.k = true;
            if (!cwg.b(cwg.this)) {
                cwg.this.l();
            }
            cwg.this.s.a();
        }
    };
    View.OnClickListener bg = new View.OnClickListener() { // from class: cwg.6
        {
            cwg.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cwg.this.r.d()) {
                if (cwg.this.r.g()) {
                    djx.a(cwg.this.getActivity(), ADSLBalanceServicesActivity.class, String.valueOf(cwg.this.bz));
                } else {
                    djx.a(cwg.this.getActivity(), BalanceActivity.class, String.valueOf(cwg.this.bz));
                }
            } else if (!cwg.this.r.e()) {
            } else {
                cwg.this.startActivity(new Intent(cwg.this.getActivity(), BillSummaryActivity.class));
            }
        }
    };
    au.b<JSONObject> bh = new au.b<JSONObject>() { // from class: cwg.7
        {
            cwg.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            cwg.this.s.a();
            if (cwg.this.getActivity() != null) {
                cwg.this.l.q(false);
                Gson gson = new Gson();
                ResponseViewMoreBundle responseViewMoreBundle = (ResponseViewMoreBundle) gson.a(jSONObject2.toString(), (Class<Object>) ResponseViewMoreBundle.class);
                cwg.this.bE = responseViewMoreBundle;
                if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("0")) {
                    cwg.this.a.postValue(new Pair<>("MAIN_PLAN", Boolean.TRUE));
                    if (responseViewMoreBundle.getBody().size() != 0) {
                        int i = 0;
                        while (true) {
                            if (i >= responseViewMoreBundle.getBody().size()) {
                                break;
                            } else if (responseViewMoreBundle.getBody().get(i).getMain()) {
                                cwg.this.O = true;
                                cwg.this.l.q(true);
                                int i2 = R.drawable.ic_mobile_number;
                                try {
                                    bo.b(cwg.this.getContext()).a(responseViewMoreBundle.getBody().get(i).getOfferDetails().getIconUrl()).a(cwg.this.r.f() ? R.drawable.ic_mobile_number : R.drawable.ic_fbb_number).b(cwg.this.r.f() ? R.drawable.ic_mobile_number : R.drawable.ic_fbb_number).a(cwg.this.K);
                                } catch (Exception unused) {
                                    bu<Drawable> a = bo.b(cwg.this.by).a(Integer.valueOf(cwg.this.r.f() ? R.drawable.ic_mobile_number : R.drawable.ic_fbb_number));
                                    if (!cwg.this.r.f()) {
                                        i2 = R.drawable.ic_fbb_number;
                                    }
                                    a.a(i2).a(cwg.this.K);
                                }
                                cwg.this.l.B(gson.a(responseViewMoreBundle.getBody().get(i)));
                                if (!cwg.this.h.f()) {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        cwg.this.H.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (responseViewMoreBundle.getBody().get(i).getRenewalDate() != null) {
                                        cwg.this.H.setText(djm.b(responseViewMoreBundle.getBody().get(i).getRenewalDate()));
                                    } else {
                                        cwg.this.H.setText("");
                                    }
                                    cwg.this.v.setText(responseViewMoreBundle.getBody().get(i).getOfferEnName());
                                } else {
                                    if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                                        cwg.this.H.setText(responseViewMoreBundle.getBody().get(i).getStatus());
                                    } else if (responseViewMoreBundle.getBody().get(i).getRenewalDate() != null) {
                                        cwg.this.H.setText(djm.b(responseViewMoreBundle.getBody().get(i).getRenewalDate()));
                                    } else {
                                        cwg.this.H.setText("");
                                    }
                                    cwg.this.v.setText(responseViewMoreBundle.getBody().get(i).getOfferArName());
                                }
                            } else {
                                i++;
                            }
                        }
                        if (!cwg.this.O) {
                            cwg.this.aE = false;
                            cwg.this.k();
                        }
                    } else {
                        cwg.this.aE = false;
                        cwg.this.k();
                    }
                } else if (responseViewMoreBundle.getHeader().getResponseCode() != null && responseViewMoreBundle.getHeader().getResponseCode().equals("1200")) {
                    cwg.this.b(2);
                } else {
                    cwg.this.aE = false;
                    cwg.this.k();
                    cwg.this.a.postValue(new Pair<>("MAIN_PLAN", Boolean.FALSE));
                }
            }
            if (!cwg.this.r.g() || !cwg.this.r.d() || cwg.this.r.l() || cwg.b(cwg.this)) {
                return;
            }
            cwg cwgVar = cwg.this;
            cwgVar.a(cwgVar.bE);
        }
    };
    au.b<JSONObject> bi = new au.b<JSONObject>() { // from class: cwg.8
        {
            cwg.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            cwg.this.s.a();
            if (cwg.this.getActivity() != null) {
                PromiseToPayResponse promiseToPayResponse = (PromiseToPayResponse) new Gson().a(jSONObject2.toString(), (Class<Object>) PromiseToPayResponse.class);
                if (promiseToPayResponse.getHeader().getResponseCode() != null && promiseToPayResponse.getHeader().getResponseCode().equals("0")) {
                    if (promiseToPayResponse.isShowPromiseToPay()) {
                        cwg.this.bc = true;
                        cwg.this.startActivity(new Intent(cwg.this.getActivity(), PromiseToPayAndSalefnyActivity.class));
                        cwg.this.t = true;
                        cwg.this.l.l(false);
                    } else if (cwg.b(cwg.this)) {
                    } else {
                        cwg cwgVar = cwg.this;
                        cwgVar.a(cwgVar.bE);
                    }
                } else if (!promiseToPayResponse.getHeader().getResponseCode().equals("1200")) {
                } else {
                    cwg.this.b(5);
                }
            }
        }
    };
    View.OnClickListener bk = new View.OnClickListener() { // from class: cwg.9
        {
            cwg.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent;
            if (cwg.this.j != null) {
                cwg cwgVar = cwg.this;
                Long l = cwgVar.j;
                if (l.longValue() == 100) {
                    intent = new Intent(cwgVar.aI, WebViewActivity.class);
                    intent.putExtra("token", cwgVar.bj);
                    intent.addFlags(536870912);
                } else if (l.longValue() == 110022) {
                    intent = new Intent(cwgVar.aI, GroupDetailsActivity.class);
                    intent.addFlags(536870912);
                } else {
                    Intent intent2 = new Intent(cwgVar.aI, UsageDetailsScreenActivity.class);
                    intent2.addFlags(536870912);
                    intent2.putParcelableArrayListExtra("TAB_USAGE_DETAILS_DTO", (ArrayList) cwgVar.aH.a.get(l));
                    intent = intent2;
                }
                cwgVar.startActivity(intent);
            } else if (cwg.this.l.b("en").equalsIgnoreCase("en")) {
                Toast.makeText(cwg.this.by, cwg.this.g.f.getNoUsageDetailsHintEN(), 0).show();
            } else {
                Toast.makeText(cwg.this.by, cwg.this.g.f.getNoUsageDetailsHintAR(), 0).show();
            }
        }
    };

    /* renamed from: lambda$-ypivBADxQ2rK8mK8mH33RA1uk0 */
    public static /* synthetic */ void m76lambda$ypivBADxQ2rK8mK8mH33RA1uk0(cwg cwgVar) {
        cwgVar.r();
    }

    /* renamed from: lambda$1jO28R41KzVNF83QcoZx-p8BAf8 */
    public static /* synthetic */ dmg m77lambda$1jO28R41KzVNF83QcoZxp8BAf8(cwg cwgVar, o oVar, q qVar, dov dovVar) {
        return cwgVar.a(oVar, qVar, dovVar);
    }

    public static /* synthetic */ void lambda$DeyO6N_E64fxMOnlrFnvAYwDq1U(cwg cwgVar, bwl bwlVar) {
        cwgVar.a(bwlVar);
    }

    /* renamed from: lambda$Z-CM_cIDhnAS9wcRI_sBH0KF3LY */
    public static /* synthetic */ dmg m78lambda$ZCM_cIDhnAS9wcRI_sBH0KF3LY(cwg cwgVar) {
        return cwgVar.q();
    }

    /* renamed from: lambda$cBVQDzZKD-ETHqqjC2a_G3PKtSY */
    public static /* synthetic */ void m79lambda$cBVQDzZKDETHqqjC2a_G3PKtSY(o oVar) {
        oVar.a();
    }

    public static /* synthetic */ void lambda$mBc1ajdwD5wVuv22LdOGzdaZmbo(cwg cwgVar, MyAppBarLayout.b bVar) {
        cwgVar.a(bVar);
    }

    /* renamed from: lambda$p_uBZY8K4INUIW-SiGAZbjsWiK8 */
    public static /* synthetic */ void m80lambda$p_uBZY8K4INUIWSiGAZbjsWiK8(cwg cwgVar, SummarizedLineUsageItem summarizedLineUsageItem) {
        cwgVar.a(summarizedLineUsageItem);
    }

    public static /* synthetic */ void lambda$qkxZ2l7LOBeELDY86GTOb01Nss4(cwg cwgVar, Set set, Pair pair) {
        cwgVar.a(set, pair);
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

    public cwg() {
        setRetainInstance(true);
    }

    public void a(Float f) {
        this.aJ.setText(String.valueOf(f));
        this.I.setText(getString(R.string.remaining_balance_new));
        this.M.setVisibility(0);
    }

    public void c(int i) {
        int i2;
        cxa cxaVar = this.bC;
        cxaVar.k = i;
        int i3 = 100;
        if (cxaVar.s == null || cxaVar.s.size() <= i || cxaVar.s.size() <= 0) {
            i2 = 0;
        } else if (cxaVar.s.get(i).h == null || cxaVar.s.get(i).h.longValue() == 110022) {
            cxaVar.n = cxaVar.s.get(i).d;
            cxaVar.o = cxaVar.s.get(i).f;
            cxaVar.m = cxaVar.s.get(i).e;
            cxaVar.p = cxaVar.s.get(i).i;
            cxaVar.q = cxaVar.s.get(i).h;
            if (cxaVar.t != null && !cxaVar.t.isEmpty()) {
                cxaVar.a.a(cxaVar.m, cxaVar.n, cxaVar.o, cxaVar.p, cxaVar.q);
            }
            i2 = 100;
        } else {
            cxaVar.n = cxaVar.s.get(i).d;
            cxaVar.o = cxaVar.s.get(i).f;
            cxaVar.m = cxaVar.s.get(i).e;
            cxaVar.p = cxaVar.s.get(i).i;
            cxaVar.q = cxaVar.s.get(i).h;
            cxaVar.a.a(cxaVar.m, cxaVar.n, cxaVar.o, cxaVar.p, cxaVar.q);
            i2 = cxaVar.s.get(i).g;
        }
        if (i != this.aG) {
            i3 = i2;
        }
        this.av.a(i3, true);
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        final HashSet hashSet = new HashSet();
        this.c.a(this);
        this.a.observe(getViewLifecycleOwner(), new Observer() { // from class: -$$Lambda$cwg$qkxZ2l7LOBeELDY86GTOb01Nss4
            @Override // androidx.lifecycle.Observer
            public final void onChanged(Object obj) {
                cwg.lambda$qkxZ2l7LOBeELDY86GTOb01Nss4(cwg.this, hashSet, (Pair) obj);
            }
        });
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    public /* synthetic */ void a(Set set, Pair pair) {
        char c;
        String str = (String) pair.first;
        switch (str.hashCode()) {
            case -1729959441:
                if (str.equals("MAIN_PLAN")) {
                    c = 2;
                    break;
                }
                c = 65535;
                break;
            case -497929539:
                if (str.equals("OUTSTANDING_AMOUNT")) {
                    c = 0;
                    break;
                }
                c = 65535;
                break;
            case 378796732:
                if (str.equals("BALANCE")) {
                    c = 1;
                    break;
                }
                c = 65535;
                break;
            case 1929958073:
                if (str.equals("FREE_UNIT_USAGE")) {
                    c = 3;
                    break;
                }
                c = 65535;
                break;
            default:
                c = 65535;
                break;
        }
        if (c == 0 || c == 1) {
            set.add(pair.first);
        } else if (c == 2) {
            set.add(pair.first);
        } else if (c == 3) {
            set.add(pair.first);
        }
        if (set.size() >= 2) {
            this.s.a();
            b(!this.l.c());
            new Handler().postDelayed(new Runnable() { // from class: cwg.10
                {
                    cwg.this = this;
                }

                @Override // java.lang.Runnable
                public final void run() {
                    if (!cwg.b(cwg.this) || !cwg.this.r.a()) {
                        return;
                    }
                    cwg.g(cwg.this);
                }
            }, 1000L);
        }
    }

    private void n() {
        if (!isAdded()) {
            return;
        }
        if (this.r.d()) {
            this.f.a();
        }
        if (this.r.e() && (!this.r.f() || !this.r.h())) {
            try {
                djl.a(getActivity()).d(this.bw, this.bu);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        o();
    }

    public void a(ResponseViewMoreBundle responseViewMoreBundle) {
        if (responseViewMoreBundle == null || responseViewMoreBundle.getBody() == null) {
            return;
        }
        if (responseViewMoreBundle.getBody().size() != 0) {
            int i = 0;
            while (true) {
                if (i >= responseViewMoreBundle.getBody().size()) {
                    break;
                } else if (responseViewMoreBundle.getBody().get(i).getMain()) {
                    this.O = true;
                    this.l.q(true);
                    if (!this.h.f()) {
                        if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                            if (this.l.K() && this.g.f.isFeatureSalfny()) {
                                this.bc = true;
                                startActivity(new Intent(getActivity(), PromiseToPayAndSalefnyActivity.class));
                                this.l.l(false);
                                this.k = true;
                            } else {
                                l();
                            }
                        } else if (f(responseViewMoreBundle.getBody().get(i).getRenewalDate())) {
                            l();
                        } else {
                            l();
                        }
                    } else if (responseViewMoreBundle.getBody().get(i).getStatusCode().equalsIgnoreCase("4")) {
                        if (this.l.K() && this.g.f.isFeatureSalfny()) {
                            this.bc = true;
                            startActivity(new Intent(getActivity(), PromiseToPayAndSalefnyActivity.class));
                            this.l.l(false);
                            this.k = true;
                        } else {
                            l();
                        }
                    } else if (f(responseViewMoreBundle.getBody().get(i).getRenewalDate())) {
                        l();
                    } else {
                        l();
                    }
                } else {
                    i++;
                }
            }
            if (this.O) {
                return;
            }
            this.aE = false;
            k();
            return;
        }
        this.aE = false;
        k();
        l();
    }

    private void o() {
        try {
            if (this.r.g() && this.r.d() && !this.r.l() && !this.l.c() && !this.bb) {
                a(this.bE);
            }
            if (!this.r.g() || !this.r.e() || this.r.l()) {
                return;
            }
            if (!this.l.K() || !this.g.f.isFeature_promisetopay()) {
                if (!this.l.M()) {
                    this.s.a();
                } else if (this.l.c() || this.l.L()) {
                } else {
                    this.l.m(true);
                    djl.a(getActivity()).c(this.bd, this.be);
                }
            } else if (this.l.c()) {
            } else {
                djl.a(getActivity()).z(this.bi, this.ba);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void p() {
        if (!isAdded()) {
            return;
        }
        this.F.setText(this.r.s);
        this.G.setText(this.l.m());
        this.f.d();
        try {
            djl.a(getActivity()).a(this.l.O(), this.bh, this.aW);
        } catch (JSONException e) {
            e.printStackTrace();
        }
        this.c.a();
    }

    @Override // defpackage.dht
    public final void a(float f) {
        this.aK.setRefreshing(false);
        this.a.postValue(new Pair<>("BALANCE", Boolean.TRUE));
        this.bC.a(f);
        c(1);
        this.l.a(f);
        a(Float.valueOf(f));
    }

    @Override // defpackage.dht
    public final void r_() {
        this.aK.setRefreshing(false);
        this.bz = -1.0f;
        this.a.postValue(new Pair<>("BALANCE", Boolean.FALSE));
        this.bC.a(this.bz);
    }

    @Override // defpackage.dht
    public final void b(String str) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void s_() {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void b(int i, String str) {
        this.aK.setRefreshing(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 105 && i2 == -1) {
            this.q.a(this.i.getServiceId());
        }
    }

    @Override // defpackage.dht
    public final void a(List<SummarizedLineUsageItem> list) {
        djm.a(this.aI.getBaseContext());
        this.aO = list;
        this.a.postValue(new Pair<>("FREE_UNIT_USAGE", Boolean.TRUE));
        n();
        if (list == null || list.isEmpty()) {
            int dimensionPixelOffset = getResources().getDimensionPixelOffset(R.dimen._20sdp);
            this.n.setClickable(false);
            this.Y.setClickable(false);
            this.X.setClickable(false);
            this.ag.setVisibility(8);
            this.Z.setVisibility(8);
            this.aj.setBackgroundResource(R.drawable.home_pt_background);
            this.aj.setPadding(0, 0, 0, dimensionPixelOffset);
            this.P.setImageResource(R.drawable.home_pt_background);
            this.P.setPadding(0, 0, 0, dimensionPixelOffset);
        }
        TextView textView = this.aM;
        this.aI.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        this.aK.setRefreshing(false);
        cxa cxaVar = this.bC;
        if (cxaVar.s != null) {
            cxaVar.s.clear();
            cxaVar.a();
        }
        if (list.size() > 0) {
            if (list.size() == 1) {
                this.bC.b(list);
                this.Y.setClickable(false);
                this.X.setClickable(false);
            } else {
                this.bC.a(list);
            }
            this.bC.notifyDataSetChanged();
            this.aw.removeAllTabs();
            for (int i = 0; i < list.size(); i++) {
                TabLayout tabLayout = this.aw;
                tabLayout.addTab(tabLayout.newTab().setIcon(R.drawable.tab_selector), false);
            }
            if (this.ax == 1) {
                this.ar.setStackFromEnd(true);
                this.bD.smoothScrollToPosition(1);
                this.aA = 0;
                if (list.size() == 1) {
                    c(1);
                }
                this.ax = 0;
                return;
            }
            this.bC.notifyDataSetChanged();
            int findFirstCompletelyVisibleItemPosition = this.ar.findFirstCompletelyVisibleItemPosition();
            this.ar.findLastCompletelyVisibleItemPosition();
            if (findFirstCompletelyVisibleItemPosition == 0) {
                this.bD.scrollToPosition(3);
            } else {
                this.bD.scrollToPosition(2);
            }
            c(2);
            this.aw.getTabAt(0).select();
            this.aA = 0;
            return;
        }
        this.bD.setEnabled(false);
        this.bD.setAlpha(0.15f);
        this.bC.a();
        this.aw.removeAllTabs();
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
        this.aK.setRefreshing(false);
        this.a.postValue(new Pair<>("FREE_UNIT_USAGE", Boolean.FALSE));
        this.aH = cyqVar;
    }

    @Override // defpackage.dht
    public final void c(String str) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void a_(int i) {
        this.aK.setRefreshing(false);
        if (i == 1200) {
            b(8);
        }
        if (i != 1200) {
            n();
            this.n.setClickable(false);
            this.Y.setClickable(false);
            this.X.setClickable(false);
            this.ag.setVisibility(8);
            this.Z.setVisibility(8);
        }
    }

    @Override // defpackage.dht
    public final void b(List<MainPlanResponseBody> list) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void p_() {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dht
    public final void q_() {
        this.aK.setRefreshing(false);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        this.q.a(this);
        this.r.a(this);
        this.f.a(this);
        if (this.r.a()) {
            this.l.A("");
            if (!this.bc) {
                p();
            }
            this.l.e(this.r.s);
            this.F.setText(this.r.s);
            this.G.setText(this.l.m());
            new StringBuilder("test=>").append(getClass().getSimpleName());
            this.l.m();
        }
        this.bc = false;
        if (!this.r.g() || this.r.l() || this.l.K()) {
            return;
        }
        a(this.bE);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.by = getActivity();
        this.aL = new cyx(getActivity(), this);
        cgw.a(this.by);
        FirebaseInstanceId.a().e().a(new bwh() { // from class: -$$Lambda$cwg$DeyO6N_E64fxMOnlrFnvAYwDq1U
            @Override // defpackage.bwh
            public final void onComplete(bwl bwlVar) {
                cwg.lambda$DeyO6N_E64fxMOnlrFnvAYwDq1U(cwg.this, bwlVar);
            }
        });
        this.aP = (MotionLayout) this.aI.findViewById(R.id.root_layout);
        this.aQ = (NestedScrollView) this.aI.findViewById(R.id.view_pager);
        this.aR = (MyAppBarLayout) this.aI.findViewById(R.id.app_bar_layout);
        this.aS = (CollapsingToolbarLayout) this.aI.findViewById(R.id.collapsing_toolbar_layout);
        this.aT = (LinearLayoutCompat) this.aI.findViewById(R.id.llMask);
        this.aU = (FloatingActionButton) this.aI.findViewById(R.id.fab);
        this.aK = (SwipeRefreshLayout) this.aI.findViewById(R.id.swipeRefreshLayout);
        MyAppBarLayout myAppBarLayout = (MyAppBarLayout) this.aI.findViewById(R.id.app_bar_layout);
        this.aR = myAppBarLayout;
        myAppBarLayout.addOnOffsetChangedListener((AppBarLayout.OnOffsetChangedListener) this);
        this.aR.setOnStateChangeListener(new MyAppBarLayout.a() { // from class: -$$Lambda$cwg$mBc1ajdwD5wVuv22LdOGzdaZmbo
            @Override // com.ucare.we.view.MyAppBarLayout.a
            public final void onStateChange(MyAppBarLayout.b bVar) {
                cwg.lambda$mBc1ajdwD5wVuv22LdOGzdaZmbo(cwg.this, bVar);
            }
        });
    }

    public /* synthetic */ void a(MyAppBarLayout.b bVar) {
        this.aK.setEnabled(bVar == MyAppBarLayout.b.EXPANDED);
    }

    public /* synthetic */ void a(bwl bwlVar) {
        if (!bwlVar.e()) {
            return;
        }
        String a = ((cmu) bwlVar.b()).a();
        this.l.t(a);
        this.aL.a(a, "add");
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        super.onDestroy();
        this.q.b(this);
        this.r.b(this);
        this.f.b(this);
        this.aw.removeAllTabs();
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.q.b(this);
        this.r.b(this);
        this.f.b(this);
        this.aw.removeAllTabs();
        djl.a(getActivity()).a();
        this.bb = true;
    }

    @Override // defpackage.die
    public final void a(ProfileInfoResponseBody profileInfoResponseBody) {
        this.aK.setRefreshing(false);
        String customerName = profileInfoResponseBody.getCustomerName();
        this.l.e(profileInfoResponseBody.getCustomerName());
        this.l.h(profileInfoResponseBody.getEmail());
        this.F.setText(customerName);
        this.G.setText(profileInfoResponseBody.getMsisdn());
    }

    @Override // defpackage.die
    public final void e(int i, String str) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dhk
    public final void a(int i) {
        if (!isAdded()) {
            return;
        }
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dhk
    public final void a(boolean z) {
        if (!isAdded()) {
            return;
        }
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dhk
    public final void a(int i, int i2, String str) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void a_(List<PlansAndBundlesResponseBody> list) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void o_() {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void b_(String str) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void a_(int i, String str) {
        this.aK.setRefreshing(false);
        this.s.a();
        this.e.a(getActivity(), str, i, ErrorHandlerActivity.class);
    }

    @Override // defpackage.dic
    public final void c_(String str) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void b_(int i, String str) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d_(String str) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void c(int i, String str) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d(String str) {
        this.aK.setRefreshing(false);
    }

    @Override // defpackage.dic
    public final void d(int i, String str) {
        this.aK.setRefreshing(false);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.aI = getActivity();
        View inflate = layoutInflater.inflate(R.layout.home_fragment_collapsing, viewGroup, false);
        this.az = inflate;
        this.F = (TextView) inflate.findViewById(R.id.tvUserName);
        this.J = (ImageView) this.az.findViewById(R.id.searchImageView);
        this.K = (ImageView) this.az.findViewById(R.id.im_mainPlan);
        this.w = (TextView) this.az.findViewById(R.id.tv_paybill);
        this.x = (TextView) this.az.findViewById(R.id.tv_managePlan);
        this.ai = (LinearLayoutCompat) this.az.findViewById(R.id.btn_subscribe);
        this.y = (TextView) this.az.findViewById(R.id.tv_extraBundles);
        this.z = (TextView) this.az.findViewById(R.id.tv_billSummary);
        this.u = (LinearLayoutCompat) this.az.findViewById(R.id.llUserPlan);
        this.G = (TextView) this.az.findViewById(R.id.tvManagingNumber);
        this.I = (TextView) this.az.findViewById(R.id.home_outStanding_amout_tv);
        this.p = (ImageView) this.az.findViewById(R.id.btn_current_number);
        this.m = (LinearLayoutCompat) this.az.findViewById(R.id.btn_balance_recharge_main);
        this.n = (LinearLayoutCompat) this.az.findViewById(R.id.ll_check_detail);
        this.o = (TextView) this.az.findViewById(R.id.tv_check_details);
        this.v = (TextView) this.az.findViewById(R.id.txtPlanName);
        this.A = (TextView) this.az.findViewById(R.id.tv_remaining_prgBar);
        this.aJ = (TextView) this.az.findViewById(R.id.outstanding_amount);
        this.B = (TextView) this.az.findViewById(R.id.tv_remainingUnit_prgBar);
        this.C = (TextView) this.az.findViewById(R.id.tv_total_prgBr);
        this.D = (TextView) this.az.findViewById(R.id.tv_totalUnit_prgBr);
        this.H = (TextView) this.az.findViewById(R.id.txtRenewalDate);
        this.bA = this.az.findViewById(R.id.user_view);
        this.bB = this.az.findViewById(R.id.user_bottom_view);
        this.av = (CircularProgressView) this.az.findViewById(R.id.progressBar);
        this.aw = (TabLayout) this.az.findViewById(R.id.tab_layout);
        this.W = (LinearLayoutCompat) this.az.findViewById(R.id.btnManagePlan);
        this.X = (LinearLayoutCompat) this.az.findViewById(R.id.ll_rightArrow);
        this.Y = (LinearLayoutCompat) this.az.findViewById(R.id.ll_leftArrow);
        this.L = (RelativeLayout) this.az.findViewById(R.id.rl_tabLayout);
        this.Z = (LinearLayoutCompat) this.az.findViewById(R.id.ll_progressCircle);
        this.aa = (LinearLayoutCompat) this.az.findViewById(R.id.border_bg_palne);
        this.ab = (LinearLayoutCompat) this.az.findViewById(R.id.payfixed_bill_background);
        this.ac = (LinearLayoutCompat) this.az.findViewById(R.id.wepay_background);
        this.ad = (LinearLayoutCompat) this.az.findViewById(R.id.familyPlanBackground);
        this.N = (ConstraintLayout) this.az.findViewById(R.id.rl_pointsCard);
        this.R = (ImageView) this.az.findViewById(R.id.ic_left_arrow);
        this.S = (ImageView) this.az.findViewById(R.id.ic_right_arrow);
        this.T = (ImageView) this.az.findViewById(R.id.ic_addons);
        this.U = (ImageView) this.az.findViewById(R.id.ic_paybill);
        this.V = (ImageView) this.az.findViewById(R.id.ic_billSummary);
        this.M = (RelativeLayout) this.az.findViewById(R.id.rl_outstandingAmount);
        this.E = (TextView) this.az.findViewById(R.id.home_points_tv);
        this.ae = (LinearLayoutCompat) this.az.findViewById(R.id.btn_extra_bundles);
        this.af = (FrameLayout) this.az.findViewById(R.id.progress_frame_lt);
        this.ag = (FrameLayout) this.az.findViewById(R.id.ioexample_toolbar);
        this.ah = (LinearLayoutCompat) this.az.findViewById(R.id.btn_balance_services_main);
        this.aM = (TextView) this.az.findViewById(R.id.lastModificationDate);
        this.aN = (TextView) this.az.findViewById(R.id.progress_ttl_tv);
        this.Q = (ImageView) this.az.findViewById(R.id.iv_slider_center);
        this.P = (ImageView) this.az.findViewById(R.id.ivBackdrop);
        this.aj = (ConstraintLayout) this.az.findViewById(R.id.con_header);
        this.ak = (NestedScrollView) this.az.findViewById(R.id.view_pager);
        this.an = (LinearLayoutCompat) this.az.findViewById(R.id.llWePay);
        this.ao = (LinearLayoutCompat) this.az.findViewById(R.id.llPayFixedVoiceBill);
        this.ap = (LinearLayoutCompat) this.az.findViewById(R.id.llFamilyPlan);
        this.aq = (RelativeLayout) this.az.findViewById(R.id.ll_slider_center);
        this.an.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$TN4cq3QlsNKdwcUKhEFmI1Wss-k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cwg.this.onClick(view);
            }
        });
        this.ao.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$TN4cq3QlsNKdwcUKhEFmI1Wss-k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cwg.this.onClick(view);
            }
        });
        this.ap.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$TN4cq3QlsNKdwcUKhEFmI1Wss-k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cwg.this.onClick(view);
            }
        });
        this.o.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$TN4cq3QlsNKdwcUKhEFmI1Wss-k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cwg.this.onClick(view);
            }
        });
        this.Y.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$TN4cq3QlsNKdwcUKhEFmI1Wss-k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cwg.this.onClick(view);
            }
        });
        this.X.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$TN4cq3QlsNKdwcUKhEFmI1Wss-k
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cwg.this.onClick(view);
            }
        });
        this.bD = (RecyclerView) this.az.findViewById(R.id.rv_slider);
        CustomLinearLayoutManager customLinearLayoutManager = new CustomLinearLayoutManager(getActivity());
        this.ar = customLinearLayoutManager;
        customLinearLayoutManager.setOrientation(0);
        this.bD.setLayoutManager(this.ar);
        this.W.setOnClickListener(this.aY);
        this.ae.setOnClickListener(this.aX);
        this.T.setOnClickListener(this.aX);
        this.ah.setOnClickListener(this.bg);
        this.n.setOnClickListener(this.bk);
        this.m.setOnClickListener(this.aZ);
        CircularProgressView circularProgressView = this.av;
        circularProgressView.g = 0.0f;
        circularProgressView.c = (circularProgressView.b / 2.0f) + circularProgressView.a;
        circularProgressView.e.setStrokeWidth(djr.a(7));
        Paint paint = circularProgressView.f;
        paint.setColor(circularProgressView.d);
        paint.setStrokeWidth(djr.a(20));
        paint.setStrokeJoin(Paint.Join.ROUND);
        paint.setStrokeCap(Paint.Cap.ROUND);
        paint.setMaskFilter(new BlurMaskFilter(circularProgressView.a, BlurMaskFilter.Blur.NORMAL));
        circularProgressView.setLayerType(1, circularProgressView.f);
        circularProgressView.invalidate();
        if (this.h.e()) {
            this.aa.setBackgroundResource(R.drawable.border_bg_plan_);
            this.ab.setBackgroundResource(R.drawable.payfixed_bill_background_ar);
            this.ac.setBackgroundResource(R.drawable.wepay_background_ar);
            this.ad.setBackgroundResource(R.drawable.family_plan_background_ar);
            this.R.setImageResource(R.drawable.ic_arrow_right);
            this.S.setImageResource(R.drawable.ic_arrow_left);
        }
        this.ak.getViewTreeObserver().addOnScrollChangedListener(new ViewTreeObserver.OnScrollChangedListener() { // from class: cwg.11
            {
                cwg.this = this;
            }

            @Override // android.view.ViewTreeObserver.OnScrollChangedListener
            public final void onScrollChanged() {
                String.valueOf((cwg.this.ak.getScrollY() / (cwg.this.ak.getChildAt(0).getBottom() - cwg.this.ak.getHeight())) * 100.0d);
            }
        });
        this.J.setOnClickListener(new View.OnClickListener() { // from class: cwg.13
            {
                cwg.this = this;
            }

            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                cwg.this.startActivity(new Intent(cwg.this.aI, SearchActivity.class));
            }
        });
        if (!this.r.l() && this.r.e()) {
            if (this.b.l().booleanValue()) {
                this.m.setAlpha(1.0f);
                this.m.setClickable(true);
            } else {
                this.m.setAlpha(0.5f);
                this.m.setClickable(false);
            }
            if (this.b.h().booleanValue()) {
                this.ah.setAlpha(1.0f);
                this.ah.setClickable(true);
            } else {
                this.ah.setAlpha(0.5f);
                this.ah.setClickable(false);
            }
        }
        cxa cxaVar = new cxa(this, this);
        this.bC = cxaVar;
        this.bD.setAdapter(cxaVar);
        this.bD.setHasFixedSize(true);
        this.p.setOnClickListener(this.aV);
        if (getArguments() != null) {
            this.ax = Integer.parseInt(getArguments().getString("params"));
        }
        TextView textView = this.aM;
        this.aI.getBaseContext();
        textView.setText(djv.a("LAST_MODIFICATION_DATE_STRING_IN_HOME_PAGE", ""));
        SwipeRefreshLayout swipeRefreshLayout = (SwipeRefreshLayout) this.az.findViewById(R.id.swipeRefreshLayout);
        this.aK = swipeRefreshLayout;
        swipeRefreshLayout.setColorSchemeResources(R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary, R.color.colorPrimary);
        this.aK.setOnRefreshListener(new SwipeRefreshLayout.OnRefreshListener() { // from class: -$$Lambda$cwg$-ypivBADxQ2rK8mK8mH33RA1uk0
            @Override // androidx.swiperefreshlayout.widget.SwipeRefreshLayout.OnRefreshListener
            public final void onRefresh() {
                cwg.m76lambda$ypivBADxQ2rK8mK8mH33RA1uk0(cwg.this);
            }
        });
        this.bD.addOnScrollListener(new djd(getContext(), this.ar, new djd.a() { // from class: cwg.14
            {
                cwg.this = this;
            }

            @Override // defpackage.djd.a
            public final void a(int i) {
                String.valueOf(i);
                cwg.this.bC.a(i);
                cwg.this.c(i);
            }
        }));
        this.bD.addOnScrollListener(new RecyclerView.OnScrollListener() { // from class: cwg.15
            {
                cwg.this = this;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrolled(RecyclerView recyclerView, int i, int i2) {
                super.onScrolled(recyclerView, i, i2);
                if (cwg.this.at >= 0 && i != 0) {
                    cxa cxaVar2 = cwg.this.bC;
                    ((cxaVar2.s == null || cxaVar2.s.size() <= 0) ? null : cxaVar2.s.get(cwg.this.at)).a = false;
                    cwg.this.bC.notifyDataSetChanged();
                }
                if (i == 0) {
                    cwg.this.au = 1;
                }
                cwg cwgVar = cwg.this;
                cwgVar.as = cwgVar.ar.findFirstCompletelyVisibleItemPosition() + 1;
                cwg cwgVar2 = cwg.this;
                cwgVar2.at = cwgVar2.ar.findLastCompletelyVisibleItemPosition() - 1;
            }

            @Override // androidx.recyclerview.widget.RecyclerView.OnScrollListener
            public final void onScrollStateChanged(RecyclerView recyclerView, int i) {
                if (i != 0) {
                    return;
                }
                if (cwg.this.as == cwg.this.at && cwg.this.at == 1 && cwg.this.au >= cwg.this.at && cwg.this.bC.getItemCount() != 3) {
                    cwg.this.bD.scrollToPosition(cwg.this.bC.getItemCount() - 2);
                    cwg cwgVar = cwg.this;
                    cwgVar.as = cwgVar.bC.getItemCount() - 3;
                    cwg cwgVar2 = cwg.this;
                    cwgVar2.at = cwgVar2.as;
                }
                if (cwg.this.as == cwg.this.at && cwg.this.at == cwg.this.bC.getItemCount() - 2 && cwg.this.au <= cwg.this.at && cwg.this.bC.getItemCount() != 3) {
                    cwg.this.bD.scrollToPosition(1);
                    cwg.this.as = 2;
                    cwg cwgVar3 = cwg.this;
                    cwgVar3.at = cwgVar3.as;
                }
                if (cwg.this.as != cwg.this.at) {
                    return;
                }
                cwg.this.bC.a(cwg.this.as);
                TabLayout.Tab tabAt = cwg.this.aw.getTabAt(cwg.this.as - 2);
                if (tabAt != null && !tabAt.isSelected()) {
                    cwg.this.aD = false;
                    tabAt.select();
                    cwg cwgVar4 = cwg.this;
                    cwgVar4.aA = cwgVar4.as - 2;
                }
                if (cwg.this.au == cwg.this.as) {
                    return;
                }
                cwg cwgVar5 = cwg.this;
                cwgVar5.au = cwgVar5.as;
                cwg cwgVar6 = cwg.this;
                cwgVar6.c(cwgVar6.as);
            }
        });
        LinearSnapHelper linearSnapHelper = new LinearSnapHelper() { // from class: cwg.16
            {
                cwg.this = this;
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
                    cwg r5 = defpackage.cwg.this
                    djb r5 = r5.h
                    boolean r5 = r5.f()
                    if (r5 != 0) goto L2c
                    goto L29
                L1f:
                    cwg r5 = defpackage.cwg.this
                    djb r5 = r5.h
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
                throw new UnsupportedOperationException("Method not decompiled: defpackage.cwg.AnonymousClass16.findTargetSnapPosition(androidx.recyclerview.widget.RecyclerView$LayoutManager, int, int):int");
            }
        };
        linearSnapHelper.attachToRecyclerView(this.bD);
        this.ar.setSmoothScrollbarEnabled(true);
        linearSnapHelper.onFling(300, 100);
        this.aw.addOnTabSelectedListener(new TabLayout.OnTabSelectedListener() { // from class: cwg.17
            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabReselected(TabLayout.Tab tab) {
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabUnselected(TabLayout.Tab tab) {
            }

            {
                cwg.this = this;
            }

            @Override // com.google.android.material.tabs.TabLayout.BaseOnTabSelectedListener
            public final void onTabSelected(TabLayout.Tab tab) {
                int i;
                if (!cwg.this.aD) {
                    cwg.this.aD = true;
                    return;
                }
                cwg cwgVar = cwg.this;
                cwgVar.aB = cwgVar.ar.findFirstCompletelyVisibleItemPosition();
                cwg cwgVar2 = cwg.this;
                cwgVar2.aC = cwgVar2.ar.findLastCompletelyVisibleItemPosition();
                int i2 = 0;
                if (cwg.this.aA < tab.getPosition()) {
                    i = (tab.getPosition() - cwg.this.aA) + cwg.this.aC;
                } else {
                    i = cwg.this.aA > tab.getPosition() ? cwg.this.aB - (cwg.this.aA - tab.getPosition()) : 0;
                }
                cwg.this.aA = tab.getPosition();
                if (i >= 0) {
                    i2 = i;
                }
                cwg.this.bD.smoothScrollToPosition(i2);
                if (i2 != 0) {
                    return;
                }
                cwg.this.c(1);
            }
        });
        if (this.r.e()) {
            this.w.setText(R.string.pay_bill_button);
            this.z.setText(R.string.bill_summary);
            this.y.setText(R.string.extra_bundles);
        } else if (this.r.d()) {
            this.U.setImageResource(R.drawable.ic_recharge_services);
            this.V.setImageResource(R.drawable.ic_balance_services);
            this.w.setText(R.string.balance_recharge_);
            this.z.setText(R.string.balance_services_);
            this.y.setText(R.string.extra_bundles);
        }
        this.f.c = new cwk() { // from class: -$$Lambda$cwg$p_uBZY8K4INUIW-SiGAZbjsWiK8
            @Override // defpackage.cwk
            public final void pointsCallback(SummarizedLineUsageItem summarizedLineUsageItem) {
                cwg.m80lambda$p_uBZY8K4INUIWSiGAZbjsWiK8(cwg.this, summarizedLineUsageItem);
            }
        };
        return this.az;
    }

    public /* synthetic */ void r() {
        if (this.r.a()) {
            this.bb = true;
            p();
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(getContext(), this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 2) {
            try {
                djl.a(getActivity()).a(this.l.O(), this.bh, this.aW);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i == 8) {
            p();
        } else if (i != 101) {
        } else {
            this.aL.a(this.l.H(), "add");
        }
    }

    public final void k() {
        if (this.l.b("en").equalsIgnoreCase("en")) {
            this.H.setText(this.g.f.getMobile_app_main_invalid_date_en());
            this.v.setText(this.g.f.getMobile_app_main_invalid_en());
            return;
        }
        this.H.setText(this.g.f.getMobile_app_main_invalid_date_ar());
        this.v.setText(this.g.f.getMobile_app_main_invalid_ar());
    }

    private static boolean f(String str) {
        return str != null && !str.isEmpty() && !str.equals("");
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.llPayFixedVoiceBill /* 2131362487 */:
                startActivity(new Intent(this.aI, PayBillForUserActivity.class));
                return;
            case R.id.llWePay /* 2131362504 */:
                this.e.b(this.aI, WePayActivity.class);
                return;
            case R.id.ll_leftArrow /* 2131362510 */:
                if (this.bx) {
                    this.aR.setExpanded(true);
                    this.ak.fullScroll(33);
                    d(2);
                    return;
                }
                d(2);
                return;
            case R.id.ll_rightArrow /* 2131362522 */:
                if (this.bx) {
                    this.aR.setExpanded(true);
                    this.ak.fullScroll(33);
                }
                d(1);
                return;
            case R.id.tv_check_details /* 2131363113 */:
                Intent intent = new Intent(this.aI, WebViewActivity.class);
                intent.putExtra("token", this.bj);
                intent.addFlags(536870912);
                startActivity(intent);
                return;
            default:
                return;
        }
    }

    @Override // defpackage.cwq
    public final void a(String str, String str2, String str3, String str4, Long l) {
        this.aN.setText(str);
        this.A.setText(str2);
        this.B.setText(str4);
        this.C.setText(str3);
        this.D.setText(str4);
        this.j = l;
        if (l.longValue() == 1) {
            this.af.setVisibility(0);
            this.T.setVisibility(0);
            this.Q.setImageResource(R.drawable.ic_minutes_selected);
        } else if (l.longValue() == 2) {
            this.af.setVisibility(0);
            this.T.setVisibility(0);
            this.Q.setImageResource(R.drawable.ic_m__internet_selected);
        } else if (l.longValue() == 7) {
            this.af.setVisibility(0);
            this.T.setVisibility(0);
            this.Q.setImageResource(R.drawable.ic_h__internet_selected);
        } else if (l.longValue() == 5) {
            this.af.setVisibility(0);
            this.T.setVisibility(0);
            this.Q.setImageResource(R.drawable.ic_sms_selected);
        } else if (l.longValue() == 8) {
            this.af.setVisibility(0);
            this.T.setVisibility(0);
            this.Q.setImageResource(R.drawable.ico_tabbar_worldcup_default);
        } else if (l.longValue() == 4) {
            this.af.setVisibility(0);
            this.T.setVisibility(0);
            this.Q.setImageResource(R.drawable.ic_units_selected);
        } else if (l.longValue() == 110022) {
            this.af.setVisibility(4);
            this.T.setVisibility(4);
            this.Q.setImageResource(R.drawable.ic_family_selected);
        } else {
            this.af.setVisibility(0);
            this.T.setVisibility(0);
            this.Q.setImageResource(R.drawable.ic_loyalty_active);
        }
    }

    private void d(int i) {
        if (i == 1) {
            this.bD.smoothScrollToPosition(this.ar.findLastVisibleItemPosition() + 1);
        } else if (i != 2) {
        } else {
            this.bD.smoothScrollToPosition(this.ar.findFirstVisibleItemPosition() - 1);
        }
    }

    @Override // defpackage.cwk
    /* renamed from: pointsCallback */
    public void a(SummarizedLineUsageItem summarizedLineUsageItem) {
        this.bj = summarizedLineUsageItem;
        this.N.setVisibility(0);
        TextView textView = this.E;
        StringBuilder sb = new StringBuilder();
        sb.append(Math.round(summarizedLineUsageItem.getInitialTotalAmount()));
        textView.setText(sb.toString());
    }

    public /* synthetic */ dmg q() {
        b(true);
        o();
        return null;
    }

    public /* synthetic */ dmg a(final o oVar, q qVar, dov dovVar) {
        if (qVar.k().getId() == R.id.btn_extra_bundles) {
            this.ak.scrollTo(0, qVar.k().getBottom() + ((HomeActivity) getActivity()).a.getMeasuredHeight() + getResources().getDimensionPixelSize(R.dimen.___200sdp));
        } else {
            this.ak.scrollTo(0, qVar.k().getBottom() + ((HomeActivity) getActivity()).a.getMeasuredHeight());
        }
        if (qVar.k().getId() == R.id.ioexample_toolbar) {
            this.aR.setExpanded(false);
            n.a(oVar.d);
            n nVar = oVar.b;
            p pVar = oVar.h;
            dqc.d(pVar, TypedValues.Attributes.S_TARGET);
            nVar.a = pVar;
            nVar.removeAllViews();
            nVar.invalidate();
            new Handler().postDelayed(new Runnable() { // from class: -$$Lambda$cwg$cBVQDzZKD-ETHqqjC2a_G3PKtSY
                @Override // java.lang.Runnable
                public final void run() {
                    cwg.m79lambda$cBVQDzZKDETHqqjC2a_G3PKtSY(o.this);
                }
            }, 400L);
            return null;
        }
        oVar.a();
        return null;
    }

    public final void l() {
        if (!this.bb) {
            if (this.l.M()) {
                if (this.l.L()) {
                    return;
                }
                try {
                    this.l.m(true);
                    djl.a(getActivity()).c(this.bd, this.be);
                    return;
                } catch (JSONException e) {
                    e.printStackTrace();
                    return;
                }
            }
            this.s.a();
        }
    }

    private void b(boolean z) {
        this.aT.setVisibility(z ? 8 : 0);
        this.aU.setEnabled(z);
    }

    @Override // com.google.android.material.appbar.AppBarLayout.OnOffsetChangedListener, com.google.android.material.appbar.AppBarLayout.BaseOnOffsetChangedListener
    public void onOffsetChanged(AppBarLayout appBarLayout, int i) {
        float abs = (Math.abs(i) / appBarLayout.getTotalScrollRange()) * 100.0f;
        String.valueOf(abs);
        if (appBarLayout != null) {
            if (abs >= 85.0f) {
                this.bx = true;
                this.aq.setBackgroundColor(0);
                this.L.setBackgroundDrawable(ContextCompat.getDrawable(this.by, R.drawable.slider_rl_round_background));
                this.Q.animate().alpha(0.0f).setDuration(100L);
            } else if (abs >= 85.0f) {
            } else {
                this.bx = false;
                this.L.setBackgroundDrawable(ContextCompat.getDrawable(this.by, R.drawable.slider_rl_background));
                this.Q.animate().alpha(1.0f).setDuration(100L);
                this.aq.setBackgroundResource(R.drawable.rotator_center_background);
            }
        }
    }

    @Override // defpackage.dfx
    public final void a(NotificationCount notificationCount) {
        ((HomeActivity) this.by).a(notificationCount.getCount().intValue());
    }

    @Override // defpackage.dfx
    public final void m() {
        ((HomeActivity) this.by).a(0);
    }

    static /* synthetic */ void a(cwg cwgVar, Float f) {
        cwgVar.aJ.setText(String.valueOf(f));
        if (f.floatValue() >= 0.0f) {
            cwgVar.M.setVisibility(0);
        }
    }

    static /* synthetic */ boolean b(cwg cwgVar) {
        return cwgVar.l.c();
    }

    static /* synthetic */ void g(cwg cwgVar) {
        cwgVar.s.a();
        List asList = Arrays.asList(cwgVar.getResources().getStringArray(R.array.tutorial_title_postpaid_items));
        List asList2 = Arrays.asList(cwgVar.getResources().getStringArray(R.array.tutorial_body_postpaid_items));
        List asList3 = Arrays.asList(cwgVar.getResources().getStringArray(R.array.tutorial_title_prepaid_items));
        ArrayList arrayList = cwgVar.r.e() ? new ArrayList(asList2) : new ArrayList(Arrays.asList(cwgVar.getResources().getStringArray(R.array.tutorial_body_prepaid_items)));
        ArrayList arrayList2 = cwgVar.r.e() ? new ArrayList(asList) : new ArrayList(asList3);
        ArrayList arrayList3 = new ArrayList(Arrays.asList(((HomeActivity) cwgVar.aI).a.findViewById(R.id.navHome), cwgVar.az.findViewById(R.id.btn_current_number), cwgVar.az.findViewById(R.id.llUserPlan), cwgVar.az.findViewById(R.id.ioexample_toolbar), cwgVar.az.findViewById(R.id.llOutstandingBalance), cwgVar.az.findViewById(R.id.btn_balance_recharge_main), cwgVar.az.findViewById(R.id.btnManagePlan), cwgVar.az.findViewById(R.id.btn_extra_bundles), cwgVar.az.findViewById(R.id.rl_pointsCard), cwgVar.az.findViewById(R.id.rl_quick_access), cwgVar.aI.findViewById(R.id.fab), ((HomeActivity) cwgVar.aI).a.findViewById(R.id.navMore)));
        float dimensionPixelSize = cwgVar.getResources().getDimensionPixelSize(R.dimen.___40sdp);
        float dimensionPixelSize2 = cwgVar.getResources().getDimensionPixelSize(R.dimen.___28sdp);
        ArrayList arrayList4 = new ArrayList(Arrays.asList(Float.valueOf(dimensionPixelSize2), Float.valueOf(cwgVar.getResources().getDimensionPixelSize(R.dimen.___20sdp)), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(dimensionPixelSize), Float.valueOf(dimensionPixelSize), Float.valueOf(dimensionPixelSize), Float.valueOf(0.0f), Float.valueOf(0.0f), Float.valueOf(cwgVar.getResources().getDimensionPixelSize(R.dimen.___30sdp)), Float.valueOf(dimensionPixelSize2)));
        q.b bVar = q.b.BELOW;
        q.b bVar2 = q.b.ABOVE;
        ArrayList arrayList5 = new ArrayList(Arrays.asList(bVar2, bVar, bVar, bVar, bVar, bVar2, bVar2, bVar2, bVar2, bVar2, bVar2, bVar2));
        ArrayList arrayList6 = new ArrayList(Arrays.asList(Integer.valueOf((int) GravityCompat.START), Integer.valueOf((int) GravityCompat.START), 17, 17, Integer.valueOf((int) GravityCompat.END), Integer.valueOf((int) GravityCompat.START), 17, 17, 17, 17, 17, Integer.valueOf((int) GravityCompat.END)));
        if (!cwgVar.r.l()) {
            cwgVar.r.e();
        }
        if (cwgVar.N.getVisibility() == 8) {
            arrayList3.remove(8);
            arrayList2.remove(8);
            arrayList.remove(8);
            arrayList4.remove(8);
            arrayList6.remove(8);
            arrayList5.remove(8);
        }
        if (cwgVar.M.getVisibility() == 8) {
            arrayList3.remove(4);
            arrayList2.remove(4);
            arrayList.remove(4);
            arrayList4.remove(4);
            arrayList6.remove(4);
            arrayList5.remove(4);
        }
        if (cwgVar.ag.getVisibility() == 8) {
            arrayList3.remove(3);
            arrayList2.remove(3);
            arrayList.remove(3);
            arrayList6.remove(3);
            arrayList4.remove(3);
            arrayList5.remove(3);
        }
        if (((HomeActivity) cwgVar.aI).e.isEmpty()) {
            for (int i = 0; i < arrayList2.size(); i++) {
                ArrayList<q> arrayList7 = ((HomeActivity) cwgVar.aI).e;
                p.a aVar = new p.a(cwgVar.aI);
                View view = (View) arrayList3.get(i);
                dqc.d(view, "view");
                aVar.b = new WeakReference<>(view);
                p.a b = aVar.a().a((CharSequence) arrayList2.get(i)).b((CharSequence) arrayList.get(i));
                b.g = ((Float) arrayList4.get(i)).floatValue();
                p.a a = b.a();
                q.b bVar3 = (q.b) arrayList5.get(i);
                dqc.d(bVar3, "positionType");
                a.l = bVar3;
                p.a a2 = a.a();
                a2.m = Integer.valueOf(((Integer) arrayList6.get(i)).intValue());
                arrayList7.add(a2.a().b());
            }
            o.a aVar2 = o.a;
            Activity activity = cwgVar.aI;
            dqc.d(activity, "activity");
            final o oVar = new o(activity);
            ArrayList<q> arrayList8 = ((HomeActivity) cwgVar.aI).e;
            dqc.d(arrayList8, "targets");
            o oVar2 = oVar;
            oVar2.d.clear();
            oVar2.d.addAll(arrayList8);
            oVar2.e = arrayList8.size();
            ((TextView) arrayList8.get(0).j().findViewById(co.kyash.targetinstructions.R.id.tvCount)).setVisibility(8);
            TextView textView = (TextView) arrayList8.get(0).j().findViewById(co.kyash.targetinstructions.R.id.btnOk);
            Activity activity2 = oVar2.c;
            textView.setText(String.valueOf(activity2 == null ? null : activity2.getString(co.kyash.targetinstructions.R.string.take_tour)));
            ObjectAnimator ofFloat = ObjectAnimator.ofFloat(oVar2.b, "alpha", 0.0f, 1.0f);
            ofFloat.setDuration(300L);
            ofFloat.addListener(new o.d());
            ofFloat.start();
            oVar.a();
            cwgVar.l.c(false);
            oVar.g = new dov() { // from class: -$$Lambda$cwg$Z-CM_cIDhnAS9wcRI_sBH0KF3LY
                @Override // defpackage.dov
                public final Object invoke() {
                    return cwg.m78lambda$ZCM_cIDhnAS9wcRI_sBH0KF3LY(cwg.this);
                }
            };
            oVar.f = new dph() { // from class: -$$Lambda$cwg$1jO28R41KzVNF83QcoZx-p8BAf8
                @Override // defpackage.dph
                public final Object invoke(Object obj, Object obj2) {
                    return cwg.m77lambda$1jO28R41KzVNF83QcoZxp8BAf8(cwg.this, oVar, (q) obj, (dov) obj2);
                }
            };
        }
    }
}
