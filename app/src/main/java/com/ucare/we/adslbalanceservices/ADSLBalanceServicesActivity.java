package com.ucare.we.adslbalanceservices;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class ADSLBalanceServicesActivity extends czy {
    TextView a;
    @Inject
    djw b;
    @Inject
    dio c;
    View.OnClickListener d = new View.OnClickListener() { // from class: com.ucare.we.adslbalanceservices.ADSLBalanceServicesActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ADSLBalanceServicesActivity.this.finish();
        }
    };
    private ImageView e;
    private Button f;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity_new);
        this.a = (TextView) findViewById(R.id.txtTitle);
        this.e = (ImageView) findViewById(R.id.imgBackButton);
        this.f = (Button) findViewById(R.id.btn_current_number);
        this.e.setOnClickListener(this.d);
        this.f.setText(this.b.m());
        dio dioVar = new dio();
        this.c = dioVar;
        if (dioVar.e()) {
            this.a.setText(getString(R.string.bill_services));
        } else if (this.c.d()) {
            this.a.setText(getString(R.string.balance_services));
        }
        a(this.c.e() ? getString(R.string.bill_services) : getString(R.string.balance_services), false, false);
        getSupportFragmentManager().beginTransaction().replace(R.id.lnrLayoutContainer, cxj.a()).commit();
    }
}
