package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: bks  reason: default package */
/* loaded from: classes2.dex */
public final class bks implements Parcelable.Creator<LatLng> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLng[] newArray(int i) {
        return new LatLng[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LatLng createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        double d = 0.0d;
        double d2 = 0.0d;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 2) {
                d = SafeParcelReader.b(parcel, readInt);
            } else if (c == 3) {
                d2 = SafeParcelReader.b(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new LatLng(d, d2);
    }
}
