package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.CheckAutoPayStatusResponse;
import com.ucare.we.model.DefaultResponse;
import com.ucare.we.model.GetCreditCardInfoFinalize.GetCreditCardInfoResponse;
import com.ucare.we.model.SocialMediaModel.SocialMediaStatusResponse;
import com.ucare.we.model.UpdateMailResponse;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cyk  reason: default package */
/* loaded from: classes2.dex */
public final class cyk {
    @Inject
    djw a;
    Context b;
    cyl c;
    String h;
    dju i;
    private String p;
    au.a d = new au.a() { // from class: cyk.1
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cyk.this.c.a(false);
        }
    };
    au.b<JSONObject> e = new au.b<JSONObject>() { // from class: cyk.7
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cyk.this.c.a(false);
            SocialMediaStatusResponse socialMediaStatusResponse = (SocialMediaStatusResponse) new Gson().a(jSONObject.toString(), (Class<Object>) SocialMediaStatusResponse.class);
            if (socialMediaStatusResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                cyk.this.c.a(socialMediaStatusResponse);
            } else if (socialMediaStatusResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
            } else {
                UnNavigateResponseActivity.a(cyk.this.b, socialMediaStatusResponse.getHeader().getResponseMessage(), cyk.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    au.a f = new au.a() { // from class: cyk.8
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cyk.this.c.a(false);
        }
    };
    au.b<JSONObject> g = new au.b<JSONObject>() { // from class: cyk.9
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cyk.this.c.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                UnNavigateResponseActivity.a(cyk.this.b, cyk.this.b.getString(R.string.successful), defaultResponse.getHeader().getResponseMessage(), false);
                cyk.this.a();
            } else if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
            } else {
                UnNavigateResponseActivity.a(cyk.this.b, defaultResponse.getHeader().getResponseMessage(), cyk.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    au.b<JSONObject> j = new au.b<JSONObject>() { // from class: cyk.10
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cyk.this.c.a(false);
            UpdateMailResponse updateMailResponse = (UpdateMailResponse) new Gson().a(jSONObject.toString(), (Class<Object>) UpdateMailResponse.class);
            if (updateMailResponse.header != null && updateMailResponse.header.responseCode != null && updateMailResponse.header.responseCode.equals("0")) {
                cyk.this.c.a(cyk.this.h);
                cyk.this.c.a();
            } else if (updateMailResponse.header != null && updateMailResponse.header.responseCode != null && updateMailResponse.header.responseCode.equals("1200")) {
                cyk.this.i.b(1);
            } else {
                UnNavigateResponseActivity.a(cyk.this.b, updateMailResponse.header.responseMessage, cyk.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    au.a k = new au.a() { // from class: cyk.11
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cyk.this.c.a(false);
            UnNavigateResponseActivity.a(cyk.this.b, cyk.this.b.getString(R.string.check_network_connection), cyk.this.b.getString(R.string.please_try_again), true);
        }
    };
    au.a l = new au.a() { // from class: cyk.12
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cyk.this.c.b(cyk.this.b.getString(R.string.payment_status_failure_message));
        }
    };
    private au.a q = new au.a() { // from class: cyk.13
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }
    };
    au.b<JSONObject> m = new au.b<JSONObject>() { // from class: cyk.14
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cyk.this.c.a(false);
            CheckAutoPayStatusResponse checkAutoPayStatusResponse = (CheckAutoPayStatusResponse) new Gson().a(jSONObject.toString(), (Class<Object>) CheckAutoPayStatusResponse.class);
            if (checkAutoPayStatusResponse != null && checkAutoPayStatusResponse.header != null && checkAutoPayStatusResponse.header.responseCode.equalsIgnoreCase("0")) {
                cyk.this.c.b(checkAutoPayStatusResponse);
            } else {
                cyk.this.c.b(checkAutoPayStatusResponse.header.responseMessage);
            }
        }
    };
    private au.b<JSONObject> r = new au.b<JSONObject>() { // from class: cyk.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cyk.this.c.a(false);
            CheckAutoPayStatusResponse checkAutoPayStatusResponse = (CheckAutoPayStatusResponse) new Gson().a(jSONObject.toString(), (Class<Object>) CheckAutoPayStatusResponse.class);
            if (checkAutoPayStatusResponse != null && checkAutoPayStatusResponse.header != null && checkAutoPayStatusResponse.header.responseCode == "0") {
                cyk.this.c.a(checkAutoPayStatusResponse);
            } else {
                cyk.this.c.a((CheckAutoPayStatusResponse) null);
            }
        }
    };
    au.b<JSONObject> n = new au.b<JSONObject>() { // from class: cyk.3
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cyk.this.c.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.header != null && defaultResponse.header.getResponseCode() != null && defaultResponse.header.getResponseCode().equals("0")) {
                ResponseActivity.a(cyk.this.b, cyk.this.b.getString(R.string.successfully), defaultResponse.header.getResponseMessage(), false);
            } else {
                UnNavigateResponseActivity.a(cyk.this.b, defaultResponse.header.getResponseMessage(), cyk.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    au.a o = new au.a() { // from class: cyk.4
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cyk.this.c.a(false);
            UnNavigateResponseActivity.a(cyk.this.b, cyk.this.b.getString(R.string.check_network_connection), cyk.this.b.getString(R.string.please_try_again), true);
        }
    };
    private au.b<JSONObject> s = new au.b<JSONObject>() { // from class: cyk.5
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            GetCreditCardInfoResponse getCreditCardInfoResponse = (GetCreditCardInfoResponse) new Gson().a(jSONObject.toString(), (Class<Object>) GetCreditCardInfoResponse.class);
            if (getCreditCardInfoResponse != null && getCreditCardInfoResponse.getHeader() != null && getCreditCardInfoResponse.getHeader().responseCode.equals("0")) {
                cyk.this.c.a(getCreditCardInfoResponse.getBody().getMaskedCardNumber(), getCreditCardInfoResponse.getBody().getCardType());
            } else if (getCreditCardInfoResponse != null && getCreditCardInfoResponse.getHeader() != null && getCreditCardInfoResponse.getHeader().responseCode.equals("1200")) {
                cyk.this.i.b(2);
            } else {
                UnNavigateResponseActivity.a(cyk.this.b, getCreditCardInfoResponse.getHeader().responseMessage, cyk.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a t = new au.a() { // from class: cyk.6
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ResponseActivity.a(cyk.this.b, cyk.this.b.getString(R.string.error), cyk.this.b.getString(R.string.generic_error), true);
        }
    };

    public cyk(Context context, cyl cylVar, dju djuVar) {
        this.b = context;
        this.c = cylVar;
        this.i = djuVar;
    }

    public final void a(String str) {
        this.p = str;
        try {
            djl.a(this.b).k(this.p, this.s, this.t);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a() {
        this.c.a(true);
        try {
            djl.a(this.b).v(this.e, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void b(String str) {
        try {
            this.c.a(true);
            djl.a(this.b).m(str, this.g, this.d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
