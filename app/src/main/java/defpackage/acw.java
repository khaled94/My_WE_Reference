package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: acw  reason: default package */
/* loaded from: classes.dex */
public final class acw implements Parcelable.Creator<aag> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aag createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        aav aavVar = null;
        int[] iArr = null;
        int[] iArr2 = null;
        boolean z = false;
        boolean z2 = false;
        int i = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    aavVar = (aav) SafeParcelReader.a(parcel, readInt, aav.CREATOR);
                    break;
                case 2:
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case 3:
                    z2 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 4:
                    iArr = SafeParcelReader.r(parcel, readInt);
                    break;
                case 5:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    iArr2 = SafeParcelReader.r(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new aag(aavVar, z, z2, iArr, i, iArr2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aag[] newArray(int i) {
        return new aag[i];
    }
}
