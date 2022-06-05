package defpackage;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.AdapterView;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.ImageButton;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.ucare.we.GpsEnableActivity;
import com.ucare.we.R;
import com.ucare.we.StoreLocatorActivity;
import com.ucare.we.model.StoreResponseBody;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.presentation.adslpostpaid.ADSLPostPaidMainActivity;
import com.ucare.we.presentation.adslprepaid.ADSLPrePaidMainActivity;
import com.ucare.we.presentation.corporateadslpostpaid.CorporateADSLPostPaidMainActivity;
import com.ucare.we.presentation.corporateadslprepaid.CorporateADSLPrePaidMainActivity;
import com.ucare.we.presentation.corporatepostpaid.CorporatePostPaidMainActivity;
import com.ucare.we.presentation.corporateprepaid.CorporatePrePaidMainActivity;
import com.ucare.we.presentation.fmcuser.FMCMainActivity;
import com.ucare.we.presentation.postpaid.PostPaidMainActivity;
import com.ucare.we.presentation.prepaid.MainActivity;
import defpackage.cxc;
import defpackage.cxh;
import defpackage.vf;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;

/* renamed from: czh  reason: default package */
/* loaded from: classes2.dex */
public class czh extends dab implements cxh.a, czi, dig, dju, vf.b, vf.c {
    public static final String a = czg.class.getSimpleName();
    private static final LatLngBounds r = new LatLngBounds(new LatLng(22.015446d, 24.842321d), new LatLng(31.663729d, 35.67484d));
    @Inject
    djb b;
    @Inject
    djx c;
    @Inject
    djg d;
    @Inject
    dio e;
    @Inject
    dih f;
    @Inject
    djw g;
    RecyclerView h;
    AutoCompleteTextView i;
    cxh j;
    double l;
    double m;
    ImageButton n;
    private Button s;
    private Button t;
    private vf u;
    private cxc v;
    private bgh w;
    int k = 1;
    boolean o = false;
    boolean p = false;
    boolean q = false;
    private vj<bgp> x = new vj<bgp>() { // from class: czh.1
        @Override // defpackage.vj
        public final /* synthetic */ void a(bgp bgpVar) {
            bgp bgpVar2 = bgpVar;
            if (!bgpVar2.a().c()) {
                String str = czh.a;
                new StringBuilder("Place query did not complete. Error: ").append(bgpVar2.a().toString());
                return;
            }
            bgo a2 = bgpVar2.a(0);
            czh.this.d.a(czh.this.getContext(), czh.this.getContext().getString(R.string.loading));
            czh.this.f.a(a2.b().a, a2.b().b, 5);
            czh czhVar = czh.this;
            InputMethodManager inputMethodManager = (InputMethodManager) czhVar.getActivity().getSystemService("input_method");
            if (inputMethodManager == null || !inputMethodManager.isActive()) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(czhVar.getActivity().getCurrentFocus().getWindowToken(), 0);
        }
    };
    private AdapterView.OnItemClickListener y = new AdapterView.OnItemClickListener() { // from class: czh.2
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            cxc.a item = czh.this.v.getItem(i);
            String valueOf = String.valueOf(item.a);
            String str = czh.a;
            new StringBuilder("Selected: ").append((Object) item.b);
            if (diw.a(czh.this.getContext())) {
                bgs.c.a(czh.this.u, valueOf).a(czh.this.x);
            }
        }
    };

    @Override // defpackage.dju
    public final void a(String str, int i) {
    }

    @Override // defpackage.dju
    public final void b(int i) {
    }

    public static czh a(boolean z) {
        Bundle bundle = new Bundle();
        bundle.putBoolean("fmcMoreFlag", z);
        czh czhVar = new czh();
        czhVar.setArguments(bundle);
        return czhVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_store_locator_fragment_adsl, viewGroup, false);
        this.h = (RecyclerView) inflate.findViewById(R.id.rv_stores);
        this.i = (AutoCompleteTextView) inflate.findViewById(R.id.inputSearch);
        this.n = (ImageButton) inflate.findViewById(R.id.clearButton);
        this.s = (Button) inflate.findViewById(R.id.btn_from_location);
        this.t = (Button) inflate.findViewById(R.id.btn_another_location);
        this.o = getArguments().getBoolean("fmcMoreFlag", false);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        getContext().getSystemService("location");
        this.w = bgj.a(getActivity());
        this.h.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        this.h.setHasFixedSize(true);
        cxh cxhVar = new cxh(this);
        this.j = cxhVar;
        this.h.setAdapter(cxhVar);
        this.f.a(this);
        this.s.setOnClickListener(new View.OnClickListener() { // from class: czh.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czh.this.i.setText("");
                czh.this.startActivityForResult(new Intent(czh.this.getActivity(), GpsEnableActivity.class), 150);
            }
        });
        this.t.setOnClickListener(new View.OnClickListener() { // from class: czh.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!czh.this.o) {
                    if (czh.this.e.l()) {
                        ((FMCMainActivity) czh.this.getActivity()).k();
                        return;
                    } else if (czh.this.g.v().equalsIgnoreCase("prepaid")) {
                        if (czh.this.e.f() && czh.this.e.h()) {
                            ((CorporatePrePaidMainActivity) czh.this.getActivity()).k();
                            return;
                        } else if (czh.this.e.g() && czh.this.e.h()) {
                            ((CorporateADSLPrePaidMainActivity) czh.this.getActivity()).k();
                            return;
                        } else if (czh.this.e.g() && !czh.this.e.h()) {
                            ((ADSLPrePaidMainActivity) czh.this.getActivity()).k();
                            return;
                        } else if (!czh.this.e.f() || czh.this.e.h()) {
                            return;
                        } else {
                            ((MainActivity) czh.this.getActivity()).k();
                            return;
                        }
                    } else if (!czh.this.g.v().equalsIgnoreCase("postpaid")) {
                        return;
                    } else {
                        if (czh.this.e.f() && czh.this.e.h()) {
                            ((CorporatePostPaidMainActivity) czh.this.getActivity()).k();
                            return;
                        } else if (czh.this.e.g() && czh.this.e.h()) {
                            ((CorporateADSLPostPaidMainActivity) czh.this.getActivity()).k();
                            return;
                        } else if (czh.this.e.g() && !czh.this.e.h()) {
                            ((ADSLPostPaidMainActivity) czh.this.getActivity()).k();
                            return;
                        } else if (!czh.this.e.f() || czh.this.e.h()) {
                            return;
                        } else {
                            ((PostPaidMainActivity) czh.this.getActivity()).k();
                            return;
                        }
                    }
                }
                ((StoreLocatorActivity) czh.this.getActivity()).b();
            }
        });
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.n.getLayoutParams();
        if (this.b.f()) {
            layoutParams.addRule(9);
        } else {
            layoutParams.addRule(11);
        }
        this.n.setLayoutParams(layoutParams);
        this.n.setOnClickListener(new View.OnClickListener() { // from class: czh.5
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czh.this.i.setText("");
                czh.this.n.setVisibility(8);
            }
        });
        this.i.setThreshold(2);
        this.i.setOnItemClickListener(this.y);
        cxc cxcVar = new cxc(getActivity(), r, this) { // from class: czh.6
            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public final View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                ((TextView) view2.findViewById(16908308)).setTextSize(0, czh.this.getActivity().getResources().getDimension(R.dimen.search_result_text_size));
                return view2;
            }
        };
        this.v = cxcVar;
        this.i.setAdapter(cxcVar);
        this.i.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: czh.7
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                InputMethodManager inputMethodManager;
                if (z || (inputMethodManager = (InputMethodManager) czh.this.getActivity().getSystemService("input_method")) == null || !inputMethodManager.isActive()) {
                    return;
                }
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 150 && i2 == -1) {
            this.l = intent.getDoubleExtra("lat", 0.0d);
            this.m = intent.getDoubleExtra("lng", 0.0d);
            new StringBuilder().append(this.l);
            new StringBuilder().append(this.m);
            this.d.a(getContext(), getContext().getString(R.string.loading));
            this.f.a(this.l, this.m, 5);
        }
    }

    @Override // defpackage.cxh.a
    public final void a(StoreResponseBody storeResponseBody) {
        Locale locale = Locale.ENGLISH;
        Object[] objArr = new Object[3];
        objArr[0] = Double.valueOf(storeResponseBody.getLatitude());
        objArr[1] = Double.valueOf(storeResponseBody.getLongitude());
        objArr[2] = this.b.f() ? storeResponseBody.getArBranchName() : storeResponseBody.getEnBranchName();
        Intent intent = new Intent("android.intent.action.VIEW", Uri.parse(String.format(locale, "geo:0,0?q=%f,%f(%s)", objArr)));
        intent.setPackage("com.google.android.apps.maps");
        if (intent.resolveActivity(getActivity().getPackageManager()) != null) {
            startActivity(intent);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onPause() {
        super.onPause();
        this.f.b(this);
        if (diw.a(getContext())) {
            this.u.a(getActivity());
            this.u.d();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        this.f.a(this);
        if (diw.a(getContext()) && getActivity() != null) {
            this.u = new vf.a(getActivity()).a(bgs.a).a(getActivity(), this).a(this).a();
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        vf vfVar;
        this.f.b(this);
        if (diw.a(getContext()) && (vfVar = this.u) != null) {
            vfVar.a(getActivity());
            this.u.d();
        }
        super.onDestroy();
    }

    @Override // defpackage.dig
    public final void a(List<StoreResponseBody> list) {
        this.d.a();
        if (!this.o) {
            if (this.e.l()) {
                ((FMCMainActivity) getActivity()).c(new ArrayList<>(list));
                return;
            } else if (this.g.v().equalsIgnoreCase("prepaid")) {
                if (this.e.f() && this.e.h()) {
                    ((CorporatePrePaidMainActivity) getActivity()).c(new ArrayList<>(list));
                    return;
                } else if (this.e.g() && this.e.h()) {
                    ((CorporateADSLPrePaidMainActivity) getActivity()).c(new ArrayList<>(list));
                    return;
                } else if (this.e.g() && !this.e.h()) {
                    ((ADSLPrePaidMainActivity) getActivity()).c(new ArrayList<>(list));
                    return;
                } else if (!this.e.f() || this.e.h()) {
                    return;
                } else {
                    ((MainActivity) getActivity()).c(new ArrayList<>(list));
                    return;
                }
            } else if (!this.g.v().equalsIgnoreCase("postpaid")) {
                return;
            } else {
                if (this.e.f() && this.e.h()) {
                    ((CorporatePostPaidMainActivity) getActivity()).c(new ArrayList<>(list));
                    return;
                } else if (this.e.g() && this.e.h()) {
                    ((CorporateADSLPostPaidMainActivity) getActivity()).c(new ArrayList<>(list));
                    return;
                } else if (this.e.g() && !this.e.h()) {
                    ((ADSLPostPaidMainActivity) getActivity()).c(new ArrayList<>(list));
                    return;
                } else if (!this.e.f() || this.e.h()) {
                    return;
                } else {
                    ((PostPaidMainActivity) getActivity()).c(new ArrayList<>(list));
                    return;
                }
            }
        }
        ((StoreLocatorActivity) getActivity()).a(new ArrayList<>(list));
    }

    @Override // defpackage.dig
    public final void a(String str) {
        this.d.a();
        UnNavigateResponseActivity.a(getContext(), str, getContext().getString(R.string.please_try_again), true);
    }

    @Override // defpackage.vr
    public final void a(Bundle bundle) {
        this.v.a(this.u);
    }

    @Override // defpackage.vz
    public final void a(ConnectionResult connectionResult) {
        new StringBuilder("Google Places API connection failed with error code: ").append(connectionResult.c);
    }

    @Override // defpackage.vr
    public final void a(int i) {
        this.v.a((vf) null);
    }

    @Override // defpackage.czi
    public final void a() {
        this.n.setVisibility(0);
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        if (!this.o) {
            if (this.e.l()) {
                ((FMCMainActivity) getActivity()).g(getString(R.string.title_store_locator));
            } else if (this.g.v().equalsIgnoreCase("prepaid")) {
                if (this.e.f() && this.e.h()) {
                    ((CorporatePrePaidMainActivity) getActivity()).g(getString(R.string.title_store_locator));
                } else if (this.e.g() && this.e.h()) {
                    ((CorporateADSLPrePaidMainActivity) getActivity()).g(getString(R.string.title_store_locator));
                } else if (this.e.g() && !this.e.h()) {
                    ((ADSLPrePaidMainActivity) getActivity()).g(getString(R.string.title_store_locator));
                } else if (!this.e.f() || this.e.h()) {
                } else {
                    ((MainActivity) getActivity()).g(getString(R.string.title_store_locator));
                }
            } else if (!this.g.v().equalsIgnoreCase("postpaid")) {
            } else {
                if (this.e.f() && this.e.h()) {
                    ((CorporatePostPaidMainActivity) getActivity()).g(getString(R.string.title_store_locator));
                } else if (this.e.g() && this.e.h()) {
                    ((CorporateADSLPostPaidMainActivity) getActivity()).g(getString(R.string.title_store_locator));
                } else if (this.e.g() && !this.e.h()) {
                    ((ADSLPostPaidMainActivity) getActivity()).g(getString(R.string.title_store_locator));
                } else if (!this.e.f() || this.e.h()) {
                } else {
                    ((PostPaidMainActivity) getActivity()).g(getString(R.string.title_store_locator));
                }
            }
        }
    }
}
