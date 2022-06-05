package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.util.DisplayMetrics;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.card.MaterialCardView;
import com.ucare.we.R;
import com.ucare.we.confirmswitchingaccount.ConfirmSwitchingAccountActivity;
import com.ucare.we.model.StatusModel.StatusResponse;
import com.ucare.we.model.SwitchAccountModel.ManagedLine;
import com.ucare.we.newHome.features.HomeActivity;
import com.ucare.we.presentation.switchaccount.CancelAccessConfirmationActivity;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;

/* renamed from: dhe  reason: default package */
/* loaded from: classes2.dex */
public class dhe extends dab implements dhc, dhg, dju {
    @Inject
    djw a;
    @Inject
    dio b;
    @Inject
    djg c;
    private RecyclerView d;
    private dhf e;
    private Context f;
    private TextView g;
    private List<ManagedLine> h;
    private List<ManagedLine> i;
    private int j;
    private MaterialCardView k;
    private RelativeLayout l;

    public static dhe a() {
        Bundle bundle = new Bundle();
        dhe dheVar = new dhe();
        dheVar.setArguments(bundle);
        return dheVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.switch_account_post_paid_fragment, viewGroup, false);
        this.d = (RecyclerView) inflate.findViewById(R.id.rvAssociatedNumbers);
        this.k = (MaterialCardView) inflate.findViewById(R.id.switch_account_layout);
        this.g = (TextView) inflate.findViewById(R.id.txtDisc);
        this.l = (RelativeLayout) inflate.findViewById(R.id.txtDisc_no_numbers);
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.f = activity;
        this.e = new dhf(activity, this, this);
    }

    @Override // androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        a(true);
        this.e.a();
    }

    @Override // defpackage.dhg
    public final void a(boolean z) {
        if (z) {
            this.c.a(this.f, getString(R.string.loading));
        } else {
            this.c.a();
        }
    }

    @Override // defpackage.dhg
    public final void a(List<ManagedLine> list, List<ManagedLine> list2) {
        this.h = list;
        this.i = list2;
        for (int i = 0; i < this.h.size(); i++) {
            if (list.get(i).mobileNumber.equals(this.a.B())) {
                this.h.get(i).isMainNumber = true;
            }
        }
        for (int i2 = 0; i2 < this.h.size(); i2++) {
            if (list.get(i2).mobileNumber.equals(this.a.m())) {
                this.h.remove(i2);
            }
        }
        for (int i3 = 0; i3 < list2.size(); i3++) {
            if (list2.get(i3).mobileNumber.equals(this.a.m())) {
                this.i.remove(i3);
            } else if (list2.get(i3).mobileNumber.equals(this.a.B())) {
                this.i.get(i3).isMainNumber = true;
            }
        }
        if (this.h.size() == 0 && this.i.size() == 0) {
            this.g.setText(this.f.getString(R.string.no_myNumbers));
            this.g.setVisibility(8);
            DisplayMetrics displayMetrics = this.f.getResources().getDisplayMetrics();
            int i4 = (int) ((displayMetrics.heightPixels / displayMetrics.density) / 1.5d);
            this.l.setPadding(0, i4, 0, i4);
            this.l.setVisibility(0);
            this.d.setVisibility(8);
            this.k.setBackgroundResource(R.color.color_background);
            return;
        }
        this.l.setVisibility(8);
        dhd dhdVar = new dhd(this.f, list, list2, this);
        this.d.setLayoutManager(new LinearLayoutManager(this.f));
        this.d.setAdapter(dhdVar);
    }

    @Override // defpackage.dhg
    public final void a(String str) {
        Intent intent = new Intent(this.f, ConfirmSwitchingAccountActivity.class);
        intent.putExtra(TypedValues.Attributes.S_TARGET, this.i.get(this.j).mobileNumber);
        intent.putExtra("maskedMsisdn", str);
        this.f.startActivity(intent);
    }

    @Override // defpackage.dhg
    public final void a(StatusResponse statusResponse) {
        this.a.d(statusResponse.header.msisdn);
        this.a.e(statusResponse.body.customerName);
        this.b.r = djv.a("jwt", "");
        Intent intent = new Intent(this.f, HomeActivity.class);
        if (this.b.l()) {
            this.a.l(statusResponse.body.type);
            this.a.m(statusResponse.body.role);
            Intent intent2 = new Intent(this.f, HomeActivity.class);
            intent2.addFlags(67108864);
            this.f.startActivity(intent2);
        } else if (statusResponse.body.type.equalsIgnoreCase("prepaid")) {
            this.a.l(statusResponse.body.type);
            this.a.m(statusResponse.body.role);
            if (this.b.f() && this.b.h()) {
                intent = new Intent(this.f, HomeActivity.class);
            } else if (this.b.g() && this.b.h()) {
                intent = new Intent(this.f, HomeActivity.class);
            } else if (this.b.g() && !this.b.h()) {
                intent = new Intent(this.f, HomeActivity.class);
            } else if (this.b.f() && !this.b.h()) {
                intent = new Intent(this.f, HomeActivity.class);
            }
            intent.addFlags(67108864);
            this.f.startActivity(intent);
        } else if (!statusResponse.body.type.equalsIgnoreCase("postpaid")) {
        } else {
            this.a.l(statusResponse.body.type);
            this.a.m(statusResponse.body.role);
            if (this.b.f() && this.b.h()) {
                intent = new Intent(this.f, HomeActivity.class);
            } else if (this.b.g() && this.b.h()) {
                intent = new Intent(this.f, HomeActivity.class);
            } else if (this.b.g() && !this.b.h()) {
                intent = new Intent(this.f, HomeActivity.class);
            } else if (this.b.f() && !this.b.h()) {
                intent = new Intent(this.f, HomeActivity.class);
            }
            intent.addFlags(67108864);
            this.f.startActivity(intent);
        }
    }

    @Override // defpackage.dhc
    public final void a(int i) {
        this.j = i;
        this.e.a(this.i.get(i).mobileNumber);
    }

    @Override // defpackage.dhc
    public final void c(int i) {
        this.j = i;
        Intent intent = new Intent(this.f, CancelAccessConfirmationActivity.class);
        intent.putExtra("mobileNumber", this.h.get(i).mobileNumber);
        this.f.startActivity(intent);
    }

    @Override // defpackage.dhc
    public final void a(int i, String str) {
        this.j = i;
        dhf dhfVar = this.e;
        try {
            dhfVar.f.a(true);
            djl.a(dhfVar.e).o(str, dhfVar.h, dhfVar.i);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dju
    public final void b(int i) {
        djg djgVar = this.c;
        Context context = this.f;
        djgVar.a(context, context.getString(R.string.loading));
        new djc(this.f, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i == 1) {
            this.e.a();
        } else if (i != 2) {
        } else {
            this.e.a(this.i.get(this.j).mobileNumber);
        }
    }
}
