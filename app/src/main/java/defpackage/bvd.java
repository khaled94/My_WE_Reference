package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: bvd  reason: default package */
/* loaded from: classes2.dex */
public final class bvd extends abb {
    public static final Parcelable.Creator<bvd> CREATOR = new bvg();
    public String a;
    public String b;
    public buq c;
    public long d;
    public boolean e;
    public String f;
    public bli g;
    public long h;
    public bli i;
    public long j;
    public bli k;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bvd(bvd bvdVar) {
        aat.a(bvdVar);
        this.a = bvdVar.a;
        this.b = bvdVar.b;
        this.c = bvdVar.c;
        this.d = bvdVar.d;
        this.e = bvdVar.e;
        this.f = bvdVar.f;
        this.g = bvdVar.g;
        this.h = bvdVar.h;
        this.i = bvdVar.i;
        this.j = bvdVar.j;
        this.k = bvdVar.k;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bvd(String str, String str2, buq buqVar, long j, boolean z, String str3, bli bliVar, long j2, bli bliVar2, long j3, bli bliVar3) {
        this.a = str;
        this.b = str2;
        this.c = buqVar;
        this.d = j;
        this.e = z;
        this.f = str3;
        this.g = bliVar;
        this.h = j2;
        this.i = bliVar2;
        this.j = j3;
        this.k = bliVar3;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 2, this.a);
        abc.a(parcel, 3, this.b);
        abc.a(parcel, 4, this.c, i);
        abc.a(parcel, 5, this.d);
        abc.a(parcel, 6, this.e);
        abc.a(parcel, 7, this.f);
        abc.a(parcel, 8, this.g, i);
        abc.a(parcel, 9, this.h);
        abc.a(parcel, 10, this.i, i);
        abc.a(parcel, 11, this.j);
        abc.a(parcel, 12, this.k, i);
        abc.b(parcel, a);
    }
}
