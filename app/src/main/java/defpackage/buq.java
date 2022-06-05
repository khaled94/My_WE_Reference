package defpackage;

import android.os.Parcel;
import android.os.Parcelable;

/* renamed from: buq  reason: default package */
/* loaded from: classes2.dex */
public final class buq extends abb {
    public static final Parcelable.Creator<buq> CREATOR = new but();
    public final String a;
    public final long b;
    public final Long c;
    public final String d;
    public final String e;
    public final Double f;
    private final int g;
    private final Float h;

    /* JADX INFO: Access modifiers changed from: package-private */
    public buq(bus busVar) {
        this(busVar.c, busVar.d, busVar.e, busVar.b);
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public buq(String str, long j, Object obj, String str2) {
        aat.a(str);
        this.g = 2;
        this.a = str;
        this.b = j;
        this.e = str2;
        if (obj == null) {
            this.c = null;
            this.h = null;
            this.f = null;
            this.d = null;
        } else if (obj instanceof Long) {
            this.c = (Long) obj;
            this.h = null;
            this.f = null;
            this.d = null;
        } else if (obj instanceof String) {
            this.c = null;
            this.h = null;
            this.f = null;
            this.d = (String) obj;
        } else if (obj instanceof Double) {
            this.c = null;
            this.h = null;
            this.f = (Double) obj;
            this.d = null;
        } else {
            throw new IllegalArgumentException("User attribute given of un-supported type");
        }
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public buq(String str) {
        aat.a(str);
        this.g = 2;
        this.a = str;
        this.b = 0L;
        this.c = null;
        this.h = null;
        this.f = null;
        this.d = null;
        this.e = null;
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public buq(int i, String str, long j, Long l, Float f, String str2, String str3, Double d) {
        this.g = i;
        this.a = str;
        this.b = j;
        this.c = l;
        Double d2 = null;
        this.h = null;
        if (i == 1) {
            this.f = f != null ? Double.valueOf(f.doubleValue()) : d2;
        } else {
            this.f = d;
        }
        this.d = str2;
        this.e = str3;
    }

    public final Object a() {
        Long l = this.c;
        if (l != null) {
            return l;
        }
        Double d = this.f;
        if (d != null) {
            return d;
        }
        String str = this.d;
        if (str == null) {
            return null;
        }
        return str;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.g);
        abc.a(parcel, 2, this.a);
        abc.a(parcel, 3, this.b);
        abc.a(parcel, 4, this.c);
        abc.a(parcel, 5, (Float) null);
        abc.a(parcel, 6, this.d);
        abc.a(parcel, 7, this.e);
        Double d = this.f;
        if (d != null) {
            abc.b(parcel, 8, 8);
            parcel.writeDouble(d.doubleValue());
        }
        abc.b(parcel, a);
    }
}
