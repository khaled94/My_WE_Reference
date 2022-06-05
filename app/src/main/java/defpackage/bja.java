package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import android.os.SystemClock;
import androidx.core.location.LocationRequestCompat;
import java.util.Arrays;

/* renamed from: bja  reason: default package */
/* loaded from: classes2.dex */
public final class bja extends abb {
    public static final Parcelable.Creator<bja> CREATOR = new bjb();
    boolean a;
    long b;
    float c;
    long d;
    int e;

    public bja() {
        this(true, 50L, 0.0f, LocationRequestCompat.PASSIVE_INTERVAL, Integer.MAX_VALUE);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof bja)) {
            return false;
        }
        bja bjaVar = (bja) obj;
        return this.a == bjaVar.a && this.b == bjaVar.b && Float.compare(this.c, bjaVar.c) == 0 && this.d == bjaVar.d && this.e == bjaVar.e;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{Boolean.valueOf(this.a), Long.valueOf(this.b), Float.valueOf(this.c), Long.valueOf(this.d), Integer.valueOf(this.e)});
    }

    public final String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("DeviceOrientationRequest[mShouldUseMag=");
        sb.append(this.a);
        sb.append(" mMinimumSamplingPeriodMs=");
        sb.append(this.b);
        sb.append(" mSmallestAngleChangeRadians=");
        sb.append(this.c);
        long j = this.d;
        if (j != LocationRequestCompat.PASSIVE_INTERVAL) {
            long elapsedRealtime = SystemClock.elapsedRealtime();
            sb.append(" expireIn=");
            sb.append(j - elapsedRealtime);
            sb.append("ms");
        }
        if (this.e != Integer.MAX_VALUE) {
            sb.append(" num=");
            sb.append(this.e);
        }
        sb.append(']');
        return sb.toString();
    }

    /* JADX INFO: Access modifiers changed from: package-private */
    public bja(boolean z, long j, float f, long j2, int i) {
        this.a = z;
        this.b = j;
        this.c = f;
        this.d = j2;
        this.e = i;
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a = abc.a(parcel, 20293);
        abc.a(parcel, 1, this.a);
        abc.a(parcel, 2, this.b);
        abc.a(parcel, 3, this.c);
        abc.a(parcel, 4, this.d);
        abc.a(parcel, 5, this.e);
        abc.b(parcel, a);
    }
}
