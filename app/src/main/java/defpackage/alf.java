package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.internal.firebase_auth.zzbl;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: alf  reason: default package */
/* loaded from: classes.dex */
public final class alf extends abb {
    public static final Parcelable.Creator<alf> CREATOR = new alh();
    public String a;
    public String b;
    public Long c;
    public Long d;
    private String e;

    public alf() {
        this.d = Long.valueOf(System.currentTimeMillis());
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public alf(String str, String str2, Long l, String str3, Long l2) {
        this.a = str;
        this.b = str2;
        this.c = l;
        this.e = str3;
        this.d = l2;
    }

    public final long a() {
        Long l = this.c;
        if (l == null) {
            return 0L;
        }
        return l.longValue();
    }

    public final String b() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.put("refresh_token", this.a);
            jSONObject.put("access_token", this.b);
            jSONObject.put("expires_in", this.c);
            jSONObject.put("token_type", this.e);
            jSONObject.put("issued_at", this.d);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new zzbl(e);
        }
    }

    public static alf a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            alf alfVar = new alf();
            alfVar.a = jSONObject.optString("refresh_token", null);
            alfVar.b = jSONObject.optString("access_token", null);
            alfVar.c = Long.valueOf(jSONObject.optLong("expires_in"));
            alfVar.e = jSONObject.optString("token_type", null);
            alfVar.d = Long.valueOf(jSONObject.optLong("issued_at"));
            return alfVar;
        } catch (JSONException e) {
            throw new zzbl(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 2, this.a);
        abc.a(parcel, 3, this.b);
        abc.a(parcel, 4, Long.valueOf(a()));
        abc.a(parcel, 5, this.e);
        abc.a(parcel, 6, Long.valueOf(this.d.longValue()));
        abc.b(parcel, a);
    }
}
