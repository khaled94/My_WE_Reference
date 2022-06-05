package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: bkq  reason: default package */
/* loaded from: classes2.dex */
public final class bkq implements Parcelable.Creator<CameraPosition> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CameraPosition[] newArray(int i) {
        return new CameraPosition[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ CameraPosition createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        float f = 0.0f;
        LatLng latLng = null;
        float f2 = 0.0f;
        float f3 = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                latLng = (LatLng) SafeParcelReader.a(parcel, readInt, LatLng.CREATOR);
            } else if (c == 3) {
                f = SafeParcelReader.c(parcel, readInt);
            } else if (c == 4) {
                f2 = SafeParcelReader.c(parcel, readInt);
            } else if (c == 5) {
                f3 = SafeParcelReader.c(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new CameraPosition(latLng, f, f2, f3);
    }
}
