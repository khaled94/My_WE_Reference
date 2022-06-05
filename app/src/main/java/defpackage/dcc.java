package defpackage;

import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.MainRequestsHeader;
import com.ucare.we.model.OpenInvoicesResponse;
import com.ucare.we.model.PostPaidBalanceResponse;
import com.ucare.we.model.VoucherPaymentModel.VoucherPaymentRequest;
import com.ucare.we.model.VoucherPaymentModel.VoucherPaymetRequestBody;
import com.ucare.we.model.VoucherPaymentModel.VoucherResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import defpackage.djl;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dcc  reason: default package */
/* loaded from: classes2.dex */
public final class dcc {
    Context a;
    dcd b;
    dju c;
    private au.b<JSONObject> d = new au.b<JSONObject>() { // from class: dcc.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            VoucherResponse voucherResponse = (VoucherResponse) new Gson().a(jSONObject.toString(), (Class<Object>) VoucherResponse.class);
            if (voucherResponse != null && voucherResponse.header.responseCode.equals("0")) {
                dcc.this.b.a(voucherResponse.header.responseMessage);
            } else if (voucherResponse != null && voucherResponse.header.responseCode.equals("1200")) {
                dcc.this.c.b(3);
            } else {
                dcc.this.b.b(voucherResponse.header.responseMessage);
            }
        }
    };
    private au.a e = new au.a() { // from class: dcc.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dcc.this.b.b(volleyError.getMessage());
        }
    };
    private au.b<JSONObject> f = new au.b<JSONObject>() { // from class: dcc.3
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            OpenInvoicesResponse openInvoicesResponse = (OpenInvoicesResponse) new Gson().a(jSONObject.toString(), (Class<Object>) OpenInvoicesResponse.class);
            if (openInvoicesResponse != null && openInvoicesResponse.header != null && openInvoicesResponse.header.responseCode.equals("0")) {
                if (openInvoicesResponse.body == null) {
                    return;
                }
                dcc.this.b.a(openInvoicesResponse.body);
            } else if (openInvoicesResponse != null && openInvoicesResponse.header.responseCode.equals("1200")) {
                dcc.this.c.b(1);
            } else {
                UnNavigateResponseActivity.a(dcc.this.a, openInvoicesResponse.header.responseMessage, dcc.this.a.getString(R.string.error), true);
            }
        }
    };
    private au.a g = new au.a() { // from class: dcc.4
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }
    };
    private au.b<JSONObject> h = new au.b<JSONObject>() { // from class: dcc.5
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            PostPaidBalanceResponse postPaidBalanceResponse = (PostPaidBalanceResponse) new Gson().a(jSONObject.toString(), (Class<Object>) PostPaidBalanceResponse.class);
            if (postPaidBalanceResponse == null || postPaidBalanceResponse.header == null) {
                return;
            }
            if (postPaidBalanceResponse.header.responseCode.equals("0")) {
                dcc.this.b.a(postPaidBalanceResponse);
            } else if (!postPaidBalanceResponse.header.responseCode.equals("1200")) {
            } else {
                dcc.this.c.b(2);
            }
        }
    };
    private au.a i = new au.a() { // from class: dcc.6
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            UnNavigateResponseActivity.a(dcc.this.a, dcc.this.a.getString(R.string.something_went_wrong), dcc.this.a.getString(R.string.please_try_again), true);
        }
    };

    public dcc(Context context, dcd dcdVar, dju djuVar) {
        this.a = context;
        this.b = dcdVar;
        this.c = djuVar;
    }

    public final void a() throws JSONException {
        djl.a(this.a).g(this.f, this.g);
    }

    public final void a(String str, String str2) throws JSONException {
        final djl a = djl.a(this.a);
        au.b<JSONObject> bVar = this.d;
        au.a aVar = this.e;
        MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
        mainRequestsHeader.setLocale(a.c.c.k());
        mainRequestsHeader.setMsisdn(Integer.parseInt(a.d.m()));
        VoucherPaymetRequestBody voucherPaymetRequestBody = new VoucherPaymetRequestBody();
        voucherPaymetRequestBody.sourceMobileNumber = a.d.m();
        voucherPaymetRequestBody.targetMobileNumber = str2;
        voucherPaymetRequestBody.voucherNumber = str;
        VoucherPaymentRequest voucherPaymentRequest = new VoucherPaymentRequest();
        voucherPaymentRequest.setHeader(mainRequestsHeader);
        voucherPaymentRequest.setBody(voucherPaymetRequestBody);
        bj bjVar = new bj("https://api-my.te.eg/api/payment/pay/voucher", new JSONObject(a.a.a(voucherPaymentRequest)), bVar, aVar) { // from class: djl.9
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

    public final void b() throws JSONException {
        djl.a(this.a).d(this.h, this.i);
    }
}
