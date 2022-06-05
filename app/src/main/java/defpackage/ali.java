package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: ali  reason: default package */
/* loaded from: classes.dex */
public final class ali extends abb {
    public static final Parcelable.Creator<ali> CREATOR = new all();
    public String a;
    public String b;
    public String c;
    public String d;
    public String e;
    public String f;
    public String g;

    public ali() {
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public ali(String str, String str2, String str3, String str4, String str5, String str6, String str7) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.d = str4;
        this.e = str5;
        this.f = str6;
        this.g = str7;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 2, this.a);
        abc.a(parcel, 3, this.b);
        abc.a(parcel, 4, this.c);
        abc.a(parcel, 5, this.d);
        abc.a(parcel, 6, this.e);
        abc.a(parcel, 7, this.f);
        abc.a(parcel, 8, this.g);
        abc.b(parcel, a);
    }
}
