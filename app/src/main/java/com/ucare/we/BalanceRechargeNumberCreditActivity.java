package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.GridLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.textfield.TextInputEditText;
import com.google.android.material.textfield.TextInputLayout;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import com.ucare.we.presentation.prepaid.MainActivity;
import defpackage.cxe;
import java.util.Arrays;
import java.util.List;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class BalanceRechargeNumberCreditActivity extends czy implements View.OnClickListener, cxe.a {
    ImageView a;
    Button b;
    @Inject
    djw c;
    @Inject
    djx d;
    RecyclerView e;
    RecyclerView.LayoutManager f;
    cxe g;
    List<String> h;
    @Inject
    dhn i;
    String j;
    String k;
    Button l;
    TextInputEditText m;
    TextInputLayout n;
    TextView o;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_balance_recharge_number_credit);
        a(getString(R.string.credit_card), false, false);
        this.l = (Button) findViewById(R.id.btn_recharge);
        this.o = (TextView) findViewById(R.id.txtTitle);
        this.m = (TextInputEditText) findViewById(R.id.edtAmount);
        this.n = (TextInputLayout) findViewById(R.id.tlAmount);
        this.l.setOnClickListener(this);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.a = imageView;
        imageView.setOnClickListener(this);
        this.b = (Button) findViewById(R.id.btn_current_number);
        this.j = getIntent().getStringExtra("targetNumber");
        this.k = getIntent().getStringExtra("paidAmount");
        this.o.setText(getString(R.string.credit_card));
        if (this.k.isEmpty()) {
            this.k = "0";
        }
        this.m.setText(String.valueOf(this.k));
        if (TextUtils.isEmpty(this.j)) {
            this.b.setText(this.c.m());
        } else {
            this.b.setText(this.j);
        }
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.gridView);
        this.e = recyclerView;
        recyclerView.setHasFixedSize(true);
        GridLayoutManager gridLayoutManager = new GridLayoutManager(this, 2);
        this.f = gridLayoutManager;
        this.e.setLayoutManager(gridLayoutManager);
        cxe cxeVar = new cxe(this);
        this.g = cxeVar;
        this.e.setAdapter(cxeVar);
        if (this.i.f != null) {
            List<String> asList = Arrays.asList(this.i.f.getRechargeAmounts().split(","));
            this.h = asList;
            cxe cxeVar2 = this.g;
            cxeVar2.b = asList;
            cxeVar2.notifyDataSetChanged();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_close) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(603979776);
            startActivity(intent);
            finish();
        } else if (id == R.id.btn_current_number) {
            finish();
        } else if (id == R.id.imgBackButton) {
            finish();
        } else if (id != R.id.btn_recharge) {
        } else {
            String trim = this.m.getText().toString().trim();
            if (!TextUtils.isEmpty(trim)) {
                if (Double.parseDouble(trim) < 10.0d) {
                    b(getString(R.string.invalid_amount));
                    return;
                }
                TextInputEditText textInputEditText = this.m;
                textInputEditText.setBackgroundDrawable(getDrawable(R.drawable.text_input_white_background_success));
                textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
                this.n.setError(null);
                this.n.setErrorEnabled(false);
                a(trim);
                return;
            }
            b(getString(R.string.invalid_amount));
        }
    }

    @Override // defpackage.cxe.a
    public final void a(String str) {
        if (TextUtils.isEmpty(this.j)) {
            this.d.a("", this, CreditCardInitActivity.class, str);
        } else {
            this.d.a(this.j, this, CreditCardInitActivity.class, str);
        }
    }

    private void a(TextInputEditText textInputEditText) {
        textInputEditText.setBackgroundDrawable(getDrawable(R.drawable.text_input_white_background_focused));
        textInputEditText.setHintTextColor(getResources().getColor(R.color.color_grey_new));
    }

    private void b(String str) {
        a(this.m);
        UnNavigateResponseActivity.a(this, str, getString(R.string.please_try_again), true);
    }
}
