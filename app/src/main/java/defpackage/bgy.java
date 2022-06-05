package defpackage;

import android.net.Uri;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.places.internal.PlaceEntity;
import com.google.android.gms.maps.model.LatLng;
import com.google.android.gms.maps.model.LatLngBounds;
import java.util.ArrayList;

/* renamed from: bgy  reason: default package */
/* loaded from: classes2.dex */
public final class bgy implements Parcelable.Creator<PlaceEntity> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlaceEntity[] newArray(int i) {
        return new PlaceEntity[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ PlaceEntity createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        ArrayList<Integer> arrayList = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        ArrayList<String> arrayList2 = null;
        LatLng latLng = null;
        LatLngBounds latLngBounds = null;
        String str5 = null;
        Uri uri = null;
        bhd bhdVar = null;
        bha bhaVar = null;
        String str6 = null;
        float f = 0.0f;
        boolean z = false;
        float f2 = 0.0f;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    str = SafeParcelReader.l(parcel, readInt);
                    break;
                case 2:
                case 3:
                case '\f':
                case '\r':
                case 16:
                case 18:
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
                case 4:
                    latLng = (LatLng) SafeParcelReader.a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 5:
                    f = SafeParcelReader.c(parcel, readInt);
                    break;
                case 6:
                    latLngBounds = (LatLngBounds) SafeParcelReader.a(parcel, readInt, LatLngBounds.CREATOR);
                    break;
                case 7:
                    str5 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    uri = (Uri) SafeParcelReader.a(parcel, readInt, Uri.CREATOR);
                    break;
                case '\t':
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\n':
                    f2 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 11:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 14:
                    str3 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 15:
                    str4 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 17:
                    arrayList2 = SafeParcelReader.n(parcel, readInt);
                    break;
                case 19:
                    str2 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 20:
                    arrayList = SafeParcelReader.m(parcel, readInt);
                    break;
                case 21:
                    bhdVar = (bhd) SafeParcelReader.a(parcel, readInt, bhd.CREATOR);
                    break;
                case 22:
                    bhaVar = (bha) SafeParcelReader.a(parcel, readInt, bha.CREATOR);
                    break;
                case 23:
                    str6 = SafeParcelReader.l(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new PlaceEntity(str, arrayList, str2, str3, str4, arrayList2, latLng, f, latLngBounds, str5, uri, z, f2, i, bhdVar, bhaVar, str6);
    }
}
