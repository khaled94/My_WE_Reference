package defpackage;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.TextView;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.Offer;
import com.ucare.we.model.MoreBundleModel.PurchasedAddOnOfferingsList;
import com.ucare.we.model.MoreBundleModel.ResponseRetrieveMoreBundle;
import com.ucare.we.morebundle.ConfirmRenewalExtraActivity;
import com.ucare.we.morebundle.ConfirmUnsubscribeFromMoreBundleActivity;
import com.ucare.we.morebundle.SelectMoreBundlesActivity;
import defpackage.day;
import java.util.ArrayList;
import javax.inject.Inject;

/* renamed from: daz */
/* loaded from: classes2.dex */
public class daz extends dab implements dbb, dcl, dju {
    ArrayList<PurchasedAddOnOfferingsList> a;
    @Inject
    djg b;
    @Inject
    djb c;
    @Inject
    dhu d;
    @Inject
    djw e;
    @Inject
    dio f;
    @Inject
    dhp g;
    @Inject
    dgc h;
    Activity i;
    View.OnClickListener j = new View.OnClickListener() { // from class: daz.1
        {
            daz.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(daz.this.getContext(), SelectMoreBundlesActivity.class);
            intent.putExtra(dat.a, daz.this.t);
            intent.putExtra("bundle", daz.this.u);
            daz.this.startActivity(intent);
        }
    };
    private RecyclerView k;
    private day l;
    private dba m;
    private Button n;
    private ArrayList<Offer> o;
    private Context p;
    private TextView q;
    private TextView r;
    private int s;
    private String t;
    private ResponseRetrieveMoreBundle u;

    public static /* synthetic */ void lambda$3Vv1CkOBAkSbgL0O6wy5xtrfcM0(daz dazVar, ArrayList arrayList, int i) {
        dazVar.a(arrayList, i);
    }

    public static daz a(String str) {
        daz dazVar = new daz();
        Bundle bundle = new Bundle();
        bundle.putSerializable(dat.a, str);
        dazVar.setArguments(bundle);
        return dazVar;
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.i = getActivity();
        if (getArguments() != null) {
            String string = getArguments().getString(dat.a);
            this.t = string;
            this.e.A(string);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.fragment_more_bundle, viewGroup, false);
        this.k = (RecyclerView) inflate.findViewById(R.id.rv_subscribed_bundles);
        this.n = (Button) inflate.findViewById(R.id.btn_add_more_bundles);
        if (this.e.v().equalsIgnoreCase("prepaid")) {
            this.n.setText(R.string.more_data_addons);
        }
        this.q = (TextView) inflate.findViewById(R.id.txtDisc);
        this.r = (TextView) inflate.findViewById(R.id.txtNoData);
        this.n.setBackgroundResource(R.drawable.new_rounded_corner_button_stroke);
        this.n.setTextColor(ContextCompat.getColor(this.i, R.color.black_light));
        this.n.setEnabled(false);
        this.m = new dba(this, this, this);
        this.n.setOnClickListener(this.j);
        return inflate;
    }

    private void a(final ArrayList<PurchasedAddOnOfferingsList> arrayList) {
        this.l = new day(getContext(), arrayList, this, this.g);
        this.a = arrayList;
        this.k.setLayoutManager(new LinearLayoutManager(getContext()));
        this.k.setHasFixedSize(false);
        this.k.setAdapter(this.l);
        this.l.d = new day.a() { // from class: -$$Lambda$daz$3Vv1CkOBAkSbgL0O6wy5xtrfcM0
            @Override // defpackage.day.a
            public final void onDeleteClick(int i) {
                daz.lambda$3Vv1CkOBAkSbgL0O6wy5xtrfcM0(daz.this, arrayList, i);
            }
        };
        this.l.notifyItemRemoved(this.s);
    }

