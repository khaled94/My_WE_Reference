package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bhj  reason: default package */
/* loaded from: classes2.dex */
public final class bhj implements Parcelable.Creator<bhk> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bhk[] newArray(int i) {
        return new bhk[i];
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bhk createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        String str2 = null;
        String str3 = null;
        String str4 = null;
        int i = 0;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 2) {
                str2 = SafeParcelReader.l(parcel, readInt);
            } else if (c == 3) {
                str3 = SafeParcelReader.l(parcel, readInt);
            } else if (c == 4) {
                str4 = SafeParcelReader.l(parcel, readInt);
            } else if (c == 6) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 7) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bhk(str, str2, str3, str4, i, i2);
    }
}
