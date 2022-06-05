package com.ucare.we.paybillpaymentmethod;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class PaymentMethodActivity extends czy {
    TextView a;
    TextView b;
    String c;
    @Inject
    djw d;
    @Inject
    dio e;
    View.OnClickListener f = new View.OnClickListener() { // from class: com.ucare.we.paybillpaymentmethod.-$$Lambda$PaymentMethodActivity$PIzz0guBcyUOV1seJwvKWE6VEeA
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PaymentMethodActivity.lambda$PIzz0guBcyUOV1seJwvKWE6VEeA(PaymentMethodActivity.this, view);
        }
    };
    Button g;
    private ImageView h;

    public static /* synthetic */ void lambda$PIzz0guBcyUOV1seJwvKWE6VEeA(PaymentMethodActivity paymentMethodActivity, View view) {
        paymentMethodActivity.a(view);
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_new);
        a(getString(R.string.pay_bill), false, false);
        this.a = (TextView) findViewById(R.id.txtTitle);
        this.h = (ImageView) findViewById(R.id.imgBackButton);
        this.g = (Button) findViewById(R.id.btn_current_number);
        this.b = (TextView) findViewById(R.id.current_number);
        this.e.e();
        String stringExtra = getIntent().getStringExtra("targetNumber");
        this.c = stringExtra;
        if (stringExtra == null) {
            this.c = this.d.m();
        }
        this.h.setOnClickListener(this.f);
        this.g.setText(this.c);
        this.a.setText(getString(R.string.pay_bill));
        Bundle bundle2 = new Bundle();
        bundle2.putBoolean("IS_CURRENT", this.c.equals(this.d.m()));
        bundle2.putString("targetNumber", this.c);
        bundle2.putBoolean("CURRENT_NUMBER_FLAG", getIntent().getBooleanExtra("CURRENT_NUMBER_FLAG", false));
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, dbw.a(bundle2)).commit();
    }
}
