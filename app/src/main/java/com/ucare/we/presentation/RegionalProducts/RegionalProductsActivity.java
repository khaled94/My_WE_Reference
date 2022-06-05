package com.ucare.we.presentation.RegionalProducts;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.AuthFailureError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.manageplanspostpaid.ManagePostPaidPlanActivity;
import com.ucare.we.model.RegionalProducts.RegionalPlansResponse;
import com.ucare.we.model.RegionalProducts.RegionalPlansResponseBody;
import com.ucare.we.model.RegionalProducts.RegionalProductDismissRequest;
import com.ucare.we.model.RequestHeader;
import com.ucare.we.morebundle.SelectMoreBundlesActivity;
import defpackage.au;
import defpackage.djl;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class RegionalProductsActivity extends dae implements ddd, dju {
    @Inject
    djw a;
    @Inject
    dhn b;
    @Inject
    djb c;
    @Inject
    dio d;
    ddc e;
    TextView f;
    TextView g;
    TextView h;
    TextView k;
    ImageView l;
    Button m;
    Button n;
    List<RegionalPlansResponseBody> p;
    private Context x;
    String i = "";
    String j = "";
    int o = 0;
    View.OnClickListener q = new View.OnClickListener() { // from class: com.ucare.we.presentation.RegionalProducts.-$$Lambda$RegionalProductsActivity$IkqRryu_ISn_8DDakFyDqIbvZkQ
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RegionalProductsActivity.lambda$IkqRryu_ISn_8DDakFyDqIbvZkQ(RegionalProductsActivity.this, view);
        }
    };
    View.OnClickListener r = new View.OnClickListener() { // from class: com.ucare.we.presentation.RegionalProducts.RegionalProductsActivity.1
        {
            RegionalProductsActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            RegionalProductsActivity.this.e.a(RegionalProductsActivity.this.p.get(RegionalProductsActivity.this.o).getOfferId());
            RegionalProductsActivity.this.o++;
            if (RegionalProductsActivity.this.o < RegionalProductsActivity.this.p.size()) {
                RegionalProductsActivity.this.a();
            } else {
                RegionalProductsActivity.this.finish();
            }
        }
    };
    View.OnClickListener s = new View.OnClickListener() { // from class: com.ucare.we.presentation.RegionalProducts.RegionalProductsActivity.2
        {
            RegionalProductsActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (RegionalProductsActivity.this.a.v().equalsIgnoreCase("prepaid")) {
                Intent intent = new Intent(RegionalProductsActivity.this, SelectMoreBundlesActivity.class);
                intent.putExtra("regional_popUp", true);
                RegionalProductsActivity.this.startActivity(intent);
                RegionalProductsActivity.this.finish();
            } else if (RegionalProductsActivity.this.a.v().equalsIgnoreCase("postpaid")) {
                Intent intent2 = new Intent(RegionalProductsActivity.this, SelectMoreBundlesActivity.class);
                intent2.putExtra("regional_popUp", true);
                RegionalProductsActivity.this.startActivity(intent2);
                RegionalProductsActivity.this.finish();
            }
            RegionalProductsActivity.this.e.a(RegionalProductsActivity.this.p.get(RegionalProductsActivity.this.o).getOfferId());
        }
    };
    View.OnClickListener t = new View.OnClickListener() { // from class: com.ucare.we.presentation.RegionalProducts.RegionalProductsActivity.3
        {
            RegionalProductsActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            if (RegionalProductsActivity.this.a.v().equalsIgnoreCase("postpaid")) {
                Intent intent = new Intent(RegionalProductsActivity.this, ManagePostPaidPlanActivity.class);
                intent.putExtra("regional_popUp", true);
                RegionalProductsActivity.this.startActivity(intent);
                RegionalProductsActivity.this.finish();
            } else if (!RegionalProductsActivity.this.a.v().equalsIgnoreCase("prepaid")) {
            } else {
                Intent intent2 = new Intent(RegionalProductsActivity.this, ManagePostPaidPlanActivity.class);
                intent2.putExtra("regional_popUp", true);
                RegionalProductsActivity.this.startActivity(intent2);
                RegionalProductsActivity.this.finish();
            }
        }
    };
    View.OnClickListener u = new View.OnClickListener() { // from class: com.ucare.we.presentation.RegionalProducts.RegionalProductsActivity.4
        {
            RegionalProductsActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ddc ddcVar = RegionalProductsActivity.this.e;
            String offerId = RegionalProductsActivity.this.p.get(RegionalProductsActivity.this.o).getOfferId();
            try {
                ddcVar.b.showProgress(true);
                final djl a = djl.a(ddcVar.a);
                au.b<JSONObject> bVar = ddcVar.c;
                au.a aVar = ddcVar.d;
                RequestHeader requestHeader = new RequestHeader();
                requestHeader.setLocale(a.c.c.k());
                requestHeader.setMsisdn(a.d.m());
                RegionalProductDismissRequest regionalProductDismissRequest = new RegionalProductDismissRequest();
                regionalProductDismissRequest.setHeader(requestHeader);
                regionalProductDismissRequest.setBody(offerId);
                bj bjVar = new bj("https://api-my.te.eg/api/regional/offers/dont-show", new JSONObject(a.a.a(regionalProductDismissRequest)), bVar, aVar) { // from class: djl.65
                    @Override // defpackage.as
                    public final Map<String, String> c() throws AuthFailureError {
                        HashMap hashMap = new HashMap();
                        hashMap.put("Jwt", a.d.I());
                        return hashMap;
                    }
                };
                bjVar.l = djl.a.MAIN_PLAN;
                bjVar.j = new am(60000, 0, 0.0f);
                a.b.a((as) bjVar);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            RegionalProductsActivity.this.o++;
            if (RegionalProductsActivity.this.o < RegionalProductsActivity.this.p.size()) {
                RegionalProductsActivity.this.a();
            } else {
                RegionalProductsActivity.this.finish();
            }
        }
    };

    public static /* synthetic */ void lambda$IkqRryu_ISn_8DDakFyDqIbvZkQ(RegionalProductsActivity regionalProductsActivity, View view) {
        regionalProductsActivity.a(view);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
    }

    @Override // defpackage.ddd
    public void showProgress(boolean z) {
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.regional_product_popup);
        this.x = this;
        this.f = (TextView) findViewById(R.id.txt_dontShow);
        this.k = (TextView) findViewById(R.id.txt_regional_dismiss);
        this.l = (ImageView) findViewById(R.id.ivCross);
        this.g = (TextView) findViewById(R.id.tvMessageRegionalProducts);
        this.h = (TextView) findViewById(R.id.tvTitle);
        this.m = (Button) findViewById(R.id.btnRegionalAddons);
        this.n = (Button) findViewById(R.id.btnRegionalPlans);
        if (this.b.f.getRegional_popup_text_en() != null) {
            this.i = this.b.f.getRegional_popup_text_en().replace("#{msisdn}", this.a.m());
        }
        if (this.b.f.getRegional_popup_text_ar() != null) {
            this.j = this.b.f.getRegional_popup_text_ar().replace("#{msisdn}", this.a.m());
        }
        RegionalPlansResponse regionalPlansResponse = (RegionalPlansResponse) new Gson().a(getIntent().getStringExtra("response"), (Class<Object>) RegionalPlansResponse.class);
        this.p = regionalPlansResponse.getBody();
        regionalPlansResponse.getBody().get(this.o).getOfferEnName();
        a();
        this.f.setOnClickListener(this.u);
        this.k.setOnClickListener(this.r);
        this.l.setOnClickListener(this.r);
        this.m.setOnClickListener(this.s);
        this.n.setOnClickListener(this.t);
        this.e = new ddc(this.x, this, this);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.x, this, i);
    }

    public final void a() {
        if (this.o < this.p.size()) {
            if (this.c.e()) {
                this.g.setText(this.j.replace("#{planName}", this.p.get(this.o).getOfferArName()));
            } else {
                this.g.setText(this.i.replace("#{planName}", this.p.get(this.o).getOfferEnName()));
            }
            if (this.p.get(this.o).isAddon()) {
                this.m.setVisibility(0);
                this.n.setVisibility(8);
                this.h.setText(getString(R.string.regional_add_ons));
                return;
            }
            this.m.setVisibility(8);
            this.n.setVisibility(0);
            this.h.setText(getString(R.string.special_plans));
        }
    }
}
