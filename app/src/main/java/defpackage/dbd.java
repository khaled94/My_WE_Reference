package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.AdapterView;
import android.widget.ArrayAdapter;
import android.widget.ImageView;
import android.widget.SpinnerAdapter;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.manageplanspostpaid.CustomSpinner;
import com.ucare.we.model.MoreBundleModel.AvailableAddOnOfferingList;
import com.ucare.we.model.MoreBundleModel.AvailableAddOnOfferingsList;
import com.ucare.we.model.MoreBundleModel.ResponseRetrieveMoreBundle;
import com.ucare.we.model.MoreBundleModel.ResponseRetrieveMoreBundleBody;
import com.ucare.we.morebundle.SelectMoreBundlesActivity;
import com.ucare.we.morebundle.SubscribeToMoreBundleActivity;
import defpackage.dbc;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.inject.Inject;

/* renamed from: dbd */
/* loaded from: classes2.dex */
public class dbd extends dab implements dbf, dju {
    @Inject
    djb a;
    @Inject
    djg b;
    @Inject
    djw c;
    @Inject
    dio d;
    String e;
    dbc f;
    private RecyclerView g;
    private ConstraintLayout h;
    private View i;
    private ImageView j;
    private dbe k;
    private ResponseRetrieveMoreBundle l;
    private ArrayList<AvailableAddOnOfferingsList> m;
    private AvailableAddOnOfferingsList n;
    private CustomSpinner o;
    private int p = -1;
    private Boolean q = Boolean.FALSE;
    private boolean r = false;

    /* renamed from: lambda$WKrAYHM1XvB0-R9hHKAlhV4TC54 */
    public static /* synthetic */ void m88lambda$WKrAYHM1XvB0R9hHKAlhV4TC54(dbd dbdVar, ArrayList arrayList, int i) {
        dbdVar.a(arrayList, i);
    }

    public static dbd a(String str, ResponseRetrieveMoreBundle responseRetrieveMoreBundle, Boolean bool, boolean z) {
        dbd dbdVar = new dbd();
        Bundle bundle = new Bundle();
        bundle.putBoolean("regional_popUp", z);
        bundle.putBoolean("spinState", bool.booleanValue());
        bundle.putParcelable("bundle", responseRetrieveMoreBundle);
        bundle.putSerializable(dat.a, str);
        dbdVar.setArguments(bundle);
        return dbdVar;
    }

