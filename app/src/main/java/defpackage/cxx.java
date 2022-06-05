package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.BillLimitModel.ResponseViewBillLimit;
import com.ucare.we.model.BillLimitModel.ResponseViewBillLimitCopy;
import com.ucare.we.model.BillLimitModel.SetBillLimitResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cxx  reason: default package */
/* loaded from: classes2.dex */
public final class cxx {
    Context b;
    cxy c;
    dju d;
    String a = "";
    private au.b<JSONObject> e = new au.b<JSONObject>() { // from class: cxx.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            SetBillLimitResponse setBillLimitResponse = (SetBillLimitResponse) new Gson().a(jSONObject.toString(), (Class<Object>) SetBillLimitResponse.class);
            if (setBillLimitResponse.getHeader().getResponseCode().equals("0")) {
                cxx.this.c.a(Integer.valueOf(cxx.this.a).intValue());
                if (setBillLimitResponse.body == null) {
                }
            } else if (setBillLimitResponse.getHeader().getResponseCode().equals("1200")) {
                cxx.this.d.b(1);
            } else {
                UnNavigateResponseActivity.a(cxx.this.b, setBillLimitResponse.getHeader().getResponseMessage(), cxx.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a f = new au.a() { // from class: cxx.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cxx.this.c.b();
            cxx.this.c.c();
        }
    };
    private au.b<JSONObject> g = new au.b<JSONObject>() { // from class: cxx.3
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            SetBillLimitResponse setBillLimitResponse = (SetBillLimitResponse) new Gson().a(jSONObject.toString(), (Class<Object>) SetBillLimitResponse.class);
            if (setBillLimitResponse.getHeader().getResponseCode().equals("0")) {
                cxx.this.c.c();
            } else if (setBillLimitResponse.getHeader().getResponseCode().equals("1200")) {
                cxx.this.d.b(2);
            } else {
                UnNavigateResponseActivity.a(cxx.this.b, setBillLimitResponse.getHeader().getResponseMessage(), cxx.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a h = new au.a() { // from class: cxx.4
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cxx.this.c.b();
        }
    };
    private au.b<JSONObject> i = new au.b<JSONObject>() { // from class: cxx.5
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ResponseViewBillLimitCopy responseViewBillLimitCopy = (ResponseViewBillLimitCopy) new Gson().a(jSONObject.toString(), (Class<Object>) ResponseViewBillLimitCopy.class);
            try {
                if (responseViewBillLimitCopy.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                    cxx.this.c.c(Integer.valueOf(cxx.this.a).intValue());
                } else if (responseViewBillLimitCopy.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
                    cxx.this.d.b(3);
                } else {
                    UnNavigateResponseActivity.a(cxx.this.b, responseViewBillLimitCopy.getHeader().getResponseMessage(), cxx.this.b.getString(R.string.please_try_again), true);
                }
            } catch (Exception unused) {
            }
        }
    };
    private au.b<String> j = new au.b<String>() { // from class: cxx.6
        @Override // defpackage.au.b
        public final /* bridge */ /* synthetic */ void onResponse(String str) {
        }
    };
    private au.a k = new au.a() { // from class: cxx.7
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cxx.this.c.b();
        }
    };
    private au.b<JSONObject> l = new au.b<JSONObject>() { // from class: cxx.8
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ResponseViewBillLimit responseViewBillLimit = (ResponseViewBillLimit) new Gson().a(jSONObject.toString(), (Class<Object>) ResponseViewBillLimit.class);
            try {
                if (responseViewBillLimit.getHeader().getResponseCode().equalsIgnoreCase("0") && !responseViewBillLimit.getBody().getConsumptionLimit().equals("0")) {
                    cxx.this.c.a(Integer.parseInt(responseViewBillLimit.getBody().getConsumptionLimit()));
                } else if (!responseViewBillLimit.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
                } else {
                    cxx.this.d.b(4);
                }
            } catch (Exception unused) {
            }
        }
    };
    private au.a m = new au.a() { // from class: cxx.9
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            cxx.this.c.b();
        }
    };

    public cxx(Context context, cxy cxyVar, dju djuVar) {
        this.b = context;
        this.c = cxyVar;
        this.d = djuVar;
    }

    public final void a(int i) {
        c(String.valueOf(i));
    }

    public final void a() {
        b("0");
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public final void a(String str) {
        try {
            this.a = str;
            djl.a(this.b).e(str, this.e, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void b(String str) {
        try {
            djl.a(this.b).g(str, this.g, this.h);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void c(String str) {
        try {
            this.a = str;
            djl.a(this.b).h(str, this.i, this.k);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void b() {
        try {
            djl.a(this.b).m(this.l, this.m);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
