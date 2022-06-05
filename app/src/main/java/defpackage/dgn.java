package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardInitializeResponse;
import com.ucare.we.model.CheckAutoPayStatusResponse;
import com.ucare.we.model.DefaultResponse;
import com.ucare.we.model.GetCreditCardInfoFinalize.GetCreditCardInfoResponse;
import com.ucare.we.model.SocialMediaModel.SocialMediaStatusResponse;
import com.ucare.we.model.UpdateMailResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dgn  reason: default package */
/* loaded from: classes2.dex */
public final class dgn {
    @Inject
    djw a;
    Context b;
    dgo c;
    String i;
    String j;
    String k;
    dju n;
    private String v;
    private String w;
    au.b<JSONObject> d = new au.b<JSONObject>() { // from class: dgn.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgn.this.c.a(false);
            dgn.this.c.e();
            new Gson();
        }
    };
    au.a e = new au.a() { // from class: dgn.12
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgn.this.c.a(false);
        }
    };
    au.a f = new au.a() { // from class: dgn.22
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgn.this.c.a(false);
            UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.something_went_wrong), dgn.this.b.getString(R.string.please_try_again), true);
        }
    };
    au.a g = new au.a() { // from class: dgn.23
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgn.this.c.a(false);
            UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.something_went_wrong), dgn.this.b.getString(R.string.please_try_again), true);
        }
    };
    au.a h = new au.a() { // from class: dgn.24
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgn.this.c.a(false);
            dgn.this.c.f();
        }
    };
    au.a l = new au.a() { // from class: dgn.25
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgn.this.c.a(false);
            UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.something_went_wrong), dgn.this.b.getString(R.string.please_try_again), true);
            if (!TextUtils.isEmpty(dgn.this.k)) {
                dgn.this.c.c();
            }
        }
    };
    au.a m = new au.a() { // from class: dgn.26
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgn.this.c.a(false);
            UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.something_went_wrong), dgn.this.b.getString(R.string.please_try_again), true);
            if (!TextUtils.isEmpty(dgn.this.k)) {
                dgn.this.c.c();
            }
        }
    };
    au.b<JSONObject> o = new au.b<JSONObject>() { // from class: dgn.27
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgn.this.c.a(false);
            SocialMediaStatusResponse socialMediaStatusResponse = (SocialMediaStatusResponse) new Gson().a(jSONObject.toString(), (Class<Object>) SocialMediaStatusResponse.class);
            if (socialMediaStatusResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                dgn.this.c.a(socialMediaStatusResponse);
            } else if (socialMediaStatusResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
                dgn.this.n.b(4);
            } else {
                UnNavigateResponseActivity.a(dgn.this.b, socialMediaStatusResponse.getHeader().getResponseMessage(), dgn.this.b.getString(R.string.please_try_again), true);
                dgn.this.c.f();
            }
        }
    };
    au.b<JSONObject> p = new au.b<JSONObject>() { // from class: dgn.28
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgn.this.c.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.successful), defaultResponse.getHeader().getResponseMessage(), false);
                dgn.this.h();
            } else if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
                dgn.this.n.b(5);
            } else {
                UnNavigateResponseActivity.a(dgn.this.b, defaultResponse.getHeader().getResponseMessage(), dgn.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    au.b<JSONObject> q = new au.b<JSONObject>() { // from class: dgn.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgn.this.c.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.successful), defaultResponse.getHeader().getResponseMessage(), false);
                dgn.this.h();
            } else if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
            } else {
                UnNavigateResponseActivity.a(dgn.this.b, defaultResponse.getHeader().getResponseMessage(), dgn.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    au.b<JSONObject> r = new au.b<JSONObject>() { // from class: dgn.3
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgn.this.c.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.successful), defaultResponse.getHeader().getResponseMessage(), false);
                dgn.this.c.c();
                dgn.this.c.b();
            } else if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
                dgn.this.n.b(7);
            } else {
                if (!TextUtils.isEmpty(dgn.this.k)) {
                    dgn.this.c.c();
                }
                UnNavigateResponseActivity.a(dgn.this.b, defaultResponse.getHeader().getResponseMessage(), dgn.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    au.b<JSONObject> s = new au.b<JSONObject>() { // from class: dgn.4
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgn.this.c.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.successful), defaultResponse.getHeader().getResponseMessage(), false);
                dgn.this.c.c();
                dgn.this.c.b();
            } else if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
                dgn.this.n.b(6);
            } else {
                if (!TextUtils.isEmpty(dgn.this.k)) {
                    dgn.this.c.c();
                }
                UnNavigateResponseActivity.a(dgn.this.b, defaultResponse.getHeader().getResponseMessage(), dgn.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.b<JSONObject> x = new au.b<JSONObject>() { // from class: dgn.5
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgn.this.c.a(false);
            UpdateMailResponse updateMailResponse = (UpdateMailResponse) new Gson().a(jSONObject.toString(), (Class<Object>) UpdateMailResponse.class);
            if (updateMailResponse.header != null && updateMailResponse.header.responseCode != null && updateMailResponse.header.responseCode.equals("0")) {
                UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.successful), updateMailResponse.header.responseMessage, false);
                dgn.this.c.a(dgn.this.i);
                dgn.this.c.b();
            } else if (updateMailResponse.header != null && updateMailResponse.header.responseCode != null && updateMailResponse.header.responseCode.equals("1200")) {
                dgn.this.n.b(1);
            } else {
                if (!TextUtils.isEmpty(dgn.this.j)) {
                    dgn.this.c.a(dgn.this.j);
                }
                UnNavigateResponseActivity.a(dgn.this.b, updateMailResponse.header.responseMessage, dgn.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a y = new au.a() { // from class: dgn.6
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgn.this.c.a(false);
            if (!TextUtils.isEmpty(dgn.this.j)) {
                dgn.this.c.a(dgn.this.j);
            }
            UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.check_network_connection), dgn.this.b.getString(R.string.please_try_again), true);
        }
    };
    private au.a z = new au.a() { // from class: dgn.7
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgn.this.c.b(dgn.this.b.getString(R.string.payment_status_failure_message));
        }
    };
    private au.a A = new au.a() { // from class: dgn.8
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }
    };
    private au.b<JSONObject> B = new au.b<JSONObject>() { // from class: dgn.9
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgn.this.c.a(false);
            CheckAutoPayStatusResponse checkAutoPayStatusResponse = (CheckAutoPayStatusResponse) new Gson().a(jSONObject.toString(), (Class<Object>) CheckAutoPayStatusResponse.class);
            if (checkAutoPayStatusResponse != null && checkAutoPayStatusResponse.header != null && checkAutoPayStatusResponse.header.responseCode.equalsIgnoreCase("0")) {
                dgn.this.c.b(checkAutoPayStatusResponse);
            } else if (checkAutoPayStatusResponse.header.responseCode.equalsIgnoreCase("1200")) {
                dgn.this.n.b(9);
            } else {
                dgn.this.c.b(checkAutoPayStatusResponse.header.responseMessage);
            }
        }
    };
    private au.b<JSONObject> C = new au.b<JSONObject>() { // from class: dgn.10
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgn.this.c.a(false);
            CheckAutoPayStatusResponse checkAutoPayStatusResponse = (CheckAutoPayStatusResponse) new Gson().a(jSONObject.toString(), (Class<Object>) CheckAutoPayStatusResponse.class);
            if (checkAutoPayStatusResponse != null && checkAutoPayStatusResponse.header != null && checkAutoPayStatusResponse.header.responseCode == "0") {
                dgn.this.c.a(checkAutoPayStatusResponse);
            } else {
                dgn.this.c.a((CheckAutoPayStatusResponse) null);
            }
        }
    };
    private au.a D = new au.a() { // from class: dgn.11
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgn.this.c.a(false);
            UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.check_network_connection), dgn.this.b.getString(R.string.please_try_again), true);
        }
    };
    au.b<JSONObject> t = new au.b<JSONObject>() { // from class: dgn.13
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgn.this.c.a(false);
            new Gson().a(jSONObject.toString(), DefaultResponse.class);
        }
    };
    au.a u = new au.a() { // from class: dgn.14
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.something_went_wrong), dgn.this.b.getString(R.string.please_try_again), true);
        }
    };
    private au.b<JSONObject> E = new au.b<JSONObject>() { // from class: dgn.15
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgn.this.c.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.header == null || defaultResponse.header.getResponseCode() == null || !defaultResponse.header.getResponseCode().equals("0")) {
                UnNavigateResponseActivity.a(dgn.this.b, defaultResponse.header.getResponseMessage(), dgn.this.b.getString(R.string.please_try_again), true);
                return;
            }
            try {
                djl.a(dgn.this.b).q(dgn.this.t, dgn.this.u);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.successfully), defaultResponse.header.getResponseMessage(), false);
        }
    };
    private au.b<JSONObject> F = new au.b<JSONObject>() { // from class: dgn.16
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            GetCreditCardInfoResponse getCreditCardInfoResponse = (GetCreditCardInfoResponse) new Gson().a(jSONObject.toString(), (Class<Object>) GetCreditCardInfoResponse.class);
            if (getCreditCardInfoResponse != null && getCreditCardInfoResponse.getHeader() != null && getCreditCardInfoResponse.getHeader().responseCode.equals("0")) {
                dgn.this.c.a(getCreditCardInfoResponse.getBody().getMaskedCardNumber(), getCreditCardInfoResponse.getBody().getCardType());
            } else if (getCreditCardInfoResponse != null && getCreditCardInfoResponse.getHeader() != null && getCreditCardInfoResponse.getHeader().responseCode.equals("1200")) {
                dgn.this.n.b(2);
            } else {
                UnNavigateResponseActivity.a(dgn.this.b, getCreditCardInfoResponse.getHeader().responseMessage, dgn.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a G = new au.a() { // from class: dgn.17
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.error), dgn.this.b.getString(R.string.generic_error), true);
        }
    };
    private au.b<JSONObject> H = new au.b<JSONObject>() { // from class: dgn.18
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgn.this.c.a(false);
            AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse = (AutoPaymentAddCreditCardInitializeResponse) new Gson().a(jSONObject.toString(), (Class<Object>) AutoPaymentAddCreditCardInitializeResponse.class);
            if (autoPaymentAddCreditCardInitializeResponse.getHeader() != null && autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseCode() != null && autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseCode().equals("0")) {
                dgn.this.c.a(autoPaymentAddCreditCardInitializeResponse);
            } else {
                UnNavigateResponseActivity.a(dgn.this.b, autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseMessage(), dgn.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a I = new au.a() { // from class: dgn.19
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgn.this.c.a(false);
            UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.check_network_connection), dgn.this.b.getString(R.string.please_try_again), true);
        }
    };
    private au.b<JSONObject> J = new au.b<JSONObject>() { // from class: dgn.20
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgn.this.c.a(false);
            AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse = (AutoPaymentAddCreditCardInitializeResponse) new Gson().a(jSONObject.toString(), (Class<Object>) AutoPaymentAddCreditCardInitializeResponse.class);
            if (autoPaymentAddCreditCardInitializeResponse.getHeader() != null && autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseCode() != null && autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseCode().equals("0")) {
                dgn.this.c.b(autoPaymentAddCreditCardInitializeResponse);
            } else {
                UnNavigateResponseActivity.a(dgn.this.b, autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseMessage(), dgn.this.b.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a K = new au.a() { // from class: dgn.21
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgn.this.c.a(false);
            UnNavigateResponseActivity.a(dgn.this.b, dgn.this.b.getString(R.string.check_network_connection), dgn.this.b.getString(R.string.please_try_again), true);
        }
    };

    public dgn(Context context, dgo dgoVar, dju djuVar) {
        this.b = context;
        this.c = dgoVar;
        this.n = djuVar;
    }

    public final void a(String str, String str2) {
        try {
            this.c.a(true);
            this.i = str;
            this.j = str2;
            djl.a(this.b).i(str, this.x, this.y);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a() {
        try {
            djl.a(this.b).n(this.B, this.z);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void b() {
        try {
            djl.a(this.b).p(this.E, this.D);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(String str) {
        this.w = str;
        try {
            djl.a(this.b).k(this.w, this.F, this.G);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void c() {
        try {
            this.c.a(true);
            djl.a(this.b).r(this.H, this.I);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void d() {
        try {
            this.c.a(true);
            djl.a(this.b).k(this.d, this.e);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void e() {
        try {
            this.c.a(true);
            djl.a(this.b).l("GOOGLE", this.p, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void f() {
        try {
            this.c.a(true);
            djl.a(this.b).l("FACEBOOK", this.p, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void g() {
        try {
            this.c.a(true);
            djl.a(this.b).l("HUAWEI", this.p, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void b(String str) {
        try {
            this.c.a(true);
            djl.a(this.b).a(str, "GOOGLE", false, this.p, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void c(String str) {
        try {
            this.c.a(true);
            djl.a(this.b).a(str, "FACEBOOK", false, this.p, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void h() {
        this.c.a(true);
        try {
            djl.a(this.b).v(this.o, this.h);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void d(String str) {
        try {
            this.c.a(true);
            djl.a(this.b).m(str, this.p, this.f);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void e(String str) {
        try {
            this.c.a(true);
            djl.a(this.b).f(str, "", this.r, this.l);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void b(String str, String str2) {
        this.v = str;
        this.k = str2;
        try {
            this.c.a(true);
            djl.a(this.b).f("", str, this.s, this.m);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void i() {
        try {
            this.c.a(true);
            djl.a(this.b).s(this.J, this.K);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
