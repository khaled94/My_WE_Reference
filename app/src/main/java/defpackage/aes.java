package defpackage;

import android.os.Parcel;
import android.os.Parcelable;
import com.google.android.gms.common.internal.safeparcel.SafeParcelReader;

/* renamed from: aes  reason: default package */
/* loaded from: classes.dex */
public final class aes implements Parcelable.Creator<uw> {
    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ uw createFromParcel(Parcel parcel) {
        int a = SafeParcelReader.a(parcel);
        String str = null;
        int i = 0;
        long j = -1;
        while (parcel.dataPosition() < a) {
            int readInt = parcel.readInt();
            char c = (char) readInt;
            if (c == 1) {
                str = SafeParcelReader.l(parcel, readInt);
            } else if (c == 2) {
                i = SafeParcelReader.d(parcel, readInt);
            } else if (c == 3) {
                j = SafeParcelReader.f(parcel, readInt);
            } else {
                SafeParcelReader.p(parcel, readInt);
            }
        }
        SafeParcelReader.o(parcel, a);
        return new uw(str, i, j);
    }

    @Override // android.os.Parcelable.Creator
    public final /* synthetic */ uw[] newArray(int i) {
        return new uw[i];
    }
}
