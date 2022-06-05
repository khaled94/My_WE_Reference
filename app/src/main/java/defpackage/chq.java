package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: chq  reason: default package */
/* loaded from: classes2.dex */
public class chq extends chh {
    public static final Parcelable.Creator<chq> CREATOR = new clt();
    private final String a;
    private final String b;

    /* JADX INFO: Access modifiers changed from: package-private */
    public chq(String str, String str2) {
        if (str == null && str2 == null) {
            throw new IllegalArgumentException("Must specify an idToken or an accessToken.");
        }
        this.a = a(str, "idToken");
        this.b = a(str2, "accessToken");
    }

    @Override // defpackage.chh
    public final String a() {
        return "google.com";
    }

    @Override // defpackage.chh
    public final String b() {
        return "google.com";
    }

    public static alr a(chq chqVar, String str) {
        aat.a(chqVar);
        return new alr(chqVar.a, chqVar.b, chqVar.a(), null, null, str, null);
    }

    private static String a(String str, String str2) {
        if (str == null || !TextUtils.isEmpty(str)) {
            return str;
        }
        throw new IllegalArgumentException(String.valueOf(str2).concat(" must not be empty"));
    }

    @Override // android.os.Parcelable
    public void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.b(parcel, a);
    }
}
