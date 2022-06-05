package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: akt  reason: default package */
/* loaded from: classes.dex */
public final class akt extends abb {
    public static final Parcelable.Creator<akt> CREATOR = new aks();
    public final String a;
    public final String b;
    private final String c;

    public akt(String str, String str2, String str3) {
        this.a = str;
        this.b = str2;
        this.c = str3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c);
        abc.b(parcel, a);
    }
}
