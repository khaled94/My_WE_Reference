package defpackage;

import android.content.Intent;
import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: bvq  reason: default package */
/* loaded from: classes2.dex */
public final class bvq implements Parcelable.Creator<bvp> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvp createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        Intent intent = null;
        int i2 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (c == 3) {
                intent = (Intent) SafeParcelReader.a(parcel, readInt, Intent.CREATOR);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new bvp(i, i2, intent);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ bvp[] newArray(int i) {
        return new bvp[i];
    }
}
