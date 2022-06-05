package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: alg  reason: default package */
/* loaded from: classes.dex */
public final class alg extends abb {
    public static final Parcelable.Creator<alg> CREATOR = new alj();
    public final String a;
    public final String b;
    public final String c;
    public final long d;

    public alg(String str, String str2, String str3, long j) {
        this.a = str;
        this.b = aat.a(str2);
        this.c = str3;
        this.d = j;
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
