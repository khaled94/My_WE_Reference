package defpackage;

import android.content.SharedPreferences;
import com.facebook.FacebookException;
import defpackage.lk;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u0000 \u001b2\u00020\u0001:\u0002\u001b\u001cB\u0007\b\u0016¢\u0006\u0002\u0010\u0002B\u0015\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007J\u0006\u0010\u0013\u001a\u00020\u0014J\b\u0010\u0015\u001a\u00020\u0016H\u0002J\b\u0010\u0017\u001a\u0004\u0018\u00010\tJ\u000e\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0019\u001a\u00020\tJ\b\u0010\u001a\u001a\u00020\u0016H\u0002R\u0016\u0010\b\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000bR\u0016\u0010\f\u001a\u0004\u0018\u00010\t8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\r\u0010\u000bR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000R\u0014\u0010\u000e\u001a\u00020\u000f8CX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082\u0004¢\u0006\u0002\n\u0000R\u0010\u0010\u0012\u001a\u0004\u0018\u00010\u000fX\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006\u001d"}, d2 = {"Lcom/facebook/AccessTokenCache;", "", "()V", "sharedPreferences", "Landroid/content/SharedPreferences;", "tokenCachingStrategyFactory", "Lcom/facebook/AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory;", "(Landroid/content/SharedPreferences;Lcom/facebook/AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory;)V", "cachedAccessToken", "Lcom/facebook/AccessToken;", "getCachedAccessToken", "()Lcom/facebook/AccessToken;", "legacyAccessToken", "getLegacyAccessToken", "tokenCachingStrategy", "Lcom/facebook/LegacyTokenHelper;", "getTokenCachingStrategy", "()Lcom/facebook/LegacyTokenHelper;", "tokenCachingStrategyField", "clear", "", "hasCachedAccessToken", "", "load", "save", "accessToken", "shouldCheckLegacyToken", "Companion", "SharedPreferencesTokenCachingStrategyFactory", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: lm  reason: default package */
/* loaded from: classes2.dex */
public final class lm {
    public static final a a = new a((byte) 0);
    private me b;
    private final SharedPreferences c;
    private final b d;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0006\u0010\u0003\u001a\u00020\u0004¨\u0006\u0005"}, d2 = {"Lcom/facebook/AccessTokenCache$SharedPreferencesTokenCachingStrategyFactory;", "", "()V", "create", "Lcom/facebook/LegacyTokenHelper;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lm$b */
    /* loaded from: classes2.dex */
    public static final class b {
    }

    private lm(SharedPreferences sharedPreferences, b bVar) {
        dqc.d(sharedPreferences, "sharedPreferences");
        dqc.d(bVar, "tokenCachingStrategyFactory");
        this.c = sharedPreferences;
        this.d = bVar;
    }

