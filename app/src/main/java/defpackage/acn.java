package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: acn  reason: default package */
/* loaded from: classes.dex */
public final class acn implements Parcelable.Creator<aav> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aav createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        int i = 0;
        boolean z = false;
        boolean z2 = false;
        int i2 = 0;
        int i3 = 0;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 2) {
                z = SafeParcelReader.q(parcel, readInt);
            } else if (c == 3) {
                z2 = SafeParcelReader.q(parcel, readInt);
            } else if (c == 4) {
                i2 = SafeParcelReader.d(parcel, readInt);
            } else if (c == 5) {
                i3 = SafeParcelReader.d(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new aav(i, z, z2, i2, i3);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ aav[] newArray(int i) {
        return new aav[i];
    }
}
