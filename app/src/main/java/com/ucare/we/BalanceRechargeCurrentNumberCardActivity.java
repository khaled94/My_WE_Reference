package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ucare.we.model.CreditCardInitResponseBody;
import com.ucare.we.model.PaymentHistoryResponseBody;
import com.ucare.we.presentation.prepaid.MainActivity;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class BalanceRechargeCurrentNumberCardActivity extends czy implements View.OnClickListener, dhz {
    ImageView a;
    ImageView b;
    Button c;
    Button d;
    TextInputEditText e;
    TextInputLayout f;
    @Inject
    djw g;
    @Inject
    dia h;
    @Inject
    dja i;
    @Inject
    djg j;
    @Inject
    djx k;
    @Inject
    djx l;
    String m;

    @Override // defpackage.dhz
    public final void a(int i, String str) {
    }

    @Override // defpackage.dhz
    public final void a(CreditCardInitResponseBody creditCardInitResponseBody) {
    }

    @Override // defpackage.dhz
    public final void a(List<PaymentHistoryResponseBody> list) {
    }

    @Override // defpackage.dhz
    public final void c(int i, String str) {
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_balance_recharge_current_number_card);
        a(getString(R.string.recharge_card), false, false);
        this.a = (ImageView) findViewById(R.id.iv_close);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.b = imageView;
        imageView.setOnClickListener(this);
        this.d = (Button) findViewById(R.id.btn_current_number);
        String stringExtra = getIntent().getStringExtra("targetNumber");
        this.m = stringExtra;
        if (TextUtils.isEmpty(stringExtra)) {
            this.d.setText(this.g.m());
        } else {
            this.d.setText(this.m);
        }
        Button button = (Button) findViewById(R.id.btn_recharge);
        this.c = button;
        button.setOnClickListener(this);
        this.e = (TextInputEditText) findViewById(R.id.et_card_number);
        this.f = (TextInputLayout) findViewById(R.id.til_card_number);
        this.h.a(this);
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_close) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(603979776);
            startActivity(intent);
            finish();
        } else if (id == R.id.imgBackButton) {
            finish();
        } else if (id != R.id.btn_recharge) {
        } else {
            boolean z = false;
            if (TextUtils.isEmpty(this.e.getText().toString())) {
                a(getResources().getString(R.string.no_card_number));
            } else if (this.e.getText().length() < 16) {
                a(getResources().getString(R.string.card_number_should_be));
            } else {
                TextInputEditText textInputEditText = this.e;
                textInputEditText.setBackgroundDrawable(getDrawable(R.drawable.text_input_white_background_success));
                textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
                this.f.setError(null);
                this.f.setErrorEnabled(false);
                z = true;
            }
            if (!z) {
                return;
            }
            if (TextUtils.isEmpty(this.m)) {
                this.h.a(this.e.getText().toString());
            } else {
                this.h.b(this.e.getText().toString(), this.m);
            }
            this.j.a(this, getString(R.string.recharging));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.h.b(this);
        super.onDestroy();
    }

    @Override // defpackage.dhz
    public final void a() {
        this.j.a();
        this.k.b(this, BalanceRechargeSuccessfullyActivity.class);
    }

    @Override // defpackage.dhz
    public final void b(int i, String str) {
        this.j.a();
        this.l.a(this, str, i, ErrorHandlerActivity.class);
    }

    @Override // defpackage.dhz
    public final void b() {
        this.j.a();
        this.k.b(this, BalanceRechargeSuccessfullyActivity.class);
        finish();
    }

    @Override // defpackage.dhz
    public final void d(int i, String str) {
        this.j.a();
        this.l.a(this, str, i, ErrorHandlerActivity.class);
    }

    private void a(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getDrawable(R.drawable.text_input_white_background_error));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    private void a(String str) {
        this.f.setErrorEnabled(true);
        this.f.setError(str);
        a(this.e);
    }
}
