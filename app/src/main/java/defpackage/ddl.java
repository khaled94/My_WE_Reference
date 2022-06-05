package defpackage;

import android.content.Context;
import android.content.Intent;
import androidx.fragment.app.Fragment;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.R;
import com.ucare.we.model.DefaultResponse;
import com.ucare.we.model.RefreshLoginResponse;
import com.ucare.we.paybillpostpaidvoucher.UnNavigateResponseActivity;
import defpackage.au;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ddl  reason: default package */
/* loaded from: classes2.dex */
public final class ddl {
    Context c;
    ddm d;
    String e;
    String f;
    Fragment g;
    au.b<JSONObject> h = new au.b<JSONObject>() { // from class: ddl.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            ddl.this.d.a(false);
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("0")) {
                Intent intent = new Intent(ddl.this.c, UnNavigateResponseActivity.class);
                intent.putExtra("success_msg", defaultResponse.getHeader().getResponseMessage());
                intent.putExtra("success_msg_details", ddl.this.c.getString(R.string.successful));
                intent.putExtra("isError", false);
                ddl.this.g.startActivityForResult(intent, ddl.this.d.b());
            } else if (defaultResponse.getHeader().getResponseCode().equalsIgnoreCase("1200")) {
            } else {
                UnNavigateResponseActivity.a(ddl.this.c, defaultResponse.getHeader().getResponseMessage(), ddl.this.c.getString(R.string.please_try_again), true);
            }
        }
    };
    au.a i = new au.a() { // from class: ddl.2
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            ddl.this.d.a(false);
            UnNavigateResponseActivity.a(ddl.this.c, ddl.this.c.getString(R.string.something_went_wrong), ddl.this.c.getString(R.string.please_try_again), true);
        }
    };
    private au.b<JSONObject> j = new au.b<JSONObject>() { // from class: ddl.3
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            try {
                RefreshLoginResponse refreshLoginResponse = (RefreshLoginResponse) new Gson().a(jSONObject.toString(), (Class<Object>) RefreshLoginResponse.class);
                ddl.this.b.r = refreshLoginResponse.body.jwt;
                djv.b("jwt", refreshLoginResponse.body.jwt);
                ddl.this.a.u(refreshLoginResponse.body.jwt);
                if (ddl.this.e.equalsIgnoreCase("FACEBOOK")) {
                    ddl ddlVar = ddl.this;
                    String str = ddl.this.f;
                    try {
                        ddlVar.d.a(true);
                        djl.a(ddlVar.c).a(str, "FACEBOOK", true, ddlVar.h, ddlVar.i);
                        return;
                    } catch (JSONException e) {
                        e.printStackTrace();
                        return;
                    }
                } else if (ddl.this.e.equalsIgnoreCase("GOOGLE")) {
                    ddl ddlVar2 = ddl.this;
                    String str2 = ddl.this.f;
                    try {
                        ddlVar2.d.a(true);
                        djl.a(ddlVar2.c).a(str2, "GOOGLE", true, ddlVar2.h, ddlVar2.i);
                        return;
                    } catch (JSONException e2) {
                        e2.printStackTrace();
                        return;
                    }
                } else if (!ddl.this.e.equalsIgnoreCase("HUAWEI")) {
                    return;
                } else {
                    ddl ddlVar3 = ddl.this;
                    String str3 = ddl.this.f;
                    try {
                        ddlVar3.d.a(true);
                        djl.a(ddlVar3.c).a(str3, "HUAWEI", true, ddlVar3.h, ddlVar3.i);
                        return;
                    } catch (JSONException e3) {
                        e3.printStackTrace();
                        return;
                    }
                }
            } catch (Exception e4) {
                e4.getMessage();
                ddl ddlVar4 = ddl.this;
                ddlVar4.a(ddlVar4.e, ddl.this.f);
            }
            e4.getMessage();
            ddl ddlVar42 = ddl.this;
            ddlVar42.a(ddlVar42.e, ddl.this.f);
        }
    };
    private au.a k = new au.a() { // from class: ddl.4
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            new Gson();
            UnNavigateResponseActivity.a(ddl.this.c, "Couldn't link social account", ddl.this.c.getString(R.string.please_try_again), true);
        }
    };
    @Inject
    dio b = new dio();
    @Inject
    djw a = new djw();

    public ddl(Context context, ddm ddmVar) {
        this.c = context;
        this.d = ddmVar;
        this.g = ddmVar.a();
    }

    public final void a(String str, String str2) {
        try {
            this.e = str;
            this.f = str2;
            djl.a(this.c).a(this.j, this.k);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
