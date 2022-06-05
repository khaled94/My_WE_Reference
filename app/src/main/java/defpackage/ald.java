package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: ald  reason: default package */
/* loaded from: classes.dex */
public final class ald extends abb {
    public static final Parcelable.Creator<ald> CREATOR = new ale();
    public String a;
    public String b;
    public boolean c;
    public String d;
    public String e;
    public alk f;
    public String g;
    public long h;
    public long i;
    public boolean j;
    public cll k;
    public List<alg> l;
    private String m;

    public ald() {
        this.f = new alk();
    }

    public ald(String str, String str2, boolean z, String str3, String str4, alk alkVar, String str5, String str6, long j, long j2, boolean z2, cll cllVar, List<alg> list) {
        alk alkVar2;
        this.a = str;
        this.b = str2;
        this.c = z;
        this.d = str3;
        this.e = str4;
        if (alkVar == null) {
            alkVar2 = new alk();
        } else {
            alkVar2 = alk.a(alkVar);
        }
        this.f = alkVar2;
        this.m = str5;
        this.g = str6;
        this.h = j;
        this.i = j2;
        this.j = z2;
        this.k = cllVar;
        this.l = list == null ? ajw.f() : list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 2, this.a);
        abc.a(parcel, 3, this.b);
        abc.a(parcel, 4, this.c);
        abc.a(parcel, 5, this.d);
        abc.a(parcel, 6, this.e);
        abc.a(parcel, 7, this.f, i);
        abc.a(parcel, 8, this.m);
        abc.a(parcel, 9, this.g);
        abc.a(parcel, 10, this.h);
        abc.a(parcel, 11, this.i);
        abc.a(parcel, 12, this.j);
        abc.a(parcel, 13, this.k, i);
        abc.c(parcel, 14, this.l);
        abc.b(parcel, a);
    }
}
