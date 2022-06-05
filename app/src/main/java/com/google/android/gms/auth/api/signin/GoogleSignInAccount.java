package com.google.android.gms.auth.api.signin;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.api.Scope;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class GoogleSignInAccount extends abb implements ReflectedParcelable {
    public static final Parcelable.Creator<GoogleSignInAccount> CREATOR = new um();
    public static ady a = aea.d();
    final int b;
    public String c;
    public String d;
    public String e;
    List<Scope> f;
    private String g;
    private String h;
    private Uri i;
    private String j;
    private long k;
    private String l;
    private String m;
    private Set<Scope> n = new HashSet();

    public GoogleSignInAccount(int i, String str, String str2, String str3, String str4, Uri uri, String str5, long j, String str6, List<Scope> list, String str7, String str8) {
        this.b = i;
        this.g = str;
        this.c = str2;
        this.d = str3;
        this.h = str4;
        this.i = uri;
        this.j = str5;
        this.k = j;
        this.e = str6;
        this.f = list;
        this.l = str7;
        this.m = str8;
    }

    public static GoogleSignInAccount a(String str) throws JSONException {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        JSONObject jSONObject = new JSONObject(str);
        String optString = jSONObject.optString("photoUrl");
        Uri parse = !TextUtils.isEmpty(optString) ? Uri.parse(optString) : null;
        long parseLong = Long.parseLong(jSONObject.getString("expirationTime"));
        HashSet hashSet = new HashSet();
        JSONArray jSONArray = jSONObject.getJSONArray("grantedScopes");
        int length = jSONArray.length();
        for (int i = 0; i < length; i++) {
            hashSet.add(new Scope(jSONArray.getString(i)));
        }
        GoogleSignInAccount googleSignInAccount = new GoogleSignInAccount(3, jSONObject.optString("id"), jSONObject.has("tokenId") ? jSONObject.optString("tokenId") : null, jSONObject.has(NotificationCompat.CATEGORY_EMAIL) ? jSONObject.optString(NotificationCompat.CATEGORY_EMAIL) : null, jSONObject.has("displayName") ? jSONObject.optString("displayName") : null, parse, null, Long.valueOf(parseLong).longValue(), aat.a(jSONObject.getString("obfuscatedIdentifier")), new ArrayList((Collection) aat.a(hashSet)), jSONObject.has("givenName") ? jSONObject.optString("givenName") : null, jSONObject.has("familyName") ? jSONObject.optString("familyName") : null);
        googleSignInAccount.j = jSONObject.has("serverAuthCode") ? jSONObject.optString("serverAuthCode") : null;
        return googleSignInAccount;
    }

    public final Set<Scope> a() {
        HashSet hashSet = new HashSet(this.f);
        hashSet.addAll(this.n);
        return hashSet;
    }

    public final String b() {
        JSONObject jSONObject = new JSONObject();
        try {
            if (this.g != null) {
                jSONObject.put("id", this.g);
            }
            if (this.c != null) {
                jSONObject.put("tokenId", this.c);
            }
            if (this.d != null) {
                jSONObject.put(NotificationCompat.CATEGORY_EMAIL, this.d);
            }
            if (this.h != null) {
                jSONObject.put("displayName", this.h);
            }
            if (this.l != null) {
                jSONObject.put("givenName", this.l);
            }
            if (this.m != null) {
                jSONObject.put("familyName", this.m);
            }
            Uri uri = this.i;
            if (uri != null) {
                jSONObject.put("photoUrl", uri.toString());
            }
            if (this.j != null) {
                jSONObject.put("serverAuthCode", this.j);
            }
            jSONObject.put("expirationTime", this.k);
            jSONObject.put("obfuscatedIdentifier", this.e);
            JSONArray jSONArray = new JSONArray();
            List<Scope> list = this.f;
            Scope[] scopeArr = (Scope[]) list.toArray(new Scope[list.size()]);
            Arrays.sort(scopeArr, ul.a);
            for (Scope scope : scopeArr) {
                jSONArray.put(scope.b);
            }
            jSONObject.put("grantedScopes", jSONArray);
            jSONObject.remove("serverAuthCode");
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new RuntimeException(e);
        }
    }

    public boolean equals(Object obj) {
        if (obj == null) {
            return false;
        }
        if (obj == this) {
            return true;
        }
        if (!(obj instanceof GoogleSignInAccount)) {
            return false;
        }
        GoogleSignInAccount googleSignInAccount = (GoogleSignInAccount) obj;
        return googleSignInAccount.e.equals(this.e) && googleSignInAccount.a().equals(a());
    }

    public int hashCode() {
        return ((this.e.hashCode() + 527) * 31) + a().hashCode();
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a2 = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.b);
        abc.a(parcel, 2, this.g);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d);
        abc.a(parcel, 5, this.h);
        abc.a(parcel, 6, this.i, i);
        abc.a(parcel, 7, this.j);
        abc.a(parcel, 8, this.k);
        abc.a(parcel, 9, this.e);
        abc.c(parcel, 10, this.f);
        abc.a(parcel, 11, this.l);
        abc.a(parcel, 12, this.m);
        abc.b(parcel, a2);
    }
}
