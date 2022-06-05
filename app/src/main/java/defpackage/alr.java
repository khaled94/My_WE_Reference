package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;

/* renamed from: alr  reason: default package */
/* loaded from: classes.dex */
public final class alr extends abb {
    public static final Parcelable.Creator<alr> CREATOR = new alt();
    public boolean a;
    public String b;
    private String c;
    private String d;
    private String e;
    private String f;
    private String g;
    private String h;
    private String i;
    private String j;
    private boolean k;
    private String l;
    private String m;
    private String n;
    private boolean o;
    private String p;

    public alr() {
        this.k = true;
        this.a = true;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public alr(String str, String str2, String str3, String str4, String str5, String str6, String str7, String str8, boolean z, boolean z2, String str9, String str10, String str11, String str12, boolean z3, String str13) {
        this.c = str;
        this.d = str2;
        this.e = str3;
        this.f = str4;
        this.g = str5;
        this.h = str6;
        this.i = str7;
        this.j = str8;
        this.k = z;
        this.a = z2;
        this.l = str9;
        this.m = str10;
        this.n = str11;
        this.b = str12;
        this.o = z3;
        this.p = str13;
    }

    public alr(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.c = "http://localhost";
        this.e = str;
        this.f = str2;
        this.j = str4;
        this.l = str5;
        this.b = str6;
        this.p = str7;
        this.k = true;
        if (TextUtils.isEmpty(str) && TextUtils.isEmpty(this.f) && TextUtils.isEmpty(this.l)) {
            throw new IllegalArgumentException("idToken, accessToken and authCode cannot all be null");
        }
        this.g = aat.a(str3);
        this.h = null;
        StringBuilder sb = new StringBuilder();
        if (!TextUtils.isEmpty(this.e)) {
            sb.append("id_token=");
            sb.append(this.e);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.f)) {
            sb.append("access_token=");
            sb.append(this.f);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.h)) {
            sb.append("identifier=");
            sb.append(this.h);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.j)) {
            sb.append("oauth_token_secret=");
            sb.append(this.j);
            sb.append("&");
        }
        if (!TextUtils.isEmpty(this.l)) {
            sb.append("code=");
            sb.append(this.l);
            sb.append("&");
        }
        sb.append("providerId=");
        sb.append(this.g);
        this.i = sb.toString();
        this.a = true;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 2, this.c);
        abc.a(parcel, 3, this.d);
        abc.a(parcel, 4, this.e);
        abc.a(parcel, 5, this.f);
        abc.a(parcel, 6, this.g);
        abc.a(parcel, 7, this.h);
        abc.a(parcel, 8, this.i);
        abc.a(parcel, 9, this.j);
        abc.a(parcel, 10, this.k);
        abc.a(parcel, 11, this.a);
        abc.a(parcel, 12, this.l);
        abc.a(parcel, 13, this.m);
        abc.a(parcel, 14, this.n);
        abc.a(parcel, 15, this.b);
        abc.a(parcel, 16, this.o);
        abc.a(parcel, 17, this.p);
        abc.b(parcel, a);
    }
}
