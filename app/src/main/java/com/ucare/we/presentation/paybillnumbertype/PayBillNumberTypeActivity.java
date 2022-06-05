package com.ucare.we.presentation.paybillnumbertype;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.AssociatedNumbersActivity;
import com.ucare.we.BalanceRechargeOtherNumberActivity;
import com.ucare.we.R;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.MainPlanResponseBody;
import com.ucare.we.model.SwitchAccountModel.SwitchAccountResponse;
import com.ucare.we.model.extras.ExtrasList;
import com.ucare.we.model.special.SpecialList;
import com.ucare.we.model.usagedetails.SummarizedLineUsageItem;
import com.ucare.we.paybillautheduser.PayBillForUserActivity;
import com.ucare.we.paybillpaymentmethod.PaymentMethodActivity;
import defpackage.au;
import java.util.ArrayList;
import java.util.List;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class PayBillNumberTypeActivity extends czy implements View.OnClickListener, dgb, dht, dju {
    @Inject
    protected dio b;
    ImageView e;
    TextView f;
    TextView g;
    TextView h;
    View i;
    View j;
    View k;
    @Inject
    djw l;
    LinearLayout m;
    LinearLayout n;
    LinearLayout o;
    LinearLayout p;
    @Inject
    djx q;
    @Inject
    dhu r;
    @Inject
    djg s;
    @Inject
    dgc t;
    Context u;
    private final int x = 1;
    public boolean a = true;
    boolean c = true;
    boolean d = false;
    private au.b<JSONObject> y = new au.b<JSONObject>() { // from class: com.ucare.we.presentation.paybillnumbertype.PayBillNumberTypeActivity.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            Gson gson = new Gson();
            PayBillNumberTypeActivity.this.s.a();
            SwitchAccountResponse switchAccountResponse = (SwitchAccountResponse) gson.a(jSONObject.toString(), (Class<Object>) SwitchAccountResponse.class);
            if (switchAccountResponse != null && switchAccountResponse.header != null && switchAccountResponse.header.responseCode.equals("0")) {
                int i = 0;
                while (true) {
                    if (i >= switchAccountResponse.body.managedLines.size()) {
                        break;
                    } else if (switchAccountResponse.body.managedLines.get(i).mobileNumber.equals(PayBillNumberTypeActivity.this.l.m())) {
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
                Intent intent = new Intent(PayBillNumberTypeActivity.this.u, AssociatedNumbersActivity.class);
                Bundle bundle = new Bundle();
                bundle.putParcelableArrayList("associatedNumbers", arrayList2);
                bundle.putBoolean(cwl.d, true);
                bundle.putBoolean("targetNumber", PayBillNumberTypeActivity.this.a);
                intent.putExtras(bundle);
                PayBillNumberTypeActivity.this.startActivity(intent);
            } else if (switchAccountResponse != null && switchAccountResponse.header != null && switchAccountResponse.header.responseCode.equals("1200")) {
                PayBillNumberTypeActivity.this.b(1);
            }
        }
    };
    private au.a z = new au.a() { // from class: com.ucare.we.presentation.paybillnumbertype.PayBillNumberTypeActivity.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            PayBillNumberTypeActivity.this.s.a();
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
        setContentView(R.layout.activity_pay_bill_number_type);
        a(getString(R.string.pay_bill), false, false);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.e = imageView;
        imageView.setOnClickListener(this);
        this.r.a(this);
        this.t.a(this);
        this.m = (LinearLayout) findViewById(R.id.ll_current_number);
        this.n = (LinearLayout) findViewById(R.id.ll_my_numbers);
        this.o = (LinearLayout) findViewById(R.id.ll_other_number);
        this.p = (LinearLayout) findViewById(R.id.ll_pay_landlines_bill);
        this.i = findViewById(R.id.v_current_number);
        this.j = findViewById(R.id.v_my_numbers);
        this.k = findViewById(R.id.v_other_numbers);
        this.g = (TextView) findViewById(R.id.tv_choose_number);
        this.h = (TextView) findViewById(R.id.txtTitle);
        this.m.setOnClickListener(this);
        this.n.setOnClickListener(this);
        this.o.setOnClickListener(this);
        this.p.setOnClickListener(this);
        TextView textView = (TextView) findViewById(R.id.current_number);
        this.f = textView;
        textView.setText(this.l.m());
        this.h.setText(getString(R.string.pay_bill));
        if (this.b.h() && this.b.e() && this.t.a().getPayForOthers() != null) {
            if (!this.t.a().getPayForOthers().contains(this.l.w())) {
                this.m.setVisibility(8);
                this.n.setVisibility(8);
                this.i.setVisibility(8);
                this.j.setVisibility(8);
                this.o.setVisibility(8);
                this.k.setVisibility(8);
                this.g.setVisibility(8);
            } else {
                this.m.setVisibility(8);
                this.i.setVisibility(8);
            }
        }
        this.u = this;
        this.t.b();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imgBackButton) {
            finish();
        } else if (id == R.id.ll_current_number) {
            Intent intent = new Intent(this, PaymentMethodActivity.class);
            intent.putExtra("targetNumber", this.f.getText().toString());
            intent.putExtra("CURRENT_NUMBER_FLAG", this.c);
            startActivity(intent);
        } else if (id == R.id.ll_my_numbers) {
            try {
                this.s.a(this, getString(R.string.loading));
                djl.a(this).l(this.y, this.z);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            this.s.a(this, getString(R.string.loading));
        } else if (id == R.id.ll_other_number) {
            Intent intent2 = new Intent(this, BalanceRechargeOtherNumberActivity.class);
            intent2.putExtra("targetFlag", this.a);
            startActivity(intent2);
        } else if (id != R.id.ll_pay_landlines_bill) {
        } else {
            startActivity(new Intent(this, PayBillForUserActivity.class));
        }
    }

    @Override // androidx.appcompat.app.AppCompatActivity, androidx.fragment.app.FragmentActivity, android.app.Activity
    public void onDestroy() {
        this.r.b(this);
        super.onDestroy();
    }

    @Override // defpackage.dht
    public final void c(List<AssociatedNumberResponseBody> list) {
        this.s.a();
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i).getMobileNumber().equalsIgnoreCase(this.l.m())) {
                list.remove(i);
            }
        }
        if (list.size() > 0) {
            djx.a(this, AssociatedNumbersActivity.class, new ArrayList(list));
        }
    }

    @Override // defpackage.dht
    public final void q_() {
        this.s.a();
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        try {
            this.s.a(this, getString(R.string.loading));
            djl.a(this).l(this.y, this.z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
