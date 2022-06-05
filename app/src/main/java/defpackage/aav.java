package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aav  reason: default package */
/* loaded from: classes.dex */
public final class aav extends abb {
    public static final Parcelable.Creator<aav> CREATOR = new acn();
    public final int a;
    public final boolean b;
    public final boolean c;
    public final int d;
    public final int e;

    public aav(int i, boolean z, boolean z2, int i2, int i3) {
        this.a = i;
        this.b = z;
        this.c = z2;
        this.d = i2;
        this.e = i3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d);
        abc.a(parcel, 5, this.e);
        abc.b(parcel, a);
    }
}
