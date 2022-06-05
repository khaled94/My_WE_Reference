package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.GoogleMapOptions;
import com.google.android.gms.maps.model.CameraPosition;
import com.google.android.gms.maps.model.LatLngBounds;

/* renamed from: bku  reason: default package */
/* loaded from: classes2.dex */
public final class bku implements Parcelable.Creator<GoogleMapOptions> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions[] newArray(int i) {
        return new GoogleMapOptions[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ GoogleMapOptions createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        CameraPosition cameraPosition = null;
        Float f = null;
        Float f2 = null;
        LatLngBounds latLngBounds = null;
        byte b = -1;
        byte b2 = -1;
        int i = 0;
        byte b3 = -1;
        byte b4 = -1;
        byte b5 = -1;
        byte b6 = -1;
        byte b7 = -1;
        byte b8 = -1;
        byte b9 = -1;
        byte b10 = -1;
        byte b11 = -1;
        byte b12 = -1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    b = SafeParcelReader.a(parcel, readInt);
                    break;
                case 3:
                    b2 = SafeParcelReader.a(parcel, readInt);
                    break;
                case 4:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 5:
                    cameraPosition = (CameraPosition) SafeParcelReader.a(parcel, readInt, CameraPosition.CREATOR);
                    break;
                case 6:
                    b3 = SafeParcelReader.a(parcel, readInt);
                    break;
                case 7:
                    b4 = SafeParcelReader.a(parcel, readInt);
                    break;
                case '\b':
                    b5 = SafeParcelReader.a(parcel, readInt);
                    break;
                case '\t':
                    b6 = SafeParcelReader.a(parcel, readInt);
                    break;
                case '\n':
                    b7 = SafeParcelReader.a(parcel, readInt);
                    break;
                case 11:
                    b8 = SafeParcelReader.a(parcel, readInt);
                    break;
                case '\f':
                    b9 = SafeParcelReader.a(parcel, readInt);
                    break;
                case '\r':
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
                case 14:
                    b10 = SafeParcelReader.a(parcel, readInt);
                    break;
                case 15:
                    b11 = SafeParcelReader.a(parcel, readInt);
                    break;
                case 16:
                    f = SafeParcelReader.j(parcel, readInt);
                    break;
                case 17:
                    f2 = SafeParcelReader.j(parcel, readInt);
                    break;
                case 18:
                    latLngBounds = (LatLngBounds) SafeParcelReader.a(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 19:
                    b12 = SafeParcelReader.a(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new GoogleMapOptions(b, b2, i, cameraPosition, b3, b4, b5, b6, b7, b8, b9, b10, b11, f, f2, latLngBounds, b12);
    }
}
