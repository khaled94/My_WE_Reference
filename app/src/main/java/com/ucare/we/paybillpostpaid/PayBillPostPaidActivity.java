package com.ucare.we.paybillpostpaid;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class PayBillPostPaidActivity extends czy {
    TextView a;
    TextView b;
    @Inject
    djw c;
    @Inject
    dio d;
    String e;
    boolean f = false;
    View.OnClickListener g = new View.OnClickListener() { // from class: com.ucare.we.paybillpostpaid.PayBillPostPaidActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            PayBillPostPaidActivity.this.finish();
        }
    };
    Button h;
    private ImageView i;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_new);
        a(getString(R.string.credit_card), false, false);
        this.a = (TextView) findViewById(R.id.txtTitle);
        this.i = (ImageView) findViewById(R.id.imgBackButton);
        this.h = (Button) findViewById(R.id.btn_current_number);
        this.b = (TextView) findViewById(R.id.current_number);
        this.e = getIntent().getStringExtra("targetNumber");
        this.f = getIntent().getBooleanExtra("CURRENT_NUMBER_FLAG", false);
        this.h.setText(getIntent().getStringExtra("targetNumber"));
        this.d.e();
        this.i.setOnClickListener(this.g);
        this.a.setText(getString(R.string.credit_card));
        Bundle bundle2 = new Bundle();
        bundle2.putString("targetNumber", getIntent().getStringExtra("targetNumber"));
        bundle2.putBoolean("CURRENT_NUMBER_FLAG", this.f);
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, dcb.a(bundle2)).commit();
    }
}
