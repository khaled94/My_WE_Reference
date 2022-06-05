package defpackage;

import android.app.Activity;
import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.DefaultResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dgt  reason: default package */
/* loaded from: classes2.dex */
public final class dgt {
    public Context a;
    dju b;
    public au.b<JSONObject> c = new au.b<JSONObject>() { // from class: dgt.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader() != null && defaultResponse.getHeader().getResponseCode() != null && defaultResponse.getHeader().getResponseCode().equals("0")) {
                UnNavigateResponseActivity.a(dgt.this.a, dgt.this.a.getString(R.string.successful), defaultResponse.getHeader().getResponseMessage(), false);
                ((Activity) dgt.this.a).finish();
            } else if (defaultResponse.getHeader() != null && defaultResponse.getHeader().getResponseCode() != null && defaultResponse.getHeader().getResponseCode().equals("1200")) {
                dgt.this.b.b(1);
            } else {
                ((Activity) dgt.this.a).finish();
                UnNavigateResponseActivity.a(dgt.this.a, defaultResponse.getHeader().getResponseMessage(), dgt.this.a.getString(R.string.please_try_again), true);
            }
        }
    };
    public au.a d = new au.a() { // from class: dgt.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ((Activity) dgt.this.a).finish();
            UnNavigateResponseActivity.a(dgt.this.a, dgt.this.a.getString(R.string.check_network_connection), dgt.this.a.getString(R.string.please_try_again), true);
        }
    };
    private dgu e;

    public dgt(Context context, dgu dguVar, dju djuVar) {
        this.a = context;
        this.e = dguVar;
        this.b = djuVar;
    }

    public final void a() {
        try {
            djl.a(this.a).w(this.c, this.d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
