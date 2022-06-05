package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.location.LocationRequestCompat;
import defpackage.me;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Date;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\u001e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\"\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0002\b\r\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u0000 E2\u00020\u0001:\u0003CDEB\u0089\u0001\b\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0003\u0012\u0010\u0010\u0006\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0010\u0010\b\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\u0010\u0010\t\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0003\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u000b\u0012\b\u0010\f\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\u0002\u0010\u0011B\u000f\b\u0010\u0012\u0006\u0010\u0012\u001a\u00020\u0013¢\u0006\u0002\u0010\u0014J\u0014\u0010.\u001a\u00020/2\n\u00100\u001a\u000601j\u0002`2H\u0002J\u001a\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u000b2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0003H\u0002J\b\u00105\u001a\u000206H\u0016J\u0013\u00107\u001a\u00020!2\b\u00108\u001a\u0004\u0018\u000109H\u0096\u0002J\b\u0010:\u001a\u000206H\u0016J\r\u0010;\u001a\u00020<H\u0000¢\u0006\u0002\b=J\b\u0010>\u001a\u00020\u0003H\u0016J\b\u0010?\u001a\u00020\u0003H\u0002J\u0018\u0010@\u001a\u00020/2\u0006\u0010A\u001a\u00020\u00132\u0006\u0010B\u001a\u000206H\u0016R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0016R\u0011\u0010\u000f\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0019\u0010\t\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u001bR\u0011\u0010\u001d\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b\u001e\u0010\u0018R\u0013\u0010\u0010\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001f\u0010\u0016R\u0011\u0010 \u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b \u0010\"R\u0011\u0010#\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b#\u0010\"R\u0011\u0010$\u001a\u00020!8F¢\u0006\u0006\u001a\u0004\b$\u0010\"R\u0011\u0010%\u001a\u00020\r¢\u0006\b\n\u0000\u001a\u0004\b&\u0010\u0018R\u0019\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00030\u0019¢\u0006\b\n\u0000\u001a\u0004\b'\u0010\u001bR\u0011\u0010(\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b)\u0010*R\u0011\u0010+\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b,\u0010\u0016R\u0011\u0010\u0005\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b-\u0010\u0016¨\u0006F"}, d2 = {"Lcom/facebook/AccessToken;", "Landroid/os/Parcelable;", "accessToken", "", "applicationId", "userId", "permissions", "", "declinedPermissions", "expiredPermissions", "accessTokenSource", "Lcom/facebook/AccessTokenSource;", "expirationTime", "Ljava/util/Date;", "lastRefreshTime", "dataAccessExpirationTime", "graphDomain", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/Collection;Ljava/util/Collection;Ljava/util/Collection;Lcom/facebook/AccessTokenSource;Ljava/util/Date;Ljava/util/Date;Ljava/util/Date;Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "getApplicationId", "()Ljava/lang/String;", "getDataAccessExpirationTime", "()Ljava/util/Date;", "", "getDeclinedPermissions", "()Ljava/util/Set;", "getExpiredPermissions", "expires", "getExpires", "getGraphDomain", "isDataAccessExpired", "", "()Z", "isExpired", "isInstagramToken", "lastRefresh", "getLastRefresh", "getPermissions", "source", "getSource", "()Lcom/facebook/AccessTokenSource;", "token", "getToken", "getUserId", "appendPermissions", "", "builder", "Ljava/lang/StringBuilder;", "Lkotlin/text/StringBuilder;", "convertTokenSourceForGraphDomain", "tokenSource", "describeContents", "", "equals", "other", "", "hashCode", "toJSONObject", "Lorg/json/JSONObject;", "toJSONObject$facebook_core_release", "toString", "tokenToString", "writeToParcel", "dest", "flags", "AccessTokenCreationCallback", "AccessTokenRefreshCallback", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: lk  reason: default package */
/* loaded from: classes2.dex */
public final class lk implements Parcelable {
    private static final Date m;
    private static final Date n;
    final Date a;
    public final Set<String> b;
    final Set<String> c;
    final Set<String> d;
    public final String e;
    final lo f;
    final Date g;
    public final String h;
    public final String i;
    final Date j;
    public final String k;
    public static final b l = new b((byte) 0);
    private static final Date o = new Date();
    private static final lo p = lo.FACEBOOK_APPLICATION_WEB;
    public static final Parcelable.Creator<lk> CREATOR = new c();

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\bf\u0018\u00002\u00020\u0001J\u0012\u0010\u0002\u001a\u00020\u00032\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005H&J\u0012\u0010\u0006\u001a\u00020\u00032\b\u0010\u0007\u001a\u0004\u0018\u00010\bH&¨\u0006\t"}, d2 = {"Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "", "OnTokenRefreshFailed", "", "exception", "Lcom/facebook/FacebookException;", "OnTokenRefreshed", "accessToken", "Lcom/facebook/AccessToken;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lk$a */
    /* loaded from: classes2.dex */
    public interface a {
    }

    public lk(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, lo loVar, Date date, Date date2) {
        this(str, str2, str3, collection, collection2, collection3, loVar, date, null, date2);
    }

    public static final void a(lk lkVar) {
        b.a(lkVar);
    }

    public static final lk c() {
        return b.a();
    }

    public static final boolean d() {
        return b.b();
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public /* synthetic */ lk(String str, String str2, String str3, Collection collection, Collection collection2, Collection collection3, lo loVar, Date date, Date date2, Date date3) {
        this(str, str2, str3, collection, collection2, collection3, loVar, date, date2, date3, "facebook");
    }

    public lk(String str, String str2, String str3, Collection<String> collection, Collection<String> collection2, Collection<String> collection3, lo loVar, Date date, Date date2, Date date3, String str4) {
        dqc.d(str, "accessToken");
        dqc.d(str2, "applicationId");
        dqc.d(str3, "userId");
        qj.b(str, "accessToken");
        qj.b(str2, "applicationId");
        qj.b(str3, "userId");
        this.a = date == null ? n : date;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(collection != null ? new HashSet(collection) : new HashSet());
        dqc.b(unmodifiableSet, "Collections.unmodifiable…missions) else HashSet())");
        this.b = unmodifiableSet;
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(collection2 != null ? new HashSet(collection2) : new HashSet());
        dqc.b(unmodifiableSet2, "Collections.unmodifiable…missions) else HashSet())");
        this.c = unmodifiableSet2;
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(collection3 != null ? new HashSet(collection3) : new HashSet());
        dqc.b(unmodifiableSet3, "Collections.unmodifiable…missions) else HashSet())");
        this.d = unmodifiableSet3;
        this.e = str;
        loVar = loVar == null ? p : loVar;
        if (str4 != null && str4.equals("instagram")) {
            int i = ll.$EnumSwitchMapping$0[loVar.ordinal()];
            if (i == 1) {
                loVar = lo.INSTAGRAM_APPLICATION_WEB;
            } else if (i == 2) {
                loVar = lo.INSTAGRAM_CUSTOM_CHROME_TAB;
            } else if (i == 3) {
                loVar = lo.INSTAGRAM_WEB_VIEW;
            }
        }
        this.f = loVar;
        this.g = date2 == null ? o : date2;
        this.h = str2;
        this.i = str3;
        this.j = (date3 == null || date3.getTime() == 0) ? n : date3;
        this.k = str4 == null ? "facebook" : str4;
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("{AccessToken");
        sb.append(" token:");
        sb.append(ly.a(mf.INCLUDE_ACCESS_TOKENS) ? this.e : "ACCESS_TOKEN_REMOVED");
        sb.append(" permissions:");
        sb.append("[");
        sb.append(TextUtils.join(", ", this.b));
        sb.append("]");
        sb.append("}");
        String sb2 = sb.toString();
        dqc.b(sb2, "builder.toString()");
        return sb2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lk)) {
            return false;
        }
        lk lkVar = (lk) obj;
        if (dqc.a(this.a, lkVar.a) && dqc.a(this.b, lkVar.b) && dqc.a(this.c, lkVar.c) && dqc.a(this.d, lkVar.d) && dqc.a((Object) this.e, (Object) lkVar.e) && this.f == lkVar.f && dqc.a(this.g, lkVar.g) && dqc.a((Object) this.h, (Object) lkVar.h) && dqc.a((Object) this.i, (Object) lkVar.i) && dqc.a(this.j, lkVar.j)) {
            String str = this.k;
            String str2 = lkVar.k;
            if (str == null ? str2 == null : dqc.a((Object) str, (Object) str2)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (((((((((((((((((((this.a.hashCode() + 527) * 31) + this.b.hashCode()) * 31) + this.c.hashCode()) * 31) + this.d.hashCode()) * 31) + this.e.hashCode()) * 31) + this.f.hashCode()) * 31) + this.g.hashCode()) * 31) + this.h.hashCode()) * 31) + this.i.hashCode()) * 31) + this.j.hashCode()) * 31;
        String str = this.k;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    public final boolean a() {
        return new Date().after(this.a);
    }

    public final JSONObject b() throws JSONException {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("version", 1);
        jSONObject.put("token", this.e);
        jSONObject.put("expires_at", this.a.getTime());
        jSONObject.put("permissions", new JSONArray((Collection) this.b));
        jSONObject.put("declined_permissions", new JSONArray((Collection) this.c));
        jSONObject.put("expired_permissions", new JSONArray((Collection) this.d));
        jSONObject.put("last_refresh", this.g.getTime());
        jSONObject.put("source", this.f.name());
        jSONObject.put("application_id", this.h);
        jSONObject.put("user_id", this.i);
        jSONObject.put("data_access_expiration_time", this.j.getTime());
        String str = this.k;
        if (str != null) {
            jSONObject.put("graph_domain", str);
        }
        return jSONObject;
    }

    public lk(Parcel parcel) {
        lo loVar;
        dqc.d(parcel, "parcel");
        this.a = new Date(parcel.readLong());
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = arrayList;
        parcel.readStringList(arrayList2);
        ArrayList arrayList3 = arrayList;
        Set<String> unmodifiableSet = Collections.unmodifiableSet(new HashSet(arrayList3));
        dqc.b(unmodifiableSet, "Collections.unmodifiable…HashSet(permissionsList))");
        this.b = unmodifiableSet;
        arrayList.clear();
        parcel.readStringList(arrayList2);
        Set<String> unmodifiableSet2 = Collections.unmodifiableSet(new HashSet(arrayList3));
        dqc.b(unmodifiableSet2, "Collections.unmodifiable…HashSet(permissionsList))");
        this.c = unmodifiableSet2;
        arrayList.clear();
        parcel.readStringList(arrayList2);
        Set<String> unmodifiableSet3 = Collections.unmodifiableSet(new HashSet(arrayList3));
        dqc.b(unmodifiableSet3, "Collections.unmodifiable…HashSet(permissionsList))");
        this.d = unmodifiableSet3;
        this.e = qj.a(parcel.readString(), "token");
        String readString = parcel.readString();
        if (readString != null) {
            loVar = lo.valueOf(readString);
        } else {
            loVar = p;
        }
        this.f = loVar;
        this.g = new Date(parcel.readLong());
        this.h = qj.a(parcel.readString(), "applicationId");
        this.i = qj.a(parcel.readString(), "userId");
        this.j = new Date(parcel.readLong());
        this.k = parcel.readString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dqc.d(parcel, "dest");
        parcel.writeLong(this.a.getTime());
        parcel.writeStringList(new ArrayList(this.b));
        parcel.writeStringList(new ArrayList(this.c));
        parcel.writeStringList(new ArrayList(this.d));
        parcel.writeString(this.e);
        parcel.writeString(this.f.name());
        parcel.writeLong(this.g.getTime());
        parcel.writeString(this.h);
        parcel.writeString(this.i);
        parcel.writeLong(this.j.getTime());
        parcel.writeString(this.k);
    }

    @Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002J\u0015\u0010\u001e\u001a\u00020\b2\u0006\u0010\u001f\u001a\u00020\bH\u0000¢\u0006\u0002\b J<\u0010!\u001a\u0004\u0018\u00010\b2\u0010\u0010\"\u001a\f\u0012\u0006\u0012\u0004\u0018\u00010\u0004\u0018\u00010#2\u0006\u0010$\u001a\u00020%2\u0006\u0010&\u001a\u00020\u000e2\u0006\u0010'\u001a\u00020\u00102\u0006\u0010(\u001a\u00020\u0004H\u0002J\u0015\u0010)\u001a\u00020\b2\u0006\u0010*\u001a\u00020+H\u0001¢\u0006\u0002\b,J\u0017\u0010-\u001a\u0004\u0018\u00010\b2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b.J \u0010/\u001a\u0002002\u0006\u00101\u001a\u0002022\u0006\u0010(\u001a\u00020\u00042\u0006\u00103\u001a\u000204H\u0007J\u001f\u00105\u001a\u0004\u0018\u00010\b2\u0006\u0010\u001f\u001a\u00020\b2\u0006\u0010$\u001a\u00020%H\u0001¢\u0006\u0002\b6J\b\u00107\u001a\u000200H\u0007J\n\u00108\u001a\u0004\u0018\u00010\bH\u0007J'\u00109\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00040#2\u0006\u0010$\u001a\u00020%2\b\u0010:\u001a\u0004\u0018\u00010\u0004H\u0001¢\u0006\u0002\b;J\b\u0010<\u001a\u00020=H\u0007J\b\u0010>\u001a\u00020=H\u0007J\b\u0010?\u001a\u00020=H\u0007J\b\u0010@\u001a\u000200H\u0007J\u0012\u0010@\u001a\u0002002\b\u0010A\u001a\u0004\u0018\u00010BH\u0007J\u0012\u0010C\u001a\u0002002\b\u0010D\u001a\u0004\u0018\u00010\bH\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u0016\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\b0\u00078\u0006X\u0087\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0013\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0014\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0015\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0016\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0017\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0018\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u0019\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001a\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001b\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u001c\u001a\u00020\u0004X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u001d\u001a\u00020\u0004X\u0082T¢\u0006\u0002\n\u0000¨\u0006E"}, d2 = {"Lcom/facebook/AccessToken$Companion;", "", "()V", "ACCESS_TOKEN_KEY", "", "APPLICATION_ID_KEY", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AccessToken;", "CURRENT_JSON_FORMAT", "", "DATA_ACCESS_EXPIRATION_TIME", "DECLINED_PERMISSIONS_KEY", "DEFAULT_ACCESS_TOKEN_SOURCE", "Lcom/facebook/AccessTokenSource;", "DEFAULT_EXPIRATION_TIME", "Ljava/util/Date;", "DEFAULT_GRAPH_DOMAIN", "DEFAULT_LAST_REFRESH_TIME", "EXPIRED_PERMISSIONS_KEY", "EXPIRES_AT_KEY", "EXPIRES_IN_KEY", "GRAPH_DOMAIN", "LAST_REFRESH_KEY", "MAX_DATE", "PERMISSIONS_KEY", "SOURCE_KEY", "TOKEN_KEY", "USER_ID_KEY", "VERSION_KEY", "createExpired", "current", "createExpired$facebook_core_release", "createFromBundle", "requestedPermissions", "", "bundle", "Landroid/os/Bundle;", "source", "expirationBase", "applicationId", "createFromJSONObject", "jsonObject", "Lorg/json/JSONObject;", "createFromJSONObject$facebook_core_release", "createFromLegacyCache", "createFromLegacyCache$facebook_core_release", "createFromNativeLinkingIntent", "", "intent", "Landroid/content/Intent;", "accessTokenCallback", "Lcom/facebook/AccessToken$AccessTokenCreationCallback;", "createFromRefresh", "createFromRefresh$facebook_core_release", "expireCurrentAccessToken", "getCurrentAccessToken", "getPermissionsFromBundle", "key", "getPermissionsFromBundle$facebook_core_release", "isCurrentAccessTokenActive", "", "isDataAccessActive", "isLoggedInWithInstagram", "refreshCurrentAccessTokenAsync", "callback", "Lcom/facebook/AccessToken$AccessTokenRefreshCallback;", "setCurrentAccessToken", "accessToken", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lk$b */
    /* loaded from: classes2.dex */
    public static final class b {
        private b() {
        }

        public /* synthetic */ b(byte b) {
            this();
        }

        public static lk a() {
            return ln.c.a().a;
        }

        public static void a(lk lkVar) {
            ln.c.a().a(lkVar, true);
        }

        public static boolean b() {
            lk lkVar = ln.c.a().a;
            return lkVar != null && !lkVar.a();
        }

        public static lk a(Bundle bundle) {
            String string;
            lo loVar;
            dqc.d(bundle, "bundle");
            List<String> a = a(bundle, "com.facebook.TokenCachingStrategy.Permissions");
            List<String> a2 = a(bundle, "com.facebook.TokenCachingStrategy.DeclinedPermissions");
            List<String> a3 = a(bundle, "com.facebook.TokenCachingStrategy.ExpiredPermissions");
            me.a aVar = me.a;
            dqc.d(bundle, "bundle");
            String string2 = bundle.getString("com.facebook.TokenCachingStrategy.ApplicationId");
            if (qi.a(string2)) {
                string2 = ly.m();
            }
            String str = string2;
            me.a aVar2 = me.a;
            dqc.d(bundle, "bundle");
            String string3 = bundle.getString("com.facebook.TokenCachingStrategy.Token");
            if (string3 == null) {
                return null;
            }
            JSONObject h = qi.h(string3);
            if (h != null) {
                try {
                    string = h.getString("id");
                } catch (JSONException unused) {
                    return null;
                }
            } else {
                string = null;
            }
            if (str == null || string == null) {
                return null;
            }
            List<String> list = a;
            List<String> list2 = a2;
            List<String> list3 = a3;
            me.a aVar3 = me.a;
            dqc.d(bundle, "bundle");
            if (bundle.containsKey("com.facebook.TokenCachingStrategy.AccessTokenSource")) {
                loVar = (lo) bundle.getSerializable("com.facebook.TokenCachingStrategy.AccessTokenSource");
            } else {
                loVar = bundle.getBoolean("com.facebook.TokenCachingStrategy.IsSSO") ? lo.FACEBOOK_APPLICATION_WEB : lo.WEB_VIEW;
            }
            lo loVar2 = loVar;
            me.a aVar4 = me.a;
            dqc.d(bundle, "bundle");
            Date a4 = me.a.a(bundle, "com.facebook.TokenCachingStrategy.ExpirationDate");
            me.a aVar5 = me.a;
            dqc.d(bundle, "bundle");
            return new lk(string3, str, string, list, list2, list3, loVar2, a4, me.a.a(bundle, "com.facebook.TokenCachingStrategy.LastRefreshDate"), null);
        }

        private static List<String> a(Bundle bundle, String str) {
            dqc.d(bundle, "bundle");
            ArrayList<String> stringArrayList = bundle.getStringArrayList(str);
            if (stringArrayList != null) {
                List<String> unmodifiableList = Collections.unmodifiableList(new ArrayList(stringArrayList));
                dqc.b(unmodifiableList, "Collections.unmodifiable…ist(originalPermissions))");
                return unmodifiableList;
            }
            return dnc.a;
        }
    }

    static {
        Date date = new Date((long) LocationRequestCompat.PASSIVE_INTERVAL);
        m = date;
        n = date;
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/AccessToken$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AccessToken;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/facebook/AccessToken;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lk$c */
    /* loaded from: classes2.dex */
    public static final class c implements Parcelable.Creator<lk> {
        c() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ lk createFromParcel(Parcel parcel) {
            dqc.d(parcel, "source");
            return new lk(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ lk[] newArray(int i) {
            return new lk[i];
        }
    }
}
