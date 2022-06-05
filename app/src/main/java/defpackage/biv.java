package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import com.google.android.gms.location.LocationRequest;

/* renamed from: biv  reason: default package */
/* loaded from: classes2.dex */
public final class biv implements Parcelable.Creator<LocationRequest> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ LocationRequest createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        long j = 3600000;
        long j2 = 600000;
        long j3 = Long.MAX_VALUE;
        long j4 = 0;
        int i = 102;
        boolean z = false;
        int i2 = Integer.MAX_VALUE;
        float f = 0.0f;
        boolean z2 = false;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 2:
                    j = SafeParcelReader.f(parcel, readInt);
                    break;
                case 3:
                    j2 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 4:
                    z = SafeParcelReader.q(parcel, readInt);
                    break;
                case 5:
                    j3 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 6:
                    i2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    f = SafeParcelReader.c(parcel, readInt);
                    break;
                case '\b':
                    j4 = SafeParcelReader.f(parcel, readInt);
                    break;
                case '\t':
                    z2 = SafeParcelReader.q(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new LocationRequest(i, j, j2, z, j3, i2, f, j4, z2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ LocationRequest[] newArray(int i) {
        return new LocationRequest[i];
    }
}
