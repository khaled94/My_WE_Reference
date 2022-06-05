package defpackage;

import android.content.Context;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.os.Bundle;
import android.text.TextUtils;
import defpackage.rs;
import java.util.Map;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: rv  reason: default package */
/* loaded from: classes2.dex */
class rv {
    private static final ScheduledExecutorService d = Executors.newSingleThreadScheduledExecutor();
    final na a;
    private String b;
    private String c;

    static /* synthetic */ na a(rv rvVar) {
        if (qx.a(rv.class)) {
            return null;
        }
        try {
            return rvVar.a;
        } catch (Throwable th) {
            qx.a(th, rv.class);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public rv(Context context, String str) {
        PackageInfo packageInfo;
        this.b = str;
        this.a = new na(context, str);
        try {
            PackageManager packageManager = context.getPackageManager();
            if (packageManager == null || (packageInfo = packageManager.getPackageInfo("com.facebook.katana", 0)) == null) {
                return;
            }
            this.c = packageInfo.versionName;
        } catch (PackageManager.NameNotFoundException unused) {
        }
    }

    public final String a() {
        if (qx.a(this)) {
            return null;
        }
        try {
            return this.b;
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static Bundle a(String str) {
        if (qx.a(rv.class)) {
            return null;
        }
        try {
            Bundle bundle = new Bundle();
            bundle.putLong("1_timestamp_ms", System.currentTimeMillis());
            bundle.putString("0_auth_logger_id", str);
            bundle.putString("3_method", "");
            bundle.putString("2_result", "");
            bundle.putString("5_error_message", "");
            bundle.putString("4_error_code", "");
            bundle.putString("6_extras", "");
            return bundle;
        } catch (Throwable th) {
            qx.a(th, rv.class);
            return null;
        }
    }

    public final void a(String str, Map<String, String> map, rs.d.a aVar, Map<String, String> map2, Exception exc, String str2) {
        if (qx.a(this)) {
            return;
        }
        try {
            Bundle a = a(str);
            if (aVar != null) {
                a.putString("2_result", aVar.getLoggingValue());
            }
            if (exc != null && exc.getMessage() != null) {
                a.putString("5_error_message", exc.getMessage());
            }
            JSONObject jSONObject = null;
            if (!map.isEmpty()) {
                jSONObject = new JSONObject(map);
            }
            if (map2 != null) {
                if (jSONObject == null) {
                    jSONObject = new JSONObject();
                }
                try {
                    for (Map.Entry<String, String> entry : map2.entrySet()) {
                        jSONObject.put(entry.getKey(), entry.getValue());
                    }
                } catch (JSONException unused) {
                }
            }
            if (jSONObject != null) {
                a.putString("6_extras", jSONObject.toString());
            }
            this.a.c(str2, a);
            if (aVar != rs.d.a.SUCCESS || qx.a(this)) {
                return;
            }
            final Bundle a2 = a(str);
            d.schedule(new Runnable() { // from class: rv.1
                @Override // java.lang.Runnable
                public final void run() {
                    if (qx.a(this)) {
                        return;
                    }
                    try {
                        rv.a(rv.this).c("fb_mobile_login_heartbeat", a2);
                    } catch (Throwable th) {
                        qx.a(th, this);
                    }
                }
            }, 5L, TimeUnit.SECONDS);
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    public final void a(String str, String str2, String str3, String str4, String str5, Map<String, String> map, String str6) {
        if (qx.a(this)) {
            return;
        }
        try {
            Bundle a = a(str);
            if (str3 != null) {
                a.putString("2_result", str3);
            }
            if (str4 != null) {
                a.putString("5_error_message", str4);
            }
            if (str5 != null) {
                a.putString("4_error_code", str5);
            }
            if (map != null && !map.isEmpty()) {
                a.putString("6_extras", new JSONObject(map).toString());
            }
            a.putString("3_method", str2);
            this.a.c(str6, a);
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    public final void a(String str, String str2) {
        if (qx.a(this)) {
            return;
        }
        try {
            a(str, str2, "");
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    public final void a(String str, String str2, String str3) {
        if (qx.a(this)) {
            return;
        }
        try {
            Bundle a = a("");
            a.putString("2_result", rs.d.a.ERROR.getLoggingValue());
            a.putString("5_error_message", str2);
            a.putString("3_method", str3);
            this.a.c(str, a);
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }

    public final void a(rs.c cVar, String str) {
        if (qx.a(this)) {
            return;
        }
        try {
            Bundle a = a(cVar.e);
            try {
                JSONObject jSONObject = new JSONObject();
                jSONObject.put("login_behavior", cVar.a.toString());
                jSONObject.put("request_code", rs.c());
                jSONObject.put("permissions", TextUtils.join(",", cVar.b));
                jSONObject.put("default_audience", cVar.c.toString());
                jSONObject.put("isReauthorize", cVar.f);
                if (this.c != null) {
                    jSONObject.put("facebookVersion", this.c);
                }
                if (cVar.l != null) {
                    jSONObject.put("target_app", cVar.l.toString());
                }
                a.putString("6_extras", jSONObject.toString());
            } catch (JSONException unused) {
            }
            this.a.b(str, a);
        } catch (Throwable th) {
            qx.a(th, this);
        }
    }
}
