package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: aag  reason: default package */
/* loaded from: classes.dex */
public final class aag extends abb {
    public static final Parcelable.Creator<aag> CREATOR = new acw();
    final aav a;
    public final boolean b;
    public final boolean c;
    public final int[] d;
    public final int e;
    public final int[] f;

    public aag(aav aavVar, boolean z, boolean z2, int[] iArr, int i, int[] iArr2) {
        this.a = aavVar;
        this.b = z;
        this.c = z2;
        this.d = iArr;
        this.e = i;
        this.f = iArr2;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a, i);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d);
        abc.a(parcel, 5, this.e);
        abc.a(parcel, 6, this.f);
        abc.b(parcel, a);
    }
}