    private final me c() {
        if (qx.a(this)) {
            return null;
        }
        try {
            if (this.b == null) {
                synchronized (this) {
                    if (this.b == null) {
                        this.b = new me(ly.k(), (byte) 0);
                    }
                    dmg dmgVar = dmg.a;
                }
            }
            me meVar = this.b;
            if (meVar != null) {
                return meVar;
            }
            throw new IllegalStateException("Required value was null.".toString());
        } catch (Throwable th) {
            qx.a(th, this);
            return null;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public lm() {
        /*
            r3 = this;
            android.content.Context r0 = defpackage.ly.k()
            java.lang.String r1 = "com.facebook.AccessTokenManager.SharedPreferences"
            r2 = 0
            android.content.SharedPreferences r0 = r0.getSharedPreferences(r1, r2)
            java.lang.String r1 = "FacebookSdk.getApplicati…ME, Context.MODE_PRIVATE)"
            defpackage.dqc.b(r0, r1)
            lm$b r1 = new lm$b
            r1.<init>()
            r3.<init>(r0, r1)
            return
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm.<init>():void");
    }

    public final void a(lk lkVar) {
        dqc.d(lkVar, "accessToken");
        try {
            this.c.edit().putString("com.facebook.AccessTokenManager.CachedAccessToken", lkVar.b().toString()).apply();
        } catch (JSONException unused) {
        }
    }

    public final void b() {
        this.c.edit().remove("com.facebook.AccessTokenManager.CachedAccessToken").apply();
        if (ly.d()) {
            c().b();
        }
    }

    private final lk d() {
        ArrayList arrayList;
        String string = this.c.getString("com.facebook.AccessTokenManager.CachedAccessToken", null);
        if (string != null) {
            try {
                JSONObject jSONObject = new JSONObject(string);
                lk.b bVar = lk.l;
                dqc.d(jSONObject, "jsonObject");
                if (jSONObject.getInt("version") > 1) {
                    throw new FacebookException("Unknown AccessToken serialization format.");
                }
                String string2 = jSONObject.getString("token");
                Date date = new Date(jSONObject.getLong("expires_at"));
                JSONArray jSONArray = jSONObject.getJSONArray("permissions");
                JSONArray jSONArray2 = jSONObject.getJSONArray("declined_permissions");
                JSONArray optJSONArray = jSONObject.optJSONArray("expired_permissions");
                Date date2 = new Date(jSONObject.getLong("last_refresh"));
                String string3 = jSONObject.getString("source");
                dqc.b(string3, "jsonObject.getString(SOURCE_KEY)");
                lo valueOf = lo.valueOf(string3);
                String string4 = jSONObject.getString("application_id");
                String string5 = jSONObject.getString("user_id");
                Date date3 = new Date(jSONObject.optLong("data_access_expiration_time", 0L));
                String optString = jSONObject.optString("graph_domain", null);
                dqc.b(string2, "token");
                dqc.b(string4, "applicationId");
                dqc.b(string5, "userId");
                dqc.b(jSONArray, "permissionsArray");
                List<String> b2 = qi.b(jSONArray);
                dqc.b(jSONArray2, "declinedPermissionsArray");
                List<String> b3 = qi.b(jSONArray2);
                if (optJSONArray == null) {
                    arrayList = new ArrayList();
                } else {
                    arrayList = qi.b(optJSONArray);
                }
                return new lk(string2, string4, string5, b2, b3, arrayList, valueOf, date, date2, date3, optString);
            } catch (JSONException unused) {
                return null;
            }
        }
        return null;
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0005"}, d2 = {"Lcom/facebook/AccessTokenCache$Companion;", "", "()V", "CACHED_ACCESS_TOKEN_KEY", "", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lm$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0046, code lost:
        if (r0.getLong("com.facebook.TokenCachingStrategy.ExpirationDate", 0) == 0) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final defpackage.lk a() {
        /*
            r9 = this;
            android.content.SharedPreferences r0 = r9.c
            java.lang.String r1 = "com.facebook.AccessTokenManager.CachedAccessToken"
            boolean r0 = r0.contains(r1)
            r1 = 0
            if (r0 == 0) goto L10
            lk r1 = r9.d()
            goto L5f
        L10:
            boolean r0 = defpackage.ly.d()
            if (r0 == 0) goto L5f
            me r0 = r9.c()
            android.os.Bundle r0 = r0.a()
            if (r0 == 0) goto L53
            me$a r2 = defpackage.me.a
            r2 = 1
            r3 = 0
            if (r0 == 0) goto L49
            java.lang.String r4 = "com.facebook.TokenCachingStrategy.Token"
            java.lang.String r4 = r0.getString(r4)
            if (r4 == 0) goto L49
            java.lang.CharSequence r4 = (java.lang.CharSequence) r4
            int r4 = r4.length()
            if (r4 != 0) goto L38
            r4 = 1
            goto L39
        L38:
            r4 = 0
        L39:
            if (r4 == 0) goto L3c
            goto L49
        L3c:
            java.lang.String r4 = "com.facebook.TokenCachingStrategy.ExpirationDate"
            r5 = 0
            long r7 = r0.getLong(r4, r5)
            int r4 = (r7 > r5 ? 1 : (r7 == r5 ? 0 : -1))
            if (r4 == 0) goto L49
            goto L4a
        L49:
            r2 = 0
        L4a:
            if (r2 == 0) goto L53
            lk$b r1 = defpackage.lk.l
            lk r0 = defpackage.lk.b.a(r0)
            r1 = r0
        L53:
            if (r1 == 0) goto L5f
            r9.a(r1)
            me r0 = r9.c()
            r0.b()
        L5f:
            return r1
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.lm.a():lk");
    }
}
