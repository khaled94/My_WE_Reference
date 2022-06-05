package com.ucare.we.paymenthistory;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class PaymentHistoryPostPaidActivity extends czy {
    TextView a;
    @Inject
    djw b;
    View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.paymenthistory.PaymentHistoryPostPaidActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PaymentHistoryPostPaidActivity.this.finish();
        }
    };
    private ImageView d;
    private Button e;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity);
        a(getString(R.string.payment_history), false, false);
        this.a = (TextView) findViewById(R.id.txtTitle);
        this.d = (ImageView) findViewById(R.id.imgBackButton);
        this.e = (Button) findViewById(R.id.btn_current_number);
        this.d.setOnClickListener(this.c);
        this.e.setText(this.b.m());
        this.a.setText(getString(R.string.payment_history));
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, dcf.a()).commit();
    }
}
