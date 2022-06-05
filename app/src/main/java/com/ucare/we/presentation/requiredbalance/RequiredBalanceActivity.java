package com.ucare.we.presentation.requiredbalance;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.ucare.we.R;
import com.ucare.we.model.remote.dueamount.DueAmount;
import com.ucare.we.model.remote.dueamount.Offer;
import com.ucare.we.presentation.prepaid.MainActivity;
import java.util.ArrayList;
import java.util.Locale;
import javax.inject.Inject;

/* loaded from: classes2.dex */
public class RequiredBalanceActivity extends czy implements View.OnClickListener {
    Button a;
    ImageView b;
    TextView c;
    @Inject
    djw d;
    private dgy e;
    private RecyclerView f;
    private TextView g;
    private TextView h;
    private TextView i;
    private TextView j;
    private LinearLayout k;
    private View l;

    @Override // defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_required_balance);
        a(getString(R.string.requiredBalanceTitle), false, false);
        this.f = (RecyclerView) findViewById(R.id.rvRequiredBalance);
        TextView textView = (TextView) findViewById(R.id.txtTitle);
        this.c = textView;
        textView.setText(getString(R.string.requiredBalanceTitle));
        this.k = (LinearLayout) findViewById(R.id.llOtherDues);
        this.l = findViewById(R.id.llOtherDuesDivider);
        this.a = (Button) findViewById(R.id.btn_current_number);
        this.g = (TextView) findViewById(R.id.tvRental);
        this.h = (TextView) findViewById(R.id.tvAmount);
        this.i = (TextView) findViewById(R.id.tvTotalAfterVat);
        this.j = (TextView) findViewById(R.id.tvTotalAmount);
        ImageView imageView = (ImageView) findViewById(R.id.imgBackButton);
        this.b = imageView;
        imageView.setOnClickListener(this);
        this.e = new dgy();
        this.f.setLayoutManager(new LinearLayoutManager(this));
        this.f.setAdapter(this.e);
        DueAmount dueAmount = (DueAmount) getIntent().getParcelableExtra("dueAmount");
        this.a.setText(getIntent().getStringExtra("targetNumber"));
        if (dueAmount != null) {
            if (dueAmount.getOtherDues().doubleValue() == 0.0d) {
                this.l.setVisibility(8);
                this.k.setVisibility(8);
            }
            this.g.setText(dueAmount.getOtherDues().toString());
            this.h.setText(dueAmount.getAmount().toString());
            this.i.setText(String.format(Locale.ENGLISH, "%.2f", dueAmount.getTotalAmount()));
            ArrayList<Offer> offers = dueAmount.getOffers();
            dgy dgyVar = this.e;
            dgyVar.b = offers;
            dgyVar.notifyDataSetChanged();
        }
    }

    @Override // android.view.View.OnClickListener
    public void onClick(View view) {
        int id = view.getId();
        if (id == R.id.imgBackButton) {
            finish();
        } else if (id != R.id.iv_close) {
        } else {
            Intent intent = new Intent(this, MainActivity.class);
            intent.addFlags(603979776);
            startActivity(intent);
            finish();
        }
    }
}
