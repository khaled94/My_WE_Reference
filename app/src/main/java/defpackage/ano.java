package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.location.LocationRequest;
import java.util.Collections;
import java.util.List;

/* renamed from: ano  reason: default package */
/* loaded from: classes.dex */
public final class ano extends abb {
    final LocationRequest b;
    final List<aae> c;
    final String d;
    final boolean e;
    final boolean f;
    final boolean g;
    final String h;
    final boolean i;
    boolean j;
    String k;
    long l;
    static final List<aae> a = Collections.emptyList();
    public static final Parcelable.Creator<ano> CREATOR = new anp();

    /* JADX INFO: Access modifiers changed from: package-private */
    public ano(LocationRequest locationRequest, List<aae> list, String str, boolean z, boolean z2, boolean z3, String str2, boolean z4, boolean z5, String str3, long j) {
        this.b = locationRequest;
        this.c = list;
        this.d = str;
        this.e = z;
        this.f = z2;
        this.g = z3;
        this.h = str2;
        this.i = z4;
        this.j = z5;
        this.k = str3;
        this.l = j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof ano) {
            ano anoVar = (ano) obj;
            if (aar.a(this.b, anoVar.b) && aar.a(this.c, anoVar.c) && aar.a(this.d, anoVar.d) && this.e == anoVar.e && this.f == anoVar.f && this.g == anoVar.g && aar.a(this.h, anoVar.h) && this.i == anoVar.i && this.j == anoVar.j && aar.a(this.k, anoVar.k)) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return this.b.hashCode();
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(this.b);
        if (this.d != null) {
            sb.append(" tag=");
            sb.append(this.d);
        }
        if (this.h != null) {
            sb.append(" moduleId=");
            sb.append(this.h);
        }
        if (this.k != null) {
            sb.append(" contextAttributionTag=");
            sb.append(this.k);
        }
        sb.append(" hideAppOps=");
        sb.append(this.e);
        sb.append(" clients=");
        sb.append(this.c);
        sb.append(" forceCoarseLocation=");
        sb.append(this.f);
        if (this.g) {
            sb.append(" exemptFromBackgroundThrottle");
        }
        if (this.i) {
            sb.append(" locationSettingsIgnored");
        }
        if (this.j) {
            sb.append(" inaccurateLocationsDelayed");
        }
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.b, i);
        abc.c(parcel, 5, this.c);
        abc.a(parcel, 6, this.d);
        abc.a(parcel, 7, this.e);
        abc.a(parcel, 8, this.f);
        abc.a(parcel, 9, this.g);
        abc.a(parcel, 10, this.h);
        abc.a(parcel, 11, this.i);
        abc.a(parcel, 12, this.j);
        abc.a(parcel, 13, this.k);
        abc.a(parcel, 14, this.l);
        abc.b(parcel, a2);
    }
}
