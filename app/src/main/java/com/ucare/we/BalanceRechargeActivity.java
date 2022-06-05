package com.ucare.we;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.SwitchAccountModel.SwitchAccountResponse;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.paybillautheduser.PayBillForUserActivity;
import com.ucare.we.presentation.prepaid.MainActivity;
import defpackage.au;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class BalanceRechargeActivity extends czy implements View.OnClickListener, dht, dju {
    ImageView a;
    TextView b;
    TextView c;
    @Inject
    djw d;
    Button e;
    Button f;
    Button g;
    LinearLayout h;
    @Inject
    djx i;
    @Inject
    dhu j;
    @Inject
    djg k;
    Context l;
    private final int m = 1;
    private au.b<JSONObject> n = new au.b<JSONObject>() { // from class: com.ucare.we.BalanceRechargeActivity.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            Gson gson = new Gson();
            BalanceRechargeActivity.this.k.a();
            SwitchAccountResponse switchAccountResponse = (SwitchAccountResponse) gson.a(jSONObject.toString(), (Class<Object>) SwitchAccountResponse.class);
            if (switchAccountResponse != null && switchAccountResponse.header != null && switchAccountResponse.header.responseCode.equals("0")) {
                int i = 0;
                while (true) {
                    if (i >= switchAccountResponse.body.managedLines.size()) {
                        break;
                    } else if (switchAccountResponse.body.managedLines.get(i).mobileNumber.equals(BalanceRechargeActivity.this.d.m())) {
                        switchAccountResponse.body.managedLines.remove(i);
                        break;
                    } else {
                        i++;
                    }
                }
                ArrayList arrayList = new ArrayList();
                for (int i2 = 0; i2 < switchAccountResponse.body.managedLines.size(); i2++) {
                    arrayList.add(switchAccountResponse.body.managedLines.get(i2).mobileNumber);
                }
                for (int i3 = 0; i3 < switchAccountResponse.body.unManagedLines.size(); i3++) {
                    arrayList.add(switchAccountResponse.body.unManagedLines.get(i3).mobileNumber);
                }
                ArrayList<? extends Parcelable> arrayList2 = new ArrayList<>();
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    AssociatedNumberResponseBody associatedNumberResponseBody = new AssociatedNumberResponseBody();
                    associatedNumberResponseBody.setMobileNumber((String) arrayList.get(i4));
                    arrayList2.add(associatedNumberResponseBody);
                }
                Intent intent = new Intent(BalanceRechargeActivity.this.l, AssociatedNumbersActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("associatedNumbers", arrayList2);
                bundle.putBoolean(cwl.d, true);
                intent.putExtras(bundle);
                BalanceRechargeActivity.this.startActivity(intent);
            } else if (switchAccountResponse != null && switchAccountResponse.header != null && switchAccountResponse.header.responseCode.equals("1200")) {
                BalanceRechargeActivity.this.b(1);
            }
        }
    };
    private au.a o = new au.a() { // from class: com.ucare.we.BalanceRechargeActivity.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            BalanceRechargeActivity.this.k.a();
        }
    };

    @Override // defpackage.dht
    public final void a(float f) {
    }

    @Override // defpackage.dht
    public final void a(int i, String str) {
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
    public final void b(String str) {
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
    public final void r_() {
    }

    @Override // defpackage.dht
    public final void s_() {
    }

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_balance_recharge);
        a(getString(R.string.balance_recharge), false, false);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.a = imageView;
        imageView.setOnClickListener(this);
        this.j.a(this);
        this.h = (LinearLayout) findViewById(R.id.ll_current_number);
        this.e = (Button) findViewById(R.id.ll_my_numbers);
        this.f = (Button) findViewById(R.id.ll_other_number);
        this.g = (Button) findViewById(R.id.ll_pay_landlines_bill);
        this.h.setOnClickListener(this);
        this.e.setOnClickListener(this);
        this.f.setOnClickListener(this);
        this.g.setOnClickListener(this);
        this.b = (TextView) findViewById(R.id.current_number);
        this.c = (TextView) findViewById(R.id.txtTitle);
        this.b.setText(this.d.m());
        this.l = this;
        this.c.setText(getString(R.string.balance_recharge));
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imgBackButton) {
            finish();
        } else if (id == R.id.iv_close) {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(603979776);
            startActivity(intent);
            finish();
        } else if (id == R.id.ll_current_number) {
            Intent intent2 = new Intent(this, BalanceRechargeCurrentNumberActivity.class);
            intent2.putExtra("targetNumber", this.b.getText().toString());
            intent2.putExtra("isCurrentNumber", true);
            startActivity(intent2);
        } else if (id == R.id.ll_my_numbers) {
            try {
                this.k.a(this, getString(R.string.loading));
                djl.a(this).l(this.n, this.o);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.k.a(this, getString(R.string.loading));
        } else if (id == R.id.ll_other_number) {
            this.i.b(this, BalanceRechargeOtherNumberActivity.class);
        } else if (id != R.id.ll_pay_landlines_bill) {
        } else {
            startActivity(new Intent(this, PayBillForUserActivity.class));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.j.b(this);
        super.onDestroy();
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
        this.k.a();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMobileNumber().equalsIgnoreCase(this.d.m())) {
                list.remove(i);
            }
        }
        if (list.size() > 0) {
            djx.a(this, AssociatedNumbersActivity.class, new ArrayList(list));
        }
    }

    @Override // defpackage.dht
    public final void q_() {
        this.k.a();
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        try {
            this.k.a(this, getString(R.string.loading));
            djl.a(this).l(this.n, this.o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
