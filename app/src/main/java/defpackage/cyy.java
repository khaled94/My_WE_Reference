package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.RelativeLayout;
import android.widget.TextView;
import android.widget.Toast;
import com.ucare.we.R;
import com.ucare.we.StoreLocatorActivity;
import com.ucare.we.model.AreasModel.Area;
import com.ucare.we.model.CitiesModel.City;
import com.ucare.we.model.StoreResponseBody;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity;
import com.ucare.we.presentation.adslprepaid.ADSLPrePaidMainActivity;
import com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity;
import com.ucare.we.presentation.corporateadslprepaid.CorporateADSLPrePaidMainActivity;
import com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity;
import com.ucare.we.presentation.corporateprepaid.CorporatePrePaidMainActivity;
import com.ucare.we.presentation.fmcuser.FMCMainActivity;
import com.ucare.we.presentation.postpaid.PostPaidMainActivity;
import com.ucare.we.presentation.prepaid.MainActivity;
import defpackage.au;
import defpackage.djl;
import java.util.ArrayList;
import javax.inject.Inject;
import org.json.JSONArray;
import org.json.JSONException;

/* renamed from: cyy  reason: default package */
/* loaded from: classes2.dex */
public class cyy extends dab implements cza {
    @Inject
    djw a;
    @Inject
    djb b;
    @Inject
    djg c;
    @Inject
    dio d;
    boolean e = false;
    View.OnClickListener f = new View.OnClickListener() { // from class: cyy.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (!cyy.this.e) {
                if (cyy.this.d.l()) {
                    FMCMainActivity fMCMainActivity = (FMCMainActivity) cyy.this.getActivity();
                    fMCMainActivity.a(czt.a(cyy.this.m, false));
                    fMCMainActivity.x.setVisibility(0);
                    fMCMainActivity.x.setText(fMCMainActivity.getString(R.string.select_city));
                    fMCMainActivity.m.setVisibility(8);
                    fMCMainActivity.ae.setVisibility(8);
                    fMCMainActivity.r.setVisibility(0);
                    fMCMainActivity.af.setVisibility(8);
                    return;
                } else if (cyy.this.a.v().equalsIgnoreCase("prepaid")) {
                    if (cyy.this.d.f() && cyy.this.d.h()) {
                        CorporatePrePaidMainActivity corporatePrePaidMainActivity = (CorporatePrePaidMainActivity) cyy.this.getActivity();
                        corporatePrePaidMainActivity.a(czt.a(cyy.this.m, false));
                        corporatePrePaidMainActivity.r.setVisibility(0);
                        corporatePrePaidMainActivity.r.setText(corporatePrePaidMainActivity.getString(R.string.select_city));
                        corporatePrePaidMainActivity.m.setVisibility(8);
                        corporatePrePaidMainActivity.H.setVisibility(8);
                        corporatePrePaidMainActivity.m.setVisibility(8);
                        return;
                    } else if (cyy.this.d.g() && cyy.this.d.h()) {
                        CorporateADSLPrePaidMainActivity corporateADSLPrePaidMainActivity = (CorporateADSLPrePaidMainActivity) cyy.this.getActivity();
                        corporateADSLPrePaidMainActivity.a(czt.a(cyy.this.m, false));
                        corporateADSLPrePaidMainActivity.s.setVisibility(0);
                        corporateADSLPrePaidMainActivity.s.setText(corporateADSLPrePaidMainActivity.getString(R.string.select_city));
                        corporateADSLPrePaidMainActivity.n.setVisibility(8);
                        corporateADSLPrePaidMainActivity.L.setVisibility(8);
                        corporateADSLPrePaidMainActivity.n.setVisibility(8);
                        return;
                    } else if (cyy.this.d.g() && !cyy.this.d.h()) {
                        ADSLPrePaidMainActivity aDSLPrePaidMainActivity = (ADSLPrePaidMainActivity) cyy.this.getActivity();
                        aDSLPrePaidMainActivity.a(czt.a(cyy.this.m, false));
                        aDSLPrePaidMainActivity.t.setVisibility(0);
                        aDSLPrePaidMainActivity.t.setText(aDSLPrePaidMainActivity.getString(R.string.select_city));
                        aDSLPrePaidMainActivity.o.setVisibility(8);
                        aDSLPrePaidMainActivity.I.setVisibility(8);
                        aDSLPrePaidMainActivity.o.setVisibility(8);
                        return;
                    } else if (!cyy.this.d.f() || cyy.this.d.h()) {
                        return;
                    } else {
                        MainActivity mainActivity = (MainActivity) cyy.this.getActivity();
                        mainActivity.a(czt.a(cyy.this.m, false));
                        mainActivity.r.setVisibility(0);
                        mainActivity.r.setText(mainActivity.getString(R.string.select_city));
                        mainActivity.m.setVisibility(8);
                        mainActivity.D.setVisibility(8);
                        mainActivity.m.setVisibility(8);
                        return;
                    }
                } else if (!cyy.this.a.v().equalsIgnoreCase("postpaid")) {
                    return;
                } else {
                    if (cyy.this.d.f() && cyy.this.d.h()) {
                        CorporatePostPaidMainActivity corporatePostPaidMainActivity = (CorporatePostPaidMainActivity) cyy.this.getActivity();
                        corporatePostPaidMainActivity.a(czt.a(cyy.this.m, false));
                        corporatePostPaidMainActivity.z.setVisibility(0);
                        corporatePostPaidMainActivity.z.setText(corporatePostPaidMainActivity.getString(R.string.select_city));
                        corporatePostPaidMainActivity.n.setVisibility(8);
                        corporatePostPaidMainActivity.aa.setVisibility(8);
                        corporatePostPaidMainActivity.t.setVisibility(0);
                        corporatePostPaidMainActivity.ab.setVisibility(8);
                        return;
                    } else if (cyy.this.d.g() && cyy.this.d.h()) {
                        CorporateADSLPostPaidMainActivity corporateADSLPostPaidMainActivity = (CorporateADSLPostPaidMainActivity) cyy.this.getActivity();
                        corporateADSLPostPaidMainActivity.a(czt.a(cyy.this.m, false));
                        corporateADSLPostPaidMainActivity.s.setVisibility(0);
                        corporateADSLPostPaidMainActivity.s.setText(corporateADSLPostPaidMainActivity.getString(R.string.select_city));
                        corporateADSLPostPaidMainActivity.l.setVisibility(8);
                        corporateADSLPostPaidMainActivity.aj.setVisibility(8);
                        corporateADSLPostPaidMainActivity.p.setVisibility(0);
                        return;
                    } else if (cyy.this.d.g() && !cyy.this.d.h()) {
                        ADSLPostPaidMainActivity aDSLPostPaidMainActivity = (ADSLPostPaidMainActivity) cyy.this.getActivity();
                        aDSLPostPaidMainActivity.a(czt.a(cyy.this.m, false));
                        aDSLPostPaidMainActivity.R.setVisibility(0);
                        aDSLPostPaidMainActivity.R.setText(aDSLPostPaidMainActivity.getString(R.string.select_city));
                        aDSLPostPaidMainActivity.j.setVisibility(8);
                        aDSLPostPaidMainActivity.S.setVisibility(8);
                        aDSLPostPaidMainActivity.z.setVisibility(0);
                        return;
                    } else if (!cyy.this.d.f() || cyy.this.d.h()) {
                        return;
                    } else {
                        PostPaidMainActivity postPaidMainActivity = (PostPaidMainActivity) cyy.this.getActivity();
                        postPaidMainActivity.a(czt.a(cyy.this.m, false));
                        postPaidMainActivity.u.setVisibility(0);
                        postPaidMainActivity.u.setText(postPaidMainActivity.getString(R.string.select_city));
                        postPaidMainActivity.l.setVisibility(8);
                        postPaidMainActivity.ae.setVisibility(8);
                        postPaidMainActivity.r.setVisibility(0);
                        postPaidMainActivity.af.setVisibility(8);
                        return;
                    }
                }
            }
            StoreLocatorActivity storeLocatorActivity = (StoreLocatorActivity) cyy.this.getActivity();
            storeLocatorActivity.a(czt.a(cyy.this.m, true));
            storeLocatorActivity.g.setText(storeLocatorActivity.getString(R.string.select_area));
            storeLocatorActivity.a(storeLocatorActivity.getString(R.string.select_area), false, false);
        }
    };
    View.OnClickListener g = new View.OnClickListener() { // from class: cyy.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cyy.this.m == null) {
                Toast.makeText(cyy.this.p, (int) R.string.select_city_first, 1).show();
            } else if (!cyy.this.e) {
                if (cyy.this.d.l()) {
                    FMCMainActivity fMCMainActivity = (FMCMainActivity) cyy.this.getActivity();
                    fMCMainActivity.a(czo.a(cyy.this.m, cyy.this.n, false));
                    fMCMainActivity.x.setVisibility(0);
                    fMCMainActivity.x.setText(fMCMainActivity.getString(R.string.select_area));
                    fMCMainActivity.m.setVisibility(8);
                    fMCMainActivity.ae.setVisibility(8);
                    fMCMainActivity.r.setVisibility(0);
                    fMCMainActivity.af.setVisibility(8);
                } else if (cyy.this.a.v().equalsIgnoreCase("prepaid")) {
                    if (cyy.this.d.f() && cyy.this.d.h()) {
                        CorporatePrePaidMainActivity corporatePrePaidMainActivity = (CorporatePrePaidMainActivity) cyy.this.getActivity();
                        corporatePrePaidMainActivity.a(czo.a(cyy.this.m, cyy.this.n, false));
                        corporatePrePaidMainActivity.r.setVisibility(0);
                        corporatePrePaidMainActivity.r.setText(corporatePrePaidMainActivity.getString(R.string.select_area));
                        corporatePrePaidMainActivity.m.setVisibility(8);
                        corporatePrePaidMainActivity.H.setVisibility(8);
                        corporatePrePaidMainActivity.m.setVisibility(8);
                    } else if (cyy.this.d.g() && cyy.this.d.h()) {
                        CorporateADSLPrePaidMainActivity corporateADSLPrePaidMainActivity = (CorporateADSLPrePaidMainActivity) cyy.this.getActivity();
                        corporateADSLPrePaidMainActivity.a(czo.a(cyy.this.m, cyy.this.n, false));
                        corporateADSLPrePaidMainActivity.s.setVisibility(0);
                        corporateADSLPrePaidMainActivity.s.setText(corporateADSLPrePaidMainActivity.getString(R.string.select_area));
                        corporateADSLPrePaidMainActivity.n.setVisibility(8);
                        corporateADSLPrePaidMainActivity.L.setVisibility(8);
                        corporateADSLPrePaidMainActivity.n.setVisibility(8);
                    } else if (cyy.this.d.g() && !cyy.this.d.h()) {
                        ADSLPrePaidMainActivity aDSLPrePaidMainActivity = (ADSLPrePaidMainActivity) cyy.this.getActivity();
                        aDSLPrePaidMainActivity.a(czo.a(cyy.this.m, cyy.this.n, false));
                        aDSLPrePaidMainActivity.t.setVisibility(0);
                        aDSLPrePaidMainActivity.t.setText(aDSLPrePaidMainActivity.getString(R.string.select_area));
                        aDSLPrePaidMainActivity.o.setVisibility(8);
                        aDSLPrePaidMainActivity.I.setVisibility(8);
                        aDSLPrePaidMainActivity.o.setVisibility(8);
                    } else if (!cyy.this.d.f() || cyy.this.d.h()) {
                    } else {
                        MainActivity mainActivity = (MainActivity) cyy.this.getActivity();
                        mainActivity.a(czo.a(cyy.this.m, cyy.this.n, false));
                        mainActivity.r.setVisibility(0);
                        mainActivity.r.setText(mainActivity.getString(R.string.select_area));
                        mainActivity.m.setVisibility(8);
                        mainActivity.D.setVisibility(8);
                        mainActivity.m.setVisibility(8);
                    }
                } else if (!cyy.this.a.v().equalsIgnoreCase("postpaid")) {
                } else {
                    if (cyy.this.d.f() && cyy.this.d.h()) {
                        CorporatePostPaidMainActivity corporatePostPaidMainActivity = (CorporatePostPaidMainActivity) cyy.this.getActivity();
                        corporatePostPaidMainActivity.a(czo.a(cyy.this.m, cyy.this.n, false));
                        corporatePostPaidMainActivity.z.setVisibility(0);
                        corporatePostPaidMainActivity.z.setText(corporatePostPaidMainActivity.getString(R.string.select_area));
                        corporatePostPaidMainActivity.n.setVisibility(8);
                        corporatePostPaidMainActivity.aa.setVisibility(8);
                        corporatePostPaidMainActivity.t.setVisibility(0);
                        corporatePostPaidMainActivity.ab.setVisibility(8);
                    } else if (cyy.this.d.g() && cyy.this.d.h()) {
                        CorporateADSLPostPaidMainActivity corporateADSLPostPaidMainActivity = (CorporateADSLPostPaidMainActivity) cyy.this.getActivity();
                        corporateADSLPostPaidMainActivity.a(czo.a(cyy.this.m, cyy.this.n, false));
                        corporateADSLPostPaidMainActivity.s.setVisibility(0);
                        corporateADSLPostPaidMainActivity.s.setText(corporateADSLPostPaidMainActivity.getString(R.string.select_area));
                        corporateADSLPostPaidMainActivity.l.setVisibility(8);
                        corporateADSLPostPaidMainActivity.aj.setVisibility(8);
                        corporateADSLPostPaidMainActivity.p.setVisibility(0);
                    } else if (cyy.this.d.g() && !cyy.this.d.h()) {
                        ADSLPostPaidMainActivity aDSLPostPaidMainActivity = (ADSLPostPaidMainActivity) cyy.this.getActivity();
                        aDSLPostPaidMainActivity.a(czo.a(cyy.this.m, cyy.this.n, false));
                        aDSLPostPaidMainActivity.R.setVisibility(0);
                        aDSLPostPaidMainActivity.R.setText(aDSLPostPaidMainActivity.getString(R.string.select_area));
                        aDSLPostPaidMainActivity.j.setVisibility(8);
                        aDSLPostPaidMainActivity.S.setVisibility(8);
                        aDSLPostPaidMainActivity.z.setVisibility(0);
                    } else if (!cyy.this.d.f() || cyy.this.d.h()) {
                    } else {
                        PostPaidMainActivity postPaidMainActivity = (PostPaidMainActivity) cyy.this.getActivity();
                        postPaidMainActivity.a(czo.a(cyy.this.m, cyy.this.n, false));
                        postPaidMainActivity.u.setVisibility(0);
                        postPaidMainActivity.u.setText(postPaidMainActivity.getString(R.string.select_area));
                        postPaidMainActivity.l.setVisibility(8);
                        postPaidMainActivity.ae.setVisibility(8);
                        postPaidMainActivity.r.setVisibility(0);
                        postPaidMainActivity.af.setVisibility(8);
                    }
                }
            } else {
                StoreLocatorActivity storeLocatorActivity = (StoreLocatorActivity) cyy.this.getActivity();
                storeLocatorActivity.a(czo.a(cyy.this.m, cyy.this.n, true));
                storeLocatorActivity.g.setText(storeLocatorActivity.getString(R.string.select_area));
                storeLocatorActivity.a(storeLocatorActivity.getString(R.string.select_area), false, false);
            }
        }
    };
    View.OnClickListener h = new View.OnClickListener() { // from class: cyy.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cyy.this.m == null) {
                Toast.makeText(cyy.this.p, (int) R.string.select_city_first, 1).show();
            } else if (cyy.this.n == null) {
                Toast.makeText(cyy.this.p, (int) R.string.select_area_first, 1).show();
            } else {
                cyz cyzVar = cyy.this.s;
                Area area = cyy.this.n;
                try {
                    cyzVar.b.b();
                    djl a = djl.a(cyzVar.a);
                    au.b<JSONArray> bVar = cyzVar.c;
                    au.a aVar = cyzVar.d;
                    bi biVar = new bi("https://te.eg/WebServices/REST/Store/getStoreByAreaid/" + area.getAreaID(), bVar, aVar);
                    biVar.l = djl.a.MAIN_PLAN;
                    biVar.j = new am(60000, 0, 0.0f);
                    a.b.a((as) biVar);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            }
        }
    };
    private RelativeLayout i;
    private RelativeLayout j;
    private TextView k;
    private TextView l;
    private City m;
    private Area n;
    private Button o;
    private Context p;
    private czs q;
    private czn r;
    private cyz s;

    public static cyy a(boolean z) {
        cyy cyyVar = new cyy();
        Bundle bundle = new Bundle();
        bundle.putParcelable("city_object", null);
        bundle.putParcelable("area_object", null);
        bundle.putBoolean("fmcMoreFlag", z);
        cyyVar.setArguments(bundle);
        return cyyVar;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.p = getActivity();
        this.q = (czs) getActivity();
        this.r = (czn) getActivity();
        this.s = new cyz(this.p, this);
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.m = (City) getArguments().getParcelable("city_object");
            this.n = (Area) getArguments().getParcelable("area_object");
            this.e = getArguments().getBoolean("fmcMoreFlag", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_choose_location, viewGroup, false);
        this.j = (RelativeLayout) inflate.findViewById(R.id.rlSelectArea);
        this.i = (RelativeLayout) inflate.findViewById(R.id.rlSelectCity);
        this.k = (TextView) inflate.findViewById(R.id.tvSelectedArea);
        this.l = (TextView) inflate.findViewById(R.id.tvSelectedCity);
        this.o = (Button) inflate.findViewById(R.id.btnSearch);
        this.j.setOnClickListener(this.g);
        this.i.setOnClickListener(this.f);
        this.o.setOnClickListener(this.h);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (!this.e) {
            if (this.d.l()) {
                ((FMCMainActivity) getActivity()).g(getString(R.string.choose_location));
            } else if (this.a.v().equalsIgnoreCase("prepaid")) {
                if (this.d.f() && this.d.h()) {
                    ((CorporatePrePaidMainActivity) getActivity()).g(getString(R.string.choose_location));
                } else if (this.d.g() && this.d.h()) {
                    ((CorporateADSLPrePaidMainActivity) getActivity()).g(getString(R.string.choose_location));
                } else if (this.d.g() && !this.d.h()) {
                    ((ADSLPrePaidMainActivity) getActivity()).g(getString(R.string.choose_location));
                } else if (this.d.f() && !this.d.h()) {
                    ((MainActivity) getActivity()).g(getString(R.string.choose_location));
                }
            } else if (this.a.v().equalsIgnoreCase("postpaid")) {
                if (this.d.f() && this.d.h()) {
                    ((CorporatePostPaidMainActivity) getActivity()).g(getString(R.string.choose_location));
                } else if (this.d.g() && this.d.h()) {
                    ((CorporateADSLPostPaidMainActivity) getActivity()).g(getString(R.string.choose_location));
                } else if (this.d.g() && !this.d.h()) {
                    ((ADSLPostPaidMainActivity) getActivity()).g(getString(R.string.choose_location));
                } else if (this.d.f() && !this.d.h()) {
                    ((PostPaidMainActivity) getActivity()).g(getString(R.string.choose_location));
                }
            }
        }
        if (this.q.c() != null) {
            this.m = this.q.c();
            if (this.b.g().equalsIgnoreCase("en")) {
                this.l.setText(this.m.getCityEnglish());
            } else {
                this.l.setText(this.m.getCityArabic());
            }
        }
        if (this.r.d() != null) {
            this.n = this.r.d();
            if (this.b.g().equalsIgnoreCase("en")) {
                this.k.setText(this.n.getAreaEnglish());
            } else {
                this.k.setText(this.n.getAreaArabic());
            }
        }
    }

    @Override // defpackage.cza
    public final void a() {
        ResponseActivity.a(this.p, getString(R.string.something_went_wrong), getString(R.string.please_try_again), true);
    }

    @Override // defpackage.cza
    public final void a(ArrayList<StoreResponseBody> arrayList) {
        if (!this.e) {
            if (this.d.l()) {
                ((FMCMainActivity) getActivity()).c(new ArrayList<>(arrayList));
                return;
            } else if (this.a.v().equalsIgnoreCase("prepaid")) {
                if (this.d.f() && this.d.h()) {
                    ((CorporatePrePaidMainActivity) getActivity()).c(new ArrayList<>(arrayList));
                    return;
                } else if (this.d.g() && this.d.h()) {
                    ((CorporateADSLPrePaidMainActivity) getActivity()).c(new ArrayList<>(arrayList));
                    return;
                } else if (this.d.g() && !this.d.h()) {
                    ((ADSLPrePaidMainActivity) getActivity()).c(new ArrayList<>(arrayList));
                    return;
                } else if (!this.d.f() || this.d.h()) {
                    return;
                } else {
                    ((MainActivity) getActivity()).c(new ArrayList<>(arrayList));
                    return;
                }
            } else if (!this.a.v().equalsIgnoreCase("postpaid")) {
                return;
            } else {
                if (this.d.f() && this.d.h()) {
                    ((CorporatePostPaidMainActivity) getActivity()).c(new ArrayList<>(arrayList));
                    return;
                } else if (this.d.g() && this.d.h()) {
                    ((CorporateADSLPostPaidMainActivity) getActivity()).c(new ArrayList<>(arrayList));
                    return;
                } else if (this.d.g() && !this.d.h()) {
                    ((ADSLPostPaidMainActivity) getActivity()).c(new ArrayList<>(arrayList));
                    return;
                } else if (!this.d.f() || this.d.h()) {
                    return;
                } else {
                    ((PostPaidMainActivity) getActivity()).c(new ArrayList<>(arrayList));
                    return;
                }
            }
        }
        ((StoreLocatorActivity) getActivity()).a(new ArrayList<>(arrayList));
    }

    @Override // defpackage.cza
    public final void b() {
        this.c.a(this.p, getString(R.string.loading));
    }

    @Override // defpackage.cza
    public final void c() {
        this.c.a();
    }
}
