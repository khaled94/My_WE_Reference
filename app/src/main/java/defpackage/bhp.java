package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;
import java.util.ArrayList;

/* renamed from: bhp  reason: default package */
/* loaded from: classes2.dex */
public final class bhp implements Parcelable.Creator<bhf> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bhf[] newArray(int i) {
        return new bhf[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bhf createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        ArrayList arrayList = null;
        int i = 0;
        int i2 = 0;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        int i6 = 0;
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
                    i4 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 5:
                    i5 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 6:
                    i6 = SafeParcelReader.d(parcel, readInt);
                    break;
                case 7:
                    arrayList = SafeParcelReader.b(parcel, readInt, bhg.CREATOR);
                    break;
                default:
                    SafeParcelReader.p(parcel, readInt);
                    break;
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bhf(i, i2, i3, i4, i5, i6, arrayList);
    }
}
