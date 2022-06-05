package com.google.android.gms.location.places.internal;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Locale;

/* loaded from: classes.dex */
public final class PlaceEntity extends abb implements bgo, ReflectedParcelable {
    public static final Parcelable.Creator<PlaceEntity> CREATOR = new bgy();
    private final String a;
    private final LatLng b;
    private final float c;
    private final LatLngBounds d;
    private final String e;
    private final Uri f;
    private final boolean g;
    private final float h;
    private final int i;
    private final List<Integer> j;
    private final String k;
    private final String l;
    private final String m;
    private final List<String> n;
    private final bhd o;
    private final bha p;
    private final String q;
    private Locale r;

    public PlaceEntity(String str, List<Integer> list, String str2, String str3, String str4, List<String> list2, LatLng latLng, float f, LatLngBounds latLngBounds, String str5, Uri uri, boolean z, float f2, int i, bhd bhdVar, bha bhaVar, String str6) {
        this.a = str;
        this.j = Collections.unmodifiableList(list);
        this.k = str2;
        this.l = str3;
        this.m = str4;
        this.n = list2 != null ? list2 : Collections.emptyList();
        this.b = latLng;
        this.c = f;
        this.d = latLngBounds;
        this.e = str5 != null ? str5 : "UTC";
        this.f = uri;
        this.g = z;
        this.h = f2;
        this.i = i;
        this.r = null;
        this.o = bhdVar;
        this.p = bhaVar;
        this.q = str6;
    }

    @Override // defpackage.bgo
    public final LatLng b() {
        return this.b;
    }

    public final String toString() {
        return aar.a(this).a("id", this.a).a("placeTypes", this.j).a("locale", this.r).a("name", this.k).a("address", this.l).a("phoneNumber", this.m).a("latlng", this.b).a("viewport", this.d).a("websiteUri", this.f).a("isPermanentlyClosed", Boolean.valueOf(this.g)).a("priceLevel", Integer.valueOf(this.i)).toString();
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.r});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof PlaceEntity)) {
            return false;
        }
        PlaceEntity placeEntity = (PlaceEntity) obj;
        return this.a.equals(placeEntity.a) && aar.a(this.r, placeEntity.r);
    }

    @Override // defpackage.bgo
    public final /* synthetic */ CharSequence a() {
        return this.k;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 4, this.b, i);
        abc.a(parcel, 5, this.c);
        abc.a(parcel, 6, this.d, i);
        abc.a(parcel, 7, this.e);
        abc.a(parcel, 8, this.f, i);
        abc.a(parcel, 9, this.g);
        abc.a(parcel, 10, this.h);
        abc.a(parcel, 11, this.i);
        abc.a(parcel, 14, this.l);
        abc.a(parcel, 15, this.m);
        abc.b(parcel, 17, this.n);
        abc.a(parcel, 19, this.k);
        abc.a(parcel, 20, this.j);
        abc.a(parcel, 21, this.o, i);
        abc.a(parcel, 22, this.p, i);
        abc.a(parcel, 23, this.q);
        abc.b(parcel, a);
    }
}
