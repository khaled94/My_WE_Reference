package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.DefaultResponse;
import com.ucare.we.model.SocialMediaModel.SocialMediaStatusResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: czl  reason: default package */
/* loaded from: classes2.dex */
public final class czl {
    Context a;
    czm b;
    au.a c = new au.a() { // from class: czl.1
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            czl.this.b.b(false);
        }
    };
    au.b<JSONObject> d = new au.b<JSONObject>() { // from class: czl.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            czl.this.b.b(false);
            SocialMediaStatusResponse socialMediaStatusResponse = (SocialMediaStatusResponse) new Gson().a(jSONObject.toString(), (Class<Object>) SocialMediaStatusResponse.class);
            if (socialMediaStatusResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                czl.this.b.a(socialMediaStatusResponse);
            } else if (socialMediaStatusResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
            } else {
                UnNavigateResponseActivity.a(czl.this.a, socialMediaStatusResponse.getHeader().getResponseMessage(), czl.this.a.getString(R.string.please_try_again), true);
            }
        }
    };
    au.a e = new au.a() { // from class: czl.3
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            czl.this.b.b(false);
        }
    };
    au.b<JSONObject> f = new au.b<JSONObject>() { // from class: czl.4
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            czl.this.b.b(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                UnNavigateResponseActivity.a(czl.this.a, czl.this.a.getString(R.string.successful), defaultResponse.getHeader().getResponseMessage(), false);
                czl.this.a();
            } else if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
            } else {
                UnNavigateResponseActivity.a(czl.this.a, defaultResponse.getHeader().getResponseMessage(), czl.this.a.getString(R.string.please_try_again), true);
            }
        }
    };

    public czl(Context context, czm czmVar) {
        this.a = context;
        this.b = czmVar;
    }

    public final void a() {
        this.b.b(true);
        try {
            djl.a(this.a).v(this.d, this.e);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(String str) {
        try {
            this.b.b(true);
            djl.a(this.a).m(str, this.f, this.c);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
