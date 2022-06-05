package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aaq  reason: default package */
/* loaded from: classes.dex */
public final class aaq extends abb {
    public static final Parcelable.Creator<aaq> CREATOR = new abx();
    private final int a;
    private final int b;
    private final int c;
    private final long d;
    private final long e;
    private final String f;
    private final String g;
    private final int h;
    private final int i;

    public aaq(int i, int i2, int i3, long j, long j2, String str, String str2, int i4, int i5) {
        this.a = i;
        this.b = i2;
        this.c = i3;
        this.d = j;
        this.e = j2;
        this.f = str;
        this.g = str2;
        this.h = i4;
        this.i = i5;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d);
        abc.a(parcel, 5, this.e);
        abc.a(parcel, 6, this.f);
        abc.a(parcel, 7, this.g);
        abc.a(parcel, 8, this.h);
        abc.a(parcel, 9, this.i);
        abc.b(parcel, a);
    }
}
