package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LatLngBounds extends abb implements ReflectedParcelable {
    public static final Parcelable.Creator<LatLngBounds> CREATOR = new bkr();
    public final LatLng a;
    public final LatLng b;

    public LatLngBounds(LatLng latLng, LatLng latLng2) {
        aat.a(latLng, "null southwest");
        aat.a(latLng2, "null northeast");
        aat.a(latLng2.a >= latLng.a, "southern latitude exceeds northern latitude (%s > %s)", Double.valueOf(latLng.a), Double.valueOf(latLng2.a));
        this.a = latLng;
        this.b = latLng2;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, this.b});
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof LatLngBounds)) {
            return false;
        }
        LatLngBounds latLngBounds = (LatLngBounds) obj;
        return this.a.equals(latLngBounds.a) && this.b.equals(latLngBounds.b);
    }

    public final String toString() {
        return aar.a(this).a("southwest", this.a).a("northeast", this.b).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 2, this.a, i);
        abc.a(parcel, 3, this.b, i);
        abc.b(parcel, a);
    }
}
