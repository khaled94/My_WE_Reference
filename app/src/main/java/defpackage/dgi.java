package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardFinalizeResponse;
import com.ucare.we.model.DefaultRequest;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import org.json.JSONObject;

/* renamed from: dgi  reason: default package */
/* loaded from: classes2.dex */
public final class dgi {
    Context a;
    dgj b;
    au.b<JSONObject> c = new au.b<JSONObject>() { // from class: dgi.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgi.this.b.a(false);
            AutoPaymentAddCreditCardFinalizeResponse autoPaymentAddCreditCardFinalizeResponse = (AutoPaymentAddCreditCardFinalizeResponse) new Gson().a(jSONObject.toString(), (Class<Object>) AutoPaymentAddCreditCardFinalizeResponse.class);
            if (autoPaymentAddCreditCardFinalizeResponse.getHeader() != null && autoPaymentAddCreditCardFinalizeResponse.getHeader().getResponseCode() != null && autoPaymentAddCreditCardFinalizeResponse.getHeader().getResponseCode().equals("0")) {
                UnNavigateResponseActivity.a(dgi.this.a, dgi.this.a.getString(R.string.successful), autoPaymentAddCreditCardFinalizeResponse.getHeader().getResponseMessage(), false);
                dgi.this.b.a();
                return;
            }
            dgi.this.b.a();
            UnNavigateResponseActivity.a(dgi.this.a, autoPaymentAddCreditCardFinalizeResponse.getHeader().getResponseMessage(), dgi.this.a.getString(R.string.please_try_again), true);
        }
    };
    au.a d = new au.a() { // from class: dgi.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgi.this.b.a(false);
            dgi.this.b.a();
            UnNavigateResponseActivity.a(dgi.this.a, dgi.this.a.getString(R.string.check_network_connection), dgi.this.a.getString(R.string.please_try_again), true);
        }
    };
    private au.b<JSONObject> e = new au.b<JSONObject>() { // from class: dgi.3
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgi.this.b.a(false);
            DefaultRequest defaultRequest = (DefaultRequest) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultRequest.class);
            if (defaultRequest.getHeader() == null || defaultRequest.getHeader().getResponseCode() == null || !defaultRequest.getHeader().getResponseCode().equals("0")) {
                return;
            }
            UnNavigateResponseActivity.a(dgi.this.a, dgi.this.a.getString(R.string.successful), defaultRequest.getHeader().getResponseMessage(), false);
            dgi.this.b.a();
        }
    };
    private au.a f = new au.a() { // from class: dgi.4
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgi.this.b.a(false);
            dgi.this.b.a();
            UnNavigateResponseActivity.a(dgi.this.a, dgi.this.a.getString(R.string.check_network_connection), dgi.this.a.getString(R.string.please_try_again), true);
        }
    };

    public dgi(Context context, dgj dgjVar) {
        this.a = context;
        this.b = dgjVar;
    }
}
