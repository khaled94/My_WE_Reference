package defpackage;

import android.content.Context;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.StoreLocatorActivity;
import com.ucare.we.model.CitiesModel.City;
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
import defpackage.czr;
import defpackage.djl;
import java.util.ArrayList;
import javax.inject.Inject;
import org.json.JSONException;

/* renamed from: czt  reason: default package */
/* loaded from: classes2.dex */
public class czt extends dab implements czv {
    @Inject
    djg a;
    @Inject
    djw b;
    @Inject
    dio c;
    boolean d = false;
    private czu e;
    private Context f;
    private RecyclerView g;
    private czr h;
    private TextView i;
    private City j;
    private czs k;
    private czn l;

    public static czt a(City city, boolean z) {
        czt cztVar = new czt();
        Bundle bundle = new Bundle();
        bundle.putParcelable("SELECTED_City", city);
        bundle.putBoolean("fmcMoreFlag", z);
        cztVar.setArguments(bundle);
        return cztVar;
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.j = (City) getArguments().getParcelable("SELECTED_City");
            this.d = getArguments().getBoolean("fmcMoreFlag", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_select_city, viewGroup, false);
        this.g = (RecyclerView) inflate.findViewById(R.id.rvCities);
        this.i = (TextView) inflate.findViewById(R.id.tvNoData);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (!this.d) {
            if (this.c.l()) {
                ((FMCMainActivity) getActivity()).g(getString(R.string.select_city));
            } else if (this.b.v().equalsIgnoreCase("prepaid")) {
                if (this.c.f() && this.c.h()) {
                    ((CorporatePrePaidMainActivity) getActivity()).g(getString(R.string.select_city));
                } else if (this.c.g() && this.c.h()) {
                    ((CorporateADSLPrePaidMainActivity) getActivity()).g(getString(R.string.select_city));
                } else if (this.c.g() && !this.c.h()) {
                    ((ADSLPrePaidMainActivity) getActivity()).g(getString(R.string.select_city));
                } else if (this.c.f() && !this.c.h()) {
                    ((MainActivity) getActivity()).g(getString(R.string.select_city));
                }
            } else if (this.b.v().equalsIgnoreCase("postpaid")) {
                if (this.c.f() && this.c.h()) {
                    ((CorporatePostPaidMainActivity) getActivity()).g(getString(R.string.select_city));
                } else if (this.c.g() && this.c.h()) {
                    ((CorporateADSLPostPaidMainActivity) getActivity()).g(getString(R.string.select_city));
                } else if (this.c.g() && !this.c.h()) {
                    ((ADSLPostPaidMainActivity) getActivity()).g(getString(R.string.select_city));
                } else if (this.c.f() && !this.c.h()) {
                    ((PostPaidMainActivity) getActivity()).g(getString(R.string.select_city));
                }
            }
        }
        czu czuVar = this.e;
        if (czuVar != null) {
            try {
                czuVar.b.b();
                djl a = djl.a(czuVar.a);
                bi biVar = new bi("https://te.eg/WebServices/REST/Store/getCities", czuVar.c, czuVar.d);
                biVar.l = djl.a.MAIN_PLAN;
                biVar.j = new am(60000, 0, 0.0f);
                a.b.a((as) biVar);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        this.j = this.k.c();
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.f = activity;
        this.e = new czu(activity, this);
        this.k = (czs) getActivity();
        this.l = (czn) getActivity();
    }

    @Override // defpackage.czv
    public final void a() {
        ResponseActivity.a(this.f, getString(R.string.something_went_wrong), getString(R.string.please_try_again), true);
    }

    @Override // defpackage.czv
    public final void a(final ArrayList<City> arrayList) {
        if (arrayList.size() > 0) {
            this.i.setVisibility(8);
            this.g.setVisibility(0);
            this.h = new czr(this.f, arrayList, this.j);
            this.g.setLayoutManager(new LinearLayoutManager(this.f));
            this.g.setHasFixedSize(false);
            this.g.setAdapter(this.h);
            this.h.b = new czr.a() { // from class: czt.1
                @Override // defpackage.czr.a
                public final void a(int i) {
                    czt.this.k.a((City) arrayList.get(i));
                    czt.this.l.a(null);
                    if (!czt.this.d) {
                        if (czt.this.c.l()) {
                            ((FMCMainActivity) czt.this.getActivity()).k();
                            return;
                        } else if (czt.this.b.v().equalsIgnoreCase("prepaid")) {
                            if (czt.this.c.f() && czt.this.c.h()) {
                                ((CorporatePrePaidMainActivity) czt.this.getActivity()).k();
                                return;
                            } else if (czt.this.c.g() && czt.this.c.h()) {
                                ((CorporateADSLPrePaidMainActivity) czt.this.getActivity()).k();
                                return;
                            } else if (czt.this.c.g() && !czt.this.c.h()) {
                                ((ADSLPrePaidMainActivity) czt.this.getActivity()).k();
                                return;
                            } else if (!czt.this.c.f() || czt.this.c.h()) {
                                return;
                            } else {
                                ((MainActivity) czt.this.getActivity()).k();
                                return;
                            }
                        } else if (!czt.this.b.v().equalsIgnoreCase("postpaid")) {
                            return;
                        } else {
                            if (czt.this.c.f() && czt.this.c.h()) {
                                ((CorporatePostPaidMainActivity) czt.this.getActivity()).k();
                                return;
                            } else if (czt.this.c.g() && czt.this.c.h()) {
                                ((CorporateADSLPostPaidMainActivity) czt.this.getActivity()).k();
                                return;
                            } else if (czt.this.c.g() && !czt.this.c.h()) {
                                ((ADSLPostPaidMainActivity) czt.this.getActivity()).k();
                                return;
                            } else if (!czt.this.c.f() || czt.this.c.h()) {
                                return;
                            } else {
                                ((PostPaidMainActivity) czt.this.getActivity()).k();
                                return;
                            }
                        }
                    }
                    ((StoreLocatorActivity) czt.this.getActivity()).b();
                }
            };
            return;
        }
        this.i.setVisibility(0);
        this.g.setVisibility(8);
    }

    @Override // defpackage.czv
    public final void b() {
        this.a.a(this.f, getString(R.string.loading));
    }

    @Override // defpackage.czv
    public final void c() {
        this.a.a();
    }
}
