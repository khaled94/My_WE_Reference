package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.internal.firebase_auth.zzbl;
import org.json.JSONException;
import org.json.JSONObject;

/* renamed from: ckm  reason: default package */
/* loaded from: classes2.dex */
public final class ckm extends abb implements chw {
    public static final Parcelable.Creator<ckm> CREATOR = new ckl();
    String a;
    String b;
    String c;
    private String d;
    private String e;
    private Uri f;
    private String g;
    private String h;
    private boolean i;

    public ckm(String str, String str2, String str3, String str4, String str5, String str6, boolean z, String str7) {
        this.a = str;
        this.b = str2;
        this.g = str3;
        this.h = str4;
        this.d = str5;
        this.e = str6;
        if (!TextUtils.isEmpty(str6)) {
            this.f = Uri.parse(this.e);
        }
        this.i = z;
        this.c = str7;
    }

    public ckm(ald aldVar, String str) {
        aat.a(aldVar);
        aat.a(str);
        this.a = aat.a(aldVar.a);
        this.b = str;
        this.g = aldVar.b;
        this.d = aldVar.d;
        Uri parse = !TextUtils.isEmpty(aldVar.e) ? Uri.parse(aldVar.e) : null;
        if (parse != null) {
            this.e = parse.toString();
            this.f = parse;
        }
        this.i = aldVar.c;
        this.c = null;
        this.h = aldVar.g;
    }

    public ckm(ali aliVar) {
        aat.a(aliVar);
        this.a = aliVar.a;
        this.b = aat.a(aliVar.d);
        this.d = aliVar.b;
        Uri parse = !TextUtils.isEmpty(aliVar.c) ? Uri.parse(aliVar.c) : null;
        if (parse != null) {
            this.e = parse.toString();
            this.f = parse;
        }
        this.g = aliVar.g;
        this.h = aliVar.f;
        this.i = false;
        this.c = aliVar.e;
    }

    @Override // defpackage.chw
    public final String m() {
        return this.b;
    }

    public final String a() {
        JSONObject jSONObject = new JSONObject();
        try {
            jSONObject.putOpt("userId", this.a);
            jSONObject.putOpt("providerId", this.b);
            jSONObject.putOpt("displayName", this.d);
            jSONObject.putOpt("photoUrl", this.e);
            jSONObject.putOpt(NotificationCompat.CATEGORY_EMAIL, this.g);
            jSONObject.putOpt("phoneNumber", this.h);
            jSONObject.putOpt("isEmailVerified", Boolean.valueOf(this.i));
            jSONObject.putOpt("rawUserInfo", this.c);
            return jSONObject.toString();
        } catch (JSONException e) {
            throw new zzbl(e);
        }
    }

    public static ckm a(String str) {
        try {
            JSONObject jSONObject = new JSONObject(str);
            return new ckm(jSONObject.optString("userId"), jSONObject.optString("providerId"), jSONObject.optString(NotificationCompat.CATEGORY_EMAIL), jSONObject.optString("phoneNumber"), jSONObject.optString("displayName"), jSONObject.optString("photoUrl"), jSONObject.optBoolean("isEmailVerified"), jSONObject.optString("rawUserInfo"));
        } catch (JSONException e) {
            throw new zzbl(e);
        }
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.d);
        abc.a(parcel, 4, this.e);
        abc.a(parcel, 5, this.g);
        abc.a(parcel, 6, this.h);
        abc.a(parcel, 7, this.i);
        abc.a(parcel, 8, this.c);
        abc.b(parcel, a);
    }
}
