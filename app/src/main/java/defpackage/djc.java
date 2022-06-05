package defpackage;

import android.content.Context;
import android.text.TextUtils;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.RefreshLoginResponse;
import defpackage.au;
import javax.inject.Inject;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: djc  reason: default package */
/* loaded from: classes2.dex */
public final class djc extends czz {
    @Inject
    dio a;
    @Inject
    djw b;
    int c;
    dju d;
    private Context f;
    private final String e = "api/user/login";
    private au.a g = new au.a() { // from class: djc.1
        @Override // defpackage.au.a
        public final void onErrorResponse(VolleyError volleyError) {
            new Gson();
        }
    };
    private au.b<JSONObject> h = new au.b<JSONObject>() { // from class: djc.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            try {
                RefreshLoginResponse refreshLoginResponse = (RefreshLoginResponse) new Gson().a(jSONObject2.toString(), (Class<Object>) RefreshLoginResponse.class);
                djc.this.a.r = refreshLoginResponse.body.jwt;
                if (djc.this.b.m().equalsIgnoreCase(djc.this.b.B())) {
                    djv.b("jwt", refreshLoginResponse.body.jwt);
                }
                djc.this.b.u(refreshLoginResponse.body.jwt);
                djc.this.d.a(jSONObject2.toString(), djc.this.c);
            } catch (Exception unused) {
                djc.this.a();
            }
        }
    };

    public djc(Context context, dju djuVar, int i) {
        this.f = context;
        this.d = djuVar;
        this.c = i;
        a();
    }

    final void a() {
        try {
            if (!TextUtils.isEmpty(this.b.G())) {
                djl.a(this.f).e(this.b.G(), "GOOGLE", this.h, this.g);
            } else if (!TextUtils.isEmpty(this.b.E())) {
                djl.a(this.f).e(this.b.E(), "FACEBOOK", this.h, this.g);
            } else if (!TextUtils.isEmpty(this.b.F())) {
                djl.a(this.f).e(this.b.F(), "HUAWEI", this.h, this.g);
            } else {
                djl.a(this.f).a(this.h, this.g);
            }
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }
}
