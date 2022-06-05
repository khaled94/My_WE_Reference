package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: biz  reason: default package */
/* loaded from: classes2.dex */
public final class biz implements Parcelable.Creator<biy> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ biy createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        long j = -1;
        long j2 = -1;
        int i = 1;
        int i2 = 1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (c == 3) {
                j = SafeParcelReader.f(parcel, readInt);
            } else if (c == 4) {
                j2 = SafeParcelReader.f(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new biy(i, i2, j, j2);
    }

    @Override // android.os.Parcelable.Creator
    public final /* bridge */ /* synthetic */ biy[] newArray(int i) {
        return new biy[i];
    }
}
