package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.BillSummaryModel.ResponseBillSummary;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cye  reason: default package */
/* loaded from: classes2.dex */
public final class cye {
    Context a;
    cyf b;
    dju c;
    private au.b<JSONObject> d = new au.b<JSONObject>() { // from class: cye.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            cye.this.b.a(false);
            ResponseBillSummary responseBillSummary = (ResponseBillSummary) new Gson().a(jSONObject.toString(), (Class<Object>) ResponseBillSummary.class);
            if (responseBillSummary.getHeader() != null && responseBillSummary.getHeader().getResponseCode().equals("0")) {
                cye.this.b.a(responseBillSummary.getBody());
            } else if (responseBillSummary.getHeader() != null && responseBillSummary.getHeader().getResponseCode().equals("1200")) {
                cye.this.c.b(1);
            } else {
                UnNavigateResponseActivity.a(cye.this.a, cye.this.a.getString(R.string.error), responseBillSummary.getHeader().getResponseMessage(), true);
            }
        }
    };
    private au.a e = new au.a() { // from class: cye.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cye.this.b.a(false);
            UnNavigateResponseActivity.a(cye.this.a, cye.this.a.getString(R.string.error), volleyError.getMessage(), true);
        }
    };

    public cye(Context context, cyf cyfVar, dju djuVar) {
        this.a = context;
        this.b = cyfVar;
        this.c = djuVar;
    }

    public final void a() throws JSONException {
        this.b.a(true);
        djl.a(this.a).h(this.d, this.e);
    }
}
