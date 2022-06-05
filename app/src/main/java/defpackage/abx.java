package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: abx  reason: default package */
/* loaded from: classes.dex */
public final class abx implements Parcelable.Creator<aaq> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aaq createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        long j = 0;
        long j2 = 0;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = -1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            switch ((char) readInt) {
                case 1:
                    i = SafeParcelReader.d(parcel, readInt);
                    break;
                case 2:
                    i2 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 3:
                    i3 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 4:
                    j = SafeParcelReader.f(parcel, readInt);
                    break;
                case 5:
                    j2 = SafeParcelReader.f(parcel, readInt);
                    break;
                case 6:
                    str = SafeParcelReader.l(parcel, readInt);
                    break;
                case 7:
                    str2 = SafeParcelReader.l(parcel, readInt);
                    break;
                case '\b':
                    i4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case '\t':
                    i5 = SafeParcelReader.d(parcel, readInt);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new aaq(i, i2, i3, j, j2, str, str2, i4, i5);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aaq[] newArray(int i) {
        return new aaq[i];
    }
}
