package defpackage;

import android.app.Activity;
import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.MigrateModel.MigrateOffers;
import com.ucare.we.model.VoucherPaymentModel.VoucherResponse;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dap  reason: default package */
/* loaded from: classes2.dex */
public final class dap {
    Context a;
    daq b;
    au.b<JSONObject> c = new au.b<JSONObject>() { // from class: dap.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dap.this.b.b(false);
            VoucherResponse voucherResponse = (VoucherResponse) new Gson().a(jSONObject.toString(), (Class<Object>) VoucherResponse.class);
            if (voucherResponse != null && voucherResponse.header != null && voucherResponse.header.responseCode.equals("0")) {
                ResponseActivity.a(dap.this.a, dap.this.a.getString(R.string.successfully), voucherResponse.header.responseMessage, false);
                ((Activity) dap.this.a).finish();
            } else if (voucherResponse != null && voucherResponse.header != null && (voucherResponse.header.responseCode.equals("8001") || voucherResponse.header.responseCode.equals("9001"))) {
                UnNavigateResponseActivity.b(dap.this.a, voucherResponse.header.responseMessage, dap.this.a.getString(R.string.please_try_again), true);
                ((Activity) dap.this.a).finish();
            } else {
                UnNavigateResponseActivity.a(dap.this.a, voucherResponse.header.responseMessage, dap.this.a.getString(R.string.please_try_again), true);
                ((Activity) dap.this.a).finish();
            }
        }
    };
    au.a d = new au.a() { // from class: dap.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dap.this.b.b(false);
            String message = volleyError.getMessage();
            StringBuilder sb = new StringBuilder();
            sb.append(message);
            sb.append(volleyError.a.a);
            UnNavigateResponseActivity.a(dap.this.a, dap.this.a.getString(R.string.something_went_wrong), dap.this.a.getString(R.string.please_try_again), true);
            ((Activity) dap.this.a).finish();
        }
    };

    public dap(Context context, daq daqVar) {
        this.a = context;
        this.b = daqVar;
    }

    public final void a(MigrateOffers migrateOffers) throws JSONException {
        djl.a(this.a).a(migrateOffers, this.c, this.d);
    }
}
