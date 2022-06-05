package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.PostPaidBalanceResponse;
import defpackage.au;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cya  reason: default package */
/* loaded from: classes2.dex */
public final class cya {
    cyb a;
    dju b;
    private Context c;
    private au.b<JSONObject> d = new au.b<JSONObject>() { // from class: cya.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            PostPaidBalanceResponse postPaidBalanceResponse = (PostPaidBalanceResponse) new Gson().a(jSONObject.toString(), (Class<Object>) PostPaidBalanceResponse.class);
            if (postPaidBalanceResponse == null || postPaidBalanceResponse.header == null) {
                return;
            }
            if (postPaidBalanceResponse.header.responseCode.equals("0")) {
                cya.this.a.a(postPaidBalanceResponse);
            } else if (!postPaidBalanceResponse.header.responseCode.equals("1200")) {
            } else {
                cya.this.b.b(1);
            }
        }
    };
    private au.a e = new au.a() { // from class: cya.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }
    };

    public cya(Context context, cyb cybVar, dju djuVar) {
        this.c = context;
        this.a = cybVar;
        this.b = djuVar;
    }

    public final void a() throws JSONException {
        djl.a(this.c).d(this.d, this.e);
    }
}
