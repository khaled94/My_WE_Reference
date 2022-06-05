package defpackage;

import android.content.Context;
import android.widget.Toast;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.MoreBundleModel.ResponseRetrieveMoreBundle;
import defpackage.au;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dbe  reason: default package */
/* loaded from: classes2.dex */
public final class dbe {
    dju a;
    Context b;
    dbf c;
    ResponseRetrieveMoreBundle d;
    private au.b<JSONObject> e = new au.b<JSONObject>() { // from class: dbe.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dbe.this.c.a(false);
            Gson gson = new Gson();
            dbe.this.d = (ResponseRetrieveMoreBundle) gson.a(jSONObject.toString(), (Class<Object>) ResponseRetrieveMoreBundle.class);
            if (dbe.this.d.getHeader().getResponseCode().equals("0")) {
                dbe.this.c.a(dbe.this.d);
            } else if (dbe.this.d.getHeader().getResponseCode().equals("1200")) {
                dbe.this.a.b(1);
            } else {
                Toast.makeText(dbe.this.b, dbe.this.d.getHeader().getResponseMessage(), 0).show();
            }
        }
    };
    private au.a f = new au.a() { // from class: dbe.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dbe.this.c.a(false);
        }
    };

    public dbe(Context context, dbf dbfVar, dju djuVar) {
        this.b = context;
        this.c = dbfVar;
        this.a = djuVar;
    }

    public final void a(boolean z) {
        try {
            djl.a(this.b).b(z, this.e, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
