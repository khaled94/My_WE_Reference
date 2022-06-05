package defpackage;

import android.app.Activity;
import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.MainRequestsHeader;
import com.ucare.we.model.PaymentModels.PaymentBankResponse;
import com.ucare.we.model.PaymentModels.PaymentBody;
import com.ucare.we.model.PaymentModels.PaymentRequest;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import defpackage.djl;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cxu  reason: default package */
/* loaded from: classes2.dex */
public final class cxu {
    public Context a;
    public cxv b;
    dju g;
    au.a c = new au.a() { // from class: cxu.1
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cxu.this.b.a(false);
            UnNavigateResponseActivity.a(cxu.this.a, cxu.this.a.getString(R.string.something_went_wrong), cxu.this.a.getString(R.string.please_try_again), true);
        }
    };
    public au.a d = new au.a() { // from class: cxu.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cxu.this.b.a(false);
            UnNavigateResponseActivity.a(cxu.this.a, cxu.this.a.getString(R.string.something_went_wrong), cxu.this.a.getString(R.string.please_try_again), true);
        }
    };
    au.a e = new au.a() { // from class: cxu.3
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cxu.this.b.a(false);
        }
    };
    au.b<JSONObject> f = new au.b<JSONObject>() { // from class: cxu.4
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cxu.this.b.a(false);
            new Gson();
        }
    };
    au.b<JSONObject> h = new au.b<JSONObject>() { // from class: cxu.5
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cxu.this.b.a(false);
            PaymentBankResponse paymentBankResponse = (PaymentBankResponse) new Gson().a(jSONObject.toString(), (Class<Object>) PaymentBankResponse.class);
            if (paymentBankResponse != null && paymentBankResponse.header != null && paymentBankResponse.header.responseCode.equals("0")) {
                cxu.this.b.a(paymentBankResponse.body);
            } else if (paymentBankResponse != null && paymentBankResponse.header != null && paymentBankResponse.header.responseCode.equals("1200")) {
                cxu.this.g.b(1);
            } else {
                UnNavigateResponseActivity.a(cxu.this.a, paymentBankResponse.header.responseMessage, cxu.this.a.getString(R.string.please_try_again), true);
                ((Activity) cxu.this.a).finish();
            }
        }
    };
    public au.b<JSONObject> i = new au.b<JSONObject>() { // from class: cxu.6
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cxu.this.b.a(false);
            PaymentBankResponse paymentBankResponse = (PaymentBankResponse) new Gson().a(jSONObject.toString(), (Class<Object>) PaymentBankResponse.class);
            if (paymentBankResponse != null && paymentBankResponse.header != null && paymentBankResponse.header.responseCode.equals("0")) {
                try {
                    cxu cxuVar = cxu.this;
                    cxuVar.b.a(true);
                    djl.a(cxuVar.a).k(cxuVar.f, cxuVar.e);
                } catch (JSONException e) {
                    e.printStackTrace();
                }
                ResponseActivity.a(cxu.this.a, cxu.this.a.getString(R.string.successfully), paymentBankResponse.header.responseMessage, false);
            } else if (paymentBankResponse != null && paymentBankResponse.header != null && paymentBankResponse.header.responseCode.equals("1200")) {
                cxu.this.g.b(1);
            } else {
                UnNavigateResponseActivity.a(cxu.this.a, paymentBankResponse.header.responseMessage, cxu.this.a.getString(R.string.please_try_again), true);
                ((Activity) cxu.this.a).finish();
            }
        }
    };

    public cxu(Context context, cxv cxvVar, dju djuVar) {
        this.a = context;
        this.b = cxvVar;
        this.g = djuVar;
    }

    public final void a(int i, String str) throws JSONException {
        this.b.a(true);
        final djl a = djl.a(this.a);
        au.b<JSONObject> bVar = this.h;
        au.a aVar = this.c;
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(a.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(a.d.m()));
        PaymentBody paymentBody = new PaymentBody();
        paymentBody.sourceMobileNumber = a.d.m();
        paymentBody.targetMobileNumber = str;
        paymentBody.amount = i;
        paymentBody.redirectionURL = "https://my.te.eg/";
        PaymentRequest paymentRequest = new PaymentRequest();
        paymentRequest.setHeader(mainRequestsHeader);
        paymentRequest.setBody(paymentBody);
        bj bjVar = new bj("https://api-my.te.eg/api/payment/pay/unregisteredcard/initiate", new JSONObject(a.a.a(paymentRequest)), bVar, aVar) { // from class: djl.7
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
    }
}