    public /* synthetic */ void a(ArrayList arrayList, int i) {
        this.s = i;
        Intent intent = new Intent(getContext(), ConfirmUnsubscribeFromMoreBundleActivity.class);
        intent.putExtra("position", String.valueOf(this.s));
        intent.putExtra("bundle_id", ((PurchasedAddOnOfferingsList) arrayList.get(this.s)).getOfferId());
        if (this.c.f()) {
            intent.putExtra("bundle_name", ((PurchasedAddOnOfferingsList) arrayList.get(this.s)).getOfferArName());
        } else {
            intent.putExtra("bundle_name", ((PurchasedAddOnOfferingsList) arrayList.get(this.s)).getOfferEnName());
        }
        startActivityForResult(intent, 1);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i == 1 && i2 == -1) {
            a(true);
            String stringExtra = intent.getStringExtra("position");
            ArrayList<Offer> arrayList = new ArrayList<>();
            this.o = arrayList;
            arrayList.add(new Offer(this.a.get(Integer.valueOf(stringExtra).intValue()).getOfferId(), "delete"));
            this.m.a(this.o, this.a.get(Integer.valueOf(stringExtra).intValue()).getOfferEnName());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.p = getActivity();
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        a(true);
        if (this.e.O()) {
            if (this.t.equalsIgnoreCase(this.p.getString(R.string.fmc_group_tag))) {
                this.m.a(true);
                return;
            } else {
                this.m.a(false);
                return;
            }
        }
        this.m.a(false);
    }

    @Override // defpackage.dbb
    public final void a(boolean z) {
        if (z) {
            djg djgVar = this.b;
            Context context = this.p;
            djgVar.a(context, context.getString(R.string.loading));
            return;
        }
        this.b.a();
    }

    @Override // defpackage.dbb
    public final void a(ResponseRetrieveMoreBundle responseRetrieveMoreBundle, Boolean bool) {
        if (this.e.T()) {
            this.e.s(false);
            onResume();
        } else if (responseRetrieveMoreBundle != null) {
            a(false);
            this.u = responseRetrieveMoreBundle;
            this.m.b(bool.booleanValue());
            if (responseRetrieveMoreBundle.getBody().getPurchasedAddOnOfferingsList().size() > 0) {
                a(responseRetrieveMoreBundle.getBody().getPurchasedAddOnOfferingsList());
                this.l.notifyDataSetChanged();
                this.q.setVisibility(0);
                this.r.setVisibility(8);
                return;
            }
            a(responseRetrieveMoreBundle.getBody().getPurchasedAddOnOfferingsList());
            this.l.notifyDataSetChanged();
            this.q.setVisibility(8);
            this.r.setVisibility(0);
        } else {
            a(false);
            this.q.setVisibility(8);
            this.r.setVisibility(0);
        }
    }

    @Override // defpackage.dbb
    public final void a(String str, String str2) {
        ConfirmRenewalExtraActivity.a(this.p, str, str2);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.p, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i != 1) {
            if (i != 2) {
                return;
            }
            this.m.a(this.o, this.a.get(this.s).getOfferEnName());
        } else if (this.e.O()) {
            if (this.t.equalsIgnoreCase(this.p.getString(R.string.fmc_group_tag))) {
                this.m.a(true);
            } else {
                this.m.a(false);
            }
        } else {
            this.m.a(false);
        }
    }

    @Override // defpackage.dcl
    public final Context a() {
        return getContext();
    }

    @Override // defpackage.dcl
    public final void b() {
        this.n.setBackgroundResource(R.drawable.new_rounded_corner_white_bg_stroke);
        this.n.setTextColor(ContextCompat.getColor(getContext(), R.color.color_dark_purple_new));
        this.n.setEnabled(true);
    }

    @Override // defpackage.dcl
    public final void b(boolean z) {
        if (this.h.a() != null && this.h.a().getMoreBundles() != null && !this.h.a().getMoreBundles().contains(this.e.w())) {
            this.n.setBackgroundResource(R.drawable.rounded_corner_button_with_border);
            this.n.setTextColor(ContextCompat.getColor(this.i, R.color.black_light));
            this.n.setEnabled(false);
            this.n.setAlpha(0.6f);
        } else {
            this.n.setBackgroundResource(R.drawable.new_rounded_corner_white_bg_stroke);
            this.n.setTextColor(ContextCompat.getColor(this.i, R.color.color_dark_purple_new));
            this.n.setEnabled(true);
        }
        if (!z) {
            this.n.setBackgroundResource(R.drawable.new_rounded_corner_button_stroke);
            this.n.setTextColor(ContextCompat.getColor(this.i, R.color.black_light));
            this.n.setEnabled(false);
            this.n.setAlpha(0.6f);
            return;
        }
        this.n.setBackgroundResource(R.drawable.new_rounded_corner_white_bg_stroke);
        this.n.setTextColor(ContextCompat.getColor(this.i, R.color.color_dark_purple_new));
        this.n.setEnabled(true);
    }
}
