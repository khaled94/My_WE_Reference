package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.places.internal.PlaceEntity;

/* renamed from: bhb  reason: default package */
/* loaded from: classes2.dex */
public final class bhb implements Parcelable.Creator<bhc> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bhc[] newArray(int i) {
        return new bhc[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bhc createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        PlaceEntity placeEntity = null;
        float f = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                placeEntity = (PlaceEntity) SafeParcelReader.a(parcel, readInt, PlaceEntity.CREATOR);
            } else if (c == 2) {
                f = SafeParcelReader.c(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bhc(placeEntity, f);
    }
}
