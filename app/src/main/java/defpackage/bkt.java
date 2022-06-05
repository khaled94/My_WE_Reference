package defpackage;

import android.os.IBinder;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.maps.model.LatLng;

/* renamed from: bkt  reason: default package */
/* loaded from: classes2.dex */
public final class bkt implements Parcelable.Creator<bkp> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bkp[] newArray(int i) {
        return new bkp[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bkp createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        LatLng latLng = null;
        String str = null;
        String str2 = null;
        IBinder iBinder = null;
        float f = 0.0f;
        float f2 = 0.0f;
        boolean z = false;
        boolean z2 = false;
        boolean z3 = false;
        float f3 = 0.0f;
        float f4 = 0.5f;
        float f5 = 0.0f;
        float f6 = 1.0f;
        float f7 = 0.0f;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 2:
                    latLng = (LatLng) SafeParcelReader.a(parcel, readInt, LatLng.CREATOR);
                    break;
                case 3:
                    str = SafeParcelReader.l(parcel, readInt);
                    break;
                case 4:
                    str2 = SafeParcelReader.l(parcel, readInt);
                    break;
                case 5:
                    iBinder = SafeParcelReader.h(parcel, readInt);
                    break;
                case 6:
                    f = SafeParcelReader.c(parcel, readInt);
                    break;
                case 7:
                    f2 = SafeParcelReader.c(parcel, readInt);
                    break;
                case '\b':
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\t':
                    z2 = SafeParcelReader.q(parcel, readInt);
                    break;
                case '\n':
                    z3 = SafeParcelReader.q(parcel, readInt);
                    break;
                case 11:
                    f3 = SafeParcelReader.c(parcel, readInt);
                    break;
                case '\f':
                    f4 = SafeParcelReader.c(parcel, readInt);
                    break;
                case '\r':
                    f5 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 14:
                    f6 = SafeParcelReader.c(parcel, readInt);
                    break;
                case 15:
                    f7 = SafeParcelReader.c(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bkp(latLng, str, str2, iBinder, f, f2, z, z2, z3, f3, f4, f5, f6, f7);
    }
}