    public static dbd a(String str, AvailableAddOnOfferingsList availableAddOnOfferingsList, ResponseRetrieveMoreBundle responseRetrieveMoreBundle, Boolean bool, boolean z) {
        dbd dbdVar = new dbd();
        Bundle bundle = new Bundle();
        bundle.putSerializable(dat.a, str);
        bundle.putBoolean("regional_popUp", z);
        bundle.putBoolean("spinState", bool.booleanValue());
        bundle.putParcelable("bundle", responseRetrieveMoreBundle);
        bundle.putParcelable("SUB_BUNDLES", availableAddOnOfferingsList);
        dbdVar.setArguments(bundle);
        return dbdVar;
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.e = getArguments().getString(dat.a);
            this.q = Boolean.valueOf(getArguments().getBoolean("spinState"));
            this.l = (ResponseRetrieveMoreBundle) getArguments().getParcelable("bundle");
            this.n = (AvailableAddOnOfferingsList) getArguments().getParcelable("SUB_BUNDLES");
            this.p = getArguments().getInt("position");
            this.r = getArguments().getBoolean("regional_popUp", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_select_more_bundle, viewGroup, false);
        this.g = (RecyclerView) inflate.findViewById(R.id.rv_extra_bundles);
        this.h = (ConstraintLayout) inflate.findViewById(R.id.spinFilterLayout);
        this.i = inflate.findViewById(R.id.spinFilterDivider);
        this.o = (CustomSpinner) inflate.findViewById(R.id.spinFilter);
        this.j = (ImageView) inflate.findViewById(R.id.ivSpinnerArrow);
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(getActivity(), R.array.regionalAddonsSpinArray, R.layout.simple_spinner_item);
        createFromResource.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.o.setAdapter((SpinnerAdapter) createFromResource);
        this.k = new dbe(getContext(), this, this);
        this.m = new ArrayList<>();
        ResponseRetrieveMoreBundle responseRetrieveMoreBundle = this.l;
        if (responseRetrieveMoreBundle != null) {
            a(responseRetrieveMoreBundle);
        }
        int i = this.p;
        if (i != -1) {
            this.o.setSelection(i, true);
        }
        if (this.r) {
            this.o.setSelection(1);
        }
        this.o.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: dbd.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            {
                dbd.this = this;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                dbd.this.p = i2;
                if (i2 == 1) {
                    dbd dbdVar = dbd.this;
                    dbdVar.a(dbdVar.a());
                } else {
                    dbd dbdVar2 = dbd.this;
                    dbdVar2.a(dbdVar2.m);
                }
                dbd.this.f.notifyDataSetChanged();
            }
        });
        this.o.setSpinnerEventsListener(new CustomSpinner.a() { // from class: dbd.2
            {
                dbd.this = this;
            }

            @Override // com.ucare.we.manageplanspostpaid.CustomSpinner.a
            public final void a() {
                dbd.this.j.setImageResource(R.drawable.ic_drop_down);
                dbd.this.j.setRotation(0.0f);
            }

            @Override // com.ucare.we.manageplanspostpaid.CustomSpinner.a
            public final void b() {
                dbd.this.j.setImageResource(R.drawable.ic_drop_down);
                dbd.this.j.setRotation(180.0f);
            }
        });
        return inflate;
    }

    final ArrayList<AvailableAddOnOfferingsList> a() {
        ArrayList<AvailableAddOnOfferingsList> arrayList = new ArrayList<>();
        try {
            if (this.m != null && !this.m.isEmpty()) {
                for (int i = 0; i < this.m.size(); i++) {
                    AvailableAddOnOfferingsList availableAddOnOfferingsList = new AvailableAddOnOfferingsList();
                    if (this.m.get(i).getChildGroups() != null && !this.m.get(i).getChildGroups().isEmpty()) {
                        ArrayList<AvailableAddOnOfferingsList> arrayList2 = new ArrayList<>();
                        Iterator<AvailableAddOnOfferingsList> it = this.m.get(i).getChildGroups().iterator();
                        while (it.hasNext()) {
                            AvailableAddOnOfferingsList next = it.next();
                            AvailableAddOnOfferingsList availableAddOnOfferingsList2 = new AvailableAddOnOfferingsList();
                            ArrayList<AvailableAddOnOfferingList> arrayList3 = new ArrayList<>();
                            if (next.getAvailableAddOnOfferingList() != null) {
                                Iterator<AvailableAddOnOfferingList> it2 = next.getAvailableAddOnOfferingList().iterator();
                                while (it2.hasNext()) {
                                    AvailableAddOnOfferingList next2 = it2.next();
                                    if (next2.getRegional().booleanValue()) {
                                        availableAddOnOfferingsList.setGroupEnName(this.m.get(i).getGroupEnName());
                                        availableAddOnOfferingsList.setGroupArName(this.m.get(i).getGroupArName());
                                        availableAddOnOfferingsList2.setGroupArName(next.getGroupArName());
                                        availableAddOnOfferingsList2.setGroupEnName(next.getGroupEnName());
                                        arrayList3.add(next2);
                                        StringBuilder sb = new StringBuilder();
                                        sb.append(i);
                                        sb.append(" =>");
                                        sb.append(availableAddOnOfferingsList.getGroupEnName());
                                        sb.append(" =>");
                                        sb.append(next2.getOfferEnName());
                                        sb.append(" =>");
                                        sb.append(arrayList3.size());
                                    }
                                    availableAddOnOfferingsList2.setChildGroups(new ArrayList<>());
                                    availableAddOnOfferingsList2.setAvailableAddOnOfferingList(arrayList3);
                                }
                                if (availableAddOnOfferingsList2.getAvailableAddOnOfferingList() != null && availableAddOnOfferingsList2.getAvailableAddOnOfferingList().size() > 0) {
                                    arrayList2.add(availableAddOnOfferingsList2);
                                }
                            }
                        }
                        availableAddOnOfferingsList.setChildGroups(arrayList2);
                    } else {
                        ArrayList<AvailableAddOnOfferingList> arrayList4 = new ArrayList<>();
                        Iterator<AvailableAddOnOfferingList> it3 = this.m.get(i).getAvailableAddOnOfferingList().iterator();
                        while (it3.hasNext()) {
                            AvailableAddOnOfferingList next3 = it3.next();
                            if (next3.getRegional().booleanValue()) {
                                availableAddOnOfferingsList.setGroupEnName(this.m.get(i).getGroupEnName());
                                availableAddOnOfferingsList.setGroupArName(this.m.get(i).getGroupArName());
                                arrayList4.add(next3);
                                StringBuilder sb2 = new StringBuilder();
                                sb2.append(i);
                                sb2.append(" =>");
                                sb2.append(availableAddOnOfferingsList.getGroupEnName());
                                sb2.append(" =>");
                                sb2.append(next3.getOfferEnName());
                                sb2.append(" =>");
                                sb2.append(arrayList4.size());
                            }
                            availableAddOnOfferingsList.setChildGroups(new ArrayList<>());
                            availableAddOnOfferingsList.setAvailableAddOnOfferingList(arrayList4);
                        }
                    }
                    if (availableAddOnOfferingsList.getGroupArName() != null) {
                        arrayList.add(availableAddOnOfferingsList);
                    }
                }
            }
        } catch (Exception unused) {
        }
        return arrayList;
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String str;
        super.onViewCreated(view, bundle);
        if (this.n != null) {
            ResponseRetrieveMoreBundle responseRetrieveMoreBundle = new ResponseRetrieveMoreBundle();
            ResponseRetrieveMoreBundleBody responseRetrieveMoreBundleBody = new ResponseRetrieveMoreBundleBody();
            responseRetrieveMoreBundleBody.setAvailableAddOnOfferingsList(this.n.getChildGroups());
            responseRetrieveMoreBundle.setBody(responseRetrieveMoreBundleBody);
            a(responseRetrieveMoreBundle);
        } else if (this.l != null) {
        } else {
            a(true);
            if (this.c.O() && (str = this.e) != null) {
                this.k.a(str.equalsIgnoreCase(getString(R.string.fmc_group_tag)));
            } else {
                this.k.a(false);
            }
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public final void a(final ArrayList<AvailableAddOnOfferingsList> arrayList) {
        a(false);
        this.f = new dbc(getContext(), arrayList);
        this.g.setLayoutManager(new LinearLayoutManager(getContext()));
        this.g.setHasFixedSize(false);
        this.g.setAdapter(this.f);
        this.f.b = new dbc.a() { // from class: -$$Lambda$dbd$WKrAYHM1XvB0-R9hHKAlhV4TC54
            @Override // defpackage.dbc.a
            public final void onItemClick(int i) {
                dbd.m88lambda$WKrAYHM1XvB0R9hHKAlhV4TC54(dbd.this, arrayList, i);
            }
        };
    }

    public /* synthetic */ void a(ArrayList arrayList, int i) {
        Intent intent;
        if (((AvailableAddOnOfferingsList) arrayList.get(i)).getChildGroups().size() > 0) {
            intent = new Intent(getContext(), SelectMoreBundlesActivity.class);
            intent.putExtra("SUB_BUNDLES", (Parcelable) arrayList.get(i));
            intent.putExtra("position", this.p);
        } else {
            intent = new Intent(getContext(), SubscribeToMoreBundleActivity.class);
            intent.putExtra("ExtrasList", ((AvailableAddOnOfferingsList) arrayList.get(i)).getAvailableAddOnOfferingList());
            if (this.a.f()) {
                intent.putExtra("title", ((AvailableAddOnOfferingsList) arrayList.get(i)).getGroupArName());
            } else {
                intent.putExtra("title", ((AvailableAddOnOfferingsList) arrayList.get(i)).getGroupEnName());
            }
        }
        startActivity(intent);
    }

    @Override // defpackage.dbf
    public final void a(boolean z) {
        if (z) {
            this.b.a(getContext(), getContext().getString(R.string.loading));
        } else {
            this.b.a();
        }
    }

    @Override // defpackage.dbf
    public final void a(ResponseRetrieveMoreBundle responseRetrieveMoreBundle) {
        this.m = new ArrayList<>();
        ArrayList<AvailableAddOnOfferingsList> availableAddOnOfferingsList = responseRetrieveMoreBundle.getBody().getAvailableAddOnOfferingsList();
        this.m = availableAddOnOfferingsList;
        Collections.sort(availableAddOnOfferingsList);
        if (this.d.g() && this.c.O()) {
            this.i.setVisibility(8);
            this.h.setVisibility(8);
        } else if (a().size() == 0 || !this.q.booleanValue()) {
            this.i.setVisibility(8);
            this.h.setVisibility(8);
        } else {
            this.i.setVisibility(0);
            this.h.setVisibility(0);
        }
        new Gson().a(responseRetrieveMoreBundle);
        if (this.p == 1) {
            a(a());
        } else {
            a(this.m);
        }
        this.f.notifyDataSetChanged();
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(getContext(), this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (this.n != null) {
            ResponseRetrieveMoreBundle responseRetrieveMoreBundle = new ResponseRetrieveMoreBundle();
            ResponseRetrieveMoreBundleBody responseRetrieveMoreBundleBody = new ResponseRetrieveMoreBundleBody();
            responseRetrieveMoreBundleBody.setAvailableAddOnOfferingsList(this.n.getChildGroups());
            responseRetrieveMoreBundle.setBody(responseRetrieveMoreBundleBody);
            a(responseRetrieveMoreBundle);
        } else if (this.l != null) {
        } else {
            if (this.c.O()) {
                this.k.a(this.e.equalsIgnoreCase(getString(R.string.fmc_group_tag)));
            } else {
                this.k.a(false);
            }
        }
    }
}
