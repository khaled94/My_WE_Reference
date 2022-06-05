package defpackage;

import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: baz  reason: default package */
/* loaded from: classes.dex */
public final class baz extends abb {
    public static final Parcelable.Creator<baz> CREATOR = new bay();
    public final long a;
    public final long b;
    public final boolean c;
    public final String d;
    public final String e;
    public final String f;
    public final Bundle g;

    public baz(long j, long j2, boolean z, String str, String str2, String str3, Bundle bundle) {
        this.a = j;
        this.b = j2;
        this.c = z;
        this.d = str;
        this.e = str2;
        this.f = str3;
        this.g = bundle;
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
        abc.b(parcel, a);
    }
}
