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
import com.ucare.we.model.MoreBundleModel.AvailableAddOnOfferingList;
import com.ucare.we.model.ServerResponse;
import com.ucare.we.model.local.family.OffersRequestArray;
import com.ucare.we.presentation.genericconfirmation.GlobalConfirmationActivity;
import com.ucare.we.presentation.offers.UnNavigateResponseActivity;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Iterator;
import javax.inject.Inject;

/* renamed from: dee  reason: default package */
/* loaded from: classes2.dex */
public class dee extends dab implements dbk, dcq, dfl, Serializable {
    @Inject
    djb a;
    String b;
    ArrayList<OffersRequestArray> c;
    @Inject
    dfp d;
    @Inject
    djg e;
    private RecyclerView f;
    private LinearLayout g;
    private ded h;
    private dbj i;
    private ArrayList<AvailableAddOnOfferingList> j;
    private int k;

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
        this.f = (RecyclerView) inflate.findViewById(R.id.rv_subscribe_bundles);
        this.g = (LinearLayout) inflate.findViewById(R.id.Limonthlyoronce);
        this.i = new dbj(getContext(), this);
        this.j = new ArrayList<>();
        this.k = -1;
        this.j = (ArrayList) getArguments().getSerializable("ExtrasList");
        if (getArguments().getInt("position") == 1) {
            ArrayList<AvailableAddOnOfferingList> arrayList = new ArrayList<>();
            Iterator<AvailableAddOnOfferingList> it = this.j.iterator();
            while (it.hasNext()) {
                AvailableAddOnOfferingList next = it.next();
                if (next.getRegional().booleanValue()) {
                    arrayList.add(next);
                }
            }
            a(arrayList);
        } else {
            a(this.j);
        }
        return inflate;
    }

    private void a(ArrayList<AvailableAddOnOfferingList> arrayList) {
        this.h = new ded(getContext(), arrayList, this);
        this.f.setLayoutManager(new LinearLayoutManager(getContext()));
        this.f.setHasFixedSize(false);
        this.f.setAdapter(this.h);
        this.h.f = $$Lambda$dee$Xp8UAC0LfzDGH7K_FkwCRLotHU8.INSTANCE;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
    }

    private void b(int i, String str) {
        String str2;
        this.b = str;
        String string = getString(R.string.familyAddSharedAddon);
        if (this.a.f()) {
            str2 = String.format(getString(R.string.are_you_sure_to_add_offer), this.j.get(i).getOfferArName());
        } else {
            str2 = String.format(getString(R.string.are_you_sure_to_add_offer), this.j.get(i).getOfferEnName());
        }
        Intent intent = new Intent(getActivity(), GlobalConfirmationActivity.class);
        intent.putExtra("confirmation_title", string);
        intent.putExtra("confirmation_hint", str2);
        startActivityForResult(intent, 102);
    }

    @Override // defpackage.dcq
    public final void a(int i) {
        if (i != -1) {
            b(i, this.j.get(i).getAddOnGroupOfferingsID().getOneTimeOfferingId());
        }
    }

    @Override // defpackage.dcq
    public final void b(int i) {
        if (i != -1) {
            b(i, this.j.get(i).getAddOnGroupOfferingsID().getRecurringOfferingId());
        }
    }

    @Override // defpackage.dcq
    public final boolean c(int i) {
        if (this.j.get(i).getAddOnGroupOfferingsID() != null) {
            if (this.j.get(i).getAddOnGroupOfferingsID().getOneTimeOfferingId() != null && this.j.get(i).getAddOnGroupOfferingsID().getRecurringOfferingId() != null) {
                return true;
            }
            b(i, this.j.get(i).getAddOnGroupOfferingsID().getOtherOfferingId());
            return false;
        }
        b(i, this.j.get(i).getOfferId());
        return false;
    }

    @Override // defpackage.dfl
    public final void a(ServerResponse serverResponse) {
        this.e.a();
        UnNavigateResponseActivity.b(getContext(), getString(R.string.successful), serverResponse.getHeader().getResponseMessage());
    }

    @Override // defpackage.dfl
    public final void a(int i, String str) {
        this.e.a();
        UnNavigateResponseActivity.a(getContext(), str, getString(R.string.please_try_again), i == 3259 || i == 3239 || i == 9001 || i == 8001, i);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1 && i == 102) {
            this.e.a(getContext(), getString(R.string.loading));
            ArrayList<OffersRequestArray> arrayList = new ArrayList<>();
            this.c = arrayList;
            arrayList.add(new OffersRequestArray(this.b));
            this.d.a(this.c);
            this.d.a(this);
        }
    }
}
