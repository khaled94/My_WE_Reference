package com.ucare.we;

import android.app.ProgressDialog;
import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.ActionMode;
import android.view.Menu;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import defpackage.au;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PayBillMainActivity extends czy implements View.OnClickListener {
    @Inject
    dio a;
    @Inject
    djw b;
    @Inject
    djb c;
    @Inject
    djx d;
    Button e;
    private ProgressDialog f;
    private ViewGroup g;
    private ViewGroup h;
    private ViewGroup i;
    private ViewGroup j;
    private TextView k;
    private TextView l;
    private TextView m;
    private TextView n;
    private TextView o;
    private TextView p;
    private TextView q;
    private TextView r;
    private TextView s;
    private EditText t;
    private Button u;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_pay_bill);
        a(getString(R.string.pay_bill), false, false);
        findViewById(R.id.imgBackButton).setOnClickListener(this);
        this.e = (Button) findViewById(R.id.btn_current_number);
        this.g = (ViewGroup) findViewById(R.id.bill_history);
        this.k = (TextView) findViewById(R.id.bill_1_month);
        this.l = (TextView) findViewById(R.id.bill_2_month);
        this.m = (TextView) findViewById(R.id.bill_3_month);
        this.n = (TextView) findViewById(R.id.bill_1_amount);
        this.o = (TextView) findViewById(R.id.bill_2_amount);
        this.p = (TextView) findViewById(R.id.bill_3_amount);
        this.h = (ViewGroup) findViewById(R.id.bill_1);
        this.i = (ViewGroup) findViewById(R.id.bill_2);
        this.j = (ViewGroup) findViewById(R.id.bill_3);
        this.q = (TextView) findViewById(R.id.outstanding_amount_tv);
        this.r = (TextView) findViewById(R.id.amount_warning);
        this.t = (EditText) findViewById(R.id.amount_edit_text);
        this.u = (Button) findViewById(R.id.btn_pay_bill);
        this.s = (TextView) findViewById(R.id.bill_history_intro);
        this.t.setCustomSelectionActionModeCallback(new ActionMode.Callback() { // from class: com.ucare.we.PayBillMainActivity.1
            @Override // android.view.ActionMode.Callback
            public final boolean onActionItemClicked(ActionMode actionMode, MenuItem menuItem) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onCreateActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }

            @Override // android.view.ActionMode.Callback
            public final void onDestroyActionMode(ActionMode actionMode) {
            }

            @Override // android.view.ActionMode.Callback
            public final boolean onPrepareActionMode(ActionMode actionMode, Menu menu) {
                return false;
            }
        });
        this.u.setOnClickListener(this);
        this.e.setText(this.b.m());
    }

    @Override // androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onResume() {
        super.onResume();
        this.r.setVisibility(8);
        a();
    }

    private void a() {
        a((Context) this);
        at a = bm.a(this, null);
        JSONObject jSONObject = new JSONObject();
        try {
            JSONObject jSONObject2 = new JSONObject();
            jSONObject2.put("timestamp", System.currentTimeMillis() / 1000);
            jSONObject2.put("msisdn", this.b.m());
            jSONObject2.put("locale", this.c.c.k());
            jSONObject.put("header", jSONObject2);
            jSONObject.put("body", new JSONObject());
            a.a((as) new bj("https://api-my.te.eg/api/billing/queryOpenInvoices", jSONObject, new au.b<JSONObject>() { // from class: com.ucare.we.PayBillMainActivity.2
                @Override // defpackage.au.b
                public final /* synthetic */ void onResponse(JSONObject jSONObject3) {
                    PayBillMainActivity.a(PayBillMainActivity.this, jSONObject3);
                    PayBillMainActivity.this.b();
                }
            }, new au.a() { // from class: com.ucare.we.PayBillMainActivity.3
                @Override // defpackage.au.a
                public final void onErrorResponse(VolleyError volleyError) {
                    PayBillMainActivity.b(PayBillMainActivity.this);
                    PayBillMainActivity.this.b();
                }
            }) { // from class: com.ucare.we.PayBillMainActivity.4
                @Override // defpackage.as
                public final Map<String, String> c() throws AuthFailureError {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Jwt", PayBillMainActivity.this.b.I());
                    return hashMap;
                }
            });
        } catch (JSONException e) {
            e.printStackTrace();
            b();
        }
    }

    private void a(Context context) {
        ProgressDialog progressDialog = this.f;
        if (progressDialog != null && progressDialog.isShowing()) {
            b();
        }
        ProgressDialog progressDialog2 = new ProgressDialog(context);
        this.f = progressDialog2;
        progressDialog2.setMessage(getString(R.string.fetching_bill_history));
        this.f.setCancelable(false);
        this.f.show();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public void b() {
        ProgressDialog progressDialog = this.f;
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imgBackButton) {
            finish();
        } else if (id != R.id.btn_pay_bill) {
        } else {
            String obj = this.t.getText().toString();
            if (obj.trim().length() == 0) {
                this.r.setVisibility(0);
                return;
            }
            try {
                if (Double.parseDouble(obj.trim()) < 10.0d) {
                    this.r.setVisibility(0);
                    this.r.setText(getString(R.string.amount_textfield_validation_too_low));
                    return;
                }
                this.r.setVisibility(8);
                Intent intent = new Intent(this, PrepaidPaymentActivity.class);
                intent.putExtra("amount", obj.trim());
                intent.putExtra("targetNumber", this.b.m());
                startActivityForResult(intent, 1000);
            } catch (NumberFormatException unused) {
            }
        }
    }

    @Override // androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, android.app.Activity
    public void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        if (i2 == -1) {
            this.t.setText("");
            this.g.setVisibility(8);
            a();
        }
    }

    static /* synthetic */ void a(PayBillMainActivity payBillMainActivity, JSONObject jSONObject) {
        double d;
        try {
            JSONArray jSONArray = jSONObject.getJSONArray("body");
            try {
                JSONObject jSONObject2 = jSONArray.getJSONObject(0);
                payBillMainActivity.g.setVisibility(0);
                payBillMainActivity.k.setText(jSONObject2.getString("invoiceDate"));
                payBillMainActivity.n.setText(jSONObject2.getString("openAmount") + " " + payBillMainActivity.getString(R.string.blance_egp));
                payBillMainActivity.h.setVisibility(0);
                d = jSONObject2.getDouble("openAmount") + 0.0d;
                try {
                    JSONObject jSONObject3 = jSONArray.getJSONObject(1);
                    payBillMainActivity.l.setText(jSONObject3.getString("invoiceDate"));
                    payBillMainActivity.o.setText(jSONObject3.getString("openAmount") + " " + payBillMainActivity.getString(R.string.blance_egp));
                    payBillMainActivity.i.setVisibility(0);
                    d += jSONObject3.getDouble("openAmount");
                    JSONObject jSONObject4 = jSONArray.getJSONObject(2);
                    payBillMainActivity.m.setText(jSONObject4.getString("invoiceDate"));
                    payBillMainActivity.p.setText(jSONObject4.getString("openAmount") + " " + payBillMainActivity.getString(R.string.blance_egp));
                    payBillMainActivity.j.setVisibility(0);
                    d += jSONObject4.getDouble("openAmount");
                } catch (Exception unused) {
                }
            } catch (Exception unused2) {
                d = 0.0d;
            }
            if (d == 0.0d) {
                payBillMainActivity.t.setText("10");
            } else {
                d = Math.ceil(d);
                payBillMainActivity.t.setText(String.valueOf((int) d));
            }
            payBillMainActivity.t.setSelection(payBillMainActivity.t.getText().length());
            payBillMainActivity.q.setText(String.valueOf(d) + " " + payBillMainActivity.getString(R.string.blance_egp));
        } catch (JSONException e) {
            payBillMainActivity.g.setVisibility(0);
            payBillMainActivity.s.setText(R.string.invoices_section_header_no_bills);
            payBillMainActivity.q.setText("0 " + payBillMainActivity.getString(R.string.blance_egp));
            e.printStackTrace();
        }
    }

    static /* synthetic */ void b(PayBillMainActivity payBillMainActivity) {
        payBillMainActivity.q.setText("-");
        payBillMainActivity.d.a(payBillMainActivity, payBillMainActivity.getString(R.string.invoices_section_header_failure), -1, ErrorHandlerActivity.class);
    }
}
