package com.ucare.we.paybillpaymentmethod;

import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.HomeCollectionResponse;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class HomeCollectionActivity extends dae implements dju {
    String a;
    @Inject
    djg b;
    private TextView f;
    private TextView g;
    private ImageView h;
    private final int e = 1;
    View.OnClickListener c = new View.OnClickListener() { // from class: com.ucare.we.paybillpaymentmethod.HomeCollectionActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            HomeCollectionActivity.this.finish();
        }
    };
    private au.b<JSONObject> i = new au.b<JSONObject>() { // from class: com.ucare.we.paybillpaymentmethod.HomeCollectionActivity.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            HomeCollectionActivity.this.b.a();
            HomeCollectionResponse homeCollectionResponse = (HomeCollectionResponse) new Gson().a(jSONObject.toString(), (Class<Object>) HomeCollectionResponse.class);
            if (homeCollectionResponse != null && homeCollectionResponse.header != null) {
                if (homeCollectionResponse.header.responseCode.equals("0")) {
                    HomeCollectionActivity homeCollectionActivity = HomeCollectionActivity.this;
                    ResponseActivity.a(homeCollectionActivity, homeCollectionActivity.getString(R.string.successful), homeCollectionResponse.header.responseMessage, false);
                } else if (homeCollectionResponse.header.responseCode.equals("1200")) {
                    HomeCollectionActivity.this.b(1);
                } else {
                    UnNavigateResponseActivity.a(HomeCollectionActivity.this, homeCollectionResponse.header.responseMessage, HomeCollectionActivity.this.getString(R.string.please_try_again), true);
                }
            } else {
                UnNavigateResponseActivity.a(HomeCollectionActivity.this, homeCollectionResponse.header.responseMessage, HomeCollectionActivity.this.getString(R.string.please_try_again), true);
            }
            HomeCollectionActivity.this.finish();
        }
    };
    private au.a j = new au.a() { // from class: com.ucare.we.paybillpaymentmethod.HomeCollectionActivity.3
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            HomeCollectionActivity.this.finish();
            HomeCollectionActivity.this.b.a();
            UnNavigateResponseActivity.a(HomeCollectionActivity.this, volleyError.getMessage(), HomeCollectionActivity.this.getString(R.string.please_try_again), true);
        }
    };
    View.OnClickListener d = new View.OnClickListener() { // from class: com.ucare.we.paybillpaymentmethod.HomeCollectionActivity.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            djg djgVar = HomeCollectionActivity.this.b;
            HomeCollectionActivity homeCollectionActivity = HomeCollectionActivity.this;
            djgVar.a(homeCollectionActivity, homeCollectionActivity.getString(R.string.loading));
            try {
                djl.a(HomeCollectionActivity.this).j(HomeCollectionActivity.this.i, HomeCollectionActivity.this.j);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    };

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_home_collection);
        this.f = (TextView) findViewById(R.id.txtOK);
        this.g = (TextView) findViewById(R.id.txtCancel);
        this.h = (ImageView) findViewById(R.id.imgClose);
        this.f.setOnClickListener(this.d);
        this.g.setOnClickListener(this.c);
        this.h.setOnClickListener(this.c);
        this.a = getIntent().getStringExtra("targetNumber");
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        try {
            djl.a(this).j(this.i, this.j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
