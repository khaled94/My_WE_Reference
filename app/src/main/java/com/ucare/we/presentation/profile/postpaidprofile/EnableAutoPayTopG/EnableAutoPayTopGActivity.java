package com.ucare.we.presentation.profile.postpaidprofile.EnableAutoPayTopG;

import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.fragment.app.FragmentTransaction;
import com.ucare.we.R;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class EnableAutoPayTopGActivity extends czy {
    public static String a = "autoRechargeDay";
    public static String b = "autoRechargeAmount";
    public static String c = "UPDATE_CREDIT_CARD";
    @Inject
    djw d;
    @Inject
    dio e;
    @Inject
    djb f;
    TextView g;
    View.OnClickListener h = new View.OnClickListener() { // from class: com.ucare.we.presentation.profile.postpaidprofile.EnableAutoPayTopG.EnableAutoPayTopGActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            EnableAutoPayTopGActivity.this.finish();
        }
    };
    private ImageView i;
    private Button j;
    private String k;
    private String l;
    private String m;
    private String n;
    private String o;
    private String p;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.base_activity);
        this.g = (TextView) findViewById(R.id.txtTitle);
        this.i = (ImageView) findViewById(R.id.imgBackButton);
        this.j = (Button) findViewById(R.id.btn_current_number);
        this.i.setOnClickListener(this.h);
        if (getIntent().getExtras() != null) {
            this.p = "";
            this.m = getIntent().getExtras().getString("topgManageCCTransactionId");
            this.k = getIntent().getExtras().getString("hashcode");
            this.l = getIntent().getExtras().getString("confirmationCode");
            this.n = getIntent().getExtras().getString(a);
            this.o = getIntent().getExtras().getString(b);
            this.p = getIntent().getExtras().getString(c);
        }
        this.j.setText(this.d.m());
        if (this.e.e()) {
            this.g.setText(getString(R.string.auto_pay));
        } else {
            this.g.setText(getString(R.string.auto_recharge));
        }
        if (!TextUtils.isEmpty(this.p) && this.p.equalsIgnoreCase("update")) {
            this.g.setText(R.string.edit_credit_card);
        }
        a(this.g.getText().toString(), false, false);
        FragmentTransaction beginTransaction = getSupportFragmentManager().beginTransaction();
        if (this.e.e()) {
            beginTransaction.replace(R.id.lnrLayoutContainer, dgh.a(this.k, this.m)).commit();
        } else {
            beginTransaction.replace(R.id.lnrLayoutContainer, dgh.a(this.k, this.m, this.o, this.n, this.l)).commit();
        }
    }
}
