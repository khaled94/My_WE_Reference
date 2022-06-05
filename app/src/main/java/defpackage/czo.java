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
import com.ucare.we.model.AreasModel.Area;
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

/* renamed from: czo */
/* loaded from: classes2.dex */
public class czo extends dab implements czq {
    @Inject
    djw a;
    @Inject
    djg b;
    @Inject
    dio c;
    boolean d = false;
    private czp e;
    private Context f;
    private RecyclerView g;
    private czr h;
    private Area i;
    private TextView j;
    private City k;
    private czn l;

    public static czo a(City city, Area area, boolean z) {
        czo czoVar = new czo();
        Bundle bundle = new Bundle();
        bundle.putParcelable("SELECTED_Area", area);
        bundle.putParcelable("SELECTED_City", city);
        bundle.putBoolean("fmcMoreFlag", z);
        czoVar.setArguments(bundle);
        return czoVar;
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.i = (Area) getArguments().getParcelable("SELECTED_Area");
            this.k = (City) getArguments().getParcelable("SELECTED_City");
            this.d = getArguments().getBoolean("fmcMoreFlag", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_select_area, viewGroup, false);
        this.g = (RecyclerView) inflate.findViewById(R.id.rvAreas);
        this.j = (TextView) inflate.findViewById(R.id.tvNoData);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.f = activity;
        this.e = new czp(activity, this);
        this.l = (czn) getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (!this.d) {
            if (this.c.l()) {
                ((FMCMainActivity) getActivity()).g(getString(R.string.select_area));
            } else if (this.a.v().equalsIgnoreCase("prepaid")) {
                if (this.c.f() && this.c.h()) {
                    ((CorporatePrePaidMainActivity) getActivity()).g(getString(R.string.select_area));
                } else if (this.c.g() && this.c.h()) {
                    ((CorporateADSLPrePaidMainActivity) getActivity()).g(getString(R.string.select_area));
                } else if (this.c.g() && !this.c.h()) {
                    ((ADSLPrePaidMainActivity) getActivity()).g(getString(R.string.select_area));
                } else if (this.c.f() && !this.c.h()) {
                    ((MainActivity) getActivity()).g(getString(R.string.select_area));
                }
            } else if (this.a.v().equalsIgnoreCase("postpaid")) {
                if (this.c.f() && this.c.h()) {
                    ((CorporatePostPaidMainActivity) getActivity()).g(getString(R.string.title_store_locator));
                } else if (this.c.g() && this.c.h()) {
                    ((CorporateADSLPostPaidMainActivity) getActivity()).g(getString(R.string.title_store_locator));
                } else if (this.c.g() && !this.c.h()) {
                    ((ADSLPostPaidMainActivity) getActivity()).g(getString(R.string.title_store_locator));
                } else if (this.c.f() && !this.c.h()) {
                    ((PostPaidMainActivity) getActivity()).g(getString(R.string.title_store_locator));
                }
            }
        } else {
            ((StoreLocatorActivity) getActivity()).a();
        }
        czp czpVar = this.e;
        if (czpVar != null) {
            int cityId = this.k.getCityId();
            try {
                czpVar.b.b();
                djl a = djl.a(czpVar.a);
                bi biVar = new bi("https://te.eg/WebServices/REST/Store/getAreaByCityId/".concat(String.valueOf(cityId)), czpVar.c, czpVar.d);
                biVar.l = djl.a.MAIN_PLAN;
                biVar.j = new am(60000, 0, 0.0f);
                a.b.a((as) biVar);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
        this.i = this.l.d();
    }

    @Override // defpackage.czq
    public final void a() {
        ResponseActivity.a(this.f, getString(R.string.something_went_wrong), getString(R.string.please_try_again), true);
    }

    @Override // defpackage.czq
    public final void a(final ArrayList<Area> arrayList) {
        if (arrayList.size() > 0) {
            ArrayList arrayList2 = new ArrayList();
            for (int i = 0; i < arrayList.size(); i++) {
                City city = new City();
                city.setCityArabic(arrayList.get(i).getAreaArabic());
                city.setCityEnglish(arrayList.get(i).getAreaEnglish());
                city.setCityId(arrayList.get(i).getAreaID());
                arrayList2.add(city);
            }
            this.j.setVisibility(8);
            this.g.setVisibility(0);
            this.h = new czr(this.f, arrayList2, this.i);
            this.g.setLayoutManager(new LinearLayoutManager(this.f));
            this.g.setHasFixedSize(false);
            this.g.setAdapter(this.h);
            this.h.b = new czr.a() { // from class: czo.1
                @Override // defpackage.czr.a
                public final void a(int i2) {
                    czo.this.l.a((Area) arrayList.get(i2));
                    if (!czo.this.d) {
                        if (czo.this.c.l()) {
                            ((FMCMainActivity) czo.this.getActivity()).k();
                            return;
                        } else if (czo.this.a.v().equalsIgnoreCase("prepaid")) {
                            if (czo.this.c.f() && czo.this.c.h()) {
                                ((CorporatePrePaidMainActivity) czo.this.getActivity()).k();
                                return;
                            } else if (czo.this.c.g() && czo.this.c.h()) {
                                ((CorporateADSLPrePaidMainActivity) czo.this.getActivity()).k();
                                return;
                            } else if (czo.this.c.g() && !czo.this.c.h()) {
                                ((ADSLPrePaidMainActivity) czo.this.getActivity()).k();
                                return;
                            } else if (!czo.this.c.f() || czo.this.c.h()) {
                                return;
                            } else {
                                ((MainActivity) czo.this.getActivity()).k();
                                return;
                            }
                        } else if (!czo.this.a.v().equalsIgnoreCase("postpaid")) {
                            return;
                        } else {
                            if (czo.this.c.f() && czo.this.c.h()) {
                                ((CorporatePostPaidMainActivity) czo.this.getActivity()).k();
                                return;
                            } else if (czo.this.c.g() && czo.this.c.h()) {
                                ((CorporateADSLPostPaidMainActivity) czo.this.getActivity()).k();
                                return;
                            } else if (czo.this.c.g() && !czo.this.c.h()) {
                                ((ADSLPostPaidMainActivity) czo.this.getActivity()).k();
                                return;
                            } else if (!czo.this.c.f() || czo.this.c.h()) {
                                return;
                            } else {
                                ((PostPaidMainActivity) czo.this.getActivity()).k();
                                return;
                            }
                        }
                    }
                    ((StoreLocatorActivity) czo.this.getActivity()).b();
                }
            };
            return;
        }
        this.j.setVisibility(0);
        this.g.setVisibility(8);
    }

    @Override // defpackage.czq
    public final void b() {
        this.b.a(this.f, getString(R.string.loading));
    }

    @Override // defpackage.czq
    public final void c() {
        this.b.a();
    }
}
