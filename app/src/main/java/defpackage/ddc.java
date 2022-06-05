package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.DefaultResponse;
import defpackage.au;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ddc  reason: default package */
/* loaded from: classes2.dex */
public final class ddc {
    public Context a;
    public ddd b;
    public au.b<JSONObject> c = new au.b<JSONObject>() { // from class: ddc.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ddc.this.b.showProgress(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if ((defaultResponse.getHeader() != null && defaultResponse.getHeader().getResponseCode() != null && defaultResponse.getHeader().getResponseCode().equals("0")) || defaultResponse.getHeader() == null || defaultResponse.getHeader().getResponseCode() == null) {
                return;
            }
            defaultResponse.getHeader().getResponseCode().equals("1200");
        }
    };
    public au.a d = new au.a() { // from class: ddc.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ddc.this.b.showProgress(false);
        }
    };
    private dju e;

    public ddc(Context context, ddd dddVar, dju djuVar) {
        this.a = context;
        this.b = dddVar;
        this.e = djuVar;
    }

    public final void a(String str) {
        try {
            this.b.showProgress(true);
            djl.a(this.a).n(str.trim(), this.c, this.d);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
