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
import android.widget.Toast;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.common.ConnectionResult;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import com.ucare.we.GpsEnableActivity;
import com.ucare.we.R;
import com.ucare.we.model.StoreResponseBody;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.cxc;
import defpackage.cxh;
import defpackage.vf;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import javax.inject.Inject;

/* renamed from: czg  reason: default package */
/* loaded from: classes2.dex */
public class czg extends dab implements cxh.a, czi, dig, dju, vf.b, vf.c {
    public static final String a = czg.class.getSimpleName();
    private static final LatLngBounds n = new LatLngBounds(new LatLng(22.015446d, 24.842321d), new LatLng(31.663729d, 35.67484d));
    @Inject
    djb b;
    @Inject
    djx c;
    @Inject
    djg d;
    @Inject
    dih e;
    RecyclerView f;
    AutoCompleteTextView g;
    cxh h;
    double j;
    double k;
    ImageButton l;
    Button m;
    private vf o;
    private cxc p;
    int i = 1;
    private vj<bgp> q = new vj<bgp>() { // from class: czg.1
        @Override // defpackage.vj
        public final /* synthetic */ void a(bgp bgpVar) {
            bgp bgpVar2 = bgpVar;
            if (!bgpVar2.a().c()) {
                String str = czg.a;
                new StringBuilder("Place query did not complete. Error: ").append(bgpVar2.a().toString());
                return;
            }
            bgo a2 = bgpVar2.a(0);
            czg.this.d.a(czg.this.getContext(), czg.this.getContext().getString(R.string.loading));
            czg.this.e.a(a2.b().a, a2.b().b, 5);
            czg czgVar = czg.this;
            InputMethodManager inputMethodManager = (InputMethodManager) czgVar.getActivity().getSystemService("input_method");
            if (inputMethodManager == null || !inputMethodManager.isActive()) {
                return;
            }
            inputMethodManager.hideSoftInputFromWindow(czgVar.getActivity().getCurrentFocus().getWindowToken(), 0);
        }
    };
    private AdapterView.OnItemClickListener r = new AdapterView.OnItemClickListener() { // from class: czg.2
        @Override // android.widget.AdapterView.OnItemClickListener
        public final void onItemClick(AdapterView<?> adapterView, View view, int i, long j) {
            cxc.a item = czg.this.p.getItem(i);
            String valueOf = String.valueOf(item.a);
            String str = czg.a;
            new StringBuilder("Selected: ").append((Object) item.b);
            bgs.c.a(czg.this.o, valueOf).a(czg.this.q);
        }
    };

    @Override // defpackage.dju
    public final void a(String str, int i) {
    }

    @Override // defpackage.dju
    public final void b(int i) {
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_store_locator, viewGroup, false);
        this.f = (RecyclerView) inflate.findViewById(R.id.rv_stores);
        this.g = (AutoCompleteTextView) inflate.findViewById(R.id.inputSearch);
        this.l = (ImageButton) inflate.findViewById(R.id.clearButton);
        this.m = (Button) inflate.findViewById(R.id.btn_from_location);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.f.setLayoutManager(new LinearLayoutManager(getActivity(), 1, false));
        this.f.setHasFixedSize(true);
        cxh cxhVar = new cxh(this);
        this.h = cxhVar;
        this.f.setAdapter(cxhVar);
        this.e.a(this);
        this.m.setOnClickListener(new View.OnClickListener() { // from class: czg.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czg.this.g.setText("");
                czg.this.startActivityForResult(new Intent(czg.this.getActivity(), GpsEnableActivity.class), 150);
            }
        });
        RelativeLayout.LayoutParams layoutParams = (RelativeLayout.LayoutParams) this.l.getLayoutParams();
        if (this.b.f()) {
            layoutParams.addRule(9);
        } else {
            layoutParams.addRule(11);
        }
        this.l.setLayoutParams(layoutParams);
        this.l.setOnClickListener(new View.OnClickListener() { // from class: czg.4
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                czg.this.g.setText("");
                czg.this.l.setVisibility(8);
            }
        });
        this.g.setThreshold(2);
        this.g.setOnItemClickListener(this.r);
        cxc cxcVar = new cxc(getActivity(), n, this) { // from class: czg.5
            @Override // android.widget.ArrayAdapter, android.widget.Adapter
            public final View getView(int i, View view, ViewGroup viewGroup) {
                View view2 = super.getView(i, view, viewGroup);
                ((TextView) view2.findViewById(16908308)).setTextSize(0, czg.this.getActivity().getResources().getDimension(R.dimen.search_result_text_size));
                return view2;
            }
        };
        this.p = cxcVar;
        this.g.setAdapter(cxcVar);
        this.g.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: czg.6
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                InputMethodManager inputMethodManager;
                if (z || (inputMethodManager = (InputMethodManager) czg.this.getActivity().getSystemService("input_method")) == null || !inputMethodManager.isActive()) {
                    return;
                }
                inputMethodManager.hideSoftInputFromWindow(view.getWindowToken(), 0);
            }
        });
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        if (i == 150 && i2 == -1) {
            this.j = intent.getDoubleExtra("lat", 0.0d);
            Toast.makeText(getContext(), String.valueOf(this.j), 0).show();
            this.k = intent.getDoubleExtra("lng", 0.0d);
            new StringBuilder().append(this.j);
            new StringBuilder().append(this.k);
            this.d.a(getContext(), getContext().getString(R.string.loading));
            this.e.a(this.j, this.k, 5);
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
        this.e.b(this);
        this.o.a(getActivity());
        this.o.d();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        this.e.a(this);
        if (getActivity() != null) {
            this.o = new vf.a(getActivity()).a(bgs.a).a(getActivity(), this).a(this).a();
        }
        super.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public void onDestroy() {
        this.e.b(this);
        this.o.a(getActivity());
        this.o.d();
        super.onDestroy();
    }

    @Override // defpackage.dig
    public final void a(List<StoreResponseBody> list) {
        this.d.a();
        int size = list.size() - 1;
        for (int i = 0; i < (list.size() - 1) / 2; i++) {
            int i2 = size - i;
            list.set(i, list.get(i2));
            list.set(i2, list.get(i));
        }
        this.h.a(new ArrayList<>(list));
    }

    @Override // defpackage.dig
    public final void a(String str) {
        this.d.a();
        UnNavigateResponseActivity.a(getContext(), str, getContext().getString(R.string.please_try_again), true);
    }

    @Override // defpackage.vr
    public final void a(Bundle bundle) {
        this.p.a(this.o);
    }

    @Override // defpackage.vz
    public final void a(ConnectionResult connectionResult) {
        new StringBuilder("Google Places API connection failed with error code: ").append(connectionResult.c);
    }

    @Override // defpackage.vr
    public final void a(int i) {
        this.p.a((vf) null);
    }

    @Override // defpackage.czi
    public final void a() {
        this.l.setVisibility(0);
    }
}
