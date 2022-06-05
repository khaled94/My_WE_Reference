package net.openid.appauth;

import android.net.Uri;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes2.dex */
public final class AuthorizationException extends Exception {
    public final int a;
    public final int b;
    public final String c;
    public final String d;
    public final Uri e;

    private JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        dzx.a(jSONObject, "type", this.a);
        dzx.a(jSONObject, "code", this.b);
        dzx.a(jSONObject, "error", this.c);
        dzx.a(jSONObject, "errorDescription", this.d);
        Uri uri = this.e;
        dzy.a(jSONObject, "json must not be null");
        dzy.a("errorUri", "field must not be null");
        if (uri != null) {
            try {
                jSONObject.put("errorUri", uri.toString());
            } catch (JSONException e) {
                throw new IllegalStateException("JSONException thrown in violation of contract", e);
            }
        }
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj != null && (obj instanceof AuthorizationException)) {
            AuthorizationException authorizationException = (AuthorizationException) obj;
            if (this.a == authorizationException.a && this.b == authorizationException.b) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return ((this.a + 31) * 31) + this.b;
    }

    @Override // java.lang.Throwable
    public final String toString() {
        return "AuthorizationException: " + a().toString();
    }
}
