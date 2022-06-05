package com.ucare.we.presentation.switchaccount;

import android.content.Context;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.RefreshLoginResponse;
import com.ucare.we.model.StatusModel.StatusResponse;
import com.ucare.we.model.StatusModel.StatusResponseBody;
import com.ucare.we.model.SwitchAccountModel.FinalizeNumberResponse;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import defpackage.au;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public class CancelAccessConfirmationActivity extends dae implements dju {
    @Inject
    djw b;
    @Inject
    djg c;
    private String g;
    private TextView h;
    private TextView i;
    private Button j;
    private Button k;
    private String l;
    private Context m;
    View.OnClickListener a = new View.OnClickListener() { // from class: com.ucare.we.presentation.switchaccount.-$$Lambda$CancelAccessConfirmationActivity$TokYbEv6Jsy19xgauhZNznvk6jY
        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            CancelAccessConfirmationActivity.lambda$TokYbEv6Jsy19xgauhZNznvk6jY(CancelAccessConfirmationActivity.this, view);
        }
    };
    private int n = 1;
    private au.a o = new au.a() { // from class: com.ucare.we.presentation.switchaccount.CancelAccessConfirmationActivity.1
        {
            CancelAccessConfirmationActivity.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ResponseActivity.a(CancelAccessConfirmationActivity.this.m, CancelAccessConfirmationActivity.this.m.getString(R.string.error), CancelAccessConfirmationActivity.this.m.getString(R.string.generic_error), true);
        }
    };
    au.b<JSONObject> d = new au.b<JSONObject>() { // from class: com.ucare.we.presentation.switchaccount.CancelAccessConfirmationActivity.2
        {
            CancelAccessConfirmationActivity.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            CancelAccessConfirmationActivity.this.c.a();
            Gson gson = new Gson();
            RefreshLoginResponse refreshLoginResponse = (RefreshLoginResponse) gson.a(jSONObject.toString(), (Class<Object>) RefreshLoginResponse.class);
            gson.a(refreshLoginResponse);
            if (refreshLoginResponse == null || refreshLoginResponse.header == null || !refreshLoginResponse.header.responseCode.equals("0")) {
                return;
            }
            CancelAccessConfirmationActivity.this.b.w("");
            CancelAccessConfirmationActivity.this.b.r(false);
            CancelAccessConfirmationActivity.this.b.o(false);
            CancelAccessConfirmationActivity.this.b.x("");
            CancelAccessConfirmationActivity.this.b.p(false);
            CancelAccessConfirmationActivity.this.b.A("");
            CancelAccessConfirmationActivity.this.b.y("");
            CancelAccessConfirmationActivity.this.b.z("");
            CancelAccessConfirmationActivity.this.b.p("");
            CancelAccessConfirmationActivity.this.g = refreshLoginResponse.body.jwt;
            CancelAccessConfirmationActivity.this.b.u(CancelAccessConfirmationActivity.this.g);
            CancelAccessConfirmationActivity.this.b.r(refreshLoginResponse.body.getUserProperties().getRegistered().booleanValue());
            CancelAccessConfirmationActivity.this.b.w(refreshLoginResponse.body.getGroupFmc().getId());
            CancelAccessConfirmationActivity.this.b.o(refreshLoginResponse.body.getGroupFmc().isSubscribed());
            CancelAccessConfirmationActivity.this.b.x(new Gson().a(refreshLoginResponse.body.getGroupFamily()));
            CancelAccessConfirmationActivity.this.b.p(refreshLoginResponse.body.isIptv());
            CancelAccessConfirmationActivity.this.b.d(refreshLoginResponse.header.msisdn);
            StatusResponse statusResponse = new StatusResponse();
            statusResponse.header = refreshLoginResponse.header;
            statusResponse.body = new StatusResponseBody();
            statusResponse.body.type = refreshLoginResponse.body.type;
            statusResponse.body.role = refreshLoginResponse.body.role;
        }
    };
    au.a e = new au.a() { // from class: com.ucare.we.presentation.switchaccount.CancelAccessConfirmationActivity.3
        {
            CancelAccessConfirmationActivity.this = this;
        }

        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            CancelAccessConfirmationActivity.this.c.a();
            new Gson().a(volleyError.getMessage());
        }
    };
    private au.b<JSONObject> p = new au.b<JSONObject>() { // from class: com.ucare.we.presentation.switchaccount.CancelAccessConfirmationActivity.4
        {
            CancelAccessConfirmationActivity.this = this;
        }

        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            Gson gson = new Gson();
            FinalizeNumberResponse finalizeNumberResponse = (FinalizeNumberResponse) gson.a(jSONObject.toString(), (Class<Object>) FinalizeNumberResponse.class);
            gson.a(finalizeNumberResponse);
            if (finalizeNumberResponse != null && finalizeNumberResponse.header != null && finalizeNumberResponse.header.responseCode.equals("0")) {
                ResponseActivity.a(CancelAccessConfirmationActivity.this.m, CancelAccessConfirmationActivity.this.m.getString(R.string.successfully), finalizeNumberResponse.header.responseMessage, false);
                if (finalizeNumberResponse.body == null || finalizeNumberResponse.body.jwt.equals("")) {
                    return;
                }
                CancelAccessConfirmationActivity cancelAccessConfirmationActivity = CancelAccessConfirmationActivity.this;
                String r = cancelAccessConfirmationActivity.b.r();
                try {
                    cancelAccessConfirmationActivity.c.a(cancelAccessConfirmationActivity, cancelAccessConfirmationActivity.getString(R.string.loading));
                    djl.a(cancelAccessConfirmationActivity).o(r, cancelAccessConfirmationActivity.d, cancelAccessConfirmationActivity.e);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
            } else if (finalizeNumberResponse == null || finalizeNumberResponse.header == null || !finalizeNumberResponse.header.responseCode.equals("1200")) {
                ResponseActivity.a(CancelAccessConfirmationActivity.this.m, CancelAccessConfirmationActivity.this.m.getString(R.string.error), finalizeNumberResponse.header.responseMessage, true);
            } else {
                CancelAccessConfirmationActivity cancelAccessConfirmationActivity2 = CancelAccessConfirmationActivity.this;
                cancelAccessConfirmationActivity2.b(cancelAccessConfirmationActivity2.n);
            }
        }
    };
    View.OnClickListener f = new View.OnClickListener() { // from class: com.ucare.we.presentation.switchaccount.CancelAccessConfirmationActivity.5
        {
            CancelAccessConfirmationActivity.this = this;
        }

        @Override // android.view.View.OnClickListener
        public final void onClick(View view) {
            try {
                djl.a(CancelAccessConfirmationActivity.this.m).b("", CancelAccessConfirmationActivity.this.l, "remove", CancelAccessConfirmationActivity.this.p, CancelAccessConfirmationActivity.this.o);
            } catch (JSONException e) {
                e.printStackTrace();
            }
        }
    };

    public static /* synthetic */ void lambda$TokYbEv6Jsy19xgauhZNznvk6jY(CancelAccessConfirmationActivity cancelAccessConfirmationActivity, View view) {
        cancelAccessConfirmationActivity.a(view);
    }

    public /* synthetic */ void a(View view) {
        finish();
    }

    @Override // defpackage.dae, defpackage.czy, androidx.fragment.app.FragmentActivity, androidx.activity.ComponentActivity, androidx.core.app.ComponentActivity, android.app.Activity
    public void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        setContentView(R.layout.activity_cancel_access_confirmation);
        this.m = this;
        if (getIntent().getExtras() != null) {
            this.l = getIntent().getExtras().getString("mobileNumber");
        }
        this.h = (TextView) findViewById(R.id.txtMessage);
        this.i = (TextView) findViewById(R.id.txtMessageDetails);
        this.j = (Button) findViewById(R.id.btn_ok);
        this.k = (Button) findViewById(R.id.btn_cancel);
        this.h.setText(getString(R.string.confirmation_title));
        TextView textView = this.i;
        textView.setText(getString(R.string.cancel_access_number_1) + this.l + "\n" + getString(R.string.cancel_access_number_2));
        this.j.setOnClickListener(this.f);
        this.k.setOnClickListener(this.a);
    }

    @Override // defpackage.dju
    public final void b(int i) {
        new djc(this.m, this, i);
    }

    @Override // defpackage.dju
    public final void a(String str, int i) {
        try {
            djl.a(this.m).b("", this.l, "remove", this.p, this.o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
