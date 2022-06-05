package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.view.GravityCompat;
import com.ucare.we.model.remote.dueamount.DueAmount;
import com.ucare.we.presentation.requiredbalance.RequiredBalanceActivity;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class BalanceRechargeCurrentNumberActivity extends czy implements View.OnClickListener {
    ImageView a;
    ConstraintLayout b;
    Button c;
    TextView d;
    EditText e;
    EditText f;
    TextView g;
    TextView h;
    @Inject
    djw i;
    @Inject
    dhs j;
    @Inject
    dio k;
    LinearLayout l;
    LinearLayout m;
    @Inject
    djx n;
    String o;
    Boolean p;
    Boolean q;
    @Inject
    dhn s;
    @Inject
    djg t;
    private DueAmount z;
    private final DecimalFormat x = new DecimalFormat("#.##", new DecimalFormatSymbols(Locale.ENGLISH));
    String r = "";
    double u = 0.0d;
    private String y = "";

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_balance_recharge_current_number);
        a(getString(R.string.balance_recharge), false, false);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.a = imageView;
        imageView.setOnClickListener(this);
        this.d = (TextView) findViewById(R.id.tvRequiredBalance);
        this.e = (EditText) findViewById(R.id.etBalance);
        this.f = (EditText) findViewById(R.id.etAmountToPay);
        this.g = (TextView) findViewById(R.id.btnDetails);
        TextView textView = (TextView) findViewById(R.id.txtTitle);
        this.h = textView;
        textView.setText(getString(R.string.balance_recharge));
        this.g.setOnClickListener(this);
        this.l = (LinearLayout) findViewById(R.id.ll_credit_card);
        this.b = (ConstraintLayout) findViewById(R.id.calculatorView);
        this.m = (LinearLayout) findViewById(R.id.ll_recharge_card);
        this.l.setOnClickListener(this);
        this.m.setOnClickListener(this);
        this.c = (Button) findViewById(R.id.btn_current_number);
        this.o = getIntent().getStringExtra("targetNumber");
        this.p = Boolean.valueOf(getIntent().getBooleanExtra("isCurrentNumber", false));
        this.q = Boolean.valueOf(getIntent().getBooleanExtra("isOtherNumberActivity", false));
        if (TextUtils.isEmpty(this.o)) {
            this.o = this.i.m();
            this.c.setText(this.i.m());
            if (this.k.d()) {
                if (this.k.f()) {
                    this.u = Double.parseDouble(this.s.f.getMobileDue());
                }
                if (this.k.g()) {
                    this.u = Double.parseDouble(this.s.f.getFixedDueData());
                }
            }
        } else {
            this.c.setText(this.o);
        }
        if (this.q.booleanValue()) {
            this.b.setVisibility(8);
        } else {
            this.t.a(this, getString(R.string.loading));
            this.j.a(this.o);
        }
        this.j.d = new dhr() { // from class: com.ucare.we.BalanceRechargeCurrentNumberActivity.1
            @Override // defpackage.dhr
            public final void a(DueAmount dueAmount) {
                BalanceRechargeCurrentNumberActivity.this.z = dueAmount;
                BalanceRechargeCurrentNumberActivity.this.y = dueAmount.getAmount().toString();
                BalanceRechargeCurrentNumberActivity.this.u = dueAmount.getTaxOperand().doubleValue();
                BalanceRechargeCurrentNumberActivity.this.e.setText(BalanceRechargeCurrentNumberActivity.this.y);
                if (BalanceRechargeCurrentNumberActivity.this.o.equals(BalanceRechargeCurrentNumberActivity.this.i.m())) {
                    if (BalanceRechargeCurrentNumberActivity.this.k.f() && !BalanceRechargeCurrentNumberActivity.this.k.h()) {
                        BalanceRechargeCurrentNumberActivity.this.b.setVisibility(0);
                    } else if (BalanceRechargeCurrentNumberActivity.this.k.g() && !BalanceRechargeCurrentNumberActivity.this.k.h()) {
                        BalanceRechargeCurrentNumberActivity.this.b.setVisibility(0);
                    } else {
                        BalanceRechargeCurrentNumberActivity.this.b.setVisibility(8);
                    }
                } else if (dueAmount.getDisplay().booleanValue()) {
                    BalanceRechargeCurrentNumberActivity.this.b.setVisibility(0);
                } else {
                    BalanceRechargeCurrentNumberActivity.this.b.setVisibility(8);
                }
                if (BalanceRechargeCurrentNumberActivity.this.e.length() != 0) {
                    double parseDouble = Double.parseDouble(BalanceRechargeCurrentNumberActivity.this.e.getText().toString()) * BalanceRechargeCurrentNumberActivity.this.u;
                    BalanceRechargeCurrentNumberActivity balanceRechargeCurrentNumberActivity = BalanceRechargeCurrentNumberActivity.this;
                    balanceRechargeCurrentNumberActivity.r = balanceRechargeCurrentNumberActivity.x.format(parseDouble);
                    BalanceRechargeCurrentNumberActivity.this.f.setText(BalanceRechargeCurrentNumberActivity.this.x.format(parseDouble));
                }
                TextView textView2 = BalanceRechargeCurrentNumberActivity.this.d;
                textView2.setText(BalanceRechargeCurrentNumberActivity.this.getString(R.string.requiredBalance) + " " + dueAmount.getAmount().toString());
                BalanceRechargeCurrentNumberActivity.this.t.a();
            }

            @Override // defpackage.dhr
            public final void a() {
                BalanceRechargeCurrentNumberActivity.this.b.setVisibility(8);
                BalanceRechargeCurrentNumberActivity.this.t.a();
            }
        };
        this.e.addTextChangedListener(new TextWatcher() { // from class: com.ucare.we.BalanceRechargeCurrentNumberActivity.2
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.toString().startsWith("0")) {
                    BalanceRechargeCurrentNumberActivity.this.e.setText(charSequence.toString().substring(1, charSequence.length()));
                }
                if (charSequence.length() != 0) {
                    try {
                        double parseDouble = Double.parseDouble(BalanceRechargeCurrentNumberActivity.this.e.getText().toString()) * BalanceRechargeCurrentNumberActivity.this.u;
                        BalanceRechargeCurrentNumberActivity.this.r = BalanceRechargeCurrentNumberActivity.this.x.format(parseDouble);
                    } catch (NumberFormatException e) {
                        e.printStackTrace();
                    }
                }
                if (charSequence.length() != 0 && BalanceRechargeCurrentNumberActivity.this.e.hasFocus()) {
                    try {
                        BalanceRechargeCurrentNumberActivity.this.f.setText(BalanceRechargeCurrentNumberActivity.this.x.format(Double.parseDouble(BalanceRechargeCurrentNumberActivity.this.e.getText().toString()) * BalanceRechargeCurrentNumberActivity.this.u));
                    } catch (NumberFormatException e2) {
                        e2.printStackTrace();
                    }
                }
                if (charSequence.length() != 0 || !BalanceRechargeCurrentNumberActivity.this.e.hasFocus()) {
                    return;
                }
                BalanceRechargeCurrentNumberActivity.this.f.setText("");
            }
        });
        this.f.addTextChangedListener(new TextWatcher() { // from class: com.ucare.we.BalanceRechargeCurrentNumberActivity.3
            @Override // android.text.TextWatcher
            public final void afterTextChanged(Editable editable) {
            }

            @Override // android.text.TextWatcher
            public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
            }

            @Override // android.text.TextWatcher
            public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
                if (charSequence.length() != 0) {
                    try {
                        if (Double.parseDouble(charSequence.toString()) > 3000.0d) {
                            BalanceRechargeCurrentNumberActivity.this.f.setText("3000");
                            BalanceRechargeCurrentNumberActivity.this.f.requestFocus(GravityCompat.END);
                            BalanceRechargeCurrentNumberActivity.this.e.setText(String.format(Locale.ENGLISH, "%.2f", Double.valueOf(Double.parseDouble(BalanceRechargeCurrentNumberActivity.this.f.getText().toString()) / BalanceRechargeCurrentNumberActivity.this.u)));
                        }
                    } catch (NumberFormatException e) {
                        e.getMessage();
                    }
                }
                if (charSequence.length() != 0 && BalanceRechargeCurrentNumberActivity.this.f.hasFocus()) {
                    try {
                        BalanceRechargeCurrentNumberActivity.this.e.setText(String.format(Locale.ENGLISH, "%.2f", Double.valueOf(Double.parseDouble(BalanceRechargeCurrentNumberActivity.this.f.getText().toString()) / BalanceRechargeCurrentNumberActivity.this.u)));
                    } catch (NumberFormatException e2) {
                        e2.printStackTrace();
                    }
                }
                if (charSequence.length() == 0 && BalanceRechargeCurrentNumberActivity.this.f.hasFocus()) {
                    BalanceRechargeCurrentNumberActivity.this.e.setText("");
                }
                if (charSequence.toString().startsWith("0")) {
                    BalanceRechargeCurrentNumberActivity.this.f.setText(charSequence.toString().substring(1, charSequence.length()));
                }
            }
        });
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imgBackButton) {
            finish();
        } else if (id == R.id.imgBackButton) {
            finish();
        } else if (id == R.id.iv_close) {
        } else {
            if (id == R.id.btnDetails) {
                Intent intent = new Intent(this, RequiredBalanceActivity.class);
                intent.putExtra("dueAmount", this.z);
                intent.putExtra("targetNumber", this.o);
                intent.addFlags(603979776);
                startActivity(intent);
            } else if (id == R.id.ll_credit_card) {
                if (TextUtils.isEmpty(this.o)) {
                    Intent intent2 = new Intent(this, BalanceRechargeNumberCreditActivity.class);
                    intent2.putExtra("paidAmount", this.r);
                    startActivity(intent2);
                    return;
                }
                Intent intent3 = new Intent(this, BalanceRechargeNumberCreditActivity.class);
                intent3.putExtra("targetNumber", this.o);
                intent3.putExtra("paidAmount", this.r);
                startActivity(intent3);
            } else if (id != R.id.ll_recharge_card) {
            } else {
                if (TextUtils.isEmpty(this.o)) {
                    Intent intent4 = new Intent(this, BalanceRechargeCurrentNumberCardActivity.class);
                    intent4.putExtra("paidAmount", this.r);
                    startActivity(intent4);
                    return;
                }
                Intent intent5 = new Intent(this, BalanceRechargeCurrentNumberCardActivity.class);
                intent5.putExtra("targetNumber", this.o);
                intent5.putExtra("paidAmount", this.r);
                startActivity(intent5);
            }
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        super.onDestroy();
    }
}
