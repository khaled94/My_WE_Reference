package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.ConfirmationCode.ConfirmationCodeResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ddp  reason: default package */
/* loaded from: classes2.dex */
public final class ddp {
    int a;
    Context b;
    ddq c;
    dju d;
    private au.b<JSONObject> e = new au.b<JSONObject>() { // from class: ddp.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ConfirmationCodeResponse confirmationCodeResponse = (ConfirmationCodeResponse) new Gson().a(jSONObject.toString(), (Class<Object>) ConfirmationCodeResponse.class);
            if (confirmationCodeResponse.getHeader().getResponseCode().equals("0")) {
                ddp.this.c.a(confirmationCodeResponse.getSendConfirmationResponseBody().getMaskedMsisdn());
            } else if (confirmationCodeResponse.getHeader().getResponseCode().equals("1200")) {
                ddp.this.d.b(1);
            } else {
                UnNavigateResponseActivity.a(ddp.this.b, confirmationCodeResponse.getHeader().getResponseMessage(), ddp.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a f = new au.a() { // from class: ddp.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }
    };

    public ddp(Context context, ddq ddqVar, dju djuVar) {
        this.b = context;
        this.c = ddqVar;
        this.d = djuVar;
    }

    public final void a(int i) {
        try {
            this.a = i;
            djl.a(this.b).a(this.a, this.e, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
