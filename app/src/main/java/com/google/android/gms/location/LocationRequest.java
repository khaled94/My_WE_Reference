package com.google.android.gms.location;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.core.location.LocationRequestCompat;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class LocationRequest extends abb implements ReflectedParcelable {
    public static final Parcelable.Creator<LocationRequest> CREATOR = new biv();
    int a;
    long b;
    long c;
    boolean d;
    long e;
    int f;
    float g;
    long h;
    boolean i;

    @Deprecated
    public LocationRequest() {
        this.a = 102;
        this.b = 3600000L;
        this.c = 600000L;
        this.d = false;
        this.e = LocationRequestCompat.PASSIVE_INTERVAL;
        this.f = Integer.MAX_VALUE;
        this.g = 0.0f;
        this.h = 0L;
        this.i = false;
    }

    private long a() {
        long j = this.h;
        long j2 = this.b;
        return j < j2 ? j2 : j;
    }

    public final boolean equals(Object obj) {
        if (obj instanceof LocationRequest) {
            LocationRequest locationRequest = (LocationRequest) obj;
            if (this.a == locationRequest.a && this.b == locationRequest.b && this.c == locationRequest.c && this.d == locationRequest.d && this.e == locationRequest.e && this.f == locationRequest.f && this.g == locationRequest.g && a() == locationRequest.a() && this.i == locationRequest.i) {
                return true;
            }
        }
        return false;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Integer.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.g), Long.valueOf(this.h)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Request[");
        int i = this.a;
        sb.append(i != 100 ? i != 102 ? i != 104 ? i != 105 ? "???" : "PRIORITY_NO_POWER" : "PRIORITY_LOW_POWER" : "PRIORITY_BALANCED_POWER_ACCURACY" : "PRIORITY_HIGH_ACCURACY");
        if (this.a != 105) {
            sb.append(" requested=");
            sb.append(this.b);
            sb.append("ms");
        }
        sb.append(" fastest=");
        sb.append(this.c);
        sb.append("ms");
        if (this.h > this.b) {
            sb.append(" maxWait=");
            sb.append(this.h);
            sb.append("ms");
        }
        if (this.g > 0.0f) {
            sb.append(" smallestDisplacement=");
            sb.append(this.g);
            sb.append("m");
        }
        long j = this.e;
        if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.f != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.f);
        }
        sb.append(']');
        return sb.toString();
    }

    public LocationRequest(int i, long j, long j2, boolean z, long j3, int i2, float f, long j4, boolean z2) {
        this.a = i;
        this.b = j;
        this.c = j2;
        this.d = z;
        this.e = j3;
        this.f = i2;
        this.g = f;
        this.h = j4;
        this.i = z2;
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
        abc.a(parcel, 8, this.h);
        abc.a(parcel, 9, this.i);
        abc.b(parcel, a);
    }
}
