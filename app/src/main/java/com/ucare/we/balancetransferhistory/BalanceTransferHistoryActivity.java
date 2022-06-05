package com.ucare.we.balancetransferhistory;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class BalanceTransferHistoryActivity extends czy {
    TextView a;
    @Inject
    djw b;
    View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.balancetransferhistory.BalanceTransferHistoryActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            BalanceTransferHistoryActivity.this.finish();
        }
    };
    private String d;
    private ImageView e;
    private Button f;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity);
        a(getString(R.string.balance_transfer_history), false, false);
        this.a = (TextView) findViewById(R.id.txtTitle);
        this.e = (ImageView) findViewById(R.id.imgBackButton);
        this.f = (Button) findViewById(R.id.btn_current_number);
        if (getIntent().hasExtra("FMC_SELECTED_MSISDN")) {
            this.d = getIntent().getStringExtra("FMC_SELECTED_MSISDN");
        }
        this.e.setOnClickListener(this.c);
        this.f.setText(this.b.m());
        this.a.setText(getString(R.string.balance_transfer_history));
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, cxr.a(this.d)).commit();
    }
}
