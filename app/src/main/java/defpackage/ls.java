package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import androidx.core.app.NotificationCompat;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\t\n\u0002\b\t\n\u0002\u0010\u001e\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\"\n\u0002\b\b\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 L2\u00020\u0001:\u0001LB\u0017\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0002\u0010\u0005B\u0085\u0002\b\u0017\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0006\u0010\u0007\u001a\u00020\u0003\u0012\u0006\u0010\b\u001a\u00020\u0003\u0012\u0006\u0010\t\u001a\u00020\u0003\u0012\u0006\u0010\n\u001a\u00020\u000b\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\r\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0003\u0012\u0010\b\u0002\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0015\u0012\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u0003\u0012\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\u0016\b\u0002\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018\u0012\n\b\u0002\u0010\u001c\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u001eB\u000f\b\u0010\u0012\u0006\u0010\u001f\u001a\u00020 ¢\u0006\u0002\u0010!J\b\u0010;\u001a\u00020\u0019H\u0016J\u0013\u0010<\u001a\u00020=2\b\u0010>\u001a\u0004\u0018\u00010?H\u0096\u0002J\b\u0010@\u001a\u00020\u0019H\u0016J\u0018\u0010A\u001a\u00020=2\u0006\u0010B\u001a\u00020C2\u0006\u0010\u0004\u001a\u00020\u0003H\u0002J\b\u0010D\u001a\u00020\u0003H\u0007J\r\u0010E\u001a\u00020CH\u0001¢\u0006\u0002\bFJ\b\u0010G\u001a\u00020\u0003H\u0016J\u0018\u0010H\u001a\u00020I2\u0006\u0010J\u001a\u00020 2\u0006\u0010K\u001a\u00020\u0019H\u0016R\u0011\u0010\b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\"\u0010#R\u0013\u0010\u0012\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b$\u0010#R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b%\u0010&R\u0013\u0010\u0011\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b'\u0010#R\u0013\u0010\u000f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b(\u0010#R\u0011\u0010\f\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010&R\u0011\u0010\u0007\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b*\u0010#R\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b+\u0010#R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010#R\u0013\u0010\u000e\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010#R\u0011\u0010\t\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b.\u0010#R\u0013\u0010\u0013\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b/\u0010#R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b0\u0010#R\u001f\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b1\u00102R\u0013\u0010\u0016\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b3\u0010#R\u0019\u0010\u0014\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u000104¢\u0006\b\n\u0000\u001a\u0004\b5\u00106R\u0013\u0010\u001c\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b7\u0010#R\u001f\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b8\u00102R\u0013\u0010\u001d\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b9\u0010#R\u001f\u0010\u001b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0018¢\u0006\b\n\u0000\u001a\u0004\b:\u00102¨\u0006M"}, d2 = {"Lcom/facebook/AuthenticationTokenClaims;", "Landroid/os/Parcelable;", "encodedClaims", "", "expectedNonce", "(Ljava/lang/String;Ljava/lang/String;)V", "jti", "iss", "aud", "nonce", "exp", "", "iat", "sub", "name", "givenName", "middleName", "familyName", NotificationCompat.CATEGORY_EMAIL, "picture", "userFriends", "", "userBirthday", "userAgeRange", "", "", "userHometown", "userLocation", "userGender", "userLink", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;JJLjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/lang/String;Ljava/util/Map;Ljava/util/Map;Ljava/util/Map;Ljava/lang/String;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getAud", "()Ljava/lang/String;", "getEmail", "getExp", "()J", "getFamilyName", "getGivenName", "getIat", "getIss", "getJti", "getMiddleName", "getName", "getNonce", "getPicture", "getSub", "getUserAgeRange", "()Ljava/util/Map;", "getUserBirthday", "", "getUserFriends", "()Ljava/util/Set;", "getUserGender", "getUserHometown", "getUserLink", "getUserLocation", "describeContents", "equals", "", "other", "", "hashCode", "isValidClaims", "claimsJson", "Lorg/json/JSONObject;", "toEnCodedString", "toJSONObject", "toJSONObject$facebook_core_release", "toString", "writeToParcel", "", "dest", "flags", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: ls  reason: default package */
/* loaded from: classes2.dex */
public final class ls implements Parcelable {
    private final String b;
    private final String c;
    private final String d;
    private final String e;
    private final long f;
    private final long g;
    private final String h;
    private final String i;
    private final String j;
    private final String k;
    private final String l;
    private final String m;
    private final String n;
    private final Set<String> o;
    private final String p;
    private final Map<String, Integer> q;
    private final Map<String, String> r;
    private final Map<String, String> s;
    private final String t;
    private final String u;
    public static final a a = new a((byte) 0);
    public static final Parcelable.Creator<ls> CREATOR = new b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public ls(String str, String str2) {
        dqc.d(str, "encodedClaims");
        dqc.d(str2, "expectedNonce");
        qj.b(str, "encodedClaims");
        byte[] decode = Base64.decode(str, 8);
        dqc.b(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, dsd.a));
        if (!a(jSONObject, str2)) {
            throw new IllegalArgumentException("Invalid claims".toString());
        }
        String string = jSONObject.getString("jti");
        dqc.b(string, "jsonObj.getString(JSON_KEY_JIT)");
        this.b = string;
        String string2 = jSONObject.getString("iss");
        dqc.b(string2, "jsonObj.getString(JSON_KEY_ISS)");
        this.c = string2;
        String string3 = jSONObject.getString("aud");
        dqc.b(string3, "jsonObj.getString(JSON_KEY_AUD)");
        this.d = string3;
        String string4 = jSONObject.getString("nonce");
        dqc.b(string4, "jsonObj.getString(JSON_KEY_NONCE)");
        this.e = string4;
        this.f = jSONObject.getLong("exp");
        this.g = jSONObject.getLong("iat");
        String string5 = jSONObject.getString("sub");
        dqc.b(string5, "jsonObj.getString(JSON_KEY_SUB)");
        this.h = string5;
        this.i = a.a(jSONObject, "name");
        this.j = a.a(jSONObject, "given_name");
        this.k = a.a(jSONObject, "middle_name");
        this.l = a.a(jSONObject, "family_name");
        this.m = a.a(jSONObject, NotificationCompat.CATEGORY_EMAIL);
        this.n = a.a(jSONObject, "picture");
        JSONArray optJSONArray = jSONObject.optJSONArray("user_friends");
        Map<String, String> map = null;
        this.o = optJSONArray == null ? null : Collections.unmodifiableSet(qi.c(optJSONArray));
        this.p = a.a(jSONObject, "user_birthday");
        JSONObject optJSONObject = jSONObject.optJSONObject("user_age_range");
        this.q = optJSONObject == null ? null : Collections.unmodifiableMap(qi.a(optJSONObject));
        JSONObject optJSONObject2 = jSONObject.optJSONObject("user_hometown");
        this.r = optJSONObject2 == null ? null : Collections.unmodifiableMap(qi.b(optJSONObject2));
        JSONObject optJSONObject3 = jSONObject.optJSONObject("user_location");
        this.s = optJSONObject3 != null ? Collections.unmodifiableMap(qi.b(optJSONObject3)) : map;
        this.t = a.a(jSONObject, "user_gender");
        this.u = a.a(jSONObject, "user_link");
    }

    public ls(Parcel parcel) {
        dqc.d(parcel, "parcel");
        this.b = qj.a(parcel.readString(), "jti");
        this.c = qj.a(parcel.readString(), "iss");
        this.d = qj.a(parcel.readString(), "aud");
        this.e = qj.a(parcel.readString(), "nonce");
        this.f = parcel.readLong();
        this.g = parcel.readLong();
        this.h = qj.a(parcel.readString(), "sub");
        this.i = parcel.readString();
        this.j = parcel.readString();
        this.k = parcel.readString();
        this.l = parcel.readString();
        this.m = parcel.readString();
        this.n = parcel.readString();
        ArrayList<String> createStringArrayList = parcel.createStringArrayList();
        Map<String, String> map = null;
        this.o = createStringArrayList != null ? Collections.unmodifiableSet(new HashSet(createStringArrayList)) : null;
        this.p = parcel.readString();
        HashMap readHashMap = parcel.readHashMap(dqb.a.getClass().getClassLoader());
        readHashMap = !(readHashMap instanceof HashMap) ? null : readHashMap;
        this.q = readHashMap != null ? Collections.unmodifiableMap(readHashMap) : null;
        HashMap readHashMap2 = parcel.readHashMap(dqi.a.getClass().getClassLoader());
        readHashMap2 = !(readHashMap2 instanceof HashMap) ? null : readHashMap2;
        this.r = readHashMap2 != null ? Collections.unmodifiableMap(readHashMap2) : null;
        HashMap readHashMap3 = parcel.readHashMap(dqi.a.getClass().getClassLoader());
        readHashMap3 = !(readHashMap3 instanceof HashMap) ? null : readHashMap3;
        this.s = readHashMap3 != null ? Collections.unmodifiableMap(readHashMap3) : map;
        this.t = parcel.readString();
        this.u = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dqc.d(parcel, "dest");
        parcel.writeString(this.b);
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.e);
        parcel.writeLong(this.f);
        parcel.writeLong(this.g);
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeString(this.j);
        parcel.writeString(this.k);
        parcel.writeString(this.l);
        parcel.writeString(this.m);
        parcel.writeString(this.n);
        if (this.o == null) {
            parcel.writeStringList(null);
        } else {
            parcel.writeStringList(new ArrayList(this.o));
        }
        parcel.writeString(this.p);
        parcel.writeMap(this.q);
        parcel.writeMap(this.r);
        parcel.writeMap(this.s);
        parcel.writeString(this.t);
        parcel.writeString(this.u);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof ls)) {
            return false;
        }
        ls lsVar = (ls) obj;
        return dqc.a((Object) this.b, (Object) lsVar.b) && dqc.a((Object) this.c, (Object) lsVar.c) && dqc.a((Object) this.d, (Object) lsVar.d) && dqc.a((Object) this.e, (Object) lsVar.e) && this.f == lsVar.f && this.g == lsVar.g && dqc.a((Object) this.h, (Object) lsVar.h) && dqc.a((Object) this.i, (Object) lsVar.i) && dqc.a((Object) this.j, (Object) lsVar.j) && dqc.a((Object) this.k, (Object) lsVar.k) && dqc.a((Object) this.l, (Object) lsVar.l) && dqc.a((Object) this.m, (Object) lsVar.m) && dqc.a((Object) this.n, (Object) lsVar.n) && dqc.a(this.o, lsVar.o) && dqc.a((Object) this.p, (Object) lsVar.p) && dqc.a(this.q, lsVar.q) && dqc.a(this.r, lsVar.r) && dqc.a(this.s, lsVar.s) && dqc.a((Object) this.t, (Object) lsVar.t) && dqc.a((Object) this.u, (Object) lsVar.u);
    }

    public final int hashCode() {
        int hashCode = (((((((((((((this.b.hashCode() + 527) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + Long.valueOf(this.f).hashCode()) * 31) + Long.valueOf(this.g).hashCode()) * 31) + this.h.hashCode()) * 31;
        String str = this.i;
        int i = 0;
        int hashCode2 = (hashCode + (str != null ? str.hashCode() : 0)) * 31;
        String str2 = this.j;
        int hashCode3 = (hashCode2 + (str2 != null ? str2.hashCode() : 0)) * 31;
        String str3 = this.k;
        int hashCode4 = (hashCode3 + (str3 != null ? str3.hashCode() : 0)) * 31;
        String str4 = this.l;
        int hashCode5 = (hashCode4 + (str4 != null ? str4.hashCode() : 0)) * 31;
        String str5 = this.m;
        int hashCode6 = (hashCode5 + (str5 != null ? str5.hashCode() : 0)) * 31;
        String str6 = this.n;
        int hashCode7 = (hashCode6 + (str6 != null ? str6.hashCode() : 0)) * 31;
        Set<String> set = this.o;
        int hashCode8 = (hashCode7 + (set != null ? set.hashCode() : 0)) * 31;
        String str7 = this.p;
        int hashCode9 = (hashCode8 + (str7 != null ? str7.hashCode() : 0)) * 31;
        Map<String, Integer> map = this.q;
        int hashCode10 = (hashCode9 + (map != null ? map.hashCode() : 0)) * 31;
        Map<String, String> map2 = this.r;
        int hashCode11 = (hashCode10 + (map2 != null ? map2.hashCode() : 0)) * 31;
        Map<String, String> map3 = this.s;
        int hashCode12 = (hashCode11 + (map3 != null ? map3.hashCode() : 0)) * 31;
        String str8 = this.t;
        int hashCode13 = (hashCode12 + (str8 != null ? str8.hashCode() : 0)) * 31;
        String str9 = this.u;
        if (str9 != null) {
            i = str9.hashCode();
        }
        return hashCode13 + i;
    }

    public final String toString() {
        String jSONObject = a().toString();
        dqc.b(jSONObject, "claimsJsonObject.toString()");
        return jSONObject;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x0052, code lost:
        if ((!defpackage.dqc.a((java.lang.Object) new java.net.URL(r1).getHost(), (java.lang.Object) "www.facebook.com")) != false) goto L45;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    private static boolean a(org.json.JSONObject r8, java.lang.String r9) {
        /*
            Method dump skipped, instructions count: 233
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.ls.a(org.json.JSONObject, java.lang.String):boolean");
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("jti", this.b);
        jSONObject.put("iss", this.c);
        jSONObject.put("aud", this.d);
        jSONObject.put("nonce", this.e);
        jSONObject.put("exp", this.f);
        jSONObject.put("iat", this.g);
        String str = this.h;
        if (str != null) {
            jSONObject.put("sub", str);
        }
        String str2 = this.i;
        if (str2 != null) {
            jSONObject.put("name", str2);
        }
        String str3 = this.j;
        if (str3 != null) {
            jSONObject.put("given_name", str3);
        }
        String str4 = this.k;
        if (str4 != null) {
            jSONObject.put("middle_name", str4);
        }
        String str5 = this.l;
        if (str5 != null) {
            jSONObject.put("family_name", str5);
        }
        String str6 = this.m;
        if (str6 != null) {
            jSONObject.put(NotificationCompat.CATEGORY_EMAIL, str6);
        }
        String str7 = this.n;
        if (str7 != null) {
            jSONObject.put("picture", str7);
        }
        if (this.o != null) {
            jSONObject.put("user_friends", new JSONArray((Collection) this.o));
        }
        String str8 = this.p;
        if (str8 != null) {
            jSONObject.put("user_birthday", str8);
        }
        if (this.q != null) {
            jSONObject.put("user_age_range", new JSONObject(this.q));
        }
        if (this.r != null) {
            jSONObject.put("user_hometown", new JSONObject(this.r));
        }
        if (this.s != null) {
            jSONObject.put("user_location", new JSONObject(this.s));
        }
        String str9 = this.t;
        if (str9 != null) {
            jSONObject.put("user_gender", str9);
        }
        String str10 = this.u;
        if (str10 != null) {
            jSONObject.put("user_link", str10);
        }
        return jSONObject;
    }

    @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0014\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u001d\u001a\u00020\u00052\u0006\u0010\u001e\u001a\u00020\u001fH\u0001¢\u0006\u0002\b J\u001b\u0010!\u001a\u0004\u0018\u00010\u0007*\u00020\u001f2\u0006\u0010\"\u001a\u00020\u0007H\u0000¢\u0006\u0002\b#R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u001cX\u0086T¢\u0006\u0002\n\u0000¨\u0006$"}, d2 = {"Lcom/facebook/AuthenticationTokenClaims$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenClaims;", "JSON_KEY_AUD", "", "JSON_KEY_EMAIL", "JSON_KEY_EXP", "JSON_KEY_FAMILY_NAME", "JSON_KEY_GIVEN_NAME", "JSON_KEY_IAT", "JSON_KEY_ISS", "JSON_KEY_JIT", "JSON_KEY_MIDDLE_NAME", "JSON_KEY_NAME", "JSON_KEY_NONCE", "JSON_KEY_PICTURE", "JSON_KEY_SUB", "JSON_KEY_USER_AGE_RANGE", "JSON_KEY_USER_BIRTHDAY", "JSON_KEY_USER_FRIENDS", "JSON_KEY_USER_GENDER", "JSON_KEY_USER_HOMETOWN", "JSON_KEY_USER_LINK", "JSON_KEY_USER_LOCATION", "MAX_TIME_SINCE_TOKEN_ISSUED", "", "createFromJSONObject", "jsonObject", "Lorg/json/JSONObject;", "createFromJSONObject$facebook_core_release", "getNullableString", "name", "getNullableString$facebook_core_release", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ls$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }

        public static String a(JSONObject jSONObject, String str) {
            dqc.d(jSONObject, "$this$getNullableString");
            dqc.d(str, "name");
            if (jSONObject.has(str)) {
                return jSONObject.getString(str);
            }
            return null;
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/AuthenticationTokenClaims$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenClaims;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/facebook/AuthenticationTokenClaims;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: ls$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<ls> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ ls createFromParcel(Parcel parcel) {
            dqc.d(parcel, "source");
            return new ls(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ ls[] newArray(int i) {
            return new ls[i];
        }
    }
}
