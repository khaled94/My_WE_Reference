package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.PostPaidBalanceResponse;
import defpackage.au;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dbx  reason: default package */
/* loaded from: classes2.dex */
public final class dbx {
    dby a;
    dju b;
    private Context c;
    private au.b<JSONObject> d = new au.b<JSONObject>() { // from class: dbx.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            PostPaidBalanceResponse postPaidBalanceResponse = (PostPaidBalanceResponse) new Gson().a(jSONObject.toString(), (Class<Object>) PostPaidBalanceResponse.class);
            if (postPaidBalanceResponse == null || postPaidBalanceResponse.header == null) {
                return;
            }
            if (postPaidBalanceResponse.header.responseCode.equals("0")) {
                dbx.this.a.a(postPaidBalanceResponse);
            } else if (!postPaidBalanceResponse.header.responseCode.equals("1200")) {
            } else {
                dbx.this.b.b(1);
            }
        }
    };
    private au.a e = new au.a() { // from class: dbx.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }
    };

    public dbx(Context context, dby dbyVar, dju djuVar) {
        this.c = context;
        this.a = dbyVar;
        this.b = djuVar;
    }

    public final void a() throws JSONException {
        djl.a(this.c).d(this.d, this.e);
    }
}
