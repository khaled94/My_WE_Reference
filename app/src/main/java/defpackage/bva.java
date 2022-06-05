package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.text.TextUtils;
import java.util.List;

/* renamed from: bva  reason: default package */
/* loaded from: classes2.dex */
public final class bva extends abb {
    public static final Parcelable.Creator<bva> CREATOR = new buz();
    public final String a;
    public final String b;
    public final String c;
    public final String d;
    public final long e;
    public final long f;
    public final String g;
    public final boolean h;
    public final boolean i;
    public final long j;
    public final String k;
    public final long l;
    public final long m;
    public final int n;
    public final boolean o;
    public final boolean p;
    public final boolean q;
    public final String r;
    public final Boolean s;
    public final long t;
    public final List<String> u;

    /* JADX INFO: Access modifiers changed from: package-private */
    public bva(String str, String str2, String str3, long j, String str4, long j2, long j3, String str5, boolean z, boolean z2, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list) {
        aat.a(str);
        this.a = str;
        this.b = TextUtils.isEmpty(str2) ? null : str2;
        this.c = str3;
        this.j = j;
        this.d = str4;
        this.e = j2;
        this.f = j3;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = j5;
        this.n = i;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = str7;
        this.s = bool;
        this.t = j6;
        this.u = list;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bva(String str, String str2, String str3, String str4, long j, long j2, String str5, boolean z, boolean z2, long j3, String str6, long j4, long j5, int i, boolean z3, boolean z4, boolean z5, String str7, Boolean bool, long j6, List<String> list) {
        this.a = str;
        this.b = str2;
        this.c = str3;
        this.j = j3;
        this.d = str4;
        this.e = j;
        this.f = j2;
        this.g = str5;
        this.h = z;
        this.i = z2;
        this.k = str6;
        this.l = j4;
        this.m = j5;
        this.n = i;
        this.o = z3;
        this.p = z4;
        this.q = z5;
        this.r = str7;
        this.s = bool;
        this.t = j6;
        this.u = list;
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
        abc.a(parcel, 9, this.h);
        abc.a(parcel, 10, this.i);
        abc.a(parcel, 11, this.j);
        abc.a(parcel, 12, this.k);
        abc.a(parcel, 13, this.l);
        abc.a(parcel, 14, this.m);
        abc.a(parcel, 15, this.n);
        abc.a(parcel, 16, this.o);
        abc.a(parcel, 17, this.p);
        abc.a(parcel, 18, this.q);
        abc.a(parcel, 19, this.r);
        abc.a(parcel, 21, this.s);
        abc.a(parcel, 22, this.t);
        abc.b(parcel, 23, this.u);
        abc.b(parcel, a);
    }
}
