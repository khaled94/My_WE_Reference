package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.firebase_auth.zzbl;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: clf  reason: default package */
/* loaded from: classes2.dex */
public final class clf extends clw {
    public static final Parcelable.Creator<clf> CREATOR = new cle();
    private final String a;
    private final String b;
    private final long c;
    private final String d;

    public clf(String str, String str2, long j, String str3) {
        this.a = aat.a(str);
        this.b = str2;
        this.c = j;
        this.d = aat.a(str3);
    }

    public static clf a(JSONObject jSONObject) {
        if (!jSONObject.has("enrollmentTimestamp")) {
            throw new IllegalArgumentException("An enrollment timestamp in seconds of UTC time since Unix epoch is required to build a PhoneMultiFactorInfo instance.");
        }
        return new clf(jSONObject.optString("uid"), jSONObject.optString("displayName"), jSONObject.optLong("enrollmentTimestamp"), jSONObject.optString("phoneNumber"));
    }

    @Override // defpackage.clw
    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("factorIdKey", "phone");
            jSONObject.putOpt("uid", this.a);
            jSONObject.putOpt("displayName", this.b);
            jSONObject.putOpt("enrollmentTimestamp", Long.valueOf(this.c));
            jSONObject.putOpt("phoneNumber", this.d);
            return jSONObject;
        } catch (JSONException e) {
            throw new zzbl(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d);
        abc.b(parcel, a);
    }
}
