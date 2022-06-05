package defpackage;

import android.content.Context;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.RefreshLoginResponse;
import com.ucare.we.model.StatusModel.StatusResponse;
import com.ucare.we.model.StatusModel.StatusResponseBody;
import com.ucare.we.model.SwitchAccountModel.FinalizeNumberResponse;
import com.ucare.we.model.SwitchAccountModel.RequestNumberAccessResponse;
import com.ucare.we.model.SwitchAccountModel.SwitchAccountResponse;
import com.ucare.we.paybillpostpaidvoucher.ResponseActivity;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: dhf  reason: default package */
/* loaded from: classes2.dex */
public final class dhf extends czz {
    @Inject
    djw a;
    @Inject
    dhp b;
    @Inject
    dio c;
    String d;
    Context e;
    dhg f;
    dju g;
    private au.b<JSONObject> j = new au.b<JSONObject>() { // from class: dhf.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            Gson gson = new Gson();
            dhf.this.f.a(false);
            SwitchAccountResponse switchAccountResponse = (SwitchAccountResponse) gson.a(jSONObject.toString(), (Class<Object>) SwitchAccountResponse.class);
            if (switchAccountResponse != null && switchAccountResponse.header != null && switchAccountResponse.header.responseCode.equals("0")) {
                dhf.this.f.a(switchAccountResponse.body.managedLines, switchAccountResponse.body.unManagedLines);
            } else if (switchAccountResponse == null || switchAccountResponse.header == null || !switchAccountResponse.header.responseCode.equals("1200")) {
            } else {
                dhf.this.g.b(1);
            }
        }
    };
    private au.a k = new au.a() { // from class: dhf.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
        }
    };
    private au.b<JSONObject> l = new au.b<JSONObject>() { // from class: dhf.3
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dhf.this.f.a(false);
            RequestNumberAccessResponse requestNumberAccessResponse = (RequestNumberAccessResponse) new Gson().a(jSONObject.toString(), (Class<Object>) RequestNumberAccessResponse.class);
            if (requestNumberAccessResponse != null && requestNumberAccessResponse.header != null && requestNumberAccessResponse.header.responseCode.equals("0")) {
                dhf.this.f.a(requestNumberAccessResponse.body.getMaskedMsisdn());
            } else if (requestNumberAccessResponse != null && requestNumberAccessResponse.header != null && requestNumberAccessResponse.header.responseCode.equals("1200")) {
                dhf.this.g.b(2);
            } else {
                UnNavigateResponseActivity.a(dhf.this.e, requestNumberAccessResponse.header.responseMessage, dhf.this.e.getString(R.string.please_try_again), true);
            }
        }
    };
    private au.a m = new au.a() { // from class: dhf.4
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dhf.this.f.a(false);
        }
    };
    au.b<JSONObject> h = new au.b<JSONObject>() { // from class: dhf.5
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            dhf.this.f.a(false);
            Gson gson = new Gson();
            gson.a(jSONObject2);
            RefreshLoginResponse refreshLoginResponse = (RefreshLoginResponse) gson.a(jSONObject2.toString(), (Class<Object>) RefreshLoginResponse.class);
            if (refreshLoginResponse != null && refreshLoginResponse.header != null && refreshLoginResponse.header.responseCode.equals("0")) {
                dhf.this.a.w("");
                dhf.this.a.r(false);
                dhf.this.a.m();
                dhf.this.a.o(false);
                dhf.this.a.x("");
                dhf.this.a.p(false);
                dhf.this.a.A("");
                dhf.this.a.y("");
                dhf.this.a.z("");
                dhf.this.a.p("");
                dhf.this.a.n(true);
                dhf.this.d = refreshLoginResponse.body.jwt;
                dhf.this.a.u(dhf.this.d);
                dhf.this.a.w(refreshLoginResponse.body.getGroupFmc().getId());
                dhf.this.a.r(refreshLoginResponse.body.getUserProperties().getRegistered().booleanValue());
                dhf.this.a.o(refreshLoginResponse.body.getGroupFmc().isSubscribed());
                dhf.this.a.x(new Gson().a(refreshLoginResponse.body.getGroupFamily()));
                dhf.this.a.p(refreshLoginResponse.body.isIptv());
                StatusResponse statusResponse = new StatusResponse();
                statusResponse.header = refreshLoginResponse.header;
                statusResponse.body = new StatusResponseBody();
                statusResponse.body.type = refreshLoginResponse.body.type;
                statusResponse.body.role = refreshLoginResponse.body.role;
                statusResponse.body.customerName = refreshLoginResponse.body.getCustomerName();
                dhf.this.f.a(statusResponse);
                dhf.this.b.a();
                return;
            }
            UnNavigateResponseActivity.a(dhf.this.e, refreshLoginResponse.header.responseMessage, dhf.this.e.getString(R.string.please_try_again), true);
        }
    };
    au.a i = new au.a() { // from class: dhf.6
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dhf.this.f.a(false);
            new Gson();
        }
    };
    private au.b<JSONObject> n = new au.b<JSONObject>() { // from class: dhf.7
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            dhf.this.f.a(false);
            Gson gson = new Gson();
            FinalizeNumberResponse finalizeNumberResponse = (FinalizeNumberResponse) gson.a(jSONObject.toString(), (Class<Object>) FinalizeNumberResponse.class);
            gson.a(finalizeNumberResponse);
            if (finalizeNumberResponse != null && finalizeNumberResponse.header != null && finalizeNumberResponse.header.responseCode.equals("0")) {
                ResponseActivity.a(dhf.this.e, dhf.this.e.getString(R.string.successfully), finalizeNumberResponse.header.responseMessage, false);
                if (finalizeNumberResponse.body != null && finalizeNumberResponse.body.jwt.equals("")) {
                    return;
                }
                return;
            }
            ResponseActivity.a(dhf.this.e, dhf.this.e.getString(R.string.error), finalizeNumberResponse.header.responseMessage, true);
        }
    };
    private au.a o = new au.a() { // from class: dhf.8
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            dhf.this.f.a(false);
            ResponseActivity.a(dhf.this.e, dhf.this.e.getString(R.string.error), dhf.this.e.getString(R.string.generic_error), true);
        }
    };

    public dhf(Context context, dhg dhgVar, dju djuVar) {
        this.e = context;
        this.f = dhgVar;
        this.g = djuVar;
    }

    public final void a() {
        try {
            djl.a(this.e).l(this.j, this.k);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(String str) {
        try {
            this.f.a(true);
            djl.a(this.e).d(str, this.l, this.m);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
