package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.TicketStatus.GetTicketStatusResponse;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import defpackage.au;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dgw  reason: default package */
/* loaded from: classes2.dex */
public final class dgw {
    Context a;
    dgx b;
    dju c;
    private final int d = 1;
    private au.b<JSONObject> e = new au.b<JSONObject>() { // from class: dgw.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            GetTicketStatusResponse getTicketStatusResponse = (GetTicketStatusResponse) new Gson().a(jSONObject.toString(), (Class<Object>) GetTicketStatusResponse.class);
            if (getTicketStatusResponse != null && getTicketStatusResponse.header != null && getTicketStatusResponse.header.responseCode.equals("0")) {
                dgw.this.b.a(getTicketStatusResponse.body);
            } else if (getTicketStatusResponse != null && getTicketStatusResponse.header != null && getTicketStatusResponse.header.responseCode.equals("1200")) {
                dgw.this.c.b(1);
            } else {
                ResponseActivity.a(dgw.this.a, dgw.this.a.getString(R.string.error), getTicketStatusResponse.header.responseMessage, true);
            }
        }
    };
    private au.a f = new au.a() { // from class: dgw.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ResponseActivity.a(dgw.this.a, dgw.this.a.getString(R.string.error), volleyError.getMessage(), true);
        }
    };

    public dgw(Context context, dgx dgxVar, dju djuVar) {
        this.a = context;
        this.b = dgxVar;
        this.c = djuVar;
    }

    public final void a(String str) {
        try {
            djl.a(this.a).c(str, this.e, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
