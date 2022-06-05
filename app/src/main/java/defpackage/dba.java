package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.MoreBundleModel.Offer;
import com.ucare.we.model.MoreBundleModel.ResponseRetrieveMoreBundle;
import com.ucare.we.model.MoreBundleModel.ResponseUnsubscribeFromMoreBundle;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import java.util.ArrayList;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dba  reason: default package */
/* loaded from: classes2.dex */
public final class dba implements dcm {
    dcl a;
    Context c;
    dbb d;
    dju e;
    private au.b<JSONObject> g = new au.b<JSONObject>() { // from class: dba.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ResponseUnsubscribeFromMoreBundle responseUnsubscribeFromMoreBundle = (ResponseUnsubscribeFromMoreBundle) new Gson().a(jSONObject.toString(), (Class<Object>) ResponseUnsubscribeFromMoreBundle.class);
            if (responseUnsubscribeFromMoreBundle.getHeader().getResponseCode().equals("0")) {
                UnNavigateResponseActivity.a(dba.this.c, dba.this.c.getString(R.string.successfully), responseUnsubscribeFromMoreBundle.getHeader().getResponseMessage(), false);
            } else if (responseUnsubscribeFromMoreBundle.getHeader().getResponseCode().equals("1200")) {
                dba.this.e.b(2);
            } else {
                UnNavigateResponseActivity.a(dba.this.c, responseUnsubscribeFromMoreBundle.getHeader().getResponseMessage(), dba.this.c.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a h = new au.a() { // from class: dba.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            UnNavigateResponseActivity.a(dba.this.c, dba.this.c.getString(R.string.check_network_connection), dba.this.c.getString(R.string.please_try_again), true);
        }
    };
    private au.b<JSONObject> i = new au.b<JSONObject>() { // from class: dba.3
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ResponseRetrieveMoreBundle responseRetrieveMoreBundle = (ResponseRetrieveMoreBundle) new Gson().a(jSONObject.toString(), (Class<Object>) ResponseRetrieveMoreBundle.class);
            boolean z = responseRetrieveMoreBundle.getBody() != null && responseRetrieveMoreBundle.getBody().getAvailableAddOnOfferingsList().size() > 0;
            if (responseRetrieveMoreBundle.getHeader().getResponseCode().equals("0")) {
                dba.this.d.a(responseRetrieveMoreBundle, Boolean.valueOf(z));
            } else if (responseRetrieveMoreBundle.getHeader().getResponseCode().equals("1200")) {
                dba.this.d.a(false);
                dba.this.e.b(1);
            } else {
                dba.this.d.a(false);
                dba.this.d.a((ResponseRetrieveMoreBundle) null, Boolean.valueOf(z));
            }
        }
    };
    private au.a j = new au.a() { // from class: dba.4
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dba.this.d.a(false);
        }
    };
    @Inject
    dhu b = new dhu();
    private String f = "";

    public dba(dcl dclVar, dbb dbbVar, dju djuVar) {
        this.a = dclVar;
        this.c = dclVar.a();
        this.d = dbbVar;
        this.e = djuVar;
    }

    public final void a(ArrayList<Offer> arrayList, String str) {
        this.f = str;
        try {
            djl.a(this.c).a(arrayList, this.g, this.h);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(boolean z) {
        try {
            djl.a(this.c).b(z, this.i, this.j);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    @Override // defpackage.dcm
    public final void b(boolean z) {
        this.a.b(z);
    }

    @Override // defpackage.dcm
    public final void a() {
        this.a.b();
    }
}
