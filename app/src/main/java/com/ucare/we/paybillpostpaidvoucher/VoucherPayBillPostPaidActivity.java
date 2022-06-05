package com.ucare.we.paybillpostpaidvoucher;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class VoucherPayBillPostPaidActivity extends czy {
    TextView a;
    String b;
    @Inject
    djw d;
    private ImageView f;
    private Button g;
    boolean c = false;
    View.OnClickListener e = new View.OnClickListener() { // from class: com.ucare.we.paybillpostpaidvoucher.VoucherPayBillPostPaidActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            VoucherPayBillPostPaidActivity.this.finish();
        }
    };

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity);
        a(getString(R.string.recharge_card), false, false);
        this.a = (TextView) findViewById(R.id.txtTitle);
        this.f = (ImageView) findViewById(R.id.imgBackButton);
        this.g = (Button) findViewById(R.id.btn_current_number);
        this.b = getIntent().getStringExtra("targetNumber");
        this.c = getIntent().getBooleanExtra("CURRENT_NUMBER_FLAG", false);
        this.f.setOnClickListener(this.e);
        this.g.setText(this.b);
        this.a.setText(getString(R.string.recharge_card));
        Bundle bundle2 = new Bundle();
        bundle2.putString("targetNumber", this.b);
        bundle2.putBoolean("CURRENT_NUMBER_FLAG", this.c);
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, dce.a(bundle2)).commit();
    }
}
