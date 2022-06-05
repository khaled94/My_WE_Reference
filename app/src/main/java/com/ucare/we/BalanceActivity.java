package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.QuotaTransfer.QuotaTransferActivity;
import com.ucare.we.autopayment.AutoPayment_RechargeBill_Activity;
import com.ucare.we.balancetransferhistory.BalanceTransferHistoryActivity;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.presentation.paymenthistory.PaymentHistoryActivity;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class BalanceActivity extends czy implements View.OnClickListener, dht {
    @Inject
    djx a;
    @Inject
    dhn b;
    @Inject
    dhp c;
    TextView d;
    @Inject
    djw e;
    Button f;
    TextView g;
    TextView h;
    TextView i;
    TextView j;
    @Inject
    dhu k;
    @Inject
    dio l;
    Button m;
    Button n;
    Button o;
    Button p;
    Button q;
    Button r;
    ImageView s;

    @Override // defpackage.dht
    public final void a(int i, String str) {
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
    }

    @Override // defpackage.dht
    public final void a(String str) {
    }

    @Override // defpackage.dht
    public final void a(String str, String str2) {
    }

    @Override // defpackage.dht
    public final void a(ArrayList<ExtrasList> arrayList) {
    }

    @Override // defpackage.dht
    public final void a(List<SummarizedLineUsageItem> list) {
    }

    @Override // defpackage.dht
    public final void a_(int i) {
    }

    @Override // defpackage.dht
    public final void a_(String str) {
    }

    @Override // defpackage.dht
    public final void b(int i, String str) {
    }

    @Override // defpackage.dht
    public final void b(String str) {
    }

    @Override // defpackage.dht
    public final void b(ArrayList<SpecialList> arrayList) {
    }

    @Override // defpackage.dht
    public final void b(List<MainPlanResponseBody> list) {
    }

    @Override // defpackage.dht
    public final void c(String str) {
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
    }

    @Override // defpackage.dht
    public final void e() {
    }

    @Override // defpackage.dht
    public final void e(String str) {
    }

    @Override // defpackage.dht
    public final void f() {
    }

    @Override // defpackage.dht
    public final void g() {
    }

    @Override // defpackage.dht
    public final void h() {
    }

    @Override // defpackage.dht
    public final void i() {
    }

    @Override // defpackage.dht
    public final void j() {
    }

    @Override // defpackage.dht
    public final void p_() {
    }

    @Override // defpackage.dht
    public final void q_() {
    }

    @Override // defpackage.dht
    public final void r_() {
    }

    @Override // defpackage.dht
    public final void s_() {
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_balance);
        a(getString(R.string.balance_services), false, false);
        TextView textView = (TextView) findViewById(R.id.txtTitle);
        this.j = textView;
        textView.setText(getString(R.string.balance_services));
        this.s = (ImageView) findViewById(R.id.imgBackButton);
        this.m = (Button) findViewById(R.id.btn_recharge);
        this.n = (Button) findViewById(R.id.btn_payment_history);
        this.q = (Button) findViewById(R.id.btn_balance_transfer_history);
        this.o = (Button) findViewById(R.id.btn_balance_transfer);
        this.r = (Button) findViewById(R.id.btn_auto_recharge);
        this.p = (Button) findViewById(R.id.btn_quota_transfer);
        this.d = (TextView) findViewById(R.id.tv_balance);
        this.f = (Button) findViewById(R.id.btn_current_number);
        this.h = (TextView) findViewById(R.id.current_number);
        this.g = (TextView) findViewById(R.id.btn_current_balance);
        this.i = (TextView) findViewById(R.id.current_balance);
        TextView textView2 = this.g;
        textView2.setText(this.e.z() + " " + getString(R.string.egp));
        this.s.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.q.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.r.setOnClickListener(this);
        this.p.setOnClickListener(this);
        if (this.l.h()) {
            this.n.setVisibility(8);
        }
        if (this.l.h() && this.l.e()) {
            this.q.setVisibility(8);
        }
        if (!this.b.f.getFeatureBalanceTransferHistory() || !this.b.f.isFeature_balancetransferhistory_mobile() || this.l.l()) {
            this.q.setVisibility(8);
        }
        this.f.setText(this.e.m());
        this.k.a(this);
        boolean booleanValue = this.c.j().booleanValue();
        boolean booleanValue2 = this.c.i().booleanValue();
        this.o.setVisibility(booleanValue ? 0 : 8);
        this.p.setVisibility(booleanValue2 ? 0 : 8);
        if (!this.e.a()) {
            this.o.setVisibility(8);
        }
        boolean e = this.l.e();
        this.i.setVisibility(e ? 8 : 0);
        this.g.setVisibility(e ? 8 : 0);
        if (this.l.e()) {
            if (this.c.f().booleanValue()) {
                this.r.setVisibility(0);
                this.r.setText(getString(R.string.Auto_payment));
                return;
            }
            this.r.setVisibility(8);
            return;
        }
        this.b.f.isFeatureAutorecharge();
        this.l.l();
        if (this.c.e().booleanValue()) {
            this.r.setVisibility(0);
            this.r.setText(getString(R.string.Auto_recharge));
            return;
        }
        this.r.setVisibility(8);
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.k.a();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imgBackButton) {
            finish();
        } else if (id == R.id.btn_balance_transfer) {
            Intent intent = new Intent(this, QuotaTransferActivity.class);
            intent.putExtra("SCREEN_TYPE", 1);
            startActivity(intent);
        } else if (id == R.id.btn_recharge) {
            this.a.b(this, BalanceRechargeActivity.class);
        } else if (id == R.id.btn_payment_history) {
            this.a.b(this, PaymentHistoryActivity.class);
        } else if (id == R.id.btn_balance_transfer_history) {
            this.a.b(this, BalanceTransferHistoryActivity.class);
        } else if (id == R.id.btn_auto_recharge) {
            Intent intent2 = new Intent(this, AutoPayment_RechargeBill_Activity.class);
            intent2.putExtra("AutomaticType", "prepaid");
            startActivity(intent2);
        } else if (id != R.id.btn_quota_transfer) {
        } else {
            Intent intent3 = new Intent(this, QuotaTransferActivity.class);
            intent3.putExtra("SCREEN_TYPE", 0);
            startActivity(intent3);
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.k.b(this);
        super.onDestroy();
    }

    @Override // defpackage.dht
    public final void a(float f) {
        this.e.a(f);
    }
}
