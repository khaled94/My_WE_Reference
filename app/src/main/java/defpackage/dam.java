package defpackage;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.SpinnerAdapter;
import android.widget.TextView;
import androidx.appcompat.widget.LinearLayoutCompat;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.ChangeMainPlanActivity;
import com.ucare.we.R;
import com.ucare.we.genericconfirmationscreen.GenericConfirmationActivity;
import com.ucare.we.manageplanspostpaid.CustomSpinner;
import com.ucare.we.manageplanspostpaid.ManagePlanMoreDetails;
import com.ucare.we.manageplanspostpaid.MigrateToPlanConfirmationActivity;
import com.ucare.we.model.MigrateModel.MigrateOffers;
import com.ucare.we.model.MoreBundleModel.ResponseViewMoreBundleBody;
import com.ucare.we.model.PlansAndBundlesResponseBody;
import com.ucare.we.model.RenewMainOfferModel.RenewMainOfferResponse;
import com.ucare.we.model.checkavailability.CheckAvailability;
import com.ucare.we.model.checkavailability.CheckAvailabilityRequest;
import com.ucare.we.model.checkavailability.CheckAvailabilityResponse;
import com.ucare.we.model.family.FamilyPlansResponseBody;
import com.ucare.we.paybillpaymentmethod.PaymentMethodActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.presentation.family.creategroup.CreateFamilyGroupPlansActivity;
import com.ucare.we.presentation.family.groupinfo.ManageGroupActivity;
import defpackage.au;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dam */
/* loaded from: classes2.dex */
public class dam extends dab implements dao, daq, dar, dck, dfo, dic, dju {
    private static final String w = dam.class.getSimpleName();
    private TextView A;
    private TextView B;
    private TextView C;
    private TextView D;
    private TextView E;
    private TextView F;
    private Button G;
    private Button H;
    private CustomSpinner I;
    private ImageView J;
    private ImageView K;
    private RecyclerView L;
    private LinearLayout M;
    private LinearLayoutCompat N;
    private LinearLayoutCompat O;
    private ConstraintLayout P;
    private boolean Q;
    private dan R;
    @Inject
    djg a;
    @Inject
    dhn b;
    @Inject
    djb c;
    @Inject
    djw d;
    @Inject
    did e;
    @Inject
    dhu f;
    dap g;
    @Inject
    dfp h;
    @Inject
    dio i;
    @Inject
    dhp j;
    ResponseViewMoreBundleBody l;
    PlansAndBundlesResponseBody m;
    PlansAndBundlesResponseBody n;
    String o;
    Context q;
    String r;
    boolean s;
    private ProgressDialog x;
    private TextView y;
    private TextView z;
    ArrayList<PlansAndBundlesResponseBody> k = new ArrayList<>();
    boolean p = false;
    View.OnClickListener t = new View.OnClickListener() { // from class: dam.1
        {
            dam.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (dam.this.d.v().equalsIgnoreCase("prepaid")) {
                if (dam.this.l == null) {
                    return;
                }
                dam.this.m = new PlansAndBundlesResponseBody();
                dam.this.m.setOfferId(dam.this.l.getOfferId());
                dam.this.m.setOfferArName(dam.this.l.getOfferArName());
                dam.this.m.setOfferEnName(dam.this.l.getOfferEnName());
                dam.this.m.setPrice(Float.valueOf(dam.this.l.getPrice()).floatValue());
                if (dam.this.m.getOfferId().equalsIgnoreCase("12042")) {
                    dam damVar = dam.this;
                    try {
                        djl.a(damVar.q).d(damVar.m.getOfferId(), damVar.o, damVar.v, damVar.u);
                        damVar.a.a(damVar.getActivity(), damVar.q.getString(R.string.loading));
                        return;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return;
                    }
                }
                dam.this.s = true;
                Intent intent = new Intent(dam.this.q, ChangeMainPlanActivity.class);
                intent.putExtra("planToBeChanged", dam.this.m);
                intent.putExtra("subscribe", true);
                intent.putExtra("price", dam.this.l.getPrice());
                dam.this.startActivityForResult(intent, 18);
                return;
            }
            dam.this.startActivity(new Intent(dam.this.getActivity(), PaymentMethodActivity.class));
        }
    };
    au.a u = new au.a() { // from class: dam.4
        {
            dam.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dam.this.a.a();
            UnNavigateResponseActivity.a(dam.this.q, dam.this.q.getString(R.string.check_network_connection), dam.this.q.getString(R.string.please_try_again), true);
        }
    };
    au.b<JSONObject> v = new au.b<JSONObject>() { // from class: dam.5
        {
            dam.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dam.this.a.a();
            RenewMainOfferResponse renewMainOfferResponse = (RenewMainOfferResponse) new Gson().a(jSONObject.toString(), (Class<Object>) RenewMainOfferResponse.class);
            dam.this.s = false;
            if (renewMainOfferResponse.getHeader().getResponseCode() != null && renewMainOfferResponse.getHeader().getResponseCode().equals("0")) {
                dam.a(dam.this.q, dam.this.q.getString(R.string.successfully), renewMainOfferResponse.getHeader().getResponseMessage());
            } else if ((renewMainOfferResponse.getHeader().getResponseCode() == null || !renewMainOfferResponse.getHeader().getResponseCode().equals("9001")) && !renewMainOfferResponse.getHeader().getResponseCode().equals("8001")) {
                dam.a(dam.this.q, renewMainOfferResponse.getHeader().getResponseMessage(), dam.this.q.getString(R.string.please_try_again), false);
            } else {
                dam.a(dam.this.q, renewMainOfferResponse.getHeader().getResponseMessage(), dam.this.q.getString(R.string.please_try_again), true);
            }
        }
    };

