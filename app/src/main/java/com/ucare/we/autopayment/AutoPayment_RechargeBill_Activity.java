package com.ucare.we.autopayment;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class AutoPayment_RechargeBill_Activity extends czy {
    TextView a;
    @Inject
    djw b;
    View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.autopayment.AutoPayment_RechargeBill_Activity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            AutoPayment_RechargeBill_Activity.this.finish();
        }
    };
    String d;
    private ImageView e;
    private Button f;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity);
        this.d = getIntent().getStringExtra("AutomaticType");
        this.a = (TextView) findViewById(R.id.txtTitle);
        this.e = (ImageView) findViewById(R.id.imgBackButton);
        this.f = (Button) findViewById(R.id.btn_current_number);
        this.e.setOnClickListener(this.c);
        this.f.setText(this.b.m());
        if (this.d.equals("postpaid")) {
            this.a.setText(getString(R.string.Auto_payment));
            getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, cxl.a()).commit();
        } else if (this.d.equals("prepaid")) {
            this.a.setText(getString(R.string.Auto_recharge));
            getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, cxm.a()).commit();
        }
        a(this.d.equals("postpaid") ? getString(R.string.Auto_payment) : getString(R.string.Auto_recharge), false, false);
    }
}
