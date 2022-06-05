package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.SignInModel.SignInResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ddg  reason: default package */
/* loaded from: classes2.dex */
public final class ddg {
    Context a;
    ddh b;
    String c;
    String d;
    au.b<JSONObject> f = new au.b<JSONObject>() { // from class: ddg.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ddg.this.b.b(false);
            SignInResponse signInResponse = (SignInResponse) new Gson().a(jSONObject.toString(), (Class<Object>) SignInResponse.class);
            if (signInResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                if (ddg.this.d.equalsIgnoreCase("FACEBOOK")) {
                    ddg.this.e.q(ddg.this.c);
                } else if (ddg.this.d.equalsIgnoreCase("GOOGLE")) {
                    ddg.this.e.s(ddg.this.c);
                } else if (ddg.this.d.equalsIgnoreCase("HUAWEI")) {
                    ddg.this.e.r(ddg.this.c);
                }
                ddg.this.b.a(signInResponse);
                return;
            }
            UnNavigateResponseActivity.a(ddg.this.a, signInResponse.getHeader().getResponseMessage(), ddg.this.a.getString(R.string.please_try_again), true);
            ddg.this.b.a();
        }
    };
    au.a g = new au.a() { // from class: ddg.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ddg.this.b.b(false);
            UnNavigateResponseActivity.a(ddg.this.a, ddg.this.a.getString(R.string.something_went_wrong), ddg.this.a.getString(R.string.please_try_again), true);
        }
    };
    @Inject
    djw e = new djw();

    public ddg(Context context, ddh ddhVar) {
        this.a = context;
        this.b = ddhVar;
    }

    public final void a(String str, String str2) {
        try {
            this.c = str;
            this.d = str2;
            this.b.b(true);
            djl.a(this.a).e(str, str2, this.f, this.g);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
