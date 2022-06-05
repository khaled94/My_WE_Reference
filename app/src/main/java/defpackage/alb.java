package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import java.util.List;

/* renamed from: alb  reason: default package */
/* loaded from: classes.dex */
public final class alb extends abb {
    public static final Parcelable.Creator<alb> CREATOR = new alc();
    private String a;
    private boolean b;
    private String c;
    private boolean d;
    private alq e;
    private List<String> f;

    public alb() {
        this.e = alq.a();
    }

    public alb(String str, boolean z, String str2, boolean z2, alq alqVar, List<String> list) {
        this.a = str;
        this.b = z;
        this.c = str2;
        this.d = z2;
        this.e = alqVar == null ? alq.a() : alq.a(alqVar);
        this.f = list;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 2, this.a);
        abc.a(parcel, 3, this.b);
        abc.a(parcel, 4, this.c);
        abc.a(parcel, 5, this.d);
        abc.a(parcel, 6, this.e, i);
        abc.b(parcel, 7, this.f);
        abc.b(parcel, a);
    }
}