    static /* synthetic */ void c() {
    }

    public static /* synthetic */ void lambda$bcRrAhUDwTUC45Bk8Ugtm8kPwEk(dam damVar, boolean z, View view) {
        damVar.a(z, view);
    }

    @Override // defpackage.dic
    public final void a_(int i, String str) {
    }

    @Override // defpackage.dic
    public final void a_(List<PlansAndBundlesResponseBody> list) {
    }

    @Override // defpackage.dic
    public final void b_(int i, String str) {
    }

    @Override // defpackage.dic
    public final void b_(String str) {
    }

    @Override // defpackage.dic
    public final void c_(String str) {
    }

    @Override // defpackage.dic
    public final void d(int i, String str) {
    }

    @Override // defpackage.dic
    public final void d(String str) {
    }

    @Override // defpackage.dic
    public final void o_() {
    }

    public static dam a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("regional_popUp", z);
        dam damVar = new dam();
        damVar.setArguments(bundle);
        return damVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.manage_post_paid_plan_fragment_new, viewGroup, false);
        ProgressDialog progressDialog = new ProgressDialog(getActivity());
        this.x = progressDialog;
        progressDialog.setMessage(getString(R.string.loading));
        this.y = (TextView) inflate.findViewById(R.id.txtMainPlan);
        this.z = (TextView) inflate.findViewById(R.id.txtRenewalDate);
        this.A = (TextView) inflate.findViewById(R.id.txtRemainingDays);
        this.B = (TextView) inflate.findViewById(R.id.txtCost);
        this.G = (Button) inflate.findViewById(R.id.btnRenew);
        this.H = (Button) inflate.findViewById(R.id.btnCreateGroup);
        this.I = (CustomSpinner) inflate.findViewById(R.id.spinFilter);
        this.J = (ImageView) inflate.findViewById(R.id.ivSpinnerArrow);
        this.K = (ImageView) inflate.findViewById(R.id.im_mainPlan);
        this.L = (RecyclerView) inflate.findViewById(R.id.rvPlans);
        this.C = (TextView) inflate.findViewById(R.id.tv_choose_plan);
        this.F = (TextView) inflate.findViewById(R.id.tvExcludingVat);
        this.O = (LinearLayoutCompat) inflate.findViewById(R.id.ll_renew_plan);
        this.p = getArguments().getBoolean("regional_popUp");
        this.N = (LinearLayoutCompat) inflate.findViewById(R.id.llManagePlan);
        this.M = (LinearLayout) inflate.findViewById(R.id.llFilterSpin);
        this.P = (ConstraintLayout) inflate.findViewById(R.id.llSpin);
        this.D = (TextView) inflate.findViewById(R.id.tv_remainingLocks);
        this.E = (TextView) inflate.findViewById(R.id.tvCostHint);
        this.q = getActivity();
        this.Q = false;
        this.N.setVisibility(0);
        ArrayAdapter.createFromResource(getActivity(), R.array.regionalManagePlanSpinArray, R.layout.simple_spinner_item).setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.I.setAdapter((SpinnerAdapter) new dix(getContext(), Arrays.asList(getResources().getStringArray(R.array.regionalManagePlanSpinArray))));
        if (this.j.g != null && this.j.g.getRenewButtonMainBundle() != null) {
            if (this.j.g.getRenewButtonMainBundle().contains(this.d.w())) {
                this.G.setVisibility(0);
            } else {
                this.G.setVisibility(8);
            }
        }
        if (this.i.g() && !this.i.l()) {
            this.P.setVisibility(0);
        } else {
            this.P.setVisibility(8);
        }
        this.G.setOnClickListener(this.t);
        this.e.a(this);
        this.I.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: dam.2
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            {
                dam.this = this;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i, long j) {
                if (i == 1) {
                    ArrayList arrayList = new ArrayList();
                    Iterator<PlansAndBundlesResponseBody> it = dam.this.k.iterator();
                    while (it.hasNext()) {
                        PlansAndBundlesResponseBody next = it.next();
                        if (next.getRegional().booleanValue()) {
                            arrayList.add(next);
                        }
                    }
                    dam.this.a(arrayList, Boolean.FALSE);
                } else if (dam.this.k.size() == 0) {
                    dam.this.P.setVisibility(8);
                    dam.this.C.setText(dam.this.getString(R.string.no_plans));
                } else {
                    dam.this.P.setVisibility(0);
                    dam damVar = dam.this;
                    damVar.a(damVar.k, Boolean.FALSE);
                }
                dam.c();
            }
        });
        this.I.setSpinnerEventsListener(new CustomSpinner.a() { // from class: dam.3
            {
                dam.this = this;
            }

            @Override // com.ucare.we.manageplanspostpaid.CustomSpinner.a
            public final void a() {
                dam.this.J.setImageResource(R.drawable.ic_drop_down);
                dam.this.J.setRotation(0.0f);
            }

            @Override // com.ucare.we.manageplanspostpaid.CustomSpinner.a
            public final void b() {
                dam.this.J.setImageResource(R.drawable.ic_drop_down);
                dam.this.J.setRotation(180.0f);
            }
        });
        this.g = new dap(this.q, this);
        return inflate;
    }

    private Boolean d() {
        ArrayList arrayList = new ArrayList();
        ArrayList<PlansAndBundlesResponseBody> arrayList2 = this.k;
        if (arrayList2 != null) {
            Iterator<PlansAndBundlesResponseBody> it = arrayList2.iterator();
            while (it.hasNext()) {
                PlansAndBundlesResponseBody next = it.next();
                if (next != null && next.getRegional().booleanValue()) {
                    arrayList.add(next);
                }
            }
        }
        return Boolean.valueOf(arrayList.size() > 0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        final boolean z = false;
        if (this.d.P() != null && this.d.P().isSubscribed() && this.d.P().isOwner()) {
            this.H.setText(getString(R.string.manage_group));
            this.H.setVisibility(0);
            z = true;
        } else if (!this.s) {
            this.h.a();
            this.h.a(this);
        }
        this.H.setOnClickListener(new View.OnClickListener() { // from class: -$$Lambda$dam$bcRrAhUDwTUC45Bk8Ugtm8kPwEk
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                dam.lambda$bcRrAhUDwTUC45Bk8Ugtm8kPwEk(dam.this, z, view);
            }
        });
    }

    public /* synthetic */ void a(boolean z, View view) {
        startActivity(new Intent(getActivity(), z ? ManageGroupActivity.class : CreateFamilyGroupPlansActivity.class));
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.R = new dan(this.q, this, this);
        if (this.d.v().equalsIgnoreCase("prepaid")) {
            this.G.setText(this.q.getString(R.string.renew));
            this.F.setVisibility(8);
        } else {
            this.G.setText(this.q.getString(R.string.pay_bill));
            this.F.setVisibility(8);
        }
        this.f.d = this;
        try {
            b(true);
            this.R.b();
            this.R.a();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
    }

    @Override // defpackage.dao, defpackage.daq
    public final void b(boolean z) {
        if (isAdded()) {
            if (z) {
                this.a.a(getActivity(), this.q.getString(R.string.loading));
            } else {
                this.a.a();
            }
        }
    }

    @Override // defpackage.dao
    public final void a(ResponseViewMoreBundleBody responseViewMoreBundleBody) {
        this.l = responseViewMoreBundleBody;
        if (responseViewMoreBundleBody != null) {
            this.O.setVisibility(0);
            int i = R.drawable.ic_mobile_number;
            try {
                bo.b(this.q).a(responseViewMoreBundleBody.getOfferDetails().getIconUrl().trim()).a(this.i.f() ? R.drawable.ic_mobile_number : R.drawable.ic_fbb_number).b(this.i.f() ? R.drawable.ic_mobile_number : R.drawable.ic_fbb_number).a(this.K);
            } catch (Exception unused) {
                bu<Drawable> a = bo.b(this.q).a(Integer.valueOf(this.i.f() ? R.drawable.ic_mobile_number : R.drawable.ic_fbb_number));
                if (!this.i.f()) {
                    i = R.drawable.ic_fbb_number;
                }
                a.a(i).a(this.K);
            }
            if (this.c.f()) {
                if (responseViewMoreBundleBody.getStatusCode() != null) {
                    if (responseViewMoreBundleBody.getStatusCode().equalsIgnoreCase("4")) {
                        this.z.setText(responseViewMoreBundleBody.getStatus());
                    } else if (h(responseViewMoreBundleBody.getRenewalDate())) {
                        this.z.setText(djm.b(responseViewMoreBundleBody.getRenewalDate()));
                    } else {
                        this.z.setText("");
                    }
                } else if (h(responseViewMoreBundleBody.getRenewalDate())) {
                    this.z.setText(djm.b(responseViewMoreBundleBody.getRenewalDate()));
                } else {
                    this.z.setText("");
                }
                this.y.setText(responseViewMoreBundleBody.getOfferArName());
            } else {
                if (responseViewMoreBundleBody.getStatusCode() != null) {
                    if (responseViewMoreBundleBody.getStatusCode().equalsIgnoreCase("4")) {
                        this.z.setText(responseViewMoreBundleBody.getStatus());
                    } else if (h(responseViewMoreBundleBody.getRenewalDate())) {
                        this.z.setText(djm.b(responseViewMoreBundleBody.getRenewalDate()));
                    } else {
                        this.z.setText("");
                    }
                } else if (h(responseViewMoreBundleBody.getRenewalDate())) {
                    this.z.setText(djm.b(responseViewMoreBundleBody.getRenewalDate()));
                } else {
                    this.z.setText("");
                }
                this.y.setText(responseViewMoreBundleBody.getOfferEnName());
            }
            StringBuilder sb = new StringBuilder();
            String str = "0";
            sb.append(responseViewMoreBundleBody.getRemainingDaysForRenewal() != null ? responseViewMoreBundleBody.getRemainingDaysForRenewal() : str);
            sb.append(" ");
            sb.append(this.q.getString(R.string.days));
            this.A.setText(sb.toString());
            if (responseViewMoreBundleBody.getPrice() != null) {
                str = responseViewMoreBundleBody.getPrice();
            }
            TextView textView = this.B;
            textView.setText(getString(R.string.price_lbl) + " " + str + " " + getString(R.string.egp));
            if (responseViewMoreBundleBody.getRenewalInfo() != null && responseViewMoreBundleBody.getRenewalInfo().getRemainingLocks() > 0) {
                this.D.setVisibility(0);
                if (responseViewMoreBundleBody.getRenewalInfo().getRemainingLocks() == 1) {
                    TextView textView2 = this.D;
                    textView2.setText(getString(R.string.remaining_locks) + " " + responseViewMoreBundleBody.getRenewalInfo().getRemainingLocks() + " " + this.q.getString(R.string.renewal));
                } else {
                    TextView textView3 = this.D;
                    textView3.setText(getString(R.string.remaining_locks) + " " + responseViewMoreBundleBody.getRenewalInfo().getRemainingLocks() + " " + this.q.getString(R.string.renewals));
                }
            }
            if (this.i.d() && !responseViewMoreBundleBody.isRenewable()) {
                this.G.setAlpha(0.4f);
                this.G.setOnClickListener(null);
            }
            this.C.setText(this.q.getString(R.string.choose_plan));
            return;
        }
        this.O.setVisibility(8);
    }

    @Override // defpackage.dao
    public final void b(List<PlansAndBundlesResponseBody> list) {
        this.N.setVisibility(0);
        if (list == null) {
            this.L.setVisibility(8);
        } else if (isAdded()) {
            ArrayList<PlansAndBundlesResponseBody> arrayList = new ArrayList<>();
            for (int i = 0; i < list.size(); i++) {
                if (list.get(i).getType() != null && list.get(i).getType().equalsIgnoreCase("M") && !list.get(i).isAlreadySubscribed()) {
                    arrayList.add(list.get(i));
                }
                if (list.get(i).getType() != null && list.get(i).getType().equalsIgnoreCase("M") && list.get(i).isAlreadySubscribed()) {
                    this.o = list.get(i).getParentOfferId();
                }
            }
            if (arrayList.size() == 0) {
                this.C.setText(getString(R.string.no_plans));
                return;
            }
            this.k = arrayList;
            this.C.setText(getString(R.string.choose_plan));
            if (d().booleanValue()) {
                this.P.setVisibility(0);
            } else {
                this.P.setVisibility(8);
            }
            if (this.p) {
                this.I.setSelection(1);
                ArrayList<PlansAndBundlesResponseBody> arrayList2 = new ArrayList<>();
                Iterator<PlansAndBundlesResponseBody> it = this.k.iterator();
                while (it.hasNext()) {
                    PlansAndBundlesResponseBody next = it.next();
                    if (next != null && next.getRegional().booleanValue()) {
                        arrayList2.add(next);
                    }
                }
                a(arrayList2, Boolean.FALSE);
                return;
            }
            a(arrayList, Boolean.FALSE);
        }
    }

    public void a(ArrayList<PlansAndBundlesResponseBody> arrayList, Boolean bool) {
        dal dalVar = new dal(this.q, arrayList, bool, this.j, this);
        this.L.setLayoutManager(new LinearLayoutManager(this.q, 1, false));
        this.L.setHasFixedSize(true);
        this.L.setAdapter(dalVar);
    }

    @Override // defpackage.dao
    public final void b() {
        if (isAdded()) {
            this.C.setText(getString(R.string.no_plans));
        }
    }

    @Override // defpackage.dao
    public final void e(String str) {
        if (str.equalsIgnoreCase("460001850")) {
            this.Q = true;
        } else {
            this.Q = false;
        }
    }

    @Override // defpackage.dar
    public final void a(PlansAndBundlesResponseBody plansAndBundlesResponseBody) {
        Boolean valueOf = Boolean.valueOf(this.d.w().contains("_FD_"));
        this.n = plansAndBundlesResponseBody;
        if (valueOf.booleanValue()) {
            if (this.d.b("en").equalsIgnoreCase("en")) {
                this.r = plansAndBundlesResponseBody.getOfferEnName();
            } else {
                this.r = plansAndBundlesResponseBody.getOfferArName();
            }
            this.a.a(getActivity(), getString(R.string.loading));
            CheckAvailabilityRequest checkAvailabilityRequest = new CheckAvailabilityRequest();
            CheckAvailability checkAvailability = new CheckAvailability();
            checkAvailability.offerId = plansAndBundlesResponseBody.getOfferId();
            checkAvailability.parentOfferId = plansAndBundlesResponseBody.getParentOfferId();
            checkAvailabilityRequest.checkAvilability = checkAvailability;
            this.f.a(checkAvailabilityRequest);
            return;
        }
        Intent intent = new Intent(this.q, MigrateToPlanConfirmationActivity.class);
        intent.putExtra("id_add", plansAndBundlesResponseBody.getOfferId());
        intent.putExtra("price_add", plansAndBundlesResponseBody.getPrice());
        intent.putExtra("id_remove", plansAndBundlesResponseBody.getParentOfferId());
        if (this.c.f()) {
            intent.putExtra("name_add", plansAndBundlesResponseBody.getOfferArName());
        } else {
            intent.putExtra("name_add", plansAndBundlesResponseBody.getOfferEnName());
        }
        startActivity(intent);
    }

    @Override // defpackage.dar
    public final void a(String str, String str2) {
        Boolean.valueOf(this.d.w().contains("_FD_"));
        this.n = this.m;
        String str3 = (!this.Q ? !this.c.f() : !this.c.f()) ? str : str2;
        if (this.i.g()) {
            str3 = this.c.f() ? str2 : str;
        }
        if (!this.i.h()) {
            str = str3;
        } else if (this.c.f()) {
            str = str2;
        }
        Intent intent = new Intent(this.q, ManagePlanMoreDetails.class);
        intent.putExtra(ManagePlanMoreDetails.a, str);
        startActivity(intent);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.q, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            b(true);
            try {
                this.R.b();
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i != 2) {
        } else {
            b(true);
            try {
                this.R.a();
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 18) {
            if (i2 != -1) {
                return;
            }
            try {
                djl.a(this.q).d(this.m.getOfferId(), this.o, this.v, this.u);
                this.a.a(getActivity(), this.q.getString(R.string.loading));
            } catch (JSONException e) {
                e.printStackTrace();
            }
        } else if (i != 19 || i2 != -1) {
        } else {
            b(true);
            MigrateOffers migrateOffers = new MigrateOffers();
            migrateOffers.offerId = this.n.getOfferId();
            migrateOffers.parentOfferId = this.n.getParentOfferId();
            try {
                this.g.a(migrateOffers);
            } catch (JSONException e2) {
                e2.printStackTrace();
            }
        }
    }

    private static boolean h(String str) {
        return str != null && !str.isEmpty() && !str.equals("");
    }

    @Override // defpackage.dic
    public final void d_(String str) {
        Context context = this.q;
        UnNavigateResponseActivity.a(context, context.getString(R.string.successfully), str, false);
    }

    @Override // defpackage.dic
    public final void c(int i, String str) {
        UnNavigateResponseActivity.a(this.q, str, null, true);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStop() {
        super.onStop();
    }

    @Override // defpackage.dck
    public final void a(CheckAvailabilityResponse checkAvailabilityResponse) {
        this.a.a();
        String str = "";
        String message = checkAvailabilityResponse.getHasMessage().booleanValue() ? checkAvailabilityResponse.getMessage() : str;
        checkAvailabilityResponse.getMessage();
        Intent intent = new Intent(this.q, GenericConfirmationActivity.class);
        intent.putExtra("confirmation_title", getString(R.string.manage_plan));
        if (this.i.g()) {
            str = getString(R.string.plan_change_hint);
        }
        if (this.c.g().equalsIgnoreCase("ar")) {
            intent.putExtra("confirmation_hint", getString(R.string.CL_confirmation_first) + this.l.getOfferArName() + "\n" + getString(R.string.CL_confirmation_second) + " " + this.r + "\n" + message + "\n" + str);
        } else {
            intent.putExtra("confirmation_hint", getString(R.string.CL_confirmation_first) + this.l.getOfferEnName() + "\n" + getString(R.string.CL_confirmation_second) + " " + this.r + "\n" + message + "\n" + str);
        }
        startActivityForResult(intent, 19);
    }

    @Override // defpackage.dck
    public final void f(String str) {
        this.a.a();
        UnNavigateResponseActivity.a(this.q, str, getString(R.string.please_try_again), true);
    }

    @Override // defpackage.dfo
    public final void a(ArrayList<FamilyPlansResponseBody> arrayList) {
        int i;
        String str;
        if (arrayList == null || arrayList.size() <= 0) {
            i = 8;
            str = "";
        } else {
            i = 0;
            str = getString(R.string.create_group);
        }
        this.H.setText(str);
        this.H.setVisibility(i);
    }

    @Override // defpackage.dfo
    public final void g(String str) {
        this.H.setVisibility(8);
    }

    static /* synthetic */ void a(Context context, String str, String str2) {
        Intent intent = new Intent(context, UnNavigateResponseActivity.class);
        intent.putExtra("success_msg", str);
        intent.putExtra("success_msg_details", str2);
        intent.putExtra("isError", false);
        context.startActivity(intent);
    }

    static /* synthetic */ void a(Context context, String str, String str2, boolean z) {
        Intent intent = new Intent(context, UnNavigateResponseActivity.class);
        intent.putExtra("success_msg", str);
        intent.putExtra("success_msg_details", str2);
        intent.putExtra("isError", true);
        intent.putExtra("showRecharge", z);
        context.startActivity(intent);
    }
}
