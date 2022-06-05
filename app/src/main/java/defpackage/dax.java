package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.Offer;
import com.ucare.we.model.family.FamilyOffersAddonsList;
import com.ucare.we.morebundle.SubscribeToAddOnConfirmation;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;

/* renamed from: dax  reason: default package */
/* loaded from: classes2.dex */
public class dax extends dab implements dbk, dcq, Serializable {
    @Inject
    djb a;
    private RecyclerView b;
    private LinearLayout c;
    private daw d;
    private dbj e;
    private ArrayList<FamilyOffersAddonsList> f;
    private ArrayList<Offer> g;
    private int h;

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void d(int i) {
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_subscribe_to_more_bundle, viewGroup, false);
        this.b = (RecyclerView) inflate.findViewById(R.id.rv_subscribe_bundles);
        this.c = (LinearLayout) inflate.findViewById(R.id.Limonthlyoronce);
        this.e = new dbj(getContext(), this);
        this.f = new ArrayList<>();
        this.h = -1;
        this.f = (ArrayList) getArguments().getSerializable("ExtrasList");
        if (getArguments().getInt("position") == 1) {
            ArrayList<FamilyOffersAddonsList> arrayList = new ArrayList<>();
            Iterator<FamilyOffersAddonsList> it = this.f.iterator();
            while (it.hasNext()) {
                FamilyOffersAddonsList next = it.next();
                if (next.getRegional().booleanValue()) {
                    arrayList.add(next);
                }
            }
            a(arrayList);
        } else {
            a(this.f);
        }
        return inflate;
    }

    private void a(ArrayList<FamilyOffersAddonsList> arrayList) {
        this.d = new daw(getContext(), arrayList, this);
        this.b.setLayoutManager(new LinearLayoutManager(getContext()));
        this.b.setHasFixedSize(false);
        this.b.setAdapter(this.d);
        this.d.f = $$Lambda$dax$YMgJpacT7cc0Q78BF9WWZwAPng.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    private void a(int i, String str) {
        ArrayList<Offer> arrayList = new ArrayList<>();
        this.g = arrayList;
        arrayList.add(new Offer(str, "add"));
        Intent intent = new Intent(getActivity(), SubscribeToAddOnConfirmation.class);
        intent.putExtra("id", str);
        if (this.a.f()) {
            intent.putExtra("name", this.f.get(i).getOfferArName());
        } else {
            intent.putExtra("name", this.f.get(i).getOfferEnName());
        }
        getActivity().startActivity(intent);
    }

    @Override // defpackage.dcq
    public final void a(int i) {
        if (i != -1) {
            a(i, this.f.get(i).getAddOnGroupOfferingsID().getOneTimeOfferingId());
        }
    }

    @Override // defpackage.dcq
    public final void b(int i) {
        if (i != -1) {
            a(i, this.f.get(i).getAddOnGroupOfferingsID().getRecurringOfferingId());
        }
    }

    @Override // defpackage.dcq
    public final boolean c(int i) {
        if (this.f.get(i).getAddOnGroupOfferingsID() != null) {
            if (this.f.get(i).getAddOnGroupOfferingsID().getOneTimeOfferingId() != null && this.f.get(i).getAddOnGroupOfferingsID().getRecurringOfferingId() != null) {
                return true;
            }
            a(i, this.f.get(i).getAddOnGroupOfferingsID().getOtherOfferingId());
            return false;
        }
        a(i, this.f.get(i).getOfferId());
        return false;
    }
}
