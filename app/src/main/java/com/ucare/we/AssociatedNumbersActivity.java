package com.ucare.we;

import android.content.Intent;
import android.os.Bundle;
import android.text.TextUtils;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.paybillpaymentmethod.PaymentMethodActivity;
import defpackage.cws;
import java.util.ArrayList;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class AssociatedNumbersActivity extends czy implements View.OnClickListener, cws.a {
    ImageView a;
    RecyclerView b;
    cws c;
    ArrayList<AssociatedNumberResponseBody> d;
    TextView e;
    TextView f;
    Button g;
    boolean h;
    boolean i = false;
    String j;
    @Inject
    djw k;
    @Inject
    djx l;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_choose_associated_number);
        a(getString(R.string.choose_number), false, false);
        this.a = (ImageView) findViewById(R.id.imgBackButton);
        Button button = (Button) findViewById(R.id.btn_current_number);
        this.g = button;
        button.setText(this.k.m());
        this.d = getIntent().getParcelableArrayListExtra("associatedNumbers");
        this.h = getIntent().getBooleanExtra(cwl.d, false);
        this.i = getIntent().getBooleanExtra("targetNumber", false);
        this.j = getIntent().getStringExtra(cwl.a);
        this.b = (RecyclerView) findViewById(R.id.rv_associated_numbers);
        this.e = (TextView) findViewById(R.id.txtNoData);
        TextView textView = (TextView) findViewById(R.id.txtTitle);
        this.f = textView;
        textView.setText(getString(R.string.choose_number));
        this.b.setLayoutManager(new LinearLayoutManager(this, 1, false));
        this.b.setHasFixedSize(true);
        cws cwsVar = new cws(this, this.h);
        this.c = cwsVar;
        this.b.setAdapter(cwsVar);
        if (this.d.size() == 0) {
            this.e.setText(getString(R.string.no_myNumbers));
            return;
        }
        cws cwsVar2 = this.c;
        cwsVar2.b = this.d;
        cwsVar2.notifyDataSetChanged();
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.iv_close) {
            finish();
        }
        if (id == R.id.imgBackButton) {
            finish();
        }
    }

    @Override // defpackage.cws.a
    public final void a(AssociatedNumberResponseBody associatedNumberResponseBody) {
        if (TextUtils.isEmpty(this.j)) {
            if (this.i) {
                Intent intent = new Intent(this, PaymentMethodActivity.class);
                intent.putExtra("targetNumber", associatedNumberResponseBody.getMobileNumber());
                startActivity(intent);
                finish();
                return;
            }
            this.l.a(associatedNumberResponseBody.getMobileNumber(), this, BalanceRechargeCurrentNumberActivity.class);
            finish();
            return;
        }
        Intent intent2 = new Intent();
        intent2.putExtra(cwl.b, associatedNumberResponseBody.getMobileNumber());
        setResult(-1, intent2);
        finish();
    }
}
