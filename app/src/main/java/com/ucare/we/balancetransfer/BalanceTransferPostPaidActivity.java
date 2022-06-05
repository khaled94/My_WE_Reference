package com.ucare.we.balancetransfer;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class BalanceTransferPostPaidActivity extends czy {
    @Inject
    djw a;
    View.OnClickListener b = new View.OnClickListener() { // from class: com.ucare.we.balancetransfer.BalanceTransferPostPaidActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BalanceTransferPostPaidActivity.this.finish();
        }
    };
    private ImageView c;
    private TextView d;
    private Button e;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity);
        a(getString(R.string.balance_transfer), false, false);
        this.d = (TextView) findViewById(R.id.txtTitle);
        this.c = (ImageView) findViewById(R.id.imgBackButton);
        this.e = (Button) findViewById(R.id.btn_current_number);
        this.c.setOnClickListener(this.b);
        this.e.setText(this.a.m());
        this.d.setText(getString(R.string.balance_transfer));
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, cxn.a()).commit();
    }
}
