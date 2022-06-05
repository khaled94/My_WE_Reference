package defpackage;

import android.content.Context;
import android.os.Build;
import android.provider.Settings;
import android.text.TextUtils;
import com.android.volley.AuthFailureError;
import com.android.volley.VolleyError;
import com.google.gson.Gson;
import com.ucare.we.model.DefaultResponse;
import com.ucare.we.model.FirebaseNotificationModel.DeviceProperties;
import com.ucare.we.model.FirebaseNotificationModel.FirebaseNotificationRequest;
import com.ucare.we.model.FirebaseNotificationModel.FirebaseNotificationRequestBody;
import com.ucare.we.model.RequestHeader;
import defpackage.au;
import defpackage.djl;
import java.util.HashMap;
import java.util.Map;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cyx  reason: default package */
/* loaded from: classes2.dex */
public final class cyx {
    dju a;
    private Context c;
    private au.b<JSONObject> f = new au.b<JSONObject>() { // from class: cyx.1
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            DefaultResponse defaultResponse = (DefaultResponse) new Gson().a(jSONObject.toString(), (Class<Object>) DefaultResponse.class);
            if (defaultResponse.getHeader().getResponseCode().equals("0") || !defaultResponse.getHeader().getResponseCode().equals("1200")) {
                return;
            }
            cyx.this.a.b(101);
        }
    };
    private au.b<JSONObject> g = new au.b<JSONObject>() { // from class: cyx.2
        @Override // defpackage.au.b
        public final /* synthetic */ void onResponse(JSONObject jSONObject) {
            JSONObject jSONObject2 = jSONObject;
            Gson gson = new Gson();
            DefaultResponse defaultResponse = (DefaultResponse) gson.a(jSONObject2.toString(), (Class<Object>) DefaultResponse.class);
            gson.a(jSONObject2);
            if (!defaultResponse.getHeader().getResponseCode().equals("0") && defaultResponse.getHeader().getResponseCode().equals("1200")) {
                cyx.this.a.b(101);
            } else {
                cyx.this.b.b();
            }
        }
    };
    private au.a h = $$Lambda$cyx$yQkCcjDRitaQVzzvmBBZf0v7s9E.INSTANCE;
    private FirebaseNotificationRequestBody d = new FirebaseNotificationRequestBody();
    private DeviceProperties e = new DeviceProperties();
    dhy b = new dhy();

    /* JADX INFO: Access modifiers changed from: private */
    public static /* synthetic */ void a(VolleyError volleyError) {
    }

    public cyx(Context context, dju djuVar) {
        this.c = context;
        this.a = djuVar;
    }

    public final void a(String str, String str2) {
        try {
            this.d.setFireBaseToken(str);
            this.d.setAction(str2);
            a();
            if (str2.equalsIgnoreCase("add")) {
                b();
                d();
                c();
                this.d.setDeviceProperties(this.e);
            }
            djl.a(this.c).a(this.d, this.f, this.h);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    public final void a(final String str, String str2, String str3) {
        try {
            this.d.setFireBaseToken(str2);
            this.d.setAction(str3);
            a();
            if (str3.equalsIgnoreCase("add")) {
                b();
                d();
                c();
                this.d.setDeviceProperties(this.e);
            }
            new Gson().a(this.d);
            final djl a = djl.a(this.c);
            FirebaseNotificationRequestBody firebaseNotificationRequestBody = this.d;
            au.b<JSONObject> bVar = this.g;
            au.a aVar = this.h;
            if (TextUtils.isEmpty(firebaseNotificationRequestBody.getFireBaseToken())) {
                return;
            }
            RequestHeader requestHeader = new RequestHeader();
            requestHeader.setLocale(a.c.c.k());
            requestHeader.setMsisdn(a.d.m());
            FirebaseNotificationRequest firebaseNotificationRequest = new FirebaseNotificationRequest();
            firebaseNotificationRequest.setHeader(requestHeader);
            firebaseNotificationRequest.setBody(firebaseNotificationRequestBody);
            JSONObject jSONObject = new JSONObject(a.a.a(firebaseNotificationRequest));
            a.d.I();
            bj bjVar = new bj("https://api-my.te.eg/api/pushnotification/addorupdateordelete", jSONObject, bVar, aVar) { // from class: djl.59
                @Override // defpackage.as
                public final Map<String, String> c() throws AuthFailureError {
                    HashMap hashMap = new HashMap();
                    hashMap.put("Jwt", str);
                    return hashMap;
                }
            };
            bjVar.l = djl.a.MAIN_PLAN;
            bjVar.j = new am(60000, 0, 0.0f);
            a.b.a((as) bjVar);
        } catch (JSONException e) {
            e.printStackTrace();
        }
    }

    private void a() {
        String a = a(this.c);
        if (TextUtils.isEmpty(a)) {
            this.d.setDeviceIMEI(a(this.c));
            return;
        }
        this.d.setDeviceIMEI(a);
    }

    private static String a(Context context) {
        return Settings.Secure.getString(context.getContentResolver(), "android_id");
    }

    private void b() {
        this.e.setModel(Build.MODEL);
    }

    private void c() {
        this.e.setOsVersion(Build.VERSION.RELEASE);
    }

    private void d() {
        this.e.setBrand(Build.BRAND);
        this.e.setManufacturer(Build.MANUFACTURER);
    }
}
