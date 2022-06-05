package com.ucare.we;

import android.content.Context;
import android.os.Bundle;
import android.text.Editable;
import android.text.TextWatcher;
import android.view.View;
import android.widget.AutoCompleteTextView;
import android.widget.Button;
import android.widget.EditText;
import android.widget.ImageView;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.SwitchAccountModel.SwitchAccountResponse;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.ui.BalanceTransferConfirmationActivity;
import defpackage.au;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BalanceTransferActivity extends czy implements View.OnClickListener, dht, dju {
    ImageView a;
    ImageView b;
    Button c;
    @Inject
    djw d;
    Button e;
    EditText f;
    String g;
    AutoCompleteTextView h;
    @Inject
    dhu i;
    @Inject
    djx j;
    @Inject
    dja k;
    @Inject
    djg l;
    @Inject
    djx m;
    private Context p;
    private final int n = 1;
    private final int o = 2;
    private TextWatcher q = new TextWatcher() { // from class: com.ucare.we.BalanceTransferActivity.1
        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            BalanceTransferActivity.a(BalanceTransferActivity.this);
        }
    };
    private au.b<JSONObject> r = new au.b<JSONObject>() { // from class: com.ucare.we.BalanceTransferActivity.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            Gson gson = new Gson();
            BalanceTransferActivity.this.l.a();
            SwitchAccountResponse switchAccountResponse = (SwitchAccountResponse) gson.a(jSONObject.toString(), (Class<Object>) SwitchAccountResponse.class);
            if (switchAccountResponse != null && switchAccountResponse.header != null && switchAccountResponse.header.responseCode.equals("0")) {
                int i = 0;
                while (true) {
                    if (i >= switchAccountResponse.body.managedLines.size()) {
                        break;
                    } else if (switchAccountResponse.body.managedLines.get(i).mobileNumber.equals(BalanceTransferActivity.this.d.m())) {
                        switchAccountResponse.body.managedLines.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
                int i2 = 0;
                while (true) {
                    if (i2 >= switchAccountResponse.body.unManagedLines.size()) {
                        break;
                    } else if (switchAccountResponse.body.unManagedLines.get(i2).mobileNumber.equals(BalanceTransferActivity.this.d.m())) {
                        switchAccountResponse.body.unManagedLines.remove(i2);
                        break;
                    } else {
                        i2++;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (int i3 = 0; i3 < switchAccountResponse.body.managedLines.size(); i3++) {
                    arrayList.add(switchAccountResponse.body.managedLines.get(i3).mobileNumber);
                }
                for (int i4 = 0; i4 < switchAccountResponse.body.unManagedLines.size(); i4++) {
                    arrayList.add(switchAccountResponse.body.unManagedLines.get(i4).mobileNumber);
                }
                String[] strArr = new String[arrayList.size()];
                for (int i5 = 0; i5 < arrayList.size(); i5++) {
                    strArr[i5] = (String) arrayList.get(i5);
                }
            } else if (switchAccountResponse != null && switchAccountResponse.header != null && switchAccountResponse.header.responseCode.equals("1200")) {
                BalanceTransferActivity.this.b(1);
            }
        }
    };
    private au.a s = new au.a() { // from class: com.ucare.we.BalanceTransferActivity.3
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            BalanceTransferActivity.this.l.a();
        }
    };

    @Override // defpackage.dht
    public final void a(float f) {
    }

    @Override // defpackage.dht
    public final void a(cyq cyqVar) {
    }

    @Override // defpackage.dht
    public final void a(String str) {
    }

    @Override // defpackage.dht
    public final void a(String str, String str2) {
    }

    @Override // defpackage.dht
    public final void a(ArrayList<ExtrasList> arrayList) {
    }

    @Override // defpackage.dht
    public final void a(List<SummarizedLineUsageItem> list) {
    }

    @Override // defpackage.dht
    public final void a_(int i) {
    }

    @Override // defpackage.dht
    public final void a_(String str) {
    }

    @Override // defpackage.dht
    public final void b(int i, String str) {
    }

    @Override // defpackage.dht
    public final void b(ArrayList<SpecialList> arrayList) {
    }

    @Override // defpackage.dht
    public final void b(List<MainPlanResponseBody> list) {
    }

    @Override // defpackage.dht
    public final void c(String str) {
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
    }

    @Override // defpackage.dht
    public final void e() {
    }

    @Override // defpackage.dht
    public final void e(String str) {
    }

    @Override // defpackage.dht
    public final void f() {
    }

    @Override // defpackage.dht
    public final void g() {
    }

    @Override // defpackage.dht
    public final void h() {
    }

    @Override // defpackage.dht
    public final void i() {
    }

    @Override // defpackage.dht
    public final void j() {
    }

    @Override // defpackage.dht
    public final void p_() {
    }

    @Override // defpackage.dht
    public final void q_() {
    }

    @Override // defpackage.dht
    public final void r_() {
    }

    @Override // defpackage.dht
    public final void s_() {
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_balance_trasfer);
        a(getString(R.string.balance_transfer), false, false);
        this.p = this;
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.a = imageView;
        imageView.setOnClickListener(this);
        this.b = (ImageView) findViewById(R.id.iv_close);
        Button button = (Button) findViewById(R.id.btn_current_number);
        this.c = button;
        button.setText(this.d.m());
        this.h = (AutoCompleteTextView) findViewById(R.id.et_mobile);
        EditText editText = (EditText) findViewById(R.id.et_amount);
        this.f = editText;
        editText.setInputType(2);
        this.h.addTextChangedListener(this.q);
        this.f.addTextChangedListener(this.q);
        Button button2 = (Button) findViewById(R.id.btn_transfer);
        this.e = button2;
        button2.setAlpha(0.15f);
        this.e.setOnClickListener(this);
        this.i.a(this);
        k();
        if (getIntent().getExtras() != null) {
            String string = getIntent().getExtras().getString("SELECTED_NUMBER");
            this.g = string;
            this.h.setText(string);
        }
    }

    private void k() {
        try {
            this.l.a(this.p, getString(R.string.loading));
            djl.a(this.p).l(this.r, this.s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x0133 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0134  */
    @Override // android.view.View.OnClickListener
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public void onClick(android.view.View r7) {
        /*
            Method dump skipped, instructions count: 416
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.ucare.we.BalanceTransferActivity.onClick(android.view.View):void");
    }

    @Override // defpackage.dht
    public final void b(String str) {
        djx.a(this, BalanceTransferConfirmationActivity.class, this.f.getText().toString(), this.h.getText().toString(), str);
        this.l.a();
        finish();
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
        this.l.a();
        this.m.a(this, str, i, ErrorHandlerActivity.class);
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.i.b(this);
        super.onDestroy();
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        k();
    }

    static /* synthetic */ void a(BalanceTransferActivity balanceTransferActivity) {
        String obj = balanceTransferActivity.h.getText().toString();
        String obj2 = balanceTransferActivity.f.getText().toString();
        if (obj.equals("") || obj2.equals("")) {
            balanceTransferActivity.e.setAlpha(0.15f);
        } else {
            balanceTransferActivity.e.setAlpha(1.0f);
        }
    }
}
