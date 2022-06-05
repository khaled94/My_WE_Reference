package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: cks  reason: default package */
/* loaded from: classes2.dex */
public final class cks implements chn {
    public static final Parcelable.Creator<cks> CREATOR = new ckr();
    private long a;
    private long b;

    public cks(long j, long j2) {
        this.a = j;
        this.b = j2;
    }

    @Override // android.os.Parcelable
    public final int describeContents() {
        return 0;
    }

    public final JSONObject a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("lastSignInTimestamp", this.a);
            jSONObject.put("creationTimestamp", this.b);
        } catch (JSONException unused) {
        }
        return jSONObject;
    }

    public static cks a(JSONObject jSONObject) {
        if (jSONObject == null) {
            return null;
        }
        try {
            return new cks(jSONObject.getLong("lastSignInTimestamp"), jSONObject.getLong("creationTimestamp"));
        } catch (JSONException unused) {
            return null;
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.b(parcel, a);
    }
}
