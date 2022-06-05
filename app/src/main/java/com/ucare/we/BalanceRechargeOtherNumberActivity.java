package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ucare.we.paybillpaymentmethod.PaymentMethodActivity;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class BalanceRechargeOtherNumberActivity extends dae {
    public boolean a;
    TextView b;
    TextView c;
    ImageView d;
    TextInputEditText e;
    TextInputLayout f;
    @Inject
    djx g;
    @Inject
    djb h;

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_balance_recharge_other_number);
        this.b = (TextView) findViewById(R.id.tv_ok);
        this.c = (TextView) findViewById(R.id.tv_cancel);
        this.e = (TextInputEditText) findViewById(R.id.et_target_mobile);
        this.f = (TextInputLayout) findViewById(R.id.etServiceNumber);
        this.a = getIntent().getBooleanExtra("targetFlag", false);
        this.b.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.BalanceRechargeOtherNumberActivity.1
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                if (!BalanceRechargeOtherNumberActivity.a(BalanceRechargeOtherNumberActivity.this)) {
                    return;
                }
                if (BalanceRechargeOtherNumberActivity.this.a) {
                    BalanceRechargeOtherNumberActivity.this.g.a(BalanceRechargeOtherNumberActivity.this.e.getText().toString(), BalanceRechargeOtherNumberActivity.this, PaymentMethodActivity.class);
                    BalanceRechargeOtherNumberActivity.this.finish();
                    return;
                }
                Intent intent = new Intent(BalanceRechargeOtherNumberActivity.this, BalanceRechargeCurrentNumberActivity.class);
                intent.putExtra("isOtherNumberActivity", true);
                intent.putExtra("targetNumber", BalanceRechargeOtherNumberActivity.this.e.getText().toString());
                BalanceRechargeOtherNumberActivity.this.startActivity(intent);
                BalanceRechargeOtherNumberActivity.this.finish();
            }
        });
        ImageView imageView = (ImageView) findViewById(R.id.iv_close);
        this.d = imageView;
        imageView.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.BalanceRechargeOtherNumberActivity.2
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BalanceRechargeOtherNumberActivity.this.finish();
            }
        });
        this.c.setOnClickListener(new View.OnClickListener() { // from class: com.ucare.we.BalanceRechargeOtherNumberActivity.3
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                BalanceRechargeOtherNumberActivity.this.finish();
            }
        });
    }

    private void b(String str) {
        this.f.setErrorEnabled(true);
        this.f.setError(str);
        TextInputEditText textInputEditText = this.e;
        textInputEditText.setBackgroundDrawable(getDrawable(R.drawable.text_input_white_background_error));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    static /* synthetic */ boolean a(BalanceRechargeOtherNumberActivity balanceRechargeOtherNumberActivity) {
        if (TextUtils.isEmpty(balanceRechargeOtherNumberActivity.e.getText().toString())) {
            balanceRechargeOtherNumberActivity.b(balanceRechargeOtherNumberActivity.getResources().getString(R.string.no_mobile_number));
            return false;
        } else if (!balanceRechargeOtherNumberActivity.e.getText().toString().startsWith("027") && balanceRechargeOtherNumberActivity.e.getText().length() < 9) {
            balanceRechargeOtherNumberActivity.b(balanceRechargeOtherNumberActivity.getResources().getString(R.string.default_service_number_validation));
            return false;
        } else if (!balanceRechargeOtherNumberActivity.e.getText().toString().substring(0, 1).equalsIgnoreCase("0")) {
            balanceRechargeOtherNumberActivity.b(balanceRechargeOtherNumberActivity.getResources().getString(R.string.default_service_number_validation));
            return false;
        } else {
            TextInputEditText textInputEditText = balanceRechargeOtherNumberActivity.e;
            textInputEditText.setBackgroundDrawable(balanceRechargeOtherNumberActivity.getDrawable(R.drawable.text_input_white_background_success));
            textInputEditText.setHintTextColor(balanceRechargeOtherNumberActivity.getResources().getColor(R.color.color_grey_new));
            balanceRechargeOtherNumberActivity.f.setError(null);
            balanceRechargeOtherNumberActivity.f.setErrorEnabled(false);
            return true;
        }
    }
}
