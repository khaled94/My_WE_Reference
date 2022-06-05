package com.ucare.we.morebundle;

import android.content.Context;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.Offer;
import com.ucare.we.model.MoreBundleModel.ResponseUnsubscribeFromMoreBundle;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import java.util.ArrayList;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class ConfirmRenewalExtraActivity extends dae implements dju {
    @Inject
    djg a;
    @Inject
    djw b;
    @Inject
    dhn c;
    ArrayList<Offer> d;
    private TextView i;
    private TextView j;
    private TextView k;
    private String l;
    private String m;
    View.OnClickListener e = new View.OnClickListener() { // from class: com.ucare.we.morebundle.ConfirmRenewalExtraActivity.1
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmRenewalExtraActivity.this.finish();
        }
    };
    private int n = 1;
    au.b<JSONObject> f = new au.b<JSONObject>() { // from class: com.ucare.we.morebundle.ConfirmRenewalExtraActivity.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            String str;
            ConfirmRenewalExtraActivity.this.a.a();
            ResponseUnsubscribeFromMoreBundle responseUnsubscribeFromMoreBundle = (ResponseUnsubscribeFromMoreBundle) new Gson().a(jSONObject.toString(), (Class<Object>) ResponseUnsubscribeFromMoreBundle.class);
            if (responseUnsubscribeFromMoreBundle.getHeader().getResponseCode().equals("0")) {
                ConfirmRenewalExtraActivity confirmRenewalExtraActivity = ConfirmRenewalExtraActivity.this;
                ResponseActivity.a(confirmRenewalExtraActivity, confirmRenewalExtraActivity.getString(R.string.successfully), responseUnsubscribeFromMoreBundle.getHeader().getResponseMessage(), false);
            } else if (responseUnsubscribeFromMoreBundle.getHeader().getResponseCode().equals("1200")) {
                ConfirmRenewalExtraActivity confirmRenewalExtraActivity2 = ConfirmRenewalExtraActivity.this;
                confirmRenewalExtraActivity2.b(confirmRenewalExtraActivity2.n);
            } else if (responseUnsubscribeFromMoreBundle.getHeader().getResponseCode().equals("9001") || responseUnsubscribeFromMoreBundle.getHeader().getResponseCode().equals("8001")) {
                if (ConfirmRenewalExtraActivity.this.b.v().equalsIgnoreCase("postpaid")) {
                    if (ConfirmRenewalExtraActivity.this.b.k().equals("ar")) {
                        str = ConfirmRenewalExtraActivity.this.c.f.getMaximumBillLimitAr();
                    } else {
                        str = ConfirmRenewalExtraActivity.this.c.f.getMaximumBillLimitEn();
                    }
                } else {
                    str = responseUnsubscribeFromMoreBundle.getHeader().getResponseMessage();
                }
                Intent intent = new Intent(ConfirmRenewalExtraActivity.this, UnNavigateResponseActivity.class);
                intent.putExtra("success_msg_details", ConfirmRenewalExtraActivity.this.getString(R.string.please_try_again));
                intent.putExtra("success_msg", str);
                intent.putExtra("isError", true);
                intent.putExtra("showRecharge", true);
                ConfirmRenewalExtraActivity.this.startActivity(intent);
                ConfirmRenewalExtraActivity.this.finish();
            } else {
                String responseMessage = responseUnsubscribeFromMoreBundle.getHeader().getResponseMessage();
                ConfirmRenewalExtraActivity confirmRenewalExtraActivity3 = ConfirmRenewalExtraActivity.this;
                UnNavigateResponseActivity.a(confirmRenewalExtraActivity3, responseMessage, confirmRenewalExtraActivity3.getString(R.string.please_try_again), true);
            }
        }
    };
    au.a g = new au.a() { // from class: com.ucare.we.morebundle.ConfirmRenewalExtraActivity.3
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ConfirmRenewalExtraActivity.this.a.a();
            ConfirmRenewalExtraActivity confirmRenewalExtraActivity = ConfirmRenewalExtraActivity.this;
            UnNavigateResponseActivity.a(confirmRenewalExtraActivity, confirmRenewalExtraActivity.getString(R.string.check_network_connection), ConfirmRenewalExtraActivity.this.getString(R.string.please_try_again), true);
        }
    };
    View.OnClickListener h = new View.OnClickListener() { // from class: com.ucare.we.morebundle.ConfirmRenewalExtraActivity.4
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            ConfirmRenewalExtraActivity.this.i.setClickable(false);
            Offer offer = new Offer(ConfirmRenewalExtraActivity.this.m, "add");
            Offer offer2 = new Offer(ConfirmRenewalExtraActivity.this.m, "delete");
            ConfirmRenewalExtraActivity.this.d = new ArrayList<>();
            ConfirmRenewalExtraActivity.this.d.add(offer);
            ConfirmRenewalExtraActivity.this.d.add(offer2);
            ConfirmRenewalExtraActivity confirmRenewalExtraActivity = ConfirmRenewalExtraActivity.this;
            try {
                djl.a(confirmRenewalExtraActivity).a(confirmRenewalExtraActivity.d, confirmRenewalExtraActivity.f, confirmRenewalExtraActivity.g);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            ConfirmRenewalExtraActivity confirmRenewalExtraActivity2 = ConfirmRenewalExtraActivity.this;
            confirmRenewalExtraActivity2.a.a(confirmRenewalExtraActivity2, confirmRenewalExtraActivity2.getString(R.string.loading));
            ConfirmRenewalExtraActivity.this.finish();
        }
    };

    public static void a(Context context, String str, String str2) {
        Intent intent = new Intent(context, ConfirmRenewalExtraActivity.class);
        intent.putExtra("offer_name", str);
        intent.putExtra("offer_id", str2);
        context.startActivity(intent);
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_confirm_renewal_extra);
        this.k = (TextView) findViewById(R.id.txtConfirmationHint);
        this.i = (TextView) findViewById(R.id.txtOK);
        this.j = (TextView) findViewById(R.id.txtCancel);
        this.i.setOnClickListener(this.h);
        this.j.setOnClickListener(this.e);
        if (getIntent().getExtras() != null) {
            this.l = getIntent().getExtras().getString("offer_name");
            this.m = getIntent().getExtras().getString("offer_id");
        }
        TextView textView = this.k;
        textView.setText(getString(R.string.update_bundle) + this.l + getString(R.string.quest));
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        try {
            djl.a(this).a(this.d, this.f, this.g);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
