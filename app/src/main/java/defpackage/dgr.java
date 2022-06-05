package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.AutoPaymentModel.AutoPaymentAddCreditCardInitializeResponse;
import com.ucare.we.model.AutoRechargeModel.GetAutoRechargeDefaultValuesRequest;
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

/* renamed from: dgr  reason: default package */
/* loaded from: classes2.dex */
public final class dgr {
    private String B;
    private String C;
    Context a;
    dgs b;
    String c;
    String d;
    String e;
    dju f;
    @Inject
    djw g;
    private au.b<JSONObject> D = new au.b<JSONObject>() { // from class: dgr.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            UpdateMailResponse updateMailResponse = (UpdateMailResponse) new Gson().a(jSONObject.toString(), (Class<Object>) UpdateMailResponse.class);
            if (updateMailResponse.header != null && updateMailResponse.header.responseCode != null && updateMailResponse.header.responseCode.equals("0")) {
                UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.successfully), updateMailResponse.header.responseMessage, false);
                dgr.this.b.a(dgr.this.c);
                dgr.this.b.b();
            } else if (updateMailResponse.header != null && updateMailResponse.header.responseCode != null && updateMailResponse.header.responseCode.equals("1200")) {
                dgr.this.f.b(1);
            } else {
                if (!TextUtils.isEmpty(dgr.this.d)) {
                    dgr.this.b.a(dgr.this.d);
                }
                UnNavigateResponseActivity.a(dgr.this.a, updateMailResponse.header.responseMessage, dgr.this.a.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a E = new au.a() { // from class: dgr.12
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.a(false);
            if (!TextUtils.isEmpty(dgr.this.d)) {
                dgr.this.b.a(dgr.this.d);
            }
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.check_network_connection), dgr.this.a.getString(R.string.please_try_again), true);
        }
    };
    private au.a F = new au.a() { // from class: dgr.23
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.c(dgr.this.a.getString(R.string.payment_status_failure_message));
        }
    };
    private au.a G = new au.a() { // from class: dgr.29
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }
    };
    private au.b<JSONObject> H = new au.b<JSONObject>() { // from class: dgr.30
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            CheckAutoPayStatusResponse checkAutoPayStatusResponse = (CheckAutoPayStatusResponse) new Gson().a(jSONObject.toString(), (Class<Object>) CheckAutoPayStatusResponse.class);
            if (checkAutoPayStatusResponse != null && checkAutoPayStatusResponse.header != null && checkAutoPayStatusResponse.header.responseCode.equalsIgnoreCase("0")) {
                dgr.this.b.b(checkAutoPayStatusResponse);
            } else if (checkAutoPayStatusResponse.header.responseCode.equalsIgnoreCase("1200")) {
                dgr.this.f.b(9);
            } else {
                dgr.this.b.c(checkAutoPayStatusResponse.header.responseMessage);
            }
        }
    };
    private au.b<JSONObject> I = new au.b<JSONObject>() { // from class: dgr.31
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            CheckAutoPayStatusResponse checkAutoPayStatusResponse = (CheckAutoPayStatusResponse) new Gson().a(jSONObject.toString(), (Class<Object>) CheckAutoPayStatusResponse.class);
            if (checkAutoPayStatusResponse != null && checkAutoPayStatusResponse.header != null && checkAutoPayStatusResponse.header.responseCode == "0") {
                dgr.this.b.a(checkAutoPayStatusResponse);
            } else {
                dgr.this.b.a((CheckAutoPayStatusResponse) null);
            }
        }
    };
    private au.b<JSONObject> J = new au.b<JSONObject>() { // from class: dgr.32
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.header == null || defaultResponse.header.getResponseCode() == null || !defaultResponse.header.getResponseCode().equals("0")) {
                UnNavigateResponseActivity.a(dgr.this.a, defaultResponse.header.getResponseMessage(), dgr.this.a.getString(R.string.please_try_again), true);
                return;
            }
            try {
                djl.a(dgr.this.a).q(dgr.this.h, dgr.this.i);
            } catch (JSONException e) {
                e.printStackTrace();
            }
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.successfully), defaultResponse.header.getResponseMessage(), false);
        }
    };
    private au.a K = new au.a() { // from class: dgr.33
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.a(false);
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.check_network_connection), dgr.this.a.getString(R.string.please_try_again), true);
        }
    };
    au.b<JSONObject> h = new au.b<JSONObject>() { // from class: dgr.34
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            new Gson().a(jSONObject.toString(), DefaultResponse.class);
        }
    };
    au.a i = new au.a() { // from class: dgr.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.something_went_wrong), dgr.this.a.getString(R.string.please_try_again), true);
        }
    };
    private au.b<JSONObject> L = new au.b<JSONObject>() { // from class: dgr.3
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            GetCreditCardInfoResponse getCreditCardInfoResponse = (GetCreditCardInfoResponse) new Gson().a(jSONObject.toString(), (Class<Object>) GetCreditCardInfoResponse.class);
            if (getCreditCardInfoResponse != null && getCreditCardInfoResponse.getHeader() != null && getCreditCardInfoResponse.getHeader().responseCode.equals("0")) {
                if (getCreditCardInfoResponse.getBody() == null) {
                    return;
                }
                dgr.this.b.a(getCreditCardInfoResponse.getBody().getMaskedCardNumber(), getCreditCardInfoResponse.getBody().getCardType());
            } else if (getCreditCardInfoResponse != null && getCreditCardInfoResponse.getHeader() != null && getCreditCardInfoResponse.getHeader().responseCode.equals("1200")) {
                dgr.this.f.b(2);
            } else {
                UnNavigateResponseActivity.a(dgr.this.a, getCreditCardInfoResponse.getHeader().responseMessage, dgr.this.a.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a M = new au.a() { // from class: dgr.4
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.error), dgr.this.a.getString(R.string.generic_error), true);
        }
    };
    private au.b<JSONObject> N = new au.b<JSONObject>() { // from class: dgr.5
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse = (AutoPaymentAddCreditCardInitializeResponse) new Gson().a(jSONObject.toString(), (Class<Object>) AutoPaymentAddCreditCardInitializeResponse.class);
            if (autoPaymentAddCreditCardInitializeResponse.getHeader() != null && autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseCode() != null && autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseCode().equals("0")) {
                dgr.this.b.b(autoPaymentAddCreditCardInitializeResponse);
            } else {
                UnNavigateResponseActivity.a(dgr.this.a, autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseMessage(), dgr.this.a.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a O = new au.a() { // from class: dgr.6
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.a(false);
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.check_network_connection), dgr.this.a.getString(R.string.please_try_again), true);
        }
    };
    private au.b<JSONObject> P = new au.b<JSONObject>() { // from class: dgr.7
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            AutoPaymentAddCreditCardInitializeResponse autoPaymentAddCreditCardInitializeResponse = (AutoPaymentAddCreditCardInitializeResponse) new Gson().a(jSONObject.toString(), (Class<Object>) AutoPaymentAddCreditCardInitializeResponse.class);
            if (autoPaymentAddCreditCardInitializeResponse.getHeader() != null && autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseCode() != null && autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseCode().equals("0")) {
                dgr.this.b.a(autoPaymentAddCreditCardInitializeResponse);
            } else {
                UnNavigateResponseActivity.a(dgr.this.a, autoPaymentAddCreditCardInitializeResponse.getHeader().getResponseMessage(), dgr.this.a.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a Q = new au.a() { // from class: dgr.8
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.a(false);
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.check_network_connection), dgr.this.a.getString(R.string.please_try_again), true);
        }
    };
    au.b<JSONObject> j = new au.b<JSONObject>() { // from class: dgr.9
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            dgr.this.b.d();
            new Gson();
        }
    };
    au.a k = new au.a() { // from class: dgr.10
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.a(false);
        }
    };
    au.b<JSONObject> l = new au.b<JSONObject>() { // from class: dgr.11
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            GetAutoRechargeDefaultValuesRequest getAutoRechargeDefaultValuesRequest = (GetAutoRechargeDefaultValuesRequest) new Gson().a(jSONObject.toString(), (Class<Object>) GetAutoRechargeDefaultValuesRequest.class);
            if (getAutoRechargeDefaultValuesRequest.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                dgr.this.b.a(getAutoRechargeDefaultValuesRequest.getBody().getDay(), getAutoRechargeDefaultValuesRequest.getBody().getAmount());
            } else if (!getAutoRechargeDefaultValuesRequest.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
            } else {
                dgr.this.f.b(8);
            }
        }
    };
    au.a m = new au.a() { // from class: dgr.13
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.a(false);
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.something_went_wrong), dgr.this.a.getString(R.string.please_try_again), true);
        }
    };
    au.b<JSONObject> n = new au.b<JSONObject>() { // from class: dgr.14
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader() == null || defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                return;
            }
            if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
                dgr.this.f.b(9);
            } else {
                UnNavigateResponseActivity.a(dgr.this.a, defaultResponse.header.getResponseMessage(), dgr.this.a.getString(R.string.try_again), true);
            }
        }
    };
    au.a o = new au.a() { // from class: dgr.15
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.a(false);
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.something_went_wrong), dgr.this.a.getString(R.string.please_try_again), true);
        }
    };
    au.b<JSONObject> p = new au.b<JSONObject>() { // from class: dgr.16
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader() != null) {
                if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                    UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.successful), defaultResponse.header.getResponseMessage(), false);
                    dgr.this.a();
                } else if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
                    dgr.this.f.b(10);
                } else {
                    UnNavigateResponseActivity.a(dgr.this.a, defaultResponse.header.getResponseMessage(), dgr.this.a.getString(R.string.try_again), true);
                }
            }
        }
    };
    au.a q = new au.a() { // from class: dgr.17
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.a(false);
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.something_went_wrong), dgr.this.a.getString(R.string.please_try_again), true);
        }
    };
    au.b<JSONObject> r = new au.b<JSONObject>() { // from class: dgr.18
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.successful), defaultResponse.getHeader().getResponseMessage(), false);
                dgr.this.j();
            } else if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
            } else {
                UnNavigateResponseActivity.a(dgr.this.a, defaultResponse.getHeader().getResponseMessage(), dgr.this.a.getString(R.string.please_try_again), true);
            }
        }
    };
    au.a s = new au.a() { // from class: dgr.19
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.a(false);
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.something_went_wrong), dgr.this.a.getString(R.string.please_try_again), true);
        }
    };
    au.b<JSONObject> t = new au.b<JSONObject>() { // from class: dgr.20
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.successful), defaultResponse.getHeader().getResponseMessage(), false);
                dgr.this.j();
            } else if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
            } else {
                UnNavigateResponseActivity.a(dgr.this.a, defaultResponse.getHeader().getResponseMessage(), dgr.this.a.getString(R.string.please_try_again), true);
            }
        }
    };
    au.a u = new au.a() { // from class: dgr.21
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.a(false);
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.something_went_wrong), dgr.this.a.getString(R.string.please_try_again), true);
        }
    };
    au.b<JSONObject> v = new au.b<JSONObject>() { // from class: dgr.22
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            SocialMediaStatusResponse socialMediaStatusResponse = (SocialMediaStatusResponse) new Gson().a(jSONObject.toString(), (Class<Object>) SocialMediaStatusResponse.class);
            if (socialMediaStatusResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                dgr.this.b.a(socialMediaStatusResponse);
            } else if (socialMediaStatusResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
                dgr.this.f.b(4);
            } else {
                UnNavigateResponseActivity.a(dgr.this.a, socialMediaStatusResponse.getHeader().getResponseMessage(), dgr.this.a.getString(R.string.please_try_again), true);
                dgr.this.b.e();
            }
        }
    };
    au.a w = new au.a() { // from class: dgr.24
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.a(false);
            dgr.this.b.e();
        }
    };
    au.b<JSONObject> x = new au.b<JSONObject>() { // from class: dgr.25
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.successful), defaultResponse.getHeader().getResponseMessage(), false);
                dgr.this.b.b("");
                dgr.this.b.b();
            } else if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
                dgr.this.f.b(7);
            } else {
                if (!TextUtils.isEmpty(dgr.this.e)) {
                    dgr.this.b.b(dgr.this.e);
                }
                UnNavigateResponseActivity.a(dgr.this.a, defaultResponse.getHeader().getResponseMessage(), dgr.this.a.getString(R.string.please_try_again), true);
            }
        }
    };
    au.a y = new au.a() { // from class: dgr.26
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.a(false);
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.something_went_wrong), dgr.this.a.getString(R.string.please_try_again), true);
            if (!TextUtils.isEmpty(dgr.this.e)) {
                dgr.this.b.b(dgr.this.e);
            }
        }
    };
    au.b<JSONObject> z = new au.b<JSONObject>() { // from class: dgr.27
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dgr.this.b.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.successful), defaultResponse.getHeader().getResponseMessage(), false);
                dgr.this.b.b("");
                dgr.this.b.b();
            } else if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
                dgr.this.f.b(6);
            } else {
                if (!TextUtils.isEmpty(dgr.this.e)) {
                    dgr.this.b.b(dgr.this.e);
                }
                UnNavigateResponseActivity.a(dgr.this.a, defaultResponse.getHeader().getResponseMessage(), dgr.this.a.getString(R.string.please_try_again), true);
            }
        }
    };
    au.a A = new au.a() { // from class: dgr.28
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dgr.this.b.a(false);
            UnNavigateResponseActivity.a(dgr.this.a, dgr.this.a.getString(R.string.something_went_wrong), dgr.this.a.getString(R.string.please_try_again), true);
            if (!TextUtils.isEmpty(dgr.this.e)) {
                dgr.this.b.b(dgr.this.e);
            }
        }
    };

    public dgr(Context context, dgs dgsVar, dju djuVar) {
        this.a = context;
        this.b = dgsVar;
        this.f = djuVar;
    }

    public final void a(String str, String str2) {
        try {
            this.b.a(true);
            this.c = str;
            this.d = str2;
            djl.a(this.a).i(str, this.D, this.E);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a() {
        try {
            djl.a(this.a).n(this.H, this.F);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void b() {
        try {
            djl.a(this.a).o(this.I, this.G);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(String str) {
        this.C = str;
        try {
            djl.a(this.a).k(this.C, this.L, this.M);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void c() {
        try {
            this.b.a(true);
            djl.a(this.a).s(this.N, this.O);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void d() {
        try {
            this.b.a(true);
            djl.a(this.a).k(this.j, this.k);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void e() {
        try {
            this.b.a(true);
            djl.a(this.a).t(this.l, this.m);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(int i, int i2) {
        try {
            this.b.a(true);
            djl.a(this.a).b(i, i2, this.n, this.o);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void f() {
        try {
            this.b.a(true);
            djl.a(this.a).x(this.p, this.q);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void g() {
        try {
            this.b.a(true);
            djl.a(this.a).l("GOOGLE", this.r, this.s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void h() {
        try {
            this.b.a(true);
            djl.a(this.a).l("HUAWEI", this.t, this.u);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void i() {
        try {
            this.b.a(true);
            djl.a(this.a).l("FACEBOOK", this.r, this.s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void b(String str) {
        try {
            this.b.a(true);
            djl.a(this.a).a(str, "GOOGLE", false, this.r, this.s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void c(String str) {
        try {
            this.b.a(true);
            djl.a(this.a).a(str, "FACEBOOK", false, this.r, this.s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void j() {
        this.b.a(true);
        try {
            djl.a(this.a).v(this.v, this.w);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void d(String str) {
        try {
            this.b.a(true);
            djl.a(this.a).m(str, this.r, this.s);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void e(String str) {
        try {
            this.b.a(true);
            djl.a(this.a).f(str, "", this.x, this.y);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void b(String str, String str2) {
        this.B = str;
        this.e = str2;
        try {
            this.b.a(true);
            djl.a(this.a).f("", str, this.z, this.A);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
