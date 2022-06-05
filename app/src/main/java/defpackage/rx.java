package defpackage;

import android.content.Intent;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import com.facebook.FacebookException;
import defpackage.rs;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010%\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b'\u0018\u0000 12\u00020\u0001:\u00011B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0014\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u001c\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\r2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0019H\u0014J\b\u0010\u001a\u001a\u00020\u0016H\u0016J\u0010\u0010\u001b\u001a\u00020\r2\u0006\u0010\u001c\u001a\u00020\rH\u0014J\u0012\u0010\u001d\u001a\u00020\u00162\b\u0010\u001e\u001a\u0004\u0018\u00010\rH\u0014J\b\u0010\u001f\u001a\u00020 H\u0016J\"\u0010!\u001a\u00020 2\u0006\u0010\"\u001a\u00020#2\u0006\u0010$\u001a\u00020#2\b\u0010%\u001a\u0004\u0018\u00010&H\u0016J\u0010\u0010'\u001a\u00020\u00162\u0006\u0010(\u001a\u00020)H\u0016J\b\u0010*\u001a\u00020 H\u0016J\u0010\u0010+\u001a\u00020#2\u0006\u0010,\u001a\u00020-H&J\u0018\u0010.\u001a\u00020\u00162\u0006\u0010/\u001a\u00020\u00062\u0006\u00100\u001a\u00020#H\u0016R\u001a\u0010\u0002\u001a\u00020\u0003X\u0086.¢\u0006\u000e\n\u0000\u001a\u0004\b\b\u0010\t\"\u0004\b\n\u0010\u0004R,\u0010\u000b\u001a\u0014\u0012\u0006\u0012\u0004\u0018\u00010\r\u0012\u0006\u0012\u0004\u0018\u00010\r\u0018\u00010\fX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u000e\u0010\u000f\"\u0004\b\u0010\u0010\u0011R\u0012\u0010\u0012\u001a\u00020\rX¦\u0004¢\u0006\u0006\u001a\u0004\b\u0013\u0010\u0014¨\u00062"}, d2 = {"Lcom/facebook/login/LoginMethodHandler;", "Landroid/os/Parcelable;", "loginClient", "Lcom/facebook/login/LoginClient;", "(Lcom/facebook/login/LoginClient;)V", "source", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getLoginClient", "()Lcom/facebook/login/LoginClient;", "setLoginClient", "methodLoggingExtras", "", "", "getMethodLoggingExtras", "()Ljava/util/Map;", "setMethodLoggingExtras", "(Ljava/util/Map;)V", "nameForLogging", "getNameForLogging", "()Ljava/lang/String;", "addLoggingExtra", "", "key", "value", "", "cancel", "getClientState", "authId", "logWebLoginCompleted", "e2e", "needsInternetPermission", "", "onActivityResult", "requestCode", "", "resultCode", "data", "Landroid/content/Intent;", "putChallengeParam", "param", "Lorg/json/JSONObject;", "shouldKeepTrackOfMultipleIntents", "tryAuthorize", "request", "Lcom/facebook/login/LoginClient$Request;", "writeToParcel", "dest", "flags", "Companion", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: rx  reason: default package */
/* loaded from: classes2.dex */
public abstract class rx implements Parcelable {
    public static final a d = new a((byte) 0);
    Map<String, String> b;
    public rs c;

    public abstract int a(rs.c cVar);

    public abstract String a();

    public void a(JSONObject jSONObject) throws JSONException {
        dqc.d(jSONObject, "param");
    }

    public boolean a(int i, int i2, Intent intent) {
        return false;
    }

    public void b() {
    }

    public boolean c_() {
        return false;
    }

    public boolean f() {
        return false;
    }

    public final rs e() {
        rs rsVar = this.c;
        if (rsVar == null) {
            dqc.a("loginClient");
        }
        return rsVar;
    }

