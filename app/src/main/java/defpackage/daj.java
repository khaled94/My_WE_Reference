package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.DefaultResponse;
import defpackage.au;
import org.json.JSONObject;

/* renamed from: daj  reason: default package */
/* loaded from: classes2.dex */
public final class daj {
    Context b;
    dak c;
    private dju d;
    private au.b<JSONObject> e = new au.b<JSONObject>() { // from class: daj.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            daj.this.c.showProgress(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader() != null && defaultResponse.getHeader().getResponseCode() != null && defaultResponse.getHeader().getResponseCode().equals("0")) {
                daj.this.a.a(daj.this.b);
            } else if (defaultResponse.getHeader() == null || defaultResponse.getHeader().getResponseCode() == null) {
            } else {
                defaultResponse.getHeader().getResponseCode().equals("1200");
            }
        }
    };
    private au.a f = new au.a() { // from class: daj.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            daj.this.c.showProgress(false);
        }
    };
    dio a = new dio();

    public daj(Context context, dak dakVar, dju djuVar) {
        this.b = context;
        this.c = dakVar;
        this.d = djuVar;
    }
}
