package defpackage;

import android.app.Activity;
import android.content.Context;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.AssociatedNumberResponseBody;
import com.ucare.we.model.BalanceTransferFinalizeRequestBody;
import com.ucare.we.model.BalanceTransferModel.BalanceTransferResponse;
import com.ucare.we.model.MainRequestsHeader;
import com.ucare.we.model.QuotaTransferModel.QuotaTransferFinalizeRequest;
import com.ucare.we.model.QuotaTransferModel.QuotaTransferOptionsRequest;
import com.ucare.we.model.QuotaTransferModel.QuotaTransferResponse;
import com.ucare.we.model.SwitchAccountModel.SwitchAccountResponse;
import com.ucare.we.model.TransferAmountBody;
import com.ucare.we.model.TransferAmountRequest;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import defpackage.djl;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cwm  reason: default package */
/* loaded from: classes2.dex */
public final class cwm {
    Context a;
    cwp b;
    dju g;
    au.a d = new au.a() { // from class: cwm.1
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cwm.this.b.a(false);
            UnNavigateResponseActivity.a(cwm.this.a, cwm.this.a.getString(R.string.check_network_connection), cwm.this.a.getString(R.string.please_try_again), true);
        }
    };
    au.a e = new au.a() { // from class: cwm.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cwm.this.b.a(false);
            UnNavigateResponseActivity.a(cwm.this.a, cwm.this.a.getString(R.string.check_network_connection), cwm.this.a.getString(R.string.please_try_again), true);
        }
    };
    au.a f = new au.a() { // from class: cwm.3
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cwm.this.b.a(false);
            UnNavigateResponseActivity.a(cwm.this.a, cwm.this.a.getString(R.string.check_network_connection), cwm.this.a.getString(R.string.please_try_again), true);
        }
    };
    au.b<JSONObject> h = new au.b<JSONObject>() { // from class: cwm.4
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cwm.this.b.a(false);
            BalanceTransferResponse balanceTransferResponse = (BalanceTransferResponse) new Gson().a(jSONObject.toString(), (Class<Object>) BalanceTransferResponse.class);
            if (balanceTransferResponse.header != null && balanceTransferResponse.header.responseCode != null && balanceTransferResponse.header.responseCode.equals("0")) {
                cwm.this.b.a(balanceTransferResponse.body.maskedMsisdn);
            } else if (balanceTransferResponse.header != null && balanceTransferResponse.header.responseCode != null && balanceTransferResponse.header.responseCode.equals("1200")) {
                cwm.this.g.b(2);
            } else {
                UnNavigateResponseActivity.a(cwm.this.a, balanceTransferResponse.header.responseMessage, cwm.this.a.getString(R.string.please_try_again), true);
            }
        }
    };
    au.b<JSONObject> i = new au.b<JSONObject>() { // from class: cwm.5
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cwm.this.b.a(false);
            QuotaTransferResponse quotaTransferResponse = (QuotaTransferResponse) new Gson().a(jSONObject.toString(), (Class<Object>) QuotaTransferResponse.class);
            if (quotaTransferResponse.header != null && quotaTransferResponse.header.getResponseCode() != null && quotaTransferResponse.header.getResponseCode().equals("0")) {
                ResponseActivity.a(cwm.this.a, cwm.this.a.getString(R.string.successful), quotaTransferResponse.getHeader().getResponseMessage(), false);
            } else if (quotaTransferResponse.header != null && quotaTransferResponse.header.getResponseCode() != null && quotaTransferResponse.header.getResponseCode().equals("1200")) {
                cwm.this.g.b(3);
            } else {
                UnNavigateResponseActivity.a(cwm.this.a, quotaTransferResponse.header.getResponseMessage(), cwm.this.a.getString(R.string.please_try_again), true);
            }
        }
    };
    au.b<JSONObject> j = new au.b<JSONObject>() { // from class: cwm.6
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cwm.this.b.a(false);
            QuotaTransferOptionsRequest quotaTransferOptionsRequest = (QuotaTransferOptionsRequest) new Gson().a(jSONObject.toString(), (Class<Object>) QuotaTransferOptionsRequest.class);
            if (quotaTransferOptionsRequest.header != null && quotaTransferOptionsRequest.header.getResponseCode() != null && quotaTransferOptionsRequest.header.getResponseCode().equals("0")) {
                cwm.this.b.b(quotaTransferOptionsRequest.getBody());
            } else if (quotaTransferOptionsRequest.header != null && quotaTransferOptionsRequest.header.getResponseCode() != null && quotaTransferOptionsRequest.header.getResponseCode().equals("1200")) {
                cwm.this.g.b(4);
            } else {
                UnNavigateResponseActivity.a(cwm.this.a, quotaTransferOptionsRequest.header.getResponseMessage(), cwm.this.a.getString(R.string.please_try_again), true);
                ((Activity) cwm.this.a).finish();
            }
        }
    };
    private au.b<JSONObject> k = new au.b<JSONObject>() { // from class: cwm.7
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            SwitchAccountResponse switchAccountResponse = (SwitchAccountResponse) new Gson().a(jSONObject.toString(), (Class<Object>) SwitchAccountResponse.class);
            if (switchAccountResponse != null && switchAccountResponse.header != null && switchAccountResponse.header.responseCode.equals("0")) {
                cwm.this.b.a(false);
                int i = 0;
                while (true) {
                    if (i >= switchAccountResponse.body.managedLines.size()) {
                        break;
                    } else if (switchAccountResponse.body.managedLines.get(i).mobileNumber.equals(cwm.this.c.m())) {
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
                ArrayList<AssociatedNumberResponseBody> arrayList2 = new ArrayList<>();
                for (int i4 = 0; i4 < arrayList.size(); i4++) {
                    AssociatedNumberResponseBody associatedNumberResponseBody = new AssociatedNumberResponseBody();
                    associatedNumberResponseBody.setMobileNumber((String) arrayList.get(i4));
                    arrayList2.add(associatedNumberResponseBody);
                }
                cwm.this.b.a(arrayList2);
            } else if (switchAccountResponse != null && switchAccountResponse.header != null && switchAccountResponse.header.responseCode.equals("1200")) {
                cwm.this.g.b(1);
            }
        }
    };
    private au.a l = new au.a() { // from class: cwm.8
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cwm.this.b.a(false);
        }
    };
    @Inject
    djw c = new djw();

    public cwm(Context context, cwp cwpVar, dju djuVar) {
        this.a = context;
        this.b = cwpVar;
        this.g = djuVar;
    }

    public final void a() {
        try {
            this.b.a(true);
            djl.a(this.a).l(this.k, this.l);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(String str, String str2) {
        try {
            this.b.a(true);
            final djl a = djl.a(this.a);
            au.b<JSONObject> bVar = this.h;
            au.a aVar = this.d;
            TransferAmountRequest transferAmountRequest = new TransferAmountRequest();
            MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
            mainRequestsHeader.setLocale(a.c.c.k());
            mainRequestsHeader.setMsisdn(Integer.parseInt(a.d.m()));
            transferAmountRequest.setHeader(mainRequestsHeader);
            TransferAmountBody transferAmountBody = new TransferAmountBody();
            transferAmountBody.setTargetMsisdn(str);
            transferAmountBody.setAmount(str2);
            transferAmountBody.setMeasureUnitId("1109");
            transferAmountRequest.setBody(transferAmountBody);
            bj bjVar = new bj("https://api-my.te.eg/api/line/freeunit/transfer/init", new JSONObject(a.a.a(transferAmountRequest)), bVar, aVar) { // from class: djl.67
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
    }

    public final void a(String str, String str2, String str3, String str4, String str5) {
        try {
            this.b.a(true);
            final djl a = djl.a(this.a);
            au.b<JSONObject> bVar = this.i;
            au.a aVar = this.e;
            QuotaTransferFinalizeRequest quotaTransferFinalizeRequest = new QuotaTransferFinalizeRequest();
            MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
            mainRequestsHeader.setLocale(a.c.c.k());
            mainRequestsHeader.setMsisdn(Integer.parseInt(a.d.m()));
            quotaTransferFinalizeRequest.setHeader(mainRequestsHeader);
            BalanceTransferFinalizeRequestBody balanceTransferFinalizeRequestBody = new BalanceTransferFinalizeRequestBody();
            balanceTransferFinalizeRequestBody.setConfirmationCode(str3);
            balanceTransferFinalizeRequestBody.setAmount(Integer.valueOf(str2).intValue());
            balanceTransferFinalizeRequestBody.setTargetMsisdn(str);
            balanceTransferFinalizeRequestBody.setFreeUnitId(str4);
            balanceTransferFinalizeRequestBody.setMeasureUnitId(str5);
            quotaTransferFinalizeRequest.setBody(balanceTransferFinalizeRequestBody);
            bj bjVar = new bj("https://api-my.te.eg/api/line/freeunit/transfer/finalize", new JSONObject(a.a.a(quotaTransferFinalizeRequest)), bVar, aVar) { // from class: djl.68
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
    }

    public final void b() {
        try {
            this.b.a(true);
            final djl a = djl.a(this.a);
            au.b<JSONObject> bVar = this.j;
            au.a aVar = this.f;
            TransferAmountRequest transferAmountRequest = new TransferAmountRequest();
            MainRequestsHeader mainRequestsHeader = new MainRequestsHeader();
            mainRequestsHeader.setLocale(a.c.c.k());
            mainRequestsHeader.setMsisdn(Integer.parseInt(a.d.m()));
            transferAmountRequest.setHeader(mainRequestsHeader);
            TransferAmountBody transferAmountBody = new TransferAmountBody();
            transferAmountBody.setMeasureUnitId("1109");
            transferAmountRequest.setBody(transferAmountBody);
            bj bjVar = new bj("https://api-my.te.eg/api/line/freeunit/transfer/options", new JSONObject(a.a.a(transferAmountRequest)), bVar, aVar) { // from class: djl.69
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
    }
}
