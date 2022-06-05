package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.util.Base64;
import kotlin.Metadata;
import org.json.JSONException;
import org.json.JSONObject;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\b\n\u0002\u0010\u0002\n\u0002\b\u0004\u0018\u0000 $2\u00020\u0001:\u0001$B\u000f\b\u0016\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004B\u000f\b\u0010\u0012\u0006\u0010\u0005\u001a\u00020\u0006¢\u0006\u0002\u0010\u0007B\u000f\b\u0010\u0012\u0006\u0010\b\u001a\u00020\t¢\u0006\u0002\u0010\nB\u001f\b\u0017\u0012\u0006\u0010\u000b\u001a\u00020\u0003\u0012\u0006\u0010\f\u001a\u00020\u0003\u0012\u0006\u0010\r\u001a\u00020\u0003¢\u0006\u0002\u0010\u000eJ\b\u0010\u0013\u001a\u00020\u0014H\u0016J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0018H\u0096\u0002J\b\u0010\u0019\u001a\u00020\u0014H\u0016J\u0010\u0010\u001a\u001a\u00020\u00162\u0006\u0010\u001b\u001a\u00020\u0003H\u0002J\b\u0010\u001c\u001a\u00020\u0003H\u0007J\r\u0010\u001d\u001a\u00020\tH\u0000¢\u0006\u0002\b\u001eJ\b\u0010\u001f\u001a\u00020\u0003H\u0016J\u0018\u0010 \u001a\u00020!2\u0006\u0010\"\u001a\u00020\u00062\u0006\u0010#\u001a\u00020\u0014H\u0016R\u0011\u0010\u000b\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0011\u0010\r\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0010R\u0011\u0010\f\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0010¨\u0006%"}, d2 = {"Lcom/facebook/AuthenticationTokenHeader;", "Landroid/os/Parcelable;", "encodedHeaderString", "", "(Ljava/lang/String;)V", "parcel", "Landroid/os/Parcel;", "(Landroid/os/Parcel;)V", "jsonObject", "Lorg/json/JSONObject;", "(Lorg/json/JSONObject;)V", "alg", "typ", "kid", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "getAlg", "()Ljava/lang/String;", "getKid", "getTyp", "describeContents", "", "equals", "", "other", "", "hashCode", "isValidHeader", "headerString", "toEnCodedString", "toJSONObject", "toJSONObject$facebook_core_release", "toString", "writeToParcel", "", "dest", "flags", "Companion", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
/* renamed from: lt  reason: default package */
/* loaded from: classes2.dex */
public final class lt implements Parcelable {
    final String a;
    private final String c;
    private final String d;
    public static final a b = new a((byte) 0);
    public static final Parcelable.Creator<lt> CREATOR = new b();

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public lt(String str) {
        dqc.d(str, "encodedHeaderString");
        if (!a(str)) {
            throw new IllegalArgumentException("Invalid Header".toString());
        }
        byte[] decode = Base64.decode(str, 0);
        dqc.b(decode, "decodedBytes");
        JSONObject jSONObject = new JSONObject(new String(decode, dsd.a));
        String string = jSONObject.getString("alg");
        dqc.b(string, "jsonObj.getString(\"alg\")");
        this.c = string;
        String string2 = jSONObject.getString("typ");
        dqc.b(string2, "jsonObj.getString(\"typ\")");
        this.d = string2;
        String string3 = jSONObject.getString("kid");
        dqc.b(string3, "jsonObj.getString(\"kid\")");
        this.a = string3;
    }

    public lt(Parcel parcel) {
        dqc.d(parcel, "parcel");
        this.c = qj.a(parcel.readString(), "alg");
        this.d = qj.a(parcel.readString(), "typ");
        this.a = qj.a(parcel.readString(), "kid");
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        dqc.d(parcel, "dest");
        parcel.writeString(this.c);
        parcel.writeString(this.d);
        parcel.writeString(this.a);
    }

    public final String toString() {
        String jSONObject = a().toString();
        dqc.b(jSONObject, "headerJsonObject.toString()");
        return jSONObject;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof lt)) {
            return false;
        }
        lt ltVar = (lt) obj;
        return dqc.a((Object) this.c, (Object) ltVar.c) && dqc.a((Object) this.d, (Object) ltVar.d) && dqc.a((Object) this.a, (Object) ltVar.a);
    }

    public final int hashCode() {
        return ((((this.c.hashCode() + 527) * 31) + this.d.hashCode()) * 31) + this.a.hashCode();
    }

    private static boolean a(String str) {
        qj.b(str, "encodedHeaderString");
        byte[] decode = Base64.decode(str, 0);
        dqc.b(decode, "decodedBytes");
        try {
            JSONObject jSONObject = new JSONObject(new String(decode, dsd.a));
            String optString = jSONObject.optString("alg");
            dqc.b(optString, "alg");
            boolean z = (optString.length() > 0) && dqc.a((Object) optString, (Object) "RS256");
            String optString2 = jSONObject.optString("kid");
            dqc.b(optString2, "jsonObj.optString(\"kid\")");
            boolean z2 = optString2.length() > 0;
            String optString3 = jSONObject.optString("typ");
            dqc.b(optString3, "jsonObj.optString(\"typ\")");
            return z && z2 && (optString3.length() > 0);
        } catch (JSONException unused) {
            return false;
        }
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        jSONObject.put("alg", this.c);
        jSONObject.put("typ", this.d);
        jSONObject.put("kid", this.a);
        return jSONObject;
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002¢\u0006\u0002\u0010\u0002R\u0016\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006X\u0087\u0004¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lcom/facebook/AuthenticationTokenHeader$Companion;", "", "()V", "CREATOR", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenHeader;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lt$a */
    /* loaded from: classes2.dex */
    public static final class a {
        private a() {
        }

        public /* synthetic */ a(byte b) {
            this();
        }
    }

    @Metadata(d1 = {"\u0000%\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0011\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002*\u0001\u0000\b\n\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001J\u0010\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0004\u001a\u00020\u0005H\u0016J\u001d\u0010\u0006\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00020\u00072\u0006\u0010\b\u001a\u00020\tH\u0016¢\u0006\u0002\u0010\n¨\u0006\u000b"}, d2 = {"com/facebook/AuthenticationTokenHeader$Companion$CREATOR$1", "Landroid/os/Parcelable$Creator;", "Lcom/facebook/AuthenticationTokenHeader;", "createFromParcel", "source", "Landroid/os/Parcel;", "newArray", "", "size", "", "(I)[Lcom/facebook/AuthenticationTokenHeader;", "facebook-core_release"}, k = 1, mv = {1, 5, 1})
    /* renamed from: lt$b */
    /* loaded from: classes2.dex */
    public static final class b implements Parcelable.Creator<lt> {
        b() {
        }

        @Override // android.os.Parcelable.Creator
        public final /* synthetic */ lt createFromParcel(Parcel parcel) {
            dqc.d(parcel, "source");
            return new lt(parcel);
        }

        @Override // android.os.Parcelable.Creator
        public final /* bridge */ /* synthetic */ lt[] newArray(int i) {
            return new lt[i];
        }
    }
}
