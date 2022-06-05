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
import com.ucare.we.model.MoreBundleModel.ResponseRetrieveMoreBundleBody;
import com.ucare.we.presentation.family.FamilySharedAddons.FamilySelectAddonsActivity;
import com.ucare.we.presentation.family.FamilySharedAddons.FamilySubscribeAddonsActivity;
import com.ucare.we.presentation.offers.UnNavigateResponseActivity;
import defpackage.dea;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import javax.inject.Inject;

/* renamed from: deb */
/* loaded from: classes2.dex */
public class deb extends dab implements dec, dju {
    @Inject
    djb a;
    @Inject
    djg b;
    @Inject
    djw c;
    @Inject
    dio d;
    String e;
    @Inject
    dfp f;
    dea g;
    private RecyclerView h;
    private ConstraintLayout i;
    private View j;
    private ImageView k;
    private ArrayList<AvailableAddOnOfferingsList> l;
    private AvailableAddOnOfferingsList m;
    private CustomSpinner n;
    private int o = -1;
    private Boolean p = Boolean.FALSE;
    private boolean q = false;

    /* renamed from: lambda$i-hFf1zlTGd8NfD96Xgak-rH5ss */
    public static /* synthetic */ void m105lambda$ihFf1zlTGd8NfD96XgakrH5ss(deb debVar, ArrayList arrayList, int i) {
        debVar.a(arrayList, i);
    }

    public static deb a(String str, Boolean bool, boolean z) {
        deb debVar = new deb();
        Bundle bundle = new Bundle();
        bundle.putBoolean("regional_popUp", z);
        bundle.putBoolean("spinState", bool.booleanValue());
        bundle.putSerializable(dat.a, str);
        debVar.setArguments(bundle);
        return debVar;
    }

    public static deb a(String str, AvailableAddOnOfferingsList availableAddOnOfferingsList, Boolean bool, boolean z) {
        deb debVar = new deb();
        Bundle bundle = new Bundle();
        bundle.putSerializable(dat.a, str);
        bundle.putBoolean("regional_popUp", z);
        bundle.putBoolean("spinState", bool.booleanValue());
        bundle.putParcelable("SUB_BUNDLES", availableAddOnOfferingsList);
        debVar.setArguments(bundle);
        return debVar;
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        if (getArguments() != null) {
            this.e = getArguments().getString(dat.a);
            this.p = Boolean.valueOf(getArguments().getBoolean("spinState"));
            this.m = (AvailableAddOnOfferingsList) getArguments().getParcelable("SUB_BUNDLES");
            this.o = getArguments().getInt("position");
            this.q = getArguments().getBoolean("regional_popUp", false);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_select_more_bundle, viewGroup, false);
        this.h = (RecyclerView) inflate.findViewById(R.id.rv_extra_bundles);
        this.i = (ConstraintLayout) inflate.findViewById(R.id.spinFilterLayout);
        this.j = inflate.findViewById(R.id.spinFilterDivider);
        this.n = (CustomSpinner) inflate.findViewById(R.id.spinFilter);
        this.k = (ImageView) inflate.findViewById(R.id.ivSpinnerArrow);
        ArrayAdapter<CharSequence> createFromResource = ArrayAdapter.createFromResource(getActivity(), R.array.regionalAddonsSpinArray, R.layout.simple_spinner_item);
        createFromResource.setDropDownViewResource(R.layout.simple_spinner_dropdown_item);
        this.n.setAdapter((SpinnerAdapter) createFromResource);
        this.l = new ArrayList<>();
        this.f.a(this);
        int i = this.o;
        if (i != -1) {
            this.n.setSelection(i, true);
        }
        if (this.q) {
            this.n.setSelection(1);
        }
        this.n.setOnItemSelectedListener(new AdapterView.OnItemSelectedListener() { // from class: deb.1
            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onNothingSelected(AdapterView<?> adapterView) {
            }

            {
                deb.this = this;
            }

            @Override // android.widget.AdapterView.OnItemSelectedListener
            public final void onItemSelected(AdapterView<?> adapterView, View view, int i2, long j) {
                deb.this.o = i2;
                if (i2 == 1) {
                    deb debVar = deb.this;
                    debVar.a(debVar.a());
                } else {
                    deb debVar2 = deb.this;
                    debVar2.a(debVar2.l);
                }
                deb.this.g.notifyDataSetChanged();
            }
        });
        this.n.setSpinnerEventsListener(new CustomSpinner.a() { // from class: deb.2
            {
                deb.this = this;
            }

            @Override // com.ucare.we.manageplanspostpaid.CustomSpinner.a
            public final void a() {
                deb.this.k.setImageResource(R.drawable.ic_drop_down);
                deb.this.k.setRotation(0.0f);
            }

            @Override // com.ucare.we.manageplanspostpaid.CustomSpinner.a
            public final void b() {
                deb.this.k.setImageResource(R.drawable.ic_drop_down);
                deb.this.k.setRotation(180.0f);
            }
        });
        return inflate;
    }

