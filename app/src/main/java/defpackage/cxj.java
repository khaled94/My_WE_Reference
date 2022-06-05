package defpackage;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import com.ucare.we.BalanceRechargeActivity;
import com.ucare.we.QuotaTransfer.QuotaTransferActivity;
import com.ucare.we.R;
import com.ucare.we.autopayment.AutoPayment_RechargeBill_Activity;
import com.ucare.we.balancetransferhistory.BalanceTransferHistoryActivity;
import com.ucare.we.billsummary.BillSummaryActivity;
import com.ucare.we.paybillpaymentmethod.PaymentMethodActivity;
import com.ucare.we.paymenthistory.PaymentHistoryPostPaidActivity;
import com.ucare.we.presentation.paymenthistory.PaymentHistoryActivity;
import javax.inject.Inject;

/* renamed from: cxj  reason: default package */
/* loaded from: classes2.dex */
public class cxj extends dab {
    @Inject
    dio a;
    @Inject
    dhp b;
    Context c;
    Button d;
    Button e;
    Button f;
    Button g;
    Button h;
    Button i;
    Button j;
    Button k;
    @Inject
    djw l;
    @Inject
    dhn m;
    View.OnClickListener n = new View.OnClickListener() { // from class: cxj.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(cxj.this.c, QuotaTransferActivity.class);
            intent.putExtra("SCREEN_TYPE", 1);
            cxj.this.startActivity(intent);
        }
    };
    View.OnClickListener o = new View.OnClickListener() { // from class: cxj.2
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(cxj.this.getActivity(), AutoPayment_RechargeBill_Activity.class);
            if (cxj.this.a.d()) {
                intent.putExtra("AutomaticType", "prepaid");
            } else {
                intent.putExtra("AutomaticType", "postpaid");
            }
            cxj.this.startActivity(intent);
        }
    };
    View.OnClickListener p = new View.OnClickListener() { // from class: cxj.3
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxj.this.startActivity(new Intent(cxj.this.c, BalanceTransferHistoryActivity.class));
        }
    };
    View.OnClickListener q = new View.OnClickListener() { // from class: cxj.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            Intent intent = new Intent(cxj.this.c, QuotaTransferActivity.class);
            intent.putExtra("SCREEN_TYPE", 0);
            cxj.this.startActivity(intent);
        }
    };
    View.OnClickListener r = new View.OnClickListener() { // from class: cxj.5
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (cxj.this.a.e()) {
                cxj.this.startActivity(new Intent(cxj.this.c, PaymentHistoryPostPaidActivity.class));
                return;
            }
            cxj.this.startActivity(new Intent(cxj.this.c, PaymentHistoryActivity.class));
        }
    };
    View.OnClickListener s = new View.OnClickListener() { // from class: cxj.6
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxj.this.startActivity(new Intent(cxj.this.c, PaymentMethodActivity.class));
        }
    };
    View.OnClickListener t = new View.OnClickListener() { // from class: cxj.7
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxj.this.startActivity(new Intent(cxj.this.c, BillSummaryActivity.class));
        }
    };
    View.OnClickListener u = new View.OnClickListener() { // from class: cxj.8
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            cxj.this.startActivity(new Intent(cxj.this.c, BalanceRechargeActivity.class));
        }
    };

    public static cxj a() {
        return new cxj();
    }

    @Override // defpackage.dab, androidx.fragment.app.Fragment
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public void onActivityCreated(Bundle bundle) {
        super.onActivityCreated(bundle);
        this.c = getActivity();
        dio dioVar = new dio();
        this.a = dioVar;
        int i = 0;
        if (dioVar.e()) {
            boolean booleanValue = this.b.j().booleanValue();
            boolean booleanValue2 = this.b.k().booleanValue();
            boolean booleanValue3 = this.b.l().booleanValue();
            boolean booleanValue4 = this.b.h().booleanValue();
            this.i.setVisibility(booleanValue3 ? 0 : 8);
            this.j.setVisibility(booleanValue4 ? 0 : 8);
            this.d.setVisibility(booleanValue ? 0 : 8);
            Button button = this.h;
            if (!booleanValue2) {
                i = 8;
            }
            button.setVisibility(i);
            b();
            return;
        }
        boolean booleanValue5 = this.b.l().booleanValue();
        boolean booleanValue6 = this.b.h().booleanValue();
        this.i.setVisibility(booleanValue5 ? 0 : 8);
        Button button2 = this.j;
        if (!booleanValue6) {
            i = 8;
        }
        button2.setVisibility(i);
        b();
    }

    @Override // androidx.fragment.app.Fragment
    public View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        int i = 0;
        View inflate = layoutInflater.inflate(R.layout.fragment_adslbalance_services, viewGroup, false);
        this.d = (Button) inflate.findViewById(R.id.btnBalanceTransfer);
        this.f = (Button) inflate.findViewById(R.id.btnQuotaTransfer);
        this.g = (Button) inflate.findViewById(R.id.btn_balance_transfer_history);
        this.h = (Button) inflate.findViewById(R.id.btnBalanceRecharge);
        this.i = (Button) inflate.findViewById(R.id.btnPayBill);
        this.j = (Button) inflate.findViewById(R.id.btnBillServices);
        this.e = (Button) inflate.findViewById(R.id.btn_auto_recharge);
        this.k = (Button) inflate.findViewById(R.id.btnPaymentHistory);
        this.d.setOnClickListener(this.n);
        this.f.setOnClickListener(this.q);
        this.g.setOnClickListener(this.p);
        this.h.setOnClickListener(this.u);
        this.i.setOnClickListener(this.s);
        this.j.setOnClickListener(this.t);
        this.k.setOnClickListener(this.r);
        this.e.setOnClickListener(this.o);
        boolean booleanValue = this.b.g().booleanValue();
        boolean booleanValue2 = this.b.i().booleanValue();
        boolean booleanValue3 = this.b.j().booleanValue();
        boolean booleanValue4 = this.b.e().booleanValue();
        this.e.setVisibility(booleanValue4 ? 0 : 8);
        this.f.setVisibility(booleanValue2 ? 0 : 8);
        this.k.setVisibility(booleanValue ? 0 : 8);
        this.d.setVisibility(booleanValue3 ? 0 : 8);
        Button button = this.e;
        if (!booleanValue4) {
            i = 8;
        }
        button.setVisibility(i);
        if (this.a.d()) {
            this.k.setText(getString(R.string.balance_details));
        }
        if (this.a.g() && this.a.h()) {
            this.g.setVisibility(8);
        }
        this.e.setText(getString(this.a.e() ? R.string.Auto_payment : R.string.Auto_recharge));
        return inflate;
    }

    private void b() {
        if (!this.l.b() || !this.m.f.isFeature_balancetransferhistory_ADSL()) {
            this.g.setVisibility(8);
        }
    }
}
