package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationAvailability;

/* renamed from: biu  reason: default package */
/* loaded from: classes2.dex */
public final class biu implements Parcelable.Creator<LocationAvailability> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationAvailability createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        long j = 0;
        biy[] biyVarArr = null;
        int i = 1000;
        int i2 = 1;
        int i3 = 1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                i3 = SafeParcelReader.d(parcel, readInt);
            } else if (c == 3) {
                j = SafeParcelReader.f(parcel, readInt);
            } else if (c == 4) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 5) {
                biyVarArr = (biy[]) SafeParcelReader.c(parcel, readInt, biy.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new LocationAvailability(i, i2, i3, j, biyVarArr);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationAvailability[] newArray(int i) {
        return new LocationAvailability[i];
    }
}