    public rx(rs rsVar) {
        dqc.d(rsVar, "loginClient");
        this.c = rsVar;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public rx(Parcel parcel) {
        dqc.d(parcel, "source");
        Map<String, String> a2 = qi.a(parcel);
        this.b = a2 != null ? dnh.c(a2) : null;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final String a(String str) {
        dqc.d(str, "authId");
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("0_auth_logger_id", str);
            jSONObject.put("3_method", a());
            a(jSONObject);
        } catch (JSONException e) {
            new StringBuilder("Error creating client state json: ").append(e.getMessage());
        }
        String jSONObject2 = jSONObject.toString();
        dqc.b(jSONObject2, "param.toString()");
        return jSONObject2;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void a(String str, Object obj) {
        if (this.b == null) {
            this.b = new HashMap();
        }
        Map<String, String> map = this.b;
        if (map != null) {
            map.put(str, obj != null ? obj.toString() : null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    public final void b(String str) {
        rs rsVar = this.c;
        if (rsVar == null) {
            dqc.a("loginClient");
        }
        rs.c b = rsVar.b();
        dqc.b(b, "loginClient.getPendingRequest()");
        String d2 = b.d();
        rs rsVar2 = this.c;
        if (rsVar2 == null) {
            dqc.a("loginClient");
        }
        na naVar = new na(rsVar2.a(), d2);
        Bundle bundle = new Bundle();
        bundle.putString("fb_web_login_e2e", str);
        bundle.putLong("fb_web_login_switchback_time", System.currentTimeMillis());
        bundle.putString("app_id", d2);
        naVar.b("fb_dialogs_web_login_dialog_complete", bundle);
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        dqc.d(parcel, "dest");
        qi.a(parcel, this.b);
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J$\u0010\u0003\u001a\u0004\u0018\u00010\u00042\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007J6\u0010\u000b\u001a\u0004\u0018\u00010\u00042\u0010\u0010\f\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\n\u0018\u00010\r2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0007\u001a\u0004\u0018\u00010\b2\u0006\u0010\t\u001a\u00020\nH\u0007J\u001c\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0007J\u001c\u0010\u0011\u001a\u0004\u0018\u00010\u000f2\u0006\u0010\u0005\u001a\u00020\u00062\b\u0010\u0010\u001a\u0004\u0018\u00010\nH\u0007J\u0012\u0010\u0012\u001a\u00020\n2\b\u0010\u0013\u001a\u0004\u0018\u00010\nH\u0007¨\u0006\u0014"}, d2 = {"Lcom/facebook/login/LoginMethodHandler$Companion;", "", "()V", "createAccessTokenFromNativeLogin", "Lcom/facebook/AccessToken;", "bundle", "Landroid/os/Bundle;", "source", "Lcom/facebook/AccessTokenSource;", "applicationId", "", "createAccessTokenFromWebBundle", "requestedPermissions", "", "createAuthenticationTokenFromNativeLogin", "Lcom/facebook/AuthenticationToken;", "expectedNonce", "createAuthenticationTokenFromWebBundle", "getUserIDFromSignedRequest", "signedRequest", "facebook-common_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: rx$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static lq a(Bundle bundle, String str) throws FacebookException {
            dqc.d(bundle, "bundle");
            String string = bundle.getString("com.facebook.platform.extra.ID_TOKEN");
            if (string != null) {
                boolean z = true;
                if ((string.length() == 0) || str == null) {
                    return null;
                }
                if (str.length() != 0) {
                    z = false;
                }
                if (z) {
                    return null;
                }
                try {
                    return new lq(string, str);
                } catch (Exception e) {
                    throw new FacebookException(e.getMessage());
                }
            }
            return null;
        }

        public static lq b(Bundle bundle, String str) throws FacebookException {
            dqc.d(bundle, "bundle");
            String string = bundle.getString("id_token");
            if (string != null) {
                boolean z = true;
                if ((string.length() == 0) || str == null) {
                    return null;
                }
                if (str.length() != 0) {
                    z = false;
                }
                if (z) {
                    return null;
                }
                try {
                    return new lq(string, str);
                } catch (Exception e) {
                    throw new FacebookException(e.getMessage(), e);
                }
            }
            return null;
        }

        public static String a(String str) throws FacebookException {
            Object[] array;
            if (str != null) {
                if (!(str.length() == 0)) {
                    try {
                        array = dsg.a(str, new String[]{"."}, 0, 6).toArray(new String[0]);
                    } catch (UnsupportedEncodingException | JSONException unused) {
                    }
                    if (array != null) {
                        String[] strArr = (String[]) array;
                        if (strArr.length == 2) {
                            byte[] decode = Base64.decode(strArr[1], 0);
                            dqc.b(decode, "data");
                            String string = new JSONObject(new String(decode, dsd.a)).getString("user_id");
                            dqc.b(string, "jsonObject.getString(\"user_id\")");
                            return string;
                        }
                        throw new FacebookException("Failed to retrieve user_id from signed_request");
                    }
                    throw new NullPointerException("null cannot be cast to non-null type kotlin.Array<T>");
                }
            }
            throw new FacebookException("Authorization response does not contain the signed_request");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00c1  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x00fc A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:46:0x00fd  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public static final defpackage.lk a(java.util.Collection<java.lang.String> r15, android.os.Bundle r16, defpackage.lo r17, java.lang.String r18) throws com.facebook.FacebookException {
        /*
            Method dump skipped, instructions count: 294
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.rx.a(java.util.Collection, android.os.Bundle, lo, java.lang.String):lk");
    }
}
