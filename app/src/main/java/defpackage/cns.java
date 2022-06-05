package defpackage;

import android.text.TextUtils;
import java.util.concurrent.TimeUnit;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cns  reason: default package */
/* loaded from: classes2.dex */
public final class cns {
    private static final long b = TimeUnit.DAYS.toMillis(7);
    final String a;
    private final String c;
    private final long d;

    private cns(String str, String str2, long j) {
        this.a = str;
        this.c = str2;
        this.d = j;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static cns a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        if (str.startsWith("{")) {
            try {
                JSONObject jSONObject = new JSONObject(str);
                return new cns(jSONObject.getString("token"), jSONObject.getString("appVersion"), jSONObject.getLong("timestamp"));
            } catch (JSONException e) {
                String valueOf = String.valueOf(e);
                StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 23);
                sb.append("Failed to parse token: ");
                sb.append(valueOf);
                return null;
            }
        }
        return new cns(str, null, 0L);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(String str, String str2, long j) {
        try {
            JSONObject jSONObject = new JSONObject();
            jSONObject.put("token", str);
            jSONObject.put("appVersion", str2);
            jSONObject.put("timestamp", j);
            return jSONObject.toString();
        } catch (JSONException e) {
            String valueOf = String.valueOf(e);
            StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 24);
            sb.append("Failed to encode token: ");
            sb.append(valueOf);
            return null;
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public static String a(cns cnsVar) {
        if (cnsVar == null) {
            return null;
        }
        return cnsVar.a;
    }

    public final boolean b(String str) {
        return System.currentTimeMillis() > this.d + b || !str.equals(this.c);
    }
}
