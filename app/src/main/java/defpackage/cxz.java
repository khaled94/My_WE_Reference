package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import com.ucare.we.BalanceTransferActivity;
import com.ucare.we.QuotaTransfer.QuotaTransferActivity;
import com.ucare.we.R;
import com.ucare.we.autopayment.AutoPayment_RechargeBill_Activity;
import com.ucare.we.balancetransferhistory.BalanceTransferHistoryActivity;
import com.ucare.we.billsummary.BillSummaryActivity;
import com.ucare.we.model.PostPaidBalanceResponse;
import com.ucare.we.paymenthistory.PaymentHistoryPostPaidActivity;
import com.ucare.we.presentation.paybillnumbertype.PayBillNumberTypeActivity;
import javax.inject.Inject;
import org.json.JSONException;

/* renamed from: cxz  reason: default package */
/* loaded from: classes2.dex */
public class cxz extends dab implements cyb, dju {
    @Inject
    djw a;
    @Inject
    dhp b;
    @Inject
    dhn c;
    @Inject
    dio d;
    View.OnClickListener e = new View.OnClickListener() { // from class: cxz.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxz.this.startActivity(new Intent(cxz.this.v, PayBillNumberTypeActivity.class));
        }
    };
    View.OnClickListener f = new View.OnClickListener() { // from class: cxz.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxz.this.startActivity(new Intent(cxz.this.v, BalanceTransferActivity.class));
        }
    };
    View.OnClickListener g = new View.OnClickListener() { // from class: cxz.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(cxz.this.v, QuotaTransferActivity.class);
            intent.putExtra("SCREEN_TYPE", 0);
            cxz.this.startActivity(intent);
        }
    };
    View.OnClickListener h = new View.OnClickListener() { // from class: cxz.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxz.this.startActivity(new Intent(cxz.this.v, BillSummaryActivity.class));
        }
    };
    View.OnClickListener i = new View.OnClickListener() { // from class: cxz.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxz.this.startActivity(new Intent(cxz.this.v, PaymentHistoryPostPaidActivity.class));
        }
    };
    View.OnClickListener j = new View.OnClickListener() { // from class: cxz.6
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(cxz.this.v, AutoPayment_RechargeBill_Activity.class);
            intent.putExtra("AutomaticType", "postpaid");
            cxz.this.startActivity(intent);
        }
    };
    View.OnClickListener k = new View.OnClickListener() { // from class: cxz.7
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxz.this.d.l()) {
                Intent intent = new Intent(cxz.this.v, BalanceTransferHistoryActivity.class);
                intent.putExtra("FMC_SELECTED_MSISDN", cxz.this.a.X().get(0));
                cxz.this.startActivity(intent);
                return;
            }
            cxz.this.startActivity(new Intent(cxz.this.v, BalanceTransferHistoryActivity.class));
        }
    };
    private Button l;
    private Button m;
    private Button n;
    private Button o;
    private Button p;
    private Button q;
    private Button r;
    private TextView s;
    private TextView t;
    private cya u;
    private Context v;
    private LinearLayout w;

    public static cxz a() {
        Bundle bundle = new Bundle();
        cxz cxzVar = new cxz();
        cxzVar.setArguments(bundle);
        return cxzVar;
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View inflate = layoutInflater.inflate(R.layout.bill_services_fragment, viewGroup, false);
        this.l = (Button) inflate.findViewById(R.id.btnPayBill);
        this.m = (Button) inflate.findViewById(R.id.btnBalanceTransfer);
        this.n = (Button) inflate.findViewById(R.id.btnQuotaTransfer);
        this.o = (Button) inflate.findViewById(R.id.btnBillServices);
        this.p = (Button) inflate.findViewById(R.id.btnPaymentHistory);
        this.q = (Button) inflate.findViewById(R.id.btn_balance_transfer_history);
        this.s = (TextView) inflate.findViewById(R.id.txtOutStandingAmount);
        this.t = (TextView) inflate.findViewById(R.id.txtUnbilledAmount);
        this.w = (LinearLayout) inflate.findViewById(R.id.llOutstandingContainer);
        this.r = (Button) inflate.findViewById(R.id.btn_autoPayment);
        this.l.setOnClickListener(this.e);
        this.m.setOnClickListener(this.f);
        this.n.setOnClickListener(this.g);
        this.o.setOnClickListener(this.h);
        this.p.setOnClickListener(this.i);
        this.q.setOnClickListener(this.k);
        this.r.setOnClickListener(this.j);
        boolean booleanValue = this.b.g().booleanValue();
        boolean booleanValue2 = this.b.m().booleanValue();
        boolean booleanValue3 = this.b.j().booleanValue();
        boolean booleanValue4 = this.b.i().booleanValue();
        boolean booleanValue5 = this.b.f().booleanValue();
        boolean booleanValue6 = this.b.h().booleanValue();
        boolean booleanValue7 = this.b.l().booleanValue();
        this.w.setVisibility(booleanValue2 ? 0 : 8);
        this.p.setVisibility(booleanValue ? 0 : 8);
        this.m.setVisibility(booleanValue3 ? 0 : 8);
        this.n.setVisibility(booleanValue4 ? 0 : 8);
        this.r.setVisibility(booleanValue5 ? 0 : 8);
        this.o.setVisibility(booleanValue6 ? 0 : 8);
        this.l.setVisibility(booleanValue7 ? 0 : 8);
        if (this.d.h()) {
            this.q.setVisibility(8);
        }
        if (!this.c.f.getFeatureBalanceTransferHistory()) {
            this.q.setVisibility(8);
        }
        if (!this.d.l() && this.d.f()) {
            if (!this.c.f.getFeatureBalanceTransferHistory() || !this.c.f.isFeature_balancetransferhistory_mobile()) {
                this.q.setVisibility(8);
            }
        } else if (!this.d.l() && this.d.g() && (!this.c.f.getFeatureBalanceTransferHistory() || !this.c.f.isFeature_balancetransferhistory_ADSL())) {
            this.q.setVisibility(8);
        }
        if (this.d.l()) {
            if (this.a.X().size() <= 0) {
                this.q.setVisibility(8);
            } else {
                this.q.setVisibility(0);
            }
        }
        return inflate;
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        FragmentActivity activity = getActivity();
        this.v = activity;
        this.u = new cya(activity, this, this);
        try {
            if (!this.b.m().booleanValue()) {
                return;
            }
            this.u.a();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.cyb
    public final void a(PostPaidBalanceResponse postPaidBalanceResponse) {
        TextView textView = this.s;
        textView.setText(String.valueOf(postPaidBalanceResponse.body.outstandingAmount) + " " + this.v.getString(R.string.egp));
        TextView textView2 = this.t;
        textView2.setText(String.valueOf(postPaidBalanceResponse.body.unbilledFees) + " " + this.v.getString(R.string.egp));
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.v, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        if (i != 1) {
            return;
        }
        try {
            this.u.a();
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