    final ArrayList<AvailableAddOnOfferingsList> a() {
        ArrayList<AvailableAddOnOfferingsList> arrayList = new ArrayList<>();
        try {
            if (this.l != null && !this.l.isEmpty()) {
                for (int i = 0; i < this.l.size(); i++) {
                    AvailableAddOnOfferingsList availableAddOnOfferingsList = new AvailableAddOnOfferingsList();
                    if (this.l.get(i).getChildGroups() != null && !this.l.get(i).getChildGroups().isEmpty()) {
                        ArrayList<AvailableAddOnOfferingsList> arrayList2 = new ArrayList<>();
                        Iterator<AvailableAddOnOfferingsList> it = this.l.get(i).getChildGroups().iterator();
                        while (it.hasNext()) {
                            AvailableAddOnOfferingsList next = it.next();
                            AvailableAddOnOfferingsList availableAddOnOfferingsList2 = new AvailableAddOnOfferingsList();
                            ArrayList<AvailableAddOnOfferingList> arrayList3 = new ArrayList<>();
                            if (next.getAvailableAddOnOfferingList() != null) {
                                Iterator<AvailableAddOnOfferingList> it2 = next.getAvailableAddOnOfferingList().iterator();
                                while (it2.hasNext()) {
                                    AvailableAddOnOfferingList next2 = it2.next();
                                    if (next2.getRegional().booleanValue()) {
                                        availableAddOnOfferingsList.setGroupEnName(this.l.get(i).getGroupEnName());
                                        availableAddOnOfferingsList.setGroupArName(this.l.get(i).getGroupArName());
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
                        Iterator<AvailableAddOnOfferingList> it3 = this.l.get(i).getAvailableAddOnOfferingList().iterator();
                        while (it3.hasNext()) {
                            AvailableAddOnOfferingList next3 = it3.next();
                            if (next3.getRegional().booleanValue()) {
                                availableAddOnOfferingsList.setGroupEnName(this.l.get(i).getGroupEnName());
                                availableAddOnOfferingsList.setGroupArName(this.l.get(i).getGroupArName());
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
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    public final void a(final ArrayList<AvailableAddOnOfferingsList> arrayList) {
        a(false);
        this.g = new dea(getContext(), arrayList);
        this.h.setLayoutManager(new LinearLayoutManager(getContext()));
        this.h.setHasFixedSize(false);
        this.h.setAdapter(this.g);
        this.g.b = new dea.a() { // from class: -$$Lambda$deb$i-hFf1zlTGd8NfD96Xgak-rH5ss
            @Override // defpackage.dea.a
            public final void onItemClick(int i) {
                deb.m105lambda$ihFf1zlTGd8NfD96XgakrH5ss(deb.this, arrayList, i);
            }
        };
    }

    public /* synthetic */ void a(ArrayList arrayList, int i) {
        Intent intent;
        if (((AvailableAddOnOfferingsList) arrayList.get(i)).getChildGroups().size() > 0) {
            intent = new Intent(getContext(), FamilySelectAddonsActivity.class);
            intent.putExtra("SUB_BUNDLES", (Parcelable) arrayList.get(i));
            intent.putExtra("position", this.o);
        } else {
            intent = new Intent(getContext(), FamilySubscribeAddonsActivity.class);
            intent.putExtra("ExtrasList", ((AvailableAddOnOfferingsList) arrayList.get(i)).getAvailableAddOnOfferingList());
            if (this.a.f()) {
                intent.putExtra("title", ((AvailableAddOnOfferingsList) arrayList.get(i)).getGroupArName());
            } else {
                intent.putExtra("title", ((AvailableAddOnOfferingsList) arrayList.get(i)).getGroupEnName());
            }
        }
        startActivity(intent);
    }

    private void a(boolean z) {
        if (z) {
            this.b.a(getContext(), getContext().getString(R.string.loading));
        } else {
            this.b.a();
        }
    }

    private void b(ddz ddzVar) {
        a(false);
        this.l = new ArrayList<>();
        ArrayList<AvailableAddOnOfferingsList> availableAddOnOfferingsList = ddzVar.b.getAvailableAddOnOfferingsList();
        this.l = availableAddOnOfferingsList;
        Collections.sort(availableAddOnOfferingsList);
        if (this.d.g() && this.c.O()) {
            this.j.setVisibility(8);
            this.i.setVisibility(8);
        } else if (a().size() == 0 || !this.p.booleanValue()) {
            this.j.setVisibility(8);
            this.i.setVisibility(8);
        } else {
            this.j.setVisibility(0);
            this.i.setVisibility(0);
        }
        new Gson().a(ddzVar);
        if (this.o == 1) {
            a(a());
        } else {
            a(this.l);
        }
        this.g.notifyDataSetChanged();
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(getContext(), this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (this.m != null) {
            ddz ddzVar = new ddz();
            ResponseRetrieveMoreBundleBody responseRetrieveMoreBundleBody = new ResponseRetrieveMoreBundleBody();
            responseRetrieveMoreBundleBody.setAvailableAddOnOfferingsList(this.m.getChildGroups());
            ddzVar.b = responseRetrieveMoreBundleBody;
            b(ddzVar);
            return;
        }
        this.f.b();
    }

    @Override // androidx.fragment.app.Fragment
    public void onStart() {
        super.onStart();
        a(true);
        if (this.m != null) {
            ddz ddzVar = new ddz();
            ResponseRetrieveMoreBundleBody responseRetrieveMoreBundleBody = new ResponseRetrieveMoreBundleBody();
            responseRetrieveMoreBundleBody.setAvailableAddOnOfferingsList(this.m.getChildGroups());
            ddzVar.b = responseRetrieveMoreBundleBody;
            b(ddzVar);
            return;
        }
        this.f.b();
    }

    @Override // defpackage.dec
    public final void a(ddz ddzVar) {
        this.l = new ArrayList<>();
        ArrayList<AvailableAddOnOfferingsList> availableAddOnOfferingsList = ddzVar.b.getAvailableAddOnOfferingsList();
        this.l = availableAddOnOfferingsList;
        Collections.sort(availableAddOnOfferingsList);
        if (this.d.g() && this.c.O()) {
            this.j.setVisibility(8);
            this.i.setVisibility(8);
        } else if (a().size() == 0 || !this.p.booleanValue()) {
            this.j.setVisibility(8);
            this.i.setVisibility(8);
        } else {
            this.j.setVisibility(0);
            this.i.setVisibility(0);
        }
        new Gson().a(ddzVar);
        if (this.o == 1) {
            a(a());
        } else {
            a(this.l);
        }
        this.g.notifyDataSetChanged();
    }

    @Override // defpackage.dec
    public final void a(int i, String str) {
        this.b.a();
        UnNavigateResponseActivity.a(getContext(), str, getString(R.string.please_try_again), i == 3259 || i == 3239 || i == 9001 || i == 8001, i);
    }
}
