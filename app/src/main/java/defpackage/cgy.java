package defpackage;

import android.content.Context;
import android.text.TextUtils;

/* renamed from: cgy  reason: default package */
/* loaded from: classes2.dex */
public final class cgy {
    public final String a;
    public final String b;
    public final String c;
    private final String d;
    private final String e;
    private final String f;
    private final String g;

    private cgy(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        aat.b(!aeg.b(str), "ApplicationId must be set.");
        this.b = str;
        this.a = str2;
        this.d = str3;
        this.e = str4;
        this.c = str5;
        this.f = str6;
        this.g = str7;
    }

    public static cgy a(Context context) {
        aaw aawVar = new aaw(context);
        String a = aawVar.a("google_app_id");
        if (TextUtils.isEmpty(a)) {
            return null;
        }
        return new cgy(a, aawVar.a("google_api_key"), aawVar.a("firebase_database_url"), aawVar.a("ga_trackingId"), aawVar.a("gcm_defaultSenderId"), aawVar.a("google_storage_bucket"), aawVar.a("project_id"));
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof cgy)) {
            return false;
        }
        cgy cgyVar = (cgy) obj;
        return aar.a(this.b, cgyVar.b) && aar.a(this.a, cgyVar.a) && aar.a(this.d, cgyVar.d) && aar.a(this.e, cgyVar.e) && aar.a(this.c, cgyVar.c) && aar.a(this.f, cgyVar.f) && aar.a(this.g, cgyVar.g);
    }

    public final int hashCode() {
        return aar.a(this.b, this.a, this.d, this.e, this.c, this.f, this.g);
    }

    public final String toString() {
        return aar.a(this).a("applicationId", this.b).a("apiKey", this.a).a("databaseUrl", this.d).a("gcmSenderId", this.c).a("storageBucket", this.f).a("projectId", this.g).toString();
    }
}
