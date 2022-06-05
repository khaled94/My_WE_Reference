package com.google.android.gms.location;

import android.location.Location;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public final class LocationResult extends abb implements ReflectedParcelable {
    private final List<Location> b;
    public static final List<Location> a = Collections.emptyList();
    public static final Parcelable.Creator<LocationResult> CREATOR = new biw();

    public LocationResult(List<Location> list) {
        this.b = list;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationResult) {
            LocationResult locationResult = (LocationResult) obj;
            if (locationResult.b.size() != this.b.size()) {
                return false;
            }
            Iterator<Location> it = locationResult.b.iterator();
            Iterator<Location> it2 = this.b.iterator();
            while (it.hasNext()) {
                if (it2.next().getTime() != it.next().getTime()) {
                    return false;
                }
            }
            return true;
        }
        return false;
    }

    public final int hashCode() {
        int i = 17;
        for (Location location : this.b) {
            long time = location.getTime();
            i = (i * 31) + ((int) (time ^ (time >>> 32)));
        }
        return i;
    }

    public final String toString() {
        String valueOf = String.valueOf(this.b);
        StringBuilder sb = new StringBuilder(String.valueOf(valueOf).length() + 27);
        sb.append("LocationResult[locations: ");
        sb.append(valueOf);
        sb.append("]");
        return sb.toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = abc.a(parcel, 20293);
        abc.c(parcel, 1, this.b);
        abc.b(parcel, a2);
    }
}
