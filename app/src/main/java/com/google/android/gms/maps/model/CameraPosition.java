package com.google.android.gms.maps.model;

import android.os.Parcel;
import android.os.Parcelable;
import androidx.constraintlayout.core.motion.utils.TypedValues;
import com.google.android.gms.common.internal.ReflectedParcelable;
import java.util.Arrays;

/* loaded from: classes.dex */
public final class CameraPosition extends abb implements ReflectedParcelable {
    public static final Parcelable.Creator<CameraPosition> CREATOR = new bkq();
    public final LatLng a;
    public final float b;
    public final float c;
    public final float d;

    /* loaded from: classes.dex */
    public static final class a {
        public LatLng a;
        public float b;
        public float c;
        public float d;
    }

    public CameraPosition(LatLng latLng, float f, float f2, float f3) {
        aat.a(latLng, "null camera target");
        aat.a(0.0f <= f2 && f2 <= 90.0f, "Tilt needs to be between 0 and 90 inclusive: %s", Float.valueOf(f2));
        this.a = latLng;
        this.b = f;
        this.c = f2 + 0.0f;
        this.d = (((double) f3) <= 0.0d ? (f3 % 360.0f) + 360.0f : f3) % 360.0f;
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.a, Float.valueOf(this.b), Float.valueOf(this.c), Float.valueOf(this.d)});
    }

    public static a a() {
        return new a();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof CameraPosition)) {
            return false;
        }
        CameraPosition cameraPosition = (CameraPosition) obj;
        return this.a.equals(cameraPosition.a) && Float.floatToIntBits(this.b) == Float.floatToIntBits(cameraPosition.b) && Float.floatToIntBits(this.c) == Float.floatToIntBits(cameraPosition.c) && Float.floatToIntBits(this.d) == Float.floatToIntBits(cameraPosition.d);
    }

    public final String toString() {
        return aar.a(this).a(TypedValues.Attributes.S_TARGET, this.a).a("zoom", Float.valueOf(this.b)).a("tilt", Float.valueOf(this.c)).a("bearing", Float.valueOf(this.d)).toString();
    }

    @Override // android.os.Parcelable
    public final void writeToParcel(Parcel parcel, int i) {
        int a2 = abc.a(parcel, 20293);
        abc.a(parcel, 2, this.a, i);
        abc.a(parcel, 3, this.b);
        abc.a(parcel, 4, this.c);
        abc.a(parcel, 5, this.d);
        abc.b(parcel, a2);
    }
}
